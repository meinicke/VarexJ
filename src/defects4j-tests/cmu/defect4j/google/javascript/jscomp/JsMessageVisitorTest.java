package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsMessageVisitorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testJsMessageOnVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testJsMessageOnVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJsMessageOnProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testJsMessageOnProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrphanedJsMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testOrphanedJsMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMessageWithoutDescription() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testMessageWithoutDescription();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectMessageReporting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIncorrectMessageReporting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testEmptyMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConcatOfStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testConcatOfStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyFormatDescription() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testLegacyFormatDescription();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyFormatParametizedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testLegacyFormatParametizedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyMessageWithDescAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testLegacyMessageWithDescAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyMessageWithDescAnnotationAndHelpVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testLegacyMessageWithDescAnnotationAndHelpVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureMessageWithHelpPostfix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testClosureMessageWithHelpPostfix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureMessageWithoutGoogGetmsg() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testClosureMessageWithoutGoogGetmsg();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureFormatParametizedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testClosureFormatParametizedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHugeMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testHugeMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnnamedGoogleMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testUnnamedGoogleMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyTextMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testEmptyTextMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyTextComplexMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testEmptyTextComplexMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMessageIsNoUnnamed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testMessageIsNoUnnamed();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsgVarWithoutAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testMsgVarWithoutAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegularVarWithoutAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testRegularVarWithoutAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsgVarWithIncorrectRightSide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testMsgVarWithIncorrectRightSide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIncorrectMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnrecognizedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testUnrecognizedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractPropertyMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testExtractPropertyMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAlmostButNotExternalMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testAlmostButNotExternalMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternalMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testExternalMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsValidMessageNameStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIsValidMessageNameStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsValidMessageNameRelax() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIsValidMessageNameRelax();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsValidMessageNameLegacy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIsValidMessageNameLegacy();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnexistedPlaceholders() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testUnexistedPlaceholders();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedReferenesAreNotOK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testUnusedReferenesAreNotOK();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicatePlaceHoldersAreBad() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testDuplicatePlaceHoldersAreBad();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicatePlaceholderReferencesAreOk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testDuplicatePlaceholderReferencesAreOk();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCamelcasePlaceholderNamesAreOk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testCamelcasePlaceholderNamesAreOk();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithNonCamelcasePlaceholderNamesAreNotOk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testWithNonCamelcasePlaceholderNamesAreNotOk();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnquotedPlaceholdersAreOk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testUnquotedPlaceholdersAreOk();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLowerCamelCaseWithNumericSuffixes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testIsLowerCamelCaseWithNumericSuffixes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLowerCamelCaseWithNumericSuffixes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testToLowerCamelCaseWithNumericSuffixes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateMessageError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testDuplicateMessageError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoDuplicateErrorOnExternMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testNoDuplicateErrorOnExternMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorWhenUsingMsgPrefixWithFallback() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageVisitorTest() {
				public void runTest() throws Exception {
					testErrorWhenUsingMsgPrefixWithFallback();
				}
			};
			testcase.run();
		}
	}

}