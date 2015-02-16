package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DateUtilsFragmentTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNullDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testNullDate();
        }
    }

    @Test(timeout=120000)
    public void testNullCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testNullCalendar();
        }
    }

    @Test(timeout=120000)
    public void testInvalidFragmentWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testInvalidFragmentWithDate();
        }
    }

    @Test(timeout=120000)
    public void testInvalidFragmentWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testInvalidFragmentWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testSecondFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMinuteFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinuteFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMinuteFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinuteFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testHourOfDayFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHourOfDayFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testHourOfDayFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHourOfDayFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testDayOfYearFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testDayOfYearFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testDayOfYearFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testDayOfYearFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testDateFragmentInLargerUnitWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testDateFragmentInLargerUnitWithDate();
        }
    }

    @Test(timeout=120000)
    public void testDateFragmentInLargerUnitWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testDateFragmentInLargerUnitWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfSecondWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfSecondWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfSecondWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfSecondWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfMinuteWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfMinuteWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfMinuteWithCalender() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfMinuteWithCalender();
        }
    }

    @Test(timeout=120000)
    public void testSecondsofMinuteWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsofMinuteWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondsofMinuteWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsofMinuteWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfHourWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfHourWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfHourWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfHourWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testSecondsofHourWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsofHourWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondsofHourWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsofHourWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfHourWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfHourWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfHourWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfHourWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfDayWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfDayWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfDayWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfDayWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfDayWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfDayWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfDayWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfDayWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfDayWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfDayWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfDayWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfDayWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfDayWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfDayWithDate();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfDayWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfDayWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfMonthWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfMonthWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfMonthWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfMonthWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfMonthWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfMonthWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfMonthWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfMonthWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfMonthWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfMonthWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfMonthWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfMonthWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfMonthWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfMonthWithDate();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfMonthWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfMonthWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfYearWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfYearWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMillisecondsOfYearWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMillisecondsOfYearWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfYearWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfYearWithDate();
        }
    }

    @Test(timeout=120000)
    public void testSecondsOfYearWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testSecondsOfYearWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfYearWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfYearWithDate();
        }
    }

    @Test(timeout=120000)
    public void testMinutesOfYearWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testMinutesOfYearWithCalendar();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfYearWithDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfYearWithDate();
        }
    }

    @Test(timeout=120000)
    public void testHoursOfYearWithCalendar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DateUtilsFragmentTest object = new org.apache.commons.lang3.time.DateUtilsFragmentTest();
               object.setUp();
               object.testHoursOfYearWithCalendar();
        }
    }

}