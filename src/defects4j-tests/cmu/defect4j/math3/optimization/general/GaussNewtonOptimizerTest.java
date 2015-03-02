package cmu.defect4j.math3.optimization.general;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GaussNewtonOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMoreEstimatedParametersSimple() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testMoreEstimatedParametersSimple();
        }
    }

    @Test(timeout=120000)
    public void testMoreEstimatedParametersUnsorted() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testMoreEstimatedParametersUnsorted();
        }
    }

    @Test(timeout=120000)
    public void testCircleFittingBadInit() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testCircleFittingBadInit();
        }
    }

    @Test(timeout=120000)
    public void testHahn1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testHahn1();
        }
    }

    @Test(timeout=120000)
    public void testMaxEvaluations() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testMaxEvaluations();
        }
    }

    @Test(timeout=120000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testTrivial();
        }
    }

    @Test(timeout=120000)
    public void testQRColumnsPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testQRColumnsPermutation();
        }
    }

    @Test(timeout=120000)
    public void testNoDependency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testNoDependency();
        }
    }

    @Test(timeout=120000)
    public void testOneSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testOneSet();
        }
    }

    @Test(timeout=120000)
    public void testTwoSets() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testTwoSets();
        }
    }

    @Test(timeout=120000)
    public void testNonInvertible() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testNonInvertible();
        }
    }

    @Test(timeout=120000)
    public void testIllConditioned() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testIllConditioned();
        }
    }

    @Test(timeout=120000)
    public void testRedundantEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testRedundantEquations();
        }
    }

    @Test(timeout=120000)
    public void testInconsistentEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testInconsistentEquations();
        }
    }

    @Test(timeout=120000)
    public void testInconsistentSizes1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testInconsistentSizes1();
        }
    }

    @Test(timeout=120000)
    public void testInconsistentSizes2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testInconsistentSizes2();
        }
    }

    @Test(timeout=120000)
    public void testCircleFitting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testCircleFitting();
        }
    }

    @Test(timeout=120000)
    public void testCircleFittingGoodInit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testCircleFittingGoodInit();
        }
    }

    @Test(timeout=120000)
    public void testKirby2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest object = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizerTest();
               object.testKirby2();
        }
    }

}