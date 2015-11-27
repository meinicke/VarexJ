package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTime_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testGet_DateTimeField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testGetters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToMutableDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToMutableDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToMutableDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToCalendar_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToCalendar_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToGregorianCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToGregorianCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToYearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToYearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillis_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithMillis_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronology_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithChronology_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZoneRetainFields_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithZoneRetainFields_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFields_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithFields_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithField1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithField2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithFieldAdded1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithFieldAdded2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithFieldAdded3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithFieldAdded4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithDurationAdded_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithDurationAdded_RD_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RP_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithDurationAdded_RP_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithZone_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDate_int_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithDate_int_int_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithTime_int_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testWithTime_int_int_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testMinusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsSupported_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsEqual_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqualNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsEqualNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsEqual_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsBefore_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBeforeNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsBeforeNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsBefore_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsAfter_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfterNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsAfterNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testIsAfter_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToDateMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToTimeOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToTimeOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToLocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testPlusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTime_Basics("testToString");
			testcase.run();
		}
	}

}