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

/**
 * This example shows a deadlock that occurs as a result of a missed signal,
 * i.e. a wait() that happens after the corresponding notify().
 * 
 * The defect is caused by a violated monitor encapsulation, i.e. directly
 * accessing monitor internal data ('Event.count') from concurrent clients
 * ('FirstTask', 'SecondTask'), without synchronization with the
 * corresponding monitor operations ('wait_for-Event()' and 'signalEvent()').
 * 
 * The resulting race is typical for unsafe optimizations that try to 
 * avoid expensive blocking calls by means of local caches
 * 
 * This example was inspired by a defect found in the "Remote Agent" 
 * spacecraft controller that flew on board of "Deep Space 1", as described
 * in: 
 * 
 *   Model Checking Programs
 *   W. Visser, K. Havelund, G. Brat, S. Park and F. Lerda
 *   Automated Software Engineering Journal
 *   Volume 10, Number 2, April 2003
 *  
 * @author wvisser
 */

//------- the test driver
public class oldclassic {
  public static void main (String[] args) {
    Event      new_event1 = new Event();
    Event      new_event2 = new Event();

    FirstTask  task1 = new FirstTask(new_event1, new_event2);
    SecondTask task2 = new SecondTask(new_event1, new_event2);

    task1.start();
    task2.start();
  }
}

//------- shared objects implemented as monitors
class Event {
  int count = 0;

  public synchronized void signal_event () {
    
    // NOTE: this abstraction is not strictly required - even if the state space would
    // be unbound, JPF could still find the error at a reasonable search depth,
    // unless it's left-most branch in the search tree is unbound. If it is,
    // there are two ways to work around: (1) use a different search strategy
    // (e.g. HeuristicSearch with BFSHeuristic), or (2) set a random choice
    // enumeration order ("+cg.randomize_choices=true"). In this example, (2)
    // works just fine
    count = (count + 1) % 3;
    //count++;  // requires "+cg.randomize_choices=true" for DFSearch policy
    
    notifyAll();
  }

  public synchronized void wait_for_event () {
    try {
      wait();
    } catch (InterruptedException e) {
    }
  }
}

//------- the two concurrent threads using the monitors
class FirstTask extends Thread {
  Event event1;
  Event event2;
  int   count = 0;  // bad optimization - local cache of event1 internals

  public FirstTask (Event e1, Event e2) {
    this.event1 = e1;
    this.event2 = e2;
  }

  public void run () {
    count = event1.count;          // <race> violates event1 monitor encapsulation

    while (true) {
      System.out.println("1");

      if (count == event1.count) { // <race> ditto
        event1.wait_for_event();
      }

      count = event1.count;        // <race> ditto
      event2.signal_event();       // updates event2.count
    }
  }
}

class SecondTask extends Thread {
  Event event1;
  Event event2;
  int   count = 0;  // bad optimization - local cache of event2 internals

  public SecondTask (Event e1, Event e2) {
    this.event1 = e1;
    this.event2 = e2;
  }

  public void run () {
    count = event2.count;          // <race> violates event2 monitor encapsulation

    while (true) {
      System.out.println("  2");
      event1.signal_event();       // updates event1.count

      if (count == event2.count) { // <race> ditto
        event2.wait_for_event();
      }

      count = event2.count;        // <race> ditto
    }
  }
}
