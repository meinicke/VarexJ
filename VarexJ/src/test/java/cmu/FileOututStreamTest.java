package cmu;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

/**
 * 
 * @author Jens Meinicke
 *
 */
public class FileOututStreamTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{"+search.class=.search.RandomSearch"};

	@Conditional
	static boolean A = true;
	

	@Test
	public void file() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String name = "A";
			if (A) {
				name = "B";
			}
			
			File file = new File(name);
			
			
			new FileOutputStream(file);// at that point we would need to create 2 FOS
			
		}
	}
}
