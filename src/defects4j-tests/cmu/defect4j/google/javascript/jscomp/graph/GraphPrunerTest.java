package cmu.defect4j.google.javascript.jscomp.graph;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GraphPrunerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testThreeNodesConnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphPrunerTest() {
				public void runTest() throws Exception {
					testThreeNodesConnected();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThreeNodesDisconnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphPrunerTest() {
				public void runTest() throws Exception {
					testThreeNodesDisconnected();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFourNodesConnected1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphPrunerTest() {
				public void runTest() throws Exception {
					testFourNodesConnected1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFourNodesConnected2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphPrunerTest() {
				public void runTest() throws Exception {
					testFourNodesConnected2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFiveNodesConnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphPrunerTest() {
				public void runTest() throws Exception {
					testFiveNodesConnected();
				}
			};
			testcase.run();
		}
	}

}