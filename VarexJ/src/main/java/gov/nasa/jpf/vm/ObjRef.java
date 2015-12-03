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


/**
 * helper class to store object references in a context where Integer is used for boxed 'int' values
 */
public class ObjRef {
  public static final ObjRef NULL = new ObjRef(MJIEnv.NULL);
  
  int reference;

  protected ObjRef (int ref) {
    reference = ref;
  }

  public boolean isNull () {
    return reference == MJIEnv.NULL;
  }

  public int getReference () {
    return reference;
  }

  public boolean equals (Object o) {
    if (o.getClass() == ObjRef.class) {
      ObjRef other = (ObjRef)o;
      return reference == other.reference;
    }
    return false;
  }

  public int hashCode () {
    return reference;
  }

  public String toString () {
    return "ObjRef(" + reference + ')';
  }
}