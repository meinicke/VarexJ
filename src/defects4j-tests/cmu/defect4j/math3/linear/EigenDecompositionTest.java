package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EigenDecompositionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testDimension1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension1();
        }
    }

    @Test(timeout=120000)
    public void testDimension2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension2();
        }
    }

    @Test(timeout=120000)
    public void testDimension3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension3();
        }
    }

    @Test(timeout=120000)
    public void testDimension3MultipleRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension3MultipleRoot();
        }
    }

    @Test(timeout=120000)
    public void testDimension4WithSplit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension4WithSplit();
        }
    }

    @Test(timeout=120000)
    public void testDimension4WithoutSplit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimension4WithoutSplit();
        }
    }

    @Test(timeout=120000)
    public void testMath308() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testMath308();
        }
    }

    @Test(timeout=120000)
    public void testMathpbx02() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testMathpbx02();
        }
    }

    @Test(timeout=120000)
    public void testMathpbx03() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testMathpbx03();
        }
    }

    @Test(timeout=120000)
    public void testTridiagonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testTridiagonal();
        }
    }

    @Test(timeout=120000)
    public void testEigenvalues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testEigenvalues();
        }
    }

    @Test(timeout=120000)
    public void testBigMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testBigMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSymmetric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testSymmetric();
        }
    }

    @Test(timeout=120000)
    public void testSquareRootNonSymmetric() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testSquareRootNonSymmetric();
        }
    }

    @Test(timeout=120000)
    public void testSquareRootNonPositiveDefinite() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testSquareRootNonPositiveDefinite();
        }
    }

    @Test(timeout=120000)
    public void testUnsymmetric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testUnsymmetric();
        }
    }

    @Test(timeout=120000)
    public void testRandomUnsymmetricMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testRandomUnsymmetricMatrix();
        }
    }

    @Test(timeout=120000)
    public void testNormalDistributionUnsymmetricMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testNormalDistributionUnsymmetricMatrix();
        }
    }

    @Test(timeout=120000)
    public void testMath848() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testMath848();
        }
    }

    @Test(timeout=120000)
    public void testEigenvectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testEigenvectors();
        }
    }

    @Test(timeout=120000)
    public void testAEqualVDVt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testAEqualVDVt();
        }
    }

    @Test(timeout=120000)
    public void testDiagonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDiagonal();
        }
    }

    @Test(timeout=120000)
    public void testRepeatedEigenvalue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testRepeatedEigenvalue();
        }
    }

    @Test(timeout=120000)
    public void testDistinctEigenvalues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDistinctEigenvalues();
        }
    }

    @Test(timeout=120000)
    public void testZeroDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testZeroDivide();
        }
    }

    @Test(timeout=120000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testDimensions();
        }
    }

    @Test(timeout=120000)
    public void testSquareRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testSquareRoot();
        }
    }

    @Test(timeout=120000)
    public void testVOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.EigenDecompositionTest object = new org.apache.commons.math3.linear.EigenDecompositionTest();
               object.setUp();
               object.testVOrthogonal();
        }
    }

}