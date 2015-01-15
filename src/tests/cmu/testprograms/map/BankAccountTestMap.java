package cmu.testprograms.map;

import cmu.conditional.MapChoice;
import cmu.testprograms.BankAccountTest;

/**
 * Configuration of the {@link BankAccountTest} with {@link MapChoice}.
 * @author Meinicke
 *
 */
public class BankAccountTestMap extends BankAccountTest {

	@Override
	protected String getChoiceFactory() {
		return MapChoice.class.getSimpleName();
	}

}
