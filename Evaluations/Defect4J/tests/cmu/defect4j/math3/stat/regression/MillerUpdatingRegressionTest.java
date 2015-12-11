package cmu.defect4j.math3.stat.regression;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MillerUpdatingRegressionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testLongly();
        }
    }

    @Test(timeout=1000000)
    public void testHasIntercept() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testHasIntercept();
        }
    }

    @Test(timeout=1000000)
    public void testAddObsGetNClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testAddObsGetNClear();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeTestAddObs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testNegativeTestAddObs();
        }
    }

    @Test(timeout=1000000)
    public void testNegativeTestAddMultipleObs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testNegativeTestAddMultipleObs();
        }
    }

    @Test(timeout=1000000)
    public void testRegressAirlineConstantExternal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testRegressAirlineConstantExternal();
        }
    }

    @Test(timeout=1000000)
    public void testRegressAirlineConstantInternal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testRegressAirlineConstantInternal();
        }
    }

    @Test(timeout=1000000)
    public void testFilippelli() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testFilippelli();
        }
    }

    @Test(timeout=1000000)
    public void testWampler1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testWampler1();
        }
    }

    @Test(timeout=1000000)
    public void testWampler2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testWampler2();
        }
    }

    @Test(timeout=1000000)
    public void testWampler3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testWampler3();
        }
    }

    @Test(timeout=1000000)
    public void testOneRedundantColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testOneRedundantColumn();
        }
    }

    @Test(timeout=1000000)
    public void testThreeRedundantColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testThreeRedundantColumn();
        }
    }

    @Test(timeout=1000000)
    public void testPCorr() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testPCorr();
        }
    }

    @Test(timeout=1000000)
    public void testHdiag() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testHdiag();
        }
    }

    @Test(timeout=1000000)
    public void testHdiagConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testHdiagConstant();
        }
    }

    @Test(timeout=1000000)
    public void testSubsetRegression() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest object = new org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest();
               object.testSubsetRegression();
        }
    }

}