package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LightweightMessageFormatterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneLineRegion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testOneLineRegion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoLineRegion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testTwoLineRegion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoEmptyLines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testTwoEmptyLines();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThreeLineRegionAcrossNumberRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testThreeLineRegionAcrossNumberRange();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThreeLineRegionEmptyLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testThreeLineRegionEmptyLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyOneEmptyLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testOnlyOneEmptyLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThreeLineRemoveLastEmptyLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testThreeLineRemoveLastEmptyLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatErrorSpaces() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testFormatErrorSpaces();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatErrorTabs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testFormatErrorTabs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatErrorSpaceEndOfLine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testFormatErrorSpaceEndOfLine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatErrorSpaceEndOfLine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LightweightMessageFormatterTest() {
				public void runTest() throws Exception {
					testFormatErrorSpaceEndOfLine2();
				}
			};
			testcase.run();
		}
	}

}