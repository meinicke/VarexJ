package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSCompilerSourceExcerptProviderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testExcerptOneLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptOneLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExcerptLineFromInexistantSource() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptLineFromInexistantSource();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExcerptInexistantLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptInexistantLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExceptNoNewLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExceptNoNewLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExcerptRegion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptRegion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExcerptRegionFromInexistantSource() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptRegionFromInexistantSource();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExcerptInexistantRegion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest() {
				public void runTest() throws Exception {
					testExcerptInexistantRegion();
				}
			};
			testcase.run();
		}
	}

}