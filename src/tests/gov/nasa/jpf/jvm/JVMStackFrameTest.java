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

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.StackFrame;

import org.junit.Test;


/**
 * unit test for StackFrame operations
 */
public class JVMStackFrameTest extends TestJPF {

  @Test
  public void testDup2_x1() {
    // 1 2 3  => 2 3.1 2 3

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(1);
    frame.push(2);
    frame.push(3);
    frame.printOperands(System.out);

    frame.dup2_x1();
    frame.printOperands(System.out);

    assert frame.getTopPos() == 4;
    assert frame.peek(4) == 2;
    assert frame.peek(3) == 3;
    assert frame.peek(2) == 1;
    assert frame.peek(1) == 2;
    assert frame.peek(0) == 3;
  }

  @Test
  public void testDup2_x1_Attrs() {
    // 1 2 3  => 2 3.1 2 3

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(1); frame.setOperandAttr("1");
    frame.push(2); frame.setOperandAttr("2");
    frame.push(3); frame.setOperandAttr("3");
    frame.printOperands(System.out);

    frame.dup2_x1();
    frame.printOperands(System.out);

    assert frame.getTopPos() == 4;
    assert frame.peek(4) == 2 && frame.getOperandAttr(4) == "2"; // same const pool string
    assert frame.peek(3) == 3 && frame.getOperandAttr(3) == "3";
    assert frame.peek(2) == 1 && frame.getOperandAttr(2) == "1";
    assert frame.peek(1) == 2 && frame.getOperandAttr(1) == "2";
    assert frame.peek(0) == 3 && frame.getOperandAttr(0) == "3";
  }


  @Test
  public void testDup2_x2() {
    // 1 2 3 4  => 3 4.1 2 3 4

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(1);
    frame.push(2);
    frame.push(3);
    frame.push(4);
    frame.printOperands(System.out);

    frame.dup2_x2();
    frame.printOperands(System.out);

    assert frame.getTopPos() == 5;
    assert frame.peek(5) == 3;
    assert frame.peek(4) == 4;
    assert frame.peek(3) == 1;
    assert frame.peek(2) == 2;
    assert frame.peek(1) == 3;
    assert frame.peek(0) == 4;
  }

  @Test
  public void testDup2_x2_Attrs() {
    // 1 2 3 4  => 3 4.1 2 3 4

    JVMStackFrame frame = new JVMStackFrame(0, 10);

    frame.push(1); frame.setOperandAttr("1");
    frame.push(2); frame.setOperandAttr("2");
    frame.push(3); frame.setOperandAttr("3");
    frame.push(4); frame.setOperandAttr("4");
    frame.printOperands(System.out);

    frame.dup2_x2();
    frame.printOperands(System.out);

    assert frame.getTopPos() == 5;
    assert frame.peek(5) == 3 && frame.getOperandAttr(5) == "3";  // same const pool string
    assert frame.peek(4) == 4 && frame.getOperandAttr(4) == "4";
    assert frame.peek(3) == 1 && frame.getOperandAttr(3) == "1";
    assert frame.peek(2) == 2 && frame.getOperandAttr(2) == "2";
    assert frame.peek(1) == 3 && frame.getOperandAttr(1) == "3";
    assert frame.peek(0) == 4 && frame.getOperandAttr(0) == "4";
  }

  @Test
  public void testPushLong() {
    // Push/Pop long value and also  JVMStackFrame.getLocalValueObject

    JVMStackFrame frame = new JVMStackFrame(0, 2);

    long value = 0x123456780ABCDEFL;
    frame.pushLong(value);

    Object obj_Long = frame.getLocalValueObject(new LocalVarInfo("testLong", "J", "J", 0, 0, 0));
    assert obj_Long != null;
    assert obj_Long instanceof Long;

    long result_getLocValObj = (Long) obj_Long;
    long result_popLong = frame.popLong();

    assert result_getLocValObj == value;
    assert result_popLong == value;
  }

  @Test
  public void testPushDouble() {
    // Push/Pop double value and also  JVMStackFrame.getLocalValueObject

    JVMStackFrame frame = new JVMStackFrame(2, 10);
    // Initialize local values and the stack frame
    frame.push(1);
    frame.push(2);
    frame.push(3);

    double value = Math.PI;

    frame.pushDouble(value);

    Object obj_Double = frame.getLocalValueObject(new LocalVarInfo("testDouble", "D", "D", 0, 0, frame.getTopPos() - 1));
    assert obj_Double != null;
    assert obj_Double instanceof Double;

    double result_getLocValObj = (Double) obj_Double;
    double result_popLong = frame.popDouble();

    assert result_getLocValObj == value;
    assert result_popLong == value;

    assert frame.peek(0) == 3;
    assert frame.peek(1) == 2;
    assert frame.peek(2) == 1;
  }

}
