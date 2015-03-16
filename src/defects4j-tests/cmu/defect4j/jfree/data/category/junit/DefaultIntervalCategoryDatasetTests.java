package cmu.defect4j.jfree.data.category.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultIntervalCategoryDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetRowCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetRowCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStartValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testSetStartValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEndValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testSetEndValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetSeriesCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetCategoryCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetCategoryCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetSeriesIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetRowIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSeriesKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testSetSeriesKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetCategoryIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetCategoryIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetColumnIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetCategoryKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testSetCategoryKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetColumnKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetRowKeys");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowAndColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetRowAndColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.category.junit.DefaultIntervalCategoryDatasetTests("testCloning2");
			testcase.run();
		}
	}

}