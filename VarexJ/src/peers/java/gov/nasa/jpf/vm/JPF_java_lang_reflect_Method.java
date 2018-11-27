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

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.function.BiFunction;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.MethodInfoRegistry;
import gov.nasa.jpf.util.RunListener;
import gov.nasa.jpf.util.RunRegistry;

public class JPF_java_lang_reflect_Method extends NativePeer {

  static MethodInfoRegistry registry;

  // class init - this is called automatically from the NativePeer ctor
  public static boolean init (Config conf) {
    // this is an example of how to handle cross-initialization between
    // native peers - this might also get explicitly called by the java.lang.Class
    // peer, since it creates Method objects. Here we have to make sure
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

  static int createMethodObject (MJIEnv env, ClassInfo ciMth, MethodInfo mi, FeatureExpr ctx){
    // note - it is the callers responsibility to ensure Method is properly initialized    
    int regIdx = registry.registerMethodInfo(mi);
    
	int eidx = env.newObject( ctx, ciMth);
    ElementInfo ei = env.getModifiableElementInfo(eidx);
    
    ei.setIntField(ctx, "regIdx", new One<>(regIdx));
    ei.setBooleanField(ctx, "isAccessible", new One<>(mi.isPublic()));
    
    return eidx;
  }
  
  // this is NOT an MJI method, but it is used outside this package, so
  // we have to add 'final'
  public static final MethodInfo getMethodInfo (FeatureExpr ctx, MJIEnv env, int objRef){
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

  @MJI
  public int getModifiers____I (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    return mi.getModifiers();
  }
  
  static int getParameterTypes( MJIEnv env, MethodInfo mi, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    String[] argTypeNames = mi.getArgumentTypeNames();
    int[] ar = new int[argTypeNames.length];

    for (int i = 0; i < argTypeNames.length; i++) {
      ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(argTypeNames[i]);
      if (!ci.isRegistered()) {
        ci.registerClass(ctx, ti);
      }

      ar[i] = ci.getClassObjectRef();
    }

    int aRef = env.newObjectArray("Ljava/lang/Class;", argTypeNames.length);
    for (int i = 0; i < argTypeNames.length; i++) {
      env.setReferenceArrayElement(ctx, aRef, i, new One<>(ar[i]));
    }

    return aRef;
  }
  
  @MJI
  public int getParameterTypes_____3Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    return getParameterTypes(env, getMethodInfo(ctx, env, objRef), ctx);
  }
  
	@MJI
	public int getGenericParameterTypes_____3Ljava_lang_reflect_Type_2(MJIEnv env, int objRef, FeatureExpr ctx) {
		ThreadInfo ti = env.getThreadInfo();
		String[] argTypeNames = getMethodInfo(ctx, env, objRef).getArgumentTypeNames();
		int[] ar = new int[argTypeNames.length];

		for (int i = 0; i < argTypeNames.length; i++) {
			ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(argTypeNames[i]);
			if (!ci.isRegistered()) {
				ci.registerClass(ctx, ti);
			}

			ar[i] = ci.getClassObjectRef();
		}

		int aRef = env.newObjectArray("Ljava/lang/reflect/Type;", argTypeNames.length);
		for (int i = 0; i < argTypeNames.length; i++) {
			env.setReferenceArrayElement(ctx, aRef, i, new One<>(ar[i]));
		}

		return aRef;

	}
  
  int getExceptionTypes(MJIEnv env, MethodInfo mi, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    String[] exceptionNames = mi.getThrownExceptionClassNames();
     
    if (exceptionNames == null) {
      exceptionNames = new String[0];
    }
     
    int[] ar = new int[exceptionNames.length];
     
    for (int i = 0; i < exceptionNames.length; i++) {
      ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(exceptionNames[i]);
      if (!ci.isRegistered()) {
        ci.registerClass(ctx, ti);
      }
       
      ar[i] = ci.getClassObjectRef();
    }
     
    int aRef = env.newObjectArray("Ljava/lang/Class;", exceptionNames.length);
    for (int i = 0; i < exceptionNames.length; i++) {
      env.setReferenceArrayElement(ctx, aRef, i, new One<>(ar[i]));
    }
     
    return aRef;
  }
  
  @MJI
  public int getExceptionTypes_____3Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx) {
    return getExceptionTypes(env, getMethodInfo(ctx, env, objRef), ctx);
  }
  
  @MJI
  public int getGenericReturnType____Ljava_lang_reflect_Type_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    ThreadInfo ti = env.getThreadInfo();

    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(mi.getReturnTypeName());
    if (!ci.isRegistered()) {
      ci.registerClass(ctx, ti);
    }

