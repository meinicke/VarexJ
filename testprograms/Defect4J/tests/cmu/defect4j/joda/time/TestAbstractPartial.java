package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestAbstractPartial extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestAbstractPartial("testGetPropertyEquals");
			testcase.run();
		}
	}

}