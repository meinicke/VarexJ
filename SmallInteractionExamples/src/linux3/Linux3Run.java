package linux3;

import gov.nasa.jpf.JPF;

public class Linux3Run {

	
	public static void main(String[] _) {
		String path = "C:/Users/Jens Meinicke/workspaceVarexJ/SmallInteractionExamples/";
		
		String[] args = {
				"+classpath=" + path + "bin",
				"+search.class=.search.RandomSearch",
				 "+interaction=composedContext",
				// "+featuremodel=linux2.dimacs",
				// "+choice=MapChoice",
//				"+invocation",
				"linux3.Linux3"
		};
		
		JPF.main(args);
	}
}
