package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDurationFieldType extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_other() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_other");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_eras() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_eras");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_centuries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_centuries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekyears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_weekyears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_weeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_days() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_days");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_halfdays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_halfdays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_hours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_minutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_minutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_seconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_seconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_millis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDurationFieldType("test_millis");
			testcase.run();
		}
	}

}