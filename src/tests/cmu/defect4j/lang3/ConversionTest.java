package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ConversionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHexDigitToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexDigitToInt();
        }
    }

    @Test(timeout=120000)
    public void testHexDigitMsb0ToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexDigitMsb0ToInt();
        }
    }

    @Test(timeout=120000)
    public void testHexDigitToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexDigitToBinary();
        }
    }

    @Test(timeout=120000)
    public void testHexDigitMsb0ToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexDigitMsb0ToBinary();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToHexDigit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToHexDigit();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToHexDigit_2args() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToHexDigit_2args();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToHexDigitMsb0_bits() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToHexDigitMsb0_bits();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToHexDigitMsb0_4bits_2args() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToHexDigitMsb0_4bits_2args();
        }
    }

    @Test(timeout=120000)
    public void testBinaryBeMsb0ToHexDigit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryBeMsb0ToHexDigit();
        }
    }

    @Test(timeout=120000)
    public void testBinaryBeMsb0ToHexDigit_2args() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryBeMsb0ToHexDigit_2args();
        }
    }

    @Test(timeout=120000)
    public void testIntToHexDigit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToHexDigit();
        }
    }

    @Test(timeout=120000)
    public void testIntToHexDigitMsb0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToHexDigitMsb0();
        }
    }

    @Test(timeout=120000)
    public void testIntArrayToLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntArrayToLong();
        }
    }

    @Test(timeout=120000)
    public void testShortArrayToLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testShortArrayToLong();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayToLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteArrayToLong();
        }
    }

    @Test(timeout=120000)
    public void testShortArrayToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testShortArrayToInt();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteArrayToInt();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayToShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteArrayToShort();
        }
    }

    @Test(timeout=120000)
    public void testHexToLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexToLong();
        }
    }

    @Test(timeout=120000)
    public void testHexToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexToInt();
        }
    }

    @Test(timeout=120000)
    public void testHexToShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexToShort();
        }
    }

    @Test(timeout=120000)
    public void testHexToByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testHexToByte();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToLong();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToInt();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToShort();
        }
    }

    @Test(timeout=120000)
    public void testBinaryToByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testBinaryToByte();
        }
    }

    @Test(timeout=120000)
    public void testLongToIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testLongToIntArray();
        }
    }

    @Test(timeout=120000)
    public void testLongToShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testLongToShortArray();
        }
    }

    @Test(timeout=120000)
    public void testIntToShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToShortArray();
        }
    }

    @Test(timeout=120000)
    public void testLongToByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testLongToByteArray();
        }
    }

    @Test(timeout=120000)
    public void testIntToByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToByteArray();
        }
    }

    @Test(timeout=120000)
    public void testShortToByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testShortToByteArray();
        }
    }

    @Test(timeout=120000)
    public void testLongToHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testLongToHex();
        }
    }

    @Test(timeout=120000)
    public void testIntToHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToHex();
        }
    }

    @Test(timeout=120000)
    public void testShortToHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testShortToHex();
        }
    }

    @Test(timeout=120000)
    public void testByteToHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteToHex();
        }
    }

    @Test(timeout=120000)
    public void testLongToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testLongToBinary();
        }
    }

    @Test(timeout=120000)
    public void testIntToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testIntToBinary();
        }
    }

    @Test(timeout=120000)
    public void testShortToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testShortToBinary();
        }
    }

    @Test(timeout=120000)
    public void testByteToBinary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteToBinary();
        }
    }

    @Test(timeout=120000)
    public void testUuidToByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testUuidToByteArray();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayToUuid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ConversionTest object = new org.apache.commons.lang3.ConversionTest();
               object.testByteArrayToUuid();
        }
    }

}