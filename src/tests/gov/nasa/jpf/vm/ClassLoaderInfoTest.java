//
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.SystemClassLoaderInfo;
import gov.nasa.jpf.vm.ThreadInfo;

import org.junit.Test;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * unit test for ClassLoaderInfo
 */
public class ClassLoaderInfoTest extends TestJPF {

  @Test
  public void testSystemClassLoader() {
    //--- Sets up the JPF environment
    String[] args = { "+vm.class=.vm.MultiProcessVM", "+target.1=HelloWorld", "+target.2=HelloWorld" };
    Config config = new Config(args);
    JPF jpf = new JPF(config);
    VM vm = jpf.getVM();
    Heap heap = vm.getHeap();

    vm.initialize(); // this should instantiate two SystemClassLoaders

    ThreadInfo[] threads = vm.getLiveThreads();
    assertTrue( threads.length == 2);

    //--- app 0
    SystemClassLoaderInfo cl0 = threads[0].getSystemClassLoaderInfo();
    assertTrue( cl0 != null);
    assertTrue( cl0.parent == null);

    int cl0ObjRef = cl0.objRef;
    assertTrue( cl0ObjRef != MJIEnv.NULL);
    ElementInfo ei0 = heap.get(cl0ObjRef);
    assertTrue( ei0.getIntField( ClassLoaderInfo.ID_FIELD) == cl0.getId());
    
    //--- app 1
    SystemClassLoaderInfo cl1 = threads[1].getSystemClassLoaderInfo();
    assertTrue( cl1 != null);
    assertTrue( cl0.parent == null);
    
    int cl1ObjRef = cl1.objRef;
    assertTrue( cl1ObjRef != MJIEnv.NULL);
    ElementInfo ei1 = heap.get(cl1ObjRef);
    assertTrue( ei1.getIntField( ClassLoaderInfo.ID_FIELD) == cl1.getId());
    
    //--- compare them
    assertTrue( cl0 != cl1);
    assertTrue( cl0.getId() != cl1.getId());
    assertTrue( cl0.statics != cl1.statics);
    assertTrue( cl0ObjRef != cl1ObjRef);

    //--- compare the loaded classes
    ClassInfo ci0 = cl0.getResolvedClassInfo("java.lang.Class");
    ClassInfo ci1 = cl1.getResolvedClassInfo("java.lang.Class");

    assertTrue( ci0 != ci1);
    assertTrue( ci0.getUniqueId() != ci1.getUniqueId());

    assertTrue( ci0.getName().equals(ci1.getName()));
    assertTrue( ci0.getClassFileUrl().equals(ci1.getClassFileUrl()));
    
    //--- should compare on-demand loaded classes here..
  }
}
