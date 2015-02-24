package cmu.defect4j.joda.time.tz;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestCompiler extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDateTimeZoneBuilder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("testDateTimeZoneBuilder");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("testCompile");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_2400_fromDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_2400_fromDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_2400_last() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_2400_last");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_Amman_2003() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_Amman_2003");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_Amman_2004() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_Amman_2004");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_Amman_2005() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_Amman_2005");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_Amman_2006() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestCompiler("test_Amman_2006");
			testcase.run();
		}
	}

}