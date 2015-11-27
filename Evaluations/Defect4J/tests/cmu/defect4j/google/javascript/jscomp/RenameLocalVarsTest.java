package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RenameLocalVarsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRenameGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameLocals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameLocals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameNested() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameNested();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameLocalsClashingWithGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameLocalsClashingWithGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotRenameExportedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testDoNotRenameExportedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithNameOverlap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithNameOverlap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLocalVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix3();
				}
			};
			testcase.run();
		}
	}

}