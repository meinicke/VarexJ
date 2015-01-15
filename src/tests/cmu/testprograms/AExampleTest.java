package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * Abstract class for example tests.<br>
 * Override {@link #getChoiceFactory()} to specify the used Choice implementation.
 * 
 * @author Meinicke
 */
public abstract class AExampleTest extends TestJPF {

	protected final String[] config = {"+search.class= .search.RandomSearch", "+classpath=" + getClassPath(), "+featuremodel=" + getModelFile(), "+choice=" + getChoiceFactory()};
	
	protected String getChoiceFactory() {
		return "TreeChoice";
	}

	protected abstract String getClassPath();

	protected abstract String getModelFile();
	
}
