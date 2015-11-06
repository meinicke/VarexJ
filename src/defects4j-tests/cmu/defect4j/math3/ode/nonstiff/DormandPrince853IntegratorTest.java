package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DormandPrince853IntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMinStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testMinStep();
        }
    }

    @Test(timeout=1000000)
    public void testIncreasingTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testIncreasingTolerance();
        }
    }

    @Test(timeout=1000000)
    public void testDimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testDimensionCheck();
        }
    }

    @Test(timeout=1000000)
    public void testEvents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testEvents();
        }
    }

    @Test(timeout=1000000)
    public void testVariableSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testVariableSteps();
        }
    }

    @Test(timeout=1000000)
    public void testNullIntervalCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testNullIntervalCheck();
        }
    }

    @Test(timeout=1000000)
    public void testTooLargeFirstStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testTooLargeFirstStep();
        }
    }

    @Test(timeout=1000000)
    public void testUnstableDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testUnstableDerivative();
        }
    }

    @Test(timeout=1000000)
    public void testEventsScheduling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testEventsScheduling();
        }
    }

    @Test(timeout=1000000)
    public void testMissedEndEvent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testMissedEndEvent();
        }
    }

    @Test(timeout=1000000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=1000000)
    public void testKepler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest();
               object.testKepler();
        }
    }

}