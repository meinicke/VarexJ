package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FrenchVector3DFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNegativeX() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testNegativeX();
        }
    }

    @Test(timeout=120000)
    public void testNegativeY() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testNegativeY();
        }
    }

    @Test(timeout=120000)
    public void testNegativeZ() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testNegativeZ();
        }
    }

    @Test(timeout=120000)
    public void testNonDefaultSetting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testNonDefaultSetting();
        }
    }

    @Test(timeout=120000)
    public void testDefaultFormatVector3D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testDefaultFormatVector3D();
        }
    }

    @Test(timeout=120000)
    public void tesNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.tesNegativeInfinity();
        }
    }

    @Test(timeout=120000)
    public void testParseIgnoredWhitespace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseIgnoredWhitespace();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeX() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNegativeX();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeY() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNegativeY();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeZ() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNegativeZ();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeAll() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNegativeAll();
        }
    }

    @Test(timeout=120000)
    public void testParseZeroX() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseZeroX();
        }
    }

    @Test(timeout=120000)
    public void testParseNonDefaultSetting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNonDefaultSetting();
        }
    }

    @Test(timeout=120000)
    public void testParseNegativeInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNegativeInfinity();
        }
    }

    @Test(timeout=120000)
    public void testForgottenPrefix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testForgottenPrefix();
        }
    }

    @Test(timeout=120000)
    public void testForgottenSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testForgottenSeparator();
        }
    }

    @Test(timeout=120000)
    public void testForgottenSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testForgottenSuffix();
        }
    }

    @Test(timeout=120000)
    public void testSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testSimpleNoDecimals();
        }
    }

    @Test(timeout=120000)
    public void testSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testSimpleWithDecimals();
        }
    }

    @Test(timeout=120000)
    public void testSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=120000)
    public void testNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testNan();
        }
    }

    @Test(timeout=120000)
    public void testPositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testPositiveInfinity();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleNoDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseSimpleNoDecimals();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleWithDecimals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseSimpleWithDecimals();
        }
    }

    @Test(timeout=120000)
    public void testParseSimpleWithDecimalsTrunc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseSimpleWithDecimalsTrunc();
        }
    }

    @Test(timeout=120000)
    public void testParseNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParseNan();
        }
    }

    @Test(timeout=120000)
    public void testParsePositiveInfinity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testParsePositiveInfinity();
        }
    }

    @Test(timeout=120000)
    public void testConstructorSingleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest object = new org.apache.commons.math3.geometry.euclidean.threed.FrenchVector3DFormatTest();
               object.testConstructorSingleFormat();
        }
    }

}