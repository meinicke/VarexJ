package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StrSubstitutorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testReplaceAdjacentAtStart() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceAdjacentAtStart();
        }
    }

    @Test(timeout=10000)
    public void testReplaceAdjacentAtEnd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceAdjacentAtEnd();
        }
    }

    @Test(timeout=10000)
    public void testReplaceEscaping() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceEscaping();
        }
    }

    @Test(timeout=10000)
    public void testReplaceSoloEscaping() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceSoloEscaping();
        }
    }

    @Test(timeout=10000)
    public void testReplaceComplexEscaping() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceComplexEscaping();
        }
    }

    @Test(timeout=10000)
    public void testReplaceEmptyKeys() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceEmptyKeys();
        }
    }

    @Test(timeout=10000)
    public void testReplaceChangedMap() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceChangedMap();
        }
    }

    @Test(timeout=10000)
    public void testReplaceUnknownKey() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceUnknownKey();
        }
    }

    @Test(timeout=10000)
    public void testReplaceRecursive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceRecursive();
        }
    }

    @Test(timeout=10000)
    public void testReplaceSolo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceSolo();
        }
    }

    @Test(timeout=10000)
    public void testReplaceNoVariables() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceNoVariables();
        }
    }

    @Test(timeout=10000)
    public void testReplaceNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceNull();
        }
    }

    @Test(timeout=10000)
    public void testReplaceEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceEmpty();
        }
    }

    @Test(timeout=10000)
    public void testReplaceSimple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceSimple();
        }
    }

    @Test(timeout=10000)
    public void testGetSetEscape() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testGetSetEscape();
        }
    }

    @Test(timeout=10000)
    public void testGetSetPrefix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testGetSetPrefix();
        }
    }

    @Test(timeout=10000)
    public void testGetSetSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testGetSetSuffix();
        }
    }

    @Test(timeout=10000)
    public void testStaticReplace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testStaticReplace();
        }
    }

    @Test(timeout=10000)
    public void testStaticReplacePrefixSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testStaticReplacePrefixSuffix();
        }
    }

    @Test(timeout=10000)
    public void testStaticReplaceSystemProperties() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testStaticReplaceSystemProperties();
        }
    }

    @Test(timeout=10000)
    public void testSubstituteDefaultProperties() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testSubstituteDefaultProperties();
        }
    }

    @Test(timeout=10000)
    public void testSamePrefixAndSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testSamePrefixAndSuffix();
        }
    }

    @Test(timeout=10000)
    public void testReplaceNoPrefixNoSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceNoPrefixNoSuffix();
        }
    }

    @Test(timeout=10000)
    public void testReplaceIncompletePrefix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceIncompletePrefix();
        }
    }

    @Test(timeout=10000)
    public void testReplacePrefixNoSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplacePrefixNoSuffix();
        }
    }

    @Test(timeout=10000)
    public void testReplaceNoPrefixSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceNoPrefixSuffix();
        }
    }

    @Test(timeout=10000)
    public void testReplaceToIdentical() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceToIdentical();
        }
    }

    @Test(timeout=10000)
    public void testCyclicReplacement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testCyclicReplacement();
        }
    }

    @Test(timeout=10000)
    public void testReplaceWeirdPattens() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceWeirdPattens();
        }
    }

    @Test(timeout=10000)
    public void testReplacePartialString_noReplace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplacePartialString_noReplace();
        }
    }

    @Test(timeout=10000)
    public void testReplaceInVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceInVariable();
        }
    }

    @Test(timeout=10000)
    public void testReplaceInVariableDisabled() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceInVariableDisabled();
        }
    }

    @Test(timeout=10000)
    public void testReplaceInVariableRecursive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testReplaceInVariableRecursive();
        }
    }

    @Test(timeout=10000)
    public void testResolveVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testResolveVariable();
        }
    }

    @Test(timeout=10000)
    public void testConstructorNoArgs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testConstructorNoArgs();
        }
    }

    @Test(timeout=10000)
    public void testConstructorMapPrefixSuffix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testConstructorMapPrefixSuffix();
        }
    }

    @Test(timeout=10000)
    public void testConstructorMapFull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrSubstitutorTest object = new org.apache.commons.lang3.text.StrSubstitutorTest();
               object.setUp();
               object.testConstructorMapFull();
        }
    }

}