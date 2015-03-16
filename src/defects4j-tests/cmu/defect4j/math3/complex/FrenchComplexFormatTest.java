package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FrenchComplexFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testSimpleNoDecimals();
        }
    }

    @Test(timeout=120000)
    public void testTrimOneImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testTrimOneImaginary();
        }
    }

    @Test(timeout=120000)
    public void testSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testSimpleWithDecimals();
        }
    }

    @Test(timeout=120000)
    public void testSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=120000)
    public void testNegativeReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testNegativeReal();
        }
    }

    @Test(timeout=120000)
    public void testNegativeImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testNegativeImaginary();
        }
    }

    @Test(timeout=120000)
    public void testNegativeBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testNegativeBoth();
        }
    }

    @Test(timeout=120000)
    public void testZeroReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testZeroReal();
        }
    }

    @Test(timeout=120000)
    public void testZeroImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testZeroImaginary();
        }
    }

    @Test(timeout=120000)
    public void testDifferentImaginaryChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testDifferentImaginaryChar();
        }
    }

    @Test(timeout=120000)
    public void testDefaultFormatComplex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testDefaultFormatComplex();
        }
    }

    @Test(timeout=120000)
    public void testNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testNan();
        }
    }

    @Test(timeout=120000)
    public void testPositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testPositiveInfinity();
        }
    }

    @Test(timeout=120000)
    public void testNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testNegativeInfinity();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseSimpleNoDecimals();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseSimpleWithDecimals();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseNegativeReal();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseNegativeImaginary();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseNegativeBoth();
        }
    }

    @Test(timeout=120000)
    public void testParseZeroReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseZeroReal();
        }
    }

    @Test(timeout=120000)
    public void testParseZeroImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseZeroImaginary();
        }
    }

    @Test(timeout=120000)
    public void testParseDifferentImaginaryChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseDifferentImaginaryChar();
        }
    }

    @Test(timeout=120000)
    public void testParseNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParseNan();
        }
    }

    @Test(timeout=120000)
    public void testParsePositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testParsePositiveInfinity();
        }
    }

    @Test(timeout=120000)
    public void testPaseNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testPaseNegativeInfinity();
        }
    }

    @Test(timeout=120000)
    public void testConstructorSingleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testConstructorSingleFormat();
        }
    }

    @Test(timeout=120000)
    public void testGetImaginaryFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testGetImaginaryFormat();
        }
    }

    @Test(timeout=120000)
    public void testGetRealFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testGetRealFormat();
        }
    }

    @Test(timeout=120000)
    public void testFormatNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testFormatNumber();
        }
    }

    @Test(timeout=120000)
    public void testForgottenImaginaryCharacter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.FrenchComplexFormatTest object = new org.apache.commons.math3.complex.FrenchComplexFormatTest();
               object.testForgottenImaginaryCharacter();
        }
    }

}