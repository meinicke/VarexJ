package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StrBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testIsEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIsEmpty();
        }
    }

    @Test(timeout=120000)
    public void testTrim() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testTrim();
        }
    }

    @Test(timeout=120000)
    public void testClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testClear();
        }
    }

    @Test(timeout=120000)
    public void testStartsWith() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testStartsWith();
        }
    }

    @Test(timeout=120000)
    public void testEndsWith() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testEndsWith();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testReplace_StrMatcher_String_int_int_int_VaryEndIndex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_StrMatcher_String_int_int_int_VaryEndIndex();
        }
    }

    @Test(timeout=120000)
    public void testReplace_StrMatcher_String_int_int_int_VaryCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_StrMatcher_String_int_int_int_VaryCount();
        }
    }

    @Test(timeout=120000)
    public void testSubSequenceIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSubSequenceIntInt();
        }
    }

    @Test(timeout=120000)
    public void testSubstringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSubstringInt();
        }
    }

    @Test(timeout=120000)
    public void testSubstringIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSubstringIntInt();
        }
    }

    @Test(timeout=120000)
    public void testMidString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testMidString();
        }
    }

    @Test(timeout=120000)
    public void testRightString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testRightString();
        }
    }

    @Test(timeout=120000)
    public void testLeftString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLeftString();
        }
    }

    @Test(timeout=120000)
    public void testContains_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testContains_char();
        }
    }

    @Test(timeout=120000)
    public void testContains_StrMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testContains_StrMatcher();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_char_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_char_int();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_char_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_char_int();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_String_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_String_int();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_String_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_String_int();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_StrMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_StrMatcher();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_StrMatcher_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_StrMatcher_int();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_StrMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_StrMatcher();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_StrMatcher_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_StrMatcher_int();
        }
    }

    @Test(timeout=120000)
    public void testAsTokenizer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testAsTokenizer();
        }
    }

    @Test(timeout=120000)
    public void testAsReader() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testAsReader();
        }
    }

    @Test(timeout=120000)
    public void testAsWriter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testAsWriter();
        }
    }

    @Test(timeout=120000)
    public void testToStringBuffer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testToStringBuffer();
        }
    }

    @Test(timeout=120000)
    public void testToStringBuilder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testToStringBuilder();
        }
    }

    @Test(timeout=120000)
    public void testLang294() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLang294();
        }
    }

    @Test(timeout=120000)
    public void testIndexOfLang294() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOfLang294();
        }
    }

    @Test(timeout=120000)
    public void testLang295() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLang295();
        }
    }

    @Test(timeout=120000)
    public void testLang412Right() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLang412Right();
        }
    }

    @Test(timeout=120000)
    public void testLang412Left() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLang412Left();
        }
    }

    @Test(timeout=120000)
    public void testAsBuilder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testAsBuilder();
        }
    }

    @Test(timeout=120000)
    public void testDeleteAll_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteAll_char();
        }
    }

    @Test(timeout=120000)
    public void testDeleteFirst_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteFirst_char();
        }
    }

    @Test(timeout=120000)
    public void testDeleteAll_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteAll_String();
        }
    }

    @Test(timeout=120000)
    public void testDeleteFirst_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteFirst_String();
        }
    }

    @Test(timeout=120000)
    public void testDeleteAll_StrMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteAll_StrMatcher();
        }
    }

    @Test(timeout=120000)
    public void testDeleteFirst_StrMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteFirst_StrMatcher();
        }
    }

    @Test(timeout=120000)
    public void testReplace_int_int_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_int_int_String();
        }
    }

    @Test(timeout=120000)
    public void testReplaceAll_char_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceAll_char_char();
        }
    }

    @Test(timeout=120000)
    public void testReplaceFirst_char_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceFirst_char_char();
        }
    }

    @Test(timeout=120000)
    public void testReplaceAll_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceAll_String_String();
        }
    }

    @Test(timeout=120000)
    public void testReplaceFirst_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceFirst_String_String();
        }
    }

    @Test(timeout=120000)
    public void testReplaceAll_StrMatcher_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceAll_StrMatcher_String();
        }
    }

    @Test(timeout=120000)
    public void testReplaceFirst_StrMatcher_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplaceFirst_StrMatcher_String();
        }
    }

    @Test(timeout=120000)
    public void testReplace_StrMatcher_String_int_int_int_VaryMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_StrMatcher_String_int_int_int_VaryMatcher();
        }
    }

    @Test(timeout=120000)
    public void testReplace_StrMatcher_String_int_int_int_VaryReplace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_StrMatcher_String_int_int_int_VaryReplace();
        }
    }

    @Test(timeout=120000)
    public void testReplace_StrMatcher_String_int_int_int_VaryStartIndex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReplace_StrMatcher_String_int_int_int_VaryStartIndex();
        }
    }

    @Test(timeout=120000)
    public void testLength() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLength();
        }
    }

    @Test(timeout=120000)
    public void testSetLength() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSetLength();
        }
    }

    @Test(timeout=120000)
    public void testCapacity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testCapacity();
        }
    }

    @Test(timeout=120000)
    public void testEnsureCapacity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testEnsureCapacity();
        }
    }

    @Test(timeout=120000)
    public void testMinimizeCapacity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testMinimizeCapacity();
        }
    }

    @Test(timeout=120000)
    public void testSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSize();
        }
    }

    @Test(timeout=120000)
    public void testCharAt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testCharAt();
        }
    }

    @Test(timeout=120000)
    public void testSetCharAt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testSetCharAt();
        }
    }

    @Test(timeout=120000)
    public void testDeleteCharAt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteCharAt();
        }
    }

    @Test(timeout=120000)
    public void testToCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testToCharArray();
        }
    }

    @Test(timeout=120000)
    public void testToCharArrayIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testToCharArrayIntInt();
        }
    }

    @Test(timeout=120000)
    public void testGetChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testGetChars();
        }
    }

    @Test(timeout=120000)
    public void testGetCharsIntIntCharArrayInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testGetCharsIntIntCharArrayInt();
        }
    }

    @Test(timeout=120000)
    public void testDeleteIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testDeleteIntInt();
        }
    }

    @Test(timeout=120000)
    public void testChaining() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testChaining();
        }
    }

    @Test(timeout=120000)
    public void testGetSetNewLineText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testGetSetNewLineText();
        }
    }

    @Test(timeout=120000)
    public void testGetSetNullText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testGetSetNullText();
        }
    }

    @Test(timeout=120000)
    public void testCapacityAndLength() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testCapacityAndLength();
        }
    }

    @Test(timeout=120000)
    public void testReverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testReverse();
        }
    }

    @Test(timeout=120000)
    public void testContains_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testContains_String();
        }
    }

    @Test(timeout=120000)
    public void testEqualsIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testEqualsIgnoreCase();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_char();
        }
    }

    @Test(timeout=120000)
    public void testIndexOf_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testIndexOf_String();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_char();
        }
    }

    @Test(timeout=120000)
    public void testLastIndexOf_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrBuilderTest object = new org.apache.commons.lang3.text.StrBuilderTest();
               object.testLastIndexOf_String();
        }
    }

}