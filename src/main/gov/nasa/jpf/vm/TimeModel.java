//
// Copyright (C) 2011 United States Government as represented by the
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
 * interface that encapsulates the mechanism to obtain values for
 * 
 *   System.getCurrentTimeMillis()
 *   System.nanoTime()
 * 
 * calls. Implementors should guarantee the invariant that time values are
 * strictly increasing along any given path, but don't have to backtrack
 * time values in order to achieve uniform time increments along all paths.
 * 
 * Note that implementations have to avoid creating state leaks, i.e.
 * the respective time value storage should not contribute to the state space
 * hashing. If it has to be backtrackable, it either has to be stored on the 
 * native side, or marked as @FilterField
 */
public interface TimeModel {
  
  public long currentTimeMillis();
  public long nanoTime();
}
