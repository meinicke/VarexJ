package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class QRDecompositionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNonInvertible() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.SingularMatrixException", config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testNonInvertible();
        }
    }

    @Test(timeout=120000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testDimensions();
        }
    }

    @Test(timeout=120000)
    public void testAEqualQR() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testAEqualQR();
        }
    }

    @Test(timeout=120000)
    public void testQOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testQOrthogonal();
        }
    }

    @Test(timeout=120000)
    public void testRUpperTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testRUpperTriangular();
        }
    }

    @Test(timeout=120000)
    public void testHTrapezoidal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testHTrapezoidal();
        }
    }

    @Test(timeout=120000)
    public void testMatricesValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.QRDecompositionTest object = new org.apache.commons.math3.linear.QRDecompositionTest();
               object.testMatricesValues();
        }
    }

}