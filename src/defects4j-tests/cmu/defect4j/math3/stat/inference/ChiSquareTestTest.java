package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ChiSquareTestTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testChiSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquare();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareIndependence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareIndependence();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareLargeTestStatistic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareLargeTestStatistic();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareZeroCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareZeroCount();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareDataSetsComparisonEqualCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareDataSetsComparisonEqualCounts();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareDataSetsComparisonUnEqualCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareDataSetsComparisonUnEqualCounts();
        }
    }

    @Test(timeout=1000000)
    public void testChiSquareDataSetsComparisonBadCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.ChiSquareTestTest object = new org.apache.commons.math3.stat.inference.ChiSquareTestTest();
               object.testChiSquareDataSetsComparisonBadCounts();
        }
    }

}