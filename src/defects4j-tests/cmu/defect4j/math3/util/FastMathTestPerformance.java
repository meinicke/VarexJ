package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastMathTestPerformance extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSimpleBenchmark() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testSimpleBenchmark();
        }
    }

    @Test(timeout=120000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testPow();
        }
    }

    @Test(timeout=120000)
    public void testExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testExp();
        }
    }

    @Test(timeout=120000)
    public void testLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testLog();
        }
    }

    @Test(timeout=120000)
    public void testAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testCos();
        }
    }

    @Test(timeout=120000)
    public void testAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testAcos();
        }
    }

    @Test(timeout=120000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testSin();
        }
    }

    @Test(timeout=120000)
    public void testAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testAsin();
        }
    }

    @Test(timeout=120000)
    public void testTan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testTan();
        }
    }

    @Test(timeout=120000)
    public void testAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testAtan();
        }
    }

    @Test(timeout=120000)
    public void testCosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testCosh();
        }
    }

    @Test(timeout=120000)
    public void testSinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testSinh();
        }
    }

    @Test(timeout=120000)
    public void testTanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testTanh();
        }
    }

    @Test(timeout=120000)
    public void testSqrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testSqrt();
        }
    }

    @Test(timeout=120000)
    public void testCbrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testCbrt();
        }
    }

    @Test(timeout=120000)
    public void testHypot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testHypot();
        }
    }

    @Test(timeout=120000)
    public void testExpm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testExpm1();
        }
    }

    @Test(timeout=120000)
    public void testLog1p() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testLog1p();
        }
    }

    @Test(timeout=120000)
    public void testLog10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.FastMathTestPerformance object = new org.apache.commons.math3.util.FastMathTestPerformance();
               object.testLog10();
        }
    }

}