//
// Copyright (C) 2012 United States Government as represented by the
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

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.ProtectionDomain;
import java.util.Enumeration;
import java.util.Vector;

import sun.misc.CompoundEnumeration;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 *  Model class for java.lang.ClassLoader
 */
public abstract class ClassLoader {
  
  private ClassLoader parent;

  // This is JPF internal identifier which set to the globalId of the classLoader
  private int nativeId;

  //--- internals

  protected ClassLoader() {
    // constructed on the native side
  }

  protected ClassLoader (ClassLoader parent){
    // constructed on the native side
  }

  private native String getResource0 (String rname);

  public URL getResource(String name) {
    URL url = null;

    if(parent == null) {
      String resourcePath = getSystemClassLoader().getResource0(name);
      try {
        url = new URL(resourcePath);
      } catch (MalformedURLException x){
        url = null;
      }
    } else {
      url = parent.getResource(name);
    }

    if (url == null) {
      url = findResource(name);
    }
    return url;
  }

  /**
   * Finds the resource with the given name. Class loader implementations
   * should override this method to specify where to find resources.
   */
  protected URL findResource(String name) {
      return null;
  }

  private native String[] getResources0 (String rname);

  /**
   * Returns an array of URL including all resources with the given name 
   * found in the classpath of this classloader.
   */
  private Enumeration<URL> getResourcesURL(String name) {
    String[] urls = getResources0(name);
    Vector<URL> list = new Vector<URL>(0);
    for(String url: urls) {
      try {
        list.add(new URL(url));
      } catch (MalformedURLException x){
        // process the rest
      }
    }

    return list.elements();
  }

  @SuppressWarnings({"unchecked"})
  public Enumeration<URL> getResources(String name) throws IOException {
    Enumeration<URL>[] resEnum = new Enumeration[2];

    if(parent == null) {
      resEnum[0] = getSystemClassLoader().getResourcesURL(name);
    } else{
      resEnum[0] = parent.getResources(name);
    }
    resEnum[1] = findResources(name);

    return new CompoundEnumeration<URL>(resEnum);
  }

  /**
   * Returns an enumeration representing all the resources with the given 
   * name. Class loader implementations should override this method to 
   * specify where to load resources from.
   */
  protected Enumeration<URL> findResources(String name) throws IOException {
      return (new Vector<URL>()).elements();
  }

  public InputStream getResourceAsStream (String name){
    URL foundResource = getResource(name);
    if (foundResource != null) {
      try {
        return foundResource.openStream();
      } catch (IOException e) {
        System.err.println("cannot open resource " + name);
      }
    }
    return null;
  }

  public native static ClassLoader getSystemClassLoader ();

  public static URL getSystemResource(String name){
    return getSystemClassLoader().getResource(name);
  }

  public static InputStream getSystemResourceAsStream(String name) {
    return getSystemClassLoader().getResourceAsStream(name);
  }

  public static Enumeration<URL> getSystemResources(String name) throws IOException {
    return getSystemClassLoader().getResources(name);
  }

  public ClassLoader getParent() {
    return parent;
  }

  /**
   * If the class with the given name has been already defined, it is returned. OW, it
   * returns null.
   */
  protected native final Class<?> findLoadedClass(String name);

  protected native final Class<?> findSystemClass(String name) throws ClassNotFoundException;

  public Class<?> loadClass(String name) throws ClassNotFoundException {
    Class<?> c = findLoadedClass(name);

    if(c == null) {
      try {
        if (parent != null && parent != getSystemClassLoader()) {
          c = parent.loadClass(name, false);
        } else {
          c = findSystemClass(name);
        }
      } catch (ClassNotFoundException e) {
        c = findClass(name);
      }
    }

    return c;
  }

  protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
    return loadClass(name);
  }

  /**
   * Finds the class with a given name. This method should be overridden by 
   * ClassLoader subclasses, and it will be used by loadClass().
   */
  protected Class<?> findClass(String name) throws ClassNotFoundException {
      throw new ClassNotFoundException(name);
  }

  /**
   * All the class objects are resolved internally by JPF. So this method
   * does nothing.
   */
  protected final void resolveClass(Class<?> c) {
  }

  private native Class<?> defineClass0(String name, byte[] b, int off, int len);

  protected final Class<?> defineClass(String name, byte[] b, int off, int len) throws ClassFormatError {
    return defineClass0(name, b, off, len);
  }

  protected final Class<?> defineClass(String name, byte[] b, int off, int len, ProtectionDomain protectionDomain) throws ClassFormatError {
    return defineClass(name, b, off, len);
  }

  protected String findLibrary(String libname) {
    return null;
  }

  protected native Package getPackage(String name);

  protected native Package[] getPackages();

  public native void setDefaultAssertionStatus(boolean enabled);

  public native void setClassAssertionStatus(String className, boolean enabled);

  public native void setPackageAssertionStatus(String packageName, boolean enabled);

  public native void clearAssertionStatus();

  //--- unsupported methods

  protected static boolean registerAsParallelCapable() {
    return true; // dummy, in prep for jdk7
  }

  protected Object getClassLoadingLock(String className) {
    throw new UnsupportedOperationException();
  }

  protected final Class<?> defineClass(byte[] b, int off, int len) 
      throws ClassFormatError {
    throw new UnsupportedOperationException();
  }

  protected final Class<?> defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain) 
      throws ClassFormatError {
    throw new UnsupportedOperationException();
  }

  protected final void setSigners(Class<?> c, Object[] signers) {
    throw new UnsupportedOperationException();
  }

  protected Package definePackage(String name, String specTitle, String specVersion, 
                                  String specVendor, String implTitle, String implVersion,
                                  String implVendor, URL sealBase) 
                                      throws IllegalArgumentException {
    throw new UnsupportedOperationException();
  }
}
