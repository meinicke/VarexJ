package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MeanTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testSmallSamples();
        }
    }

    @Test(timeout=1000000)
    public void testWeightedMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testWeightedMean();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=1000000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=1000000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1000000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testCopy();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=1000000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.MeanTest object = new org.apache.commons.math3.stat.descriptive.moment.MeanTest();
               object.testWeightedConsistency();
        }
    }

}