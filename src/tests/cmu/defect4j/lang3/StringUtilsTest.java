package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testToString();
        }
    }

    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void testCaseFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testCaseFunctions();
        }
    }

    @Test(timeout=10000)
    public void testSwapCase_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSwapCase_String();
        }
    }

    @Test(timeout=10000)
    public void testJoin_Objects() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_Objects();
        }
    }

    @Test(timeout=10000)
    public void testJoin_Objectarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_Objectarray();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayCharSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayCharSeparator();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfChars();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfBytes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfBytes();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfInts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfInts();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfLongs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfLongs();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfFloats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfFloats();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfDoubles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfDoubles();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayOfShorts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayOfShorts();
        }
    }

    @Test(timeout=10000)
    public void testJoin_ArrayString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_ArrayString();
        }
    }

    @Test(timeout=10000)
    public void testJoin_IteratorChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_IteratorChar();
        }
    }

    @Test(timeout=10000)
    public void testJoin_IteratorString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_IteratorString();
        }
    }

    @Test(timeout=10000)
    public void testSplitByWholeSeparatorPreserveAllTokens_StringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitByWholeSeparatorPreserveAllTokens_StringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testJoin_IterableChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_IterableChar();
        }
    }

    @Test(timeout=10000)
    public void testJoin_IterableString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testJoin_IterableString();
        }
    }

    @Test(timeout=10000)
    public void testSplit_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplit_String();
        }
    }

    @Test(timeout=10000)
    public void testSplit_StringChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplit_StringChar();
        }
    }

    @Test(timeout=10000)
    public void testSplit_StringString_StringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplit_StringString_StringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testSplitByWholeString_StringStringBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitByWholeString_StringStringBoolean();
        }
    }

    @Test(timeout=10000)
    public void testSplitByWholeString_StringStringBooleanInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitByWholeString_StringStringBooleanInt();
        }
    }

    @Test(timeout=10000)
    public void testSplitPreserveAllTokens_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitPreserveAllTokens_String();
        }
    }

    @Test(timeout=10000)
    public void testSplitPreserveAllTokens_StringChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitPreserveAllTokens_StringChar();
        }
    }

    @Test(timeout=10000)
    public void testSplitPreserveAllTokens_StringString_StringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitPreserveAllTokens_StringString_StringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testSplitByCharacterType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitByCharacterType();
        }
    }

    @Test(timeout=10000)
    public void testSplitByCharacterTypeCamelCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testSplitByCharacterTypeCamelCase();
        }
    }

    @Test(timeout=10000)
    public void testDeleteWhitespace_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDeleteWhitespace_String();
        }
    }

    @Test(timeout=10000)
    public void testLang623() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLang623();
        }
    }

    @Test(timeout=10000)
    public void testReplace_StringStringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplace_StringStringString();
        }
    }

    @Test(timeout=10000)
    public void testReplacePattern() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplacePattern();
        }
    }

    @Test(timeout=10000)
    public void testRemovePattern() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemovePattern();
        }
    }

    @Test(timeout=10000)
    public void testReplace_StringStringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplace_StringStringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testReplaceOnce_StringStringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplaceOnce_StringStringString();
        }
    }

    @Test(timeout=10000)
    public void testReplace_StringStringArrayStringArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplace_StringStringArrayStringArray();
        }
    }

    @Test(timeout=10000)
    public void testReplace_StringStringArrayStringArrayBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplace_StringStringArrayStringArrayBoolean();
        }
    }

    @Test(timeout=10000)
    public void testReplaceChars_StringCharChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplaceChars_StringCharChar();
        }
    }

    @Test(timeout=10000)
    public void testReplaceChars_StringStringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReplaceChars_StringStringString();
        }
    }

    @Test(timeout=10000)
    public void testOverlay_StringStringIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testOverlay_StringStringIntInt();
        }
    }

    @Test(timeout=10000)
    public void testRepeat_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRepeat_StringInt();
        }
    }

    @Test(timeout=10000)
    public void testRepeat_StringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRepeat_StringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testChop() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testChop();
        }
    }

    @Test(timeout=10000)
    public void testChomp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testChomp();
        }
    }

    @Test(timeout=10000)
    public void testRightPad_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRightPad_StringInt();
        }
    }

    @Test(timeout=10000)
    public void testRightPad_StringIntChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRightPad_StringIntChar();
        }
    }

    @Test(timeout=10000)
    public void testRightPad_StringIntString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRightPad_StringIntString();
        }
    }

    @Test(timeout=10000)
    public void testLeftPad_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLeftPad_StringInt();
        }
    }

    @Test(timeout=10000)
    public void testLeftPad_StringIntChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLeftPad_StringIntChar();
        }
    }

    @Test(timeout=10000)
    public void testLeftPad_StringIntString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLeftPad_StringIntString();
        }
    }

    @Test(timeout=10000)
    public void testLengthString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLengthString();
        }
    }

    @Test(timeout=10000)
    public void testLengthStringBuffer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLengthStringBuffer();
        }
    }

    @Test(timeout=10000)
    public void testLengthStringBuilder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLengthStringBuilder();
        }
    }

    @Test(timeout=10000)
    public void testLength_CharBuffer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLength_CharBuffer();
        }
    }

    @Test(timeout=10000)
    public void testCenter_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testCenter_StringInt();
        }
    }

    @Test(timeout=10000)
    public void testCenter_StringIntChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testCenter_StringIntChar();
        }
    }

    @Test(timeout=10000)
    public void testCenter_StringIntString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testCenter_StringIntString();
        }
    }

    @Test(timeout=10000)
    public void testReverse_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReverse_String();
        }
    }

    @Test(timeout=10000)
    public void testReverseDelimited_StringChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testReverseDelimited_StringChar();
        }
    }

    @Test(timeout=10000)
    public void testDefault_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefault_String();
        }
    }

    @Test(timeout=10000)
    public void testDefault_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefault_StringString();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfEmpty_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfEmpty_StringString();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfBlank_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfBlank_StringString();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfEmpty_StringBuilders() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfEmpty_StringBuilders();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfBlank_StringBuilders() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfBlank_StringBuilders();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfEmpty_StringBuffers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfEmpty_StringBuffers();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfBlank_StringBuffers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfBlank_StringBuffers();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfEmpty_CharBuffers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfEmpty_CharBuffers();
        }
    }

    @Test(timeout=10000)
    public void testDefaultIfBlank_CharBuffers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDefaultIfBlank_CharBuffers();
        }
    }

    @Test(timeout=10000)
    public void testAbbreviate_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testAbbreviate_StringInt();
        }
    }

    @Test(timeout=10000)
    public void testAbbreviate_StringIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testAbbreviate_StringIntInt();
        }
    }

    @Test(timeout=10000)
    public void testAbbreviateMiddle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testAbbreviateMiddle();
        }
    }

    @Test(timeout=10000)
    public void testDifference_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDifference_StringString();
        }
    }

    @Test(timeout=10000)
    public void testDifferenceAt_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDifferenceAt_StringString();
        }
    }

    @Test(timeout=10000)
    public void testGetLevenshteinDistance_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testGetLevenshteinDistance_StringString();
        }
    }

    @Test(timeout=10000)
    public void testGetLevenshteinDistance_StringStringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testGetLevenshteinDistance_StringStringInt();
        }
    }

    @Test(timeout=10000)
    public void testEMPTY() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testEMPTY();
        }
    }

    @Test(timeout=10000)
    public void testIsAllLowerCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testIsAllLowerCase();
        }
    }

    @Test(timeout=10000)
    public void testIsAllUpperCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testIsAllUpperCase();
        }
    }

    @Test(timeout=10000)
    public void testRemoveStart() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemoveStart();
        }
    }

    @Test(timeout=10000)
    public void testRemoveStartIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemoveStartIgnoreCase();
        }
    }

    @Test(timeout=10000)
    public void testRemoveEnd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemoveEnd();
        }
    }

    @Test(timeout=10000)
    public void testRemoveEndIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemoveEndIgnoreCase();
        }
    }

    @Test(timeout=10000)
    public void testRemove_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemove_String();
        }
    }

    @Test(timeout=10000)
    public void testRemove_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testRemove_char();
        }
    }

    @Test(timeout=10000)
    public void testDifferenceAt_StringArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testDifferenceAt_StringArray();
        }
    }

    @Test(timeout=10000)
    public void testGetCommonPrefix_StringArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testGetCommonPrefix_StringArray();
        }
    }

    @Test(timeout=10000)
    public void testNormalizeSpace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testNormalizeSpace();
        }
    }

    @Test(timeout=10000)
    public void testLANG666() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testLANG666();
        }
    }

    @Test(timeout=10000)
    public void testStringUtilsCharSequenceContract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testStringUtilsCharSequenceContract();
        }
    }

    @Test(timeout=10000)
    public void testEscapeSurrogatePairs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testEscapeSurrogatePairs();
        }
    }

    @Test(timeout=10000)
    public void testEscapeSurrogatePairsLang858() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testEscapeSurrogatePairsLang858();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeSurrogatePairs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testUnescapeSurrogatePairs();
        }
    }

    @Test(timeout=10000)
    public void testAppendIfMissing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testAppendIfMissing();
        }
    }

    @Test(timeout=10000)
    public void testAppendIfMissingIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testAppendIfMissingIgnoreCase();
        }
    }

    @Test(timeout=10000)
    public void testPrependIfMissing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testPrependIfMissing();
        }
    }

    @Test(timeout=10000)
    public void testPrependIfMissingIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTest object = new org.apache.commons.lang3.StringUtilsTest();
               object.testPrependIfMissingIgnoreCase();
        }
    }

}