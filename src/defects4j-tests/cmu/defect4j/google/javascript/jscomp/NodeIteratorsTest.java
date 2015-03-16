package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NodeIteratorsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBasic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testBasic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testNamedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testNamedFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testFunctionExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testFunctionExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtVarRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtVarRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtVarRef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtVarRef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtVarRef3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtVarRef3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtSideEffects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtSideEffects2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtSideEffects3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtSideEffects3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtSideEffects4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtSideEffects4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltAtSideEffects5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltAtSideEffects5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoHaltReadWhenValueIsImmutable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testNoHaltReadWhenValueIsImmutable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHaltReadWhenValueHasSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testHaltReadWhenValueHasSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatchBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testCatchBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeIteratorsTest() {
				public void runTest() throws Exception {
					testIfBranch();
				}
			};
			testcase.run();
		}
	}

}