package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EulerIntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=120000)
    public void testStepSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testStepSize();
        }
    }

    @Test(timeout=120000)
    public void testDecreasingSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testDecreasingSteps();
        }
    }

    @Test(timeout=120000)
    public void testSmallStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testSmallStep();
        }
    }

    @Test(timeout=120000)
    public void testBigStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testBigStep();
        }
    }

    @Test(timeout=120000)
    public void testDimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest();
               object.testDimensionCheck();
        }
    }

}