package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsTrimEmptyTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIsEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testIsEmpty();
        }
    }

    @Test(timeout=120000)
    public void testIsNotEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testIsNotEmpty();
        }
    }

    @Test(timeout=120000)
    public void testIsBlank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testIsBlank();
        }
    }

    @Test(timeout=120000)
    public void testIsNotBlank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testIsNotBlank();
        }
    }

    @Test(timeout=120000)
    public void testTrim() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testTrim();
        }
    }

    @Test(timeout=120000)
    public void testTrimToNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testTrimToNull();
        }
    }

    @Test(timeout=120000)
    public void testTrimToEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testTrimToEmpty();
        }
    }

    @Test(timeout=120000)
    public void testStrip_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStrip_String();
        }
    }

    @Test(timeout=120000)
    public void testStripToNull_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripToNull_String();
        }
    }

    @Test(timeout=120000)
    public void testStripToEmpty_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripToEmpty_String();
        }
    }

    @Test(timeout=120000)
    public void testStrip_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStrip_StringString();
        }
    }

    @Test(timeout=120000)
    public void testStripStart_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripStart_StringString();
        }
    }

    @Test(timeout=120000)
    public void testStripEnd_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripEnd_StringString();
        }
    }

    @Test(timeout=120000)
    public void testStripAll() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripAll();
        }
    }

    @Test(timeout=120000)
    public void testStripAccents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsTrimEmptyTest object = new org.apache.commons.lang3.StringUtilsTrimEmptyTest();
               object.testStripAccents();
        }
    }

}