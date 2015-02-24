package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class IntegrationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMissingReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMissingReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue724() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue724();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue90() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue90();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDevirtualizationAndExtractPrototypeMemberDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDevirtualizationAndExtractPrototypeMemberDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorCycle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testConstructorCycle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1949424() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug1949424();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1949424_v2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug1949424_v2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1962380() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug1962380();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2410122() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug2410122();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosurePassOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testClosurePassOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosurePassOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testClosurePassOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCssNameCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCssNameCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2592659() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug2592659();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefBeforeOwner1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTypedefBeforeOwner1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefBeforeOwner2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTypedefBeforeOwner2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExportedNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSusiciousCodeOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSusiciousCodeOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckRequiresAndCheckProvidesOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckRequiresAndCheckProvidesOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckRequiresOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckRequiresOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckProvidesOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckProvidesOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerateExportsOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testGenerateExportsOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerateExportsOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testGenerateExportsOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportTestFunctionsOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExportTestFunctionsOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportTestFunctionsOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExportTestFunctionsOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExpose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckReferencesOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckReferencesOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckReferencesOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckReferencesOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInferTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckAndInference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTypeCheckAndInference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeNameParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTypeNameParser();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMemoizedTypedScopeCreator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMemoizedTypedScopeCreator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceCssNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testReplaceCssNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveClosureAsserts() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveClosureAsserts();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeprecation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDeprecation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVisibility() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testVisibility();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnreachableCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testUnreachableCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIdGenerators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIdGenerators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeArgumentsArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testOptimizeArgumentsArray();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeParameters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testOptimizeParameters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeReturns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testOptimizeReturns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAbstractMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveAbstractMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCollapseProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCollapseProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseObjectLiteral1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCollapseObjectLiteral1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseObjectLiteral2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCollapseObjectLiteral2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTightenTypesWithoutTypeCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTightenTypesWithoutTypeCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDisambiguateProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDisambiguateProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMarkPureCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMarkPureCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMarkNoSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMarkNoSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testChainedCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtraAnnotationNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExtraAnnotationNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDevirtualizePrototypeMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDevirtualizePrototypeMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckConsts() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckConsts();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllChecksOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testAllChecksOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckingWithSyntheticBlocks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testTypeCheckingWithSyntheticBlocks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompilerDoesNotBlowUpIfUndefinedSymbols() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCompilerDoesNotBlowUpIfUndefinedSymbols();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantTagsMustAlwaysBeRemoved() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testConstantTagsMustAlwaysBeRemoved();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosurePassPreservesJsDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testClosurePassPreservesJsDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedNamespaceIsConst() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvidedNamespaceIsConst();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedNamespaceIsConst2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvidedNamespaceIsConst2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedNamespaceIsConst3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvidedNamespaceIsConst3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedNamespaceIsConst4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvidedNamespaceIsConst4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedNamespaceIsConst5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvidedNamespaceIsConst5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProcessDefinesAlwaysOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProcessDefinesAlwaysOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProcessDefinesAdditionalReplacements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProcessDefinesAdditionalReplacements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceMessages() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testReplaceMessages();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckGlobalNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineGetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineGetters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineGettersWithAmbiguate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineGettersWithAmbiguate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeExits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMinimizeExits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnreachableCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveUnreachableCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedPrototypeProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveUnusedPrototypeProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedPrototypeProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveUnusedPrototypeProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSmartNamePass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSmartNamePass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadAssignmentsElimination() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDeadAssignmentsElimination();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveUnusedVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedVars2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRemoveUnusedVars2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossModuleCodeMotion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCrossModuleCodeMotion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossModuleMethodMotion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCrossModuleMethodMotion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFlowSensitiveInlineVariables1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFlowSensitiveInlineVariables1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFlowSensitiveInlineVariables2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFlowSensitiveInlineVariables2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseAnonymousFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCollapseAnonymousFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveFunctionDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testMoveFunctionDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameAnonymousFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testNameAnonymousFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameAnonymousFunctionsWithVarRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testNameAnonymousFunctionsWithVarRemoval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractPrototypeMemberDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExtractPrototypeMemberDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCoalesceVariableNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCoalesceVariableNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRenaming() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testPropertyRenaming();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConvertToDottedProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testConvertToDottedProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteFunctionExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRewriteFunctionExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasAllStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testAliasAllStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testAliasExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasKeywords() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testAliasKeywords();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenameVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameVars2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenameVars2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVaribles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testShadowVaribles();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameLabels() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenameLabels();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadBreakStatementInIdeMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBadBreakStatementInIdeMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue63SourceMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue63SourceMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRegExp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRegExp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLocals7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testFoldLocals7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarDeclarationsIntoFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testVarDeclarationsIntoFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExploitAssigns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testExploitAssigns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecoverOnBadExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRecoverOnBadExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateVariablesInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDuplicateVariablesInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLanguageMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testLanguageMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLanguageMode2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testLanguageMode2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue598() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue598();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue701() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue701();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue730() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue730();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCoaleseVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCoaleseVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateStatementFusion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testLateStatementFusion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateConstantReordering() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testLateConstantReordering();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testsyntheticBlockOnDeadAssignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testsyntheticBlockOnDeadAssignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug4152835() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug4152835();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug5786871() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug5786871();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue378();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue550() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue550();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue284() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue284();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue772() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue772();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCodingConvention() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCodingConvention();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJQueryStringSplitLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testJQueryStringSplitLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAlwaysRunSafetyCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testAlwaysRunSafetyCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressEs5StrictWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSuppressEs5StrictWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckProvidesWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckProvidesWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressCheckProvidesWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSuppressCheckProvidesWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressCastWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSuppressCastWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrefix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenamePrefix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrefixNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenamePrefixNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrefixNamespaceProtectSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenamePrefixNamespaceProtectSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrefixNamespaceActivatesMoveFunctionDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testRenamePrefixNamespaceActivatesMoveFunctionDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBrokenNameSpace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBrokenNameSpace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamelessParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testNamelessParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegativeZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testNegativeZero();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingletonGetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSingletonGetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncompleteFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIncompleteFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncompleteFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIncompleteFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortingOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testSortingOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnboundedArrayLiteralInfiniteLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testUnboundedArrayLiteralInfiniteLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideRequireSameFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testProvideRequireSameFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencySorting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testDependencySorting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrictWarningsGuard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testStrictWarningsGuard();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrictWarningsGuardEmergencyMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testStrictWarningsGuardEmergencyMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogDefineClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testGoogDefineClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogDefineClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testGoogDefineClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogDefineClass3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testGoogDefineClass3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckConstants1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckConstants1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckConstants2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckConstants2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue787() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testIssue787();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1956277() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testBug1956277();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testInlineVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHiddenSideEffect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testHiddenSideEffect();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManyAdds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IntegrationTest() {
				public void runTest() throws Exception {
					testManyAdds();
				}
			};
			testcase.run();
		}
	}

}