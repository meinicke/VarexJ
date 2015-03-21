package cmu.defect4j.math3.optim.nonlinear.vector;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultiStartMultivariateVectorOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testGetOptimaBeforeOptimize() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest();
               object.testGetOptimaBeforeOptimize();
        }
    }

    @Test(timeout=1000000)
    public void testIssue914() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest();
               object.testIssue914();
        }
    }

    @Test(timeout=1000000)
    public void testNoOptimum() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest$TestException", config)) {
               org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest();
               object.testNoOptimum();
        }
    }

    @Test(timeout=1000000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizerTest();
               object.testTrivial();
        }
    }

}