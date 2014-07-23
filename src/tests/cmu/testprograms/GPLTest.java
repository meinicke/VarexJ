package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class GPLTest extends TestJPF {
	
	public static String file = "GPLmodel.dimacs";

	private static final String GPL_JAR = "+classpath=lib\\GPL.jar";
	private static final String RANDOM_SEARCH = "+search.class=.search.RandomSearch";
	private static final String FM = "+featuremodel=" + file;
	
	private static String[] config = {GPL_JAR, RANDOM_SEARCH, FM};
	
	private static final String SEP = System.getProperty("file.separator");
	
	@Ignore 
	@Test//(340.205s) // TODO throws error
	public void random1Test() {
		if (verifyNoPropertyViolation(config)) {
			run("random1-gpl-benchmark.txt");
		}
	}
	
	@Test//(4.186s)
	public void simpleTest() {
		if (verifyNoPropertyViolation(config)) {
				run("Simple.txt");
		}
	}
	
	@Test//(25.445)
	public void network4Test() {
		if (verifyNoPropertyViolation(config)) {
			run("gpl-4-network-benchmark.txt");
		}
	}
	
	private void run(String graph) {
		GPL.Main.main(new String[]{"lib" + SEP + "GPL" + SEP + graph, "v0"});
	}
	
}
