package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SynchronizedMultivariateSummaryStatisticsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testToString();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testSetterInjection();
        }
    }

    @Test(timeout=1000000)
    public void testShuffledStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testShuffledStatistics();
        }
    }

    @Test(timeout=1000000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testStats();
        }
    }

    @Test(timeout=1000000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=1000000)
    public void testDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testDimension();
        }
    }

    @Test(timeout=1000000)
    public void testSetterIllegalState() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testSetterIllegalState();
        }
    }

    @Test(timeout=1000000)
    public void testNaNContracts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testNaNContracts();
        }
    }

    @Test(timeout=1000000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatisticsTest();
               object.testSerialization();
        }
    }

}