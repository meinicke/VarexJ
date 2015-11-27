package cmu.defect4j.google.javascript.jscomp.graph;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GraphTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDirectedSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDirectedSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndirectedSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testUndirectedSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectedSelfLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDirectedSelfLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNodeAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testNodeAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndirectedSelfLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testUndirectedSelfLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectedInAndOutEdges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDirectedInAndOutEdges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndirectedNeighbors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testUndirectedNeighbors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectedGetFirstEdge() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDirectedGetFirstEdge();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndirectedGetFirstEdge() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testUndirectedGetFirstEdge();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEdgeAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testEdgeAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDegree() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDegree();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectedConnectIfNotFound() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testDirectedConnectIfNotFound();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleSubGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.GraphTest() {
				public void runTest() throws Exception {
					testSimpleSubGraph();
				}
			};
			testcase.run();
		}
	}

}