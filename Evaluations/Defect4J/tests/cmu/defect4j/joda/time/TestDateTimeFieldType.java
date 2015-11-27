package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeFieldType extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_era() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_era");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_centuryOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_centuryOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_yearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_yearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_yearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_yearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_year() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_year");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_monthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_monthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekyearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_weekyearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_weekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_weekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_dayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_dayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_dayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_halfdayOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_halfdayOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_clockhourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_clockhourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_clockhourOfHalfday() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_clockhourOfHalfday");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourOfHalfday() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_hourOfHalfday");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_hourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_minuteOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_minuteOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_minuteOfHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_minuteOfHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_secondOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_secondOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_secondOfMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_secondOfMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_millisOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_millisOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_millisOfSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_millisOfSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_other() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeFieldType("test_other");
			testcase.run();
		}
	}

}