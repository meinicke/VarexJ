//
// Copyright (C) 2011 United States Government as represented by the
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

import gov.nasa.jpf.util.TypeRef;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * regression test for the NumericValueChecker listener
 */
public class NumericValueCheckerTest extends TestJPF {

  static class C1 {
    double d;
    void setValue(double v){
      d = v;
    }
  }

  @Test
  public void testField(){
    if (verifyPropertyViolation(new TypeRef("gov.nasa.jpf.listener.NumericValueChecker"),
            "+listener=.listener.NumericValueChecker",
            "+range.fields=d",
            "+range.d.field=*.NumericValueCheckerTest$C1.d",
            "+range.d.min=42")){
      C1 c1= new C1();
      c1.setValue(0);
    }
  }


  static class C2 {
    void doSomething(int d){
      int x = d;
    }
  }

  @Test
  public void testVars(){
    if (verifyPropertyViolation(new TypeRef("gov.nasa.jpf.listener.NumericValueChecker"),
            "+listener=.listener.NumericValueChecker",
            "+range.vars=x",
            "+range.x.var=*$C2.doSomething(int):x",
            "+range.x.min=42")){
      C2 c2= new C2();
      c2.doSomething(-42);
    }
  }
}
