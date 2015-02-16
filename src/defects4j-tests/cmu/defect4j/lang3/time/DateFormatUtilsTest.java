package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DateFormatUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testFormat();
        }
    }

    @Test(timeout=120000)
    public void testFormatCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testFormatCalendar();
        }
    }

    @Test(timeout=120000)
    public void testFormatUTC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testFormatUTC();
        }
    }

    @Test(timeout=120000)
    public void testDateTimeISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testDateTimeISO();
        }
    }

    @Test(timeout=120000)
    public void testDateISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testDateISO();
        }
    }

    @Test(timeout=120000)
    public void testTimeISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testTimeISO();
        }
    }

    @Test(timeout=120000)
    public void testTimeNoTISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testTimeNoTISO();
        }
    }

    @Test(timeout=120000)
    public void testSMTP() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateFormatUtilsTest object = new org.apache.commons.lang3.time.DateFormatUtilsTest();
               object.testSMTP();
        }
    }

}