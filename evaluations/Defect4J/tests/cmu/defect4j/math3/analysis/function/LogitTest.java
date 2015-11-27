package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LogitTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSomeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testSomeValues();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage1();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage2();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage3();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage4();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage5() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage5();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage6() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricUsage6();
        }
    }

    @Test(timeout=1000000)
    public void testParametricValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testParametricValue();
        }
    }

    @Test(timeout=1000000)
    public void testDerivativeLargeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testDerivativeLargeArguments();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testPreconditions2();
        }
    }

    @Test(timeout=1000000)
    public void testDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testDerivative();
        }
    }

    @Test(timeout=1000000)
    public void testDerivativesHighOrder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testDerivativesHighOrder();
        }
    }

    @Test(timeout=1000000)
    public void testValueWithInverseFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testValueWithInverseFunction();
        }
    }

    @Test(timeout=1000000)
    public void testDerivativesWithInverseFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogitTest object = new org.apache.commons.math3.analysis.function.LogitTest();
               object.testDerivativesWithInverseFunction();
        }
    }

}