package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class OptimizeParametersTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNoRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNoRemoval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testSimpleRemoval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotAFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNotAFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithReferenceToArgumentsShouldNotBeOptimize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testFunctionWithReferenceToArgumentsShouldNotBeOptimize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalNamedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalNamedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDifferentScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDifferentScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeOnlyImmutableValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testOptimizeOnlyImmutableValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalVarAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalVarAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoOptimizeCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoOptimizeCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoOptimizeApply() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoOptimizeApply();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalExpressionAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalExpressionAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalOneRequired() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalOneRequired();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalMultipleCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalMultipleCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveOneOptionalMultiplePossibleDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveOneOptionalMultiplePossibleDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTwoOptionalMultiplePossibleDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveTwoOptionalMultiplePossibleDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorOptArgsNotRemoved() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testConstructorOptArgsNotRemoved();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleUnknown() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMultipleUnknown();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleUnknown() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testSingleUnknown();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarArg() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveVarArg();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasMethodsDontGetOptimize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testAliasMethodsDontGetOptimize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasMethodsDontGetOptimize2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testAliasMethodsDontGetOptimize2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasMethodsDontGetOptimize3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testAliasMethodsDontGetOptimize3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasMethodsDontGetOptimize4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testAliasMethodsDontGetOptimize4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodsDefinedInArraysDontGetOptimized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMethodsDefinedInArraysDontGetOptimized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodsDefinedInObjectDontGetOptimized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMethodsDefinedInObjectDontGetOptimized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveConstantArgument() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRemoveConstantArgument();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanDeleteArgumentsAtAnyPosition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testCanDeleteArgumentsAtAnyPosition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizationForExternsFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNoOptimizationForExternsFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizationForGoogExportSymbol() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNoOptimizationForGoogExportSymbol();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoArgumentRemovalNonEqualNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNoArgumentRemovalNonEqualNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPassedAsParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testFunctionPassedAsParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallIsIgnore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testCallIsIgnore();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testApplyIsIgnore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testApplyIsIgnore();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithTwoNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testFunctionWithTwoNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRecursion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantArgumentsToConstructorCanBeOptimized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testConstantArgumentsToConstructorCanBeOptimized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgumentsToConstructorCanBeOptimized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testOptionalArgumentsToConstructorCanBeOptimized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegexesCanBeInlined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testRegexesCanBeInlined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorUsedAsFunctionCanBeOptimized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testConstructorUsedAsFunctionCanBeOptimized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeConstructorWhenArgumentsAreNotEqual() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeConstructorWhenArgumentsAreNotEqual();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeArrayElements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeArrayElements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testOptimizeThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeWhenArgumentsPassedAsParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeWhenArgumentsPassedAsParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeGoogExportFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeGoogExportFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeJSCompiler_renameProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeJSCompiler_renameProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeJSCompiler_ObjectPropertyString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeJSCompiler_ObjectPropertyString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableValues1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMutableValues1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableValues2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMutableValues2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableValues3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMutableValues3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableValues4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMutableValues4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableValues5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testMutableValues5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadows() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testShadows();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrash() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testCrash();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testGlobalCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamelessParameter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNamelessParameter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamelessParameter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeParametersTest() {
				public void runTest() throws Exception {
					testNamelessParameter2();
				}
			};
			testcase.run();
		}
	}

}