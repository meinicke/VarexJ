package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateMidnight_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testGet_DateTimeField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testGetters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testIsEqual");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testIsBefore");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testIsAfter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToString_String_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToMutableDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToMutableDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToMutableDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToCalendar_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToCalendar_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToGregorianCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToGregorianCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToYearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToYearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillis_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithMillis_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronology_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithChronology_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZoneRetainFields_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithZoneRetainFields_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFields_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithFields_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithField1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithField2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithFieldAdded1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithFieldAdded2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithFieldAdded3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithFieldAdded4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithDurationAdded_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithDurationAdded_RD_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RP_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testWithDurationAdded_RP_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testPlusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testMinusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Basics("testToString");
			testcase.run();
		}
	}

}