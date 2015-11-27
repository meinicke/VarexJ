package cmu.defect4j.math3.optim.nonlinear.scalar;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateFunctionPenaltyAdapterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testStartSimplexInsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest();
               object.testStartSimplexInsideRange();
        }
    }

    @Test(timeout=1000000)
    public void testOptimumOutsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest();
               object.testOptimumOutsideRange();
        }
    }

    @Test(timeout=1000000)
    public void testUnbounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest();
               object.testUnbounded();
        }
    }

    @Test(timeout=1000000)
    public void testHalfBounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest();
               object.testHalfBounded();
        }
    }

    @Test(timeout=1000000)
    public void testStartSimplexOutsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest();
               object.testStartSimplexOutsideRange();
        }
    }

}