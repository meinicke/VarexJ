package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InlinePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstInstanceProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstInstanceProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstInstanceProp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstInstanceProp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstClassProps1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstClassProps1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstClassProps2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstClassProps2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstInstanceProp3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstInstanceProp3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstInstanceProp4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstInstanceProp4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstClassProps3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstClassProps3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonConstClassProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testNonConstClassProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonConstClassProp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testNonConstClassProp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonConstructorClassProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testNonConstructorClassProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionalClassProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConditionalClassProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstPrototypeProp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstPrototypeProp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstPrototypeProp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlinePropertiesTest() {
				public void runTest() throws Exception {
					testConstPrototypeProp2();
				}
			};
			testcase.run();
		}
	}

}