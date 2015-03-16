package cmu.defect4j.math3.analysis;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FunctionUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testCompose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testCompose();
        }
    }

    @Test(timeout=120000)
    public void testAddDifferentiable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testAddDifferentiable();
        }
    }

    @Test(timeout=120000)
    public void testComposeDifferentiable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testComposeDifferentiable();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyDifferentiable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testMultiplyDifferentiable();
        }
    }

    @Test(timeout=120000)
    public void testCombine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testCombine();
        }
    }

    @Test(timeout=120000)
    public void testCollector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testCollector();
        }
    }

    @Test(timeout=120000)
    public void testSinc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testSinc();
        }
    }

    @Test(timeout=120000)
    public void testFixingArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testFixingArguments();
        }
    }

    @Test(timeout=120000)
    public void testSampleWrongBounds() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testSampleWrongBounds();
        }
    }

    @Test(timeout=120000)
    public void testSampleNegativeNumberOfPoints() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testSampleNegativeNumberOfPoints();
        }
    }

    @Test(timeout=120000)
    public void testSampleNullNumberOfPoints() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testSampleNullNumberOfPoints();
        }
    }

    @Test(timeout=120000)
    public void testSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testSample();
        }
    }

    @Test(timeout=120000)
    public void testToDifferentiableUnivariateFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testToDifferentiableUnivariateFunction();
        }
    }

    @Test(timeout=120000)
    public void testToUnivariateDifferential() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testToUnivariateDifferential();
        }
    }

    @Test(timeout=120000)
    public void testToDifferentiableMultivariateFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testToDifferentiableMultivariateFunction();
        }
    }

    @Test(timeout=120000)
    public void testToMultivariateDifferentiableFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.FunctionUtilsTest object = new org.apache.commons.math3.analysis.FunctionUtilsTest();
               object.testToMultivariateDifferentiableFunction();
        }
    }

}