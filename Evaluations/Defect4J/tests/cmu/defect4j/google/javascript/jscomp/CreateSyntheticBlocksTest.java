package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CreateSyntheticBlocksTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInvalid1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testInvalid1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testInvalid2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFold1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testFold1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldWithMarkers1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testFoldWithMarkers1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldWithMarkers1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testFoldWithMarkers1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFold2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testFold2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldWithMarkers2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testFoldWithMarkers2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnmatchedStartMarker() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testUnmatchedStartMarker();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnmatchedEndMarker1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testUnmatchedEndMarker1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnmatchedEndMarker2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testUnmatchedEndMarker2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDenormalize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testDenormalize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonMarkingUse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testNonMarkingUse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainingBlockPreservation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CreateSyntheticBlocksTest() {
				public void runTest() throws Exception {
					testContainingBlockPreservation();
				}
			};
			testcase.run();
		}
	}

}