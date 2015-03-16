package cmu.defect4j.math3.optim.univariate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BrentOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSinMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testSinMin();
        }
    }

    @Test(timeout=120000)
    public void testSinMinWithValueChecker() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testSinMinWithValueChecker();
        }
    }

    @Test(timeout=120000)
    public void testQuinticMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testQuinticMin();
        }
    }

    @Test(timeout=120000)
    public void testQuinticMinStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testQuinticMinStatistics();
        }
    }

    @Test(timeout=120000)
    public void testQuinticMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testQuinticMax();
        }
    }

    @Test(timeout=120000)
    public void testMinEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testMinEndpoints();
        }
    }

    @Test(timeout=120000)
    public void testKeepInitIfBest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testKeepInitIfBest();
        }
    }

    @Test(timeout=120000)
    public void testMath855() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testMath855();
        }
    }

    @Test(timeout=120000)
    public void testMath832() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testMath832();
        }
    }

    @Test(timeout=120000)
    public void testBoundaries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.univariate.BrentOptimizerTest object = new org.apache.commons.math3.optim.univariate.BrentOptimizerTest();
               object.testBoundaries();
        }
    }

}