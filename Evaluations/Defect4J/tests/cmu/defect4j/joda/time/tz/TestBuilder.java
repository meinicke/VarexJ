package cmu.defect4j.joda.time.tz;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestBuilder extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFixed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestBuilder("testFixed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardTransitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestBuilder("testForwardTransitions");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReverseTransitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestBuilder("testReverseTransitions");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testID() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestBuilder("testID");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.tz.TestBuilder("testSerialization");
			testcase.run();
		}
	}

}