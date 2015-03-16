package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SynchronizedDescriptiveStatisticsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testSetterInjection();
        }
    }

    @Test(timeout=120000)
    public void testWindowSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testWindowSize();
        }
    }

    @Test(timeout=120000)
    public void testGetValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testGetValues();
        }
    }

    @Test(timeout=120000)
    public void testShuffledStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testShuffledStatistics();
        }
    }

    @Test(timeout=120000)
    public void testPercentileSetter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testPercentileSetter();
        }
    }

    @Test(timeout=120000)
    public void test20090720() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.test20090720();
        }
    }

    @Test(timeout=120000)
    public void testRemoval() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testRemoval();
        }
    }

    @Test(timeout=120000)
    public void testSummaryConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testSummaryConsistency();
        }
    }

    @Test(timeout=120000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatisticsTest();
               object.testCopy();
        }
    }

}