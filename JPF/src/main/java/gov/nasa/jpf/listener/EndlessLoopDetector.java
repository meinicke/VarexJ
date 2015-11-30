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

package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.VM;

/**
 * little listener that tries to detect endless while() loops by counting
 * backjumps, breaking transitions if the count exceeds a threshold, and
 * then checking if program states match. If they do, there would be no progress
 * in this thread.
 */
public class EndlessLoopDetector extends IdleFilter {

  boolean foundEndlessLoop = false;

  public EndlessLoopDetector(Config config) {
    super(config);

    action = Action.BREAK;
  }

  @Override
  public void stateAdvanced(Search search) {
    if (brokeTransition && search.isVisitedState()) {
      foundEndlessLoop = true;
    }
  }

  @Override
  public boolean check(Search search, VM vm) {
    return !foundEndlessLoop;
  }

  @Override
  public void reset () {
    foundEndlessLoop = false;
  }
}
