package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SemiVarianceTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testSample();
        }
    }

    @Test(timeout=120000)
    public void testInsufficientData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testInsufficientData();
        }
    }

    @Test(timeout=120000)
    public void testSingleDown() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testSingleDown();
        }
    }

    @Test(timeout=120000)
    public void testSingleUp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testSingleUp();
        }
    }

    @Test(timeout=120000)
    public void testPopulation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testPopulation();
        }
    }

    @Test(timeout=120000)
    public void testNonMeanCutoffs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testNonMeanCutoffs();
        }
    }

    @Test(timeout=120000)
    public void testVarianceDecompMeanCutoff() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testVarianceDecompMeanCutoff();
        }
    }

    @Test(timeout=120000)
    public void testVarianceDecompNonMeanCutoff() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testVarianceDecompNonMeanCutoff();
        }
    }

    @Test(timeout=120000)
    public void testNoVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest();
               object.testNoVariance();
        }
    }

}