package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class QuaternionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAccessors1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testAccessors1();
        }
    }

    @Test(timeout=120000)
    public void testAccessors2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testAccessors2();
        }
    }

    @Test(timeout=120000)
    public void testAccessors3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testAccessors3();
        }
    }

    @Test(timeout=120000)
    public void testWrongDimension() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testWrongDimension();
        }
    }

    @Test(timeout=120000)
    public void testProductQuaternionQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testProductQuaternionQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testProductQuaternionVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testProductQuaternionVector();
        }
    }

    @Test(timeout=120000)
    public void testDotProductQuaternionQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testDotProductQuaternionQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testScalarMultiplyDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testScalarMultiplyDouble();
        }
    }

    @Test(timeout=120000)
    public void testAddQuaternionQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testAddQuaternionQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testSubtractQuaternionQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testSubtractQuaternionQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testNorm();
        }
    }

    @Test(timeout=120000)
    public void testNormalize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testNormalize();
        }
    }

    @Test(timeout=120000)
    public void testNormalizeFail() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ZeroException", config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testNormalizeFail();
        }
    }

    @Test(timeout=120000)
    public void testObjectEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testObjectEquals();
        }
    }

    @Test(timeout=120000)
    public void testQuaternionEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testQuaternionEquals();
        }
    }

    @Test(timeout=120000)
    public void testQuaternionEquals2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testQuaternionEquals2();
        }
    }

    @Test(timeout=120000)
    public void testIsUnitQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testIsUnitQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testIsPureQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testIsPureQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testPolarForm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testPolarForm();
        }
    }

    @Test(timeout=120000)
    public void testGetInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testGetInverse();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testConjugate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.QuaternionTest object = new org.apache.commons.math3.complex.QuaternionTest();
               object.testConjugate();
        }
    }

}