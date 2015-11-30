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

import gov.nasa.jpf.util.UnsortedArrayIntSet;

/**
 * set that stores threads via (search global) thread ids. Used to detect shared objects/classes,
 * created by configured SharedObjectPolicy factory
 * 
 * Note - this class modified contents of instances, i.e. it does destructive updates
 * and hence has state carry-over between paths
 */
public class TidSet extends UnsortedArrayIntSet implements ThreadInfoSet, Memento<ThreadInfoSet> {
  
  protected VM vm;
  
  public TidSet (ThreadInfo ti){
    vm = ti.getVM();
    
    add( ti.getId());
  }  
  
  //--- set update
  
  @Override
  public ThreadInfoSet add (ThreadInfo ti) {
    add( ti.getId());
    return this;
  }
  
  @Override
  public ThreadInfoSet remove (ThreadInfo ti) {
    remove( ti.getId());
    return this;
  }
  
  
  //--- set query
  
  @Override
  public boolean contains (ThreadInfo ti) {
    return contains( ti.getId());
  }
  
  @Override
  public boolean isShared (ThreadInfo ti, ElementInfo ei){
    return hasMultipleLiveThreads();
  }
  
  @Override
  public boolean hasMultipleLiveThreads(){
    if (size == 0){
      return false;
      
    } else {
      boolean alreadyHadOne = false;
      ThreadList tl = vm.getThreadList();
      
      for (int i=0; i<size; i++){
        ThreadInfo ti = tl.getThreadInfoForId(elements[i]);
        if (ti != null && !ti.isTerminated()){
          if (alreadyHadOne){
            return true;
          }
          alreadyHadOne = true;
        }
      }
      
      return false;
    }
  }

  @Override
  public boolean hasMultipleRunnableThreads(){
    if (size == 0){
      return false;
      
    } else {
      boolean alreadyHadOne = false;
      ThreadList tl = vm.getThreadList();
      
      for (int i=0; i<size; i++){
        ThreadInfo ti = tl.getThreadInfoForId(elements[i]);
        if (ti != null && ti.isRunnable()){
          if (alreadyHadOne){
            return true;
          }
          alreadyHadOne = true;
        }
      }
      
      return false;
    }
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName());
    sb.append('{');
    for (int i = 0; i<size; i++) {
      if (i>0) {
        sb.append(',');
      }
      sb.append(elements[i]);
    }
    sb.append('}');
    
    return sb.toString();
  }

  
  //--- state management (TidSet instance per default are their own mementos)
  
  @Override
  public Memento<ThreadInfoSet> getMemento(){
    return this;
  }

  @Override
  public ThreadInfoSet restore(ThreadInfoSet inSitu) {
    return this;
  }
}
