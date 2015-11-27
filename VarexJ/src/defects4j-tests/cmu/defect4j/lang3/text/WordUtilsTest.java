package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class WordUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testSwapCase_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testSwapCase_String();
        }
    }

    @Test(timeout=120000)
    public void testWrap_StringInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testWrap_StringInt();
        }
    }

    @Test(timeout=120000)
    public void testWrap_StringIntStringBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testWrap_StringIntStringBoolean();
        }
    }

    @Test(timeout=120000)
    public void testCapitalize_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testCapitalize_String();
        }
    }

    @Test(timeout=120000)
    public void testCapitalizeWithDelimiters_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testCapitalizeWithDelimiters_String();
        }
    }

    @Test(timeout=120000)
    public void testCapitalizeFully_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testCapitalizeFully_String();
        }
    }

    @Test(timeout=120000)
    public void testCapitalizeFullyWithDelimiters_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testCapitalizeFullyWithDelimiters_String();
        }
    }

    @Test(timeout=120000)
    public void testUncapitalize_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testUncapitalize_String();
        }
    }

    @Test(timeout=120000)
    public void testUncapitalizeWithDelimiters_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testUncapitalizeWithDelimiters_String();
        }
    }

    @Test(timeout=120000)
    public void testInitials_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testInitials_String();
        }
    }

    @Test(timeout=120000)
    public void testInitials_String_charArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.WordUtilsTest object = new org.apache.commons.lang3.text.WordUtilsTest();
               object.testInitials_String_charArray();
        }
    }

}