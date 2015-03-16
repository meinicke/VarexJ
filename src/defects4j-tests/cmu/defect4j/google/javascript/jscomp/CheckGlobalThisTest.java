package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckGlobalThisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGlobalThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testGlobalThis6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testGlobalThis7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunction8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunction8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testConstructor1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testConstructor2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testConstructor3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterface1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testInterface1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverride1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testOverride1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisJSDoc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testThisJSDoc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisJSDoc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testThisJSDoc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisJSDoc3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testThisJSDoc3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisJSDoc4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testThisJSDoc4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisJSDoc5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testThisJSDoc5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethod4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testMethod4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOfMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testPropertyOfMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInStaticFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testMethodInStaticFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionInMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunctionInMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionInMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testStaticFunctionInMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testInnerFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue182a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testIssue182a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue182b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testIssue182b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue182c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testIssue182c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue182d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testIssue182d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLendsAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testLendsAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLendsAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testLendsAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLendsAnnotation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testLendsAnnotation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalThisTest() {
				public void runTest() throws Exception {
					testSuppressWarning();
				}
			};
			testcase.run();
		}
	}

}