package gov.nasa.jpf.test.java.lang;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

public class RuntimeTest extends TestJPF {

  @Test
  public void testAvailableProcessors() {

    if (!isJPFRun()) {
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+cg.max_processors=2")) {
      Runtime rt = Runtime.getRuntime();

      int n = rt.availableProcessors();
      System.out.println("-- available processors: " + n);
      Verify.incrementCounter(0);
    }

    if (!isJPFRun()) {
      if (Verify.getCounter(0) != 2) {
        fail("wrong number of backtracks: " + Verify.getCounter(0));
      }
    }
  }
}
