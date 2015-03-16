package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReplaceMessagesForChromeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testReplaceSimpleMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplaceSimpleMessage();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceSinglePlaceholder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplaceSinglePlaceholder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceTwoPlaceholders() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplaceTwoPlaceholders();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplacePlaceholderMissingValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplacePlaceholderMissingValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceTwoPlaceholdersNonAlphaOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplaceTwoPlaceholdersNonAlphaOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceExternalMessage() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceMessagesForChromeTest() {
				public void runTest() throws Exception {
					testReplaceExternalMessage();
				}
			};
			testcase.run();
		}
	}

}