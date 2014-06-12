//
// Copyright (C) 2012 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.vm;


import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFConfigException;
import gov.nasa.jpf.util.Misc;
import gov.nasa.jpf.util.Predicate;
import gov.nasa.jpf.vm.choice.BreakGenerator;
import gov.nasa.jpf.vm.choice.MultiProcessThreadChoice;

import java.util.ArrayList;

/**
 * A VM implementation that simulates running multiple applications within the same
 * JPF process (centralized model checking of distributed applications).
 * This is achieved by executing each application in a separate thread group,
 * using separate SystemClassLoader instances to ensure proper separation of types / static fields.
 * 
 * 
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * To use this jpf.properties includes,
 *              vm.class = gov.nasa.jpf.vm.MultiProcessVM 
 */
public class MultiProcessVM extends VM {

  static final int MAX_APP = 32;

  ApplicationContext[] appCtxs;
  
  MultiProcessPredicate runnablePredicate;
  MultiProcessPredicate appTimedoutRunnablePredicate;
  MultiProcessPredicate appDaemonRunnablePredicate;
  MultiProcessPredicate appPredicate;
  Predicate<ThreadInfo> systemRunnablePredicate;
  
  public MultiProcessVM (JPF jpf, Config conf) {
    super(jpf, conf);
    
    appCtxs = createApplicationContexts();
    
    runnablePredicate = new MultiProcessPredicate() {
      public boolean isTrue (ThreadInfo t){
        return (t.isRunnable() && this.appCtx == t.appCtx);
      }
    };
    
    appTimedoutRunnablePredicate = new MultiProcessPredicate() {
      public boolean isTrue (ThreadInfo t){
        return (this.appCtx == t.appCtx && t.isTimeoutRunnable());
      }
    }; 
    
    appDaemonRunnablePredicate = new MultiProcessPredicate() {
      public boolean isTrue (ThreadInfo t){
        return (this.appCtx == t.appCtx && t.isRunnable() && t.isDaemon());
      }
    };
    
    appPredicate = new MultiProcessPredicate() {
      public boolean isTrue (ThreadInfo t){
        return (this.appCtx == t.appCtx);
      }
    };
    
    systemRunnablePredicate = new Predicate<ThreadInfo> () {
      public boolean isTrue (ThreadInfo t){
        return (t.isSystemThread() && t.isRunnable());
      }
    };
  }

  /**
   * <2do> this should also handle command line specs such as "jpf ... tgt1 tgt1_arg ... -- tgt2 tgt2_arg ... 
   */
  ApplicationContext[] createApplicationContexts(){
    String[] targets;

    int replicate = config.getInt("target.replicate", 0);
    if(replicate>0) {
      String target = config.getProperty("target");
      targets = new String[replicate];
      for(int i=0; i<replicate; i++) {
        targets[i] = target;
      }
    } else {
      targets = config.getStringEnumeration("target", MAX_APP);
    }

    if (targets == null){
      throw new JPFConfigException("no applications specified, check 'target.N' settings");
    }
    
    ArrayList<ApplicationContext> list = new ArrayList<ApplicationContext>(targets.length);
    for (int i=0; i<targets.length; i++){
      if (targets[i] != null){ // there might be holes in the array
        String clsName = targets[i];
        if (!isValidClassName(clsName)) {
          throw new JPFConfigException("main class not a valid class name: " + clsName);
        }
        
        String argsKey;
        String entryKey;
        String hostKey;
        if(replicate>0) {
          argsKey = "target.args";
          entryKey = "target.entry";
          hostKey = "target.host";
        } else {
          argsKey = "target.args." + i;
          entryKey = "target.entry." + i;
          hostKey = "target.host." + i;
        }
        
        String[] args = config.getCompactStringArray(argsKey);
        if (args == null){
          args = EMPTY_ARGS;
        }
        
        String mainEntry = config.getString(entryKey, "main([Ljava/lang/String;)V");
        
        String host = config.getString(hostKey, "localhost");
        
        SystemClassLoaderInfo sysCli = createSystemClassLoaderInfo(list.size());
    
        ApplicationContext appCtx = new ApplicationContext( i, clsName, mainEntry, args, host, sysCli);
        list.add( appCtx);
      }
    }
    
    return list.toArray(new ApplicationContext[list.size()]);
  }

