package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TestUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testChiSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testChiSquare();
        }
    }

    @Test(timeout=120000)
    public void testChiSquareIndependence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testChiSquareIndependence();
        }
    }

    @Test(timeout=120000)
    public void testChiSquareLargeTestStatistic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testChiSquareLargeTestStatistic();
        }
    }

    @Test(timeout=120000)
    public void testChiSquareZeroCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testChiSquareZeroCount();
        }
    }

    @Test(timeout=120000)
    public void testRootLogLikelihood() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testRootLogLikelihood();
        }
    }

    @Test(timeout=120000)
    public void testSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testSmallSamples();
        }
    }

    @Test(timeout=120000)
    public void testOneSampleT() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testOneSampleT();
        }
    }

    @Test(timeout=120000)
    public void testOneSampleTTest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testOneSampleTTest();
        }
    }

    @Test(timeout=120000)
    public void testTwoSampleTHeterscedastic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testTwoSampleTHeterscedastic();
        }
    }

    @Test(timeout=120000)
    public void testTwoSampleTHomoscedastic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testTwoSampleTHomoscedastic();
        }
    }

    @Test(timeout=120000)
    public void testPaired() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testPaired();
        }
    }

    @Test(timeout=120000)
    public void testOneWayAnovaUtils() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testOneWayAnovaUtils();
        }
    }

    @Test(timeout=120000)
    public void testGTestGoodnesOfFit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testGTestGoodnesOfFit();
        }
    }

    @Test(timeout=120000)
    public void testGTestIndependance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TestUtilsTest object = new org.apache.commons.math3.stat.inference.TestUtilsTest();
               object.testGTestIndependance();
        }
    }

}