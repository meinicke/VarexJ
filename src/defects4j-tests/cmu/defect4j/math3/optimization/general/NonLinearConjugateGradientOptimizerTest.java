package cmu.defect4j.math3.optimization.general;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NonLinearConjugateGradientOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testTrivial();
        }
    }

    @Test(timeout=120000)
    public void testNoDependency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testNoDependency();
        }
    }

    @Test(timeout=120000)
    public void testOneSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testOneSet();
        }
    }

    @Test(timeout=120000)
    public void testTwoSets() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testTwoSets();
        }
    }

    @Test(timeout=120000)
    public void testIllConditioned() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testIllConditioned();
        }
    }

    @Test(timeout=120000)
    public void testMoreEstimatedParametersSimple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testMoreEstimatedParametersSimple();
        }
    }

    @Test(timeout=120000)
    public void testMoreEstimatedParametersUnsorted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testMoreEstimatedParametersUnsorted();
        }
    }

    @Test(timeout=120000)
    public void testRedundantEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testRedundantEquations();
        }
    }

    @Test(timeout=120000)
    public void testInconsistentEquations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testInconsistentEquations();
        }
    }

    @Test(timeout=120000)
    public void testCircleFitting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testCircleFitting();
        }
    }

    @Test(timeout=120000)
    public void testColumnsPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testColumnsPermutation();
        }
    }

    @Test(timeout=120000)
    public void testNonInversible() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest object = new org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizerTest();
               object.testNonInversible();
        }
    }

}