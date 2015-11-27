package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestTimeOfDay_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGet");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithChronologyRetainFields_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_sameChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithChronologyRetainFields_sameChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_nullChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithChronologyRetainFields_nullChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testIsBefore_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testIsAfter_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testIsEqual_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithField3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithField4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeToday() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToDateTimeToday");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithField1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithField2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testWithFieldAdded4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testPlusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testPlusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testPlusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testMinusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMinutes_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testMinusMinutes_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusSeconds_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testMinusSeconds_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testMinusMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testPlusHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeToday_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToDateTimeToday_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeToday_nullZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToDateTimeToday_nullZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Basics("testToString");
			testcase.run();
		}
	}

}