package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CodePrinterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTypeAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrint();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakTrustedStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testBreakTrustedStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakUntrustedStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testBreakUntrustedStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrintArray();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintInOperatorInForLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrintInOperatorInForLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testLiteralProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAmbiguousElseClauses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testAmbiguousElseClauses();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLineBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testLineBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreferLineBreakAtEndOfFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPreferLineBreakAtEndOfFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrettyPrinter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrettyPrinter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrettyPrinter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrettyPrinter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrettyPrinter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrettyPrinter3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrettyPrinter4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrettyPrinter4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsTypeDef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsTypeDef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsMemberSubclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsMemberSubclass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsMultipleInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsMultipleInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsMember() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsMember();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsImplements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsImplements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsDispatcher1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsDispatcher1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotationsDispatcher2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTypeAnnotationsDispatcher2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testU2UFunctionTypeAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testU2UFunctionTypeAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmitUnknownParamTypesAsAllType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testEmitUnknownParamTypesAsAllType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptionalTypesAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testOptionalTypesAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVariableArgumentsTypesAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testVariableArgumentsTypesAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTempConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testTempConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testEnumAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testEnumAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtraction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testSubtraction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testFunctionWithCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLineLength() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testLineLength();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParsePrintParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testParsePrintParse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoLoopIECompatiblity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testDoLoopIECompatiblity();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionSafariCompatiblity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testFunctionSafariCompatiblity();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExponents() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testExponents();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectEval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testDirectEval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndirectEval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testIndirectEval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFreeCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testFreeCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFreeCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testFreeCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFreeCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testFreeCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrintScript() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testPrintScript();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testObjectLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testObjectLit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testObjectLit3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testObjectLit4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testSetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegCollapse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testNegCollapse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testArrayLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testZero();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnicode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testUnicode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnicodeKeyword() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testUnicodeKeyword();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumericKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testNumericKeys();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue582() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testIssue582();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue601() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testIssue601();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue620() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testIssue620();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue5746867() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testIssue5746867();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommaSpacing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testCommaSpacing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManyCommas() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testManyCommas();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManyAdds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testManyAdds();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusNegativeZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testMinusNegativeZero();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringEscapeSequences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CodePrinterTest() {
				public void runTest() throws Exception {
					testStringEscapeSequences();
				}
			};
			testcase.run();
		}
	}

}