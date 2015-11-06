package cmu.defect4j.math3.transform;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastFourierTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testAdHocData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testAdHocData();
        }
    }

    @Test(timeout=1000000)
    public void testTransformFunctionNotStrictlyPositiveNumberOfSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformFunctionNotStrictlyPositiveNumberOfSamples();
        }
    }

    @Test(timeout=1000000)
    public void testTransformFunctionInvalidBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformFunctionInvalidBounds();
        }
    }

    @Test(timeout=1000000)
    public void testSinFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testSinFunction();
        }
    }

    @Test(timeout=1000000)
    public void testTransformRealSizeNotAPowerOfTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformRealSizeNotAPowerOfTwo();
        }
    }

    @Test(timeout=1000000)
    public void testTransformFunctionSizeNotAPowerOfTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformFunctionSizeNotAPowerOfTwo();
        }
    }

    @Test(timeout=1000000)
    public void testTransformComplex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformComplex();
        }
    }

    @Test(timeout=1000000)
    public void testStandardTransformReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testStandardTransformReal();
        }
    }

    @Test(timeout=1000000)
    public void testTransformComplexSizeNotAPowerOfTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testTransformComplexSizeNotAPowerOfTwo();
        }
    }

    @Test(timeout=1000000)
    public void testStandardTransformFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.testStandardTransformFunction();
        }
    }

    @Test(timeout=1000000)
    public void test2DData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.test2DData();
        }
    }

    @Test(timeout=1000000)
    public void test2DDataUnitary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastFourierTransformerTest object = new org.apache.commons.math3.transform.FastFourierTransformerTest();
               object.test2DDataUnitary();
        }
    }

}