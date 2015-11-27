package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestSerialization extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateTimeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateTimeProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedMutableDateTimeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedMutableDateTimeProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateMidnightProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateMidnightProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedLocalDateBuddhist() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedLocalDateBuddhist");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedLocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedLocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedYearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedYearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedTimeOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedTimeOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateTimeZoneUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateTimeZoneUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedCopticChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedCopticChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedISOChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedISOChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedGJChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedGJChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedGJChronologyChangedInternals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedGJChronologyChangedInternals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedGregorianChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedGregorianChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedJulianChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedJulianChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedBuddhistChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedBuddhistChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedDateTimeFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedDateTimeFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerializedUnsupportedDateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestSerialization("testSerializedUnsupportedDateTimeField");
			testcase.run();
		}
	}

}