package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.PrevaylerTest;

public class PrevaylerMapTest extends PrevaylerTest {
	
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
}
