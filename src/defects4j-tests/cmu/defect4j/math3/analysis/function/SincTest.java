package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SincTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testShortcut() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testShortcut();
        }
    }

    @Test(timeout=120000)
    public void testCrossings() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testCrossings();
        }
    }

    @Test(timeout=120000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testZero();
        }
    }

    @Test(timeout=120000)
    public void testEuler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testEuler();
        }
    }

    @Test(timeout=120000)
    public void testDerivativeZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testDerivativeZero();
        }
    }

    @Test(timeout=120000)
    public void testDerivatives1Dot2Unnormalized() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testDerivatives1Dot2Unnormalized();
        }
    }

    @Test(timeout=120000)
    public void testDerivatives1Dot2Normalized() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testDerivatives1Dot2Normalized();
        }
    }

    @Test(timeout=120000)
    public void testDerivativeShortcut() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SincTest object = new org.apache.commons.math3.analysis.function.SincTest();
               object.testDerivativeShortcut();
        }
    }

}