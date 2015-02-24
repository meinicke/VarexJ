package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class OptimizeReturnsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNoRewriteObjLit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testNoRewriteObjLit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteUsedResult1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testNoRewriteUsedResult1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteUsedResult2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testNoRewriteUsedResult2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult4a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult4a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult4c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult4c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult7a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult7a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult7b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult7b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUnusedResult8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUnusedResult8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteObjLit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testNoRewriteObjLit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRewriteArrLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testNoRewriteArrLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testPrototypeMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testPrototypeMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testPrototypeMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethod4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testPrototypeMethod4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallOrApply() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testCallOrApply();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRewriteUseSiteRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeReturnsTest() {
				public void runTest() throws Exception {
					testRewriteUseSiteRemoval();
				}
			};
			testcase.run();
		}
	}

}