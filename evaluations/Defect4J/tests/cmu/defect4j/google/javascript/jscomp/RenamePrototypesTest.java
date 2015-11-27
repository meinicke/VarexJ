package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RenamePrototypesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testModule() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testModule();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrototypes1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testRenamePrototypes1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrototypes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testRenamePrototypes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrototypesWithGetOrSet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testRenamePrototypesWithGetOrSet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testRenameProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBoth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testBoth();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyNameThatIsBothObjLitKeyAndPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testPropertyNameThatIsBothObjLitKeyAndPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableSimple1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testStableSimple1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableSimple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testStableSimple2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableSimple3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testStableSimple3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableOverlap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testStableOverlap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableTrickyExternedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePrototypesTest() {
				public void runTest() throws Exception {
					testStableTrickyExternedMethods();
				}
			};
			testcase.run();
		}
	}

}