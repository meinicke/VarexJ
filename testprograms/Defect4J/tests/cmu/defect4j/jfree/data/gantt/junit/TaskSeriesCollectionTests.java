package cmu.defect4j.jfree.data.gantt.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TaskSeriesCollectionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetRowCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetRowCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetColumnCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetSeriesCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetRowIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetColumnIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetSeriesKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRowKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetRowKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStartValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetStartValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStartValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetStartValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStartValue3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetStartValue3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEndValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetEndValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEndValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetEndValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEndValue3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetEndValue3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPercentComplete() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetPercentComplete");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetColumnKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetColumnKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test697153() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("test697153");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test800324() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("test800324");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSubIntervalCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetSubIntervalCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testGetSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.gantt.junit.TaskSeriesCollectionTests("testRemove");
			testcase.run();
		}
	}

}