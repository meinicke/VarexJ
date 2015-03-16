package cmu.defect4j.jfree.data.xy.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class XYSeriesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCloning3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testCloning3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testSetMaximumItemCount2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testIndexOf2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdditionOfDuplicateXValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testAdditionOfDuplicateXValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testRemove");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testIndexOf3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testDelete");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testSetMaximumItemCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testAddOrUpdate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testAddOrUpdate2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testAddOrUpdate3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMinY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testGetMinY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMaxY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testGetMaxY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testRemove2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdate2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdate2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testSetMaximumItemCount3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testSetMaximumItemCount4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testToArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToArrayExample() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testToArrayExample");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1955483() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testBug1955483");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMinX() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testGetMinX");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMaxX() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testGetMaxX");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateByIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdateByIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateByIndex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdateByIndex2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateByIndex3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdateByIndex3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateXY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testUpdateXY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testCloning2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testClear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesTests("testIndexOf");
			testcase.run();
		}
	}

}