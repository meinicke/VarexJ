//
//Copyright (C) 2008 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.
//
//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.
//
//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.search.heuristic;

import gov.nasa.jpf.Config;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * container for statically prioritized states, based on bounded
 * RB trees
 * 
 * TreeSet is a better choice than PriorityQueue since the size
 * constraint means we have to remove elements from both ends, which
 * is inefficient with heaps. A simple (binary) sorted array using
 * block copy can be more efficient, but that very much depends on
 * queue size and processor, so it's not really worth the trouble
 * 
 * <2do> this needs to be re-evaluated in light of the stupid fact
 * that pollFirst()/pollLast() are only in Java 1.6 and we can't switch
 * yet (no Java 1.6 for PPC), which forces us to do some shuffling to
 * make remove(last()) work as expected
 */
@SuppressWarnings("serial")
public class StaticPriorityQueue extends TreeSet<PrioritizedState> {

  int maxQueueSize;
  
  public StaticPriorityQueue (Config config) {
    // unbound queues are pretty pointless - we could probably better use
    // DFSearch in this case
    maxQueueSize = config.getInt("search.heuristic.queue_limit", 1024);
    if (maxQueueSize < 0){
      maxQueueSize = Integer.MAX_VALUE;
    }
  }
    
  public boolean add (PrioritizedState s) {
    if (size() < maxQueueSize) { // limit not yet reached
      return super.add(s);
      
    } else {
      PrioritizedState last = last();
      if (s.compareTo(last) < 0) {
        //pollLast();   // that's only Java 1.6
        remove(last);
        
        return super.add(s);
        
      } else {
        // don't add with this priority value
        return false;
      }
    }
  }
  
  public boolean isQueueLimitReached() {
    return size() >= maxQueueSize;
  }
  
  // for debugging purposes
  void dump() {
    int i=0;
    System.err.print('[');
    for (Iterator<PrioritizedState> it=iterator(); it.hasNext();) {
      if (i++ > 0) {
        System.err.print(',');
      }
      System.err.print(it.next());
    }
    System.err.println(']');
  }
}
