package cmu.defect4j.google.javascript.jscomp.parsing;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testLinenoCharnoAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGetProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGetProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGetProp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGetProp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGetelem1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGetelem1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGetelem2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGetelem2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGetelem3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGetelem3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoForComparison() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoForComparison();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoArrayLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoSub() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoSub();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoMul() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoMul();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoDiv() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoDiv();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoMod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoMod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoShift() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoShift();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoBinaryAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoBinaryAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoBinaryOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoBinaryOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoLt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoLt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoLe() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoLe();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoCharnoGe() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLinenoCharnoGe();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAttachment16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testJSDocAttachment16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectJSDocDoesNotAlterJSParsing9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIncorrectJSDocDoesNotAlterJSParsing9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnescapedSlashInRegexpCharClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testUnescapedSlashInRegexpCharClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testParse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrailingCommaWarning7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testTrailingCommaWarning7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuspiciousBlockCommentWarning1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testSuspiciousBlockCommentWarning1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuspiciousBlockCommentWarning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testSuspiciousBlockCommentWarning2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatchClauseForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testCatchClauseForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testConstForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDestructuringAssignForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testDestructuringAssignForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDestructuringAssignForbidden2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testDestructuringAssignForbidden2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDestructuringAssignForbidden3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testDestructuringAssignForbidden3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDestructuringAssignForbidden4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testDestructuringAssignForbidden4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLetForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLetForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYieldForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testYieldForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBracelessFunctionForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testBracelessFunctionForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGeneratorsForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGeneratorsForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGettersForbidden1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGettersForbidden1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGettersForbidden2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGettersForbidden2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGettersForbidden3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGettersForbidden3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGettersForbidden4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGettersForbidden4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGettersForbidden5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGettersForbidden5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSettersForbidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testSettersForbidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSettersForbidden2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testSettersForbidden2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewJSDoc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testFileOverviewJSDoc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewJSDocDoesNotHoseParsing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testFileOverviewJSDocDoesNotHoseParsing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileOverviewJSDoc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testFileOverviewJSDoc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralDoc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testObjectLiteralDoc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicatedParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testDuplicatedParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLamestWarningEver() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testLamestWarningEver();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnfinishedComment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testUnfinishedComment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseBlockDescription() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testParseBlockDescription();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnnamedFunctionStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testUnnamedFunctionStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReservedKeywords() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testReservedKeywords();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKeywordsAsProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testKeywordsAsProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropFunctionName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGetPropFunctionName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropFunctionNameIdeMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGetPropFunctionNameIdeMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIdeModePartialTree() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testIdeModePartialTree();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForEach() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testForEach();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisplacedTypeAnnotation6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testMisplacedTypeAnnotation6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidTypeAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testValidTypeAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidTypeAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testValidTypeAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidTypeAnnotation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testValidTypeAnnotation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testGetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.ParserTest() {
				public void runTest() throws Exception {
					testSetter();
				}
			};
			testcase.run();
		}
	}

}