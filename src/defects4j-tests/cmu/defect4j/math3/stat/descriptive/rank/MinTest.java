package cmu.defect4j.math3.stat.descriptive.rank;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MinTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNaNs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testNaNs();
        }
    }

    @Test(timeout=120000)
    public void testSpecialValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testSpecialValues();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testConsistency();
        }
    }

    @Test(timeout=120000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=120000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=120000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=120000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=120000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testCopy();
        }
    }

    @Test(timeout=120000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=120000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=120000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=120000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MinTest object = new org.apache.commons.math3.stat.descriptive.rank.MinTest();
               object.testWeightedConsistency();
        }
    }

}