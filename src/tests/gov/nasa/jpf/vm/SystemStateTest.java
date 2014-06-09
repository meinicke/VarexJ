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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.BooleanChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.SystemState;
import gov.nasa.jpf.vm.choice.DoubleChoiceFromList;
import gov.nasa.jpf.vm.choice.IntChoiceFromSet;

import org.junit.Test;


/**
 * unit test driver for SystemState functions
 */
public class SystemStateTest extends TestJPF {

  static class MyJVM extends SingleProcessVM {

    protected void notifyChoiceGeneratorSet (ChoiceGenerator<?>cg) {
      System.out.println("notifyChoiceGeneratorSet: " + cg);
    }
    protected void notifyChoiceGeneratorAdvanced (ChoiceGenerator<?>cg) {
      System.out.println("notifyChoiceGeneratorAdvanced: " + cg);
    }
    protected void notifyChoiceGeneratorProcessed (ChoiceGenerator<?>cg) {
      System.out.println("notifyChoiceGeneratorProcessed: " + cg);
    }
  }

  static class MySystemState extends SystemState {
  }


  @Test
  public void testCascadedCGops() {

    MyJVM vm = new MyJVM();
    MySystemState ss = new MySystemState();

    IntChoiceFromSet       cg0 = new IntChoiceFromSet( "cg0", -100, -200); // not cascaded
    BooleanChoiceGenerator cg1 = new BooleanChoiceGenerator("cg1"); // false,true
    IntChoiceFromSet       cg2 = new IntChoiceFromSet( "cg2", 1, 2);
    DoubleChoiceFromList    cg3 = new DoubleChoiceFromList( "cg3", 42.1, 42.2);

    cg2.isCascaded = true;
    cg1.isCascaded = true;

    cg3.prev = cg2;
    cg2.prev = cg1;
    cg1.prev = cg0;
    ss.curCg = cg3;

    cg0.advance();

    //--- test initial advance
    System.out.println("--- testing advanceCurCg()");
    ss.advanceCurCg(vm);

    assert cg0.getNextChoice() == -100;
    assert cg1.getNextChoice() == false;
    assert cg2.getNextChoice() == 1;
    assert cg3.getNextChoice() == 42.1;


    //--- test advanceCascadedParent
    System.out.println("--- testing advanceCascadedParent()");
    cg2.advance(2);
    cg3.advance(2);

    assert !cg2.hasMoreChoices();
    assert !cg3.hasMoreChoices();

    System.out.println(cg1);
    System.out.println(cg2);
    System.out.println(cg3);
        
    ss.advanceCascadedParent(vm,cg3);

    assert cg0.getNextChoice() == -100;
    assert cg1.getNextChoice() == true;
    assert cg2.getNextChoice() == 1;
    assert cg3.getNextChoice() == 42.1;
  }

  @Test
  public void testCascadedCGadvance() {

    MyJVM vm = new MyJVM();
    MySystemState ss = new MySystemState();

    BooleanChoiceGenerator cg1 = new BooleanChoiceGenerator("cg1"); // false,true
    IntChoiceFromSet       cg2 = new IntChoiceFromSet( "cg2", 1, 2);
    DoubleChoiceFromList    cg3 = new DoubleChoiceFromList( "cg3", 42.1, 42.2);

    cg2.isCascaded = true;
    cg1.isCascaded = true;

    cg3.prev = cg2;
    cg2.prev = cg1;
    ss.curCg = cg3;

    int n = 0;
    while (ss.advanceCurCg(vm)){
      System.out.println("--");
      n++;
    }

    assert n == 8;
  }
}
