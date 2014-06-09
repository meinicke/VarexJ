//
//Copyright (C) 2007 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.
//
//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.
//
//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.test.java.io;

import gov.nasa.jpf.util.FileUtils;
import gov.nasa.jpf.util.test.TestJPF;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author proger
 */
public class FileTest extends TestJPF {

  public FileTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    // Creating sandbox for java.io.File testing
    File subdirs = new File("fileSandbox/parent/child");
    if (!subdirs.mkdirs())
      throw new RuntimeException("Unable to create sandbox directories");
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    if (!FileUtils.removeRecursively(new File("fileSandbox")))
      throw new RuntimeException("Unable to remove sandbox directories");
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testGetParentFile() {
    if (verifyNoPropertyViolation()) {
      File file = new File("fileSandbox/parent");
      File expectedParent = new File("fileSandbox");
      File resultParent = file.getParentFile();
      
      assert expectedParent.equals(resultParent) == true;
    }
  }

  @Test
  public void testGetCanonical() throws IOException {
    if (verifyNoPropertyViolation()) {
      File file = new File("fileSandbox/../fileSandbox/../fileSandbox");
      File root = new File(".");

      File expectedCanonical = new File(root, "fileSandbox").getCanonicalFile();
      File resultCanonical = file.getCanonicalFile();
      assert expectedCanonical.equals(resultCanonical) == true;

      String expectedCanonicalName = expectedCanonical.getCanonicalPath();
      String resultCanonicalName = resultCanonical.getCanonicalPath();
      assert expectedCanonicalName.equals(resultCanonicalName) == true;      
    }
  }

  @Test
  public void testEquals() {
    if (verifyNoPropertyViolation()) {
      File file = new File("fileSandbox");
      File sameFile = new File("fileSandbox");
      File otherFile = new File("fileSandbox/parent");

      assert file.equals(file) == true;
      assert file.equals(sameFile) == true;
      assert file.equals(otherFile) == false;
      assert file.equals(null) == false;
      assert file.equals(new Object()) == false;
    }
  }
  
}
