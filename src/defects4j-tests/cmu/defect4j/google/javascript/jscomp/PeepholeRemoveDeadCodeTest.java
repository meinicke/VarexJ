package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeRemoveDeadCodeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNew1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNew1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNew2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBlocksWithManyChildren() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldBlocksWithManyChildren();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantConditionWithSideEffect1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testConstantConditionWithSideEffect1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantConditionWithSideEffect2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testConstantConditionWithSideEffect2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarLifting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testVarLifting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldUselessWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldUselessFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldUselessDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeWhileConstantCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testMinimizeWhileConstantCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldConstantCommaExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldConstantCommaExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUselessOps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveUselessOps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimizeSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testOptimizeSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarGet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveVarGet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarGet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveVarGet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNamespaceGet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveNamespaceGet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNamespaceGet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveNamespaceGet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePrototypeGet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemovePrototypeGet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePrototypeGet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemovePrototypeGet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveAdd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveAdd1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveCall6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveCall6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveThrow1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveThrow1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveThrow2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveThrow2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveThrow3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveThrow3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInControlStructure1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveInControlStructure1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInControlStructure2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveInControlStructure2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInControlStructure3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveInControlStructure3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testComplex1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testComplex2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplex3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testComplex3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplex4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testComplex4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplex5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testComplex5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveFunctionDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveFunctionDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveFunctionDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveFunctionDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSimplifyFunctionArgs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoSimplifyFunctionArgs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSimplifyFunctionArgs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoSimplifyFunctionArgs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSimplifyFunctionArgs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoSimplifyFunctionArgs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveInherits1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveInherits1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveInherits2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveInherits2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveInherits3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveInherits3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveInherits4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testNoRemoveInherits4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFromLabel1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveFromLabel1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFromLabel2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testRemoveFromLabel2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testFoldBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testArrayLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testTryCatchFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest() {
				public void runTest() throws Exception {
					testShortCircuit4();
				}
			};
			testcase.run();
		}
	}

}