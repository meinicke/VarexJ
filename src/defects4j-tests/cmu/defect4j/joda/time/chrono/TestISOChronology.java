package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISOChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCutoverAddYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testCutoverAddYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeOfDayAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testTimeOfDayAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaximumValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testMaximumValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaxYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testMaxYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testMinYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testAddMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPartialDayOfYearAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testPartialDayOfYearAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testFactoryUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testFactory");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testFactory_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testEquality");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testWithUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testToString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testDurationFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestISOChronology("testTimeFields");
			testcase.run();
		}
	}

}