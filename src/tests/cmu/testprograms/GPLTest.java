package cmu.testprograms;

import java.io.File;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class GPLTest extends TestJPF {

	final static String SEP = System.getProperty("file.separator");
	
	@Ignore @Test
	public void random1Test() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			run("random1-gpl-benchmark.txt");
		}
	}
	
	@Test
	public void simpleTest() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar,lib\\GPL\\")) {
			run("Simple.txt");
		}
	}
	
	@Test
	public void network4Test() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			run("gpl-4-network-benchmark.txt");
		}
	}
	
	
	
	private void run(String graph) {
		GPL.Main.main(new String[]{"lib" + SEP + "GPL" + SEP + graph, "v0"});
	}
}
