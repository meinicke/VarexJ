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

import gov.nasa.jpf.util.test.TestJPF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

/**
 * raw test for Writers, Readers, FileOutputStream and FileInputStream
 */
public class FileIOTest extends TestJPF {

  public static final String fname = "_test_";

  @Test
  public void testRoundtrip() throws IOException, FileNotFoundException {
    if (verifyNoPropertyViolation()) {
      Random r = new Random(42);
      File file = new File(fname);
      String[] lines = {"one", "two", "three", "four", "five"};

      //--- write part
      System.out.println("##---- writing: " + file.getName());
      FileOutputStream os = new FileOutputStream(file);
      OutputStreamWriter ow = new OutputStreamWriter(os);
      PrintWriter pw = new PrintWriter(ow);
      int a, b;

      for (int i = 0; i < lines.length; i++) {
        pw.println(lines[i]);
        if (i == 2) {
          // add a CG here
          a = r.nextInt(1);
          System.out.println("## write got here: " + a);
        }
      }

      pw.close();
      os.close(); // without this, Windows/Cygwin doesn't delete the file

      System.out.println("##---- checking file system attributes");

      assert file.exists() : "File.exits() failed on " + fname;

      assert file.isFile() : "File.isFile() failed on " + fname;

      assert !file.isDirectory() : "!File.isDirectory() failed on " + fname;

      assert isInCurrentDirList(fname) : "dir list test failed on " + fname;


      //--- read part
      System.out.println("##---- reading: " + file.getName());
      ArrayList<String> contents = new ArrayList<String>();
      String line;
      FileInputStream is = new FileInputStream(file);
      InputStreamReader ir = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(ir);

      for (int i = 0; (line = br.readLine()) != null; i++) {
        if (i == 2) {
          b = r.nextInt(1);
          System.out.println("## read got here: " + b);
        }
        contents.add(line);
      }

      br.close();
      is.close(); // without this, Windows/Cygwin doesn't delete the file

      //--- check part
      System.out.println("##---- comparing");
      assert lines.length == contents.size() : "file length differs: " + lines.length + " / " + contents.size();

      for (int i = 0; i < lines.length; i++) {
        assert lines[i].equals(contents.get(i)) : "line " + i + " differs, expected: \"" + lines[i] + "\", got: \"" + contents.get(i) + "\"";
      }


      if (file.delete()) {
        assert !file.exists() : "File.delete() failed (supposedly deleted but file exists) on " + fname;
      } else {
        assert false : "File.delete() failed to delete file (can happen on Windows/Cygwin)";
      }

      System.out.println("##---- done");
    }
  }

  private boolean isInCurrentDirList(String fn) {
    for (String s : new File(".").list()) {
      if (fn.equals(s)) {
        return true;
      }
    }

    return false;
  }
}
