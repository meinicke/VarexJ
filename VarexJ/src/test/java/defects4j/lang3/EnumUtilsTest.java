package defects4j.lang3;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class EnumUtilsTest extends TestJPF {

	private final String[] config = { "+nhandler.delegateUnhandledNative",
			"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar" };

	public static void main(String[] testMethods) {
		runTestsOfThisClass(testMethods);
	}

	@Test(timeout = 120000)
	public void testConstructable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.testConstructable();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_getEnumMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_getEnumMap();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_getEnumList() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_getEnumList();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_isEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_isEnum();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_isEnum_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_isEnum_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_getEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_getEnum();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_getEnum_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_getEnum_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullIterable() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullIterable();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullIterable() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullIterable();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullElement() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullElement();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullElement() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullElement();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullClassWithArray() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullClassWithArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullClassWithArray() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullClassWithArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullArray() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullArray() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nullArrayElement() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nullArrayElement();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nullArrayElement() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nullArrayElement();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_longClass() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_longClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_longClassWithArray() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_longClassWithArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nonEnumClass() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nonEnumClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nonEnumClass() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nonEnumClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector_nonEnumClassWithArray() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector_nonEnumClassWithArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors_nonEnumClassWithArray() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors_nonEnumClassWithArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVector() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVector();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectors();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectorFromArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectorFromArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_generateBitVectorsFromArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_generateBitVectorsFromArray();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_processBitVector_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_processBitVector_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_processBitVectors_nullClass() throws Exception {
		if (verifyUnhandledException("java.lang.NullPointerException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_processBitVectors_nullClass();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_processBitVector() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_processBitVector();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_processBitVectors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_processBitVectors();
			}
		}

	}

	@Test(timeout = 120000)
	public void test_processBitVector_longClass() throws Exception {
		if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
			if (V) {
				org.apache.commons.lang3.EnumUtilsTest object = new org.apache.commons.lang3.EnumUtilsTest();
				object.test_processBitVector_longClass();
			}
		}
	}

}