package cmu.defect4j.math3.optim.univariate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultiStartUnivariateOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSinMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest object = new org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest();
               object.testSinMin();
        }
    }

    @Test(timeout=120000)
    public void testQuinticMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest object = new org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest();
               object.testQuinticMin();
        }
    }

    @Test(timeout=120000)
    public void testMissingMaxEval() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest object = new org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest();
               object.testMissingMaxEval();
        }
    }

    @Test(timeout=120000)
    public void testBadFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest object = new org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest();
               object.testBadFunction();
        }
    }

    @Test(timeout=120000)
    public void testMissingSearchInterval() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest object = new org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizerTest();
               object.testMissingSearchInterval();
        }
    }

}