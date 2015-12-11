package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DevirtualizePrototypeMethodsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRewritePrototypeMethods1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewritePrototypeMethods1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewritePrototypeMethods2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewritePrototypeMethods2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteChained() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteChained();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteDeclIsExpressionStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteDeclIsExpressionStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteDeclUsedAsAssignmentRhs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteDeclUsedAsAssignmentRhs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteDeclUsedAsCallArgument() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteDeclUsedAsCallArgument();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteIfNotInGlobalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteIfNotInGlobalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteIfNotInGlobalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteIfNotInGlobalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteNamespaceFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteNamespaceFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteSingleDefinition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteSingleDefinition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteSingleDefinition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteSingleDefinition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteMultipleDefinition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteMultipleDefinition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteMultipleDefinition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteMultipleDefinition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteMultipleDefinition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteMultipleDefinition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewritePrototypeNoObjectLiterals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewritePrototypeNoObjectLiterals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewritePrototypeObjectLiterals1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewritePrototypeObjectLiterals1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewritePrototypeObjectLiterals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewritePrototypeObjectLiterals2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteExternalMethods1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteExternalMethods1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteExternalMethods2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteExternalMethods2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteCodingConvention() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteCodingConvention();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteNoVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteNoVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteCallReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteCallReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteNoReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteNoReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteNonCallReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteNonCallReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteNoNestedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteNoNestedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteNestedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteNestedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteImplementedMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteImplementedMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteImplementedMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteImplementedMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteImplementedMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteImplementedMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteImplementedMethod4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteImplementedMethod4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteImplementedMethodInObj() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteImplementedMethodInObj();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteGet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteGet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteGet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteGet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteSet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteSet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteSet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteSet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteNotImplementedMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteNotImplementedMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWrapper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testWrapper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteSameModule1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteSameModule1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteSameModule2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteSameModule2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteSameModule3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteSameModule3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteDefinitionBeforeUse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testRewriteDefinitionBeforeUse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteUseBeforeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest() {
				public void runTest() throws Exception {
					testNoRewriteUseBeforeDefinition();
				}
			};
			testcase.run();
		}
	}

}