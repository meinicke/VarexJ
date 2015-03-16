package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
//FIXME
public class FastDateFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void test_getInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_getInstance();
        }
    }

    @Test(timeout=120000)
    public void test_getInstance_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_getInstance_String();
        }
    }

    @Test(timeout=120000)
    public void test_getInstance_String_TimeZone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_getInstance_String_TimeZone();
        }
    }

    @Test(timeout=120000)
    public void test_getInstance_String_Locale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_getInstance_String_Locale();
        }
    }

    @Test(timeout=120000)
    public void test_changeDefault_Locale_DateInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_changeDefault_Locale_DateInstance();
        }
    }

    @Test(timeout=120000)
    public void test_changeDefault_Locale_DateTimeInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_changeDefault_Locale_DateTimeInstance();
        }
    }

    @Test(timeout=120000)
    public void test_getInstance_String_TimeZone_Locale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.test_getInstance_String_TimeZone_Locale();
        }
    }

    @Test(timeout=120000)
    public void testCheckDefaults() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testCheckDefaults();
        }
    }

    @Test(timeout=120000)
    public void testCheckDifferingStyles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testCheckDifferingStyles();
        }
    }

    @Test(timeout=120000)
    public void testDateDefaults() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testDateDefaults();
        }
    }

    @Test(timeout=120000)
    public void testTimeDefaults() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testTimeDefaults();
        }
    }

    @Test(timeout=120000)
    public void testTimeDateDefaults() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testTimeDateDefaults();
        }
    }

    @Test(timeout=120000)
    public void testParseSync() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormatTest object = new org.apache.commons.lang3.time.FastDateFormatTest();
               object.testParseSync();
        }
    }

}