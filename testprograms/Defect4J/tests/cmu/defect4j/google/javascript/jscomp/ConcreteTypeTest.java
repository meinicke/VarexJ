package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ConcreteTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testEquals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionWith() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testUnionWith();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIntersectionWith() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testIntersectionWith();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testInstance();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetX() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConcreteTypeTest() {
				public void runTest() throws Exception {
					testGetX();
				}
			};
			testcase.run();
		}
	}

}