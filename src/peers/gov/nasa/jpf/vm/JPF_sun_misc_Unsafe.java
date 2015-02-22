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

import gov.nasa.jpf.annotation.MJI;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * we don't want this class! This is a hodgepodge of stuff that shouldn't be in Java, but
 * is handy for some hacks. The reason we have it here - very rudimentary - is that
 * java.util.concurrent makes use of the atomic compare&swap which is in it.
 * The choice was to duplicate a lot of relatively difficult code in the "right" class
 * (java.util.concurrent.locks.AbstractQueuedSynchronizer) or a small amount of straight forward
 * code in the "wrong" class (sun.misc.Unsafe). Knowing a bit about the "library chase" game,
 * we opt for the latter
 *
 * <2do> this might change with better modeling of high level java.util.concurrent constructs
 */
public class JPF_sun_misc_Unsafe extends NativePeer {

  @MJI
  public int getUnsafe____Lsun_misc_Unsafe_2 (MJIEnv env, int clsRef, FeatureExpr ctx) {
    int objRef = env.getStaticReferenceField("sun.misc.Unsafe", "theUnsafe");
    return objRef;
  }

  @MJI
  public long objectFieldOffset__Ljava_lang_reflect_Field_2__J (MJIEnv env, int unsafeRef, int fieldRef, FeatureExpr ctx) {
    return fieldOffset__Ljava_lang_reflect_Field_2__I(env, unsafeRef, fieldRef, ctx);
  }

  /**
   * we don't really return an offset here, since that would be useless. What we really want is
   * to identify the corresponding FieldInfo, and that's much easier done with the Field
   * registration id
   */
  @MJI
  public int fieldOffset__Ljava_lang_reflect_Field_2__I (MJIEnv env, int unsafeRef, int fieldRef, FeatureExpr ctx) {
    //FieldInfo fi = JPF_java_lang_reflect_Field.getFieldInfo(env, fieldRef);
    //return fi.getStorageOffset();
    return env.getIntField(fieldRef, "regIdx").simplify(ctx).getValue().intValue();
  }

  @MJI
  public boolean compareAndSwapObject__Ljava_lang_Object_2JLjava_lang_Object_2Ljava_lang_Object_2__Z (MJIEnv env, int unsafeRef,
                                                                                                             int objRef, long fieldOffset,
                                                                                                             int expectRef, int updateRef, FeatureExpr ctx) {
    int actual = getObject__Ljava_lang_Object_2J__Ljava_lang_Object_2(env, unsafeRef, objRef, fieldOffset, ctx);
    if (actual == expectRef) {
      putObject__Ljava_lang_Object_2JLjava_lang_Object_2__V(env, unsafeRef, objRef, fieldOffset, updateRef, ctx);
      return true;
    }
    return false;
  }

  @MJI
  public boolean compareAndSwapInt__Ljava_lang_Object_2JII__Z (MJIEnv env, int unsafeRef,
                                                                      int objRef, long fieldOffset, int expect, int update, FeatureExpr ctx) {
    int actual = getInt__Ljava_lang_Object_2J__I(env, unsafeRef, objRef, fieldOffset, ctx);
    if (actual == expect) {
      putInt__Ljava_lang_Object_2JI__V(env, unsafeRef, objRef, fieldOffset, update, ctx);
      return true;
    }
    return false;
  }

  @MJI
  public boolean compareAndSwapLong__Ljava_lang_Object_2JJJ__Z (MJIEnv env, int unsafeRef,
                                                                       int objRef, long fieldOffset, long expect, long update, FeatureExpr ctx) {
    long actual = getLong__Ljava_lang_Object_2J__J(env, unsafeRef, objRef, fieldOffset, ctx);
    if (actual == expect) {
      putLong__Ljava_lang_Object_2JJ__V(env, unsafeRef, objRef, fieldOffset, update, ctx);
      return true;
    }
    return false;
  }


