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
package gov.nasa.jpf.search;

import gov.nasa.jpf.JPFListener;

/**
 * interface to register for notification by the Search object.
 * Observer role in same-name pattern
 */
public interface SearchListener extends JPFListener {
  
  /**
   * got the next state
   * Note - this will be notified before any potential propertyViolated, in which
   * case the currentError will be already set
   */
  void stateAdvanced (Search search);
  
  /**
   * state is fully explored
   */
  void stateProcessed (Search search);
  
  /**
   * state was backtracked one step
   */
  void stateBacktracked (Search search);

  /**
   * some state is not going to appear in any path anymore
   */
  void statePurged (Search search);

  /**
   * somebody stored the state
   */
  void stateStored (Search search);
  
  /**
   * a previously generated state was restored
   * (can be on a completely different path)
   */
  void stateRestored (Search search);
  
  /**
   * there was a probe request, e.g. from a periodical timer
   * note this is called synchronously from within the JPF execution loop
   * (after instruction execution)
   */
  void searchProbed (Search search);
  
  /**
   * JPF encountered a property violation.
   * Note - this is always preceeded by a stateAdvanced
   */
  void propertyViolated (Search search);
  
  /**
   * we get this after we enter the search loop, but BEFORE the first forward
   */
  void searchStarted (Search search);
  
  /**
   * there was some contraint hit in the search, we back out
   * could have been turned into a property, but usually is an attribute of
   * the search, not the application
   */
  void searchConstraintHit (Search search);
  
  /**
   * we're done, either with or without a preceeding error
   */
  void searchFinished (Search search);
}

