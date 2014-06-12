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

/**
 * modeled root class of all Java objects. This is modeled because we already have a peer because of
 * the synchronization methods and have to cut off the registerNatives() call
 */
public class Object {
  public Object() {
    // nothing here
  }
  
  public final native Class<?> getClass();
  public native int hashCode();
  
  /**
   * default implementation is just an identity check
   */
  public boolean equals (Object o) {
    return o == this;
  }

  
  public String toString() {
    // intercepted by peer
    return null;
  }

  protected native Object clone() throws java.lang.CloneNotSupportedException;
  
  public final native void notify();
  public final native void notifyAll();
  
  public final native void wait (long timeout) throws java.lang.InterruptedException;
  
  public final void wait (long timeout, int nanos) throws java.lang.InterruptedException{
    // intercepted by peer
  }
  
  public final void wait() throws java.lang.InterruptedException {
    // intercepted by peer   
  }
  
  protected void finalize() throws java.lang.Throwable {
    
  }
}
