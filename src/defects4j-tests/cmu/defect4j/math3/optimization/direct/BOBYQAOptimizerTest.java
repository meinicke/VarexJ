package cmu.defect4j.math3.optimization.direct;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BOBYQAOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSphere() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testSphere();
        }
    }

    @Test(timeout=120000)
    public void testInitOutOfBounds() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testInitOutOfBounds();
        }
    }

    @Test(timeout=120000)
    public void testBoundariesDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testBoundariesDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testProblemDimensionTooSmall() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testProblemDimensionTooSmall();
        }
    }

    @Test(timeout=120000)
    public void testRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testRosen();
        }
    }

    @Test(timeout=120000)
    public void testMaximize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testMaximize();
        }
    }

    @Test(timeout=120000)
    public void testEllipse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testEllipse();
        }
    }

    @Test(timeout=120000)
    public void testElliRotated() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testElliRotated();
        }
    }

    @Test(timeout=120000)
    public void testCigar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testCigar();
        }
    }

    @Test(timeout=120000)
    public void testTwoAxes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testTwoAxes();
        }
    }

    @Test(timeout=120000)
    public void testCigTab() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testCigTab();
        }
    }

    @Test(timeout=120000)
    public void testTablet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testTablet();
        }
    }

    @Test(timeout=120000)
    public void testDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testDiffPow();
        }
    }

    @Test(timeout=120000)
    public void testSsDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testSsDiffPow();
        }
    }

    @Test(timeout=120000)
    public void testAckley() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testAckley();
        }
    }

    @Test(timeout=120000)
    public void testRastrigin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testRastrigin();
        }
    }

    @Test(timeout=120000)
    public void testConstrainedRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testConstrainedRosen();
        }
    }

    @Test(timeout=120000)
    public void testConstrainedRosenWithMoreInterpolationPoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testConstrainedRosenWithMoreInterpolationPoints();
        }
    }

    @Test(timeout=120000)
    public void testMaxEvaluations() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest object = new org.apache.commons.math3.optimization.direct.BOBYQAOptimizerTest();
               object.testMaxEvaluations();
        }
    }

}