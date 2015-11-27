package cmu.defect4j.math3.fitting.leastsquares;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testComputeCost() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest();
               object.testComputeCost();
        }
    }

    @Test(timeout=1000000)
    public void testComputeRMS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest();
               object.testComputeRMS();
        }
    }

    @Test(timeout=1000000)
    public void testComputeSigma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizerTest();
               object.testComputeSigma();
        }
    }

}