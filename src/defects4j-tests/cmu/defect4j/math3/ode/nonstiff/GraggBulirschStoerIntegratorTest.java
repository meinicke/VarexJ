package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GraggBulirschStoerIntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=120000)
    public void testKepler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testKepler();
        }
    }

    @Test(timeout=120000)
    public void testIntegratorControls() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testIntegratorControls();
        }
    }

    @Test(timeout=120000)
    public void testIssue596() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testIssue596();
        }
    }

    @Test(timeout=120000)
    public void testNullIntervalCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testNullIntervalCheck();
        }
    }

    @Test(timeout=120000)
    public void testTooLargeFirstStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testTooLargeFirstStep();
        }
    }

    @Test(timeout=120000)
    public void testUnstableDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testUnstableDerivative();
        }
    }

    @Test(timeout=120000)
    public void testMinStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testMinStep();
        }
    }

    @Test(timeout=120000)
    public void testIncreasingTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testIncreasingTolerance();
        }
    }

    @Test(timeout=120000)
    public void testDimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testDimensionCheck();
        }
    }

    @Test(timeout=120000)
    public void testEvents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testEvents();
        }
    }

    @Test(timeout=120000)
    public void testVariableSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest();
               object.testVariableSteps();
        }
    }

}