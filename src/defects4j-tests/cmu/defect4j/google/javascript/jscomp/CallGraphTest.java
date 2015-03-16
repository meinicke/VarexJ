package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CallGraphTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetAllFunctionsContainsNamespaceAssignedLiteralFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctionsContainsNamespaceAssignedLiteralFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionForAstNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetFunctionForAstNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllFunctionsContainsNormalFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctionsContainsNormalFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllFunctionsContainsVarAssignedLiteralFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctionsContainsVarAssignedLiteralFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllFunctionsContainsLocalFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctionsContainsLocalFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllFunctionsContainsAnonymousFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllFunctionsContainsAnonymousFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetCallsiteForAstNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetCallsiteForAstNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetCallsites() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetCallsites();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindNewInFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFindNewInFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindCallsiteTargetGlobalName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFindCallsiteTargetGlobalName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindCallsiteTargetAliasedGlobalProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFindCallsiteTargetAliasedGlobalProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllCallsitesContainsMultiple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllCallsitesContainsMultiple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllCallsitesContainsGlobalSite() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllCallsitesContainsGlobalSite();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllCallsitesContainsLocalSite() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllCallsitesContainsLocalSite();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllCallsitesContainsLiteralSite() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllCallsitesContainsLiteralSite();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAllCallsitesContainsConstructorSite() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetAllCallsitesContainsConstructorSite();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDirectedGraph_backwardOnBackward() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetDirectedGraph_backwardOnBackward();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDirectedGraph_backwardOnForward() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetDirectedGraph_backwardOnForward();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDirectedGraph_forwardOnForward() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetDirectedGraph_forwardOnForward();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDirectedGraph_forwardOnBackward() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testGetDirectedGraph_forwardOnBackward();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionIsMain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionIsMain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetAstNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetAstNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetBodyNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetBodyNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetCallsitesInFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetCallsitesInFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetCallsitesInFunction_ignoreInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetCallsitesInFunction_ignoreInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetCallsitesPossiblyTargetingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetCallsitesPossiblyTargetingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetCallsitesInFunction_newIsCallsite() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetCallsitesInFunction_newIsCallsite();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetIsAliased() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetIsAliased();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGetIsExposedToCallOrApply() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testFunctionGetIsExposedToCallOrApply();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallsiteGetAstNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testCallsiteGetAstNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallsiteGetContainingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testCallsiteGetContainingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallsiteGetKnownTargets() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testCallsiteGetKnownTargets();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallsiteHasUnknownTarget() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testCallsiteHasUnknownTarget();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallsiteHasExternTarget() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testCallsiteHasExternTarget();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowForBackwardOpOnForwardGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testThrowForBackwardOpOnForwardGraph();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowForForwardOpOnBackwardGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CallGraphTest() {
				public void runTest() throws Exception {
					testThrowForForwardOpOnBackwardGraph();
				}
			};
			testcase.run();
		}
	}

}