package cmu.defect4j.math3.analysis.integration.gauss;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HermiteTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNormalDistribution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.HermiteTest object = new org.apache.commons.math3.analysis.integration.gauss.HermiteTest();
               object.testNormalDistribution();
        }
    }

    @Test(timeout=1000000)
    public void testNormalMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.HermiteTest object = new org.apache.commons.math3.analysis.integration.gauss.HermiteTest();
               object.testNormalMean();
        }
    }

    @Test(timeout=1000000)
    public void testNormalVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.HermiteTest object = new org.apache.commons.math3.analysis.integration.gauss.HermiteTest();
               object.testNormalVariance();
        }
    }

}