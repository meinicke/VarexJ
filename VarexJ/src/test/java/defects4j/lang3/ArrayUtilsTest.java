package defects4j.lang3;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class ArrayUtilsTest extends TestJPF {

	private final String[] config = { "+nhandler.delegateUnhandledNative",
			"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar" };

	public static void main(String[] testMethods) {
		runTestsOfThisClass(testMethods);
	}

	@Conditional
	public static boolean V = true;

	@Test(timeout = 120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testConstructor();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIsEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIsEquals();
			}
		}

	}

	@Test(timeout = 120000)
	public void testArrayCreation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testArrayCreation();
			}
		}

	}

	@Test(timeout = 120000)
	public void testArrayCreationWithGeneralReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testArrayCreationWithGeneralReturnType();
			}
		}

	}

	@Test(timeout = 120000)
	public void testArrayCreationWithDifferentTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testArrayCreationWithDifferentTypes();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndirectArrayCreation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndirectArrayCreation();
			}
		}

	}

	@Test(timeout = 120000)
	public void testEmptyArrayCreation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testEmptyArrayCreation();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndirectEmptyArrayCreation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndirectEmptyArrayCreation();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToMap();
			}
		}

	}

	@Test(timeout = 120000)
	public void testClone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testClone();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testCloneFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testCloneFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyString();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyBooleanObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyBooleanObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyLongObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyLongObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyIntObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyIntObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyShortObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyShortObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyCharObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyCharObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyByteObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyByteObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyDoubleObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyDoubleObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testNullToEmptyFloatObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testNullToEmptyFloatObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSubarrayBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSubarrayBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLength() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLength();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameLengthFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameLengthFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testSameType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testSameType();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverse();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testReverseBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testReverseBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOf();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOf();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContains() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContains();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfLongWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfLongWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfLongWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfLongWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsLong();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfIntWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfIntWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfIntWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfIntWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsInt();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfShortWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfShortWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfShortWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfShortWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsShort();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfCharWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfCharWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfCharWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfCharWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsChar();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfByteWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfByteWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfByteWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfByteWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsByte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfDoubleTolerance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfDoubleTolerance();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfDoubleWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfDoubleWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfDoubleWithStartIndexTolerance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfDoubleWithStartIndexTolerance();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfDoubleTolerance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfDoubleTolerance();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfDoubleWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfDoubleWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfDoubleWithStartIndexTolerance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfDoubleWithStartIndexTolerance();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsDouble();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsDoubleTolerance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsDoubleTolerance();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfFloatWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfFloatWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfFloatWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfFloatWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsFloat();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIndexOfBooleanWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIndexOfBooleanWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testLastIndexOfBooleanWithStartIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testLastIndexOfBooleanWithStartIndex();
			}
		}

	}

	@Test(timeout = 120000)
	public void testContainsBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testContainsBoolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_boolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_boolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_boolean_boolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_boolean_boolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_boolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_boolean();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_char() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_char();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_char_char() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_char_char();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_char() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_char();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_byte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_byte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_byte_byte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_byte_byte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_byte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_byte();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_short() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_short();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_short_short() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_short_short();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_short() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_short();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_int();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_int_int();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_intNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_intNull();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_int();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_long();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_long_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_long_long();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_long();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_float() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_float();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_float_float() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_float_float();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_float() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_float();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_double() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_double();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToPrimitive_double_double() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToPrimitive_double_double();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToObject_double() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToObject_double();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIsEmptyObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIsEmptyObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIsEmptyPrimitives() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIsEmptyPrimitives();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIsNotEmptyObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIsNotEmptyObject();
			}
		}

	}

	@Test(timeout = 120000)
	public void testIsNotEmptyPrimitives() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testIsNotEmptyPrimitives();
			}
		}

	}

	@Test(timeout = 120000)
	public void testGetLength() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testGetLength();
			}
		}

	}

	@Test(timeout = 120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testHashCode();
			}
		}

	}

	@Test(timeout = 120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsTest object = new org.apache.commons.lang3.ArrayUtilsTest();
				object.testToString();
			}
		}
	}
}