package cmu.defect4j.math3.fraction;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FractionFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testFormat();
        }
    }

    @Test(timeout=120000)
    public void testFormatZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testFormatZero();
        }
    }

    @Test(timeout=120000)
    public void testFormatNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testFormatNegative();
        }
    }

    @Test(timeout=120000)
    public void testFormatImproper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testFormatImproper();
        }
    }

    @Test(timeout=120000)
    public void testFormatImproperNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testFormatImproperNegative();
        }
    }

    @Test(timeout=120000)
    public void testParse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParse();
        }
    }

    @Test(timeout=120000)
    public void testParseInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseInteger();
        }
    }

    @Test(timeout=120000)
    public void testParseInvalid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseInvalid();
        }
    }

    @Test(timeout=120000)
    public void testParseInvalidDenominator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseInvalidDenominator();
        }
    }

    @Test(timeout=120000)
    public void testParseNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseNegative();
        }
    }

    @Test(timeout=120000)
    public void testParseProper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseProper();
        }
    }

    @Test(timeout=120000)
    public void testParseProperNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseProperNegative();
        }
    }

    @Test(timeout=120000)
    public void testParseProperInvalidMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseProperInvalidMinus();
        }
    }

    @Test(timeout=120000)
    public void testNumeratorFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testNumeratorFormat();
        }
    }

    @Test(timeout=120000)
    public void testDenominatorFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testDenominatorFormat();
        }
    }

    @Test(timeout=120000)
    public void testWholeFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testWholeFormat();
        }
    }

    @Test(timeout=120000)
    public void testLongFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testLongFormat();
        }
    }

    @Test(timeout=120000)
    public void testDoubleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testDoubleFormat();
        }
    }

    @Test(timeout=120000)
    public void testParseOne1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseOne1();
        }
    }

    @Test(timeout=120000)
    public void testParseOne2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseOne2();
        }
    }

    @Test(timeout=120000)
    public void testParseZero1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseZero1();
        }
    }

    @Test(timeout=120000)
    public void testParseZero2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFormatTest object = new org.apache.commons.math3.fraction.FractionFormatTest();
               object.setUp();
               object.testParseZero2();
        }
    }

}