package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SparseRealVectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testConcurrentModification() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testConcurrentModification();
        }
    }

    @Test(timeout=1000000)
    public void testMap() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMap();
        }
    }

    @Test(timeout=1000000)
    public void testMapToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapToSelf();
        }
    }

    @Test(timeout=1000000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testConstructors();
        }
    }

    @Test(timeout=1000000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testIterator();
        }
    }

    @Test(timeout=1000000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testGetDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetDimension();
        }
    }

    @Test(timeout=1000000)
    public void testGetEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetEntryInvalidIndex1();
        }
    }

    @Test(timeout=1000000)
    public void testGetEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetEntryInvalidIndex2();
        }
    }

    @Test(timeout=1000000)
    public void testSetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetEntry();
        }
    }

    @Test(timeout=1000000)
    public void testSetEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetEntryInvalidIndex1();
        }
    }

    @Test(timeout=1000000)
    public void testSetEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetEntryInvalidIndex2();
        }
    }

    @Test(timeout=1000000)
    public void testAddToEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddToEntry();
        }
    }

    @Test(timeout=1000000)
    public void testAddToEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddToEntryInvalidIndex1();
        }
    }

    @Test(timeout=1000000)
    public void testAddToEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddToEntryInvalidIndex2();
        }
    }

    @Test(timeout=1000000)
    public void testAppendVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAppendVector();
        }
    }

    @Test(timeout=1000000)
    public void testAppendScalar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAppendScalar();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetSubVector();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubVectorInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetSubVectorInvalidIndex1();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubVectorInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetSubVectorInvalidIndex2();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubVectorInvalidIndex3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetSubVectorInvalidIndex3();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubVectorInvalidIndex4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetSubVectorInvalidIndex4();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubVectorSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetSubVectorSameType();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubVectorMixedType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetSubVectorMixedType();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubVectorInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetSubVectorInvalidIndex1();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubVectorInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetSubVectorInvalidIndex2();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubVectorInvalidIndex3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSetSubVectorInvalidIndex3();
        }
    }

    @Test(timeout=1000000)
    public void testIsNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testIsNaN();
        }
    }

    @Test(timeout=1000000)
    public void testIsInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testIsInfinite();
        }
    }

    @Test(timeout=1000000)
    public void testAddSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddSameType();
        }
    }

    @Test(timeout=1000000)
    public void testAddMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testAddDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testAddDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testSubtractSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSubtractSameType();
        }
    }

    @Test(timeout=1000000)
    public void testSubtractMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSubtractMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testSubtractDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSubtractDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testEbeMultiplySameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeMultiplySameType();
        }
    }

    @Test(timeout=1000000)
    public void testEbeMultiplyMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeMultiplyMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testEbeMultiplyDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeMultiplyDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testEbeDivideSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeDivideSameType();
        }
    }

    @Test(timeout=1000000)
    public void testEbeDivideMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeDivideMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testEbeDivideDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEbeDivideDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testGetDistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetDistanceSameType();
        }
    }

    @Test(timeout=1000000)
    public void testGetDistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetDistanceMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testGetDistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetDistanceDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testGetNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetNorm();
        }
    }

    @Test(timeout=1000000)
    public void testGetL1DistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetL1DistanceSameType();
        }
    }

    @Test(timeout=1000000)
    public void testGetL1DistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetL1DistanceMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testGetL1DistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetL1DistanceDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testGetL1Norm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetL1Norm();
        }
    }

    @Test(timeout=1000000)
    public void testGetLInfDistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetLInfDistanceSameType();
        }
    }

    @Test(timeout=1000000)
    public void testGetLInfDistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetLInfDistanceMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testGetLInfDistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetLInfDistanceDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testGetLInfNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testGetLInfNorm();
        }
    }

    @Test(timeout=1000000)
    public void testMapAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapAdd();
        }
    }

    @Test(timeout=1000000)
    public void testMapAddToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapAddToSelf();
        }
    }

    @Test(timeout=1000000)
    public void testMapSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapSubtract();
        }
    }

    @Test(timeout=1000000)
    public void testMapSubtractToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapSubtractToSelf();
        }
    }

    @Test(timeout=1000000)
    public void testMapMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapMultiply();
        }
    }

    @Test(timeout=1000000)
    public void testMapMultiplyToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapMultiplyToSelf();
        }
    }

    @Test(timeout=1000000)
    public void testMapDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapDivide();
        }
    }

    @Test(timeout=1000000)
    public void testMapDivideToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMapDivideToSelf();
        }
    }

    @Test(timeout=1000000)
    public void testOuterProductSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testOuterProductSameType();
        }
    }

    @Test(timeout=1000000)
    public void testOuterProductMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testOuterProductMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testProjectionSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testProjectionSameType();
        }
    }

    @Test(timeout=1000000)
    public void testProjectionMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testProjectionMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testProjectionNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testProjectionNullVector();
        }
    }

    @Test(timeout=1000000)
    public void testProjectionDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testProjectionDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testSet();
        }
    }

    @Test(timeout=1000000)
    public void testToArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testToArray();
        }
    }

    @Test(timeout=1000000)
    public void testUnitVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testUnitVector();
        }
    }

    @Test(timeout=1000000)
    public void testUnitize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testUnitize();
        }
    }

    @Test(timeout=1000000)
    public void testUnitVectorNullVector() throws Exception {
        if (verifyUnhandledException("java.lang.ArithmeticException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testUnitVectorNullVector();
        }
    }

    @Test(timeout=1000000)
    public void testUnitizeNullVector() throws Exception {
        if (verifyUnhandledException("java.lang.ArithmeticException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testUnitizeNullVector();
        }
    }

    @Test(timeout=1000000)
    public void testCombineSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineSameType();
        }
    }

    @Test(timeout=1000000)
    public void testCombineMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCombineDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineDimensionMismatchSameType();
        }
    }

    @Test(timeout=1000000)
    public void testCombineDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCombineToSelfSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineToSelfSameType();
        }
    }

    @Test(timeout=1000000)
    public void testCombineToSelfMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineToSelfMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCombineToSelfDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineToSelfDimensionMismatchSameType();
        }
    }

    @Test(timeout=1000000)
    public void testCombineToSelfDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCombineToSelfDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCopy();
        }
    }

    @Test(timeout=1000000)
    public void testDotProductSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testDotProductSameType();
        }
    }

    @Test(timeout=1000000)
    public void testDotProductDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testDotProductDimensionMismatchSameType();
        }
    }

    @Test(timeout=1000000)
    public void testDotProductMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testDotProductMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testDotProductDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testDotProductDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCosineSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCosineSameType();
        }
    }

    @Test(timeout=1000000)
    public void testCosineMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCosineMixedTypes();
        }
    }

    @Test(timeout=1000000)
    public void testCosineLeftNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCosineLeftNullVector();
        }
    }

    @Test(timeout=1000000)
    public void testCosineRightNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCosineRightNullVector();
        }
    }

    @Test(timeout=1000000)
    public void testCosineDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testCosineDimensionMismatch();
        }
    }

    @Test(timeout=1000000)
    public void testMinMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testMinMax();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderPreservingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor1();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderPreservingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor2();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderPreservingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor3();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderPreservingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor1();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderPreservingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor2();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderPreservingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor3();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderChangingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor1();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderChangingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor2();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInDefaultOrderChangingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor3();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderChangingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor1();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderChangingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor2();
        }
    }

    @Test(timeout=1000000)
    public void testWalkInOptimizedOrderChangingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor3();
        }
    }

    @Test(timeout=1000000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealVectorTest object = new org.apache.commons.math3.linear.SparseRealVectorTest();
               object.testEquals();
        }
    }

}