package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RealMatrixFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNonDefaultSetting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testNonDefaultSetting();
        }
    }

    @Test(timeout=1000000)
    public void tesNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.tesNegativeInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testParseIgnoredWhitespace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseIgnoredWhitespace();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeAll() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNegativeAll();
        }
    }

    @Test(timeout=1000000)
    public void testParseNonDefaultSetting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNonDefaultSetting();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNegativeInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testForgottenPrefix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testForgottenPrefix();
        }
    }

    @Test(timeout=1000000)
    public void testForgottenSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testForgottenSeparator();
        }
    }

    @Test(timeout=1000000)
    public void testForgottenSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testForgottenSuffix();
        }
    }

    @Test(timeout=1000000)
    public void testParseNoComponents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNoComponents();
        }
    }

    @Test(timeout=1000000)
    public void testParseManyComponents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseManyComponents();
        }
    }

    @Test(timeout=1000000)
    public void testSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testSimpleNoDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testSimpleWithDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=1000000)
    public void testNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testNan();
        }
    }

    @Test(timeout=1000000)
    public void testPositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testPositiveInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseSimpleNoDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseSimpleWithDecimals();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=1000000)
    public void testParseNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNan();
        }
    }

    @Test(timeout=1000000)
    public void testParsePositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParsePositiveInfinity();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorSingleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testConstructorSingleFormat();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeComponent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testNegativeComponent();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeComponent2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testNegativeComponent2();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeSecondRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testNegativeSecondRow();
        }
    }

    @Test(timeout=1000000)
    public void testDefaultFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testDefaultFormat();
        }
    }

    @Test(timeout=1000000)
    public void testParseSimpleWithClosingRowSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseSimpleWithClosingRowSeparator();
        }
    }

    @Test(timeout=1000000)
    public void testParseNegativeComponent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseNegativeComponent();
        }
    }

    @Test(timeout=1000000)
    public void testParseZeroComponent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RealMatrixFormatTest object = new org.apache.commons.math3.linear.RealMatrixFormatTest();
               object.testParseZeroComponent();
        }
    }

}