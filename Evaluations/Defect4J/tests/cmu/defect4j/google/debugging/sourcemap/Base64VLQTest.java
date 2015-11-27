package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class Base64VLQTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBase64VLQSelectedValues1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64VLQTest() {
				public void runTest() throws Exception {
					testBase64VLQSelectedValues1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBase64VLQSelectedValues2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64VLQTest() {
				public void runTest() throws Exception {
					testBase64VLQSelectedValues2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBase64VLQSelectedSignedValues1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64VLQTest() {
				public void runTest() throws Exception {
					testBase64VLQSelectedSignedValues1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBase64VLQSelectedSignedValues2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64VLQTest() {
				public void runTest() throws Exception {
					testBase64VLQSelectedSignedValues2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpeed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64VLQTest() {
				public void runTest() throws Exception {
					testSpeed();
				}
			};
			testcase.run();
		}
	}

}