    return ci.getClassObjectRef();
  }
  
  @MJI
  public int getReturnType____Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    ThreadInfo ti = env.getThreadInfo();

    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(mi.getReturnTypeName());
    if (!ci.isRegistered()) {
      ci.registerClass(ctx, ti);
    }

    return ci.getClassObjectRef();
  }
  
  @MJI
  public int getDeclaringClass____Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    MethodInfo mi = getMethodInfo(ctx, env, objRef);    
    ClassInfo ci = mi.getClassInfo();
    // it's got to be registered, otherwise we wouldn't be able to acquire the Method object
    return ci.getClassObjectRef();
  }
    
  static Conditional<Integer> createBoxedReturnValueObject (MJIEnv env, MethodInfo mi, DirectCallStackFrame frame, FeatureExpr ctx) {
    byte rt = mi.getReturnTypeCode();
    Conditional<Integer> ret = One.MJIEnvNULL;
    ElementInfo rei;
    Object attr = null;
    
    if (rt == Types.T_DOUBLE) {
      attr = frame.getLongResultAttr();
      double v = frame.getDoubleResult();
      ret = new One<>(env.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Double")));
      rei = env.getModifiableElementInfo(ret.getValue());
      rei.setDoubleField(ctx, "value", new One<>(v));
    } else if (rt == Types.T_FLOAT) {
      attr = frame.getResultAttr();
      float v = frame.getFloatResult();
      ret = new One<>(env.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Float")));
      rei = env.getModifiableElementInfo(ret.getValue());
      rei.setFloatField(ctx, "value", new One<>(v));
    } else if (rt == Types.T_LONG) {
      attr = frame.getLongResultAttr();
      long v = frame.getLongResult();
      ret = new One<>(env.valueOfLong(ctx, v));
    } else if (rt == Types.T_BYTE) {
      attr = frame.getResultAttr();
      int v = frame.getResult(); 
      ret = new One<>(env.valueOfByte(ctx, (byte)v));
    } else if (rt == Types.T_CHAR) {
      attr = frame.getResultAttr();
      int v = frame.getResult(); 
      ret = new One<>(env.valueOfCharacter(ctx, (char)v));
    } else if (rt == Types.T_SHORT) {
      attr = frame.getResultAttr();
      int v = frame.getResult(); 
      ret = new One<>(env.valueOfShort(ctx, (short)v));
    } else if (rt == Types.T_INT) {
      attr = frame.getResultAttr();
      int v = frame.getResult(); 
      ret = env.valueOfInteger(ctx, v);
    } else if (rt == Types.T_BOOLEAN) {
      attr = frame.getResultAttr();
      int v = frame.getResult();
      ret = new One<>(env.valueOfBoolean((v == 1)? true: false));
    } else if (mi.isReferenceReturnType()){ 
      attr = frame.getResultAttr();
      ret = frame.getReferenceResult(ctx);
    }

    env.setReturnAttribute(attr);
    return ret;
  }
  
  private static Conditional<Integer> argIndex;

  static boolean pushUnboxedArguments (final MJIEnv env, MethodInfo mi, final DirectCallStackFrame frame, int argIdx, final int argsRef, FeatureExpr ctx) {
	  argIndex = new One<>(argIdx);
    final String destTypeNames[] = mi.getArgumentTypeNames();
    int nArgs, passedCount;
	final byte destTypes[] = mi.getArgumentTypes();
    nArgs         = destTypeNames.length;
    
    // according to the API docs, passing null instead of an empty array is allowed for no args
    passedCount   = (argsRef != MJIEnv.NULL) ? env.getArrayLength(ctx, argsRef) : 0;
    
    if (nArgs != passedCount) {
      env.throwException(ctx, IllegalArgumentException.class.getName(), "Wrong number of arguments passed.  Actual = " + passedCount + ".  Expected = " + nArgs);
      return false;
    }
    
    for (int i = 0; i < nArgs; i++) {
    	final int index = i;
    	Conditional<Integer> sourceRef = env.getReferenceArrayElement(argsRef, i).simplify(ctx);

    	Conditional<Boolean> loopValue = sourceRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Integer sourceRef) {
				// we have to handle null references explicitly
				if (sourceRef == MJIEnv.NULL) {
					if ((destTypes[index] != Types.T_REFERENCE) && (destTypes[index] != Types.T_ARRAY)) {
						env.throwException(ctx, IllegalArgumentException.class.getName(), "Wrong argument type at index " + index + ".  Actual = (null).  Expected = " + destTypeNames[index]);
						return One.FALSE;
					} 
					
					frame.pushRef(ctx, MJIEnv.NULL);
					return One.TRUE;
				}
				
				ElementInfo source      = env.getElementInfo(sourceRef);
				ClassInfo sourceClass = source.getClassInfo();   
				byte sourceType = getSourceType( sourceClass, destTypes[index], destTypeNames[index]);
				
				Object attr = env.getElementInfo(argsRef).getFields().getFieldAttr(index);
				int pushArg = pushArg( argIndex.simplify(ctx).getValue(), frame, source, sourceType, destTypes[index], attr, ctx);
				argIndex = ChoiceFactory.create(ctx, new One<>(pushArg), argIndex).simplify();
				if (pushArg < 0 ){
					env.throwException(ctx, IllegalArgumentException.class.getName(), "Wrong argument type at index " + index + ".  Source Class = " + sourceClass.getName() + ".  Dest Class = " + destTypeNames[index]);
					return One.FALSE;        
				}
				return One.TRUE;
			}
    		
		});
    	if (loopValue.simplify().equals(One.TRUE)) {
    		continue;
    	} else if (loopValue.simplify().equals(One.FALSE)) {
    		return false;
    	} else {
    		System.out.println(loopValue);
    		throw new RuntimeException("More lifting required");
    	}
    }
    
    return true;
  }

  // this returns the primitive type in case we have to unbox, and otherwise checks reference type compatibility
  private static byte getSourceType (ClassInfo ciArgVal, byte destType, String destTypeName){
    switch (destType){
    // the primitives
    case Types.T_BOOLEAN:
    case Types.T_BYTE:
    case Types.T_CHAR:
    case Types.T_SHORT:
    case Types.T_INT:
    case Types.T_LONG:
    case Types.T_FLOAT:
    case Types.T_DOUBLE:
      return Types.getUnboxedType(ciArgVal.getName());
      
    case Types.T_ARRAY:
    case Types.T_REFERENCE: // check if the source type is assignment compatible with the destType
      if (ciArgVal.isInstanceOf(destTypeName)){
        return destType;
      }
    }
    
    return Types.T_NONE;
  }
  
  // do the proper type conversion - Java is pretty forgiving here and does
  // not throw exceptions upon value truncation
  private static int pushArg( int argIdx, DirectCallStackFrame frame, ElementInfo eiArg, byte srcType, byte destType, Object attr, FeatureExpr ctx){    
    switch (srcType) {
    case Types.T_DOUBLE:
    {
      double v = eiArg.getDoubleField("value").getValue();
      if (destType == Types.T_DOUBLE){
        return frame.setDoubleArgument( argIdx, v, attr);
      }
      return -1;
    }
    case Types.T_FLOAT: // covers float, double
    {
      float v = eiArg.getFloatField("value").getValue();
      switch (destType){
      case Types.T_FLOAT:
        return frame.setFloatArgument( argIdx, v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, v, attr);
      }
      return -1;
    }
    case Types.T_LONG:
    {
      long v = eiArg.getLongField("value").simplify(ctx).getValue();
      switch (destType){
      case Types.T_LONG:
        return frame.setLongArgument(argIdx, v, attr);
      case Types.T_FLOAT:
        return frame.setFloatArgument(argIdx, (float)v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, (double)v, attr);
      }
      return -1;
    }
    case Types.T_INT:
    { 
      int v = eiArg.getIntField("value").simplify(ctx).getValue();
      switch (destType){
      case Types.T_INT:
        return frame.setArgument( argIdx, v, attr);
      case Types.T_LONG:
        return frame.setLongArgument( argIdx, v, attr);
      case Types.T_FLOAT:
        return frame.setFloatArgument(argIdx, (float)v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, (double)v, attr);
      }
      return -1;
    }
    case Types.T_SHORT:
    { 
      int v = eiArg.getShortField("value").getValue();
      switch (destType){
      case Types.T_SHORT:
      case Types.T_INT:
        return frame.setArgument( argIdx, v, attr);
      case Types.T_LONG:
        return frame.setLongArgument( argIdx, v, attr);
      case Types.T_FLOAT:
        return frame.setFloatArgument(argIdx, (float)v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, (double)v, attr);
      }
      return -1;
    }
    case Types.T_BYTE:
    { 
      byte v = eiArg.getByteField("value").getValue();
      switch (destType){
      case Types.T_BYTE:
      case Types.T_SHORT:
      case Types.T_INT:
        return frame.setArgument( argIdx, v, attr);
      case Types.T_LONG:
        return frame.setLongArgument( argIdx, v, attr);
      case Types.T_FLOAT:
        return frame.setFloatArgument(argIdx, (float)v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, (double)v, attr);
      }
      return -1;
    }
    case Types.T_CHAR:
    {
      char v = eiArg.getCharField("value").getValue();
      switch (destType){
      case Types.T_CHAR:
      case Types.T_INT:
        return frame.setArgument( argIdx, v, attr);
      case Types.T_LONG:
        return frame.setLongArgument( argIdx, v, attr);
      case Types.T_FLOAT:
        return frame.setFloatArgument(argIdx, (float)v, attr);
      case Types.T_DOUBLE:
        return frame.setDoubleArgument( argIdx, (double)v, attr);
      }
      return -1;
    }
    case Types.T_BOOLEAN:
    {
      boolean v = eiArg.getBooleanField("value").getValue();
      if (destType == Types.T_BOOLEAN){
        return frame.setArgument( argIdx, v ? 1 : 0, attr);
      }
      return -1;
    }
    case Types.T_ARRAY:
    {
      int ref =  eiArg.getObjectRef();
      if (destType == Types.T_ARRAY){
        return frame.setReferenceArgument( ctx, argIdx, ref, attr);
      }
      return -1;
    }
    case Types.T_REFERENCE:
    {
      int ref =  eiArg.getObjectRef();
      if (destType == Types.T_REFERENCE){
        return frame.setReferenceArgument( ctx, argIdx, ref, attr);
      }
      return -1;
    }
    default:
      // T_VOID, T_NONE
      return -1;
    }
  }

	@MJI
	public Conditional<Integer> invoke__Ljava_lang_Object_2_3Ljava_lang_Object_2__Ljava_lang_Object_2(MJIEnv env,
			Conditional<Integer> mthRef, Conditional<Integer> objRef, Conditional<Integer> argsRef, FeatureExpr ctx) {
		try {
			ThreadInfo ti = env.getThreadInfo();
			MethodInfo miCallee = getMethodInfo(ctx, env, mthRef.getValue());
			ClassInfo calleeClass = miCallee.getClassInfo();
			DirectCallStackFrame frame = ti.getReturnedDirectCall();

			if (frame == null) { // first time

				//--- check the instance we are calling on
				if (!miCallee.isStatic()) {
					if (objRef.getValue().intValue() == MJIEnv.NULL) {
						env.throwException(ctx, "java.lang.NullPointerException");
						return One.MJIEnvNULL;

					} else {
						ElementInfo eiObj = ti.getElementInfo(objRef.getValue());
						ClassInfo objClass = eiObj.getClassInfo();

						if (!objClass.isInstanceOf(calleeClass)) {
							env.throwException(ctx, IllegalArgumentException.class.getName(),
									"Object is not an instance of declaring class.  Actual = " + objClass + ".  Expected = "
											+ calleeClass);
							return One.MJIEnvNULL;
						}
					}
				}

				//--- check accessibility
				ElementInfo eiMth = ti.getElementInfo(mthRef.getValue());
				Object object = eiMth.getFieldValueObject("isAccessible");
				if (object instanceof Conditional) {
					object = ((Conditional<?>) object).simplify(ctx).getValue();
				}
				if (!(Boolean) object) {
					StackFrame caller = ti.getTopFrame().getPrevious();
					ClassInfo callerClass = caller.getClassInfo();

					if (callerClass != calleeClass) {
						env.throwException(ctx, IllegalAccessException.class.getName(), "Class " + callerClass.getName()
								+ " can not access a member of class " + calleeClass.getName() + " with modifiers \"" + Modifier
										.toString(miCallee.getModifiers()));
						return One.MJIEnvNULL;
					}
				}

				//--- push the direct call
				frame = miCallee.createDirectCallStackFrame(ctx, ti, 0);
				frame.setReflection();

				int argOffset = 0;
				if (!miCallee.isStatic()) {
					frame.setReferenceArgument(ctx, argOffset++, objRef.getValue(), null);
				}
				if (!pushUnboxedArguments(env, miCallee, frame, argOffset, argsRef.getValue(), ctx)) {
					// we've got a IllegalArgumentException
					return One.MJIEnvNULL;
				}
				ti.pushFrame(frame);

				//--- check for and push required clinits
				if (miCallee.isStatic()) {
					calleeClass.pushRequiredClinits(ctx, ti);
				}

				return One.MJIEnvNULL; // reexecute

			} else { // we have returned from the direct call
				return createBoxedReturnValueObject(env, miCallee, frame, ctx);
			}
		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
			return One.MJIEnvNULL;
		}
	}

  // this one has to collect annotations upwards in the inheritance chain
  static int getAnnotations (MJIEnv env, MethodInfo mi, FeatureExpr ctx){
    String mname = mi.getName();
    String msig = mi.genericSignature;
    ArrayList<AnnotationInfo> aiList = new ArrayList<AnnotationInfo>();
    
    // our own annotations
    ClassInfo ci = mi.getClassInfo();
    for (AnnotationInfo ai : mi.getAnnotations()) {
      aiList.add(ai);
    }
    
    // our superclass annotations
    for (ci = ci.getSuperClass(); ci != null; ci = ci.getSuperClass()){
      mi = ci.getMethod(mname, msig, false);
      if (mi != null){
        for (AnnotationInfo ai: mi.getAnnotations()){
          aiList.add(ai);
        }        
      }
    }

    try {
    	
      return env.newAnnotationProxies(ctx, aiList.toArray(new AnnotationInfo[aiList.size()]));
    } catch (ClinitRequired x){
      env.handleClinitRequest(ctx, x.getRequiredClassInfo());
      return MJIEnv.NULL;
    }    
  }

  @MJI
  public int getAnnotations_____3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int mthRef, FeatureExpr ctx){
    return getAnnotations( env, getMethodInfo(ctx,env, mthRef), ctx);
  }
  
  // the following ones consist of a package default implementation that is shared with
  // the constructor peer, and a public model method
  static int getAnnotation (MJIEnv env, MethodInfo mi, int annotationClsRef, FeatureExpr ctx){
	  
    ClassInfo aci = env.getReferredClassInfo(ctx, annotationClsRef);
    
    AnnotationInfo ai = mi.getAnnotation(aci.getName());
    if (ai != null){
      ClassInfo aciProxy = aci.getAnnotationProxy();
      try {
        return env.newAnnotationProxy(ctx, aciProxy, ai);
      } catch (ClinitRequired x){
        env.handleClinitRequest(ctx, x.getRequiredClassInfo());
        return MJIEnv.NULL;
      }
    }
    
    return MJIEnv.NULL;
  }  

  @MJI
  public int getAnnotation__Ljava_lang_Class_2__Ljava_lang_annotation_Annotation_2 (MJIEnv env, int mthRef, int annotationClsRef, FeatureExpr ctx) {
    return getAnnotation(env, getMethodInfo(ctx,env, mthRef), annotationClsRef, ctx);
  }
  
  static int getDeclaredAnnotations (MJIEnv env, MethodInfo mi, FeatureExpr ctx){
    AnnotationInfo[] ai = mi.getAnnotations();

    try {
    	
      return env.newAnnotationProxies(ctx, ai);
    } catch (ClinitRequired x){
      env.handleClinitRequest(ctx, x.getRequiredClassInfo());
      return MJIEnv.NULL;
    }    
  }

  @MJI
  public int getDeclaredAnnotations_____3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int mthRef, FeatureExpr ctx){
    return getDeclaredAnnotations( env, getMethodInfo(ctx,env, mthRef), ctx);
  }
  
  static int getParameterAnnotations (MJIEnv env, MethodInfo mi, FeatureExpr ctx){
    AnnotationInfo[][] pa = mi.getParameterAnnotations();
    // this should always return an array object, even if the method has no arguments
    
    try {
      int paRef = env.newObjectArray("[Ljava/lang/annotation/Annotation;", pa.length);
      
      for (int i=0; i<pa.length; i++){
        int eRef = env.newAnnotationProxies(ctx, pa[i]);
        env.setReferenceArrayElement(ctx, paRef, i, new One<>(eRef));
      }

      return paRef;
      
    } catch (ClinitRequired x){ // be prepared that we might have to initialize respective annotation classes
      env.handleClinitRequest(ctx, x.getRequiredClassInfo());
      return MJIEnv.NULL;
    }    
  }

  @MJI
  public int getParameterAnnotations_____3_3Ljava_lang_annotation_Annotation_2 (MJIEnv env, int mthRef, FeatureExpr ctx){
    return getParameterAnnotations( env, getMethodInfo(ctx,env, mthRef), ctx);
  }

  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx){
    StringBuilder sb = new StringBuilder();
    
    MethodInfo mi = getMethodInfo(ctx, env, objRef);

    sb.append(Modifier.toString(mi.getModifiers()));
    sb.append(' ');

    sb.append(mi.getReturnTypeName());
    sb.append(' ');

    sb.append(mi.getClassName());
    sb.append('.');

    sb.append(mi.getName());

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
    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo(JPF_java_lang_Class.METHOD_CLASSNAME);

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
                if (params1[i] != params2[i]){
                  return false;
                }
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
    MethodInfo mi = getMethodInfo(ctx, env, objRef);
    return mi.getClassName().hashCode() ^ mi.getName().hashCode();
  }
}
