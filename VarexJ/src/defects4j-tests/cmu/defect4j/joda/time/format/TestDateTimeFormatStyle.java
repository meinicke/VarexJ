package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeFormatStyle extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForStyle_longDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_longDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_stringLengths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_stringLengths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_invalidStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_invalidStrings");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_longTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_longTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_longDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_longDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_fullDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_fullDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_fullTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_fullTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_fullDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_fullDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortMediumDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortMediumDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortLongDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortLongDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_shortFullDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_shortFullDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumShortDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumShortDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumLongDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumLongDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStyle_mediumFullDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatStyle("testForStyle_mediumFullDateTime");
			testcase.run();
		}
	}

}