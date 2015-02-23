package cmu.defect4j.joda.time.convert;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestReadableIntervalConverter extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetDurationMillis_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testGetDurationMillis_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupportedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSupportedType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleton() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSingleton");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testGetPeriodType_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsReadableInterval_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testIsReadableInterval_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoPeriod_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoPeriod_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoInterval_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoInterval_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoInterval_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testSetIntoInterval_Object4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadableIntervalConverter("testToString");
			testcase.run();
		}
	}

}