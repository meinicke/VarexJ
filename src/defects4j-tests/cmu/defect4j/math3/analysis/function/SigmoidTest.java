package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SigmoidTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testDerivative();
        }
    }

    @Test(timeout=120000)
    public void testDerivativesHighOrder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testDerivativesHighOrder();
        }
    }

    @Test(timeout=120000)
    public void testSomeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testSomeValues();
        }
    }

    @Test(timeout=120000)
    public void testDerivativeLargeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testDerivativeLargeArguments();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testParametricUsage1();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testParametricUsage2();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testParametricUsage3();
        }
    }

    @Test(timeout=120000)
    public void testParametricUsage4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testParametricUsage4();
        }
    }

    @Test(timeout=120000)
    public void testParametricValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SigmoidTest object = new org.apache.commons.math3.analysis.function.SigmoidTest();
               object.testParametricValue();
        }
    }

}