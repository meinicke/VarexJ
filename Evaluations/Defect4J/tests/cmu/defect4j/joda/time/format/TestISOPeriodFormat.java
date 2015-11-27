package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISOPeriodFormat extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSubclassableConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testSubclassableConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatStandard_negative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatStandard_negative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAlternate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatAlternate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAlternateExtended() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatAlternateExtended");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAlternateWithWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatAlternateWithWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAlternateExtendedWithWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormat("testFormatAlternateExtendedWithWeeks");
			testcase.run();
		}
	}

}