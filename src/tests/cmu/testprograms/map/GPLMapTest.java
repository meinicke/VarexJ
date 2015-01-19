package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.GPLTest;

public class GPLMapTest extends GPLTest {
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
	
}
