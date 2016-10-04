package linux1;

import gov.nasa.jpf.JPF;

public class Linux1Run {

	
	public static void main(String[] _) {
		String path = "C:/Users/Jens Meinicke/workspaceVarexJ/SmallInteractionExamples/";
		
		String[] args = {
				"+classpath=" + path + "bin",
				"+search.class=.search.RandomSearch",
				"+interaction=interaction",
				// "+choice=MapChoice",
//				"+invocation",
				"linux1.LinuxArray"
		};
		
		JPF.main(args);
	}
}
