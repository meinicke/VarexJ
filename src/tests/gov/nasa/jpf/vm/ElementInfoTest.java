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

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.DynamicElementInfo;
import gov.nasa.jpf.vm.ElementInfo;

import org.junit.Test;

/**
 * unit test for ElementInfos
 */
public class ElementInfoTest extends TestJPF {

  @Test
  public void testPinDownCounter() {
    DynamicElementInfo ei = new DynamicElementInfo();

    assert !ei.isPinnedDown();

    assert ei.incPinDown(); // should return true because this is the first inc

    // count up to the max number
    for (int i=2; i<= ElementInfo.ATTR_PINDOWN_MASK; i++){
      assert !ei.incPinDown();
      assert ei.getPinDownCount() == i;
    }

    // count exceeded, now it should throw a JPFException
    try {
      ei.incPinDown();
      assert false : "incPinDown did not throw";
    } catch (JPFException x){
      System.out.println("caught " + x + ", getPinDownCount() = " + ei.getPinDownCount());
    }

    // count down to the first one
    for (int i=ElementInfo.ATTR_PINDOWN_MASK-1; i>0; i--){
      assert !ei.decPinDown() : "decPinDown() from " + ei.getPinDownCount() + " returned true";
      assert ei.getPinDownCount() == i : "getPinDownCount() = " + ei.getPinDownCount() +
              " != " + i;
    }

    assert ei.decPinDown(); // should return true now
    assert ei.getPinDownCount() == 0 : "getPinDownCount() != 0";
  }
  
  
  
  @Test
  public void testALiveFlag() {
    DynamicElementInfo ei = new DynamicElementInfo();

    assert !ei.isMarked();
    
    ei.setAlive(true);
    
    assert  ei.isAlive(true);
    assert !ei.isAlive(false);
    assert  ei.isMarkedOrAlive(true);
    assert !ei.isMarkedOrAlive(false);
    
    
    ei.setAlive(false);
    
    assert !ei.isAlive(true);
    assert  ei.isAlive(false);
    assert !ei.isMarkedOrAlive(true);
    assert  ei.isMarkedOrAlive(false);
    
  }

  @Test
  public void testMarkedFlag() {
    DynamicElementInfo ei = new DynamicElementInfo();

    assert !ei.isMarked();
    
    ei.setMarked();
    assert ei.isMarked();

    ei.setUnmarked();
    assert !ei.isMarked();
    
  }

  @Test
  public void testMarkedOrAlive() {
    DynamicElementInfo ei = new DynamicElementInfo();
    boolean[] boolValues = { true, false};
    
    assert !ei.isMarked();
    
    ei.setMarked();
    assert ei.isMarked();
    
    for(boolean b : boolValues) {
       ei.setAlive(b);
       
      assert ei.isMarkedOrAlive(true);
      assert ei.isMarkedOrAlive(false);
    }
    

    ei.setUnmarked();
    assert !ei.isMarked();
    
    for(boolean b : boolValues) {
      ei.setAlive(b);
      
      assert ei.isMarkedOrAlive(true) == ei.isAlive(true);
      assert ei.isMarkedOrAlive(false) == ei.isAlive(false);
    }
  }

}
