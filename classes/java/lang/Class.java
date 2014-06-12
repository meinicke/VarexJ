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
package java.lang;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import sun.reflect.ConstantPool;
import sun.reflect.annotation.AnnotationType;

/**
 * MJI model class for java.lang.Class library abstraction
 *
 * This is a JPF specific version of a system class because we can't use the real,
 * platform VM specific version (it's native all over the place, its field
 * structure isn't documented, most of its methods are private, hence we can't
 * even instantiate it properly).
 *
 * Note that this class never gets seen by the real VM - it's for JPF's eyes only.
 *
 * For now, it's only a fragment to test the mechanism, and provide basic
 * class.getName() / Class.ForName() support (which is (almost) enough for
 * Java assertion support
 */
@SuppressWarnings("unused")  // native peer uses
public final class Class<T> implements Serializable, GenericDeclaration, Type, AnnotatedElement {

  /** don't use serialVersionUID from JDK 1.1 for interoperability */
  private static final long serialVersionUID = 3206093459760846163L + 1;

   // we init this on demand (from MJIEnv) since it's not used too often
  private static Annotation[] emptyAnnotations; // = new Annotation[0];
  
  private String name;

  private ClassLoader classLoader;
  
  /**
   * search global id of the corresponding ClassInfo, which factors in the classloader
   */
  private int nativeId;

  /**
   * to be set during <clinit> of the corresponding class
   */
  private boolean isPrimitive;
  
  private Class() {}

  public native boolean isArray ();

  public native Annotation[] getAnnotations();

  public native <A extends Annotation> A getAnnotation( Class<A> annotationCls);

  // those are from Java 6
  public native boolean isAnnotation ();
  public native boolean isAnnotationPresent(Class<? extends Annotation> annotationClass);

  public native Class<?> getComponentType ();

  public native Field[] getFields() throws SecurityException;
  
  public native Field getDeclaredField (String fieldName) throws NoSuchFieldException,
                                                          SecurityException;

  public native Field[] getDeclaredFields () throws SecurityException;

  public native Method getDeclaredMethod (String mthName, Class<?>... paramTypes)
                            throws NoSuchMethodException, SecurityException;

  public native Method getMethod (String mthName, Class<?>... paramTypes)
                    throws NoSuchMethodException, SecurityException;

  public native Method[] getDeclaredMethods () throws SecurityException;

  public native Method[] getMethods () throws SecurityException;
    
  public native Constructor<?>[] getDeclaredConstructors() throws SecurityException;

  public native Constructor<?>[] getConstructors() throws SecurityException;

  private native byte[] getByteArrayFromResourceStream(String name);

  public InputStream getResourceAsStream (String name) {
    byte[] byteArray = getByteArrayFromResourceStream(name);
    if (byteArray == null) return null;
    return new ByteArrayInputStream(byteArray);
  }

  private native String getResolvedName (String rname);

  public URL getResource (String rname) {
    String resolvedName = getResolvedName(rname);
    return getClassLoader().getResource(resolvedName);
  }

  public Package getPackage() {
    // very very crude version for now, only supports the package name
    String pkgName = null;

    int idx = name.lastIndexOf('.');
    if (idx >=0){
      pkgName = name.substring(0,idx);

      Package pkg = new Package(pkgName,
                                "spectitle", "specversion", "specvendor",
                                "impltitle", "implversion", "implvendor",
                                 null, getClassLoader());
        return pkg;

    } else { // weird, but there is no Package object for the default package
      return null;
    }

  }

  //--- enum support ()
  // Java 1.5
  public native T[] getEnumConstants();

  // Java 6
  T[] getEnumConstantsShared() {
    return getEnumConstants();
  }
  
  // lazy initialized map for field name -> Enum constants
  // <2do> we should move this to the native side, since Enum constants don't change
  private transient Map<String, T> enumConstantDirectory = null;

  // package private helper for Enum.valueOf()
  Map<String,T> enumConstantDirectory() {
    if (enumConstantDirectory == null) {
      Map<String,T> map = new HashMap<String,T>();

      T[] ae = getEnumConstants();
      for (T e: ae) {
        map.put(((Enum)e).name(), e);
      }

      enumConstantDirectory = map;
    }
    return enumConstantDirectory;
  }


  public native Constructor<T> getDeclaredConstructor (Class<?>... paramTypes)
              throws NoSuchMethodException, SecurityException;

  public native Field getField (String fieldName) throws NoSuchFieldException,
                                                  SecurityException;

