package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.ZipMeTest;

public class ZipMeMapTest extends ZipMeTest {
	
	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}
	
}
