package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import ElevatorSystem.PL_Interface_impl;

public class ElevatorTest extends TestJPF {
	
	private static final String FM = "+featuremodel=elevator.dimacs";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\Elevator.jar", FM};

	@Test
	public void emailTest() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"1"});
		}
	}
	
	@Test
	public void emailTest3() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"3"});
		}
	}
	
	@Test
	public void emailTest13() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"13"});
		}
	}
	
	@Test
	public void emailTest14() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"14"});
		}
	}

}
