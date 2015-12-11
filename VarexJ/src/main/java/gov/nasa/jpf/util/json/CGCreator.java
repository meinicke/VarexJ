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

package gov.nasa.jpf.util.json;

import gov.nasa.jpf.vm.ChoiceGenerator;

/**
 * Creates Choice generator from Value array.
 * We need this interface because there are too many Choice Generators in JPF if we
 * will try to create CG trying to match CG constructors parameters and Values array
 * we will have following problems:
 * <li> Ambiguity with some constructors
 * <li> User would unable to create some kind of CG (some requires Config for example)
 * <li> User would need to specify unique ids in JSON
 * @see Value
 * @author Ivan Mushketik
 */
public interface CGCreator {

  /**
   * Create choice generator
   * @param id - unique id for this CG
   * @param params - params read from JSON file
   * @return new CG.
   */
  public ChoiceGenerator<?> createCG(String id, Value[] params);
}
