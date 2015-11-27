package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeZone extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testSerialization1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testDefault");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefaultSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testDefaultSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForID_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForID_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForID_String_old() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForID_String_old");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForOffsetHours_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForOffsetHours_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForOffsetHoursMinutes_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForOffsetHoursMinutes_int_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForOffsetMillis_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForOffsetMillis_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForTimeZone_TimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testForTimeZone_TimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeZoneConversion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testTimeZoneConversion");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAvailableIDs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetAvailableIDs");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvider() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testProvider");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvider_badClassName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testProvider_badClassName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProviderSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testProviderSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameProvider() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testNameProvider");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameProvider_badClassName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testNameProvider_badClassName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameProviderSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testNameProviderSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetID() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetID");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNameKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetNameKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetShortName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetShortName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetShortName_berlin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetShortName_berlin");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetShortNameProviderName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetShortNameProviderName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetShortNameNullKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetShortNameNullKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetName_berlin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetName_berlin");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNameProviderName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetNameProviderName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNameNullKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetNameNullKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetOffset_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetOffset_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetOffset_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetOffset_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetOffsetFixed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetOffsetFixed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetOffsetFixed_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetOffsetFixed_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMillisKeepLocal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testGetMillisKeepLocal");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsFixed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testIsFixed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransitionFixed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testTransitionFixed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLocalDateTimeGap_Berlin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testIsLocalDateTimeGap_Berlin");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLocalDateTimeGap_NewYork() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testIsLocalDateTimeGap_NewYork");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testToTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommentParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testCommentParse");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPatchedNameKeysLondon() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testPatchedNameKeysLondon");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPatchedNameKeysSydney() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testPatchedNameKeysSydney");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPatchedNameKeysSydneyHistoric() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testPatchedNameKeysSydneyHistoric");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPatchedNameKeysGazaHistoric() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testPatchedNameKeysGazaHistoric");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZone("testToString");
			testcase.run();
		}
	}

}