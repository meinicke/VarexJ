package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ToStringStyleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testSetArrayStart() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetArrayStart();
        }
    }

    @Test(timeout=10000)
    public void testSetArrayEnd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetArrayEnd();
        }
    }

    @Test(timeout=10000)
    public void testSetArraySeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetArraySeparator();
        }
    }

    @Test(timeout=10000)
    public void testSetContentStart() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetContentStart();
        }
    }

    @Test(timeout=10000)
    public void testSetContentEnd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetContentEnd();
        }
    }

    @Test(timeout=10000)
    public void testSetFieldNameValueSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetFieldNameValueSeparator();
        }
    }

    @Test(timeout=10000)
    public void testSetFieldSeparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetFieldSeparator();
        }
    }

    @Test(timeout=10000)
    public void testSetNullText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetNullText();
        }
    }

    @Test(timeout=10000)
    public void testSetSizeStartText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetSizeStartText();
        }
    }

    @Test(timeout=10000)
    public void testSetSizeEndText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetSizeEndText();
        }
    }

    @Test(timeout=10000)
    public void testSetSummaryObjectStartText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetSummaryObjectStartText();
        }
    }

    @Test(timeout=10000)
    public void testSetSummaryObjectEndText() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ToStringStyleTest object = new org.apache.commons.lang3.builder.ToStringStyleTest();
               object.testSetSummaryObjectEndText();
        }
    }

}