  @Override
  public boolean initialize(){
    try {
      ThreadInfo tiFirst = null;
      
      for (int i=0; i<appCtxs.length; i++){
        ThreadInfo tiMain = initializeMainThread(appCtxs[i], i);
        initializeFinalizerThread(appCtxs[i], appCtxs.length+i);
        
        if (tiMain == null) {
          return false; // bail out
        }
        if (tiFirst == null){
          tiFirst = tiMain;
        }
      }

      initSystemState(tiFirst);
      initialized = true;
      notifyVMInitialized();
      
      return true;
      
    } catch (JPFConfigException cfe){
      log.severe(cfe.getMessage());
      return false;
    } catch (ClassInfoException cie){
      log.severe(cie.getMessage());
      return false;
    }
    // all other exceptions are JPF errors that should cause stack traces
  }

  @Override
  public int getNumberOfApplications(){
    return appCtxs.length;
  }
  
  @Override
  protected ChoiceGenerator<?> getInitialCG () {
    ThreadInfo[] runnables = getThreadList().getAllMatching(vm.getTimedoutRunnablePredicate());
    return new MultiProcessThreadChoice("<root>", runnables, true);
  }
  
  @Override
  public ApplicationContext getApplicationContext(int objRef) {
    VM vm = VM.getVM();

    ClassInfo ci = vm.getElementInfo(objRef).getClassInfo();
    while(!ci.isObjectClassInfo()) {
      ci = ci.getSuperClass();
    }

    ClassLoaderInfo sysLoader = ci.getClassLoaderInfo();
    ApplicationContext[] appContext = vm.getApplicationContexts();
    
    for(int i=0; i<appContext.length; i++) {
      if(appContext[i].getSystemClassLoader() == sysLoader) {
        return appContext[i];
      }
    }
    return null;
  }
  
  @Override
  public ApplicationContext[] getApplicationContexts(){
    return appCtxs;
  }

  @Override
  public ApplicationContext getCurrentApplicationContext(){
    ThreadInfo ti = ThreadInfo.getCurrentThread();
    if (ti != null){
      return ti.getApplicationContext();
    } else {
      // return the last defined one
      return appCtxs[appCtxs.length-1];
    }
  }

  
  @Override
  public String getSUTName() {
    StringBuilder sb = new StringBuilder();
    
    for (int i=0; i<appCtxs.length; i++){
      if (i>0){
        sb.append("+");
      }
      sb.append(appCtxs[i].mainClassName);
    }
    
    return sb.toString();
  }

  @Override
  public String getSUTDescription(){
    StringBuilder sb = new StringBuilder();
    
    for (int i=0; i<appCtxs.length; i++){
      if (i>0){
        sb.append('+'); // "||" would be more fitting, but would screw up filenames
      }

      ApplicationContext appCtx = appCtxs[i];
      sb.append(appCtx.mainClassName);
      sb.append('.');
      sb.append(Misc.upToFirst(appCtx.mainEntry, '('));

      sb.append('(');
      String[] args = appCtx.args;
      for (int j = 0; j < args.length; j++) {
        if (j > 0) {
          sb.append(',');
        }
        sb.append('"');
        sb.append(args[j]);
        sb.append('"');
      }
      sb.append(')');
    }
    
    return sb.toString();
  }

  
  @Override
  public boolean isSingleProcess() {
    return false;
  }

  @Override
  public boolean isEndState () {
    boolean hasNonTerminatedDaemon = getThreadList().hasAnyMatching(getUserLiveNonDaemonPredicate());
    boolean hasRunnable = getThreadList().hasAnyMatching(getUserTimedoutRunnablePredicate());
    boolean isEndState = !(hasNonTerminatedDaemon && hasRunnable);
    
    if(processFinalizers) {
      if(isEndState) {
        int n = getThreadList().getMatchingCount(systemRunnablePredicate);
        if(n>0) {
          return false;
        }
      }
    }
    
    return isEndState;
  }

