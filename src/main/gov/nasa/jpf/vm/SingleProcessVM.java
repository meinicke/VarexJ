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
import gov.nasa.jpf.vm.choice.ThreadChoiceFromSet;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * Includes the VM initialization for executing single Java process
 * 
 * To use this jpf.properties includes,
 *              vm.class = gov.nasa.jpf.vm.SingleProcessVM
 */
public class SingleProcessVM extends VM {

  protected ApplicationContext appCtx; // we only have one
  
  protected Predicate<ThreadInfo> runnablePredicate;
  protected Predicate<ThreadInfo> daemonRunnable;
  
  protected SingleProcessVM (){}

  public SingleProcessVM (JPF jpf, Config conf) {
    super(jpf, conf);
    
    appCtx = createApplicationContext();
    
    // set predicates used to query from threadlist
    runnablePredicate = new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo ti){
        return (ti.isRunnable());
      }
    };
    
    daemonRunnable = new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo ti){
        return (ti.isDaemon() && ti.isRunnable());
      }
    };
  }
  
  protected ApplicationContext createApplicationContext (){
    String clsName;
    String[] args = null;
    
    String[] freeArgs = config.getFreeArgs();
    clsName = config.getProperty("target"); // explicit 'target' takes precedence
    
    if (clsName == null){
      if (freeArgs != null){ // if it is non-null, there is at least one entry
        // note that application property filenames have been removed by Config since they are part of its initialization
        clsName = freeArgs[0];
        
        if (freeArgs.length > 1){ // if there is no 'target' command line overrides 'target.args'
          args = Misc.arrayWithoutFirst(freeArgs, 1);
        } else {
          args = config.getStringArray("target.args");
        }
      }
    } else {
      // since there was a 'target', 'target.args' override command line
      args = config.getStringArray("target.args");
      if (args == null){
        if (freeArgs != null){
          args = freeArgs;
        }
      }
    }
    
    // sanity checks
    if (args == null){
      args = EMPTY_ARGS;
    }
    if (clsName == null){
      throw new JPFConfigException("no target class specified, terminating");
    }
    if (!isValidClassName(clsName)){
      throw new JPFConfigException("main class not a valid class name: " + clsName);      
    }
    
    // can be any static method that has a (String[]), (String) or () signature
    String mainEntry = config.getProperty("target.entry", "main([Ljava/lang/String;)V");

    String host = config.getString("target.host", "localhost");
    
    SystemClassLoaderInfo sysCli = createSystemClassLoaderInfo(0);
    
    return new ApplicationContext( 0, clsName, mainEntry, args, host, sysCli);
  }
  

  @Override
  public boolean initialize(FeatureExpr ctx){
    try {
      ThreadInfo tiMain = initializeMainThread(ctx, appCtx, 0);
      initializeFinalizerThread(ctx, appCtx, 1);

      if (tiMain == null) {
        return false; // bail out
      }

      initSystemState(tiMain);
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
  protected ChoiceGenerator<?> getInitialCG () {
    ThreadInfo[] runnables = getThreadList().getAllMatching(vm.getTimedoutRunnablePredicate());
    return new ThreadChoiceFromSet("<root>", runnables, true);
  }
  
  @Override
  public int getNumberOfApplications(){
    return 1;
  }
  
  @Override
  public String getSUTName() {
    return appCtx.mainClassName;
  }

  @Override
  public String getSUTDescription(){
    StringBuilder sb = new StringBuilder();
    sb.append(appCtx.mainClassName);
    sb.append('.');
    sb.append(Misc.upToFirst( appCtx.mainEntry, '('));
    
    sb.append('(');
    String[] args = appCtx.args;
    for (int i=0; i<args.length; i++){
      if (i>0){
        sb.append(',');
      }
      sb.append('"');
      sb.append(args[i]);
      sb.append('"');
    }
    sb.append(')');
    return sb.toString();
  }
  
  @Override
  public ApplicationContext getApplicationContext(int obj) {
    return appCtx;
  }

  @Override
  public ApplicationContext[] getApplicationContexts(){
    return new ApplicationContext[] { appCtx };
  }
  
  @Override
  public ApplicationContext getCurrentApplicationContext(){
    ThreadInfo ti = ThreadInfo.getCurrentThread();
    if (ti != null){
      return ti.getApplicationContext();
    } else {
      return appCtx;
    }
  }
  
  /**
   * The program is terminated if there are no alive threads, and there is no nonDaemon left.
   * 
   * NOTE - this is only approximated in real life. Daemon threads can still run for a few cycles
   * after the last non-daemon died, which opens an interesting source of errors we
   * actually might want to check for
   */
  @Override
  public boolean isEndState () {
    // note this uses 'alive', not 'runnable', hence isEndStateProperty won't
    // catch deadlocks - but that would be NoDeadlockProperty anyway
    
    boolean hasNonTerminatedDaemon = getThreadList().hasAnyMatching(getUserLiveNonDaemonPredicate());
    boolean hasRunnable = getThreadList().hasAnyMatching(getUserTimedoutRunnablePredicate());
    boolean isEndState = !(hasNonTerminatedDaemon && hasRunnable);
    
    if(processFinalizers) {
      if(isEndState) {
        if(getFinalizerThread().isRunnable()) {
          return false;
        }
      }
    }
    
    return isEndState;
  }

  @Override
  public boolean isDeadlocked () { 
    boolean hasNonDaemons = false;
    boolean hasBlockedThreads = false;

    if (ss.isBlockedInAtomicSection()) {
      return true; // blocked in atomic section
    }

    ThreadInfo[] threads = getThreadList().getThreads();

    for (int i = 0; i < threads.length; i++) {
      ThreadInfo ti = threads[i];
      
      if (ti.isAlive()){
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
    ThreadInfo[] liveThreads = getLiveThreads();
    ThreadInfo finalizerTi = null;

    for (int i = 0; i < liveThreads.length; i++) {
      if(!liveThreads[i].isSystemThread()) {
        // keep the stack frames around, so that we can inspect the snapshot
        liveThreads[i].setTerminated();
      } else {
        // FinalizerThread is not killed at this point. We need to keep it around in 
        // case fianlizable objects are GCed after System.exit() returns.
        finalizerTi = liveThreads[i];
      }
    }
    
    ss.setMandatoryNextChoiceGenerator( new BreakGenerator("exit", ti, true), "exit without break CG");
    
    // if there is a finalizer thread, we have to run the last GC, to queue finalizable objects, if any
    if(finalizerTi != null) {
      assert finalizerTi.isAlive();
      activateGC();
    }
  }
  
  
  //---------- Predicates used to query threads from ThreadList ---------- //
  
  @Override
  public Predicate<ThreadInfo> getRunnablePredicate() {
    return runnablePredicate;
  }
  
  @Override
  public Predicate<ThreadInfo> getAppTimedoutRunnablePredicate() {
    return getRunnablePredicate();
  }
  
  @Override
  public Predicate<ThreadInfo> getDaemonRunnablePredicate() {
    return daemonRunnable;
  }
  
  // ---------- Methods for handling finalizers ---------- //

  @Override
  void updateFinalizerQueues () {
    getFinalizerThread().processNewFinalizables();
  }
}
