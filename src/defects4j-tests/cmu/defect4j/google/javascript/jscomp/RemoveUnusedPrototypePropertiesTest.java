package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RemoveUnusedPrototypePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnalyzePrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAnalyzePrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testHook1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testHook2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testAliasing7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedMethodsByNamingConvention() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testExportedMethodsByNamingConvention();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedMethodsByNamingConventionAlwaysExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testExportedMethodsByNamingConventionAlwaysExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStatementRestriction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testStatementRestriction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodsFromExternsFileNotExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testMethodsFromExternsFileNotExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternMethodsFromExternsFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testExternMethodsFromExternsFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyReferenceGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyReferenceGraph();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesDefinedWithGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testPropertiesDefinedWithGetElem();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNeverRemoveImplicitlyUsedProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testNeverRemoveImplicitlyUsedProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyDefinedInBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyDefinedInBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsingAnonymousObjectsToDefeatRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testUsingAnonymousObjectsToDefeatRemoval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetterBaseline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGetterBaseline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest() {
				public void runTest() throws Exception {
					testGetter2();
				}
			};
			testcase.run();
		}
	}

}