  public native boolean isInstance (Object o);

  public native boolean isAssignableFrom (Class<?> clazz);

  public native boolean isInterface();

  public native Constructor<T> getConstructor (Class<?>... argTypes) throws NoSuchMethodException, SecurityException;

  public native int getModifiers();

  public native Class<?>[] getInterfaces();

  // no use to have a ctor, we can't call it
  public String getName () {
    return name;
  }

  public String getSimpleName () {
    int idx; // <2do> not really - inner classes?
    Class<?> enclosingClass = getEnclosingClass();
    
    if(enclosingClass!=null){
      idx = enclosingClass.getName().length();
    } else{
      idx = name.lastIndexOf('.');
    }
    
    return name.substring(idx+1);
  }

  static native Class<?> getPrimitiveClass (String clsName);

   /**
    * this one is in JPF reflection land, it's 'native' for us
    */
  public static native Class<?> forName (String clsName) throws ClassNotFoundException;

  public static Class<?> forName (String clsName, boolean initialize, ClassLoader loader) throws ClassNotFoundException {
    Class<?> cls;
    if (loader == null){
      cls = forName(clsName);
    } else {
      cls = loader.loadClass(clsName);
    }
    
    if (initialize) {
      cls.initialize0();
    }
    return cls;
  }

  /**
   * forces clinit without explicit field or method access
   */
  private native void initialize0 ();
  
  public boolean isPrimitive () {
    return isPrimitive;
  }

  public native Class<? super T> getSuperclass ();

  public native T newInstance () throws InstantiationException,
                                      IllegalAccessException;

  public String toString () {
    return (isInterface() ? "interface " : "class ") + name;
  }

  @SuppressWarnings("unchecked")
  public T cast(Object o) {
    if (o != null && !isInstance(o)) throw new ClassCastException();
    return (T) o;
  }
  
  @SuppressWarnings("unchecked")
  public <U> Class<? extends U> asSubclass(Class<U> clazz) {
    if (clazz.isAssignableFrom(this)) {
      return (Class<? extends U>) this;
    } else {
      throw new ClassCastException("" + this + " is not a " + clazz);
    }
  }

  native public boolean desiredAssertionStatus ();

  public ClassLoader getClassLoader() {
    return classLoader;
  }

  native ConstantPool getConstantPool();

  native void setAnnotationType (AnnotationType at);

  native AnnotationType getAnnotationType();
  
  public TypeVariable<Class<T>>[] getTypeParameters() {
    throw new UnsupportedOperationException();
  }
  
  public Type getGenericSuperclass() {
    throw new UnsupportedOperationException();
  }
  
  public Type[] getGenericInterfaces() {
    throw new UnsupportedOperationException();
  }

  public Object[] getSigners() {
    throw new UnsupportedOperationException();
  }

  void setSigners(Object[] signers) {
    signers = null;  // Get rid of IDE warning 
    throw new UnsupportedOperationException();
  }
  
  public Method getEnclosingMethod() {
    throw new UnsupportedOperationException();
  }

  public Constructor<?> getEnclosingConstructor() {
    throw new UnsupportedOperationException();
  }

  public Class<?> getDeclaringClass() {
    throw new UnsupportedOperationException();
  }

  public native Class<?> getEnclosingClass();
  
  public String getCanonicalName() {
    throw new UnsupportedOperationException();
  }

  public boolean isAnonymousClass() {
    throw new UnsupportedOperationException();
  }

  public boolean isLocalClass() {
    throw new UnsupportedOperationException();
  }

  public boolean isMemberClass() {
    throw new UnsupportedOperationException();
  }

  public Class<?>[] getClasses() {
    throw new UnsupportedOperationException();
  }
  
  public Class<?>[] getDeclaredClasses() throws SecurityException {
    throw new UnsupportedOperationException();
  }
  
  public java.security.ProtectionDomain getProtectionDomain() {
    throw new UnsupportedOperationException();
  }

  void setProtectionDomain0(java.security.ProtectionDomain pd) {
    pd = null;  // Get rid of IDE warning 
    throw new UnsupportedOperationException();
  }

  public boolean isEnum() {
    throw new UnsupportedOperationException();
  }
  
  public Annotation[] getDeclaredAnnotations() {
    throw new UnsupportedOperationException();
  }

  public boolean isSynthetic (){
    final int SYNTHETIC = 0x00001000;
    return (getModifiers() & SYNTHETIC) != 0;
  }
}
