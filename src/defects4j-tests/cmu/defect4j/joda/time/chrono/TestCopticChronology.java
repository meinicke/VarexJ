package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestCopticChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSampleDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testSampleDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleDateWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testSampleDateWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testDurationYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testDurationMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testFactoryUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testFactory");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testFactory_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testEquality");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testWithUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testToString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testDurationFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testTimeFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEpoch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testEpoch");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestCopticChronology("testCalendar");
			testcase.run();
		}
	}

}