package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CommandLineRunnerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testWarningGuardOrdering1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWarningGuardOrdering1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningGuardOrdering2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWarningGuardOrdering2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningGuardOrdering3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWarningGuardOrdering3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningGuardOrdering4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWarningGuardOrdering4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleModeLeavesUnusedParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSimpleModeLeavesUnusedParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdvancedModeRemovesUnusedParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testAdvancedModeRemovesUnusedParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOffByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOffByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOnWithAdvancedMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOnWithAdvancedMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOnWithErrorFlag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOnWithErrorFlag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckGlobalThisOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckGlobalThisOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckingOffByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeCheckingOffByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReflectedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testReflectedMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testInlineVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedAdvanced() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypedAdvanced();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckingOnWithVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeCheckingOnWithVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeParsingOffByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeParsingOffByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeParsingOnWithVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeParsingOnWithVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckOverride1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeCheckOverride1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckOverride2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTypeCheckOverride2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOffForDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOffForDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOnForVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOnForVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOverrideForVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOverrideForVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckSymbolsOverrideForQuiet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckSymbolsOverrideForQuiet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckUndefinedProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckUndefinedProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckUndefinedProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckUndefinedProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckUndefinedProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCheckUndefinedProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDuplicateParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineFlag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDefineFlag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineFlag2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDefineFlag2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineFlag3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDefineFlag3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScriptStrictModeNoWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testScriptStrictModeNoWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionStrictModeNoWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testFunctionStrictModeNoWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQuietMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testQuietMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProcessClosurePrimitives() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testProcessClosurePrimitives();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMsgWiring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testGetMsgWiring();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCssNameWiring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCssNameWiring();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue70a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue70a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue70b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue70b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue81() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue81();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue115() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue115();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue297();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHiddenSideEffect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testHiddenSideEffect();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue504() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue504();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue601b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue601b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue601c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue601c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue846() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue846();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDebugFlag1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDebugFlag1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDebugFlag2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDebugFlag2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDebugFlag3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDebugFlag3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDebugFlag4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDebugFlag4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanFlag1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testBooleanFlag1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanFlag2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testBooleanFlag2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHelpFlag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testHelpFlag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternsLifting1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testExternsLifting1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternsLifting2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testExternsLifting2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingOn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingOn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingOn3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingOn3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingCircularDeps1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingCircularDeps1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceSortingCircularDeps2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceSortingCircularDeps2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePruningOn8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourcePruningOn8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoCompile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testNoCompile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencySortingWhitespaceMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDependencySortingWhitespaceMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardDeclareDroppedTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testForwardDeclareDroppedTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyClosureDependenciesEmptyEntryPoints() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testOnlyClosureDependenciesEmptyEntryPoints();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyClosureDependenciesOneEntryPoint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testOnlyClosureDependenciesOneEntryPoint();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapExpansion1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceMapExpansion1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapExpansion2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceMapExpansion2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapExpansion3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceMapExpansion3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapFormat1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceMapFormat1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapFormat2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSourceMapFormat2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModuleWrapperBaseNameExpansion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testModuleWrapperBaseNameExpansion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCharSetExpansion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testCharSetExpansion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainModuleManifest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testChainModuleManifest();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStarModuleManifest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testStarModuleManifest();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOutputModuleGraphJson() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testOutputModuleGraphJson();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVersionFlag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testVersionFlag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVersionFlag2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testVersionFlag2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintAstFlag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testPrintAstFlag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSyntheticExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testSyntheticExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogAssertStripping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testGoogAssertStripping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingReturnCheckOnWithVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testMissingReturnCheckOnWithVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerateExports() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testGenerateExports();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDepreciationWithVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testDepreciationWithVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoParseErrors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTwoParseErrors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES3ByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES3ByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5ChecksByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5ChecksByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5ChecksInVerbose() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5ChecksInVerbose();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5Strict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5Strict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5StrictUseStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5StrictUseStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testES5StrictUseStrictMultipleInputs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testES5StrictUseStrictMultipleInputs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithKeywordDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWithKeywordDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithKeywordWithEs5ChecksOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testWithKeywordWithEs5ChecksOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSrCFilesWithManifest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testNoSrCFilesWithManifest();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransformAMD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTransformAMD();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProcessCJS() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testProcessCJS();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProcessCJSWithModuleOutput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testProcessCJSWithModuleOutput();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormattingSingleQuote() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testFormattingSingleQuote();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransformAMDAndProcessCJS() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testTransformAMDAndProcessCJS();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModuleJSON() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testModuleJSON();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOutputSameAsInput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testOutputSameAsInput();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue601() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CommandLineRunnerTest() {
				public void runTest() throws Exception {
					testIssue601();
				}
			};
			testcase.run();
		}
	}

}