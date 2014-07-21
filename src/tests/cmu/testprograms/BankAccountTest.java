package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class BankAccountTest extends TestJPF {

	@Test
	public void runBankAccount() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar")) {
			BankAccount.Main.main(null);
		}
	}
	
	@Test
	public void runBankAccountDouble() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar")) {
			BankAccountDouble.Main.main(null);
		}
	}
	
	@Test
	public void runBankAccountLong() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar")) {
			BankAccountLong.Main.main(null);
		}
	}
	
	@Test
	public void runBankAccountFloat() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar")) {
			BankAccountFloat.Main.main(null);
		}
	}
}
