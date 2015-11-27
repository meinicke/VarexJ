package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestInstant_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImmutable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testImmutable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testGet_DateTimeField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet_DateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testGet_DateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTimeISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToMutableDateTimeISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToMutableDateTime_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableDateTime_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToMutableDateTime_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillis_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testWithMillis_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testWithDurationAdded_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testWithDurationAdded_RD_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testPlus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testPlus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testMinus_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testMinus_RD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsEqual_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqualNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsEqualNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsEqual_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsBefore_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBeforeNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsBeforeNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsBefore_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsAfter_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfterNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsAfterNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testIsAfter_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Basics("testToString");
			testcase.run();
		}
	}

}