package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InlineSimpleMethodsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimpleInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSimpleInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleInline2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSimpleInline2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleGetterInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSimpleGetterInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleSetterInline1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSimpleSetterInline1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSelfInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSelfInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallWithArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testCallWithArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallWithConstArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testCallWithConstArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNestedProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipComplexMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSkipComplexMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipConflictingMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSkipConflictingMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSameNamesDifferentDefinitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSameNamesDifferentDefinitions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSameNamesSameDefinitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testSameNamesSameDefinitions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConfusingNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testConfusingNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testConstantInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantArrayInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testConstantArrayInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantInlineWithSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testConstantInlineWithSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMethodInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testEmptyMethodInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMethodInlineWithSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testEmptyMethodInlineWithSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMethodInlineInAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testEmptyMethodInlineInAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMethodInlineInAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testEmptyMethodInlineInAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNormalMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfExternMethods1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNoInlineOfExternMethods1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfExternMethods2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNoInlineOfExternMethods2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfExternMethods3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNoInlineOfExternMethods3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOfDangerousProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNoInlineOfDangerousProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testNoWarn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLitExtern() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testObjectLitExtern();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testExternFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue2508576_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testIssue2508576_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue2508576_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testIssue2508576_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue2508576_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testIssue2508576_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testAnonymousGet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousSet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testAnonymousSet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.InlineSimpleMethodsTest() {
				public void runTest() throws Exception {
					testObjectLit2();
				}
			};
			testcase.run();
		}
	}

}