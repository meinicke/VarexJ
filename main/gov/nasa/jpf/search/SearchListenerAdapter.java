//
// Copyright (C) 2010 United States Government as represented by the
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

/**
 * a no-action SearchListener which we can use to override only the
 * notifications we are interested in
 */
public class SearchListenerAdapter implements SearchListener {

  @Override
  public void stateAdvanced(Search search) {}

  @Override
  public void stateProcessed(Search search) {}

  @Override
  public void stateBacktracked(Search search) {}

  @Override
  public void statePurged(Search search) {}

  @Override
  public void stateStored(Search search) {}

  @Override
  public void stateRestored(Search search) {}

  @Override
  public void searchProbed(Search search) {}
  
  @Override
  public void propertyViolated(Search search) {}

  @Override
  public void searchStarted(Search search) {}

  @Override
  public void searchConstraintHit(Search search) {}

  @Override
  public void searchFinished(Search search) {}

}
