package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NameAnalyzerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue284() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue284();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingletonGetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSingletonGetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarDeclaration8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveVarDeclaration8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDeclaration7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveDeclaration7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferredToByWindow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testReferredToByWindow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtern() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExtern();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNamedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveNamedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRecursiveFunction9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveRecursiveFunction9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectClassification7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSideEffectClassification7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectAnnotation16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoSideEffectAnnotation16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testFunctionPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelClass7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testTopLevelClass7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNamespacedClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNamespacedClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedClass3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNamespacedClass3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedClass4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNamespacedClass4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedClass5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNamespacedClass5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToThisPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentToThisPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToCallResultPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentToCallResultPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToExternPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentToExternPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToUnknownPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentToUnknownPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2099540() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testBug2099540();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOtherGlobal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testOtherGlobal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExternName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExternName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInherits8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testInherits8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixin7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testMixin7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstants1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testConstants1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstants2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testConstants2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpressions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExpressions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpressions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExpressions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpressions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExpressions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetCreatingReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetCreatingReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymous9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAnonymous9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testGetElem1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testGetElem2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testGetElem3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf4a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf4a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf4c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf4c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIf5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfElse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIfElse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForStruct16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForStruct16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInForIn6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInForIn6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInIfPredicate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInIfPredicate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInWhilePredicate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInWhilePredicate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInDoWhilePredicate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInDoWhilePredicate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterInSwitchInput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSetterInSwitchInput();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexAssigns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testComplexAssigns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssigns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssigns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssigns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssigns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNestedAssigns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testComplexNestedAssigns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNestedAssigns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testComplexNestedAssigns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNestedAssigns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testComplexNestedAssigns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNestedAssigns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testComplexNestedAssigns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnintendedUseOfInheritsInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testUnintendedUseOfInheritsInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnintendedUseOfInheritsInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testUnintendedUseOfInheritsInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnintendedUseOfInheritsInLocalScope3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testUnintendedUseOfInheritsInLocalScope3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnintendedUseOfInheritsInLocalScope4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testUnintendedUseOfInheritsInLocalScope4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetInLocalScope7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetInLocalScope7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueReference6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRValueReference6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnhandledTopNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testUnhandledTopNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyDefinedInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPropertyDefinedInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionallyDefinedFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testConditionallyDefinedFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionallyDefinedFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testConditionallyDefinedFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionallyDefinedFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testConditionallyDefinedFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElemOnThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testGetElemOnThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstanceOfOnly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveInstanceOfOnly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLocalScopedInstanceOfOnly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveLocalScopedInstanceOfOnly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstanceOfWithReferencedMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveInstanceOfWithReferencedMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeReferencedInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeReferencedInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeReferencedLocalScopedInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeReferencedLocalScopedInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeLocalScopeReferencedInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeLocalScopeReferencedInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeLocalScopeReferencedLocalScopedInstanceOf2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotChangeInstanceOfGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testDoNotChangeInstanceOfGetElem();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeirdnessOnLeftSideOfPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testWeirdnessOnLeftSideOfPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testShortCircuit8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsReference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsReference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsReference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsReference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsReference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsReference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsReference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsReference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsReference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsReference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRhsAssign9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRhsAssign9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithOr1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithOr1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithOr2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithOr2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithAnd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithAnd1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithAnd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithAnd2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignWithHook9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignWithHook9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNestedAssign8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefChain23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRefChain23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentWithComplexLhs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentWithComplexLhs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentWithComplexLhs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentWithComplexLhs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentWithComplexLhs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentWithComplexLhs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentWithComplexLhs4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAssignmentWithComplexLhs4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovePrototypeDefinitionsOutsideGlobalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemovePrototypeDefinitionsOutsideGlobalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovePrototypeDefinitionsOutsideGlobalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemovePrototypeDefinitionsOutsideGlobalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovePrototypeDefinitionsOutsideGlobalScope4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemovePrototypeDefinitionsOutsideGlobalScope4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovePrototypeDefinitionsOutsideGlobalScope5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemovePrototypeDefinitionsOutsideGlobalScope5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePrototypeDefinitionsInGlobalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemovePrototypeDefinitionsInGlobalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePrototypeDefinitionsInGlobalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemovePrototypeDefinitionsInGlobalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabeledStatment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveLabeledStatment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabeledStatment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveLabeledStatment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabeledStatment3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveLabeledStatment3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabeledStatment4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveLabeledStatment4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreservePropertyMutationsToAlias9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testPreservePropertyMutationsToAlias9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemoveAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingletonGetter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSingletonGetter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingletonGetter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testSingletonGetter3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias4a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias4a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias5a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias5a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias6a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias6a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveWindowPropertyAlias7a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveWindowPropertyAlias7a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAlias0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAlias0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAlias3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAlias3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAliasOfExternal0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAliasOfExternal0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAliasOfExternal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAliasOfExternal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAliasOfExternal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveAliasOfExternal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveThrowReference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveThrowReference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveThrowReference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testNoRemoveThrowReference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefinedInObjectLit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testClassDefinedInObjectLit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefinedInObjectLit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testClassDefinedInObjectLit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefinedInObjectLit3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testClassDefinedInObjectLit3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefinedInObjectLit4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testClassDefinedInObjectLit4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarReferencedInClassDefinedInObjectLit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testVarReferencedInClassDefinedInObjectLit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarReferencedInClassDefinedInObjectLit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testVarReferencedInClassDefinedInObjectLit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayExt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testArrayExt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAliasExt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testArrayAliasExt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternalAliasInstanceof1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExternalAliasInstanceof1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternalAliasInstanceof2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExternalAliasInstanceof2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternalAliasInstanceof3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testExternalAliasInstanceof3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasInstanceof4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAliasInstanceof4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasInstanceof5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testAliasInstanceof5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBrokenNamespaceWithPrototypeAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testBrokenNamespaceWithPrototypeAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePrototypeAliases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testRemovePrototypeAliases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue838a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue838a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue838b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue838b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue874a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue874a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue874b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue874b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue874c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue874c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue874d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue874d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue874e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testIssue874e();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug6575051() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnalyzerTest() {
				public void runTest() throws Exception {
					testBug6575051();
				}
			};
			testcase.run();
		}
	}

}