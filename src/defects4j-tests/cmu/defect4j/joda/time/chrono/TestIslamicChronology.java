package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestIslamicChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSampleDateWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testSampleDateWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFieldConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testFieldConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleDate1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testSampleDate1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleDate2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testSampleDate2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleDate3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testSampleDate3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test15BasedLeapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("test15BasedLeapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test16BasedLeapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("test16BasedLeapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndianBasedLeapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testIndianBasedLeapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHabashAlHasibBasedLeapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testHabashAlHasibBasedLeapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testFactoryUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testFactory");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testFactory_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testEquality");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testWithUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testToString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testDurationFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testTimeFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEpoch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testEpoch");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestIslamicChronology("testCalendar");
			testcase.run();
		}
	}

}