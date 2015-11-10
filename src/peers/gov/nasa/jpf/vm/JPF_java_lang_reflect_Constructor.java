//
// Copyright (C) 2007 United States Government as represented by the
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

import java.lang.reflect.Modifier;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.MethodInfoRegistry;
import gov.nasa.jpf.util.RunListener;
import gov.nasa.jpf.util.RunRegistry;

/**
 * native peer for rudimentary constructor reflection.
 * 
 * Unfortunately, this is quite redundant to the Method peer, but Constructor
 * is not a Method subclass, and hence we can't rely on it's initialization
 */
public class JPF_java_lang_reflect_Constructor extends NativePeer {
  
  static MethodInfoRegistry registry;
  
  public static boolean init (Config conf) {
    // this is an example of how to handle cross-initialization between
    // native peers - this might also get explicitly called by the java.lang.Class
    // peer, since it creates Constructor objects. Here we have to make sure
    // we only reset between JPF runs
    
    if (registry == null){
      registry = new MethodInfoRegistry();
      
      RunRegistry.getDefaultRegistry().addListener( new RunListener() {
        public void reset (RunRegistry reg){
          registry = null;
        }
      });
    }
    return true;
  }

  static int createConstructorObject (MJIEnv env, ClassInfo ciCtor, MethodInfo mi, FeatureExpr ctx){
    // note - it is the callers responsibility to ensure Constructor is properly initialized    
    
    int regIdx = registry.registerMethodInfo(mi);
    int eidx = env.newObject(ctx, ciCtor);
    ElementInfo ei = env.getModifiableElementInfo(eidx);
    
    ei.setIntField(ctx, "regIdx", One.valueOf(regIdx));
    return eidx;
  }

  static MethodInfo getMethodInfo (FeatureExpr ctx, MJIEnv env, int objRef){
    return registry.getMethodInfo(ctx,env, objRef, "regIdx");
  }
  
  @MJI
  public int getName____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx) {
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    
    int nameRef = env.getReferenceField( ctx, objRef, "name").getValue();
    if (nameRef == MJIEnv.NULL) {
      nameRef = env.newString(ctx, mi.getName());
      env.setReferenceField(ctx, objRef, "name", nameRef);
    }
   
    return nameRef;
  }
  
  // <2do> .. and some more delegations to JPF_java_lang_Method

  @MJI
  public int newInstance___3Ljava_lang_Object_2__Ljava_lang_Object_2 (MJIEnv env, int mthRef, int argsRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    DirectCallStackFrame frame = ti.getReturnedDirectCall();
    MethodInfo miCallee = getMethodInfo(ctx,env, mthRef);

    
	if (frame == null) { // first time
      ClassInfo ci = miCallee.getClassInfo();

       if (ci.isAbstract()){
        env.throwException(ctx, "java.lang.InstantiationException");
        return MJIEnv.NULL;
      }

      int objRef = env.newObjectOfUncheckedClass( ctx, ci);
      frame = miCallee.createDirectCallStackFrame( ctx, ti, 1);
      frame.setReflection();
      
      frame.setLocalReferenceVariable(ctx, 0, objRef);  // (1) store the objRef for retrieval during re-exec
      
      int argOffset = frame.setReferenceArgument(ctx, 0, objRef, null);
      if (!JPF_java_lang_reflect_Method.pushUnboxedArguments( env, miCallee, frame, argOffset, argsRef, ctx)) {
        // we've got a IllegalArgumentException
        return MJIEnv.NULL;
      }
      ti.pushFrame(frame);
       
      ci.pushRequiredClinits(ctx, ti);
      
      env.repeatInvocation();
      return MJIEnv.NULL;
      
    } else { // reflection call returned
      int objRef = frame.getLocalVariable(ctx, 0).getValue(); // that's the object ref we stored in (1)
      return objRef;
    }
  }
    
  @MJI
  public int getParameterTypes_____3Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    // kind of dangerous, but we don't refer to any fields and the underlying JPF construct
    // (MethodInfo) is the same, so we just delegate to avoid copying non-trivial code
    return JPF_java_lang_reflect_Method.getParameterTypes (env, getMethodInfo(ctx,env, objRef), ctx);
  }

  @MJI
  public int getAnnotations_____3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    // <2do> check if ctor annotations are inherited, which is a bit off
    return JPF_java_lang_reflect_Method.getAnnotations( env, getMethodInfo(ctx,env, objRef), ctx);
  }
  
  @MJI
  public int getDeclaredAnnotations_____3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    return JPF_java_lang_reflect_Method.getDeclaredAnnotations( env, getMethodInfo(ctx,env, objRef), ctx);
  }
  
  @MJI
  public int getAnnotation__Ljava_lang_Class_2__Ljava_lang_annotation_Annotation_2 (MJIEnv env, int objRef, int annotationClsRef, FeatureExpr ctx) {
    return JPF_java_lang_reflect_Method.getAnnotation( env, getMethodInfo(ctx,env, objRef), annotationClsRef, ctx);
  }
  
  @MJI
  public int getParameterAnnotations_____3_3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    return JPF_java_lang_reflect_Method.getParameterAnnotations( env, getMethodInfo(ctx,env, objRef), ctx);
  }

  @MJI
  public int getModifiers____I (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    return mi.getModifiers();
  }

  @MJI
  public int getDeclaringClass____Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);    
    ClassInfo ci = mi.getClassInfo();
    // can't get a Constructor object w/o having initialized it's declaring class first
    return ci.getClassObjectRef();
  }
  
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    StringBuilder sb = new StringBuilder();
    
    MethodInfo mi = getMethodInfo(ctx, env, objRef);

    sb.append(Modifier.toString(mi.getModifiers()));
    sb.append(' ');

    sb.append(mi.getClassInfo().getName());
    sb.append('(');
    
    String[] at = mi.getArgumentTypeNames();
    for (int i=0; i<at.length; i++){
      if (i>0) sb.append(',');
      sb.append(at[i]);
    }
    
    sb.append(')');
    
    int sref = env.newString(ctx, sb.toString());
    return sref;
  }

  @MJI
  public boolean equals__Ljava_lang_Object_2__Z (MJIEnv env, int objRef, int mthRef, FeatureExpr ctx){
    ElementInfo ei = env.getElementInfo(mthRef);
    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo(JPF_java_lang_Class.CONSTRUCTOR_CLASSNAME);

    if (ei.getClassInfo() == ci){
      MethodInfo mi1 = getMethodInfo(ctx, env, objRef);
      MethodInfo mi2 = getMethodInfo(ctx, env, mthRef);
      if (mi1.getClassInfo() == mi2.getClassInfo()){
        if (mi1.getName().equals(mi2.getName())){
          if (mi1.getReturnType().equals(mi2.getReturnType())){
            byte[] params1 = mi1.getArgumentTypes();
            byte[] params2 = mi2.getArgumentTypes();
            if (params1.length == params2.length){
              for (int i = 0; i < params1.length; i++){
                if (params1[i] != params2[i])
                  return false;
              }
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @MJI
  public int hashCode____I (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo ctor = getMethodInfo(ctx, env, objRef);
    return ctor.getClassName().hashCode();
  }
}
