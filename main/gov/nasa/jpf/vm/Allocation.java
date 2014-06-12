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

import gov.nasa.jpf.util.OATHash;

/**
 * helper class for search global object id (SGOID) computation. This
 * captures both allocation context and count.
 * 
 * NOTE: this is used as a key for associative arrays, but we do
 * allow destructive updates via init() in order to enable key
 * caching for lookups that don't lead to new entries. 
 * THE CALLER HAS TO MAKE SURE init() IS NEVER CALLED ON A STORED KEY !!
 */
public class Allocation {
  
  final AllocationContext context;
  final int count;
  final int hash;
  
  public Allocation (AllocationContext context, int count){
    this.context = context;
    this.count = count;
    this.hash = OATHash.hash(context.hashCode(), count);
  }
  
  @Override
  public boolean equals (Object o) {
    if (o instanceof Allocation) {
      Allocation other = (Allocation)o;
      
      if (other.hash == hash) {
        if (other.context.equals(context)) {
          return true;
        }
      }
    }
    
    return false;
  }
  
  @Override
  public int hashCode() {
    return hash;
  }
}
