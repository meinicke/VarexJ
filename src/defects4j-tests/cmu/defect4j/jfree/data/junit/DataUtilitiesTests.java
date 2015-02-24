package cmu.defect4j.jfree.data.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DataUtilitiesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	//Don't know how to run each test case separately for this class
	@Test(timeout=120000)
	public void Main() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.jfree.data.junit.DataUtilitiesTests.main(null);
		}
	}

}