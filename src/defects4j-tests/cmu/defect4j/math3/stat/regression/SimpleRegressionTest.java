package cmu.defect4j.math3.stat.regression;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimpleRegressionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testClear();
        }
    }

    @Test(timeout=1000000)
    public void testRandom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRandom();
        }
    }

    @Test(timeout=1000000)
    public void testAppend() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testAppend();
        }
    }

    @Test(timeout=1000000)
    public void testRegressIfaceMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRegressIfaceMethod();
        }
    }

    @Test(timeout=1000000)
    public void testRegressExceptions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRegressExceptions();
        }
    }

    @Test(timeout=1000000)
    public void testNoInterceot_noint2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testNoInterceot_noint2();
        }
    }

    @Test(timeout=1000000)
    public void testNoIntercept_noint1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testNoIntercept_noint1();
        }
    }

    @Test(timeout=1000000)
    public void testNorris() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testNorris();
        }
    }

    @Test(timeout=1000000)
    public void testCorr() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testCorr();
        }
    }

    @Test(timeout=1000000)
    public void testInference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testInference();
        }
    }

    @Test(timeout=1000000)
    public void testPerfect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testPerfect();
        }
    }

    @Test(timeout=1000000)
    public void testPerfectNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testPerfectNegative();
        }
    }

    @Test(timeout=1000000)
    public void testSSENonNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testSSENonNegative();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveXY() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveXY();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveSingle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveSingle();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveMultiple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveMultiple();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveObsFromEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveObsFromEmpty();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveObsFromSingle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveObsFromSingle();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveMultipleToEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveMultipleToEmpty();
        }
    }

    @Test(timeout=1000000)
    public void testRemoveMultiplePastEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testRemoveMultiplePastEmpty();
        }
    }

    @Test(timeout=1000000)
    public void testNaNs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.SimpleRegressionTest object = new org.apache.commons.math3.stat.regression.SimpleRegressionTest();
               object.testNaNs();
        }
    }

}