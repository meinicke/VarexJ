package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.MineTest;


public class MineMapTest extends MineTest {
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
}
