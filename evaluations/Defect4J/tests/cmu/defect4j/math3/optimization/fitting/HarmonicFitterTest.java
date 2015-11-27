package cmu.defect4j.math3.optimization.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HarmonicFitterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testInitialGuess();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1000000)
    public void testNoError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testNoError();
        }
    }

    @Test(timeout=1000000)
    public void test1PercentError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.test1PercentError();
        }
    }

    @Test(timeout=1000000)
    public void testTinyVariationsData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testTinyVariationsData();
        }
    }

    @Test(timeout=1000000)
    public void testUnsorted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testUnsorted();
        }
    }

    @Test(timeout=1000000)
    public void testMath844() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.optimization.fitting.HarmonicFitterTest object = new org.apache.commons.math3.optimization.fitting.HarmonicFitterTest();
               object.testMath844();
        }
    }

}