//
// Copyright (C) 2012 United States Government as represented by the
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

package gov.nasa.jpf.test.mc.basic;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Verify;

/**
 * unit test for OVHeap
 */
public class OVHeapTest extends TestJPF {
  
  static int getReferenceValue (Object o) {
    int h = System.identityHashCode(o);
    return h ^ 0xABCD;  // revert the ABCD hash component
  }

  static void checkRef (String msg, String key, int ref) {
    System.out.printf("%s ,object: %s, ref: %d", msg, key, ref);
    
    int v = Verify.getValue(key);
    if (v == Verify.NO_VALUE) {
      Verify.putValue(key, ref);
      System.out.println(" new");
    } else {
      if (v == ref) {
        System.out.println(" seen");
      } else {
        fail("different reference values, had:" + v + ", new:" + ref);
      }
    }
  }
  
  static class X {
    String id;
    
    X (String id){
      this.id = id;
    }
  }
  
  static class Y extends X {
    Y (String id){
      super(id);
    }
  }
  
  X allocX (String id) {
    return new X(id);
  }
    
  @Test
  public void testSGOIDs() {
    if (verifyNoPropertyViolation("+vm.heap.class=.vm.OVHeap")) {
      Thread t = new Thread() {
        public void run() {
          Class<?> cls = X.class;
          checkRef("from T ", "X.class", getReferenceValue(cls));
          
          X x1 = new X("t-x1");
          checkRef("from T ", x1.id, getReferenceValue(x1));
          
          Thread.yield(); // CG #3
          
          Y y1 = new Y("t-y1");
          checkRef("from T ", y1.id, getReferenceValue(y1));
        }
      };
      
      t.start();  // CG #1
      
      Class<?> clsY = Y.class;
      checkRef("from M ", "Y.class", getReferenceValue(clsY));
      
      Class<?> clsX = X.class;
      checkRef("from M ", "X.class", getReferenceValue(clsX));
      
      int n = Verify.getInt(1, 3); // CG #2
      System.out.println("-- M next X[] arraysize = " + n);
      X[] xs = new X[n];
      for (int i=0; i<xs.length; i++) {
        xs[i] = new X("xs-" + i);
        checkRef("from M ", xs[i].id, getReferenceValue(xs[i]));
      }
      
      Y y1 = new Y("m-y1");
      checkRef("from M ", y1.id, getReferenceValue(y1));
      
      X x1 = new Y("m-x1");
      checkRef("from M ", x1.id, getReferenceValue(x1));
    }
  }
}
