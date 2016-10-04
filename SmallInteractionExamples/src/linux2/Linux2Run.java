package linux2;

import gov.nasa.jpf.JPF;

public class Linux2Run {

	
	public static void main(String[] _) {
		String path = "C:/Users/Jens Meinicke/workspaceVarexJ/SmallInteractionExamples/";
		
		String[] args = {
				"+classpath=" + path + "bin",
				"+search.class=.search.RandomSearch",
				 "+interaction=composedContext",
				// "+featuremodel=linux2.dimacs",
				// "+choice=MapChoice",
//				"+invocation",
				"linux2.SystemMemory"
		};
		
		JPF.main(args);
	}
}