  @Override
  // Note - for now we just check for global deadlocks not the local ones which occur within a
  // scope of a single progress
  public boolean isDeadlocked () { 
    boolean hasNonDaemons = false;
    boolean hasBlockedThreads = false;

    if (ss.isBlockedInAtomicSection()) {
      return true; // blocked in atomic section
    }

    ThreadInfo[] threads = getThreadList().getThreads();
    int len = threads.length;

    for (int i=0; i<len; i++){
      ThreadInfo ti = threads[i];
      
      if (ti.isAlive()) {
        hasNonDaemons |= !ti.isDaemon();

        // shortcut - if there is at least one runnable, we are not deadlocked
        if (ti.isTimeoutRunnable()) { // willBeRunnable() ?
          return false;
        }

        // means it is not NEW or TERMINATED, i.e. live & blocked
        hasBlockedThreads = true;
      }
    }

    return (hasNonDaemons && hasBlockedThreads);
  }
  
  @Override
  public void terminateProcess (ThreadInfo ti) {
    SystemState ss = getSystemState();
    ThreadInfo[] appThreads = getThreadList().getAllMatching(getAppPredicate(ti));
    ThreadInfo finalizerTi = null;

    for (int i = 0; i < appThreads.length; i++) {
      ThreadInfo t = appThreads[i];
      
      // if finalizers have to be processed, FinalizerThread is not killed at this 
      // point. We need to keep it around in case fianlizable objects are GCed after 
      // System.exit() returns.
      if(processFinalizers && t.isSystemThread()) {
        finalizerTi = t;
      } else {
        // keep the stack frames around, so that we can inspect the snapshot
        t.setTerminated();
      }
    }
    
    ThreadList tl = getThreadList();
    
    ChoiceGenerator<ThreadInfo> cg;
    if (tl.hasAnyMatching(getAlivePredicate())) {
      ThreadInfo[] runnables = getThreadList().getAllMatching(getTimedoutRunnablePredicate());
      cg = new MultiProcessThreadChoice( "PROCESS_TERMINATE", runnables, true);
    } else {
      cg = new BreakGenerator("exit", ti, true);
    }
    
    ss.setMandatoryNextChoiceGenerator(cg, "exit without break CG");
    
    // if there is a finalizer thread, we have to run the last GC, to queue finalizable objects, if any
    if(finalizerTi != null) {
      assert finalizerTi.isAlive();
      activateGC();
    }
  }
  
  
  //---------- Predicates used to query threads from ThreadList ----------//
  
  abstract class MultiProcessPredicate implements Predicate<ThreadInfo> {
    ApplicationContext appCtx;

    public void setAppCtx (ApplicationContext appCtx) { 
      this.appCtx = appCtx; 
    }
  }
  
  @Override
  public Predicate<ThreadInfo> getRunnablePredicate() {
    runnablePredicate.setAppCtx(getCurrentApplicationContext());
    return runnablePredicate;
  }
  
  @Override
  public Predicate<ThreadInfo> getAppTimedoutRunnablePredicate() {
    appTimedoutRunnablePredicate.setAppCtx(getCurrentApplicationContext());
    return appTimedoutRunnablePredicate;
  }
  
  @Override
  public Predicate<ThreadInfo> getDaemonRunnablePredicate() {
    appDaemonRunnablePredicate.setAppCtx(getCurrentApplicationContext());
    return appDaemonRunnablePredicate;
  }
  
  /**
   * Returns a predicate used to obtain all the threads that belong to the same application as ti
   */
  Predicate<ThreadInfo> getAppPredicate (final ThreadInfo ti){
    appPredicate.setAppCtx(ti.getApplicationContext());
    return appPredicate;
  }
  
  // ---------- Methods for handling finalizers ---------- //

  @Override
  void updateFinalizerQueues () {
    for(ApplicationContext appCtx: appCtxs) {
      appCtx.getFinalizerThread().processNewFinalizables();
    }
  }
}
