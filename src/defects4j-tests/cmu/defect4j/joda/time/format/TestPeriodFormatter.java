package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriodFormatter extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testWithGetLocaleMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testWithGetLocaleMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetParseTypeMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testWithGetParseTypeMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParsePeriod_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testParsePeriod_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParsePeriod_parseType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testParsePeriod_parseType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutablePeriod_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testParseMutablePeriod_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testPrint_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_bufferMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testPrint_bufferMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_writerMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testPrint_writerMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrinterParserMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testPrinterParserMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatter("testParseInto_simple");
			testcase.run();
		}
	}

}