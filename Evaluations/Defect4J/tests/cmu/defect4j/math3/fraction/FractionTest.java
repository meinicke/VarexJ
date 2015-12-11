package cmu.defect4j.math3.fraction;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FractionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testDivide();
        }
    }

    @Test(timeout=1000000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testToString();
        }
    }

    @Test(timeout=1000000)
    public void testGoldenRatio() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testGoldenRatio();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testDoubleConstructor();
        }
    }

    @Test(timeout=1000000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=1000000)
    public void testDigitLimitConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testDigitLimitConstructor();
        }
    }

    @Test(timeout=1000000)
    public void testEpsilonLimitConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testEpsilonLimitConstructor();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testDoubleValue();
        }
    }

    @Test(timeout=1000000)
    public void testFloatValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testFloatValue();
        }
    }

    @Test(timeout=1000000)
    public void testLongValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testLongValue();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testConstructorDouble();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testGetReducedFraction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testGetReducedFraction();
        }
    }

    @Test(timeout=1000000)
    public void testPercentage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testPercentage();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testIntValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testIntValue();
        }
    }

    @Test(timeout=1000000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testConstructor();
        }
    }

    @Test(timeout=1000000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testAdd();
        }
    }

    @Test(timeout=1000000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testSubtract();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testMultiply();
        }
    }

    @Test(timeout=1000000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testNegate();
        }
    }

    @Test(timeout=1000000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testReciprocal();
        }
    }

    @Test(timeout=1000000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testAbs();
        }
    }

    @Test(timeout=1000000)
    public void testIntegerOverflow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testIntegerOverflow();
        }
    }

    @Test(timeout=1000000)
    public void testMath835() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionTest object = new org.apache.commons.math3.fraction.FractionTest();
               object.testMath835();
        }
    }

}