package gov.nasa.jpf.test.java.net;

import java.io.File;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * This is used to hide the package "classloader_specific_tests" from JPF 
 * which is need to test costum class loaders
 * 
 * @author Nastaran Shafiei
 */
public class LoadUtility extends TestJPF{

  protected String user_dir = System.getProperty("user.dir");
  protected String pkg = "classloader_specific_tests";

  protected String originalPath = user_dir + "/build/tests/" + pkg;
  protected String tempPath = user_dir + "/build/" + pkg;

  protected String jarUrl = "jar:file:" + user_dir + "/build/" + pkg + ".jar!/";
  protected String dirUrl = "file:" + user_dir + "/build";

  /**
   * move the package, to avoid systemClassLoader loading its classes
   */
  protected void movePkgOut() {
    if(!TestJPF.isJPFRun()) {
      movePkg(originalPath, tempPath);
    }
  }

  /**
   * move the package back to its original place
   */
  protected void movePkgBack() {
    if(!TestJPF.isJPFRun()) {
      movePkg(tempPath, originalPath);
    }
  }

  protected void movePkg(String from, String to) {
    File dstFile = new File(to);
    if(!dstFile.exists()) {
      dstFile = new File(from);
      assertTrue(dstFile.renameTo(new File(to)));
    } else {
      File srcFile = new File(from);
      if(srcFile.exists()) {
        // empty the directory
        for(String name: srcFile.list()) {
          assertTrue((new File(from + "/" + name)).delete());
        }
        // remove the directory
        assertTrue(srcFile.delete());
      }
    }
  }
}
