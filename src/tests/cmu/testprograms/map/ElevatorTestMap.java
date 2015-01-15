package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.ElevatorTest;

public class ElevatorTestMap extends ElevatorTest {
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
	
}
