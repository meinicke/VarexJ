package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NodeTraversalTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPruningCallbackShouldTraverse2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testPruningCallbackShouldTraverse2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPruningCallbackShouldTraverse1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testPruningCallbackShouldTraverse1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReport() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testReport();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnexpectedException() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testUnexpectedException();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetScopeRoot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testGetScopeRoot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetCurrentNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeTraversalTest() {
				public void runTest() throws Exception {
					testGetCurrentNode();
				}
			};
			testcase.run();
		}
	}

}