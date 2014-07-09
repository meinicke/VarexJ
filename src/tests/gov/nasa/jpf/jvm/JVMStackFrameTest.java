//
// Copyright (C) 2009 United States Government as represented by the
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

package gov.nasa.jpf.jvm;

import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.LocalVarInfo;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExprFactory;


/**
 * unit test for StackFrame operations
 */
public class JVMStackFrameTest extends TestJPF {

  @Test
  public void testDup2_x1() {
    // 1 2 3  => 2 3.1 2 3

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(FeatureExprFactory.True(), new One<>(1));
    frame.push(FeatureExprFactory.True(), new One<>(2));
    frame.push(FeatureExprFactory.True(), new One<>(3));
    frame.printOperands(System.out);

    frame.dup2_x1(FeatureExprFactory.True());
    frame.printOperands(System.out);

    assertTrue(frame.getTopPos() == 4);
    assertTrue(frame.peek(FeatureExprFactory.True(), 4).getValue() == 2);
    assertTrue(frame.peek(FeatureExprFactory.True(), 3).getValue() == 3);
    assertTrue(frame.peek(FeatureExprFactory.True(), 2).getValue() == 1);
    assertTrue(frame.peek(FeatureExprFactory.True(), 1).getValue() == 2);
    assertTrue(frame.peek(FeatureExprFactory.True(), 0).getValue() == 3);
  }

  @Test
  public void testDup2_x1_Attrs() {
    // 1 2 3  => 2 3.1 2 3

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(FeatureExprFactory.True(), new One<>(1)); frame.setOperandAttr("1");
    frame.push(FeatureExprFactory.True(), new One<>(2)); frame.setOperandAttr("2");
    frame.push(FeatureExprFactory.True(), new One<>(3)); frame.setOperandAttr("3");
    frame.printOperands(System.out);

    frame.dup2_x1(FeatureExprFactory.True());
    frame.printOperands(System.out);

    assertTrue(frame.getTopPos() == 4);
    assertTrue(frame.peek(FeatureExprFactory.True(), 4).getValue() == 2 && frame.getOperandAttr(4) == "2"); // same const pool string
    assertTrue(frame.peek(FeatureExprFactory.True(), 3).getValue() == 3 && frame.getOperandAttr(3) == "3");
    assertTrue(frame.peek(FeatureExprFactory.True(), 2).getValue() == 1 && frame.getOperandAttr(2) == "1");
    assertTrue(frame.peek(FeatureExprFactory.True(), 1).getValue() == 2 && frame.getOperandAttr(1) == "2");
    assertTrue(frame.peek(FeatureExprFactory.True(), 0).getValue() == 3 && frame.getOperandAttr(0) == "3");
  }


  @Test
  public void testDup2_x2() {
    // 1 2 3 4  => 3 4.1 2 3 4

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(FeatureExprFactory.True(), new One<>(1));
    frame.push(FeatureExprFactory.True(), new One<>(2));
    frame.push(FeatureExprFactory.True(), new One<>(3));
    frame.push(FeatureExprFactory.True(), new One<>(4));
    frame.printOperands(System.out);

    frame.dup2_x2(FeatureExprFactory.True());
    frame.printOperands(System.out);

    assertTrue(frame.getTopPos() == 5);
    assertTrue(frame.peek(FeatureExprFactory.True(), 5).getValue() == 3);
    assertTrue(frame.peek(FeatureExprFactory.True(), 4).getValue() == 4);
    assertTrue(frame.peek(FeatureExprFactory.True(), 3).getValue() == 1);
    assertTrue(frame.peek(FeatureExprFactory.True(), 2).getValue() == 2);
    assertTrue(frame.peek(FeatureExprFactory.True(), 1).getValue() == 3);
    assertTrue(frame.peek(FeatureExprFactory.True(), 0).getValue() == 4);
  }

  @Test
  public void testDup2_x2_Attrs() {
    // 1 2 3 4  => 3 4.1 2 3 4

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(FeatureExprFactory.True(), new One<>(1)); frame.setOperandAttr("1");
    frame.push(FeatureExprFactory.True(), new One<>(2)); frame.setOperandAttr("2");
    frame.push(FeatureExprFactory.True(), new One<>(3)); frame.setOperandAttr("3");
    frame.push(FeatureExprFactory.True(), new One<>(4)); frame.setOperandAttr("4");
    frame.printOperands(System.out);

    frame.dup2_x2(FeatureExprFactory.True());
    frame.printOperands(System.out);

    assertTrue(frame.getTopPos() == 5);
    assertTrue(frame.peek(FeatureExprFactory.True(), 5).getValue() == 3 && frame.getOperandAttr(5) == "3");  // same const pool string
    assertTrue(frame.peek(FeatureExprFactory.True(), 4).getValue() == 4 && frame.getOperandAttr(4) == "4");
    assertTrue(frame.peek(FeatureExprFactory.True(), 3).getValue() == 1 && frame.getOperandAttr(3) == "1");
    assertTrue(frame.peek(FeatureExprFactory.True(), 2).getValue() == 2 && frame.getOperandAttr(2) == "2");
    assertTrue(frame.peek(FeatureExprFactory.True(), 1).getValue() == 3 && frame.getOperandAttr(1) == "3");
    assertTrue(frame.peek(FeatureExprFactory.True(), 0).getValue() == 4 && frame.getOperandAttr(0) == "4");
  }

  @Test
  public void testPushLong() {
    // Push/Pop long value and also  JVMStackFrame.getLocalValueObject

    JVMStackFrame frame = new JVMStackFrame(0, 2);

    long value = 0x123456780ABCDEFL;
    frame.pushLong(value);

    Object obj_Long = frame.getLocalValueObject(new LocalVarInfo("testLong", "J", "J", 0, 0, 0));
    assertTrue(obj_Long != null);
    assertTrue(obj_Long instanceof Long);

    long result_getLocValObj = (Long) obj_Long;
    long result_popLong = frame.popLong(FeatureExprFactory.True()).getValue();

    assertTrue(result_getLocValObj == value);
    assertTrue(result_popLong == value);
  }

  @Test
  public void testPushDouble() {
    // Push/Pop double value and also  JVMStackFrame.getLocalValueObject

    JVMStackFrame frame = new JVMStackFrame(2, 10);
    // Initialize local values and the stack frame
    frame.push(FeatureExprFactory.True(), new One<>(1));
    frame.push(FeatureExprFactory.True(), new One<>(2));
    frame.push(FeatureExprFactory.True(), new One<>(3));

    double value = Math.PI;

    frame.pushDouble(value);

    Object obj_Double = frame.getLocalValueObject(new LocalVarInfo("testDouble", "D", "D", 0, 0, frame.getTopPos() -1));
    assertTrue(obj_Double != null);
    assertTrue(obj_Double instanceof Double);

    double result_getLocValObj = (Double) obj_Double;
    double result_popLong = frame.popDouble(FeatureExprFactory.True()).getValue();
    assertTrue(result_getLocValObj == value);
    assertTrue( result_popLong == value);

    assertTrue(frame.peek(FeatureExprFactory.True(), 0).getValue() == 3);
    assertTrue(frame.peek(FeatureExprFactory.True(), 1).getValue() == 2);
    assertTrue(frame.peek(FeatureExprFactory.True(), 2).getValue() == 1);
  }

}
