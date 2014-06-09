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

package gov.nasa.jpf;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 *
 * Refereces to the caches for the types Byte, Character, Short, Integer, 
 * Long.
 * 
 * This class is added to the startup class list in VM.initialize, to be
 * loaded before the valueOf()s are called.
 */
public class BoxObjectCaches {
  // Byte cache
  static Byte byteCache[];

  // Character cache
  static Character charCache[];

  // Short
  static Short shortCache[];

  // Integer cache
  static Integer intCache[];

  // Long cache
  static Long longCache[];
}