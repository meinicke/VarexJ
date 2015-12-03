//
// Copyright (C) 2010 United States Government as represented by the
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

package gov.nasa.jpf.util;

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;

/**
 * this is a utility construct for type references that should
 * not cause class loading when instantiated, but cannot use a
 * classname String because of argument type ambiguity (Strings are just
 * used everywhere).
 * 
 * TypeRefs can be used to specify both native and JPF executed (SUT) classes,
 * it is up to the caller to use the proper access methods
 *
 * NOTE - loading and instantiation of TypeRefs is not allowed to cause loading of
 * any JPF classes that are not in jpf-classes.jar
 */
public class TypeRef {
  String clsName;

  public TypeRef (String clsName){
    this.clsName = clsName;
  }
  
  public Class<?> getNativeClass() throws ClassNotFoundException {
    return Class.forName(clsName);
  }

  /**
   * return the host VM class for this ref.
   * This will cause native on-demand class loading
   */
  public <T> Class<? extends T> asNativeSubclass(Class<T> superClazz) throws ClassNotFoundException, ClassCastException {
    Class<?> clazz = Class.forName(clsName);
    return clazz.asSubclass(superClazz);
  }

  /**
   * obtain the ClassInfo (JPF class) for this ref.
   * This will cause on-demand class loading by JPF
   */
  public ClassInfo getClassInfo (){
    return ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
  }
  
  public String toString(){
    return "TypeRef(" + clsName + ")";
  }
}
