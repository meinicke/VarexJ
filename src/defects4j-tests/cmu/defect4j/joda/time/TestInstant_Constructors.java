package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestInstant_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_now() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("test_now");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_formatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testParse_formatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_invalidObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_invalidObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_nullObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_badconverterObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInstant_Constructors("testConstructor_badconverterObject");
			testcase.run();
		}
	}

}