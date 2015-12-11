package cmu.defect4j.math3.optimization.general;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testGetRMS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest();
               object.testGetRMS();
        }
    }

    @Test(timeout=1000000)
    public void testGetChiSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest();
               object.testGetChiSquare();
        }
    }

    @Test(timeout=1000000)
    public void testComputeSigma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest object = new org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTest();
               object.testComputeSigma();
        }
    }

}