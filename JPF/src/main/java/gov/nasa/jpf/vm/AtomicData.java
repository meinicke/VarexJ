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

import gov.nasa.jpf.util.HashData;


/**
 * helper object to store per thread information about atomic line
 * execution
 * <2do> check if we can't do this less expensive. atomic-lines is not
 * the default anymore
 */
public class AtomicData {
  /**
   * The method in which the line step started.
   */
  public MethodInfo currentMethod;

  /**
   * The line at which the line step started.
   */
  public int line;

  /**
   * Set to true if we still are in the same method in which we were
   * when the line step started.
   */
  public boolean inSameMethod;

  public Object clone () {
    AtomicData a = new AtomicData();

    a.currentMethod = currentMethod;
    a.line = line;
    a.inSameMethod = inSameMethod;

    return a;
  }

  public boolean equals (Object o) {
    if (o == null) {
      return false;
    }

    if (!(o instanceof AtomicData)) {
      return false;
    }

    AtomicData a = (AtomicData) o;

    if (currentMethod != a.currentMethod) {
      return false;
    }

    if (line != a.line) {
      return false;
    }

    if (inSameMethod != a.inSameMethod) {
      return false;
    }

    return true;
  }

  /**
   * Computes a hash code with the object data.
   */
  public void hash (HashData hd) {
    hd.add(line);
    hd.add(inSameMethod ? 1 : 0);
  }

  /**
   * Returns a hash code for the object.
   */
  public int hashCode () {
    HashData hd = new HashData();

    hash(hd);

    return hd.getValue();
  }
}
