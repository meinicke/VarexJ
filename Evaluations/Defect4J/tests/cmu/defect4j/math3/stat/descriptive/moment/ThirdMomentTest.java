package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ThirdMomentTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=1000000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=1000000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1000000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testCopy();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=1000000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=1000000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest object = new org.apache.commons.math3.stat.descriptive.moment.ThirdMomentTest();
               object.testWeightedConsistency();
        }
    }

}