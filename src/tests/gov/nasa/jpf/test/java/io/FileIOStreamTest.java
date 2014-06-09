package gov.nasa.jpf.test.java.io;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.util.Arrays;

public class FileIOStreamTest extends TestJPF {

    @Test
    public void testRead() throws Exception{
        //Verify the methods read and write used by the FileChannel of a FileInput/OutputStream
        if (verifyNoPropertyViolation()) {
            File testFile   = new File("_my_test_fileFOSFC_W_FISFC_R.txt");
            byte[] testData = {42, 42, 42};

            //Preparation of the test file with FileOutputStream
            FileOutputStream fos  = new FileOutputStream(testFile);
            FileChannel fos_fc    = fos.getChannel();
            ByteBuffer buf_write  = ByteBuffer.wrap(testData);

            fos_fc.write(buf_write);
            fos.close();

            //Now we read what is in the file
            FileInputStream fis   = new FileInputStream(testFile);
            FileChannel fis_fc    = fis.getChannel();
            ByteBuffer buf_read   = ByteBuffer.allocate(testData.length);
            fis_fc.read(buf_read);
            fis.close();
            
            assert Arrays.toString(testData).equals(Arrays.toString(buf_read.array())) : "Wrong read data";

            deleteTestFile(testFile);
        }
    }

    public void deleteTestFile(File fileToClose) {
        if (fileToClose.exists()) {
            fileToClose.delete();
        }   
    }
}
