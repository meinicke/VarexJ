package cmu.defect4j.math3.ml.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class KMeansPlusPlusClustererTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testPerformClusterAnalysisDegenerate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest object = new org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest();
               object.setUp();
               object.testPerformClusterAnalysisDegenerate();
        }
    }

    @Test(timeout=1000000)
    public void testCertainSpace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest object = new org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest();
               object.setUp();
               object.testCertainSpace();
        }
    }

    @Test(timeout=1000000)
    public void testSmallDistances() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest object = new org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest();
               object.setUp();
               object.testSmallDistances();
        }
    }

    @Test(timeout=1000000)
    public void testPerformClusterAnalysisToManyClusters() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest object = new org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest();
               object.setUp();
               object.testPerformClusterAnalysisToManyClusters();
        }
    }

}