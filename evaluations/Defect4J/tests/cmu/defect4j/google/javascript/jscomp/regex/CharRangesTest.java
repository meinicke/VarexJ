package cmu.defect4j.google.javascript.jscomp.regex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CharRangesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAgainstRegularImplementation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testAgainstRegularImplementation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyCharRanges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testEmptyCharRanges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCharRangesFactories() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testCharRangesFactories();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRangeConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testRangeConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDupeMembers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testDupeMembers();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDifference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.regex.CharRangesTest() {
				public void runTest() throws Exception {
					testDifference();
				}
			};
			testcase.run();
		}
	}

}