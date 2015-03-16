package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RootsOfUnityTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMathIllegalState1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testMathIllegalState1();
        }
    }

    @Test(timeout=120000)
    public void testMathIllegalState2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testMathIllegalState2();
        }
    }

    @Test(timeout=120000)
    public void testMathIllegalState3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testMathIllegalState3();
        }
    }

    @Test(timeout=120000)
    public void testZeroNumberOfRoots() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ZeroException", config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testZeroNumberOfRoots();
        }
    }

    @Test(timeout=120000)
    public void testGetNumberOfRoots() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testGetNumberOfRoots();
        }
    }

    @Test(timeout=120000)
    public void testComputeRoots() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.RootsOfUnityTest object = new org.apache.commons.math3.complex.RootsOfUnityTest();
               object.testComputeRoots();
        }
    }

}