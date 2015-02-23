package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalDate_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testPlusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testPlusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testPlusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testPlusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testMinusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testMinusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testMinusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testMinusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testIsSupported_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetFieldType_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetField_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testGetValue_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DurationFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testIsSupported_DurationFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCodeAPI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testEqualsHashCodeAPI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_LocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testIsEqual_LocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_LocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testIsBefore_LocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_LocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testIsAfter_LocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithField_DateTimeFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithField_DateTimeFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithField_DateTimeFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithField_DateTimeFieldType_int_4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithFieldAdded_DurationFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithFieldAdded_DurationFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithFieldAdded_DurationFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithFieldAdded_DurationFieldType_int_4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testWithFieldAdded_DurationFieldType_int_5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtStartOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtStartOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtStartOfDay_avoidDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtStartOfDay_avoidDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtStartOfDay_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtStartOfDay_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtStartOfDay_Zone_avoidDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtStartOfDay_Zone_avoidDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtStartOfDay_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtStartOfDay_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtMidnight_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtMidnight_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtMidnight_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtMidnight_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtCurrentTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtCurrentTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtCurrentTime_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtCurrentTime_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeAtCurrentTime_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTimeAtCurrentTime_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDateTime_LocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToLocalDateTime_LocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDateTime_nullLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToLocalDateTime_nullLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDateTime_wrongChronologyLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToLocalDateTime_wrongChronologyLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_LocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_LocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_nullLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_LocalTime_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_LocalTime_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_LocalTime_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_LocalTime_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullLocalTime_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_nullLocalTime_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_wrongChronoLocalTime_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_wrongChronoLocalTime_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateMidnight_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateMidnight_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateMidnight_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateMidnight_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToInterval_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval_Zone_noMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToInterval_Zone_noMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToInterval_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_summer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDate_summer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_winter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDate_winter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDate_springDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST_2Hour40Savings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDate_springDST_2Hour40Savings");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_autumnDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToDate_autumnDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Basics("testToString");
			testcase.run();
		}
	}

}