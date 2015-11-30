package cmu.jpf;

import java.io.File;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

/**
 * @author: chupanw
 */
public class FileTest extends TestJPF{
    @Conditional
    static boolean A = true;

    @Test
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
            assertFalse(file.isDirectory());
        }
    }
}

