package cmu.jpf;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

/**
 * @author: chupanw
 */
public class FileTest extends TestJPF{
    @Conditional
    static boolean A = true;

    @Test
    @Ignore // not working
    public void testIsDirectory() {
        if (verifyNoPropertyViolation("+search.class=.search.RandomSearch")) {
            File file;
            if (A) {
                file = new File("jpf.properties");
            }
            else {
                file = new File("README.md");
            }
            // Expect two false
            System.out.println(file.isDirectory());
        }
    }
}

