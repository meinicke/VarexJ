package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsSubstringTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSubstringsBetween_StringStringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringsBetween_StringStringString();
        }
    }

    @Test(timeout=120000)
    public void testCountMatches_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testCountMatches_String();
        }
    }

    @Test(timeout=120000)
    public void testSubstring_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstring_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testSubstring_StringIntInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstring_StringIntInt();
        }
    }

    @Test(timeout=120000)
    public void testLeft_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testLeft_String();
        }
    }

    @Test(timeout=120000)
    public void testRight_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testRight_String();
        }
    }

    @Test(timeout=120000)
    public void testMid_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testMid_String();
        }
    }

    @Test(timeout=120000)
    public void testSubstringBefore_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringBefore_StringString();
        }
    }

    @Test(timeout=120000)
    public void testSubstringAfter_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringAfter_StringString();
        }
    }

    @Test(timeout=120000)
    public void testSubstringBeforeLast_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringBeforeLast_StringString();
        }
    }

    @Test(timeout=120000)
    public void testSubstringAfterLast_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringAfterLast_StringString();
        }
    }

    @Test(timeout=120000)
    public void testSubstringBetween_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringBetween_StringString();
        }
    }

    @Test(timeout=120000)
    public void testSubstringBetween_StringStringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsSubstringTest object = new org.apache.commons.lang3.StringUtilsSubstringTest();
               object.testSubstringBetween_StringStringString();
        }
    }

}