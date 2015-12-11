package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.AJStatsTest;


public class AJStatsMapTest extends AJStatsTest {

	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
	
}
