package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ScopedAliasesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIssue772() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testIssue772();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneLevel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testOneLevel();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoLevel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTwoLevel();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransitive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTransitive();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransitiveInSameVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTransitiveInSameVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleTransitive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testMultipleTransitive();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFourLevel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testFourLevel();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWorksInClosures() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testWorksInClosures();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testOverridden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTwoScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoSymbolsInTwoScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTwoSymbolsInTwoScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasOfSymbolInGoogScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testAliasOfSymbolInGoogScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedFunctionReturnThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedFunctionReturnThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedFunctionAssignsToVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedFunctionAssignsToVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedFunctionThrows() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedFunctionThrows();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesNotChanged() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testPropertiesNotChanged();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testShadowedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowedScopedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testShadowedScopedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowedScopedVarTwoScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testShadowedScopedVarTwoScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsingObjectLiteralToEscapeScoping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testUsingObjectLiteralToEscapeScoping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocImplements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocImplements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocThrows() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocThrows();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocSubType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocSubType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsDocTypedef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testJsDocTypedef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testArrayJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testObjectJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testUnionJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testFunctionJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testForwardJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTestTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testTestTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testNullType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasRedefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testAliasRedefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasNonRedefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testAliasNonRedefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testScopedThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedImproperly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testUsedImproperly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadParameters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testBadParameters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonAliasLocal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testNonAliasLocal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoGoogScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testNoGoogScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordOneAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testRecordOneAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordMultipleAliases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testRecordMultipleAliases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordAliasFromMultipleGoogScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ScopedAliasesTest() {
				public void runTest() throws Exception {
					testRecordAliasFromMultipleGoogScope();
				}
			};
			testcase.run();
		}
	}

}