  // this is a specialized, native wait that does not require a lock, and that can
  // be turned off by a preceding unpark() call (which is not accumulative)
  // park can be interrupted, but it doesn't throw an InterruptedException, and it doesn't clear the status
  // it can only be called from the current (parking) thread
  @MJI
  public void park__ZJ__V (MJIEnv env, int unsafeRef, boolean isAbsoluteTime, long timeout, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    int objRef = ti.getThreadObjectRef();
    
    int permitRef = env.getReferenceField( ctx, objRef, "permit").getValue();
    ElementInfo ei = env.getModifiableElementInfo(permitRef);

    if (ti.isFirstStepInsn()){ // re-executed

      //assert ti.getLockObject() == null : "private 'permit' object locked";

      // notified | timedout | interrupted -> running
      switch (ti.getState()) {
        case NOTIFIED:
        case TIMEDOUT:
        case INTERRUPTED:
          ti.resetLockRef();
          ti.setRunning();
          break;
        default:
          // nothing
      }

    } else { // first time

      if (ti.isInterrupted(ctx, false)) {
        // there is no lock, so we go directly back to running and therefore
        // have to remove ourself from the contender list
        ei.setMonitorWithoutLocked(ti);
        
        // note that park() does not throw an InterruptedException
        return;
      }

      if (ei.getBooleanField("blockPark").getValue()) { // we have to wait, but don't need a lock

        // running -> waiting | timeout_waiting
        ei.wait(ti, timeout, false);

        assert ti.isWaiting();

        // note we pass in the timeout value, since this might determine the type of CG that is created
        ChoiceGenerator<?> cg = env.getSchedulerFactory().createParkCG(ei, ti, isAbsoluteTime, timeout);
        env.setMandatoryNextChoiceGenerator(cg, "no CG on blocking park()");
        env.repeatInvocation();
  
      } else {
        ei.setBooleanField(ctx, "blockPark", new One<>(true)); // next time
      }
    }
  }

  @MJI
  public void unpark__Ljava_lang_Object_2__V (MJIEnv env, int unsafeRef, int objRef, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
    
    if (!ti.isFirstStepInsn()){
      
      ThreadInfo tiParked = env.getThreadInfoForObjRef(objRef);    
      if (tiParked == null || tiParked.isTerminated()){
        return;
      }      
      
      SystemState ss = env.getSystemState();
      
      int permitRef = env.getReferenceField( ctx, objRef, "permit").getValue();
      ElementInfo eiPermit = env.getModifiableElementInfo(permitRef);

      if (tiParked.getLockObject() == eiPermit){
        // note that 'permit' is only used in park/unpark, so there never is more than
        // one waiter, which immediately becomes runnable again because it doesn't hold a lock
        // (park is a lockfree wait). unpark() therefore has to be a right mover
        // and we have to register a ThreadCG here
        eiPermit.notifies(ss, ti, false);
        
        ChoiceGenerator<?> cg = env.getSchedulerFactory().createUnparkCG(tiParked);
        if (cg != null){
          ss.setNextChoiceGenerator(cg);
          env.repeatInvocation();
        }
        
      } else {
        eiPermit.setBooleanField(ctx, "blockPark", new One<>(false));
      }      
    }
  }

  @MJI
  public void ensureClassInitialized__Ljava_lang_Class_2__V (MJIEnv env, int unsafeRef, int clsObjRef, FeatureExpr ctx) {
    // <2do> not sure if we have to do anyting here - if we have a class object, the class should already
    // be initialized
  }

