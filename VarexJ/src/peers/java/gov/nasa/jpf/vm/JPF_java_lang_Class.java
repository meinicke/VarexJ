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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import java.util.function.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.Class library abstraction
 */
@SuppressWarnings("deprecation")
public class JPF_java_lang_Class extends NativePeer {

	static final String FIELD_CLASSNAME = "java.lang.reflect.Field";
	static final String METHOD_CLASSNAME = "java.lang.reflect.Method";
	static final String CONSTRUCTOR_CLASSNAME = "java.lang.reflect.Constructor";

	public static boolean init(Config conf) {
		// we create Method and Constructor objects, so we better make sure these
		// classes are initialized (they already might be)
		JPF_java_lang_reflect_Method.init(conf);
		JPF_java_lang_reflect_Constructor.init(conf);
		return true;
	}

	@MJI
	public boolean isArray____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return ci.isArray();
	}

	@MJI
	public int getComponentType____Ljava_lang_Class_2(MJIEnv env, int robj, FeatureExpr ctx) {
		if (isArray____Z(env, robj, ctx)) {
			ThreadInfo ti = env.getThreadInfo();
			// Instruction insn = ti.getPC().getValue();
			ClassInfo ci = env.getReferredClassInfo(ctx, robj).getComponentClassInfo();

			if (ci.pushRequiredClinits(ctx, ti)) {
				env.repeatInvocation();
				return MJIEnv.NULL;
			}

			return ci.getClassObjectRef();
		}

		return MJIEnv.NULL;
	}

	@MJI
	public boolean isInstance__Ljava_lang_Object_2__Z(MJIEnv env, int robj, int r1, FeatureExpr ctx) {
		ElementInfo sei = env.getStaticElementInfo(robj);
		ClassInfo ci = sei.getClassInfo();
		ClassInfo ciOther = env.getClassInfo(r1);
		return (ciOther.isInstanceOf(ci.getName()));
	}

	@MJI
	public boolean isInterface____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return ci.isInterface();
	}

	@MJI
	public Conditional<Boolean> isAssignableFrom__Ljava_lang_Class_2__Z(final MJIEnv env, int rcls, Conditional<Integer> r1, FeatureExpr ctx) {
		ElementInfo sei1 = env.getStaticElementInfo(rcls);
		final ClassInfo ci1 = sei1.getClassInfo();

		return r1.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Integer r1) {
				ElementInfo sei2 = env.getStaticElementInfo(r1);
				ClassInfo ci2 = sei2.getClassInfo();
				return new One<>(ci2.isInstanceOf(ci1.getName()));
			}

		});
	}

	@MJI
	public int getAnnotations_____3Ljava_lang_annotation_Annotation_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		AnnotationInfo[] ai = ci.getAnnotations();

		try {

			return env.newAnnotationProxies(ctx, ai);
		} catch (ClinitRequired x) {
			env.handleClinitRequest(ctx, x.getRequiredClassInfo());
			return MJIEnv.NULL;
		}
	}

	@MJI
	public int getAnnotation__Ljava_lang_Class_2__Ljava_lang_annotation_Annotation_2(MJIEnv env, int robj, int annoClsRef, FeatureExpr ctx) {

		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		ClassInfo aci = env.getReferredClassInfo(ctx, annoClsRef);

		AnnotationInfo ai = ci.getAnnotation(aci.getName());
		if (ai != null) {
			ClassInfo aciProxy = aci.getAnnotationProxy();

			try {
				return env.newAnnotationProxy(ctx, aciProxy, ai);
			} catch (ClinitRequired x) {
				env.handleClinitRequest(ctx, x.getRequiredClassInfo());
				return MJIEnv.NULL;
			}
		} else {
			return MJIEnv.NULL;
		}
	}

	@MJI
	public int getPrimitiveClass__Ljava_lang_String_2__Ljava_lang_Class_2(MJIEnv env, int rcls, Conditional<Integer> stringRef, FeatureExpr ctx) {
		// we don't really have to check for a valid class name here, since
		// this is a package default method that just gets called from
		// the clinit of box classes
		// note this does NOT return the box class (e.g. java.lang.Integer), which
		// is a normal, functional class, but a primitive class (e.g. 'int') that
		// is rather a strange beast (not even Object derived)

		ClassLoaderInfo scli = env.getSystemClassLoaderInfo(); // this is the one responsible for builtin classes
		String primClsName = env.getStringObject(ctx, stringRef.getValue()); // always initialized

		ClassInfo ci = scli.getResolvedClassInfo(ctx, primClsName);
		return ci.getClassObjectRef();
	}

	@MJI
	public boolean desiredAssertionStatus____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return ci.desiredAssertionStatus();
	}

	public static int getClassObject(MJIEnv env, ClassInfo ci, FeatureExpr ctx) {
		ThreadInfo ti = env.getThreadInfo();
		// Instruction insn = ti.getPC().getValue();

		if (ci.pushRequiredClinits(ctx, ti)) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		StaticElementInfo ei = ci.getStaticElementInfo();
		int ref = ei.getClassObjectRef();

		return ref;
	}

	@MJI
	public int forName__Ljava_lang_String_2__Ljava_lang_Class_2(MJIEnv env, int rcls, Conditional<Integer> clsNameRef, FeatureExpr ctx) {
		if (clsNameRef.getValue().intValue() == MJIEnv.NULL) {
			env.throwException(ctx, "java.lang.NullPointerException", "no class name provided");
			return MJIEnv.NULL;
		}

		String clsName = env.getStringObject(ctx, clsNameRef.getValue());

		if (clsName.isEmpty()) {
			env.throwException(ctx, "java.lang.ClassNotFoundException", "empty class name");
			return MJIEnv.NULL;
		}

		ThreadInfo ti = env.getThreadInfo();
		MethodInfo mi = ti.getTopFrame().getPrevious().getMethodInfo();
		// class of the method that includes the invocation of Class.forName()
		ClassInfo cls = mi.getClassInfo();

		String name;
		// for array type, the component terminal must be resolved
		if (clsName.charAt(0) == '[') {
			name = Types.getComponentTerminal(clsName);
		} else {
			name = clsName;
		}

		// make the classloader of the class including the invocation of
		// Class.forName() resolve the class with the given name
		try {
			cls.resolveReferencedClass(ctx, name);
		} catch (LoadOnJPFRequired lre) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		// The class obtained here is the same as the resolved one, except
		// if it represents an array type
		ClassInfo ci = cls.getClassLoaderInfo().getResolvedClassInfo(ctx, clsName);

		return getClassObject(env, ci, ctx);
	}

	/**
	 * this is an example of a native method issuing direct calls - otherwise known
	 * as a round trip.
	 * We don't have to deal with class init here anymore, since this is called
	 * via the class object of the class to instantiate
	 */
	@MJI
	public int newInstance____Ljava_lang_Object_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ThreadInfo ti = env.getThreadInfo();
		DirectCallStackFrame frame = ti.getReturnedDirectCall();

		ClassInfo ci = env.getReferredClassInfo(ctx, robj); // what are we
		MethodInfo miCtor = ci.getMethod("<init>()V", true); // note there always is one since something needs to call Object()

		if (frame == null) { // first time around
			if (ci.isAbstract()) { // not allowed to instantiate
				env.throwException(ctx, "java.lang.InstantiationException");
				return MJIEnv.NULL;
			}

			// <2do> - still need to handle protected
			if (miCtor.isPrivate()) {
				env.throwException(ctx, "java.lang.IllegalAccessException", "cannot access non-public member of class " + ci.getName());
				return MJIEnv.NULL;
			}

			int objRef = env.newObjectOfUncheckedClass(ctx, ci); // create the thing

			frame = miCtor.createDirectCallStackFrame(ctx, ti, 1);
			// note that we don't set this as a reflection call since it is supposed to propagate exceptions
			frame.setReferenceArgument(ctx, 0, objRef, null);
			frame.setLocalReferenceVariable(ctx, 0, objRef); // (1) store ref for retrieval during re-exec
			ti.pushFrame(frame);

			// check if we have to push clinits
			ci.pushRequiredClinits(ctx, ti);

			env.repeatInvocation();
			return MJIEnv.NULL;

		} else { // re-execution
			int objRef = frame.getLocalVariable(ctx, 0).getValue(); // that's the object ref we set in (1)
			return objRef;
		}
	}

	@MJI
	public int getSuperclass____Ljava_lang_Class_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		ClassInfo sci = ci.getSuperClass();
		if (sci != null) {
			return sci.getClassObjectRef();
		} else {
			return MJIEnv.NULL;
		}
	}

	int getMethod(MJIEnv env, int clsRef, ClassInfo ciMethod, String mname, int argTypesRef, boolean isRecursiveLookup, boolean publicOnly, FeatureExpr ctx) {

		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);

		StringBuilder sb = new StringBuilder(mname);
		sb.append('(');
		int nParams = argTypesRef != MJIEnv.NULL ? env.getArrayLength(ctx, argTypesRef) : 0;
		for (int i = 0; i < nParams; i++) {
			int cRef = env.getReferenceArrayElement(argTypesRef, i).simplify(ctx).getValue();
			if (cRef == MJIEnv.NULL) {
				String tcode = "java.lang.Object";
				tcode = Types.getTypeSignature(tcode, false);
				sb.append(tcode);
			} else {
				ClassInfo cit = env.getReferredClassInfo(ctx, cRef);
				String tcode = cit.getName();
				tcode = Types.getTypeSignature(tcode, false);
				sb.append(tcode);
			}
		}
		sb.append(')');
		String fullMthName = sb.toString();

		MethodInfo mi = ci.getReflectionMethod(fullMthName, isRecursiveLookup);
		if (mi == null || (publicOnly && !mi.isPublic())) {
			env.throwException(ctx, "java.lang.NoSuchMethodException", ci.getName() + '.' + fullMthName);
			return MJIEnv.NULL;

		} else {
			return createMethodObject(env, ciMethod, mi, ctx);
		}
	}

	int createMethodObject(MJIEnv env, ClassInfo objectCi, MethodInfo mi, FeatureExpr ctx) {
		// NOTE - we rely on Constructor and Method peers being initialized
		if (mi.isCtor()) {
			return JPF_java_lang_reflect_Constructor.createConstructorObject(env, objectCi, mi, ctx);
		} else {
			return JPF_java_lang_reflect_Method.createMethodObject(env, objectCi, mi, ctx);
		}
	}

	@MJI
	public int getDeclaredMethod__Ljava_lang_String_2_3Ljava_lang_Class_2__Ljava_lang_reflect_Method_2(MJIEnv env, int clsRef, int nameRef, int argTypesRef, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, METHOD_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		String mname = env.getStringObject(ctx, nameRef);
		return getMethod(env, clsRef, mci, mname, argTypesRef, false, false, ctx);
	}

	@MJI
	public int getDeclaredConstructor___3Ljava_lang_Class_2__Ljava_lang_reflect_Constructor_2(MJIEnv env, int clsRef, int argTypesRef, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, CONSTRUCTOR_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		int ctorRef = getMethod(env, clsRef, mci, "<init>", argTypesRef, false, false, ctx);
		return ctorRef;
	}

	@MJI
	public Conditional<Integer> getMethod__Ljava_lang_String_2_3Ljava_lang_Class_2__Ljava_lang_reflect_Method_2(final MJIEnv env, final int clsRef, Conditional<Integer> nameRef,
			final Conditional<Integer> argTypesRef, FeatureExpr ctx) {
		final ClassInfo mci = getInitializedClassInfo(env, METHOD_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return One.MJIEnvNULL;
		}

		Conditional<String> mname = env.getStringObject(ctx, nameRef);
		return mname.mapf(ctx,  new BiFunction<FeatureExpr, String, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, String mname) {
				return new One<>(getMethod(env, clsRef, mci, mname, argTypesRef.getValue(), true, true, ctx));
			}
		});
	}

	private void addDeclaredMethodsRec(HashMap<String, MethodInfo> methods, ClassInfo ci, FeatureExpr ctx) {
		ClassInfo sci = ci.getSuperClass();
		if (sci != null) {
			addDeclaredMethodsRec(methods, sci, ctx);
		}

		ClassLoaderInfo cl = ci.getClassLoaderInfo();
		for (String ifcName : ci.getDirectInterfaceNames()) {
			ClassInfo ici = cl.getResolvedClassInfo(ctx, ifcName); // has to be already defined, so no exception
			addDeclaredMethodsRec(methods, ici, ctx);
		}

		for (MethodInfo mi : ci.getDeclaredMethodInfos()) {
			// filter out non-public, <clinit> and <init>
			if (mi.isPublic() && (mi.getName().charAt(0) != '<')) {
				String mname = mi.getUniqueName();

				if (!(ci.isInterface() && methods.containsKey(mname))) {
					methods.put(mname, mi);
				}
			}
		}
	}

	@MJI
	public int getMethods_____3Ljava_lang_reflect_Method_2(MJIEnv env, int objref, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, METHOD_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ClassInfo ci = env.getReferredClassInfo(ctx, objref);

		// collect all the public, non-ctor instance methods
		if (!ci.isPrimitive()) {
			HashMap<String, MethodInfo> methods = new HashMap<>();
			addDeclaredMethodsRec(methods, ci, ctx);

			int n = methods.size();
			int aref = env.newObjectArray("Ljava/lang/reflect/Method;", n);
			int i = 0;

			for (MethodInfo mi : methods.values()) {
				int mref = createMethodObject(env, mci, mi, ctx);
				env.setReferenceArrayElement(ctx, aref, i++, new One<>(mref));
			}

			return aref;

		} else {
			return env.newObjectArray("Ljava/lang/reflect/Method;", 0);
		}
	}

	@MJI
	public int getDeclaredMethods_____3Ljava_lang_reflect_Method_2(MJIEnv env, int objref, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, METHOD_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ClassInfo ci = env.getReferredClassInfo(ctx, objref);
		MethodInfo[] methodInfos = ci.getDeclaredMethodInfos();

		// we have to filter out the ctors and the static init
		int nMth = methodInfos.length;
		for (int i = 0; i < methodInfos.length; i++) {
			if (methodInfos[i].getName().charAt(0) == '<') {
				methodInfos[i] = null;
				nMth--;
			}
		}

		int aref = env.newObjectArray("Ljava/lang/reflect/Method;", nMth);

		for (int i = 0, j = 0; i < methodInfos.length; i++) {
			if (methodInfos[i] != null) {
				int mref = createMethodObject(env, mci, methodInfos[i], ctx);
				env.setReferenceArrayElement(ctx, aref, j++, new One<>(mref));
			}
		}

		return aref;
	}

	int getConstructors(MJIEnv env, int objref, boolean publicOnly, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, CONSTRUCTOR_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ClassInfo ci = env.getReferredClassInfo(ctx, objref);
		ArrayList<MethodInfo> ctors = new ArrayList<>();

		// we have to filter out the ctors and the static init
		for (MethodInfo mi : ci.getDeclaredMethodInfos()) {
			if (mi.getName().equals("<init>")) {
				if (!publicOnly || mi.isPublic()) {
					ctors.add(mi);
				}
			}
		}

		int nCtors = ctors.size();
		int aref = env.newObjectArray("Ljava/lang/reflect/Constructor;", nCtors);

		for (int i = 0; i < nCtors; i++) {
			env.setReferenceArrayElement(ctx, aref, i, new One<>(createMethodObject(env, mci, ctors.get(i), ctx)));
		}

		return aref;
	}

	@MJI
	public int getConstructors_____3Ljava_lang_reflect_Constructor_2(MJIEnv env, int objref, FeatureExpr ctx) {
		return getConstructors(env, objref, true, ctx);
	}

	@MJI
	public int getDeclaredConstructors_____3Ljava_lang_reflect_Constructor_2(MJIEnv env, int objref, FeatureExpr ctx) {
		return getConstructors(env, objref, false, ctx);
	}

	@MJI
	public int getConstructor___3Ljava_lang_Class_2__Ljava_lang_reflect_Constructor_2(MJIEnv env, int clsRef, int argTypesRef, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, CONSTRUCTOR_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		// <2do> should only return a public ctor
		return getMethod(env, clsRef, mci, "<init>", argTypesRef, false, true, ctx);
	}

	// this is only used for system classes such as java.lang.reflect.Method
	ClassInfo getInitializedClassInfo(MJIEnv env, String clsName, FeatureExpr ctx) {
		ThreadInfo ti = env.getThreadInfo();
		// Instruction insn = ti.getPC().getValue();
		ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo(clsName);

		if (ci.pushRequiredClinits(ctx, ti)) {
			return null;
		} else {
			return ci;
		}
	}

	@MJI
	public void initialize0____V(MJIEnv env, int clsObjRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsObjRef);
		ci.pushRequiredClinits(ctx, ThreadInfo.currentThread);
	}

	Set<ClassInfo> getInitializedInterfaces(MJIEnv env, ClassInfo ci, FeatureExpr ctx) {
		ThreadInfo ti = env.getThreadInfo();
		// Instruction insn = ti.getPC().getValue();

		Set<ClassInfo> ifcs = ci.getAllInterfaceClassInfos();
		for (ClassInfo ciIfc : ifcs) {
			if (ciIfc.pushRequiredClinits(ctx, ti)) {
				return null;
			}
		}

		return ifcs;
	}

	static int createFieldObject(MJIEnv env, FieldInfo fi, ClassInfo fci, FeatureExpr ctx) {
		int regIdx = JPF_java_lang_reflect_Field.registerFieldInfo(fi);

		int eidx = env.newObject(ctx, fci);
		ElementInfo ei = env.getModifiableElementInfo(eidx);
		ei.setIntField(ctx, "regIdx", new One<>(regIdx));

		return eidx;
	}

	@MJI
	public int getDeclaredFields_____3Ljava_lang_reflect_Field_2(MJIEnv env, int objRef, FeatureExpr ctx) {
		ClassInfo fci = getInitializedClassInfo(env, FIELD_CLASSNAME, ctx);
		if (fci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ClassInfo ci = env.getReferredClassInfo(ctx, objRef);
		int nInstance = ci.getNumberOfDeclaredInstanceFields();
		int nStatic = ci.getNumberOfStaticFields();
		int aref = env.newObjectArray("Ljava/lang/reflect/Field;", nInstance + nStatic);
		int i, j = 0;

		for (i = 0; i < nStatic; i++) {
			FieldInfo fi = ci.getStaticField(i);
			env.setReferenceArrayElement(ctx, aref, j++, new One<>(createFieldObject(env, fi, fci, ctx)));
		}

		for (i = 0; i < nInstance; i++) {
			FieldInfo fi = ci.getDeclaredInstanceField(i);
			env.setReferenceArrayElement(ctx, aref, j++, new One<>(createFieldObject(env, fi, fci, ctx)));
		}

		return aref;
	}

	@MJI
	public int getFields_____3Ljava_lang_reflect_Field_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo fci = getInitializedClassInfo(env, FIELD_CLASSNAME, ctx);
		if (fci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		// interfaces might not be initialized yet, so we have to check first
		Set<ClassInfo> ifcs = getInitializedInterfaces(env, ci, ctx);
		if (ifcs == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		ArrayList<FieldInfo> fiList = new ArrayList<>();
		for (; ci != null; ci = ci.getSuperClass()) {
			// the host VM returns them in order of declaration, but the spec says there is no guaranteed order so we keep it simple
			for (FieldInfo fi : ci.getDeclaredInstanceFields()) {
				if (fi.isPublic()) {
					fiList.add(fi);
				}
			}
			for (FieldInfo fi : ci.getDeclaredStaticFields()) {
				if (fi.isPublic()) {
					fiList.add(fi);
				}
			}
		}

		for (ClassInfo ciIfc : ifcs) {
			for (FieldInfo fi : ciIfc.getDeclaredStaticFields()) {
				fiList.add(fi); // there are no non-public fields in interfaces
			}
		}

		int aref = env.newObjectArray("Ljava/lang/reflect/Field;", fiList.size());
		int j = 0;
		for (FieldInfo fi : fiList) {
			env.setReferenceArrayElement(ctx, aref, j++, new One<>(createFieldObject(env, fi, fci, ctx)));
		}

		return aref;
	}

	int getField(MJIEnv env, int clsRef, int nameRef, boolean isRecursiveLookup, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		String fname = env.getStringObject(ctx, nameRef);
		FieldInfo fi = null;

		if (isRecursiveLookup) {
			fi = ci.getInstanceField(fname);
			if (fi == null) {
				fi = ci.getStaticField(fname);
			}
		} else {
			fi = ci.getDeclaredInstanceField(fname);
			if (fi == null) {
				fi = ci.getDeclaredStaticField(fname);
			}
		}

		if (fi == null) {
			env.throwException(ctx, "java.lang.NoSuchFieldException", fname);
			return MJIEnv.NULL;
		}
//		 if (!fi.isPublic()) {// TODO
//		    env.throwException(ctx, NoSuchFieldException.class.getName(), fi.getName());
//		 }
		// don't do a Field clinit before we know there is such a field
		ClassInfo fci = getInitializedClassInfo(env, FIELD_CLASSNAME, ctx);
		if (fci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}

		return createFieldObject(env, fi, fci, ctx);
	}

	@MJI
	public int getDeclaredField__Ljava_lang_String_2__Ljava_lang_reflect_Field_2(MJIEnv env, int clsRef, int nameRef, FeatureExpr ctx) {
		return getField(env, clsRef, nameRef, false, ctx);
	}

	@MJI
	public int getField__Ljava_lang_String_2__Ljava_lang_reflect_Field_2(MJIEnv env, int clsRef, int nameRef, FeatureExpr ctx) {
		return getField(env, clsRef, nameRef, true, ctx);
	}

	@MJI
	public int getModifiers____I(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		return ci.getModifiers();
	}

	@MJI
	public int getEnumConstants_____3Ljava_lang_Object_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);

		if (env.requiresClinitExecution(ctx, ci)) {
			env.repeatInvocation();
			return 0;
		}

		if (ci.getSuperClass().getName().equals("java.lang.Enum")) {
			ArrayList<FieldInfo> list = new ArrayList<>();
			String cName = ci.getName();

			for (FieldInfo fi : ci.getDeclaredStaticFields()) {
				if (fi.isFinal() && cName.equals(fi.getType())) {
					list.add(fi);
				}
			}

			int aRef = env.newObjectArray(cName, list.size());
			StaticElementInfo sei = ci.getStaticElementInfo();
			int i = 0;
			for (FieldInfo fi : list) {
				env.setReferenceArrayElement(ctx, aRef, i++, sei.getReferenceField(fi));
			}
			return aRef;
		}

		return MJIEnv.NULL;
	}

	@MJI
	public int getInterfaces_____3Ljava_lang_Class_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		int aref = MJIEnv.NULL;
		// ThreadInfo ti = env.getThreadInfo();

		// contrary to the API doc, this only returns the interfaces directly
		// implemented by this class, not it's bases
		// <2do> this is not exactly correct, since the interfaces should be ordered
		Set<ClassInfo> interfaces = ci.getInterfaceClassInfos();
		aref = env.newObjectArray("Ljava/lang/Class;", interfaces.size());

		int i = 0;
		for (ClassInfo ifc : interfaces) {
			env.setReferenceArrayElement(ctx, aref, i++, new One<>(ifc.getClassObjectRef()));
		}

		return aref;
	}

	/**
	 * <2do> needs to load from the classfile location, NOT the MJIEnv (native) class
	 * 
	 * @author Sebastian Gfeller (sebastian.gfeller@gmail.com)
	 * @author Tihomir Gvero (tihomir.gvero@gmail.com)
	 */
	@MJI
	public int getByteArrayFromResourceStream__Ljava_lang_String_2___3B(MJIEnv env, int clsRef, int nameRef, FeatureExpr ctx) {
		String name = env.getStringObject(ctx, nameRef);

		// <2do> this is not loading from the classfile location! fix it
		InputStream is = env.getClass().getResourceAsStream(name);
		if (is == null) {
			return MJIEnv.NULL;
		}
		// We assume that the entire input stream can be read at the moment,
		// although this could break.
		byte[] content = null;
		try {
			content = new byte[is.available()];
			is.read(content);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		// Now if everything worked, the content should be in the byte buffer.
		// We put this buffer into the JPF VM.
		return env.newByteArray(ctx, content);
	}

	@MJI
	public int getEnclosingClass____Ljava_lang_Class_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ciEncl = env.getReferredClassInfo(ctx, clsRef).getEnclosingClassInfo();

		if (ciEncl == null) {
			return MJIEnv.NULL;
		}

		if (!ciEncl.isRegistered()) {
			ThreadInfo ti = env.getThreadInfo();
			ciEncl.registerClass(ctx, ti);

			if (!ciEncl.isInitialized()) {
				if (ciEncl.pushRequiredClinits(ctx, ti)) {
					env.repeatInvocation();
					return 0;
				}
			}
		}

		return ciEncl.getClassObjectRef();
	}

	@MJI
	public int getDeclaredClasses_____3Ljava_lang_Class_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		String[] innerClassNames = ci.getInnerClasses();
		int aref = MJIEnv.NULL;
		ThreadInfo ti = env.getThreadInfo();

		MethodInfo mi = ti.getTopFrame().getPrevious().getMethodInfo();
		// class of the method that includes the invocation of Class.getDeclaredClasses
		ClassInfo cls = mi.getClassInfo();

		// first resolve all the inner classes
		int length = innerClassNames.length;
		ClassInfo[] resolvedInnerClass = new ClassInfo[length];
		for (int i = 0; i < length; i++) {
			try {
				resolvedInnerClass[i] = cls.resolveReferencedClass(ctx, innerClassNames[i]);
			} catch (LoadOnJPFRequired lre) {
				env.repeatInvocation();
				return MJIEnv.NULL;
			}
		}

		aref = env.newObjectArray("Ljava/lang/Class;", innerClassNames.length);
		for (int i = 0; i < length; i++) {
			ClassInfo ici = resolvedInnerClass[i];
			if (!ici.isRegistered()) {
				ici.registerClass(ctx, ti);
			}
			env.setReferenceArrayElement(ctx, aref, i, new One<>(ici.getClassObjectRef()));
		}

		return aref;
	}

	private String getCanonicalName(ClassInfo ci) {
		if (ci.isArray()) {
			String canonicalName = getCanonicalName(ci.getComponentClassInfo());
			if (canonicalName != null) {
				return canonicalName + "[]";
			} else {
				return null;
			}
		}
		if (isLocalOrAnonymousClass(ci)) {
			return null;
		}
		if (ci.getEnclosingClassInfo() == null) {
			return ci.getName();
		} else {
			String enclosingName = getCanonicalName(ci.getEnclosingClassInfo());
			if (enclosingName == null) {
				return null;
			}
			return enclosingName + "." + ci.getSimpleName();
		}
	}

	@MJI
	public int getCanonicalName____Ljava_lang_String_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		return env.newString(ctx, getCanonicalName(ci));
	}

	@MJI
	public boolean isAnnotation____Z(MJIEnv env, int clsObjRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsObjRef);
		return (ci.getModifiers() & 0x2000) != 0;
	}

	@MJI
	public boolean isAnnotationPresent__Ljava_lang_Class_2__Z(MJIEnv env, int clsObjRef, int annoClsObjRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsObjRef);
		ClassInfo ciAnno = env.getReferredClassInfo(ctx, annoClsObjRef);

		return ci.getAnnotation(ciAnno.getName()) != null;
	}

	@MJI
	public int getDeclaredAnnotations_____3Ljava_lang_annotation_Annotation_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);

		try {

			return env.newAnnotationProxies(ctx, ci.getDeclaredAnnotations());
		} catch (ClinitRequired x) {
			env.handleClinitRequest(ctx, x.getRequiredClassInfo());
			return MJIEnv.NULL;
		}
	}

	@MJI
	public int getEnclosingConstructor____Ljava_lang_reflect_Constructor_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, CONSTRUCTOR_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		MethodInfo enclosingMethod = ci.getEnclosingMethodInfo();

		if ((enclosingMethod != null) && enclosingMethod.isCtor()) {
			return createMethodObject(env, mci, enclosingMethod, ctx);
		}
		return MJIEnv.NULL;
	}

	@MJI
	public int getEnclosingMethod____Ljava_lang_reflect_Method_2(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo mci = getInitializedClassInfo(env, METHOD_CLASSNAME, ctx);
		if (mci == null) {
			env.repeatInvocation();
			return MJIEnv.NULL;
		}
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		MethodInfo enclosingMethod = ci.getEnclosingMethodInfo();

		if ((enclosingMethod != null) && !enclosingMethod.isCtor()) {
			return createMethodObject(env, mci, enclosingMethod, ctx);
		}
		return MJIEnv.NULL;
	}

	@MJI
	public boolean isAnonymousClass____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		String cname = null;
		if (ci.getName().contains("$")) {
			cname = ci.getName().substring(ci.getName().lastIndexOf('$') + 1);
		}
		return (cname == null) ? false : cname.matches("\\d+?");
	}

	@MJI
	public boolean isEnum____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return ci.isEnum();
	}

	// Similar to getEnclosingClass() except it returns null for the case of
	// anonymous class.
	@MJI
	public int getDeclaringClass____Ljava_lang_Class_2(MJIEnv env, int clsRef, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, clsRef);
		if (isLocalOrAnonymousClass(ci)) {
			return MJIEnv.NULL;
		} else {
			return getEnclosingClass____Ljava_lang_Class_2(env, clsRef, ctx);
		}
	}

	@MJI
	public boolean isLocalClass____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return isLocalOrAnonymousClass(ci) && !isAnonymousClass____Z(env, robj, ctx);
	}

	private boolean isLocalOrAnonymousClass(ClassInfo ci) {
		return (ci.getEnclosingMethodInfo() != null);
	}

	@MJI
	public boolean isMemberClass____Z(MJIEnv env, int robj, FeatureExpr ctx) {
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		return (ci.getEnclosingClassInfo() != null) && !isLocalOrAnonymousClass(ci);
	}

	/**
	 * Append the package name prefix of the class represented by robj, if the name is not
	 * absolute. OW, remove leading "/".
	 */
	@MJI
	public int getResolvedName__Ljava_lang_String_2__Ljava_lang_String_2(MJIEnv env, int robj, int resRef, FeatureExpr ctx) {
		String rname = env.getStringObject(ctx, resRef);
		ClassInfo ci = env.getReferredClassInfo(ctx, robj);
		if (rname == null) {
			return MJIEnv.NULL;
		}
		if (!rname.startsWith("/")) {
			ClassInfo c = ci;
			while (c.isArray()) {
				c = c.getComponentClassInfo();
			}
			String baseName = c.getName();
			int index = baseName.lastIndexOf('.');
			if (index != -1) {
				rname = baseName.substring(0, index).replace('.', '/') + "/" + rname;
			}
		} else {
			rname = rname.substring(1);
		}

		return env.newString(ctx, rname);
	}
}
