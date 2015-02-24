package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class KeyedObjectsTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testRemoveValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveValueInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testRemoveValueInt");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testGetObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testGetKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testGetIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsertAndRetrieve() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testInsertAndRetrieve");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByKeyAscending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSortByKeyAscending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByKeyDescending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSortByKeyDescending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByValueAscending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSortByValueAscending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByValueDescending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSortByValueDescending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testCloning2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.KeyedObjectsTests("testSetObject");
			testcase.run();
		}
	}

}