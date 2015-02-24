package cmu.defect4j.joda.time.convert;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestReadablePartialConverter extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSupportedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testSupportedType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testGetPartialValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleton() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testSingleton");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetChronology_Object_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testGetChronology_Object_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetChronology_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testGetChronology_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestReadablePartialConverter("testToString");
			testcase.run();
		}
	}

}