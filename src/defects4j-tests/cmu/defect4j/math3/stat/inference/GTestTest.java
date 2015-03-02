package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GTestTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testGTestGoodnesOfFit1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestGoodnesOfFit1();
        }
    }

    @Test(timeout=120000)
    public void testGTestGoodnesOfFit2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestGoodnesOfFit2();
        }
    }

    @Test(timeout=120000)
    public void testGTestGoodnesOfFit3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestGoodnesOfFit3();
        }
    }

    @Test(timeout=120000)
    public void testGTestIndependance1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestIndependance1();
        }
    }

    @Test(timeout=120000)
    public void testGTestIndependance2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestIndependance2();
        }
    }

    @Test(timeout=120000)
    public void testGTestIndependance3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestIndependance3();
        }
    }

    @Test(timeout=120000)
    public void testGTestSetsComparisonBadCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testGTestSetsComparisonBadCounts();
        }
    }

    @Test(timeout=120000)
    public void testUnmatchedArrays() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testUnmatchedArrays();
        }
    }

    @Test(timeout=120000)
    public void testNegativeObservedCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testNegativeObservedCounts();
        }
    }

    @Test(timeout=120000)
    public void testZeroExpectedCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testZeroExpectedCounts();
        }
    }

    @Test(timeout=120000)
    public void testBadAlpha() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testBadAlpha();
        }
    }

    @Test(timeout=120000)
    public void testScaling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testScaling();
        }
    }

    @Test(timeout=120000)
    public void testRootLogLikelihood() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.GTestTest object = new org.apache.commons.math3.stat.inference.GTestTest();
               object.testRootLogLikelihood();
        }
    }

}