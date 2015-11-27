package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReplaceMessagesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testReplaceSimpleMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testReplaceSimpleMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrictModeAndMessageReplacementAbsentInNonEmptyBundle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testStrictModeAndMessageReplacementAbsentInNonEmptyBundle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testNameReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testGetPropReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCallReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testFunctionCallReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodCallReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testMethodCallReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testHookReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testAddReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlaceholderValueReferencedTwice() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testPlaceholderValueReferencedTwice();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlaceholderNameInLowerCamelCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testPlaceholderNameInLowerCamelCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedMessageName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testQualifiedMessageName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleMessageReplacementMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testSimpleMessageReplacementMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleMessageReplacementMissingWithNewStyle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testSimpleMessageReplacementMissingWithNewStyle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrictModeAndMessageReplacementAbsentInBundle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testStrictModeAndMessageReplacementAbsentInBundle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionReplacementMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testFunctionReplacementMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithParamReplacementMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testFunctionWithParamReplacementMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlaceholderNameInLowerUnderscoreCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testPlaceholderNameInLowerUnderscoreCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadPlaceholderReferenceInReplacement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testBadPlaceholderReferenceInReplacement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStyleNoPlaceholdersVarSyntax() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStyleNoPlaceholdersVarSyntax();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStyleNoPlaceholdersFunctionSyntax() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStyleNoPlaceholdersFunctionSyntax();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStyleOnePlaceholder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStyleOnePlaceholder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStyleTwoPlaceholders() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStyleTwoPlaceholders();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStylePlaceholderNameInLowerCamelCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStylePlaceholderNameInLowerCamelCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStylePlaceholderNameInLowerUnderscoreCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStylePlaceholderNameInLowerUnderscoreCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegacyStyleBadPlaceholderReferenceInReplacemen() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testLegacyStyleBadPlaceholderReferenceInReplacemen();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTranslatedPlaceHolderMissMatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testTranslatedPlaceHolderMissMatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadFallbackSyntax1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testBadFallbackSyntax1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadFallbackSyntax2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testBadFallbackSyntax2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadFallbackSyntax3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testBadFallbackSyntax3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadFallbackSyntax4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testBadFallbackSyntax4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseFallback() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testUseFallback();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFallbackEmptyBundle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testFallbackEmptyBundle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoUseFallback() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testNoUseFallback();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoUseFallback2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesTest() {
				public void runTest() throws Exception {
					testNoUseFallback2();
				}
			};
			testcase.run();
		}
	}

}