package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionInjectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsSimpleFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSimpleFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testIsSimpleFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction12b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction12b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction25() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction25();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction26() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction26();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction27() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction27();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction28() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction28();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction29();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction30() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction30();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction31() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction31();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction32() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction32();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction33() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction33();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction34() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction34();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction35() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction35();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction36() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction36();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction37() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction37();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction38() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction38();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction39() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction39();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction40() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction40();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction41() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction41();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction42() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction42();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction43() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction43();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction44() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction44();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction45() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction45();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction46() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction46();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction47() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction47();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction48() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction48();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction49() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction49();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction50() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction50();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunction51() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunction51();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression5a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression5a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression7a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression7a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression10a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression10a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression14a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression14a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression19a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression19a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression21a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression21a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression22a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression22a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInExpression23a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInExpression23a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInLoop1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInLoop1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineReferenceToFunctionInLoop2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testCanInlineReferenceToFunctionInLoop2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline19b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInline19b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineIntoLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithInnerFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithInnerFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithInnerFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithInnerFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithInnerFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithInnerFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithInnerFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithInnerFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionWithInnerFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineFunctionWithInnerFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineReferenceInExpression17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineReferenceInExpression17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineWithinCalls1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineWithinCalls1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAssignmentToConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testInlineAssignmentToConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1897706() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionInjectorTest() {
				public void runTest() throws Exception {
					testBug1897706();
				}
			};
			testcase.run();
		}
	}

}