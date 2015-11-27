package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISOPeriodFormatParsing extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParseStandardFail2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandardFail2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandardFail3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandardFail3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandardFail4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandardFail4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard9");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard10");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandard11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandard11");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStandardFail1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISOPeriodFormatParsing("testParseStandardFail1");
			testcase.run();
		}
	}

}