//
// Copyright (C) 2009 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//

package gov.nasa.jpf.test.java.io;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

/**
 * regression test for object streams
 */
public class ObjectStreamTest extends TestJPF {

  static class X implements Serializable {
    String q = "the ultimate question";
    Y a = new Y(-42);

    public String toString() {
      return "X{q=\""+q+"\",a="+a+'}';
    }
  }

  static class Y implements Serializable {
    static final long serialVersionUID = -42;

    boolean z = true;
    byte b = 42;
    char c = '!';
    short s = 42;
    int i;
    long l = 42000;
    float f = 42.0f;
    double d = 4.2e5;

    Y (int answer){
      i = answer;
    }

    public String toString() {
      return "Y{z="+z+",b="+b+",c="+c+",s="+s+",i="+i+",l="+l+",f="+f+",d="+d+ '}';
    }
  }

  @Test
  public void testSimpleReadbackOk () {
    String fname = "tmp.ser";

    if (!isJPFRun()){
      try {
        X x = new X();
        FileOutputStream fos = new FileOutputStream(fname);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(x);
        oos.close();
      } catch (Throwable t){
        fail("serialization failed: " + t);
      }
    }

    if (verifyNoPropertyViolation()){
      try {
        FileInputStream fis = new FileInputStream(fname);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        ois.close();

        System.out.println(o);

        assert o instanceof X : "wrong object type: " + o.getClass().getName();
        X x = (X) o;
        assert x.a.i == -42;
      } catch (Throwable t){
        //t.printStackTrace();
        fail("serialization readback failed: " + t);
      }

      File f = new File(fname);
      f.delete();
    }
  }

}
