package cmu.defect4j.google.javascript.jscomp.deps;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SortedDependenciesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.SortedDependenciesTest() {
				public void runTest() throws Exception {
					testSort();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSort2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.SortedDependenciesTest() {
				public void runTest() throws Exception {
					testSort2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSort3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.SortedDependenciesTest() {
				public void runTest() throws Exception {
					testSort3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSort4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.SortedDependenciesTest() {
				public void runTest() throws Exception {
					testSort4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSort5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.SortedDependenciesTest() {
				public void runTest() throws Exception {
					testSort5();
				}
			};
			testcase.run();
		}
	}

}