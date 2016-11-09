import java.io.File;

import gov.nasa.jpf.JPF;

public class Run {

	enum example {
		Linux1, Linux2, Linux3, Linux4, Linux5, Example, LocalOverrideTest, Loop
	}
	
	public static void main(String[] _) {
		final String path = new File("").getAbsolutePath();
		final String[] args = {
				"+classpath=" + path + "/bin",
				"+search.class=.search.RandomSearch",
				"+interaction=interaction",
				"linux." + example.LocalOverrideTest
		};
		
		JPF.main(args);
	}
}
