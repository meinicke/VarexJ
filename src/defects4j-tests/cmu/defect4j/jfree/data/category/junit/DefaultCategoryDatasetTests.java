package cmu.defect4j.jfree.data.category.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultCategoryDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testGetValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncrementValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testIncrementValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testGetRowCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testGetColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testAddValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testRemoveValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1835955() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testBug1835955");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveColumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testRemoveColumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testRemoveRow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultCategoryDatasetTests("testGetValue");
			testcase.run();
		}
	}

}