package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class VariableMapTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCycle1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testCycle1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToBytes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testToBytes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFromBytes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testFromBytes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileFormat1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testFileFormat1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFromBytesComplex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testFromBytesComplex1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFromBytesComplex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableMapTest() {
				public void runTest() throws Exception {
					testFromBytesComplex2();
				}
			};
			testcase.run();
		}
	}

}