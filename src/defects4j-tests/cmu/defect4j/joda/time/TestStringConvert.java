package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestStringConvert extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDateMidnight() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testDateMidnight");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMutableDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testLocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testYearMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonthDay_leapDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMonthDay_leapDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutablePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMutablePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestStringConvert("testDuration");
			testcase.run();
		}
	}

}