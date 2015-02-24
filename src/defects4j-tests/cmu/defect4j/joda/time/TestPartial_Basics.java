package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPartial_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGet");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithChronologyRetainFields_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_sameChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithChronologyRetainFields_sameChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_nullChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithChronologyRetainFields_nullChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testIsBefore_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testIsAfter_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_TOD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testIsEqual_TOD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3a");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3b");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3c");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3d");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3e");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith3f() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith3f");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith_baseHasNoRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith_baseHasNoRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith_argHasNoRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith_argHasNoRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith_baseAndArgHaveNoRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWith_baseAndArgHaveNoRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithout1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithout1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithout2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithout2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithout3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithout3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithout4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithout4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithout5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithout5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithField3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithField4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAddWrapped8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAddWrapped8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFormatter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFormatter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFormatter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFormatter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFormatter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFormatter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithField1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithField2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testWithFieldAdded4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

}