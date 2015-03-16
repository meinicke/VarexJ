package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArrayRealVectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testGetDataRef() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetDataRef();
        }
    }

    @Test(timeout=120000)
    public void testPredicates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testPredicates();
        }
    }

    @Test(timeout=120000)
    public void testZeroVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testZeroVectors();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testIterator();
        }
    }

    @Test(timeout=120000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=120000)
    public void testGetEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetEntryInvalidIndex1();
        }
    }

    @Test(timeout=120000)
    public void testGetEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetEntryInvalidIndex2();
        }
    }

    @Test(timeout=120000)
    public void testGetDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetDimension();
        }
    }

    @Test(timeout=120000)
    public void testSetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetEntry();
        }
    }

    @Test(timeout=120000)
    public void testSetEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetEntryInvalidIndex1();
        }
    }

    @Test(timeout=120000)
    public void testSetEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetEntryInvalidIndex2();
        }
    }

    @Test(timeout=120000)
    public void testAddToEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddToEntry();
        }
    }

    @Test(timeout=120000)
    public void testAddToEntryInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddToEntryInvalidIndex1();
        }
    }

    @Test(timeout=120000)
    public void testAddToEntryInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddToEntryInvalidIndex2();
        }
    }

    @Test(timeout=120000)
    public void testAppendVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAppendVector();
        }
    }

    @Test(timeout=120000)
    public void testAppendScalar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAppendScalar();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetSubVector();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVectorInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetSubVectorInvalidIndex1();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVectorInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetSubVectorInvalidIndex2();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVectorInvalidIndex3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetSubVectorInvalidIndex3();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVectorInvalidIndex4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetSubVectorInvalidIndex4();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVectorSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetSubVectorSameType();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVectorMixedType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetSubVectorMixedType();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVectorInvalidIndex1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetSubVectorInvalidIndex1();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVectorInvalidIndex2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetSubVectorInvalidIndex2();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVectorInvalidIndex3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSetSubVectorInvalidIndex3();
        }
    }

    @Test(timeout=120000)
    public void testIsNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testIsNaN();
        }
    }

    @Test(timeout=120000)
    public void testIsInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testIsInfinite();
        }
    }

    @Test(timeout=120000)
    public void testAddSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddSameType();
        }
    }

    @Test(timeout=120000)
    public void testAddMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testAddDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testAddDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testSubtractSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSubtractSameType();
        }
    }

    @Test(timeout=120000)
    public void testSubtractMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSubtractMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testSubtractDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSubtractDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testEbeMultiplySameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeMultiplySameType();
        }
    }

    @Test(timeout=120000)
    public void testEbeMultiplyMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeMultiplyMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testEbeMultiplyDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeMultiplyDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testEbeDivideSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeDivideSameType();
        }
    }

    @Test(timeout=120000)
    public void testEbeDivideMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeDivideMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testEbeDivideDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testEbeDivideDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testGetDistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetDistanceSameType();
        }
    }

    @Test(timeout=120000)
    public void testGetDistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetDistanceMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testGetDistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetDistanceDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testGetNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetNorm();
        }
    }

    @Test(timeout=120000)
    public void testGetL1DistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetL1DistanceSameType();
        }
    }

    @Test(timeout=120000)
    public void testGetL1DistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetL1DistanceMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testGetL1DistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetL1DistanceDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testGetL1Norm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetL1Norm();
        }
    }

    @Test(timeout=120000)
    public void testGetLInfDistanceSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetLInfDistanceSameType();
        }
    }

    @Test(timeout=120000)
    public void testGetLInfDistanceMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetLInfDistanceMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testGetLInfDistanceDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetLInfDistanceDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testGetLInfNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testGetLInfNorm();
        }
    }

    @Test(timeout=120000)
    public void testMapAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapAdd();
        }
    }

    @Test(timeout=120000)
    public void testMapAddToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapAddToSelf();
        }
    }

    @Test(timeout=120000)
    public void testMapSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapSubtract();
        }
    }

    @Test(timeout=120000)
    public void testMapSubtractToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapSubtractToSelf();
        }
    }

    @Test(timeout=120000)
    public void testMapMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapMultiply();
        }
    }

    @Test(timeout=120000)
    public void testMapMultiplyToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapMultiplyToSelf();
        }
    }

    @Test(timeout=120000)
    public void testMapDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapDivide();
        }
    }

    @Test(timeout=120000)
    public void testMapDivideToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapDivideToSelf();
        }
    }

    @Test(timeout=120000)
    public void testMap() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMap();
        }
    }

    @Test(timeout=120000)
    public void testMapToSelf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMapToSelf();
        }
    }

    @Test(timeout=120000)
    public void testOuterProductSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testOuterProductSameType();
        }
    }

    @Test(timeout=120000)
    public void testOuterProductMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testOuterProductMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testProjectionSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testProjectionSameType();
        }
    }

    @Test(timeout=120000)
    public void testProjectionMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testProjectionMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testProjectionNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testProjectionNullVector();
        }
    }

    @Test(timeout=120000)
    public void testProjectionDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testProjectionDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSet();
        }
    }

    @Test(timeout=120000)
    public void testToArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testToArray();
        }
    }

    @Test(timeout=120000)
    public void testUnitVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testUnitVector();
        }
    }

    @Test(timeout=120000)
    public void testUnitize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testUnitize();
        }
    }

    @Test(timeout=120000)
    public void testUnitVectorNullVector() throws Exception {
        if (verifyUnhandledException("java.lang.ArithmeticException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testUnitVectorNullVector();
        }
    }

    @Test(timeout=120000)
    public void testUnitizeNullVector() throws Exception {
        if (verifyUnhandledException("java.lang.ArithmeticException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testUnitizeNullVector();
        }
    }

    @Test(timeout=120000)
    public void testCombineSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineSameType();
        }
    }

    @Test(timeout=120000)
    public void testCombineMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCombineDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineDimensionMismatchSameType();
        }
    }

    @Test(timeout=120000)
    public void testCombineDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCombineToSelfSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineToSelfSameType();
        }
    }

    @Test(timeout=120000)
    public void testCombineToSelfMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineToSelfMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCombineToSelfDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineToSelfDimensionMismatchSameType();
        }
    }

    @Test(timeout=120000)
    public void testCombineToSelfDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCombineToSelfDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCopy();
        }
    }

    @Test(timeout=120000)
    public void testDotProductSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testDotProductSameType();
        }
    }

    @Test(timeout=120000)
    public void testDotProductDimensionMismatchSameType() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testDotProductDimensionMismatchSameType();
        }
    }

    @Test(timeout=120000)
    public void testDotProductMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testDotProductMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testDotProductDimensionMismatchMixedTypes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testDotProductDimensionMismatchMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCosineSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCosineSameType();
        }
    }

    @Test(timeout=120000)
    public void testCosineMixedTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCosineMixedTypes();
        }
    }

    @Test(timeout=120000)
    public void testCosineLeftNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCosineLeftNullVector();
        }
    }

    @Test(timeout=120000)
    public void testCosineRightNullVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCosineRightNullVector();
        }
    }

    @Test(timeout=120000)
    public void testCosineDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testCosineDimensionMismatch();
        }
    }

    @Test(timeout=120000)
    public void testMinMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testMinMax();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderPreservingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor1();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderPreservingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor2();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderPreservingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderPreservingVisitor3();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderPreservingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor1();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderPreservingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor2();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderPreservingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderPreservingVisitor3();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderChangingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor1();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderChangingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor2();
        }
    }

    @Test(timeout=120000)
    public void testWalkInDefaultOrderChangingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInDefaultOrderChangingVisitor3();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderChangingVisitor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor1();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderChangingVisitor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor2();
        }
    }

    @Test(timeout=120000)
    public void testWalkInOptimizedOrderChangingVisitor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testWalkInOptimizedOrderChangingVisitor3();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayRealVectorTest object = new org.apache.commons.math3.linear.ArrayRealVectorTest();
               object.testSerial();
        }
    }

}