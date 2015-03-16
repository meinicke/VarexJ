package cmu.defect4j.math3.analysis.differentiation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DerivativeStructureTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testTooLargeOrder() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTooLargeOrder();
        }
    }

    @Test(timeout=120000)
    public void testMissingOrders() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testMissingOrders();
        }
    }

    @Test(timeout=120000)
    public void testWrongVariableIndex() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testWrongVariableIndex();
        }
    }

    @Test(timeout=120000)
    public void testVariableWithoutDerivative0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testVariableWithoutDerivative0();
        }
    }

    @Test(timeout=120000)
    public void testVariableWithoutDerivative1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testVariableWithoutDerivative1();
        }
    }

    @Test(timeout=120000)
    public void testVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testVariable();
        }
    }

    @Test(timeout=120000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testConstant();
        }
    }

    @Test(timeout=120000)
    public void testCreateConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCreateConstant();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPrimitiveAdd();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPrimitiveSubtract();
        }
    }

    @Test(timeout=120000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSubtract();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPrimitiveMultiply();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testNegate();
        }
    }

    @Test(timeout=120000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testReciprocal();
        }
    }

    @Test(timeout=120000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPow();
        }
    }

    @Test(timeout=120000)
    public void testPowDoubleDS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPowDoubleDS();
        }
    }

    @Test(timeout=120000)
    public void testExpression() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testExpression();
        }
    }

    @Test(timeout=120000)
    public void testCompositionOneVariableX() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCompositionOneVariableX();
        }
    }

    @Test(timeout=120000)
    public void testTrigo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTrigo();
        }
    }

    @Test(timeout=120000)
    public void testSqrtDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSqrtDefinition();
        }
    }

    @Test(timeout=120000)
    public void testRootNSingularity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRootNSingularity();
        }
    }

    @Test(timeout=120000)
    public void testSqrtPow2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSqrtPow2();
        }
    }

    @Test(timeout=120000)
    public void testCbrtDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCbrtDefinition();
        }
    }

    @Test(timeout=120000)
    public void testCbrtPow3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCbrtPow3();
        }
    }

    @Test(timeout=120000)
    public void testPowReciprocalPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPowReciprocalPow();
        }
    }

    @Test(timeout=120000)
    public void testHypotDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHypotDefinition();
        }
    }

    @Test(timeout=120000)
    public void testHypotNoOverflow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHypotNoOverflow();
        }
    }

    @Test(timeout=120000)
    public void testHypotNeglectible() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHypotNeglectible();
        }
    }

    @Test(timeout=120000)
    public void testHypotSpecial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHypotSpecial();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveRemainder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPrimitiveRemainder();
        }
    }

    @Test(timeout=120000)
    public void testRemainder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRemainder();
        }
    }

    @Test(timeout=120000)
    public void testExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testExp();
        }
    }

    @Test(timeout=120000)
    public void testExpm1Definition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testExpm1Definition();
        }
    }

    @Test(timeout=120000)
    public void testLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog();
        }
    }

    @Test(timeout=120000)
    public void testLog1pDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog1pDefinition();
        }
    }

    @Test(timeout=120000)
    public void testLog10Definition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog10Definition();
        }
    }

    @Test(timeout=120000)
    public void testLogExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLogExp();
        }
    }

    @Test(timeout=120000)
    public void testLog1pExpm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog1pExpm1();
        }
    }

    @Test(timeout=120000)
    public void testLog10Power() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog10Power();
        }
    }

    @Test(timeout=120000)
    public void testSinCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSinCos();
        }
    }

    @Test(timeout=120000)
    public void testSinAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSinAsin();
        }
    }

    @Test(timeout=120000)
    public void testCosAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCosAcos();
        }
    }

    @Test(timeout=120000)
    public void testTanAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTanAtan();
        }
    }

    @Test(timeout=120000)
    public void testTangentDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTangentDefinition();
        }
    }

    @Test(timeout=120000)
    public void testAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAtan2SpecialCases() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAtan2SpecialCases();
        }
    }

    @Test(timeout=120000)
    public void testSinhDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSinhDefinition();
        }
    }

    @Test(timeout=120000)
    public void testCoshDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCoshDefinition();
        }
    }

    @Test(timeout=120000)
    public void testTanhDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTanhDefinition();
        }
    }

    @Test(timeout=120000)
    public void testSinhAsinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSinhAsinh();
        }
    }

    @Test(timeout=120000)
    public void testCoshAcosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCoshAcosh();
        }
    }

    @Test(timeout=120000)
    public void testTanhAtanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTanhAtanh();
        }
    }

    @Test(timeout=120000)
    public void testCompositionOneVariableY() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCompositionOneVariableY();
        }
    }

    @Test(timeout=120000)
    public void testTaylorPolynomial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTaylorPolynomial();
        }
    }

    @Test(timeout=120000)
    public void testTaylorAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTaylorAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testSignum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSignum();
        }
    }

    @Test(timeout=120000)
    public void testCeilFloorRintLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCeilFloorRintLong();
        }
    }

    @Test(timeout=120000)
    public void testCopySign() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCopySign();
        }
    }

    @Test(timeout=120000)
    public void testToDegreesDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testToDegreesDefinition();
        }
    }

    @Test(timeout=120000)
    public void testToRadiansDefinition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testToRadiansDefinition();
        }
    }

    @Test(timeout=120000)
    public void testDegRad() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testDegRad();
        }
    }

    @Test(timeout=120000)
    public void testComposeMismatchedDimensions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testComposeMismatchedDimensions();
        }
    }

    @Test(timeout=120000)
    public void testCompose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCompose();
        }
    }

    @Test(timeout=120000)
    public void testField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testField();
        }
    }

    @Test(timeout=120000)
    public void testOneParameterConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testOneParameterConstructor();
        }
    }

    @Test(timeout=120000)
    public void testOneOrderConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testOneOrderConstructor();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombination1DSDS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombination1DSDS();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombination1DoubleDS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombination1DoubleDS();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombination2DSDS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombination2DSDS();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombination2DoubleDS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombination2DoubleDS();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testAddField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAddField();
        }
    }

    @Test(timeout=120000)
    public void testAddDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAddDouble();
        }
    }

    @Test(timeout=120000)
    public void testSubtractField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSubtractField();
        }
    }

    @Test(timeout=120000)
    public void testSubtractDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSubtractDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testMultiplyField();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testMultiplyDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testMultiplyInt();
        }
    }

    @Test(timeout=120000)
    public void testDivideField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testDivideField();
        }
    }

    @Test(timeout=120000)
    public void testDivideDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testDivideDouble();
        }
    }

    @Test(timeout=120000)
    public void testRemainderField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRemainderField();
        }
    }

    @Test(timeout=120000)
    public void testRemainderDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRemainderDouble();
        }
    }

    @Test(timeout=120000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCos();
        }
    }

    @Test(timeout=120000)
    public void testAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAcos();
        }
    }

    @Test(timeout=120000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSin();
        }
    }

    @Test(timeout=120000)
    public void testAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAsin();
        }
    }

    @Test(timeout=120000)
    public void testTan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTan();
        }
    }

    @Test(timeout=120000)
    public void testAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAtan();
        }
    }

    @Test(timeout=120000)
    public void testCosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCosh();
        }
    }

    @Test(timeout=120000)
    public void testAcosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAcosh();
        }
    }

    @Test(timeout=120000)
    public void testSinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSinh();
        }
    }

    @Test(timeout=120000)
    public void testAsinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAsinh();
        }
    }

    @Test(timeout=120000)
    public void testTanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testTanh();
        }
    }

    @Test(timeout=120000)
    public void testAtanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testAtanh();
        }
    }

    @Test(timeout=120000)
    public void testSqrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testSqrt();
        }
    }

    @Test(timeout=120000)
    public void testCbrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCbrt();
        }
    }

    @Test(timeout=120000)
    public void testHypot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHypot();
        }
    }

    @Test(timeout=120000)
    public void testRootN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRootN();
        }
    }

    @Test(timeout=120000)
    public void testPowField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPowField();
        }
    }

    @Test(timeout=120000)
    public void testPowDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPowDouble();
        }
    }

    @Test(timeout=120000)
    public void testPowInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testPowInt();
        }
    }

    @Test(timeout=120000)
    public void testExpm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testExpm1();
        }
    }

    @Test(timeout=120000)
    public void testLog1p() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLog1p();
        }
    }

    @Test(timeout=120000)
    public void testCeil() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCeil();
        }
    }

    @Test(timeout=120000)
    public void testFloor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testFloor();
        }
    }

    @Test(timeout=120000)
    public void testRint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRint();
        }
    }

    @Test(timeout=120000)
    public void testRound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testRound();
        }
    }

    @Test(timeout=120000)
    public void testCopySignField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCopySignField();
        }
    }

    @Test(timeout=120000)
    public void testCopySignDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testCopySignDouble();
        }
    }

    @Test(timeout=120000)
    public void testScalb() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testScalb();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationFaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationDaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationFF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationDF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationFF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationDF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationFF4();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testLinearCombinationDF4();
        }
    }

    @Test(timeout=120000)
    public void testGetField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testGetField();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest object = new org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest();
               object.testHash();
        }
    }

}