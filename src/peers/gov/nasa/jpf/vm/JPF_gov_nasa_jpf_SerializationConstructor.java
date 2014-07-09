package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;


public class JPF_gov_nasa_jpf_SerializationConstructor extends NativePeer {

  /**
   * create a new instance, but only call the ctor of the first
   * non-serializable superclass
   */
  @MJI
  public int newInstance___3Ljava_lang_Object_2__Ljava_lang_Object_2 (MJIEnv env, int mthRef, int argsRef) {
    ThreadInfo ti = env.getThreadInfo();
    DirectCallStackFrame frame = ti.getReturnedDirectCall();
    
    int superCtorRef = env.getReferenceField(mthRef, "firstNonSerializableCtor"); 
    MethodInfo miCtor = JPF_java_lang_reflect_Constructor.getMethodInfo(env,superCtorRef);

    if (frame == null){ // first time
      int clsRef = env.getReferenceField(mthRef, "mdc");
      ClassInfo ci = env.getReferredClassInfo( clsRef);

      if (ci.isAbstract()){
        env.throwException("java.lang.InstantiationException");
        return MJIEnv.NULL;
      }

      int objRef = env.newObjectOfUncheckedClass(ci);
      frame = miCtor.createDirectCallStackFrame(ti, 1); 
      frame.setReferenceArgument( 0, objRef, null);
      frame.setLocalReferenceVariable(NativeMethodInfo.CTX, 0, objRef); // (1) we store the reference as a local var for retrieval during reexec      
      ti.pushFrame(NativeMethodInfo.CTX, frame, false);
      
      // check for & push required clinits
      ci.pushRequiredClinits(ti);
      env.repeatInvocation();
      return MJIEnv.NULL;
      
    } else { // re-execution, 
      int objRef = frame.getLocalVariable(NativeMethodInfo.CTX, 0).getValue(); // that's the object ref we stored in (1)
      return objRef;
    }
  }
}
