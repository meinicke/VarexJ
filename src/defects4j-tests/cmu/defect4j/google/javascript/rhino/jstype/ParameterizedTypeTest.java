package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ParameterizedTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParameterizedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.ParameterizedTypeTest() {
				public void runTest() throws Exception {
					testParameterizedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.ParameterizedTypeTest() {
				public void runTest() throws Exception {
					testPrint1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.ParameterizedTypeTest() {
				public void runTest() throws Exception {
					testPrint2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.ParameterizedTypeTest() {
				public void runTest() throws Exception {
					testPrint3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDifferentRawTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.ParameterizedTypeTest() {
				public void runTest() throws Exception {
					testDifferentRawTypes();
				}
			};
			testcase.run();
		}
	}

}