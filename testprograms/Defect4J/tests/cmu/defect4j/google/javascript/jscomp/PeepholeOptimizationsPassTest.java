package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeOptimizationsPassTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEmptyPass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testEmptyPass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationRemovingSubtreeChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationRemovingSubtreeChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationRemovingSubtree() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationRemovingSubtree();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationRemovingSubtreeParent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationRemovingSubtreeParent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationsRemoveParentAfterRemoveChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationsRemoveParentAfterRemoveChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizationReplacingNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeOptimizationsPassTest() {
				public void runTest() throws Exception {
					testOptimizationReplacingNode();
				}
			};
			testcase.run();
		}
	}

}