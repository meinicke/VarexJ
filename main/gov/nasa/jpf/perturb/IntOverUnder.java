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

package gov.nasa.jpf.perturb;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.IntChoiceGenerator;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.choice.IntChoiceFromSet;

/**
 * simple +/- delta perturbation of integer operand values
 */
public class IntOverUnder implements OperandPerturbator {

  protected int delta;
  protected int offset;

  public IntOverUnder (Config conf, String keyPrefix) {
    delta = conf.getInt(keyPrefix + ".delta", 0);
    offset = 0;
  }

  public IntOverUnder (int delta){
    this.delta = delta;
    offset = 0;
  }
  
  public ChoiceGenerator<?> createChoiceGenerator (String id, StackFrame frame, Object refObject){
    int val = frame.peek(offset);

    int[] values = new int[3];

    values[0] = val + delta;
    values[1] = val;
    values[2] = val - delta;
    
    // set offset from refObject
    offset = (Integer)refObject;

    return new IntChoiceFromSet(id, values);
  }

  public boolean perturb(ChoiceGenerator<?>cg, StackFrame frame) {
  	assert cg instanceof IntChoiceGenerator : "wrong choice generator type for IntOverUnder: " + cg.getClass().getName();

    int val = ((IntChoiceGenerator)cg).getNextChoice();
  	frame.setOperand(offset, val, false);
  	return cg.hasMoreChoices();
  }
  
  public Class<? extends ChoiceGenerator<?>> getChoiceGeneratorType(){
    return IntChoiceFromSet.class;
  }
}
