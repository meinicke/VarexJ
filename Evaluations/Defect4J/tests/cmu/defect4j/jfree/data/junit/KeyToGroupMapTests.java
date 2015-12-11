package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class KeyToGroupMapTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMapKeyToGroup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testMapKeyToGroup");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testGroupCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKeyCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testKeyCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetGroupIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testGetGroupIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetGroup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyToGroupMapTests("testGetGroup");
			testcase.run();
		}
	}

}