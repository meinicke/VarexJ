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
 * set that stores threads via (search global) thread ids. Used to detect shared objects/classes,
 * created by configured SharedObjectPolicy factory.
 * This set is persistent, i.e. does not modify contents of existing set instances to avoid
 * introducing search global state
 */
public class PersistentTidSet extends TidSet {
  
  public PersistentTidSet (ThreadInfo ti){
    super(ti);
  }  
  
  //--- non-destructive set update
  
  @Override
  public ThreadInfoSet add (ThreadInfo ti) {
    int id = ti.getId();
    
    if (!contains(id)){
      PersistentTidSet newSet = (PersistentTidSet)clone();
      newSet.add(id);
      return newSet;
      
    } else {
      return this;
    }
  }
  
  @Override
  public ThreadInfoSet remove (ThreadInfo ti) {
    int id = ti.getId();

    if (contains(id)){
      PersistentTidSet newSet = (PersistentTidSet)clone();
      newSet.remove(id);
      return newSet;
      
    } else {
      return this;
    }
  }
}
