package cmu.defect4j.math3.stat;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StatUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testMode();
        }
    }

    @Test(timeout=120000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testStats();
        }
    }

    @Test(timeout=120000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=120000)
    public void testPercentile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testPercentile();
        }
    }

    @Test(timeout=120000)
    public void testArrayIndexConditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testArrayIndexConditions();
        }
    }

    @Test(timeout=120000)
    public void testSumSq() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testSumSq();
        }
    }

    @Test(timeout=120000)
    public void testProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testProduct();
        }
    }

    @Test(timeout=120000)
    public void testSumLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testSumLog();
        }
    }

    @Test(timeout=120000)
    public void testVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testVariance();
        }
    }

    @Test(timeout=120000)
    public void testPopulationVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testPopulationVariance();
        }
    }

    @Test(timeout=120000)
    public void testMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testMax();
        }
    }

    @Test(timeout=120000)
    public void testMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testMin();
        }
    }

    @Test(timeout=120000)
    public void testDifferenceStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testDifferenceStats();
        }
    }

    @Test(timeout=120000)
    public void testGeometricMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testGeometricMean();
        }
    }

    @Test(timeout=120000)
    public void testNormalize1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testNormalize1();
        }
    }

    @Test(timeout=120000)
    public void testNormalize2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testNormalize2();
        }
    }

    @Test(timeout=120000)
    public void testMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.StatUtilsTest object = new org.apache.commons.math3.stat.StatUtilsTest();
               object.testMean();
        }
    }

}