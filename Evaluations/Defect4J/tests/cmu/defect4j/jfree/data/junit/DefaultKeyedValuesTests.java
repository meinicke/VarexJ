package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultKeyedValuesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testAddValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testRemoveValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetItemCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetItemCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testGetIndex2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsertValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testInsertValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsertAndRetrieve() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testInsertAndRetrieve");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByKeyAscending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testSortByKeyAscending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByKeyDescending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testSortByKeyDescending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByValueAscending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testSortByValueAscending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortByValueDescending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testSortByValueDescending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValuesTests("testClear");
			testcase.run();
		}
	}

}