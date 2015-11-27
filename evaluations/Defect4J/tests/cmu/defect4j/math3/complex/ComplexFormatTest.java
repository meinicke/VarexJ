package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ComplexFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testSimpleNoDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testTrimOneImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testTrimOneImaginary();
        }
    }

    @Test(timeout=1000000)
    public void testSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testSimpleWithDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testNegativeReal();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testNegativeImaginary();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testNegativeBoth();
        }
    }

    @Test(timeout=1000000)
    public void testZeroReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testZeroReal();
        }
    }

    @Test(timeout=1000000)
    public void testZeroImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testZeroImaginary();
        }
    }

    @Test(timeout=1000000)
    public void testDifferentImaginaryChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testDifferentImaginaryChar();
        }
    }

    @Test(timeout=1000000)
    public void testDefaultFormatComplex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testDefaultFormatComplex();
        }
    }

    @Test(timeout=1000000)
    public void testNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testNan();
        }
    }

    @Test(timeout=1000000)
    public void testPositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testPositiveInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testNegativeInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseSimpleNoDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseSimpleWithDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseNegativeReal();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseNegativeImaginary();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseNegativeBoth();
        }
    }

    @Test(timeout=1000000)
    public void testParseZeroReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseZeroReal();
        }
    }

    @Test(timeout=1000000)
    public void testParseZeroImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseZeroImaginary();
        }
    }

    @Test(timeout=1000000)
    public void testParseDifferentImaginaryChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseDifferentImaginaryChar();
        }
    }

    @Test(timeout=1000000)
    public void testParseNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParseNan();
        }
    }

    @Test(timeout=1000000)
    public void testParsePositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testParsePositiveInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testPaseNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testPaseNegativeInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorSingleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testConstructorSingleFormat();
        }
    }

    @Test(timeout=1000000)
    public void testGetImaginaryFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testGetImaginaryFormat();
        }
    }

    @Test(timeout=1000000)
    public void testGetRealFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testGetRealFormat();
        }
    }

    @Test(timeout=1000000)
    public void testFormatNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testFormatNumber();
        }
    }

    @Test(timeout=1000000)
    public void testForgottenImaginaryCharacter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexFormatTest object = new org.apache.commons.math3.complex.ComplexFormatTest();
               object.testForgottenImaginaryCharacter();
        }
    }

}