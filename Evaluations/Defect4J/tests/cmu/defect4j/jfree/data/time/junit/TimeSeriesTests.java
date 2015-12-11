package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TimeSeriesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAddValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAddValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testClone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testClone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testDelete");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testDelete2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testDelete3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete_RegularTimePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testDelete_RegularTimePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateCopy1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testCreateCopy1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateCopy2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testCreateCopy2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateCopy3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testCreateCopy3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testSetMaximumItemCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAddOrUpdate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAddOrUpdate2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAddOrUpdate3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddOrUpdate4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAddOrUpdate4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1075255() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testBug1075255");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1832432() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testBug1832432");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDataItem1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetDataItem1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDataItem2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetDataItem2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAgedItems() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testRemoveAgedItems");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAgedItems2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testRemoveAgedItems2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAgedItems3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testRemoveAgedItems3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAgedItems4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testRemoveAgedItems4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAgedItems5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testRemoveAgedItems5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1864222() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testBug1864222");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMinY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetMinY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMaxY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testGetMaxY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdate_RegularTimePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testUpdate_RegularTimePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_TimeSeriesDataItem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testAdd_TimeSeriesDataItem");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testEquals2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesTests("testClear");
			testcase.run();
		}
	}

}