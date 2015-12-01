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
package gov.nasa.jpf.test.mc.basic;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * test for POR 'final' field config settings, adapted patch from Nathan Reynolds
 */
@SuppressWarnings("unused")
public class PorSkipFinalsTest extends TestJPF {

  private static Leaker leaker;

  private static class Leaker {

    private final static Object finalStatic = new Object();
    private static Object nonFinalStatic = new Object();
    private final Object finalMember;
    private Object nonFinalMember;

    private Leaker() {
      leaker = this;              // Leak the this pointer before member is initialized so that other threads have the opportunity to see member == null.
      Verify.incrementCounter(2);
      
      finalMember = new Object();
      nonFinalMember = new Object();
    }
  }

  private static void run() {

    Verify.resetCounter(1);  // Constructed = 0
    Verify.resetCounter(2);  // will increment when leaker is set

    Thread thread = new Thread(new Runnable() {
      public void run() {
        new Leaker();
        Verify.incrementCounter(1); // Finished = 1
      }
    });
    thread.start();

    Verify.ignoreIf(Verify.getCounter(2) == 0);   // This ensures that the other thread has at least finished assigning leaker a value.  This means that any POR breaks between assigning leaker and this point will be made inert.
    Verify.ignoreIf(Verify.getCounter(1) != 0);   // This ensures that the other thread hasn't quit yet.  Thus, ensuring that POR breaks can happen.
  }

private static void test_SkipFinals() {
    Object test;

    run();

    assert leaker.finalMember != null;     // This ensures that there are no POR breaks due to accessing a        final field.  Yet, the field can never be seen as null.
    test = leaker.nonFinalMember;          // This ensures that there *are*  POR breaks due to accessing a              field.
    test = Leaker.finalStatic;             // This ensures that there are no POR breaks due to accessing a static final field.
    assert Leaker.nonFinalStatic != null;  // This ensures that there *are*  POR breaks due to accessing a static       field.  Yet, the field can never be seen as null.

    Verify.incrementCounter(0);            // Counts the number of states which can execute this line.  Each POR break multiplies the counter by 2 because there are 2 threads.
    assert Verify.getCounter(0) == 4;
  }

  @Test
  public void test_SkipFinals_SkipStaticFinals_SkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=true");
      Verify.setProperties("vm.por.skip_static_finals=true");
      Verify.setProperties("vm.por.skip_constructed_finals=true");

      test_SkipFinals();
    }
  }

  @Test
  public void test_SkipFinals_SkipStaticFinals_NoSkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);
      
      Verify.setProperties("vm.por.skip_finals=true");
      Verify.setProperties("vm.por.skip_static_finals=true");
      Verify.setProperties("vm.por.skip_constructed_finals=false");

      test_SkipFinals();
    }
  }

  @Test
  public void test_SkipFinals_NoSkipStaticFinals_SkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=true");
      Verify.setProperties("vm.por.skip_static_finals=false");
      Verify.setProperties("vm.por.skip_constructed_finals=true");

      test_SkipFinals();
    }
  }

  @Test
  public void test_SkipFinals_NoSkipStaticFinals_NoSkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=true");
      Verify.setProperties("vm.por.skip_static_finals=false");
      Verify.setProperties("vm.por.skip_constructed_finals=false");

      test_SkipFinals();
    }
  }

  private static void test_NoSkipFinals() {
    Object test;

    run();

    Verify.ignoreIf(leaker.finalMember != null);

    test = leaker.finalMember;        // If there is a POR break from accessing a        final field, then the counter will be multiplied by 2.
    test = leaker.nonFinalMember;     // If there is a POR break from accessing a              field, then the counter will be multiplied by 2.
    test = Leaker.finalStatic;        // If there is a POR break from accessing a static final field, then the counter will be multiplied by 2.
    test = Leaker.nonFinalStatic;     // If there is a POR break from accessing a static       field, then the counter will be multiplied by 2.
    Verify.incrementCounter(0);
  }

  @Test
  public void test_NoSkipFinals_SkipStaticFinals_SkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=false");
      Verify.setProperties("vm.por.skip_static_finals=true");
      Verify.setProperties("vm.por.skip_constructed_finals=true");

      test_NoSkipFinals();

      assert Verify.getCounter(0) == 4;
    }
  }

  @Test
  public void test_NoSkipFinals_SkipStaticFinals_NoSkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=false");
      Verify.setProperties("vm.por.skip_static_finals=true");
      Verify.setProperties("vm.por.skip_constructed_finals=false");

      test_NoSkipFinals();

      assert Verify.getCounter(0) == 8;
    }
  }

  @Test
  public void test_NoSkipFinals_NoSkipStaticFinals_SkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=false");
      Verify.setProperties("vm.por.skip_static_finals=false");
      Verify.setProperties("vm.por.skip_constructed_finals=true");

      test_NoSkipFinals();

      assert Verify.getCounter(0) == 8;
    }
  }

  @Test
  public void test_NoSkipFinals_NoSkipStaticFinals_NoSkipConstructedFinals() {
    if (verifyNoPropertyViolation()){
      Verify.resetCounter(0);

      Verify.setProperties("vm.por.skip_finals=false");
      Verify.setProperties("vm.por.skip_static_finals=false");
      Verify.setProperties("vm.por.skip_constructed_finals=false");

      test_NoSkipFinals();

      assert Verify.getCounter(0) == 16;
    }
  }
}
