package linux5;

import gov.nasa.jpf.JPF;

public class Linux5Run {

	
	public static void main(String[] _) {
		String path = "C:/Users/Jens Meinicke/workspaceVarexJ/SmallInteractionExamples/";
		
		String[] args = {
				"+classpath=" + path + "bin",
				"+search.class=.search.RandomSearch",
				// "+featuremodel=linux2.dimacs",
				// "+choice=MapChoice",
//				"+invocation",
				"linux5.Linux5"
		};
		
		JPF.main(args);
	}
}
