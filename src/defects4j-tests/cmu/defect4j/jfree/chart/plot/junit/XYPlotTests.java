package cmu.defect4j.jfree.chart.plot.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class XYPlotTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCloning3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2817504() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testBug2817504");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSerialization5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetRenderer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSetRenderer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDomainMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testAddDomainMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddRangeMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testAddRangeMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1654215() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("test1654215");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDomainMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testRemoveDomainMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRangeMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testRemoveRangeMarker");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainAxisForDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testGetDomainAxisForDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeAxisForDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testGetRangeAxisForDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetNullRenderer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSetNullRenderer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloneIndependence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloneIndependence");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_QuadrantOrigin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning_QuadrantOrigin");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_QuadrantPaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning_QuadrantPaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRendererForDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testGetRendererForDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testRemoveAnnotation");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawRangeGridlines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testDrawRangeGridlines");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawSeriesWithZeroItems() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testDrawSeriesWithZeroItems");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLegendItems() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testGetLegendItems");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testCloning2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSerialization1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSerialization3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.XYPlotTests("testSerialization4");
			testcase.run();
		}
	}

}