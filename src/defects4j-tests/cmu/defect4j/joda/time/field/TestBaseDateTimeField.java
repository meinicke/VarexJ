package cmu.defect4j.joda.time.field;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestBaseDateTimeField extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_getMaximumValue_RP_intarray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumValue_RP_intarray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMaximumTextLength_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumTextLength_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMaximumShortTextLength_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumShortTextLength_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_roundFloor_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_roundFloor_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_roundCeiling_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_roundCeiling_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_roundHalfFloor_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_roundHalfFloor_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_roundHalfCeiling_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_roundHalfCeiling_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_roundHalfEven_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_roundHalfEven_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_remainder_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_remainder_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_constructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_constructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_toString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_toString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_isSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_isSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_get() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_get");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsText_long_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsText_long_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsText_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsText_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsText_RP_int_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsText_RP_int_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsText_RP_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsText_RP_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsText_int_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsText_int_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsShortText_long_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsShortText_long_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsShortText_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsShortText_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsShortText_RP_int_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsShortText_RP_int_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsShortText_RP_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsShortText_RP_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getAsShortText_int_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getAsShortText_int_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_add_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_add_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_add_long_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_add_long_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_add_RP_int_intarray_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_add_RP_int_intarray_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_addWrapField_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_addWrapField_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_addWrapField_RP_int_intarray_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_addWrapField_RP_int_intarray_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDifference_long_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getDifference_long_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDifferenceAsLong_long_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getDifferenceAsLong_long_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_set_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_set_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_set_RP_int_intarray_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_set_RP_int_intarray_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_set_long_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_set_long_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_set_long_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_set_long_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_set_RP_int_intarray_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_set_RP_int_intarray_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_convertText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_convertText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_isLeap_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_isLeap_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getLeapAmount_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getLeapAmount_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getLeapDurationField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getLeapDurationField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMinimumValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMinimumValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMinimumValue_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMinimumValue_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMinimumValue_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMinimumValue_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMinimumValue_RP_intarray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMinimumValue_RP_intarray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMaximumValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMaximumValue_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumValue_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getMaximumValue_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestBaseDateTimeField("test_getMaximumValue_RP");
			testcase.run();
		}
	}

}