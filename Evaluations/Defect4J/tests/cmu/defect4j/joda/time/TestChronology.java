package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode_ISO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testEqualsHashCode_ISO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode_Lenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testEqualsHashCode_Lenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode_Strict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testEqualsHashCode_Strict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode_Limit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testEqualsHashCode_Limit");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode_Zoned() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testEqualsHashCode_Zoned");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestChronology("testToString");
			testcase.run();
		}
	}

}