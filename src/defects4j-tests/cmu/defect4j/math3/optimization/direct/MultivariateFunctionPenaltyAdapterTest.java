package cmu.defect4j.math3.optimization.direct;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateFunctionPenaltyAdapterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testStartSimplexInsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest();
               object.testStartSimplexInsideRange();
        }
    }

    @Test(timeout=120000)
    public void testOptimumOutsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest();
               object.testOptimumOutsideRange();
        }
    }

    @Test(timeout=120000)
    public void testUnbounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest();
               object.testUnbounded();
        }
    }

    @Test(timeout=120000)
    public void testHalfBounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest();
               object.testHalfBounded();
        }
    }

    @Test(timeout=120000)
    public void testStartSimplexOutsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest object = new org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest();
               object.testStartSimplexOutsideRange();
        }
    }

}