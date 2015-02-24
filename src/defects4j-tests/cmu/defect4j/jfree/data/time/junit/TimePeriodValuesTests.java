package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TimePeriodValuesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAddValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testAddValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testClone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1161329() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("test1161329");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMinStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testGetMinStartIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMaxStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testGetMaxStartIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMinMiddleIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testGetMinMiddleIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMaxMiddleIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesTests("testGetMaxMiddleIndex");
			testcase.run();
		}
	}

}