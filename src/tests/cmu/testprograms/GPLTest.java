package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class GPLTest extends TestJPF {

	private static final String GPL_JAR = "+classpath=lib\\GPL.jar";
	private static final String RANDOM_SEARCH = "+search.class=.search.RandomSearch";
	private static final String SEP = System.getProperty("file.separator");
	
	@Ignore @Test//(340.205s)
	public void random1Test() {
		if (verifyNoPropertyViolation(RANDOM_SEARCH, GPL_JAR)) {
			run("random1-gpl-benchmark.txt");
		}
	}
	
	@Test//(5.397s)
	public void simpleTest() {
		if (verifyNoPropertyViolation(RANDOM_SEARCH, GPL_JAR)) {
				run("Simple.txt");
		}
	}
	
	@Test//(88.229)
	public void network4Test() {
		if (verifyNoPropertyViolation(RANDOM_SEARCH, GPL_JAR)) {
			run("gpl-4-network-benchmark.txt");
		}
	}
	
	private void run(String graph) {
		GPL.Main.main(new String[]{"lib" + SEP + "GPL" + SEP + graph, "v0"});
	}
}
