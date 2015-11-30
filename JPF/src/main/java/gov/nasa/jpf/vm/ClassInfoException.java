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
package gov.nasa.jpf.vm;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 *
 * This unchecked exception is thrown by the host VM. It captures all errors
 * and exceptions that can occur at the load of a JPF class, which includes 
 * defining, and resolving it. Here are some of the scenarios that this 
 * exception is thrown and captures the corresponding exception:
 *
 *    * if the representation does not represent a class with the requested 
 *      name, loading throws an instance of NoClassDefFoundError
 *
 *    * if any of the superclasses of a class, is the class itself, or if 
 *      any of the superinterfaces of an interface, is the interface itself, 
 *      loading throws an instance of ClassCircularityError
 *
 *    * if the representation is not a ClassFile structure, loading throws an
 *      instance of ClassFormatError
 * 
 * If this exception is thrown during the initialization of VM, and the failed
 * class is a system class, or creating of the main thread in not successful, we 
 * immediately bail out by throwing JPFException.
 * 
 * While JPF is running, this error is handled by throwing an exception at the 
 * SUT level. This exception is handled if it is thrown by 
 * 
 *    1. a native peer method,  
 *    2. Intruction.execute(),
 *    3. ThreadInfo.creatAndThrowException()
 *    4. VM.initialize() // here it is handled only if it a non-system class
 * 
 * If this exception is thrown by a Listener, the host VM throws JPFListenerException.
 * 
 */
public class ClassInfoException extends RuntimeException{

  ClassLoaderInfo classLoader;
  String exceptionClass; // how we map this into the SUT (i.e. the JPF side)
  String failedClass;

  public ClassInfoException(String details, ClassLoaderInfo cl, String exceptionClass, String faildClass) {
    super(details);
    this.classLoader = cl;
    this.exceptionClass = exceptionClass;
    this.failedClass = faildClass;
  }

  public ClassInfoException (String details, ClassLoaderInfo cl, String exceptionClass, String faildClass, Throwable cause) {
    super(details, cause);
    this.classLoader = cl;
    this.exceptionClass = exceptionClass;
    this.failedClass = faildClass;
  }

  
  public boolean checkSystemClassFailure() {
    return (failedClass.startsWith("java."));
  }

  public ClassLoaderInfo getClassLoaderInfo() {
    return classLoader;
  }

  public String getFailedClass() {
    return failedClass;
  }

  public String getExceptionClass() {
    return exceptionClass;
  }
}
