package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class Base64Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBase64EncodeInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64Test() {
				public void runTest() throws Exception {
					testBase64EncodeInt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBase64() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.Base64Test() {
				public void runTest() throws Exception {
					testBase64();
				}
			};
			testcase.run();
		}
	}

}