package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TypeInferenceTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssumption() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssumption();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testEmptyVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExprWithinCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testExprWithinCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElemDereference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testGetElemDereference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testIf1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssert10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssert10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertNumber2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertNumber2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertNumber3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertNumber3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertObject3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertObject3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertObject4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertObject4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertObject5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertObject5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertArray();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertInstanceof1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertInstanceof1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertInstanceof2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertInstanceof2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertInstanceof3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertInstanceof3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertInstanceof4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertInstanceof4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertInstanceof5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertInstanceof5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertWithIsDefAndNotNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertWithIsDefAndNotNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsDefAndNoResolvedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testIsDefAndNoResolvedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertWithNotIsNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertWithNotIsNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhile1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testWhile1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhile2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testWhile2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFor6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitch1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testSwitch1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testSwitch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitch3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testSwitch3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitch4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testSwitch4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTry1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testTry1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTry2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testTry2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTry3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testTry3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatch1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testCatch1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testCatch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testUnknownType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testUnknownType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInfiniteLoop1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInfiniteLoop1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInfiniteLoop2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInfiniteLoop2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testArrayLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumRAI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testEnumRAI1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumRAI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testEnumRAI2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumRAI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testEnumRAI3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumRAI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testEnumRAI4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuitingAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testShortCircuitingAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuitingAnd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testShortCircuitingAnd2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuitingOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testShortCircuitingOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuitingOr2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testShortCircuitingOr2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignInCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssignInCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFlattening() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testFlattening();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnary() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testUnary();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssignAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testComparison();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrownExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testThrownExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testCast1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsInferenceCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testBackwardsInferenceCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsInferenceNew() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testBackwardsInferenceNew();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoThisInference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testNoThisInference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordInference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testRecordInference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue785() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testIssue785();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertTypeofProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAssertTypeofProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testGetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInnerFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInnerFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testPropertyInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testPropertyInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testPropertyInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAdd1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAdd2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testAdd3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testReturn1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testReturn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testNew1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testInstanceOf4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testObjectLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoin1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testJoin1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoin2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testJoin2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testIf3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeInferenceTest() {
				public void runTest() throws Exception {
					testGetElem();
				}
			};
			testcase.run();
		}
	}

}