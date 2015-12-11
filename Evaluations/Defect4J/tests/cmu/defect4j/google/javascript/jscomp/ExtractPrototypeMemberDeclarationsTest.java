package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ExtractPrototypeMemberDeclarationsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testExtractingTwoClassPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testExtractingTwoClassPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractingTwoClassPrototypeInDifferentBlocks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testExtractingTwoClassPrototypeInDifferentBlocks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoMemberDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testNoMemberDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterweaved() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testInterweaved();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotEnoughPrototypeToExtract() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testNotEnoughPrototypeToExtract();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractingSingleClassPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testExtractingSingleClassPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractingPrototypeWithQName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testExtractingPrototypeWithQName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractingPrototypeWithNestedMembers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testExtractingPrototypeWithNestedMembers();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDevirtualization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testWithDevirtualization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testAnonSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonWithDevirtualization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testAnonWithDevirtualization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonWithSideFx() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest() {
				public void runTest() throws Exception {
					testAnonWithSideFx();
				}
			};
			testcase.run();
		}
	}

}