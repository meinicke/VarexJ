package linux4;

import gov.nasa.jpf.JPF;

public class Linux4Run {

	
	public static void main(String[] _) {
		String path = "C:/Users/Jens Meinicke/workspaceVarexJ/SmallInteractionExamples/";
		
		String[] args = {
				"+classpath=" + path + "bin",
				"+search.class=.search.RandomSearch",
				// "+featuremodel=linux2.dimacs",
				// "+choice=MapChoice",
//				"+invocation",
				"linux4.Linux4"
		};
		
		JPF.main(args);
	}
}
