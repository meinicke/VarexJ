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

import java.util.ArrayList;

/**
 * little helper to enable resetting classes and objects between JPF runs,
 * mostly to avoid memory leaks
 * 
 * reset() has to be called at the beginning of a new run, causing all
 * still registered listeners to be notified. Listeners have to implement
 * their own logic to check for re-initialization, but can use the
 * 'run' timestamp to do so
 */
public class RunRegistry {
  static RunRegistry singleton = new RunRegistry();
  
  ArrayList<RunListener> listeners = new ArrayList<RunListener>();
  long run;
  
  public static RunRegistry getDefaultRegistry() {
    return singleton;
  }
  
  public void addListener (RunListener r) {
    if (!listeners.contains(r)){
      listeners.add(r);
    }
  }
  
  public boolean isRegistered (RunListener r){
    return listeners.contains(r);
  }
  
  public void reset() {
    run = System.currentTimeMillis();
    
    for (RunListener r : listeners){
      r.reset(this);
    }
    
    listeners.clear();
  }
  
  public long getRun() {
    return run;
  }
}
