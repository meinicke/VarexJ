package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckRequiresForConstructorsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPassWithOneNew() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithOneNew();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithNoNewNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithNoNewNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithOneNewOuterClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithOneNewOuterClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithOneNewOuterClassWithUpperPrefix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithOneNewOuterClassWithUpperPrefix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFailWithOneNew() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testFailWithOneNew();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithTwoNewNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithTwoNewNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithNestedNewNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithNestedNewNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFailWithNestedNewNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testFailWithNestedNewNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithLocalFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithLocalFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithLocalVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithLocalVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFailWithLocalVariableInMoreThanOneFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testFailWithLocalVariableInMoreThanOneFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewNodesMetaTraditionalFunctionForm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testNewNodesMetaTraditionalFunctionForm();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewNodesMeta() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testNewNodesMeta();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShouldWarnWhenInstantiatingObjectsDefinedInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testShouldWarnWhenInstantiatingObjectsDefinedInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShouldWarnWhenInstantiatingGlobalClassesFromGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testShouldWarnWhenInstantiatingGlobalClassesFromGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoresNativeObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testIgnoresNativeObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewNodesWithMoreThanOneFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testNewNodesWithMoreThanOneFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassWithoutWarningsAndMultipleFiles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testPassWithoutWarningsAndMultipleFiles();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFailWithWarningsAndMultipleFiles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testFailWithWarningsAndMultipleFiles();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanStillCallNumberWithoutNewOperator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testCanStillCallNumberWithoutNewOperator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRequiresAreCaughtBeforeProcessed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testRequiresAreCaughtBeforeProcessed();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningsForThisConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testNoWarningsForThisConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2062487() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testBug2062487();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreDuplicateWarningsForSingleClasses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckRequiresForConstructorsTest() {
				public void runTest() throws Exception {
					testIgnoreDuplicateWarningsForSingleClasses();
				}
			};
			testcase.run();
		}
	}

}