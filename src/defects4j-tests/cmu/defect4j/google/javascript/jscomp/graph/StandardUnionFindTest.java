package cmu.defect4j.google.javascript.jscomp.graph;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StandardUnionFindTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmpty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testEmpty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testSetSize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFind() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testFind();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllEquivalenceClasses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testAllEquivalenceClasses();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindAll() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testFindAll();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindAllIterator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testFindAllIterator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindAllSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testFindAllSize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testElements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testElements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCopy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testCopy();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChangesToCopyDontAffectOriginal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testChangesToCopyDontAffectOriginal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckEquivalent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.graph.StandardUnionFindTest() {
				public void runTest() throws Exception {
					testCheckEquivalent();
				}
			};
			testcase.run();
		}
	}

}