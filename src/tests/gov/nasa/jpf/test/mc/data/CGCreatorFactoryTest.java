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

import gov.nasa.jpf.util.json.CGCreator;
import gov.nasa.jpf.util.json.Value;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.BooleanChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 *
 * @author Ivan Mushketik
 */
public class CGCreatorFactoryTest extends TestJPF {
static class TestBoolCGCreator implements CGCreator {

    public ChoiceGenerator createCG(String id, Value[] values) {
      return new BooleanChoiceGenerator(id);
    }

  }

  class B {

    boolean b;

    public B(boolean b) {
      this.b = b;
    }

    @Override
    public boolean equals(Object o) {
      B other = (B) o;

      return this.b == other.b;
    }

  }

  @Test
  public void testAddUserDefinedCGCreator() {
    if (verifyNoPropertyViolation("+jpf-core.native_classpath+=;${jpf-core}/build/tests",
            "+jpf-core.test_classpath+=;${jpf-core.native_classpath}",
            "+cg-creators=TF:" + TestBoolCGCreator.class.getName())) {

      String json = "{"
              + "'b' : TF()"
              + "}";

      Object[] expected = {
        new B(true), new B(false)
      };

      B b = Verify.createFromJSON(B.class, json);
      JSONTest.checkValue(expected, b);
    }
  }
}
