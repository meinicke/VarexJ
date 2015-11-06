package cmu.defect4j.math3.analysis.integration.gauss;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LegendreHighPrecisionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionTest object = new org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionTest();
               object.testInverse();
        }
    }

    @Test(timeout=1000000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionTest object = new org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionTest();
               object.testCos();
        }
    }

}