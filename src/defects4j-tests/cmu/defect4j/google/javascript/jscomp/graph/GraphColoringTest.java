package cmu.defect4j.google.javascript.jscomp.graph;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GraphColoringTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDeterministic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testDeterministic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoEdge() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testNoEdge();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoNodesConnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testTwoNodesConnected();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreedy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testGreedy();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFullyConnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testFullyConnected();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllConnectedToOneNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testAllConnectedToOneNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoFullyConnected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphColoringTest() {
				public void runTest() throws Exception {
					testTwoFullyConnected();
				}
			};
			testcase.run();
		}
	}

}