package cmu.defect4j.math3.stat.descriptive.rank;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PercentileTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void test5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.test5();
        }
    }

    @Test(timeout=120000)
    public void testPercentile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testPercentile();
        }
    }

    @Test(timeout=120000)
    public void testNISTExample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testNISTExample();
        }
    }

    @Test(timeout=120000)
    public void testHighPercentile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testHighPercentile();
        }
    }

    @Test(timeout=120000)
    public void testLowPercentile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testLowPercentile();
        }
    }

    @Test(timeout=120000)
    public void testNullEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testNullEmpty();
        }
    }

    @Test(timeout=120000)
    public void testSingleton() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testSingleton();
        }
    }

    @Test(timeout=120000)
    public void testSetQuantile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testSetQuantile();
        }
    }

    @Test(timeout=120000)
    public void testSpecialValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testSpecialValues();
        }
    }

    @Test(timeout=120000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testCopy();
        }
    }

    @Test(timeout=120000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=120000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=120000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=120000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.PercentileTest object = new org.apache.commons.math3.stat.descriptive.rank.PercentileTest();
               object.testWeightedConsistency();
        }
    }

}