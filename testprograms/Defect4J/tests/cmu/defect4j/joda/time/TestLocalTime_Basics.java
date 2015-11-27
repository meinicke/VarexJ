package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalTime_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testPlusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testPlusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testPlusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testMinusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testMinusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testMinusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testMinusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testIsSupported_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testPlusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetFieldType_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetField_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testGetValue_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported_DurationFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testIsSupported_DurationFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithField_DateTimeFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithField_DateTimeFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithField_DateTimeFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_DateTimeFieldType_int_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithField_DateTimeFieldType_int_4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_LocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testIsEqual_LocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_LocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testIsBefore_LocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_LocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testIsAfter_LocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_DurationFieldType_int_8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testWithFieldAdded_DurationFieldType_int_8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeTodayDefaultZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToDateTimeTodayDefaultZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeToday_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToDateTimeToday_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeToday_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToDateTimeToday_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Basics("testToString");
			testcase.run();
		}
	}

}