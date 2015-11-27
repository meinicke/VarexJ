package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LoessInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testOnOnePoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testOnOnePoint();
        }
    }

    @Test(timeout=1000000)
    public void testOnTwoPoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testOnTwoPoints();
        }
    }

    @Test(timeout=1000000)
    public void testOnStraightLine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testOnStraightLine();
        }
    }

    @Test(timeout=1000000)
    public void testOnDistortedSine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testOnDistortedSine();
        }
    }

    @Test(timeout=1000000)
    public void testIncreasingBandwidthIncreasesSmoothness() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testIncreasingBandwidthIncreasesSmoothness();
        }
    }

    @Test(timeout=1000000)
    public void testIncreasingRobustnessItersIncreasesSmoothnessWithOutliers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testIncreasingRobustnessItersIncreasesSmoothnessWithOutliers();
        }
    }

    @Test(timeout=1000000)
    public void testUnequalSizeArguments() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testUnequalSizeArguments();
        }
    }

    @Test(timeout=1000000)
    public void testEmptyData() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testEmptyData();
        }
    }

    @Test(timeout=1000000)
    public void testNonStrictlyIncreasing1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NonMonotonicSequenceException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNonStrictlyIncreasing1();
        }
    }

    @Test(timeout=1000000)
    public void testNonStrictlyIncreasing2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NonMonotonicSequenceException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNonStrictlyIncreasing2();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal1();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal2();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal3();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal4();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal5() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal5();
        }
    }

    @Test(timeout=1000000)
    public void testNotAllFiniteReal6() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotFiniteNumberException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testNotAllFiniteReal6();
        }
    }

    @Test(timeout=1000000)
    public void testInsufficientBandwidth() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testInsufficientBandwidth();
        }
    }

    @Test(timeout=1000000)
    public void testCompletelyIncorrectBandwidth1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testCompletelyIncorrectBandwidth1();
        }
    }

    @Test(timeout=1000000)
    public void testCompletelyIncorrectBandwidth2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testCompletelyIncorrectBandwidth2();
        }
    }

    @Test(timeout=1000000)
    public void testMath296withoutWeights() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LoessInterpolatorTest();
               object.testMath296withoutWeights();
        }
    }

}