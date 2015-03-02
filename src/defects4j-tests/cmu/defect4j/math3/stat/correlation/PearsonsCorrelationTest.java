package cmu.defect4j.math3.stat.correlation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PearsonsCorrelationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testConstant();
        }
    }

    @Test(timeout=120000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testLongly();
        }
    }

    @Test(timeout=120000)
    public void testSwissFertility() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testSwissFertility();
        }
    }

    @Test(timeout=120000)
    public void testInsufficientData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testInsufficientData();
        }
    }

    @Test(timeout=120000)
    public void testPValueNearZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testPValueNearZero();
        }
    }

    @Test(timeout=120000)
    public void testStdErrorConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testStdErrorConsistency();
        }
    }

    @Test(timeout=120000)
    public void testCovarianceConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testCovarianceConsistency();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testConsistency();
        }
    }

}