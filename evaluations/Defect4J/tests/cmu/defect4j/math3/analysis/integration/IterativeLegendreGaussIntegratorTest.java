package cmu.defect4j.math3.analysis.integration;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class IterativeLegendreGaussIntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest object = new org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=1000000)
    public void testExactIntegration() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest object = new org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest();
               object.testExactIntegration();
        }
    }

    @Test(timeout=1000000)
    public void testSinFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest object = new org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest();
               object.testSinFunction();
        }
    }

    @Test(timeout=1000000)
    public void testNormalDistributionWithLargeSigma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest object = new org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest();
               object.testNormalDistributionWithLargeSigma();
        }
    }

    @Test(timeout=1000000)
    public void testIssue464() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest object = new org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegratorTest();
               object.testIssue464();
        }
    }

}