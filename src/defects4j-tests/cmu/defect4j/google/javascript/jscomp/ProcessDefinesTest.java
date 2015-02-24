package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ProcessDefinesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBasicDefine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testBasicDefine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicDefine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testBasicDefine2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicDefine3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testBasicDefine3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineBadType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineBadType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineWithBadValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineWithBadValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineWithBadValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineWithBadValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineWithDependentValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineWithDependentValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineWithInvalidDependentValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineWithInvalidDependentValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverriding1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverriding1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverriding2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverriding2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverriding3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverriding3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridingString0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverridingString0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridingString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverridingString1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridingString2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverridingString2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridingString3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverridingString3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisspelledOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testMisspelledOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompiledIsKnownDefine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testCompiledIsKnownDefine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleReassign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testSimpleReassign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleReassign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testSimpleReassign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleReassign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testSimpleReassign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDuplicateVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignBeforeDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testAssignBeforeDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignBeforeDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testAssignBeforeDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testEmptyDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReassignAfterCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testReassignAfterCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReassignAfterRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testReassignAfterRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReassignWithExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testReassignWithExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReassignAfterNonGlobalRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testReassignAfterNonGlobalRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReassignAfterRefInConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testReassignAfterRefInConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignInNonGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testAssignInNonGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclareInNonGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDeclareInNonGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineAssignmentInLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testDefineAssignmentInLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithNoDefines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testWithNoDefines();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine2c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine2c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedDefine4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testNamespacedDefine4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverrideAfterAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessDefinesTest() {
				public void runTest() throws Exception {
					testOverrideAfterAlias();
				}
			};
			testcase.run();
		}
	}

}