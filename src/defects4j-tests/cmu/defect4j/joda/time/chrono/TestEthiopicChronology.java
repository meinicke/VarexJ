package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestEthiopicChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSampleDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testSampleDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleDateWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testSampleDateWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testDurationYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testDurationMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testFactoryUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testFactory");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testFactory_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testEquality");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testWithUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testToString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testDurationFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testTimeFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEpoch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testEpoch");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestEthiopicChronology("testCalendar");
			testcase.run();
		}
	}

}