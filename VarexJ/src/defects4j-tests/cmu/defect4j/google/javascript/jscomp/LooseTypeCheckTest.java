package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LooseTypeCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeof();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGlobalThis6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchingOverridingInferredPropertyBeforeDeclaredProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMismatchingOverridingInferredPropertyBeforeDeclaredProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInitialTypingScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInitialTypingScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck16a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck16a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck16b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck16b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckBasicDowncast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheckBasicDowncast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckNoDowncastToNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheckNoDowncastToNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheck24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheck24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckDefaultExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheckDefaultExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckCustomExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheckCustomExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArray7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedArray7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedObject3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedObject3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedObject4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testParameterizedObject4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionOfFunctionAndType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUnionOfFunctionAndType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalParameterComparedToUndefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalParameterComparedToUndefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalAllType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalAllType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalUnknownNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalUnknownNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionParam2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionParam2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionParam3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionParam3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionParam4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionParam4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionParamError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionParamError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalNullableArgFunctionParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalNullableArgFunctionParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalNullableArgFunctionParam2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalNullableArgFunctionParam2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalNullableArgFunctionParam3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalNullableArgFunctionParam3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalArgFunctionReturn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOptionalArgFunctionReturn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanReduction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanReduction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNullAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNullOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanPreservation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanPreservation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanPreservation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanPreservation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanPreservation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanPreservation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanPreservation4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanPreservation4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfReduction15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeOfReduction15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameReduction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameReduction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameReduction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameReduction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameReduction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameReduction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameReduction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameReduction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOfReduction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceOfReduction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOfReduction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceOfReduction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInferredPropagation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInferredPropagation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInference8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyInference8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPersistentTypeInferenceForObjectProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoPersistentTypeInferenceForObjectProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPersistentTypeInferenceForFunctionProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoPersistentTypeInferenceForFunctionProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertyTypeInferredInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testObjectPropertyTypeInferredInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertyTypeInferredInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testObjectPropertyTypeInferredInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertyTypeInferredInLocalScope3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testObjectPropertyTypeInferredInLocalScope3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchingOverridingInferredPropertyBeforeDeclaredProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMismatchingOverridingInferredPropertyBeforeDeclaredProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchingOverridingInferredPropertyBeforeDeclaredProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMismatchingOverridingInferredPropertyBeforeDeclaredProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchingOverridingInferredPropertyBeforeDeclaredProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMismatchingOverridingInferredPropertyBeforeDeclaredProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyUsedBeforeDefinition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyUsedBeforeDefinition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyUsedBeforeDefinition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyUsedBeforeDefinition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAdd21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericComparison6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumericComparison6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringComparison6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringComparison6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueOfComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testValueOfComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueOfComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testValueOfComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueOfComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testValueOfComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenericRelationalExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGenericRelationalExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceof6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceof6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOfReduction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInstanceOfReduction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScoping11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScoping11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArguments15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionArguments15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintFunctionName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPrintFunctionName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintFunctionName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPrintFunctionName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInference20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionInference20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerFunction9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethodHandling6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAbstractMethodHandling6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInference9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMethodInference9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethodDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStaticMethodDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethodDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStaticMethodDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethodDeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStaticMethodDeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticMethodDecl1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticMethodDecl1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticMethodDecl2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticMethodDecl2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticMethodDecl3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticMethodDecl3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticMethodDecl4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticMethodDecl4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticMethodDecl5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticMethodDecl5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateStaticPropertyDecl9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateStaticPropertyDecl9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateLocalVarDecl() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateLocalVarDecl();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubFunctionDeclaration10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubFunctionDeclaration10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedFunctionInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNestedFunctionInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeRedefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeRedefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIn7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIn7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComparison10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumStaticMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnumStaticMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumStaticMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnumStaticMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum25() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum25();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum26() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum26();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum27() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum27();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum28() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum28();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum29();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum30() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum30();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum31() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum31();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum32() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum32();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum34() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum34();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum35() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum35();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum36() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum36();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum37() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum37();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum38() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum38();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum39() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum39();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum40() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testEnum40();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedEnum1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAliasedEnum1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedEnum2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAliasedEnum2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedEnum3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAliasedEnum3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedEnum4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAliasedEnum4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedEnum5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAliasedEnum5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsEnumUse1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsEnumUse1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsEnumUse2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsEnumUse2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsEnumUse3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsEnumUse3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsEnumUse4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsEnumUse4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsEnumUse5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsEnumUse5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsConstructor1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardsConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBackwardsConstructor2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimalConstructorAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMinimalConstructorAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodExtends11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodExtends11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadExtends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadExtends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadExtends3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadExtends3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testLateExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperclassMatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperclassMatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperclassMatchWithMixin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperclassMatchWithMixin();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperclassMismatch1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperclassMismatch1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperclassMismatch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperclassMismatch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperClassDefinedAfterSubClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperClassDefinedAfterSubClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperClassDefinedAfterSubClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSuperClassDefinedAfterSubClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectPrototypeAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDirectPrototypeAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectPrototypeAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDirectPrototypeAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodImplements1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodImplements1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodImplements2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGoodImplements2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplements1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplements1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplements2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplements2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplements3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplements3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfaceExtends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadInterfaceExtends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfaceExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadInterfaceExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfaceExtends3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadInterfaceExtends3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfaceExtends4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadInterfaceExtends4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfaceExtends5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadInterfaceExtends5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplementsAConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplementsAConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplementsNonInterfaceType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplementsNonInterfaceType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplementsNonObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadImplementsNonObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceAssignment13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceAssignment13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetprop1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGetprop1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAccess8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testArrayAccess8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccess() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropAccess();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccess2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropAccess2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccess3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropAccess3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccess4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropAccess4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testVar15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignInference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAssignInference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOr1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOr2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOr3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOr4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testOr5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnd7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookRestrictsType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHookRestrictsType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhileRestrictsType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWhileRestrictsType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhileRestrictsType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWhileRestrictsType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHigherOrderFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHigherOrderFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHigherOrderFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHigherOrderFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHigherOrderFunctions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHigherOrderFunctions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHigherOrderFunctions4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHigherOrderFunctions4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorAlias10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosure6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testClosure6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testThis10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType1c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType1c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testControlFlowRestrictsType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testControlFlowRestrictsType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSwitchCase8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoTypeCheck8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoTypeCheck8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testImplicitCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCastSubclassAccess() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testImplicitCastSubclassAccess();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCastNotInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testImplicitCastNotInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumberNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumberNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanNodeTrue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanNodeTrue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanNodeFalse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanNodeFalse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUndefinedNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumberAutoboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumberAutoboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumberUnboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNumberUnboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringAutoboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringAutoboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringUnboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStringUnboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanAutoboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanAutoboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanUnboxing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBooleanUnboxing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue86() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIssue86();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue124() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIssue124();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue124b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testIssue124b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug592170() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug592170();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug901455() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug901455();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug908701() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug908701();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug908625() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug908625();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug911118() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug911118();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug909000() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug909000();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug930117() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug930117();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1484445() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1484445();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1859535() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1859535();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1940591() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1940591();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1942972() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1942972();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1943776() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1943776();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1987544() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1987544();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1940769() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug1940769();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2335992() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug2335992();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2341812() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBug2341812();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testScopedConstructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedNameInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedNameInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqRefinedScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testSheqRefinedScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignToUntypedVariable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAssignToUntypedVariable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignToUntypedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAssignToUntypedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCast16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedCasts() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNestedCasts();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeCast1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNativeCast1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNativeCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeCast3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNativeCast3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeCast4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNativeCast4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadConstructorCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBadConstructorCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testConstructorType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnonymousType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnonymousType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnonymousType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBang7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBang7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefinePropertyOnNullableObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDefinePropertyOnNullableObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefinePropertyOnNullableObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDefinePropertyOnNullableObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownConstructorInstanceType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUnknownConstructorInstanceType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownConstructorInstanceType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUnknownConstructorInstanceType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownConstructorInstanceType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUnknownConstructorInstanceType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownPrototypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUnknownPrototypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNamespacedConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testComplexNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddingMethodsUsingPrototypeIdiomSimpleNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddingMethodsUsingPrototypeIdiomSimpleNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddingMethodsUsingPrototypeIdiomComplexNamespace1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddingMethodsUsingPrototypeIdiomComplexNamespace1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddingMethodsUsingPrototypeIdiomComplexNamespace2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddingMethodsUsingPrototypeIdiomComplexNamespace2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddingMethodsPrototypeIdiomAndObjectLiteralSimpleNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddingMethodsPrototypeIdiomAndObjectLiteralSimpleNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontAddMethodsIfNoConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDontAddMethodsIfNoConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionAssignement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionAssignement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMethodsPrototypeTwoWays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddMethodsPrototypeTwoWays();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertyTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPrototypePropertyTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueTypeBuiltInPrototypePropertyType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testValueTypeBuiltInPrototypePropertyType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclareBuiltInConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDeclareBuiltInConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendBuiltInType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testExtendBuiltInType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendBuiltInType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testExtendBuiltInType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testExtendFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testExtendFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck9_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck9_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck9_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck9_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck9_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck9_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck10_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck10_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck10_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck10_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck10_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck10_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceCheck14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInheritanceCheck14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceCheck8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceCheck8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfacePropertyNotImplemented() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfacePropertyNotImplemented();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfacePropertyNotImplemented2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfacePropertyNotImplemented2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubConstructorImplementingInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStubConstructorImplementingInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testObjectLiteralDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallDateConstructorAsFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCallDateConstructorAsFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallErrorConstructorAsFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCallErrorConstructorAsFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallArrayConstructorAsFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCallArrayConstructorAsFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyTypeOfUnionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPropertyTypeOfUnionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotatedPropertyOnInterface1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnnotatedPropertyOnInterface1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotatedPropertyOnInterface2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnnotatedPropertyOnInterface2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotatedPropertyOnInterface3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnnotatedPropertyOnInterface3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotatedPropertyOnInterface4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAnnotatedPropertyOnInterface4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnUnannotatedPropertyOnInterface5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWarnUnannotatedPropertyOnInterface5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnUnannotatedPropertyOnInterface6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWarnUnannotatedPropertyOnInterface6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnDataPropertyOnInterface3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWarnDataPropertyOnInterface3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarnDataPropertyOnInterface4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testWarnDataPropertyOnInterface4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorMismatchingPropertyOnInterface4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testErrorMismatchingPropertyOnInterface4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorMismatchingPropertyOnInterface5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testErrorMismatchingPropertyOnInterface5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorMismatchingPropertyOnInterface6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testErrorMismatchingPropertyOnInterface6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceNonEmptyFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceNonEmptyFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoubleNestedInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDoubleNestedInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticDataPropertyOnNestedInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testStaticDataPropertyOnNestedInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInstantiation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testInterfaceInstantiation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPrototypeLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectPrototypeAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDirectPrototypeAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolutionViaRegistry1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolutionViaRegistry1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolutionViaRegistry2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolutionViaRegistry2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolutionViaRegistry3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolutionViaRegistry3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolutionViaRegistry4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolutionViaRegistry4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolutionViaRegistry5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolutionViaRegistry5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGatherProperyWithoutAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGatherProperyWithoutAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGatherProperyWithoutAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGatherProperyWithoutAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMasksVariableBug() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionMasksVariableBug();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDfa13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDfa13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithCast1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithCast1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithCast3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithCast3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithCast4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithCast4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithCast5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithCast5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithClosure1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithClosure1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeInferenceWithClosure2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeInferenceWithClosure2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardPropertyReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testForwardPropertyReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoForwardTypeDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoForwardTypeDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoForwardTypeDeclarationAndNoBraces() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNoForwardTypeDeclarationAndNoBraces();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardTypeDeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testForwardTypeDeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardTypeDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testForwardTypeDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardTypeDeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testForwardTypeDeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateTypeDef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateTypeDef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeDef1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeDef1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeDef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeDef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeDef3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeDef3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCircularTypeDef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCircularTypeDef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypedPercent1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGetTypedPercent1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypedPercent2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGetTypedPercent2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypedPercent3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGetTypedPercent3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypedPercent4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testGetTypedPercent4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertyReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testPrototypePropertyReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResolvingNamedTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testResolvingNamedTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty25() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty25();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty26() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty26();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty27() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty27();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty28() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty28();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProperty29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testMissingProperty29();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredNativeTypeEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testDeclaredNativeTypeEquality();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testUndefinedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFlowScopeBug1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFlowScopeBug1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFlowScopeBug2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFlowScopeBug2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSingletonGetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testAddSingletonGetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckStandaloneAST() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testTypeCheckStandaloneAST();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testNew16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testName3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testName3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testName4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testName4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testName5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testName5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitOperation9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testBitOperation9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testCall11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LooseTypeCheckTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

}