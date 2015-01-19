package cmu.testprograms;

import org.junit.Test;

public class GPLTest extends ATestExample {
	
	private static final String SEP = System.getProperty("file.separator");
	
	@Test
	public void random1Test() {
		if (verifyNoPropertyViolation(config)) {
			run("random1-gpl-benchmark.txt");
		}
	}
	
	@Test
	public void simpleTest() {
		if (verifyNoPropertyViolation(config)) {
				run("Simple.txt");
		}
	}
	
	@Test
	public void network4Test() {
		if (verifyNoPropertyViolation(config)) {
			run("gpl-4-network-benchmark.txt");
		}
	}
	
	private void run(String graph) {
		GPL.Main.main(new String[]{"lib" + SEP + "GPL" + SEP + graph, "v0"});
	}

	@Override
	protected String getClassPath() {
		return "lib\\GPL.jar";
	}

	@Override
	protected String getModelFile() {
		return "GPLmodel.dimacs";
	}
	
}
