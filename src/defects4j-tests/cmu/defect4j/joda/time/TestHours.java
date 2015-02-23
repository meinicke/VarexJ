package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestHours extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFactory_hours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_hours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_hoursBetween_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_hoursBetween_RInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_hoursBetween_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_hoursBetween_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_hoursIn_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_hoursIn_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardHoursIn_RPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_standardHoursIn_RPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_parseHours_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testFactory_parseHours_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_Hours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testPlus_Hours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_Hours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testMinus_Hours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsGreaterThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testIsGreaterThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLessThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testIsLessThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToStandardWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToStandardMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToStandardDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testPlus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testMinus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testMultipliedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testDividedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testAddToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToStandardDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestHours("testToString");
			testcase.run();
		}
	}

}