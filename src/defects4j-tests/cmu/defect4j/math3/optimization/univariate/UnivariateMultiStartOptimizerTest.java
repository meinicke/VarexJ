package cmu.defect4j.math3.optimization.univariate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnivariateMultiStartOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSinMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testSinMin();
        }
    }

    @Test(timeout=120000)
    public void testQuinticMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testQuinticMin();
        }
    }

    @Test(timeout=120000)
    public void testBadFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testBadFunction();
        }
    }

}