package cmu.defect4j.lang3.text.translate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NumericEntityUnescaperTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testUnfinishedEntity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest object = new org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest();
               object.testUnfinishedEntity();
        }
    }

    @Test(timeout=120000)
    public void testSupplementaryUnescaping() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest object = new org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest();
               object.testSupplementaryUnescaping();
        }
    }

    @Test(timeout=120000)
    public void testOutOfBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest object = new org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest();
               object.testOutOfBounds();
        }
    }

}