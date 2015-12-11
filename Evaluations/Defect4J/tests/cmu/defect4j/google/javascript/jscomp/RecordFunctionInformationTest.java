package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RecordFunctionInformationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testModule() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RecordFunctionInformationTest() {
				public void runTest() throws Exception {
					testModule();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMotionPreservesOriginalSourceName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RecordFunctionInformationTest() {
				public void runTest() throws Exception {
					testMotionPreservesOriginalSourceName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RecordFunctionInformationTest() {
				public void runTest() throws Exception {
					testFunction();
				}
			};
			testcase.run();
		}
	}

}