package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InlineFunctionsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInlineEmptyFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineEmptyFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineEmptyFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineEmptyFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineEmptyFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineEmptyFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineEmptyFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineEmptyFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineEmptyFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineEmptyFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions15a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions15a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions15b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions15b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions15c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions15c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions15d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions15d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions16a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions16a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions16b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions16b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions25() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions25();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions26() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions26();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions27() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions27();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions28() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions28();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions29();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions30() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions30();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctions31() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctions31();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInlining4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInlining4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInliningCosting1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInliningCosting1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInliningCosting2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInliningCosting2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInliningCosting3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInliningCosting3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedModeInliningCosting4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMixedModeInliningCosting4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfParametersModified9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineIfParametersModified9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineNeverPartialSubtitution1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineNeverPartialSubtitution1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineNeverPartialSubtitution2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineNeverPartialSubtitution2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineNeverMutateConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineNeverMutateConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineNeverOverrideNewValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineNeverOverrideNewValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineMutableArgsReferencedOnce() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineMutableArgsReferencedOnce();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMutableArgs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineMutableArgs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMutableArgs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineMutableArgs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMutableArgs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineMutableArgs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMutableArgs4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineMutableArgs4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineBlockMutableArgs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineBlockMutableArgs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineBlockMutableArgs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineBlockMutableArgs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineBlockMutableArgs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineBlockMutableArgs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineBlockMutableArgs4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineBlockMutableArgs4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowVariables18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testShadowVariables18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInlining12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInlining12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCostBasedInliningComplex9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCostBasedInliningComplex9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoubleInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testDoubleInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoubleInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testDoubleInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfNonGlobalFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineOfNonGlobalFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfNonGlobalFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineOfNonGlobalFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfNonGlobalFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineOfNonGlobalFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfNonGlobalFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineOfNonGlobalFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMaskedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineMaskedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineNonFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testNoInlineNonFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithArgsMismatch1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithArgsMismatch1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithArgsMismatch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithArgsMismatch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithArgsMismatch3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithArgsMismatch3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithArgsMismatch4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithArgsMismatch4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsWithSideEffectsNeverInlined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testArgumentsWithSideEffectsNeverInlined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsWithSideEffectsNeverInlined2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testArgumentsWithSideEffectsNeverInlined2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneSideEffectCallDoesNotRuinOthers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testOneSideEffectCallDoesNotRuinOthers();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultNoParamCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultNoParamCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultNoParamCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultNoParamCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultNoParamCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultNoParamCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultWithParamCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultWithParamCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultWithParamCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultWithParamCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineNoResultWithParamCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineNoResultWithParamCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInline8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInline8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineVars12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineVars12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineInExpresssions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineInExpresssions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineInExpresssions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineInExpresssions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineInExpresssions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineInExpresssions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineInExpresssions4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineInExpresssions4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexInlineInExpresssions5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexInlineInExpresssions5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNoInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexNoInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNoInline2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexNoInline2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexSample() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexSample();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexSampleNoInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexSampleNoInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNoVarSub() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexNoVarSub();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexFunctionWithFunctionDefinition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexFunctionWithFunctionDefinition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexFunctionWithFunctionDefinition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexFunctionWithFunctionDefinition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexFunctionWithFunctionDefinition2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexFunctionWithFunctionDefinition2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexFunctionWithFunctionDefinition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testComplexFunctionWithFunctionDefinition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDecomposePlusEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testDecomposePlusEquals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDecomposeFunctionExpressionInCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testDecomposeFunctionExpressionInCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineConstructor1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineConstructor2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstructor3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineConstructor3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstructor4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineConstructor4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionInlining4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionInlining4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining11a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining11a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining11b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining11b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining11c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining11c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining11d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining11d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining11e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining11e();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionCallInlining12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionCallInlining12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionOmega() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionOmega();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInlining6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInlining6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInliningOnly1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInliningOnly1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInliningOnly2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInliningOnly2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInliningOnly3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInliningOnly3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalFunctionInliningOnly4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLocalFunctionInliningOnly4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithThis7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithThis7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionYCombinator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionYCombinator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertyFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testRenamePropertyFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplacePropertyFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testReplacePropertyFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithClosureContainingThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineWithClosureContainingThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue5159924a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testIssue5159924a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue5159924b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testIssue5159924b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testInlineObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug4944818() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testBug4944818();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue423() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testIssue423();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue728() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testIssue728();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testAnonymous1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testAnonymous2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testAnonymous3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoopWithFunctionWithFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testLoopWithFunctionWithFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodWithFunctionWithFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testMethodWithFunctionWithFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossModuleInlining1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCrossModuleInlining1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossModuleInlining2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCrossModuleInlining2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossModuleInlining3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					testCrossModuleInlining3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test6671158() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineFunctionsTest() {
				public void runTest() throws Exception {
					test6671158();
				}
			};
			testcase.run();
		}
	}

}