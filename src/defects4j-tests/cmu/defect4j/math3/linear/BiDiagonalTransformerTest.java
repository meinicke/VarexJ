package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BiDiagonalTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testDimensions();
        }
    }

    @Test(timeout=1000000)
    public void testAEqualUSVt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testAEqualUSVt();
        }
    }

    @Test(timeout=1000000)
    public void testUOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testUOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testVOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testVOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testBBiDiagonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testBBiDiagonal();
        }
    }

    @Test(timeout=1000000)
    public void testSingularMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testSingularMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testMatricesValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testMatricesValues();
        }
    }

    @Test(timeout=1000000)
    public void testUpperOrLower() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BiDiagonalTransformerTest object = new org.apache.commons.math3.linear.BiDiagonalTransformerTest();
               object.testUpperOrLower();
        }
    }

}