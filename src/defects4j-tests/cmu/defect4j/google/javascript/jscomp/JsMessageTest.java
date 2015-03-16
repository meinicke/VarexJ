package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsMessageTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsEmpty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageTest() {
				public void runTest() throws Exception {
					testIsEmpty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMeaningChangesId() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageTest() {
				public void runTest() throws Exception {
					testMeaningChangesId();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageTest() {
				public void runTest() throws Exception {
					testHashValues();
				}
			};
			testcase.run();
		}
	}

}