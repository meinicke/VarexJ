package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SynchronizedSummaryStatisticsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testSetterInjection();
        }
    }

    @Test(timeout=1000000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testStats();
        }
    }

    @Test(timeout=1000000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=1000000)
    public void testProductAndGeometricMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testProductAndGeometricMean();
        }
    }

    @Test(timeout=1000000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testCopy();
        }
    }

    @Test(timeout=1000000)
    public void testGetSummary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testGetSummary();
        }
    }

    @Test(timeout=1000000)
    public void testOverrideVarianceWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testOverrideVarianceWithMathClass();
        }
    }

    @Test(timeout=1000000)
    public void testOverrideMeanWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testOverrideMeanWithMathClass();
        }
    }

    @Test(timeout=1000000)
    public void testOverrideGeoMeanWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testOverrideGeoMeanWithMathClass();
        }
    }

    @Test(timeout=1000000)
    public void testSetterIllegalState() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testSetterIllegalState();
        }
    }

    @Test(timeout=1000000)
    public void testNaNContracts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testNaNContracts();
        }
    }

    @Test(timeout=1000000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatisticsTest();
               object.testSerialization();
        }
    }

}