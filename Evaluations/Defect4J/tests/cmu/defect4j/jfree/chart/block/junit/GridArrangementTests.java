package cmu.defect4j.jfree.chart.block.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GridArrangementTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testFN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNF() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNF");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRF() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testRF");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRR() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testRR");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testRN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNR() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNR");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullBlock_FF() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNullBlock_FF");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullBlock_FN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNullBlock_FN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullBlock_FR() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNullBlock_FR");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullBlock_NN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testNullBlock_NN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGridNotFull_FF() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testGridNotFull_FF");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGridNotFull_FN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testGridNotFull_FN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGridNotFull_FR() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testGridNotFull_FR");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGridNotFull_NN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.GridArrangementTests("testGridNotFull_NN");
			testcase.run();
		}
	}

}