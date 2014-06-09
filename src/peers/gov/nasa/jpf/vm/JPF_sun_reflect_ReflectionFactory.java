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

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
 * <2do> hack around a hack - we need to override this as long as we don't
 * replace ObjectStreamClass 
 */
public class JPF_sun_reflect_ReflectionFactory extends NativePeer {

  @MJI
  public int newConstructorForSerialization__Ljava_lang_Class_2Ljava_lang_reflect_Constructor_2__Ljava_lang_reflect_Constructor_2 (MJIEnv env, int objRef,
                                                                                                                                          int clsRef, int ctorRef){
    // NOPE - unnless I miss my guess, this creates an artificial
    // ctor for the concrete type that explicitly calls the default ctor of the
    // first non-serializable superclass. Oh my!

    // <2do> we really have to model ObjectStreamClass and ObjectStreamField
    ClassInfo ci = ClassInfo.getInitializedClassInfo("gov.nasa.jpf.SerializationConstructor", env.getThreadInfo());
    int sCtorRef = env.newObject(ci);
    
    env.setReferenceField(sCtorRef, "mdc", clsRef);
    env.setReferenceField(sCtorRef, "firstNonSerializableCtor", ctorRef);
    
    return sCtorRef;
  }
}
