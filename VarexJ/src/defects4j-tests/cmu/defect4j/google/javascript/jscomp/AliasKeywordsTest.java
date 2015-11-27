package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AliasKeywordsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDontAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testDontAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasTrueFalseNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testAliasTrueFalseNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasThrowKeywordLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testAliasThrowKeywordLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExistingAliasDefinitionFails() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testExistingAliasDefinitionFails();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithNoInputs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasKeywordsTest() {
				public void runTest() throws Exception {
					testWithNoInputs();
				}
			};
			testcase.run();
		}
	}

}