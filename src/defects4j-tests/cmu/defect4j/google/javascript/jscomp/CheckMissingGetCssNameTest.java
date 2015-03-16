package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckMissingGetCssNameTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMissingGetCssName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testMissingGetCssName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecognizeGetCssName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testRecognizeGetCssName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreGetUniqueIdArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testIgnoreGetUniqueIdArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreAssignmentsToIdConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testIgnoreAssignmentsToIdConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotMissingGetCssName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testNotMissingGetCssName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontCrashIfTheresNoQualifiedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingGetCssNameTest() {
				public void runTest() throws Exception {
					testDontCrashIfTheresNoQualifiedName();
				}
			};
			testcase.run();
		}
	}

}