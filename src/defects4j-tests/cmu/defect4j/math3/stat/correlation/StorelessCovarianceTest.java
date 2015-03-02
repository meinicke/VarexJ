package cmu.defect4j.math3.stat.correlation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StorelessCovarianceTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSymmetry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testSymmetry();
        }
    }

    @Test(timeout=120000)
    public void testLonglySimpleVar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testLonglySimpleVar();
        }
    }

    @Test(timeout=120000)
    public void testLonglySimpleCov() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testLonglySimpleCov();
        }
    }

    @Test(timeout=120000)
    public void testLonglyByRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testLonglyByRow();
        }
    }

    @Test(timeout=120000)
    public void testSwissFertilityByRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testSwissFertilityByRow();
        }
    }

    @Test(timeout=120000)
    public void testEquivalence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.StorelessCovarianceTest object = new org.apache.commons.math3.stat.correlation.StorelessCovarianceTest();
               object.testEquivalence();
        }
    }

}