package cmu.defect4j.lang3.math;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NumberUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testLang381() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testLang381();
        }
    }

    @Test(timeout=120000)
    public void testToIntStringI() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToIntStringI();
        }
    }

    @Test(timeout=120000)
    public void testToIntString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToIntString();
        }
    }

    @Test(timeout=120000)
    public void testToLongString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToLongString();
        }
    }

    @Test(timeout=120000)
    public void testToLongStringL() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToLongStringL();
        }
    }

    @Test(timeout=120000)
    public void testToFloatString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToFloatString();
        }
    }

    @Test(timeout=120000)
    public void testToFloatStringF() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToFloatStringF();
        }
    }

    @Test(timeout=120000)
    public void testStringCreateNumberEnsureNoPrecisionLoss() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testStringCreateNumberEnsureNoPrecisionLoss();
        }
    }

    @Test(timeout=120000)
    public void testStringToDoubleString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testStringToDoubleString();
        }
    }

    @Test(timeout=120000)
    public void testStringToDoubleStringD() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testStringToDoubleStringD();
        }
    }

    @Test(timeout=120000)
    public void testToByteString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToByteString();
        }
    }

    @Test(timeout=120000)
    public void testToByteStringI() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToByteStringI();
        }
    }

    @Test(timeout=120000)
    public void testToShortString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToShortString();
        }
    }

    @Test(timeout=120000)
    public void testToShortStringI() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testToShortStringI();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumber();
        }
    }

    @Test(timeout=120000)
    public void TestLang747() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.TestLang747();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumberFailure_1() throws Exception {
        if (verifyUnhandledException("java.lang.NumberFormatException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumberFailure_1();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumberFailure_2() throws Exception {
        if (verifyUnhandledException("java.lang.NumberFormatException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumberFailure_2();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumberFailure_3() throws Exception {
        if (verifyUnhandledException("java.lang.NumberFormatException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumberFailure_3();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumberFailure_4() throws Exception {
        if (verifyUnhandledException("java.lang.NumberFormatException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumberFailure_4();
        }
    }

    @Test(timeout=120000)
    public void testCreateNumberMagnitude() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateNumberMagnitude();
        }
    }

    @Test(timeout=120000)
    public void testCreateFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateFloat();
        }
    }

    @Test(timeout=120000)
    public void testCreateDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateDouble();
        }
    }

    @Test(timeout=120000)
    public void testCreateInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateInteger();
        }
    }

    @Test(timeout=120000)
    public void testCreateLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateLong();
        }
    }

    @Test(timeout=120000)
    public void testCreateBigInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateBigInteger();
        }
    }

    @Test(timeout=120000)
    public void testCreateBigDecimal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCreateBigDecimal();
        }
    }

    @Test(timeout=120000)
    public void testMinLong_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinLong_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinLong_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinLong_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinLong();
        }
    }

    @Test(timeout=120000)
    public void testMinInt_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinInt_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinInt_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinInt_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinInt();
        }
    }

    @Test(timeout=120000)
    public void testMinShort_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinShort_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinShort_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinShort_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinShort();
        }
    }

    @Test(timeout=120000)
    public void testMinByte_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinByte_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinByte_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinByte_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinByte();
        }
    }

    @Test(timeout=120000)
    public void testMinDouble_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinDouble_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinDouble_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinDouble_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinDouble();
        }
    }

    @Test(timeout=120000)
    public void testMinFloat_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinFloat_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMinFloat_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinFloat_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMinFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinFloat();
        }
    }

    @Test(timeout=120000)
    public void testMaxLong_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxLong_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxLong_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxLong_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxLong();
        }
    }

    @Test(timeout=120000)
    public void testMaxInt_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxInt_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxInt_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxInt_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxInt();
        }
    }

    @Test(timeout=120000)
    public void testMaxShort_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxShort_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxShort_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxShort_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxShort();
        }
    }

    @Test(timeout=120000)
    public void testMaxByte_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxByte_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxByte_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxByte_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxByte();
        }
    }

    @Test(timeout=120000)
    public void testMaxDouble_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxDouble_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxDouble_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxDouble_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxDouble();
        }
    }

    @Test(timeout=120000)
    public void testMaxFloat_nullArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxFloat_nullArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxFloat_emptyArray() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxFloat_emptyArray();
        }
    }

    @Test(timeout=120000)
    public void testMaxFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaxFloat();
        }
    }

    @Test(timeout=120000)
    public void testMinimumLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumLong();
        }
    }

    @Test(timeout=120000)
    public void testMinimumInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumInt();
        }
    }

    @Test(timeout=120000)
    public void testMinimumShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumShort();
        }
    }

    @Test(timeout=120000)
    public void testMinimumByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumByte();
        }
    }

    @Test(timeout=120000)
    public void testMinimumDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumDouble();
        }
    }

    @Test(timeout=120000)
    public void testMinimumFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMinimumFloat();
        }
    }

    @Test(timeout=120000)
    public void testMaximumLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumLong();
        }
    }

    @Test(timeout=120000)
    public void testMaximumInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumInt();
        }
    }

    @Test(timeout=120000)
    public void testMaximumShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumShort();
        }
    }

    @Test(timeout=120000)
    public void testMaximumByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumByte();
        }
    }

    @Test(timeout=120000)
    public void testMaximumDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumDouble();
        }
    }

    @Test(timeout=120000)
    public void testMaximumFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testMaximumFloat();
        }
    }

    @Test(timeout=120000)
    public void testCompareDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCompareDouble();
        }
    }

    @Test(timeout=120000)
    public void testCompareFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testCompareFloat();
        }
    }

    @Test(timeout=120000)
    public void testIsDigits() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testIsDigits();
        }
    }

    @Test(timeout=120000)
    public void testIsNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testIsNumber();
        }
    }

    @Test(timeout=120000)
    public void testLang300() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testLang300();
        }
    }

    @Test(timeout=120000)
    public void testConstants() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testConstants();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.NumberUtilsTest object = new org.apache.commons.lang3.math.NumberUtilsTest();
               object.testConstructor();
        }
    }

}