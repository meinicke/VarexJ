package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.EmailTest;

public class EmailTestMap extends EmailTest {
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
	
}
