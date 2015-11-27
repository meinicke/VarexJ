package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ProcessTweaksTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBasicTweak1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTweak2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTweak3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTweak4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTweak5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTweak6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testBasicTweak6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonLiteralId1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testNonLiteralId1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonLiteralId2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testNonLiteralId2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonLiteralId3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testNonLiteralId3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidId() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testInvalidId();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidDefaultValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testInvalidDefaultValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidDefaultValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testInvalidDefaultValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownGetString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testUnknownGetString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownGetNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testUnknownGetNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownGetBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testUnknownGetBoolean();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testUnknownOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateTweak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testDuplicateTweak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverrideAfterRegister() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testOverrideAfterRegister();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegisterInNonGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testRegisterInNonGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWrongGetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testWrongGetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWrongGetter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testWrongGetter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWrongGetter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testWrongGetter3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithNoTweaks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testWithNoTweaks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithImplicitDefaultValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithImplicitDefaultValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithExplicitDefaultValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithExplicitDefaultValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithInCodeOverrides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithInCodeOverrides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithUnregisteredTweak1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithUnregisteredTweak1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithUnregisteredTweak2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithUnregisteredTweak2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingWithUnregisteredTweak3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingWithUnregisteredTweak3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStrippingOfManuallyRegistered1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testStrippingOfManuallyRegistered1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverridesWithStripping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testOverridesWithStripping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompilerOverridesNoStripping1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testCompilerOverridesNoStripping1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompilerOverridesNoStripping2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testCompilerOverridesNoStripping2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownCompilerOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testUnknownCompilerOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompilerOverrideWithWrongType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessTweaksTest() {
				public void runTest() throws Exception {
					testCompilerOverrideWithWrongType();
				}
			};
			testcase.run();
		}
	}

}