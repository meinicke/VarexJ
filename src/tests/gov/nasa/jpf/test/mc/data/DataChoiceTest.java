//
// Copyright (C) 2005 United States Government as represented by the
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
package gov.nasa.jpf.test.mc.data;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

public class DataChoiceTest extends TestJPF {

  class MyType {

    String id;

    MyType(String id) {
      this.id = id;
    }

    public String toString() {
      return ("MyType " + id);
    }
  }


  int intField = 42;
  double doubleField = -42.2;

  @Test
  public void testIntFromSet() {

    if (!isJPFRun()) {
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+my_int_from_set.class=gov.nasa.jpf.vm.choice.IntChoiceFromSet",
            "+my_int_from_set.values=1,2,3,intField,localVar")) {
      int localVar = 43;  // read by choice generator

      int i = Verify.getInt("my_int_from_set");
      Verify.incrementCounter(0);
      System.out.println(i);

    }

    if (!isJPFRun()) { // this is only executed outside JPF
      if (Verify.getCounter(0) != 5) {
        fail("wrong number of backtracks");
      }
    }
  }

  @Test
  public void testIntFromArray () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation()){
      int i = Verify.getIntFromList(1,2,3,4,5); // ..and change the combination on my luggage
      System.out.println(i);
      if (i>0 && i < 6){
        Verify.incrementCounter(0);
      } else {
        assert false : "wrong int choice value: " + i;
      }
    }

    if (!isJPFRun()) { // this is only executed outside JPF
      if (Verify.getCounter(0) != 5) {
        fail("wrong number of backtracks");
      }
    }
  }


  @Test
  public void testDoubleFromSet() {

    if (!isJPFRun()) {
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+my_double_from_set.class=gov.nasa.jpf.vm.choice.DoubleChoiceFromSet",
            "+my_double_from_set.values=42.0,43.5,doubleField,localVar")) {

      double localVar = 4200.0; // read by choice generator

      double d = Verify.getDouble("my_double_from_set");
      Verify.incrementCounter(0);
      System.out.println(d);
    }

    if (!isJPFRun()) { // this is only executed outside JPF
      if (Verify.getCounter(0) != 4) {
        fail("wrong number of backtracks");
      }
    }
  }

  @Test
  public void testDoubleFromArray () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation()){
      double d = Verify.getDoubleFromList(-42.0,0,42.0);
      System.out.println(d);

      if (d == -42.0 || d == 0.0 || d == 42.0){
        Verify.incrementCounter(0);
      } else {
        assert false : "wrong double choice value: " + d;
      }
    }

    if (!isJPFRun()) { // this is only executed outside JPF
      if (Verify.getCounter(0) != 3) {
        fail("wrong number of backtracks");
      }
    }
  }



  @Test
  public void testTypedObjectChoice() {

    if (!isJPFRun()) {
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+my_typed_object.class=gov.nasa.jpf.vm.choice.TypedObjectChoice",
            "+my_typed_object.type=" + MyType.class.getName())) {

      MyType o1 = new MyType("one");
      MyType o2 = new MyType("two");

      Object o = Verify.getObject("my_typed_object");
      Verify.incrementCounter(0);
      System.out.println(o);
    }

    if (!isJPFRun()) { // this is only executed outside JPF
      if (Verify.getCounter(0) != 2) {
        fail("wrong number of backtracks");
      }
    }

  }
}
