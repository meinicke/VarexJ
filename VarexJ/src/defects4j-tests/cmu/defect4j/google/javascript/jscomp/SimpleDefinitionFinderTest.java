package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SimpleDefinitionFinderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDefineNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testDefineNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testDefineGet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineSet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testDefineSet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testDefineFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArgumentsBasic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testFunctionArgumentsBasic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArgumentsInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testFunctionArgumentsInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefinitionInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testDefinitionInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLitInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testObjectLitInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testCallInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SimpleDefinitionFinderTest() {
				public void runTest() throws Exception {
					testMultipleDefinition();
				}
			};
			testcase.run();
		}
	}

}