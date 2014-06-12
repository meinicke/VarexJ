//
// Copyright (C) 2007 United States Government as represented by the
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

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * a generic, listener- created trace over property specific operations
 * 
 * we could register this as a listener itself, but since it usually is used from
 * a listener, we might as well just delegate from there
 */
public class Trace<T> extends ListenerAdapter implements Iterable<T> {

  TraceElement<T> lastElement;
  TraceElement<T> lastTransition;

  // for HeuristicSearches. Ok, that's braindead but at least no need for cloning
  HashMap<Integer,TraceElement<T>> storedTransition;


  // iterator that traverses the trace LIFO, i.e. starting from the last T
  class TraceIterator implements Iterator<T> {

    TraceElement<T> cur;
    
    TraceIterator () {
      cur = lastElement;
    }
    
    public boolean hasNext () {
      return (cur != null);
    }

    public T next () {
      if (cur != null){
        T op = cur.op;
        cur = cur.prevElement;
        return op;
      } else {
        return null;
      }
    }

    public void remove () {
      throw new UnsupportedOperationException("TraceElement removal not supported");
    } 
  }
  
  public Iterator<T> iterator() {
    return new TraceIterator();
  }
  
  public void addOp (T o){
    TraceElement<T> op = new TraceElement<T>(o);
    
    if (lastElement == null){
      lastElement = op;
    } else {
      assert lastElement.stateId == 0;
      
      op.prevElement = lastElement;
      lastElement = op;
    }
  }

  public void removeLastOp() {
    if (lastElement != null){
      lastElement = lastElement.prevElement;
    }
  }

  public T getLastOp() {
    if (lastElement != null) {
      return lastElement.getOp();
    }
    
    return null;
  }

  public int size() {
    int n=0;
    for (TraceElement<T> te = lastElement; te != null; te = te.prevElement) {
      n++;
    }
    
    return n;
  }
  
  public List<T> getOps () {
    // this is a rather braindead way around the limitation that we can't explicitly
    // create an T[] array object
    
    ArrayList<T> list = new ArrayList<T>();
    
    for (TraceElement<T> te = lastElement; te != null; te = te.prevElement) {
      list.add(te.getOp());
    }
    
    // reverse
    for (int i=0, j=list.size()-1; i<j; i++, j--) {
      T tmp = list.get(j);
      list.set(j, list.get(i));
      list.set(i, tmp);
    }
    
    return list;
  }

  @Override
  public void stateAdvanced (Search search) {
    if (search.isNewState() && (lastElement != null)) {
      int stateId = search.getStateId();
      
      for (TraceElement<T> op=lastElement; op != null; op=op.prevElement) {
        assert op.stateId == 0;
        
        op.stateId = stateId;
      }
      
      lastElement.prevTransition = lastTransition;
      lastTransition = lastElement;
    }
    
    lastElement = null;
  }

  @Override
  public void stateBacktracked (Search search){
    int stateId = search.getStateId();
    while ((lastTransition != null) && (lastTransition.stateId > stateId)){
      lastTransition = lastTransition.prevTransition;
    }
    lastElement = null;
  }

  @Override
  public void stateStored (Search search) {
    if (storedTransition == null){
      storedTransition = new HashMap<Integer,TraceElement<T>>();
    }
    
    // always called after stateAdvanced
    storedTransition.put(search.getStateId(), lastTransition);
  }

  @Override
  public void stateRestored (Search search) {
    int stateId = search.getStateId();
    TraceElement<T> op = storedTransition.get(stateId);
    if (op != null) {
      lastTransition = op;
      storedTransition.remove(stateId);  // not strictly required, but we don't come back
    }
  }

  public Trace clone() {
    TraceElement<T> e0 = null, eLast = null;
    
    for (TraceElement<T> e = lastElement; e != null; e = e.prevElement){
      TraceElement<T> ec = e.clone();

      if (eLast != null){
        eLast.prevElement = ec;
        eLast = ec;
      } else {
        e0 = eLast = ec;
      }
    }
    
    Trace<T> t = new Trace<T>();
    t.lastElement = e0;
    
    return t;
  }
}
