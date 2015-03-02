package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ComplexTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSubtract();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNegate();
        }
    }

    @Test(timeout=120000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocal();
        }
    }

    @Test(timeout=120000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testPow();
        }
    }

    @Test(timeout=120000)
    public void testExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testExp();
        }
    }

    @Test(timeout=120000)
    public void testLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testLog();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCos();
        }
    }

    @Test(timeout=120000)
    public void testAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAcos();
        }
    }

    @Test(timeout=120000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSin();
        }
    }

    @Test(timeout=120000)
    public void testAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAsin();
        }
    }

    @Test(timeout=120000)
    public void testTan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTan();
        }
    }

    @Test(timeout=120000)
    public void testAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAtan();
        }
    }

    @Test(timeout=120000)
    public void testCosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCosh();
        }
    }

    @Test(timeout=120000)
    public void testSinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSinh();
        }
    }

    @Test(timeout=120000)
    public void testTanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanh();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testConstructorNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testConstructorNaN();
        }
    }

    @Test(timeout=120000)
    public void testAbsNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAbsNaN();
        }
    }

    @Test(timeout=120000)
    public void testAbsInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAbsInfinite();
        }
    }

    @Test(timeout=120000)
    public void testAddNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAddNaN();
        }
    }

    @Test(timeout=120000)
    public void testAddInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAddInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=120000)
    public void testScalarAddNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarAddNaN();
        }
    }

    @Test(timeout=120000)
    public void testScalarAddInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarAddInf();
        }
    }

    @Test(timeout=120000)
    public void testConjugate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testConjugate();
        }
    }

    @Test(timeout=120000)
    public void testConjugateNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testConjugateNaN();
        }
    }

    @Test(timeout=120000)
    public void testConjugateInfiinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testConjugateInfiinite();
        }
    }

    @Test(timeout=120000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivide();
        }
    }

    @Test(timeout=120000)
    public void testDivideReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideReal();
        }
    }

    @Test(timeout=120000)
    public void testDivideImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideImaginary();
        }
    }

    @Test(timeout=120000)
    public void testDivideInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideInf();
        }
    }

    @Test(timeout=120000)
    public void testDivideZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideZero();
        }
    }

    @Test(timeout=120000)
    public void testDivideZeroZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideZeroZero();
        }
    }

    @Test(timeout=120000)
    public void testDivideNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideNaN();
        }
    }

    @Test(timeout=120000)
    public void testDivideNaNInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testDivideNaNInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarDivide();
        }
    }

    @Test(timeout=120000)
    public void testScalarDivideNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarDivideNaN();
        }
    }

    @Test(timeout=120000)
    public void testScalarDivideInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarDivideInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarDivideZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarDivideZero();
        }
    }

    @Test(timeout=120000)
    public void testReciprocalReal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocalReal();
        }
    }

    @Test(timeout=120000)
    public void testReciprocalImaginary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocalImaginary();
        }
    }

    @Test(timeout=120000)
    public void testReciprocalInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocalInf();
        }
    }

    @Test(timeout=120000)
    public void testReciprocalZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocalZero();
        }
    }

    @Test(timeout=120000)
    public void testReciprocalNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testReciprocalNaN();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testMultiplyNaN();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyInfInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testMultiplyInfInf();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyNaNInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testMultiplyNaNInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarMultiply();
        }
    }

    @Test(timeout=120000)
    public void testScalarMultiplyNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarMultiplyNaN();
        }
    }

    @Test(timeout=120000)
    public void testScalarMultiplyInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarMultiplyInf();
        }
    }

    @Test(timeout=120000)
    public void testNegateNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNegateNaN();
        }
    }

    @Test(timeout=120000)
    public void testSubtractNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSubtractNaN();
        }
    }

    @Test(timeout=120000)
    public void testSubtractInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSubtractInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarSubtract();
        }
    }

    @Test(timeout=120000)
    public void testScalarSubtractNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarSubtractNaN();
        }
    }

    @Test(timeout=120000)
    public void testScalarSubtractInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarSubtractInf();
        }
    }

    @Test(timeout=120000)
    public void testEqualsNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsNull();
        }
    }

    @Test(timeout=120000)
    public void testEqualsClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsClass();
        }
    }

    @Test(timeout=120000)
    public void testEqualsSame() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsSame();
        }
    }

    @Test(timeout=120000)
    public void testEqualsTrue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsTrue();
        }
    }

    @Test(timeout=120000)
    public void testEqualsRealDifference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsRealDifference();
        }
    }

    @Test(timeout=120000)
    public void testEqualsImaginaryDifference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsImaginaryDifference();
        }
    }

    @Test(timeout=120000)
    public void testEqualsNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testEqualsNaN();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testAcosInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAcosInf();
        }
    }

    @Test(timeout=120000)
    public void testAcosNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAcosNaN();
        }
    }

    @Test(timeout=120000)
    public void testAsinNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAsinNaN();
        }
    }

    @Test(timeout=120000)
    public void testAsinInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAsinInf();
        }
    }

    @Test(timeout=120000)
    public void testAtanInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAtanInf();
        }
    }

    @Test(timeout=120000)
    public void testAtanI() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAtanI();
        }
    }

    @Test(timeout=120000)
    public void testAtanNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testAtanNaN();
        }
    }

    @Test(timeout=120000)
    public void testCosNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCosNaN();
        }
    }

    @Test(timeout=120000)
    public void testCosInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCosInf();
        }
    }

    @Test(timeout=120000)
    public void testCoshNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCoshNaN();
        }
    }

    @Test(timeout=120000)
    public void testCoshInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testCoshInf();
        }
    }

    @Test(timeout=120000)
    public void testExpNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testExpNaN();
        }
    }

    @Test(timeout=120000)
    public void testExpInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testExpInf();
        }
    }

    @Test(timeout=120000)
    public void testLogNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testLogNaN();
        }
    }

    @Test(timeout=120000)
    public void testLogInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testLogInf();
        }
    }

    @Test(timeout=120000)
    public void testLogZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testLogZero();
        }
    }

    @Test(timeout=120000)
    public void testPowNaNBase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testPowNaNBase();
        }
    }

    @Test(timeout=120000)
    public void testPowNaNExponent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testPowNaNExponent();
        }
    }

    @Test(timeout=120000)
    public void testPowInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testPowInf();
        }
    }

    @Test(timeout=120000)
    public void testPowZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testPowZero();
        }
    }

    @Test(timeout=120000)
    public void testScalarPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarPow();
        }
    }

    @Test(timeout=120000)
    public void testScalarPowNaNBase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarPowNaNBase();
        }
    }

    @Test(timeout=120000)
    public void testScalarPowNaNExponent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarPowNaNExponent();
        }
    }

    @Test(timeout=120000)
    public void testScalarPowInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarPowInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarPowZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testScalarPowZero();
        }
    }

    @Test(timeout=120000)
    public void testpowNull() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testpowNull();
        }
    }

    @Test(timeout=120000)
    public void testSinInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSinInf();
        }
    }

    @Test(timeout=120000)
    public void testSinNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSinNaN();
        }
    }

    @Test(timeout=120000)
    public void testSinhNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSinhNaN();
        }
    }

    @Test(timeout=120000)
    public void testSinhInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSinhInf();
        }
    }

    @Test(timeout=120000)
    public void testSqrtRealPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtRealPositive();
        }
    }

    @Test(timeout=120000)
    public void testSqrtRealZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtRealZero();
        }
    }

    @Test(timeout=120000)
    public void testSqrtRealNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtRealNegative();
        }
    }

    @Test(timeout=120000)
    public void testSqrtImaginaryZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtImaginaryZero();
        }
    }

    @Test(timeout=120000)
    public void testSqrtImaginaryNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtImaginaryNegative();
        }
    }

    @Test(timeout=120000)
    public void testSqrtPolar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtPolar();
        }
    }

    @Test(timeout=120000)
    public void testSqrtNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtNaN();
        }
    }

    @Test(timeout=120000)
    public void testSqrtInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrtInf();
        }
    }

    @Test(timeout=120000)
    public void testSqrt1z() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrt1z();
        }
    }

    @Test(timeout=120000)
    public void testSqrt1zNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testSqrt1zNaN();
        }
    }

    @Test(timeout=120000)
    public void testTanNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanNaN();
        }
    }

    @Test(timeout=120000)
    public void testTanInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanInf();
        }
    }

    @Test(timeout=120000)
    public void testTanCritical() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanCritical();
        }
    }

    @Test(timeout=120000)
    public void testTanhNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanhNaN();
        }
    }

    @Test(timeout=120000)
    public void testTanhInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanhInf();
        }
    }

    @Test(timeout=120000)
    public void testTanhCritical() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testTanhCritical();
        }
    }

    @Test(timeout=120000)
    public void testMath221() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testMath221();
        }
    }

    @Test(timeout=120000)
    public void testNthRoot_normal_thirdRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNthRoot_normal_thirdRoot();
        }
    }

    @Test(timeout=120000)
    public void testNthRoot_normal_fourthRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNthRoot_normal_fourthRoot();
        }
    }

    @Test(timeout=120000)
    public void testNthRoot_cornercase_thirdRoot_imaginaryPartEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNthRoot_cornercase_thirdRoot_imaginaryPartEmpty();
        }
    }

    @Test(timeout=120000)
    public void testNthRoot_cornercase_thirdRoot_realPartZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNthRoot_cornercase_thirdRoot_realPartZero();
        }
    }

    @Test(timeout=120000)
    public void testNthRoot_cornercase_NAN_Inf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testNthRoot_cornercase_NAN_Inf();
        }
    }

    @Test(timeout=120000)
    public void testGetArgument() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testGetArgument();
        }
    }

    @Test(timeout=120000)
    public void testGetArgumentInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testGetArgumentInf();
        }
    }

    @Test(timeout=120000)
    public void testGetArgumentNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexTest object = new org.apache.commons.math3.complex.ComplexTest();
               object.testGetArgumentNaN();
        }
    }

}