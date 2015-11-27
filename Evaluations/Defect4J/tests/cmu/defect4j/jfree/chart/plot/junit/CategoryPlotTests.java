package cmu.defect4j.jfree.chart.plot.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CategoryPlotTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAxisRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testAxisRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testCloning3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2817504() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testBug2817504");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSerialization5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetRenderer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSetRenderer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1169972() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("test1169972");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDomainMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testAddDomainMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddRangeMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testAddRangeMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1654215() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("test1654215");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainAxisIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testGetDomainAxisIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeAxisIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testGetRangeAxisIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDomainMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testRemoveDomainMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRangeMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testRemoveRangeMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainAxisForDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testGetDomainAxisForDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeAxisForDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testGetRangeAxisForDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testCloning2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSerialization3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.CategoryPlotTests("testSerialization4");
			testcase.run();
		}
	}

}