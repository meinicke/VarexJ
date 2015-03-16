package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MathUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testHash();
        }
    }

    @Test(timeout=120000)
    public void testArrayHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testArrayHash();
        }
    }

    @Test(timeout=120000)
    public void testPermutedArrayHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testPermutedArrayHash();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testIndicatorByte();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testIndicatorInt();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testIndicatorLong();
        }
    }

    @Test(timeout=120000)
    public void testIndicatorShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testIndicatorShort();
        }
    }

    @Test(timeout=120000)
    public void testNormalizeAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testNormalizeAngle();
        }
    }

    @Test(timeout=120000)
    public void testReduce() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testReduce();
        }
    }

    @Test(timeout=120000)
    public void testReduceComparedWithNormalizeAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testReduceComparedWithNormalizeAngle();
        }
    }

    @Test(timeout=120000)
    public void testSignByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testSignByte();
        }
    }

    @Test(timeout=120000)
    public void testSignInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testSignInt();
        }
    }

    @Test(timeout=120000)
    public void testSignLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testSignLong();
        }
    }

    @Test(timeout=120000)
    public void testSignShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testSignShort();
        }
    }

    @Test(timeout=120000)
    public void testCheckFinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testCheckFinite();
        }
    }

    @Test(timeout=120000)
    public void testCheckNotNull1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testCheckNotNull1();
        }
    }

    @Test(timeout=120000)
    public void testCheckNotNull2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testCheckNotNull2();
        }
    }

    @Test(timeout=120000)
    public void testCopySignByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testCopySignByte();
        }
    }

    @Test(timeout=120000)
    public void testCopySignByte2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.util.MathUtilsTest object = new org.apache.commons.math3.util.MathUtilsTest();
               object.testCopySignByte2();
        }
    }

}