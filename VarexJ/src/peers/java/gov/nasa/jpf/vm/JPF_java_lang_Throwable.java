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
package gov.nasa.jpf.vm;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.BiConsumer;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.annotation.MJI;


/**
 * MJI NativePeer class for java.lang.Throwable library abstraction
 */
public class JPF_java_lang_Throwable extends NativePeer {    
  /**
   * return array of StackTraceElement elements from the snapshot stored in the Throwable
   */
  @MJI
  public int createStackTrace_____3Ljava_lang_StackTraceElement_2 (MJIEnv env, int objref, FeatureExpr ctx) {
	  
    int aref = env.getReferenceField(ctx, objref, "snapshot").getValue();
    int[] snap = env.getIntArrayObject(ctx, aref);
    
    return env.getThreadInfo().createStackTraceElements(ctx, snap);
  }
  
  @MJI
  public int fillInStackTrace____Ljava_lang_Throwable_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    
	int[] snap = ti.getSnapshot(ctx, objref);
    
    int aref = env.newIntArray(ctx, snap);
    env.setReferenceField(ctx, objref, "snapshot", aref);
    
    return objref;
  }
    
  // native because we don't want to waste states
  @MJI
  public void printStackTrace____V (final MJIEnv env, Conditional<Integer> objRef, FeatureExpr ctx) {
	  objRef.mapf(ctx, new BiConsumer<FeatureExpr, Integer>() {

		@Override
		public void accept(FeatureExpr ctx, Integer objRef) {
			env.getThreadInfo().printStackTrace(ctx, objRef);
		}
		  
	  });
  }
  
  // a helper method to get a string representation of the stacktrace
  @MJI
  public int getStackTraceAsString____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    
    ti.printStackTrace(ctx, pw, objRef);
    String stackTrace = sw.toString();
    pw.close();
    
    return env.newString(ctx, stackTrace);
  }
  
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx){
//    ClassInfo ci = env.getClassInfo(objRef);
//    
//    int msgRef = env.getReferenceField(ctx, objRef, "detailMessage").getValue();
//    
//    String s = ci.getName();
//    if (msgRef != MJIEnv.NULL){
//      s += ": ";
//      Conditional<String> message = env.getStringObjectNew(ctx, msgRef);
//      if (message instanceof One) {
//    	  s += message.getValue();
//      } else {
//    	  s += message;
//      }
//    }
    
    return env.newString(FeatureExprFactory.True(), "nothing");
  }
}
