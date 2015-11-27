package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LogisticTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSomeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testSomeValues();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage1();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage2();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage3();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage4();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage5() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage5();
        }
    }

    @Test(timeout=1000000)
    public void testParametricUsage6() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testParametricUsage6();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testPreconditions2();
        }
    }

    @Test(timeout=1000000)
    public void testCompareSigmoid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testCompareSigmoid();
        }
    }

    @Test(timeout=1000000)
    public void testCompareDerivativeSigmoid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testCompareDerivativeSigmoid();
        }
    }

    @Test(timeout=1000000)
    public void testGradientComponent0Component4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testGradientComponent0Component4();
        }
    }

    @Test(timeout=1000000)
    public void testGradientComponent5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testGradientComponent5();
        }
    }

    @Test(timeout=1000000)
    public void testGradientComponent1Component2Component3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.LogisticTest object = new org.apache.commons.math3.analysis.function.LogisticTest();
               object.testGradientComponent1Component2Component3();
        }
    }

}