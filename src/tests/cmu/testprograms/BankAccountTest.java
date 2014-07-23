package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class BankAccountTest extends TestJPF {
//	private static String file = "C:\\Users\\Loaner\\workspace\\BankAccount-FH-JML_new\\BAmodel.dimacs";
	private static String file = "BAmodel.dimacs";
	
	@Test
	public void runBankAccount() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar", "+featuremodel=" + file)) {
			BankAccount.Main.main(null);
		}
	}

	@Test
	public void runBankAccountDouble() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar", "+featuremodel=" + file)) {
			BankAccountDouble.Main.main(null);
		}
	}

	@Test
	public void runBankAccountLong() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar", "+featuremodel=" + file)) {
			BankAccountLong.Main.main(null);
		}
	}

	@Test
	public void runBankAccountFloat() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar", "+featuremodel=" + file)) {
			BankAccountFloat.Main.main(null);
		}
	}
	
	@Test
	public void fmTest() {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch", "+classpath=lib\\BankAccount.jar", "+featuremodel=" + file)) {
			new Account();
		}
	}
	
	class Account {
		public Account() {
			if (FM.FeatureModel.transaction && !FM.FeatureModel.transaction) {
				throw new RuntimeException("Should be unreachable1");
			} else {
				System.out.println("Reachable1");
			}
			
			if (FM.FeatureModel.transactionlog && !FM.FeatureModel.transaction) {
				System.out.println(FM.FeatureModel.valid());
				throw new RuntimeException("Should be unreachable2");
			} else {
				System.out.println("Reachable2");
			}
			
			if (!FM.FeatureModel.bankaccount) {
				System.out.println("Unreachable");
				throw new RuntimeException("Should be unreachable3");
			} else {
				System.out.println("Reachable3");
			}
		}
	}
}
