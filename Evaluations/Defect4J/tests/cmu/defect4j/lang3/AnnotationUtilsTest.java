package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AnnotationUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testEquivalence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testEquivalence();
        }
    }

    @Test(timeout=120000)
    public void testSameInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testSameInstance();
        }
    }

    @Test(timeout=120000)
    public void testNonEquivalentAnnotationsOfSameType() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testNonEquivalentAnnotationsOfSameType();
        }
    }

    @Test(timeout=120000)
    public void testAnnotationsOfDifferingTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testAnnotationsOfDifferingTypes();
        }
    }

    @Test(timeout=120000)
    public void testOneArgNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testOneArgNull();
        }
    }

    @Test(timeout=120000)
    public void testBothArgsNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testBothArgsNull();
        }
    }

    @Test(timeout=120000)
    public void testIsValidAnnotationMemberType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testIsValidAnnotationMemberType();
        }
    }

    @Test(timeout=120000)
    public void testGeneratedAnnotationEquivalentToRealAnnotation() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testGeneratedAnnotationEquivalentToRealAnnotation();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {// FIXME
               org.apache.commons.lang3.AnnotationUtilsTest object = new org.apache.commons.lang3.AnnotationUtilsTest();
               object.setup();
               object.testToString();
        }
    }

}