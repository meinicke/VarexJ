package gov.nasa.jpf.test.basic;

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.TypeRef;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * basic test to test the test harness
 */
public class HarnessTest extends TestJPF {

  int d;

  @Test
  public void noViolation() {
    if (verifyNoPropertyViolation()) {
      d += 42;

      System.out.println("** this is noViolation() - it should succeed");
    }
  }

  @Test
  public void verifyAssert() {
    if (verifyAssertionErrorDetails("java.lang.AssertionError : wrong answer..")) {
      System.out.println("** this is verifyAssert() - JPF should find an AssertionError");

      assert d == 42 : "wrong answer..";
    }
  }

  @Test
  public void verifyNullPointerException() {
    if (verifyUnhandledException("java.lang.NullPointerException")) {
      System.out.println("** this is verifyNullPointerException() - JPF should find an NPE");

      String s = null;

      s.length();
    }
  }

  @Test
  public void verifyRuntimeException() {
    if (verifyPropertyViolation(new TypeRef("gov.nasa.jpf.vm.NoUncaughtExceptionsProperty"))) {
      System.out.println("** this is verifyRuntimeException() - JPF should find an unhandled exception");

      throw new RuntimeException("Bang!");
    }
  }

  @Test
  public void verifyJPFExcept() {
    if (verifyJPFException(new TypeRef("gov.nasa.jpf.JPFConfigException"), "+vm.class=InvalidVMClass", "+pass_exceptions")) {
      fail("** JPF should not run");
    }
  }

  // low level TestJPF API test
  @Test
  public void testLowLevelAPI() {
    
    JPF jpf = noPropertyViolation();

    if (jpf == null) {
      System.out.println("** this is low level API test - it should succeed");
    } else {
      assert jpf.getSearchErrors().isEmpty() : "unexpected JPF search errors";
    }
  }
}
