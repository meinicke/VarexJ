package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastMathTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAtan2SpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAtan2SpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testNextAfter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testNextAfter();
        }
    }

    @Test(timeout=120000)
    public void testMinMaxDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testMinMaxDouble();
        }
    }

    @Test(timeout=120000)
    public void testMinMaxFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testMinMaxFloat();
        }
    }

    @Test(timeout=120000)
    public void testHyperbolic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testHyperbolic();
        }
    }

    @Test(timeout=120000)
    public void testMath904() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testMath904();
        }
    }

    @Test(timeout=120000)
    public void testMath905LargePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testMath905LargePositive();
        }
    }

    @Test(timeout=120000)
    public void testMath905LargeNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testMath905LargeNegative();
        }
    }

    @Test(timeout=120000)
    public void testHyperbolicInverses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testHyperbolicInverses();
        }
    }

    @Test(timeout=120000)
    public void testLogAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLogAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testLog10Accuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLog10Accuracy();
        }
    }

    @Test(timeout=120000)
    public void testLog1pAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLog1pAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testLog1pSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLog1pSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testLogSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLogSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testExpSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testExpSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testPowSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testPowSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testPowAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testPowAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testExpAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testExpAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testSinAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testSinAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testCosAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testCosAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testTanAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testTanAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testAtanAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAtanAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testAtan2Accuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAtan2Accuracy();
        }
    }

    @Test(timeout=120000)
    public void testExpm1Accuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testExpm1Accuracy();
        }
    }

    @Test(timeout=120000)
    public void testAsinAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAsinAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testAcosAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAcosAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testAcosSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAcosSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testAsinSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testAsinSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testSinhAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testSinhAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testCoshAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testCoshAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testTanhAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testTanhAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testCbrtAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testCbrtAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testToDegrees() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testToDegrees();
        }
    }

    @Test(timeout=120000)
    public void testToRadians() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testToRadians();
        }
    }

    @Test(timeout=120000)
    public void testDoubleNextAfterSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testDoubleNextAfterSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testFloatNextAfterSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testFloatNextAfterSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testDoubleScalbSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testDoubleScalbSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testFloatScalbSpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testFloatScalbSpecialCases();
        }
    }

    @Test(timeout=120000)
    public void checkMissingFastMathClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.checkMissingFastMathClasses();
        }
    }

    @Test(timeout=120000)
    public void checkExtraFastMathClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.checkExtraFastMathClasses();
        }
    }

    @Test(timeout=120000)
    public void testSignumDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testSignumDouble();
        }
    }

    @Test(timeout=120000)
    public void testSignumFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testSignumFloat();
        }
    }

    @Test(timeout=120000)
    public void testLogWithBase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testLogWithBase();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testIndicatorDouble();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testIndicatorFloat();
        }
    }

    @Test(timeout=120000)
    public void testIntPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testIntPow();
        }
    }

    @Test(timeout=120000)
    public void testConstants() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTest object = new org.apache.commons.math3.util.FastMathTest();
               object.setUp();
               object.testConstants();
        }
    }

}