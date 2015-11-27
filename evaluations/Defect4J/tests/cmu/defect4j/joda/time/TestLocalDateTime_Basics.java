package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalDateTime_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusYears_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusYears_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusWeeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusWeeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testMinusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testIsSupported_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testPlusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetFieldType_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetField_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testGetValue_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DurationFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testIsSupported_DurationFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithField_DateTimeFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithField_DateTimeFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithField_DateTimeFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithFieldAdded_DurationFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithFieldAdded_DurationFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithFieldAdded_DurationFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithFieldAdded_DurationFieldType_int_4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_summer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_summer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_winter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_winter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_springDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST_2Hour40Savings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_springDST_2Hour40Savings");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_autumnDST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_autumnDST");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_LocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testIsEqual_LocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_LocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testIsBefore_LocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_LocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testIsAfter_LocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testWithTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDateTime_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDateTime_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_summer_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_summer_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_winter_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_winter_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_springDST_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_springDST_2Hour40Savings_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_springDST_2Hour40Savings_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate_autumnDST_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToDate_autumnDST_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Basics("testToString");
			testcase.run();
		}
	}

}