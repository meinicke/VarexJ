package cmu;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class ExampleRunnerTest extends TestJPF {

	/**
	 * Case Study: <b>Bank-Account</b><br>
	 * #Feature: <b>10</b><br>
	 * #Products: <b>144<b>
	 */
	@Test(timeout = 3000)
	public void runBankAccount() {
		// TODO revise (call example directly?)
		Config config = JPF.createConfig(new String[] { "C:\\Users\\Loaner\\workspace\\jpf-core-vai\\src\\tests\\cmu\\BankAccount.jpf" });
		JPF jpf = new JPF(config);
		jpf.run();
	}

}
