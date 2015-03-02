package cmu.defect4j.math3.dfp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DfpTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testReciprocal();
        }
    }

    @Test(timeout=120000)
    public void testRemainder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRemainder();
        }
    }

    @Test(timeout=120000)
    public void testCopySign() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCopySign();
        }
    }

    @Test(timeout=120000)
    public void testSqrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSqrt();
        }
    }

    @Test(timeout=120000)
    public void testCeil() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCeil();
        }
    }

    @Test(timeout=120000)
    public void testFloor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testFloor();
        }
    }

    @Test(timeout=120000)
    public void testRint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRint();
        }
    }

    @Test(timeout=120000)
    public void testRound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRound();
        }
    }

    @Test(timeout=120000)
    public void testNextAfter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testNextAfter();
        }
    }

    @Test(timeout=120000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testDivide();
        }
    }

    @Test(timeout=120000)
    public void testByteConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testByteConstructor();
        }
    }

    @Test(timeout=120000)
    public void testIntConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testIntConstructor();
        }
    }

    @Test(timeout=120000)
    public void testLongConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLongConstructor();
        }
    }

    @Test(timeout=120000)
    public void testCompare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCompare();
        }
    }

    @Test(timeout=120000)
    public void testDivideInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testDivideInt();
        }
    }

    @Test(timeout=120000)
    public void testIntValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testIntValue();
        }
    }

    @Test(timeout=120000)
    public void testLog10K() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLog10K();
        }
    }

    @Test(timeout=120000)
    public void testPower10K() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testPower10K();
        }
    }

    @Test(timeout=120000)
    public void testLog10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLog10();
        }
    }

    @Test(timeout=120000)
    public void testPower10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testPower10();
        }
    }

    @Test(timeout=120000)
    public void testIssue567() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testIssue567();
        }
    }

    @Test(timeout=120000)
    public void testIsZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testIsZero();
        }
    }

    @Test(timeout=120000)
    public void testSignPredicates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSignPredicates();
        }
    }

    @Test(timeout=120000)
    public void testSpecialConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSpecialConstructors();
        }
    }

    @Test(timeout=120000)
    public void testExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testExp();
        }
    }

    @Test(timeout=120000)
    public void testLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLog();
        }
    }

    @Test(timeout=120000)
    public void testAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testSignum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSignum();
        }
    }

    @Test(timeout=120000)
    public void testAddField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAddField();
        }
    }

    @Test(timeout=120000)
    public void testAddDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAddDouble();
        }
    }

    @Test(timeout=120000)
    public void testSubtractField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSubtractField();
        }
    }

    @Test(timeout=120000)
    public void testSubtractDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSubtractDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testMultiplyField();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testMultiplyDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testMultiplyInt();
        }
    }

    @Test(timeout=120000)
    public void testDivideField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testDivideField();
        }
    }

    @Test(timeout=120000)
    public void testDivideDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testDivideDouble();
        }
    }

    @Test(timeout=120000)
    public void testRemainderField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRemainderField();
        }
    }

    @Test(timeout=120000)
    public void testRemainderDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRemainderDouble();
        }
    }

    @Test(timeout=120000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCos();
        }
    }

    @Test(timeout=120000)
    public void testAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAcos();
        }
    }

    @Test(timeout=120000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSin();
        }
    }

    @Test(timeout=120000)
    public void testAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAsin();
        }
    }

    @Test(timeout=120000)
    public void testTan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testTan();
        }
    }

    @Test(timeout=120000)
    public void testAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAtan();
        }
    }

    @Test(timeout=120000)
    public void testCosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCosh();
        }
    }

    @Test(timeout=120000)
    public void testAcosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAcosh();
        }
    }

    @Test(timeout=120000)
    public void testSinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testSinh();
        }
    }

    @Test(timeout=120000)
    public void testAsinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAsinh();
        }
    }

    @Test(timeout=120000)
    public void testTanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testTanh();
        }
    }

    @Test(timeout=120000)
    public void testAtanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testAtanh();
        }
    }

    @Test(timeout=120000)
    public void testCbrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCbrt();
        }
    }

    @Test(timeout=120000)
    public void testHypot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testHypot();
        }
    }

    @Test(timeout=120000)
    public void testRootN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testRootN();
        }
    }

    @Test(timeout=120000)
    public void testPowField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testPowField();
        }
    }

    @Test(timeout=120000)
    public void testPowDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testPowDouble();
        }
    }

    @Test(timeout=120000)
    public void testPowInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testPowInt();
        }
    }

    @Test(timeout=120000)
    public void testExpm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testExpm1();
        }
    }

    @Test(timeout=120000)
    public void testLog1p() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLog1p();
        }
    }

    @Test(timeout=120000)
    public void testCopySignField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCopySignField();
        }
    }

    @Test(timeout=120000)
    public void testCopySignDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testCopySignDouble();
        }
    }

    @Test(timeout=120000)
    public void testScalb() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testScalb();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationFaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationDaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationFF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationDF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationFF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationDF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationFF4();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testLinearCombinationDF4();
        }
    }

    @Test(timeout=120000)
    public void testGetField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testGetField();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpTest object = new org.apache.commons.math3.dfp.DfpTest();
               object.setUp();
               object.testHash();
        }
    }

}