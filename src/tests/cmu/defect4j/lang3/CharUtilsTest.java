package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CharUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToCharacterObject_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToCharacterObject_char();
        }
    }

    @Test(timeout=120000)
    public void testToCharacterObject_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToCharacterObject_String();
        }
    }

    @Test(timeout=120000)
    public void testToChar_Character() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToChar_Character();
        }
    }

    @Test(timeout=120000)
    public void testToChar_Character_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToChar_Character_char();
        }
    }

    @Test(timeout=120000)
    public void testToChar_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToChar_String();
        }
    }

    @Test(timeout=120000)
    public void testToChar_String_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToChar_String_char();
        }
    }

    @Test(timeout=120000)
    public void testToIntValue_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToIntValue_char();
        }
    }

    @Test(timeout=120000)
    public void testToIntValue_char_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToIntValue_char_int();
        }
    }

    @Test(timeout=120000)
    public void testToIntValue_Character() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToIntValue_Character();
        }
    }

    @Test(timeout=120000)
    public void testToIntValue_Character_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToIntValue_Character_int();
        }
    }

    @Test(timeout=120000)
    public void testToString_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToString_char();
        }
    }

    @Test(timeout=120000)
    public void testToString_Character() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToString_Character();
        }
    }

    @Test(timeout=120000)
    public void testToUnicodeEscaped_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToUnicodeEscaped_char();
        }
    }

    @Test(timeout=120000)
    public void testToUnicodeEscaped_Character() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testToUnicodeEscaped_Character();
        }
    }

    @Test(timeout=120000)
    public void testIsAscii_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAscii_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiPrintable_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiPrintable_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiControl_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiControl_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiAlpha_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiAlpha_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiAlphaUpper_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiAlphaUpper_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiAlphaLower_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiAlphaLower_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiNumeric_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiNumeric_char();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiAlphanumeric_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testIsAsciiAlphanumeric_char();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharUtilsTest object = new org.apache.commons.lang3.CharUtilsTest();
               object.testConstructor();
        }
    }

}