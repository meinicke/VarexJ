package cmu.testprograms;

import org.junit.Test;

public class AJStatsTest extends ATestExample {

 	@Test
	public void ajStats1Test() {
		if (verifyNoPropertyViolation(config)) {
			if (ajs.FeatureSwitches.valid_product()) {
				ajs.PL_Interface_impl.main(new String[]{"1"});
			}
		}
	}

 	@Test
	public void ajStats2Test() {
		if (verifyNoPropertyViolation(config)) {
			if (ajs.FeatureSwitches.valid_product()) {
				ajs.PL_Interface_impl.main(new String[]{"2"});
			}
		}
	}

	@Override
	protected String getClassPath() {
		return "lib\\AJStats.jar";
	}

	@Override
	protected String getModelFile() {
		return "";
	}

	@Override
	protected String getModelFolder() {
		return "";
	}
}
