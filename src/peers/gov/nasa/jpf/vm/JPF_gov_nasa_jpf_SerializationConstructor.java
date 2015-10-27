package gov.nasa.jpf.vm;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;


public class JPF_gov_nasa_jpf_SerializationConstructor extends NativePeer {

  /**
   * create a new instance, but only call the ctor of the first
   * non-serializable superclass
   */
  @MJI
  public int newInstance___3Ljava_lang_Object_2__Ljava_lang_Object_2 (MJIEnv env, int mthRef, int argsRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    DirectCallStackFrame frame = ti.getReturnedDirectCall();
    int superCtorRef = env.getReferenceField(ctx, mthRef, "firstNonSerializableCtor").getValue(); 
    MethodInfo miCtor = JPF_java_lang_reflect_Constructor.getMethodInfo(ctx,env, superCtorRef);

    if (frame == null){ // first time
      int clsRef = env.getReferenceField(ctx, mthRef, "mdc").getValue();
      ClassInfo ci = env.getReferredClassInfo( ctx, clsRef);

      if (ci.isAbstract()){
        env.throwException(ctx, "java.lang.InstantiationException");
        return MJIEnv.NULL;
      }

      int objRef = env.newObjectOfUncheckedClass(ctx, ci);
      frame = miCtor.createDirectCallStackFrame(ctx, ti, 1); 
      frame.setReferenceArgument( ctx, 0, objRef, null);
      frame.setLocalReferenceVariable(ctx, 0, objRef); // (1) we store the reference as a local var for retrieval during reexec      
      ti.pushFrame(frame);
      
      // check for & push required clinits
      ci.pushRequiredClinits(ctx, ti);
      env.repeatInvocation();
      return MJIEnv.NULL;
      
    } else { // re-execution, 
      int objRef = frame.getLocalVariable(ctx, 0).getValue(); // that's the object ref we stored in (1)
      return objRef;
    }
  }
}
