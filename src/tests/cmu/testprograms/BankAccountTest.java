package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class BankAccountTest extends TestJPF {

	@Test
	public void runBankAccount() {
		if (verifyNoPropertyViolation("+classpath=lib\\BankAccount.jar")) {
			BankAccount.Main.main(null);
		}
	}
}
