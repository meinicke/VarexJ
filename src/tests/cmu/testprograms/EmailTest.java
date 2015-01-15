package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import EmailSystem.Scenario;
import EmailSystem.Test_Actions;

public class EmailTest extends ATestExample {
	
	
	@Test
	public void emailTest() {
		if (verifyNoPropertyViolation(config)) {
			Scenario.test();
		}
	}

	
	@Test
	public void emailTest2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			Test_Actions.setup();
			for (int action = 0; action <= 13; action ++) {
				switch (action) {
					case 0:	Test_Actions.bobKeyAdd(); break;
					case 1: Test_Actions.bobKeyAddChuck(); break;
					case 2: Test_Actions.bobKeyChange(); break;
					case 3: Test_Actions.bobSetAddressBook(); break;
					case 4: Test_Actions.chuckKeyAdd(); break;
					case 5: Test_Actions.rjhDeletePrivateKey(); break;
					case 6: Test_Actions.rjhEnableForwarding(); break;
					case 7: Test_Actions.rjhKeyAdd(); break;
					case 8: Test_Actions.rjhKeyAddChuck(); break;
					case 9: Test_Actions.rjhKeyChange(); break;
					case 10: Test_Actions.rjhSetAutoRespond(); break;
					case 11: Test_Actions.bobToAlias(); break;
					case 12: Test_Actions.bobToRjh(); break;
					case 13: Test_Actions.rjhToBob(); break;
				}
			}
		}
	}

	@Override
	protected String getClassPath() {
		return "lib\\Email.jar";
	}

	@Override
	protected String getModelFile() {
		return "email.dimacs";
	}
}
