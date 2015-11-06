package cmu.defect4j.math3.optimization;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateDifferentiableVectorMultiStartOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNoOptimum() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest$TestException", config)) {
               org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest();
               object.testNoOptimum();
        }
    }

    @Test(timeout=1000000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest();
               object.testTrivial();
        }
    }

}