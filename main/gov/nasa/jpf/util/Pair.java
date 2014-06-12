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
package gov.nasa.jpf.util;

/**
 * simple const wrapper utility class for 2-tuple 
 */
public class Pair<A,B> {
  
  // final so that we don't need getters
  public final A _1;
  public final B _2;
  
  public Pair(A a, B b) { 
    this._1 = a; 
    this._2 = b; 
  }
  
  public final boolean equals(Object o) {
    if (o instanceof Pair){
      Pair p = (Pair)o;
      if ((_1 == null) && (p._1 != null)){
        return false;
      }
      if ((_2 == null) && (p._2 != null)){
        return false;
      }
      if (!_1.equals(p._1)){
        return false;
      }
      if (!_2.equals(p._2)){
        return false;
      }
      
      return true;
      
    } else {
      return false;
    }
  }
  
  public final int hashCode() {
    int h1 = (_1 == null) ? 0 : _1.hashCode();
    int h2 = (_2 == null) ? 0 : _2.hashCode();
    
    return h1 ^ h2;
  }
}
