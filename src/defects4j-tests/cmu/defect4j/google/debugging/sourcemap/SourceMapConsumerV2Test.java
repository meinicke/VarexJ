package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SourceMapConsumerV2Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetMappingForLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testGetMappingForLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testEmptyMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMappingForLineWithNameIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testGetMappingForLineWithNameIndex();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownVersion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testUnknownVersion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testMissingFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidJSONFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV2Test() {
				public void runTest() throws Exception {
					testInvalidJSONFailure();
				}
			};
			testcase.run();
		}
	}

}