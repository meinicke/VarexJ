//
// Copyright (C) 2006 United States Government as represented by the
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

package gov.nasa.jpf.util.test;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.DirectCallStackFrame;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.ArrayList;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * native peer for our test class root
 */
public class JPF_gov_nasa_jpf_util_test_TestJPF extends NativePeer {

  ClassInfo testClass;
  MethodInfo testClassCtor;

  MethodInfo[] testMethods = null;
  int index = 0;
  int testObjRef = MJIEnv.NULL;

  boolean done;

  private static void pushDirectCallFrame(MJIEnv env, MethodInfo mi, int objRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();

    DirectCallStackFrame frame = mi.createDirectCallStackFrame(ctx, ti, 0);
    frame.setReferenceArgument( 0, objRef, null);
    ti.pushFrame(frame);
  }

  private boolean initializeTestMethods(MJIEnv env, String[] selectedTests, FeatureExpr ctx) {
    if (selectedTests != null && selectedTests.length > 0) {
      testMethods = new MethodInfo[selectedTests.length];
      int i = 0;
      for (String test : selectedTests) {
        MethodInfo mi = testClass.getMethod(test + "()V", false);
        if (mi != null && mi.isPublic() && !mi.isStatic()) {
          testMethods[i++] = mi;
        } else {
          env.throwException(ctx,
                  "java.lang.RuntimeException", "no such test method: public void " + test + "()");
          return false;
        }
      }
    } else { // collect all public void test..() methods
      ArrayList<MethodInfo> list = new ArrayList<MethodInfo>();
      for (MethodInfo mi : testClass) {
        if (mi.getName().startsWith("test") && mi.isPublic() && !mi.isStatic() &&
                mi.getSignature().equals("()V")) {
          list.add(mi);
        }
      }
      testMethods = list.toArray(new MethodInfo[list.size()]);
    }

    return true;
  }

  //--- our exported native methods

  public JPF_gov_nasa_jpf_util_test_TestJPF () {
    done = false;
    index = 0;
    testObjRef = MJIEnv.NULL;
    testMethods = null;
    testClass = null;
    testClassCtor = null;
  }

  @MJI
  public void $init____V (MJIEnv env, int objRef, FeatureExpr ctx){
    // nothing
  }

  @MJI
  public void runTestsOfThisClass___3Ljava_lang_String_2__V (MJIEnv env, int clsObjRef,
                                                                    int selectedTestsRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();

    if (!done) {
      if (testMethods == null) {
        StackFrame frame = env.getCallerStackFrame(); // the runTestsOfThisClass() caller

        testClass = frame.getClassInfo();
        testClassCtor = testClass.getMethod("<init>()V", true);

        String[] selectedTests = env.getStringArrayObject(ctx, selectedTestsRef);
        if (initializeTestMethods(env, selectedTests, ctx)) {
          env.repeatInvocation();
        }

      } else { // this is re-executed
        if (testObjRef == MJIEnv.NULL) { // create a new test object
          testObjRef = env.newObject(ctx, testClass);

          if (testClassCtor != null) {
            pushDirectCallFrame(env, testClassCtor, testObjRef, ctx);
            env.repeatInvocation();
          }

        } else { // enter the next test
          if (testMethods != null && (index < testMethods.length)) {
            MethodInfo miTest = testMethods[index++];
            pushDirectCallFrame(env, miTest, testObjRef,ctx);

            if (index < testMethods.length) {
              testObjRef = MJIEnv.NULL;
            } else {
              done = true;
            }

            env.repeatInvocation();
          }
        }
      }
    }
  }

  @MJI
  public int createAndRunJPF__Ljava_lang_StackTraceElement_2_3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef, int a1, int a2, FeatureExpr ctx){
    // don't get recursive
    return MJIEnv.NULL;
  }

  @MJI
  public int getProperty__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, Conditional<Integer> keyRef, FeatureExpr ctx){
    String key = env.getStringObject(ctx, keyRef.getValue());
    String val = env.getConfig().getString(key);
    
    if (val != null){
      return env.newString(FeatureExprFactory.True(), val);
    } else {
      return MJIEnv.NULL;
    }
  }
  
  /**
   * if any of our methods are executed, we know that we already run under JPF
   */
  @MJI
  public boolean isJPFRun____Z (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public boolean isJUnitRun____Z (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    return false;
  }

  @MJI
  public boolean isRunTestRun____Z (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    return false;
  }


  // we need to override these so that the actual test code gets executed
  // if we fail to intercept, the bytecode will actually start JPF
  @MJI
  public int noPropertyViolation___3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef, int jpfArgsRef, FeatureExpr ctx){
    return MJIEnv.NULL;
  }

  @MJI
  public boolean verifyNoPropertyViolation___3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, Conditional<Integer> jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public boolean verifyAssertionErrorDetails__Ljava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef,
                                  int detailsRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public boolean verifyAssertionError___3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public int unhandledException__Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef,
                                  int xClassNameRef, int detailsRef, int jpfArgsRef, FeatureExpr ctx){
    return MJIEnv.NULL;
  }

  @MJI
  public boolean verifyUnhandledException__Ljava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef,
		  Conditional<Integer> xClassNameRef, Conditional<Integer> jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public boolean verifyUnhandledExceptionDetails__Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef,
                                  int xClassNameRef, int detailsRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public int propertyViolation__Ljava_lang_Class_2_3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef,
                                  int propClsRef, int jpfArgsRef, FeatureExpr ctx){
    return MJIEnv.NULL;
  }

  @MJI
  public boolean verifyPropertyViolation__Lgov_nasa_jpf_util_TypeRef_2_3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef,
                                  int propClsRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public int jpfException__Ljava_lang_Class_2_3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef,
                                  int xClsRef, int jpfArgsRef, FeatureExpr ctx){
    return MJIEnv.NULL;
  }

  @MJI
  public boolean verifyJPFException__Lgov_nasa_jpf_util_TypeRef_2_3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef,
                                  int xClsRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }

  @MJI
  public int deadlock___3Ljava_lang_String_2__Lgov_nasa_jpf_JPF_2 (MJIEnv env, int clsObjRef, int jpfArgsRef, FeatureExpr ctx){
    return MJIEnv.NULL;
  }

  @MJI
  public boolean verifyDeadlock___3Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int jpfArgsRef, FeatureExpr ctx){
    return true;
  }


}
