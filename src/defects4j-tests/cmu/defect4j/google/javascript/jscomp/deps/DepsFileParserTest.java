package cmu.defect4j.google.javascript.jscomp.deps;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DepsFileParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGoodParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.DepsFileParserTest() {
				public void runTest() throws Exception {
					testGoodParse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTooFewArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.DepsFileParserTest() {
				public void runTest() throws Exception {
					testTooFewArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTooManyArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.DepsFileParserTest() {
				public void runTest() throws Exception {
					testTooManyArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortcutMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.DepsFileParserTest() {
				public void runTest() throws Exception {
					testShortcutMode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoShortcutMode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.DepsFileParserTest() {
				public void runTest() throws Exception {
					testNoShortcutMode();
				}
			};
			testcase.run();
		}
	}

}