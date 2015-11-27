package cmu.defect4j.math3.optimization.general;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMath199() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testMath199();
        }
    }

    @Test(timeout=1000000)
    public void testControlParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testControlParameters();
        }
    }

    @Test(timeout=1000000)
    public void testBevington() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testBevington();
        }
    }

    @Test(timeout=1000000)
    public void testCircleFitting2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testCircleFitting2();
        }
    }

    @Test(timeout=1000000)
    public void testNonInvertible() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.SingularMatrixException", config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testNonInvertible();
        }
    }

    @Test(timeout=1000000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testTrivial();
        }
    }

    @Test(timeout=1000000)
    public void testQRColumnsPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testQRColumnsPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testNoDependency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testNoDependency();
        }
    }

    @Test(timeout=1000000)
    public void testOneSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testOneSet();
        }
    }

    @Test(timeout=1000000)
    public void testTwoSets() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testTwoSets();
        }
    }

    @Test(timeout=1000000)
    public void testIllConditioned() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testIllConditioned();
        }
    }

    @Test(timeout=1000000)
    public void testMoreEstimatedParametersSimple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testMoreEstimatedParametersSimple();
        }
    }

    @Test(timeout=1000000)
    public void testMoreEstimatedParametersUnsorted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testMoreEstimatedParametersUnsorted();
        }
    }

    @Test(timeout=1000000)
    public void testRedundantEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testRedundantEquations();
        }
    }

    @Test(timeout=1000000)
    public void testInconsistentEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testInconsistentEquations();
        }
    }

    @Test(timeout=1000000)
    public void testInconsistentSizes1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testInconsistentSizes1();
        }
    }

    @Test(timeout=1000000)
    public void testInconsistentSizes2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testInconsistentSizes2();
        }
    }

    @Test(timeout=1000000)
    public void testCircleFitting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testCircleFitting();
        }
    }

    @Test(timeout=1000000)
    public void testCircleFittingBadInit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testCircleFittingBadInit();
        }
    }

    @Test(timeout=1000000)
    public void testCircleFittingGoodInit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testCircleFittingGoodInit();
        }
    }

    @Test(timeout=1000000)
    public void testKirby2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testKirby2();
        }
    }

    @Test(timeout=1000000)
    public void testHahn1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest object = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizerTest();
               object.testHahn1();
        }
    }

}