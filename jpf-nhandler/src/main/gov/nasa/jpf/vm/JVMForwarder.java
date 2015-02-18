/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

package gov.nasa.jpf.vm;

import java.io.File;
import java.lang.reflect.Method;

import de.fosd.typechef.featureexpr.FeatureExpr;
import nhandler.conversion.ConverterBase;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.EXECUTENATIVE;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.MethodSpec;

/**
 * This listener makes JPF delegate or skip the execution of certain methods
 * to the JVM level according to what is specified in the properties file.
 * 
 * Right after a class is loaded, JVMForwarder goes through the methods of 
 * the class, and for the ones specified to be delegate or skipped, it replaces
 * their MethodInfo with the subclasses of NativeMethodInfo, and that makes the
 * executeNative() to behave differently.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class JVMForwarder extends PropertyListenerAdapter {

  private static String[] delegate_spec = null;

  private static String[] delegateNative_spec = null;

  private static String[] skip_spec = null;

  private static String[] filter_spec = null;

  private static boolean delegateUnhandledNatives = false;

  private static boolean skipNatives = false;

  private static boolean initialized = false;

  private void init (Config conf){
    if (!initialized){
      delegate_spec = conf.getStringArray("nhandler.spec.delegate");
      delegateNative_spec = conf.getStringArray("nhandler.spec.delegateNative");
      skip_spec = conf.getStringArray("nhandler.spec.skip");
      filter_spec = conf.getStringArray("nhandler.spec.filter");
      delegateUnhandledNatives = conf.getBoolean("nhandler.delegateUnhandledNative");
      skipNatives = conf.getBoolean("nhandler.skipNative");
      initialized = true;
    }
  }

  @Override
  public void classLoaded (VM vm, ClassInfo ci){
    init(vm.getConfig());

    processNatives(ci);
    processDelegated(ci);
    processNativeDelegated(ci);
    processSkipped(ci);
  }

  private void processNatives (ClassInfo ci){
    if (delegateUnhandledNatives){
      delegateUnhandledNatives(ci);
    } else if (skipNatives){
      skipNatives(ci);
    }
  }

  private void delegateUnhandledNatives (ClassInfo ci){
    MethodInfo[] mth = ci.getDeclaredMethodInfos();
    for (MethodInfo mi : mth){
      if (mi.isNative() && !isHandled(mi) && isAllowed(mi) && !isFiltered(mi)){
        delegateUnhandledNative(mi);
      }
    }
  }

  private void skipNatives (ClassInfo ci){
    MethodInfo[] mth = ci.getDeclaredMethodInfos();
    for (MethodInfo mi : mth){
      if (mi.isNative() && !isHandled(mi) && isAllowed(mi) && !isFiltered(mi)){
        skipUnhandledNative(mi);
      }
    }
  }

  private boolean isHandled(MethodInfo mi) {
    NativeMethodInfo nmi = (NativeMethodInfo) mi;
    NativePeer nativePeer = nmi.getNativePeer();

    // check if there is any native peer class associated to the class of this
    // method at all
    if(nativePeer == null) {
      return false;
    }

    Method[] mth = nativePeer.getPeerClass().getMethods();
    for(Method m: mth) {
      String jniName = nmi.getJNIName();
      if(m.getName().equals(jniName) || jniName.contains(m.getName())) {
        return true;
      }
    }

    return false;
  }

  // We do not allow user to delegate or skip the methods of certain classes that are
  // subjected to jpf-nhandler limitations.
  String[] builtinFiltered = {"java.lang.ClassLoader.*"};
  
  private boolean isAllowed(MethodInfo mi){
    for(String spec : builtinFiltered){
      MethodSpec ms = MethodSpec.createMethodSpec(spec);
      if (ms.matches(mi)){ 
        return false; 
      }
    }

    return true;
  }

  private boolean isFiltered (MethodInfo mi){
    if (filter_spec != null){
      for (String spec : filter_spec){
        MethodSpec ms = MethodSpec.createMethodSpec(spec);
        if (ms.matches(mi)){ 
          return true; 
        }
      }
    }

    return false;
  }

  private void processDelegated (ClassInfo ci){
    if (delegate_spec != null){
      MethodInfo[] mth = ci.getDeclaredMethodInfos();
      for (MethodInfo mi : mth){
        for (String spec : delegate_spec){
          MethodSpec ms = MethodSpec.createMethodSpec(spec);
          if (!isFiltered(mi) && ms.matches(mi)){
            delegateMethod(mi);
          }
        }
      }
    }
  }

  private void processNativeDelegated (ClassInfo ci){
    if (delegateNative_spec != null){
      MethodInfo[] mth = ci.getDeclaredMethodInfos();
      for (MethodInfo mi : mth){
        for (String spec : delegateNative_spec){
          MethodSpec ms = MethodSpec.createMethodSpec(spec);
          if (mi.isNative() && !isFiltered(mi) && ms.matches(mi)){
            delegateMethod(mi);
          }
        }
      }
    }
  }

  private void processSkipped (ClassInfo ci){
    if (skip_spec != null){
      MethodInfo[] mth = ci.getDeclaredMethodInfos();
      for (MethodInfo mi : mth){
        for (String spec : skip_spec){
          MethodSpec ms = MethodSpec.createMethodSpec(spec);
          if (ms.matches(mi)){
            skipMethod(mi);
          }
        }
      }
    }
  }

  private void delegateUnhandledNative (MethodInfo mi){
    NativeMethodInfo new_m = new DelegatedNativeMethodInfo(mi);
    new_m.replace(mi);
  }

  private void skipUnhandledNative (MethodInfo mi){
    NativeMethodInfo new_m = new SkippedNativeMethodInfo(mi);
    new_m.replace(mi);
  }

  private void delegateMethod (MethodInfo mi){
    NativeMethodInfo new_m = new DelegatedMethodInfo(mi);
    new_m.replace(mi);
  }

  private void skipMethod (MethodInfo mi){
    NativeMethodInfo new_m = new SkippedMethodInfo(mi);
    new_m.replace(mi);
  }

  /**
   * at the searchStarted event, if the option nhandler.reset is set to true,
   * all the peer classes created on the fly are removed. 
   */
  @Override
  public void searchStarted(Search search){
    Config config = search.getConfig();
    boolean reset = config.getBoolean("nhandler.clean");
    if(reset) {
      String path = config.getPath("jpf-nhandler") + "/onthefly";
      File onthefly = new File(path);
      String[] peers = onthefly.list();

      for(String name: peers) {
    	if((reset && name.startsWith("OTF_JPF_") && (name.endsWith(".class") || name.endsWith(".java")))) {
          File peer = new File(onthefly, name);
          peer.delete();
    	}
      }
    }

    // this creates a converter factory which is used to create type specific Converter objects
    ConverterBase.init();
  }

  public void executeInstruction (FeatureExpr ctx, VM vm, ThreadInfo currentThread, Instruction instructionToExecute) {
    if(instructionToExecute instanceof EXECUTENATIVE) {
      MethodInfo mi = ((EXECUTENATIVE)instructionToExecute).getMethodInfo();
      if(mi.isNative() && (mi instanceof HandledMethodInfo)) {
        // --- any method handled by nhandler is caught here ---
      }
    }
  }
}
