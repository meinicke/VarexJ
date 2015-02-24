package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ExternExportsPassTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testExportSymbol() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbol();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolDefinedInVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbolDefinedInVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportMultiple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportMultiple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportMultiple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportMultiple2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportMultiple3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportMultiple3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportNonStaticSymbol() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportNonStaticSymbol();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportNonStaticSymbol2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportNonStaticSymbol2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportNonexistentProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportNonexistentProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolWithTypeAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbolWithTypeAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolWithoutTypeCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbolWithoutTypeCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolWithConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbolWithConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolWithConstructorWithoutTypeCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportSymbolWithConstructorWithoutTypeCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportFunctionWithOptionalArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportFunctionWithOptionalArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportFunctionWithVariableArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportFunctionWithVariableArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportDontEmitPrototypePathPrefix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testExportDontEmitPrototypePathPrefix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseExportsAsExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testUseExportsAsExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnOnExportFunctionWithUnknownReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testWarnOnExportFunctionWithUnknownReturnType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontWarnOnExportConstructorWithUnknownReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testDontWarnOnExportConstructorWithUnknownReturnType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testTypedef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnOnExportFunctionWithUnknownParameterTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExternExportsPassTest() {
				public void runTest() throws Exception {
					testWarnOnExportFunctionWithUnknownParameterTypes();
				}
			};
			testcase.run();
		}
	}

}