package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ControlFlowAnalysisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakingBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testBreakingBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakingTryBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testBreakingTryBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testWithStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleNoDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleNoDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchDefaultFirst() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSwitchDefaultFirst();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchDefaultInMiddle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSwitchDefaultInMiddle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchEmpty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSwitchEmpty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnThrowingException() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testReturnThrowingException();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleForWithContinue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleForWithContinue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testNestedFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedDoWithBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testNestedDoWithBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithinTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testFunctionWithinTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testNestedCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleCatchFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplicatedFinally2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testComplicatedFinally2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeepNestedBreakwithFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testDeepNestedBreakwithFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeepNestedFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testDeepNestedFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnInFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testReturnInFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnInFinally2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testReturnInFinally2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnInTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testReturnInTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionNotToTraverseFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testOptionNotToTraverseFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSynBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSynBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPartialTraversalOfScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testPartialTraversalOfScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForLoopOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testForLoopOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabelledForInLoopOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testLabelledForInLoopOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testLocalFunctionOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoWhileOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testDoWhileOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakInFinally1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testBreakInFinally1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakInFinally2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testBreakInFinally2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlFlowAnalysisTest() {
				public void runTest() throws Exception {
					testReturn();
				}
			};
			testcase.run();
		}
	}

}