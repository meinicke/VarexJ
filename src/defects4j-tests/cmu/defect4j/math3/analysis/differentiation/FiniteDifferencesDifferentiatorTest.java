package cmu.defect4j.math3.analysis.differentiation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FiniteDifferencesDifferentiatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testConstant();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testWrongNumberOfPoints() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testWrongNumberOfPoints();
        }
    }

    @Test(timeout=120000)
    public void testWrongStepSize() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testWrongStepSize();
        }
    }

    @Test(timeout=120000)
    public void testLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testLinear();
        }
    }

    @Test(timeout=120000)
    public void testGaussian() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testGaussian();
        }
    }

    @Test(timeout=120000)
    public void testStepSizeUnstability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testStepSizeUnstability();
        }
    }

    @Test(timeout=120000)
    public void testWrongOrder() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testWrongOrder();
        }
    }

    @Test(timeout=120000)
    public void testWrongOrderVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testWrongOrderVector();
        }
    }

    @Test(timeout=120000)
    public void testWrongOrderMatrix() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testWrongOrderMatrix();
        }
    }

    @Test(timeout=120000)
    public void testTooLargeStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testTooLargeStep();
        }
    }

    @Test(timeout=120000)
    public void testBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testBounds();
        }
    }

    @Test(timeout=120000)
    public void testBoundedSqrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testBoundedSqrt();
        }
    }

    @Test(timeout=120000)
    public void testVectorFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testVectorFunction();
        }
    }

    @Test(timeout=120000)
    public void testMatrixFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testMatrixFunction();
        }
    }

    @Test(timeout=120000)
    public void testSeveralFreeParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest object = new org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest();
               object.testSeveralFreeParameters();
        }
    }

}