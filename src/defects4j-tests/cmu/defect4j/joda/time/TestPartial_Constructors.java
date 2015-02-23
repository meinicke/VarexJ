package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPartial_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Type_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_Type_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx1_Type_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx1_Type_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx2_Type_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx2_Type_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Type_int_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_Type_int_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx_Type_int_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx_Type_int_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx2_Type_int_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx2_Type_int_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor2_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor2_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx1_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx1_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx3_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx3_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx5_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx5_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx6_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx6_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx7_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx7_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx8_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx8_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx9_TypeArray_intArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx9_TypeArray_intArray");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_TypeArray_intArray_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_TypeArray_intArray_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Partial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructor_Partial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorEx_Partial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Constructors("testConstructorEx_Partial");
			testcase.run();
		}
	}

}