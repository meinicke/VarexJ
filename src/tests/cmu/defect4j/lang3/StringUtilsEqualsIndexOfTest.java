package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsEqualsIndexOfTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testContainsAny_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringString();
        }
    }

    @Test(timeout=120000)
    public void testContains_Char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContains_Char();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testContains_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContains_String();
        }
    }

    @Test(timeout=120000)
    public void testContains_StringWithBadSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContains_StringWithBadSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContains_StringWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContains_StringWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsAny_StringCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringCharArray();
        }
    }

    @Test(timeout=120000)
    public void testContainsAny_StringCharArrayWithBadSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringCharArrayWithBadSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsAny_StringCharArrayWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringCharArrayWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsAny_StringWithBadSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringWithBadSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsAny_StringWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsAny_StringWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsIgnoreCase_LocaleIndependence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsIgnoreCase_LocaleIndependence();
        }
    }

    @Test(timeout=120000)
    public void testContainsIgnoreCase_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsIgnoreCase_StringString();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_CharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_CharArray();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_CharArrayWithBadSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_CharArrayWithBadSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_CharArrayWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_CharArrayWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_String();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_StringWithBadSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_StringWithBadSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsNone_StringWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsNone_StringWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testContainsOnly_CharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsOnly_CharArray();
        }
    }

    @Test(timeout=120000)
    public void testContainsOnly_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsOnly_String();
        }
    }

    @Test(timeout=120000)
    public void testContainsWhitespace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testContainsWhitespace();
        }
    }

    @Test(timeout=120000)
    public void testCustomCharSequence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testCustomCharSequence();
        }
    }

    @Test(timeout=120000)
    public void testEqualsOnStrings() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testEqualsOnStrings();
        }
    }

    @Test(timeout=120000)
    public void testEqualsIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testEqualsIgnoreCase();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOf_char();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_charInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOf_charInt();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOf_String();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOf_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAny_StringCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAny_StringCharArray();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAny_StringCharArrayWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAny_StringCharArrayWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAny_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAny_StringString();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAny_StringStringArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAny_StringStringArray();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAny_StringStringWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAny_StringStringWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAnyBut_StringCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAnyBut_StringCharArray();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAnyBut_StringCharArrayWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAnyBut_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAnyBut_StringString();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfAnyBut_StringStringWithSupplementaryChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfAnyBut_StringStringWithSupplementaryChars();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfIgnoreCase_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfIgnoreCase_String();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfIgnoreCase_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testIndexOfIgnoreCase_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOf_char();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_charInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOf_charInt();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOf_String();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOf_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOfAny_StringStringArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOfAny_StringStringArray();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOfIgnoreCase_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOfIgnoreCase_String();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOfIgnoreCase_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastIndexOfIgnoreCase_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testLastOrdinalIndexOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testLastOrdinalIndexOf();
        }
    }

    @Test(timeout=120000)
    public void testOrdinalIndexOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsEqualsIndexOfTest object = new org.apache.commons.lang3.StringUtilsEqualsIndexOfTest();
               object.testOrdinalIndexOf();
        }
    }

}