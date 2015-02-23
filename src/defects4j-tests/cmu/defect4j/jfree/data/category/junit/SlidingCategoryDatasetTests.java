package cmu.defect4j.jfree.data.category.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SlidingCategoryDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetRowCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetRowCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetRowIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetColumnIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetColumnKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.SlidingCategoryDatasetTests("testGetValue");
			testcase.run();
		}
	}

}