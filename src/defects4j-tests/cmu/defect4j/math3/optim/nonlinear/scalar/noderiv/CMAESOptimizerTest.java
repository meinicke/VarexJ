package cmu.defect4j.math3.optim.nonlinear.scalar.noderiv;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CMAESOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testInitOutofbounds1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testInitOutofbounds1();
        }
    }

    @Test(timeout=1000000)
    public void testInitOutofbounds2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testInitOutofbounds2();
        }
    }

    @Test(timeout=1000000)
    public void testInputSigmaNegative() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testInputSigmaNegative();
        }
    }

    @Test(timeout=1000000)
    public void testInputSigmaOutOfRange() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testInputSigmaOutOfRange();
        }
    }

    @Test(timeout=1000000)
    public void testInputSigmaDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testInputSigmaDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testCigarWithBoundaries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testCigarWithBoundaries();
        }
    }

    @Test(timeout=1000000)
    public void testDiagonalRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testDiagonalRosen();
        }
    }

    @Test(timeout=1000000)
    public void testMath864() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testMath864();
        }
    }

    @Test(timeout=1000000)
    public void testFitAccuracyDependsOnBoundary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testFitAccuracyDependsOnBoundary();
        }
    }

    @Test(timeout=1000000)
    public void testBoundariesDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testBoundariesDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testRosen();
        }
    }

    @Test(timeout=1000000)
    public void testMaximize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testMaximize();
        }
    }

    @Test(timeout=1000000)
    public void testEllipse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testEllipse();
        }
    }

    @Test(timeout=1000000)
    public void testElliRotated() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testElliRotated();
        }
    }

    @Test(timeout=1000000)
    public void testCigar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testCigar();
        }
    }

    @Test(timeout=1000000)
    public void testTwoAxes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testTwoAxes();
        }
    }

    @Test(timeout=1000000)
    public void testCigTab() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testCigTab();
        }
    }

    @Test(timeout=1000000)
    public void testTablet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testTablet();
        }
    }

    @Test(timeout=1000000)
    public void testDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testDiffPow();
        }
    }

    @Test(timeout=1000000)
    public void testSsDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testSsDiffPow();
        }
    }

    @Test(timeout=1000000)
    public void testAckley() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testAckley();
        }
    }

    @Test(timeout=1000000)
    public void testRastrigin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testRastrigin();
        }
    }

    @Test(timeout=1000000)
    public void testConstrainedRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testConstrainedRosen();
        }
    }

    @Test(timeout=1000000)
    public void testSphere() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest();
               object.testSphere();
        }
    }

}