  @MJI
  public int getObject__Ljava_lang_Object_2J__Ljava_lang_Object_2 (MJIEnv env, int unsafeRef,
                                                                          int objRef, long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getReferenceField(fi).simplify(ctx).getValue();
    } else {
      return ei.getReferenceElement((int)fieldOffset).simplify(ctx).getValue();
    }
  }
  
  @MJI
  public int getObjectVolatile__Ljava_lang_Object_2J__Ljava_lang_Object_2 (MJIEnv env, int unsafeRef,
      int objRef, long fieldOffset, FeatureExpr ctx) {
    return getObject__Ljava_lang_Object_2J__Ljava_lang_Object_2( env, unsafeRef, objRef, fieldOffset, ctx);
  }  

  @MJI
  public void putObject__Ljava_lang_Object_2JLjava_lang_Object_2__V (MJIEnv env, int unsafeRef,
                                                                            int objRef, long fieldOffset, int valRef, FeatureExpr ctx) {
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setReferenceField(ctx, fi, new One<>(valRef));
    } else {
      ei.setReferenceElement(ctx, (int)fieldOffset, new One<>(valRef));
    }
  }
  
  @MJI
  public void putObjectVolatile__Ljava_lang_Object_2JLjava_lang_Object_2__V (MJIEnv env, int unsafeRef,
      int objRef, long fieldOffset, int valRef, FeatureExpr ctx) {
    putObject__Ljava_lang_Object_2JLjava_lang_Object_2__V( env, unsafeRef, objRef, fieldOffset, valRef, ctx);
  }

  @MJI
  public void putOrderedObject__Ljava_lang_Object_2JLjava_lang_Object_2__V(
                                                                                  MJIEnv env,
                                                                                  int unsafeRef,
                                                                                  int objRef,
                                                                                  long fieldOffset,
                                                                                  int valRef, FeatureExpr ctx) {
    putObject__Ljava_lang_Object_2JLjava_lang_Object_2__V(env, unsafeRef, objRef, fieldOffset, valRef, ctx);
  }
  
  @MJI
  public boolean getBoolean__Ljava_lang_Object_2J__Z(MJIEnv env,
                                                            int unsafeRef,
                                                            int objRef,
                                                            long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getBooleanField(fi).getValue();
    } else {
      return ei.getBooleanElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public boolean getBooleanVolatile__Ljava_lang_Object_2J__Z(MJIEnv env, int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getBoolean__Ljava_lang_Object_2J__Z( env, unsafeRef, objRef, fieldOffset, ctx);
  }
  
  @MJI
  public void putBoolean__Ljava_lang_Object_2JZ__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, boolean val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setBooleanField(ctx, fi, new One<>(val));
    } else {
      ei.setBooleanElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putBooleanVolatile__Ljava_lang_Object_2JZ__V (MJIEnv env, int unsafeRef, int objRef, long fieldOffset, boolean val, FeatureExpr ctx){
    putBoolean__Ljava_lang_Object_2JZ__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }

  @MJI
  public byte getByte__Ljava_lang_Object_2J__B(MJIEnv env,
                                                      int unsafeRef,
                                                      int objRef,
                                                      long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getByteField(fi).getValue();
    } else {
      return ei.getByteElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public byte getByteVolatile__Ljava_lang_Object_2J__B(MJIEnv env,int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getByte__Ljava_lang_Object_2J__B(env, unsafeRef, objRef, fieldOffset, ctx);
  }

  @MJI
  public void putByte__Ljava_lang_Object_2JB__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, byte val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setByteField(ctx, fi, new One<>(val));
    } else {
      ei.setByteElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putByteVolatile__Ljava_lang_Object_2JB__V (MJIEnv env, int unsafeRef,int objRef, long fieldOffset, byte val, FeatureExpr ctx){
    putByte__Ljava_lang_Object_2JB__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }

	@MJI
	public char getChar__Ljava_lang_Object_2J__C(MJIEnv env, int unsafeRef, int objRef, long fieldOffset, FeatureExpr ctx) {
		ElementInfo ei = env.getElementInfo(objRef);
		if (!ei.isArray()) {
			FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
			return ei.getCharField(fi).getValue();
		} else {
			return ei.getCharElement((int) fieldOffset).getValue();
		}
	}

  @MJI
  public char getCharVolatile__Ljava_lang_Object_2J__C(MJIEnv env,int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getChar__Ljava_lang_Object_2J__C( env, unsafeRef, objRef, fieldOffset, ctx);
  }
  
  @MJI
  public void putChar__Ljava_lang_Object_2JC__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, char val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setCharField(ctx, fi, new One<>(val));
    } else {
      ei.setCharElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putCharVolatile__Ljava_lang_Object_2JC__V (MJIEnv env, int unsafeRef,int objRef, long fieldOffset, char val, FeatureExpr ctx){
    putChar__Ljava_lang_Object_2JC__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }
  
  @MJI
  public short getShort__Ljava_lang_Object_2J__S(MJIEnv env,
                                                        int unsafeRef,
                                                        int objRef,
                                                        long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getShortField(fi).getValue();
    } else {
      return ei.getShortElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public short getShortVolatile__Ljava_lang_Object_2J__S(MJIEnv env,int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getShort__Ljava_lang_Object_2J__S( env, unsafeRef, objRef, fieldOffset, ctx);
  }
  
  @MJI
  public void putShort__Ljava_lang_Object_2JS__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, short val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setShortField(ctx, fi, new One<>(val));
    } else {
      ei.setShortElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putShortVolatile__Ljava_lang_Object_2JS__V (MJIEnv env, int unsafeRef,int objRef, long fieldOffset, short val, FeatureExpr ctx){
    putShort__Ljava_lang_Object_2JS__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }  

  @MJI
  public int getInt__Ljava_lang_Object_2J__I(MJIEnv env, int unsafeRef,
                                                    int objRef, long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getIntField(fi).simplify(ctx).getValue();
    } else {
      return ei.getIntElement((int)fieldOffset).simplify(ctx).getValue();
    }
  }

  @MJI
  public int getIntVolatile__Ljava_lang_Object_2J__I(MJIEnv env, int unsafeRef, int objRef, long fieldOffset, FeatureExpr ctx) {
    return getInt__Ljava_lang_Object_2J__I( env, unsafeRef, objRef, fieldOffset, ctx);
  }
  
  @MJI
  public void putInt__Ljava_lang_Object_2JI__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, int val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setIntField(ctx, fi, new One<>(val));
    } else {
      ei.setIntElement(null, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putIntVolatile__Ljava_lang_Object_2JI__V (MJIEnv env, int unsafeRef, int objRef, long fieldOffset, int val, FeatureExpr ctx){
    putInt__Ljava_lang_Object_2JI__V(env, unsafeRef, objRef, fieldOffset, val, ctx);
  }  

  @MJI
  public void putOrderedInt__Ljava_lang_Object_2JI__V(MJIEnv env,
                                                             int unsafeRef,
                                                             int objRef,
                                                             long fieldOffset,
                                                             int val, FeatureExpr ctx) {
    // volatile?
    putInt__Ljava_lang_Object_2JI__V(env, unsafeRef, objRef, fieldOffset, val, ctx);
  }

  @MJI
  public float getFloat__Ljava_lang_Object_2J__F(MJIEnv env,
                                                        int unsafeRef,
                                                        int objRef,
                                                        long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getFloatField(fi).getValue();
    } else {
      return ei.getFloatElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public float getFloatVolatile__Ljava_lang_Object_2J__F(MJIEnv env,int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getFloat__Ljava_lang_Object_2J__F( env, unsafeRef, objRef, fieldOffset, ctx);
  }  

  @MJI
  public void putFloat__Ljava_lang_Object_2JF__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, float val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setFloatField(ctx, fi, new One<>(val));
    } else {
      ei.setFloatElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putFloatVolatile__Ljava_lang_Object_2JF__V (MJIEnv env, int unsafeRef,int objRef, long fieldOffset, float val, FeatureExpr ctx){
    putFloat__Ljava_lang_Object_2JF__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }  

  @MJI
  public long getLong__Ljava_lang_Object_2J__J(MJIEnv env,
                                                      int unsafeRef,
                                                      int objRef,
                                                      long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getLongField(fi).getValue();
    } else {
      return ei.getLongElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public long getLongVolatile__Ljava_lang_Object_2J__J(MJIEnv env, int unsafeRef, int objRef, long fieldOffset, FeatureExpr ctx) {
    return getLong__Ljava_lang_Object_2J__J( env, unsafeRef, objRef, fieldOffset, ctx);
  }

  @MJI
  public void putLong__Ljava_lang_Object_2JJ__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, long val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setLongField(ctx, fi, new One<>(val));
    } else {
      ei.setLongElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putLongVolatile__Ljava_lang_Object_2JJ__V (MJIEnv env, int unsafeRef, int objRef, long fieldOffset, long val, FeatureExpr ctx){
    putLong__Ljava_lang_Object_2JJ__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }  

  @MJI
  public void putOrderedLong__Ljava_lang_Object_2JJ__V (MJIEnv env, int unsafeRef,
                                                        int objRef, long fieldOffset, long val, FeatureExpr ctx) {
    putLong__Ljava_lang_Object_2JJ__V(env, unsafeRef, objRef, fieldOffset, val, ctx);
  }

  @MJI
  public double getDouble__Ljava_lang_Object_2J__D(MJIEnv env,
                                                         int unsafeRef,
                                                         int objRef,
                                                         long fieldOffset, FeatureExpr ctx) {
    ElementInfo ei = env.getElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      return ei.getDoubleField(fi).getValue();
    } else {
      return ei.getDoubleElement((int)fieldOffset).getValue();
    }
  }

  @MJI
  public double getDoubleVolatile__Ljava_lang_Object_2J__D(MJIEnv env,int unsafeRef,int objRef,long fieldOffset, FeatureExpr ctx) {
    return getDouble__Ljava_lang_Object_2J__D( env, unsafeRef, objRef, fieldOffset, ctx);
  }
  
  @MJI
  public void putDouble__Ljava_lang_Object_2JD__V (MJIEnv env, int unsafeRef,
                                                       int objRef, long fieldOffset, double val, FeatureExpr ctx){
    ElementInfo ei = env.getModifiableElementInfo(objRef);
    if (!ei.isArray()) {
      FieldInfo fi = getRegisteredFieldInfo(fieldOffset);
      ei.setDoubleField(ctx, fi, new One<>(val));
    } else {
      ei.setDoubleElement(ctx, (int)fieldOffset, new One<>(val));
    }
  }

  @MJI
  public void putDoubleVolatile__Ljava_lang_Object_2JD__V (MJIEnv env, int unsafeRef, int objRef, long fieldOffset, double val, FeatureExpr ctx){
    putDouble__Ljava_lang_Object_2JD__V( env, unsafeRef, objRef, fieldOffset, val, ctx);
  }
  
  @MJI
  public int arrayBaseOffset__Ljava_lang_Class_2__I (MJIEnv env, int unsafeRef, int clazz, FeatureExpr ctx) {
    return 0;
  }

  @MJI
  public int arrayIndexScale__Ljava_lang_Class_2__I (MJIEnv env, int unsafeRef, int clazz, FeatureExpr ctx) {
    return 1;
  }

  private static FieldInfo getRegisteredFieldInfo(long fieldOffset) {
    return JPF_java_lang_reflect_Field.getRegisteredFieldInfo((int)fieldOffset);
  }

  
  //--- the explicit memory buffer allocation/free + access methods - evil pointer arithmetic

  /*
   * we shy away from maintaining our own address table by means of knowing that
   * the byte[] object stored in the ArrayFields will not be recycled, and hashCode() will
   * return its address, so the start/endAdr pairs we get from that have to be
   * non-overlapping. Of course that falls apart if  hashCode() would do something
   * different, which is the case for any address that exceeds 32bit
   */
  
  static class Alloc {
    int objRef;
    
    int startAdr;
    int endAdr;
    
    Alloc next;
    
    Alloc (MJIEnv env, int baRef, long length){
      this.objRef = baRef;

      ElementInfo ei = env.getElementInfo(baRef);
      ArrayFields afi = (ArrayFields) ei.getFields();
      Conditional<Byte>[] mem = afi.asByteArray();

      startAdr = mem.hashCode();
      endAdr = startAdr + (int)length -1;
    }
    
    public String toString(){
      return String.format("Alloc[objRef=%x,startAdr=%x,endAdr=%x]", objRef, startAdr, endAdr);
    }
  }
  
  Alloc firstAlloc;
  
  // for debugging purposes only
  private void dumpAllocs(){
    System.out.println("Unsafe allocated memory blocks:{");
    for (Alloc a = firstAlloc; a != null; a = a.next){
      System.out.print("  ");
      System.out.println(a);
    }
    System.out.println('}');
  }
  
  private void sortInAlloc(Alloc newAlloc){
    int startAdr = newAlloc.startAdr;
    
    if (firstAlloc == null){
      firstAlloc = newAlloc;
      
    } else {
      Alloc prev = null;
      for (Alloc a = firstAlloc; a != null; prev = a, a = a.next){
        if (startAdr < a.startAdr){
          newAlloc.next = a;
          if (prev == null){
            firstAlloc = newAlloc;
          } else {
            prev.next = newAlloc;
          }
        }
      }
    }
  }
  
  private Alloc getAlloc (int address){
    for (Alloc a = firstAlloc; a != null; a = a.next){
      if (address >= a.startAdr && address <= a.endAdr){
        return a;
      }
    }
    
    return null;
  }
  
  private Alloc removeAlloc (int startAddress){
    Alloc prev = null;
    for (Alloc a = firstAlloc; a != null; prev = a, a = a.next) {
      if (a.startAdr == startAddress){
        if (prev == null){
          firstAlloc = a.next;
        } else {
          prev.next = a.next;
        }
        
        return a;
      }
    }
    
    return null;
  }
  
  @MJI
  public long allocateMemory__J__J (MJIEnv env, int unsafeRef, long nBytes, FeatureExpr ctx) {
    if (nBytes < 0 || nBytes > Integer.MAX_VALUE) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory block size: " + nBytes);
      return 0;
    }
    
    // <2do> we should probably also throw OutOfMemoryErrors on configured thresholds 
    
    int baRef = env.newByteArray((int) nBytes);
    // the corresponding objects have to be freed explicitly
    env.registerPinDown(baRef);
    
    Alloc alloc = new Alloc(env, baRef, nBytes);
    sortInAlloc(alloc);
    
    return alloc.startAdr;
  }
  
  @MJI
  public void freeMemory__J__V (MJIEnv env, int unsafeRef, long startAddress, FeatureExpr ctx) {
    int addr = (int)startAddress;

    if (startAddress != MJIEnv.NULL){
      Alloc a = removeAlloc(addr);
      if (a == null){
        env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      } else {
        env.releasePinDown(a.objRef);
      }
    }
  }
  
  @MJI
  public byte getByte__J__B (MJIEnv env, int unsafeRef, long address, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return 0;
    }
    
    ElementInfo ei = env.getElementInfo(a.objRef);
    return ei.getByteElement(addr - a.startAdr).getValue();
  }

  @MJI
  public void putByte__JB__V (MJIEnv env, int unsafeRef, long address, byte val, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return;
    }
    
    ElementInfo ei = env.getModifiableElementInfo(a.objRef);
    ei.setByteElement(ctx, addr - a.startAdr, new One<>(val));
  }
  
  @MJI
  public char getChar__J__C (MJIEnv env, int unsafeRef, long address, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return 0;
    }
    
    ElementInfo ei = env.getElementInfo(a.objRef);
    Conditional<Byte>[] ba = ei.asByteArray();
    
    byte b0 = ba[addr].getValue();
    byte b1 = ba[addr+1].getValue();
    
    char val;
    if (env.isBigEndianPlatform()){
      val = (char) ((b0 << 8) | b1);
    } else {
      val = (char) ((b1 << 8) | b0);      
    }
    
    return val;
  }

  @MJI
  public void putChar__JC__V (MJIEnv env, int unsafeRef, long address, char val, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return;
    }
        
    byte b1 = (byte)(0xff & val);
    byte b0 = (byte)(0xff & (val >>> 8));
    
    ElementInfo ei = env.getModifiableElementInfo(a.objRef);

    if (env.isBigEndianPlatform()){
      ei.setByteElement(ctx,   addr, new One<>(b0));
      ei.setByteElement(ctx, addr+1, new One<>(b1));
    } else {
      ei.setByteElement(ctx,   addr, new One<>(b1));
      ei.setByteElement(ctx, addr+1, new One<>(b0));      
    }
  }

  @MJI
  public int getInt__J__I (MJIEnv env, int unsafeRef, long address, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return 0;
    }
    
    ElementInfo ei = env.getElementInfo(a.objRef);
    Conditional<Byte>[] ba = ei.asByteArray();
    
    byte b0 = ba[addr].getValue();
    byte b1 = ba[addr+1].getValue();
    byte b2 = ba[addr+2].getValue();
    byte b3 = ba[addr+3].getValue();
    
    int val;
    if (env.isBigEndianPlatform()){
      val = b0;
      val = (val << 8) | b1;
      val = (val << 8) | b2;
      val = (val << 8) | b3;

    } else {
      val = b3;
      val = (val << 8) | b2;
      val = (val << 8) | b1;
      val = (val << 8) | b0;
    }
    
    return val;
  }

  @MJI
  public void putInt__JI__V (MJIEnv env, int unsafeRef, long address, int val, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return;
    }
        
    byte b3 = (byte)(0xff & val);
    byte b2 = (byte)(0xff & (val >>> 8));
    byte b1 = (byte)(0xff & (val >>> 16));
    byte b0 = (byte)(0xff & (val >>> 24));    
    
    ElementInfo ei = env.getModifiableElementInfo(a.objRef);

    if (env.isBigEndianPlatform()){
      ei.setByteElement(ctx,   addr, new One<>(b0));
      ei.setByteElement(ctx, addr+1, new One<>(b1));
      ei.setByteElement(ctx, addr+2, new One<>(b2));
      ei.setByteElement(ctx, addr+3, new One<>(b3));
    } else {
      ei.setByteElement(ctx,   addr, new One<>(b3));
      ei.setByteElement(ctx, addr+1, new One<>(b2));
      ei.setByteElement(ctx, addr+2, new One<>(b1));
      ei.setByteElement(ctx, addr+3, new One<>(b0));
    }
  }

  @MJI
  public long getLong__J__J (MJIEnv env, int unsafeRef, long address, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return 0;
    }
    
    ElementInfo ei = env.getElementInfo(a.objRef);
    Conditional<Byte>[] ba = ei.asByteArray();
    int offset = addr - a.startAdr;
    
    byte b0 = ba[offset].getValue();
    byte b1 = ba[offset+1].getValue();
    byte b2 = ba[offset+2].getValue();
    byte b3 = ba[offset+3].getValue();
    byte b4 = ba[offset+4].getValue();
    byte b5 = ba[offset+5].getValue();
    byte b6 = ba[offset+6].getValue();
    byte b7 = ba[offset+7].getValue();
    
    int val;
    if (env.isBigEndianPlatform()){
      val = b0;
      val = (val << 8) | b1;
      val = (val << 8) | b2;
      val = (val << 8) | b3;
      val = (val << 8) | b4;
      val = (val << 8) | b5;
      val = (val << 8) | b6;
      val = (val << 8) | b7;

    } else {
      val = b7;
      val = (val << 8) | b6;
      val = (val << 8) | b5;
      val = (val << 8) | b4;
      val = (val << 8) | b3;
      val = (val << 8) | b2;
      val = (val << 8) | b1;
      val = (val << 8) | b0;
    }
    
    return val;
  }

  @MJI
  public void putLong__JJ__V (MJIEnv env, int unsafeRef, long address, long val, FeatureExpr ctx) {
    int addr = (int)address;
    Alloc a = getAlloc(addr);
    
    if (a == null) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "invalid memory address: " + Integer.toHexString(addr));
      return;
    }
        
    byte b7 = (byte)(0xff & val);
    byte b6 = (byte)(0xff & (val >>> 8));
    byte b5 = (byte)(0xff & (val >>> 16));
    byte b4 = (byte)(0xff & (val >>> 24));    
    byte b3 = (byte)(0xff & (val >>> 32));    
    byte b2 = (byte)(0xff & (val >>> 40));    
    byte b1 = (byte)(0xff & (val >>> 48));    
    byte b0 = (byte)(0xff & (val >>> 56));    

    ElementInfo ei = env.getModifiableElementInfo(a.objRef);
    int offset = addr - a.startAdr;
    
    if (env.isBigEndianPlatform()){
      ei.setByteElement(ctx,   offset, new One<>(b0));
      ei.setByteElement(ctx, offset+1, new One<>(b1));
      ei.setByteElement(ctx, offset+2, new One<>(b2));
      ei.setByteElement(ctx, offset+3, new One<>(b3));
      ei.setByteElement(ctx, offset+4, new One<>(b4));
      ei.setByteElement(ctx, offset+5, new One<>(b5));
      ei.setByteElement(ctx, offset+6, new One<>(b6));
      ei.setByteElement(ctx, offset+7, new One<>(b7));
    } else {
      ei.setByteElement(ctx,   offset, new One<>(b7));
      ei.setByteElement(ctx, offset+1, new One<>(b6));
      ei.setByteElement(ctx, offset+2, new One<>(b5));
      ei.setByteElement(ctx, offset+3, new One<>(b4));
      ei.setByteElement(ctx, offset+4, new One<>(b3));
      ei.setByteElement(ctx, offset+5, new One<>(b2));
      ei.setByteElement(ctx, offset+6, new One<>(b1));
      ei.setByteElement(ctx, offset+7, new One<>(b0));
    }
  }

}

