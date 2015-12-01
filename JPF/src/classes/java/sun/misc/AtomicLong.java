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
package sun.misc;

/**
 * MJI model class for sun.misc.AtomicLong library abstraction
 */
public class AtomicLong {
  long value;

  public AtomicLong () {
  }

  private AtomicLong (long val) {
    value = val;
  }

  public static AtomicLong newAtomicLong (long val) {
    return new AtomicLong(val);
  }

  public boolean attemptAdd (long l) {
    value += l;

    return true;
  }

  public boolean attemptIncrememt () {
    value++;

    return true;
  }

  public boolean attemptSet (long val) {
    value = val;

    return true;
  }

  public boolean attemptUpdate (long fallback, long newval) {
    value = newval;

    return true;
  }

  public long get () {
    return value;
  }

  @SuppressWarnings("unused")
  private static boolean VMSupportsCS8 () {
    // whatever it means
    return false;
  }
}
