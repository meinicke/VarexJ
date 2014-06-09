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

package gov.nasa.jpf.test.mc.data;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 *
 */
public class PerturbatorTest extends TestJPF {

  int data = 42;

  public static void main(String[] args) {
    runTestsOfThisClass(args);
  }

  @Test
  public void testIntFieldPerturbation() {

    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+listener=.listener.Perturbator",
                                  "+perturb.fields=data",
                                  "+perturb.data.class=.perturb.IntOverUnder",
                                  "+perturb.data.field=gov.nasa.jpf.test.mc.data.PerturbatorTest.data",
                                  "+perturb.data.delta=1")){
      System.out.println("instance field perturbation test");
      int d = data;
      System.out.print("d = ");
      System.out.println(d);

      Verify.incrementCounter(0);
      switch (Verify.getCounter(0)){
        case 1: assert d == 43; break;
        case 2: assert d == 42; break;
        case 3: assert d == 41; break;
        default:
          assert false : "wrong counter value: " + Verify.getCounter(0);
      }

    } else {
      assert Verify.getCounter(0) == 3;
    }
  }

  @Test
  public void testFieldPerturbationLocation() {

    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+listener=.listener.Perturbator",
                                  "+perturb.fields=data",
                                  "+perturb.data.class=.perturb.IntOverUnder",
                                  "+perturb.data.field=gov.nasa.jpf.test.mc.data.PerturbatorTest.data",
                                  "+perturb.data.location=PerturbatorTest.java:88",
                                  "+perturb.data.delta=1")){
      System.out.println("instance field location perturbation test");

      int x = data; // this should not be perturbed
      System.out.print("x = ");
      System.out.println(x);

      int d = data; // this should be
      System.out.print("d = ");
      System.out.println(d);

      Verify.incrementCounter(0);

    } else {
      assert Verify.getCounter(0) == 3;
    }
  }

  int foo (int i) {
    return i;
  }
  
  int bar (int i, boolean b) {
  	return i-1;
  }

  int bar (int i){
    return i-1;
  }

  @Test
  public void testIntReturnPerturbation() {
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }

    if (verifyNoPropertyViolation("+listener=.listener.Perturbator",
                                  "+perturb.returns=foo,bar",

                                  "+perturb.foo.class=.perturb.IntOverUnder",
                                  "+perturb.foo.method=gov.nasa.jpf.test.mc.data.PerturbatorTest.foo(int)",
                                  "+perturb.foo.location=PerturbatorTest.java:137",
                                  "+perturb.foo.delta=1",

                                  "+perturb.bar.class=.perturb.IntOverUnder",
                                  "+perturb.bar.method=gov.nasa.jpf.test.mc.data.PerturbatorTest.bar(int,boolean)",
                                  "+perturb.bar.delta=5")){
      int x, y;

      System.out.println("int return perturbation test");

      x = foo(-1); // this should not be perturbed ('foo' has a location spec)
      System.out.print("foo() = ");
      System.out.println(x);

      x = foo(42); // line 136 => this should be
      System.out.print("foo() = ");
      System.out.println(x);

      Verify.incrementCounter(0);
      switch (Verify.getCounter(0)){
        // foo() preturbations
        case 1: assert x == 43; break;
        case 2: assert x == 42; break;
        case 3: assert x == 41; break;
        default:
          assert false : "wrong counter 0 (foo() perturbation) value: " + Verify.getCounter(0);
      }

      if (x == 41){
        y = bar(40, false); // this too (no location spec for 'bar')
        System.out.print("bar() = ");
        System.out.println(y);

        Verify.incrementCounter(1);
        switch (Verify.getCounter(1)){
          // bar() perturbations
          case 1: assert y == 44; break;
          case 2: assert y == 39; break;
          case 3: assert y == 34; break;
          default:
            assert false : "wrong counter 1 (bar() perturbation) value: " + Verify.getCounter(1);
        }
      }

    } else {
      assert Verify.getCounter(0) == 3;
      assert Verify.getCounter(1) == 3;
    }
  }
  
  static void printParams(int i, boolean b) {
  	System.out.println("(" + i + ", " + b + ")");
  }
  
  static int zoo(int i, boolean b) {
  	printParams(i, b);
  	if (b)
  		return -1 * i;
  	else
  		return i;
  }
  
  void printParam(long i, double d) {
  	System.out.println("(" + i + ", " + d + ")");
  }
  
  double foobar(long i, double d) {
  	printParam(i, d);
  	long j = i;
  	return d + (j % 10);
  }
  
  @Test
  public void testParamPerturbation() {

    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }

    if (verifyNoPropertyViolation("+listener=.listener.Perturbator",
                                  "+perturb.params=foo,zoo",
                                  "+perturb.foo.class=.perturb.GenericDataAbstractor",
                                  "+perturb.foo.method=gov.nasa.jpf.test.mc.data.PerturbatorTest.foobar(long,double)",
                                  "+perturb.foo.location=PerturbatorTest.java:234",        // <<<<<<<<< update if file is changed!
                                  "+perturb.zoo.class=.perturb.GenericDataAbstractor",
                                  "+perturb.zoo.method=gov.nasa.jpf.test.mc.data.PerturbatorTest.zoo(int,boolean)"
    )) {
      System.out.println("parameters perturbation test");

      int e = zoo(42, false);
      System.out.print("zoo = ");
      System.out.println(e);

      Verify.incrementCounter(0);
      switch (Verify.getCounter(0)){
        case 1: assert e == 21; break;
        case 2: assert e == -21; break;
        case 3: assert e == 0; break;
        case 4: assert e == 0; break;
        case 5: assert e == -84; break;
        case 6: assert e == 84; break;
        default:
          assert false : "wrong counter value: " + Verify.getCounter(0);
      }
    
      if (e == 84) {
      	double d = foobar(42, 0.0); // no perturbation
      	System.out.print("foobar = ");
      	System.out.println(d);

      	d = foobar(42, 0.0); // yes perturbation
      	System.out.print("foobar = ");
      	System.out.println(d);

      	Verify.incrementCounter(1);
      	switch (Verify.getCounter(1)){
      	case 1: assert Math.abs(d - 0.586) < 0.0001; break;
      	case 2: assert d == 2; break;
      	case 3: assert d == 5.141; break;
      	case 4: assert d == -1.414; break;
      	case 5: assert d == 0; break;
      	case 6: assert d == 3.141; break;
      	case 7: assert d == -1.414; break;
      	case 8: assert d == 0; break;
      	case 9: assert d == 3.141; break;
      	default:
      		assert false : "wrong counter value: " + Verify.getCounter(1);
      	}
      }
    } else {
      assert Verify.getCounter(0) == 6;
      assert Verify.getCounter(1) == 9;
    }
  }
}
