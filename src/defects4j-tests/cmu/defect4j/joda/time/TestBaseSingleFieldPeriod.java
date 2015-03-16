package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestBaseSingleFieldPeriod extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFactory_between_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testFactory_between_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardPeriodIn_RPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testFactory_standardPeriodIn_RPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueIndexMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testValueIndexMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFieldTypeIndexMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testFieldTypeIndexMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testGet");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testToPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutablePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testToMutablePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testGetSetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_between_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestBaseSingleFieldPeriod("testFactory_between_RInstant");
			testcase.run();
		}
	}

}