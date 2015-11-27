package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultKeyedValues2DTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testGetValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testRemoveValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testRemoveRow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSparsePopulation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testSparsePopulation");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRowCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testRowCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveValueBug1690654() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testRemoveValueBug1690654");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveColumnByKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testRemoveColumnByKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testGetRowKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.junit.DefaultKeyedValues2DTests("testGetColumnKey");
			testcase.run();
		}
	}

}