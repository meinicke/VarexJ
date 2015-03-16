package cmu.defect4j.google.javascript.jscomp.parsing;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsDocInfoParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParseTypeViaStatic1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseTypeViaStatic1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseTypeViaStatic2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseTypeViaStatic2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseTypeViaStatic3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseTypeViaStatic3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseTypeViaStatic4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseTypeViaStatic4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInvalidTypeViaStatic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInvalidTypeViaStatic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInvalidTypeViaStatic2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInvalidTypeViaStatic2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedTypeError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedTypeError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNamedTypeError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNamedTypeError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypedefType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypedefType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypedefType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStringType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseStringType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseStringType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseStringType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBooleanType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseBooleanType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBooleanType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseBooleanType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNumberType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNumberType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNumberType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNumberType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseAllType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseAllType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseAllType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseAllType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDateType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRegExpType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRegExpType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseErrorTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseErrorTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUndefinedType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUndefinedType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUndefinedType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUndefinedType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUndefinedType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUndefinedType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParameterizedType11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParameterizedType11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParameterizedType12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParameterizedType12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParametrizedType13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParametrizedType13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionType18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionType18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnionTypeError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnionTypeError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnknownType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnknownType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnknownType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnknownType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseUnknownType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseUnknownType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalType19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalType19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStructuralConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testStructuralConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNominalConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testNominalConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1419535() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBug1419535();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue477() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testIssue477();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMalformedThisAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testMalformedThisAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseFunctionalTypeError12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseFunctionalTypeError12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayTypeError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayTypeError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayTypeError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayTypeError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayTypeError3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayTypeError3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseArrayTypeError4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseArrayTypeError4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNullableModifiers9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNullableModifiers9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseOptionalModifier() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseOptionalModifier();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNewline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNewline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNewline2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNewline2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNewline3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNewline3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNewline4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNewline4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNewline5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNewline5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseReturnType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseReturnType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseReturnType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseReturnType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseReturnType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseReturnType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThisType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThisType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParam21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParam21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThrows1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThrows1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseThrows2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseThrows2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseRecordType23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseRecordType23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParamError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParamError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParamError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParamError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParamError3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParamError3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParamError4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParamError4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseParamError5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseParamError5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtendsGenerics() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtendsGenerics();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsGenerics() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsGenerics();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtends4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtends4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtends5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtends5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtends6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtends6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtendsInvalidName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtendsInvalidName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtendsNullable1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtendsNullable1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExtendsNullable2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExtendsNullable2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseEnum1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseEnum1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseEnum2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseEnum2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseEnum3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseEnum3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDesc12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDesc12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMeaning1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseMeaning1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMeaning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseMeaning2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMeaning3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseMeaning3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMeaning4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseMeaning4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLends7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLends7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParsePreserve() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParsePreserve();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLicense() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLicense();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLicenseAscii() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLicenseAscii();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLicenseWithAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseLicenseWithAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefine2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefine3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefine3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefine4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefine4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefine5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefine5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDefineErrors8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDefineErrors8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoCheck1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoCheck1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoCheck2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoCheck2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseOverride1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseOverride1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseOverride2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseOverride2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInheritDoc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInheritDoc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInheritDoc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInheritDoc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInheritDoc3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInheritDoc3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDeprecated1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDeprecated1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDeprecated2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDeprecated2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExport1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExport1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExport2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExport2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExpose1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExpose1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExpose2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExpose2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseJavaDispatch1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseJavaDispatch1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseJavaDispatch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseJavaDispatch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseJavaDispatch3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseJavaDispatch3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoCompile1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoCompile1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseNoCompile2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseNoCompile2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBugAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBugAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDescriptionAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testDescriptionAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegression17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testRegression17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFullRegression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFullRegression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFullRegression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFullRegression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFullRegression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFullRegression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug907488() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBug907488();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug907494() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBug907494();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug909468() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBug909468();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplicitCast1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplicitCast1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplicitCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplicitCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDuplicateImplicitCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseDuplicateImplicitCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInterfaceDoubled() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseInterfaceDoubled();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsTwo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsTwo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsSameTwice() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsSameTwice();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsNoName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsNoName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsMissingRC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsMissingRC();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsNullable1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsNullable1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseImplementsNullable2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseImplementsNullable2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceMultiExtends1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testInterfaceMultiExtends1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceMultiExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testInterfaceMultiExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadClassMultiExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadClassMultiExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadExtendsWithNullable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadExtendsWithNullable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadImplementsWithNullable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadImplementsWithNullable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadTypeDefInterfaceAndConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadTypeDefInterfaceAndConstructor1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadTypeDefInterfaceAndConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadTypeDefInterfaceAndConstructor2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDocumentationParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testDocumentationParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultilineDocumentationParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testMultilineDocumentationParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDocumentationMultipleParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testDocumentationMultipleParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDocumentationMultipleParameter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testDocumentationMultipleParameter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAuthors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testAuthors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppress1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSuppress1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppress2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSuppress2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadSuppress7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadSuppress7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModifies6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testModifies6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModifies9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testBadModifies9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewSingleLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFileOverviewSingleLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewMultiLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFileOverviewMultiLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewDuplicate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testFileOverviewDuplicate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleTags() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSingleTags();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleTagsReordered() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSingleTagsReordered();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVersionDuplication() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testVersionDuplication();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVersionMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testVersionMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAuthorMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testAuthorMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeeMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSeeMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testSourceName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBlockComment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseBlockComment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBlockComment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseBlockComment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBlockComment3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseBlockComment3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkers6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkers6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkerNames1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkerNames1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkerNames2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkerNames2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkerNames3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkerNames3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithoutMarkerName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithoutMarkerName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkerType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkerType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseWithMarkerType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParseWithMarkerType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict17() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict17();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict18() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict18();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict19() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict19();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeTagConflict24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testTypeTagConflict24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testPrivateType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testProtectedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testPublicType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testConstType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableIdGeneratorConflict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testStableIdGeneratorConflict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParserWithTemplateTypeNameMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParserWithTemplateTypeNameMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParserWithTemplateDuplicated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParserWithTemplateDuplicated();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParserWithTwoTemplates() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testParserWithTwoTemplates();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistedNewAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testWhitelistedNewAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistedConflictingAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testWhitelistedConflictingAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonIdentifierAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testNonIdentifierAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnsupportedJsDocSyntax1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testUnsupportedJsDocSyntax1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnsupportedJsDocSyntax2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testUnsupportedJsDocSyntax2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistedAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testWhitelistedAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetOriginalCommentString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testGetOriginalCommentString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.JsDocInfoParserTest() {
				public void runTest() throws Exception {
					testInterfaceExtends();
				}
			};
			testcase.run();
		}
	}

}