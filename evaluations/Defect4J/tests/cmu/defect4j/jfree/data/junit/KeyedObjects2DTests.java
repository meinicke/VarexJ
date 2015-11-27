package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class KeyedObjects2DTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testRemoveValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveColumnByKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testRemoveColumnByKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValueByIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testGetValueByIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValueByKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testGetValueByKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testSetObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRowByIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testRemoveRowByIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveColumnByIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testRemoveColumnByIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRowByKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjects2DTests("testRemoveRowByKey");
			testcase.run();
		}
	}

}