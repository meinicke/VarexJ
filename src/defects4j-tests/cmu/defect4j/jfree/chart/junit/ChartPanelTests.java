package cmu.defect4j.jfree.chart.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ChartPanelTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("testConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetChart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("testSetChart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetListeners() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("testGetListeners");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoom");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomInBoth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomInBoth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomOutBoth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomOutBoth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_restoreAutoBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_restoreAutoBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomInDomain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomInDomain");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomInRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomInRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomOutDomain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomOutDomain");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_zoomOutRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_zoomOutRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_restoreAutoDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_restoreAutoDomainBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2502355_restoreAutoRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("test2502355_restoreAutoRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMouseWheelEnabled() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.ChartPanelTests("testSetMouseWheelEnabled");
			testcase.run();
		}
	}

}