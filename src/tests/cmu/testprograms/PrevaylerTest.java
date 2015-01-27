package cmu.testprograms;

import org.junit.Test;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.demos.demo1.NumberKeeper;
import org.prevayler.demos.demo1.PrimeCalculator;

public class PrevaylerTest extends ATestExample {
	
	@Test
	public void runNumberKeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			Prevayler prevayler = PrevaylerFactory.createPrevayler(new NumberKeeper(), "NumberKeeperTree");
			new PrimeCalculator(prevayler).start();
		}
	}
	

	@Override
	protected String getClassPath() {
		return "lib\\Prevayler.jar;lib\\prevayler-factory-2.5.jar;lib\\prevayler-core-2.5.jar";
	}
	@Override
	protected String getModelFile() {
		return "";
	}

}
