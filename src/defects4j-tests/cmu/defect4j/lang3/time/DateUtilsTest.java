package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
// FIXME
public class DateUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testIsSameDay_Date() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIsSameDay_Date();
        }
    }

    @Test(timeout=120000)
    public void testIsSameDay_Cal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIsSameDay_Cal();
        }
    }

    @Test(timeout=120000)
    public void testIsSameInstant_Date() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIsSameInstant_Date();
        }
    }

    @Test(timeout=120000)
    public void testIsSameInstant_Cal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIsSameInstant_Cal();
        }
    }

    @Test(timeout=120000)
    public void testIsSameLocalTime_Cal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIsSameLocalTime_Cal();
        }
    }

    @Test(timeout=120000)
    public void testParseDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testParseDate();
        }
    }

    @Test(timeout=120000)
    public void testParseDateWithLeniency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testParseDateWithLeniency();
        }
    }

    @Test(timeout=120000)
    public void testAddYears() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddYears();
        }
    }

    @Test(timeout=120000)
    public void testAddMonths() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddMonths();
        }
    }

    @Test(timeout=120000)
    public void testAddWeeks() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddWeeks();
        }
    }

    @Test(timeout=120000)
    public void testAddDays() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddDays();
        }
    }

    @Test(timeout=120000)
    public void testAddHours() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddHours();
        }
    }

    @Test(timeout=120000)
    public void testAddMinutes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddMinutes();
        }
    }

    @Test(timeout=120000)
    public void testAddSeconds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddSeconds();
        }
    }

    @Test(timeout=120000)
    public void testAddMilliseconds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testAddMilliseconds();
        }
    }

    @Test(timeout=120000)
    public void testSetYears() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetYears();
        }
    }

    @Test(timeout=120000)
    public void testSetMonths() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetMonths();
        }
    }

    @Test(timeout=120000)
    public void testSetDays() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetDays();
        }
    }

    @Test(timeout=120000)
    public void testSetHours() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetHours();
        }
    }

    @Test(timeout=120000)
    public void testSetMinutes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetMinutes();
        }
    }

    @Test(timeout=120000)
    public void testSetSeconds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetSeconds();
        }
    }

    @Test(timeout=120000)
    public void testSetMilliseconds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testSetMilliseconds();
        }
    }

    @Test(timeout=120000)
    public void testToCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testToCalendar();
        }
    }

    @Test(timeout=120000)
    public void testRound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testRound();
        }
    }

    @Test(timeout=120000)
    public void testRoundLang346() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testRoundLang346();
        }
    }

    @Test(timeout=120000)
    public void testTruncate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testTruncate();
        }
    }

    @Test(timeout=120000)
    public void testTruncateLang59() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testTruncateLang59();
        }
    }

    @Test(timeout=120000)
    public void testLang530() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLang530();
        }
    }

    @Test(timeout=120000)
    public void testCeil() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testCeil();
        }
    }

    @Test(timeout=120000)
    public void testIteratorEx() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testIteratorEx();
        }
    }

    @Test(timeout=120000)
    public void testWeekIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testWeekIterator();
        }
    }

    @Test(timeout=120000)
    public void testMonthIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testMonthIterator();
        }
    }

    @Test(timeout=120000)
    public void testLANG799_EN_OK() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLANG799_EN_OK();
        }
    }

    @Test(timeout=120000)
    public void testLANG799_EN_FAIL() throws Exception {
        if (verifyUnhandledException("java.text.ParseException", config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLANG799_EN_FAIL();
        }
    }

    @Test(timeout=120000)
    public void testLANG799_DE_OK() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLANG799_DE_OK();
        }
    }

    @Test(timeout=120000)
    public void testLANG799_DE_FAIL() throws Exception {
        if (verifyUnhandledException("java.text.ParseException", config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLANG799_DE_FAIL();
        }
    }

    @Test(timeout=120000)
    public void testLANG799_EN_WITH_DE_LOCALE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsTest object = new org.apache.commons.lang3.time.DateUtilsTest();
               object.setUp();
               object.testLANG799_EN_WITH_DE_LOCALE();
        }
    }

}