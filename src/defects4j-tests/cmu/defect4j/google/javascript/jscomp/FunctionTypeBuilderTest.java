package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionTypeBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testValidBuiltInTypeRedefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testValidBuiltInTypeRedefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBuiltInTypeDifferentReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testBuiltInTypeDifferentReturnType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBuiltInTypeDifferentNumParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testBuiltInTypeDifferentNumParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBuiltInTypeDifferentNumParams2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testBuiltInTypeDifferentNumParams2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBuiltInTypeDifferentParamType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testBuiltInTypeDifferentParamType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadFunctionTypeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testBadFunctionTypeDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternSubTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionTypeBuilderTest() {
				public void runTest() throws Exception {
					testExternSubTypes();
				}
			};
			testcase.run();
		}
	}

}