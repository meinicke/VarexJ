package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GaussianTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testSomeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testSomeValues();
        }
    }

    @Test(timeout=120000)
    public void testLargeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testLargeArguments();
        }
    }

    @Test(timeout=120000)
    public void testDerivatives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testDerivatives();
        }
    }

    @Test(timeout=120000)
    public void testDerivativeLargeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testDerivativeLargeArguments();
        }
    }

    @Test(timeout=120000)
    public void testDerivativesNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testDerivativesNaN();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage1();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage2();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage3();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage4();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage5() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage5();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage6() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricUsage6();
        }
    }

    @Test(timeout=120000)
    public void testParametricValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricValue();
        }
    }

    @Test(timeout=120000)
    public void testParametricGradient() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.GaussianTest object = new org.apache.commons.math3.analysis.function.GaussianTest();
               object.testParametricGradient();
        }
    }

}