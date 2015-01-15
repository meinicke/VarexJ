package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import ElevatorSystem.PL_Interface_impl;

public class ElevatorTest extends AExampleTest {
	
	
	@Test
	public void elevatorTest1() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"1", "-1"});
		}
	}
	
	@Test
	public void elevatorTest1_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"1", "4"});
		}
	}
	
	@Test
	public void elevatorTest2() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"2", "-1"});
		}
	}
	
	@Test
	public void elevatorTest2_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"2", "4"});
		}
	}
	
	@Test
	public void elevatorTest3() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"3", "-1"});
		}
	}
	
	@Test
	public void elevatorTest3_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"3", "4"});
		}
	}
	
	@Test
	public void elevatorTest8() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"8", "4"});
		}
	}
	
	@Test
	public void elevatorTest9() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"9", "-1"});
		}
	}
	
	@Test
	public void elevatorTest9_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"9", "4"});
		}
	}
	
	@Test
	public void elevatorTest10_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"10", "4"});
		}
	}
	
	@Test
	public void elevatorTest11_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"11", "4"});
		}
	}
	
	@Test
	public void elevatorTest13() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"13", "-1"});
		}
	}
	
	@Test
	public void elevatorTest13_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"13", "4"});
		}
	}
	
	@Test
	public void elevatorTest14() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"14", "-1"});
		}
	}

	@Test
	public void elevatorTest14_4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"14", "4"});
		}
	}

	@Override
	protected String getClassPath() {
		 return "lib\\Elevator.jar,lib\\aspectjrt.jar";
	}

	@Override
	protected String getModelFile() {
		return "elevator.dimacs";
	}

	
}
