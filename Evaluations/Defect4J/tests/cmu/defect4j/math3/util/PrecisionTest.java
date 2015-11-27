package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PrecisionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testEqualsWithRelativeTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsWithRelativeTolerance();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsIncludingNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsIncludingNaN();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsWithAllowedDelta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsWithAllowedDelta();
        }
    }

    @Test(timeout=1000000)
    public void testMath475() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testMath475();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsIncludingNaNWithAllowedDelta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsIncludingNaNWithAllowedDelta();
        }
    }

    @Test(timeout=1000000)
    public void testFloatEqualsWithAllowedUlps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testFloatEqualsWithAllowedUlps();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsWithAllowedUlps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsWithAllowedUlps();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsIncludingNaNWithAllowedUlps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testEqualsIncludingNaNWithAllowedUlps();
        }
    }

    @Test(timeout=1000000)
    public void testCompareToEpsilon() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testCompareToEpsilon();
        }
    }

    @Test(timeout=1000000)
    public void testCompareToMaxUlps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testCompareToMaxUlps();
        }
    }

    @Test(timeout=1000000)
    public void testRoundDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testRoundDouble();
        }
    }

    @Test(timeout=1000000)
    public void testRoundFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testRoundFloat();
        }
    }

    @Test(timeout=1000000)
    public void testIssue721() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testIssue721();
        }
    }

    @Test(timeout=1000000)
    public void testRepresentableDelta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testRepresentableDelta();
        }
    }

    @Test(timeout=1000000)
    public void testMath843() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PrecisionTest object = new org.apache.commons.math3.util.PrecisionTest();
               object.testMath843();
        }
    }

}