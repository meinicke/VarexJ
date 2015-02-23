package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableDateTime_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testGet_DateTimeField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testIsEqual");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testIsBefore");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testIsAfter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToString_String_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToMutableDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToMutableDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToMutableDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToCalendar_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToCalendar_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToGregorianCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToGregorianCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCopy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testCopy");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testClone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRounding8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testRounding8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Basics("testToString");
			testcase.run();
		}
	}

}