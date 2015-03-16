package cmu.defect4j.math3.ml.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultiKMeansPlusPlusClustererTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void dimension2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClustererTest object = new org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClustererTest();
               object.dimension2();
        }
    }

}