//
// Copyright (C) 2010 United States Government as represented by the
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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.MethodInfo;

import java.util.ArrayList;

import org.junit.Test;

/**
 * test of the VMListener method notifications
 */
public class MethodListenerTest extends TestJPF {

  // avoid loading JPF classes when running under JPF (specify classnames explicitly)
  static String CLSNAME = "gov.nasa.jpf.test.mc.basic.MethodListenerTest";
  static String LISTENER = "+listener=gov.nasa.jpf.test.mc.basic.MethodListenerTest$Listener";

  public static class Listener extends ListenerAdapter {
    String startMthName;

    boolean traceActive = false;
    int level;

    public Listener (Config config){
      startMthName = config.getString("_start");
    }

    String levelPrefix (int lvl){
      String prefix = "";
      for (int i=0; i<lvl; i++){
        prefix += "  ";
      }
      return prefix;
    }

    @Override
    public void searchStarted(Search search) {
      trace.clear();
    }

    @Override
    public void methodEntered (VM vm, ThreadInfo ti, MethodInfo mi){
      assertSame(mi, ThreadInfo.getCurrentThread().getTopFrameMethodInfo());

      if (CLSNAME.equals(mi.getClassName())){
        String mthName = mi.getName();
        if (mthName.equals(startMthName)) {
          traceActive = true;
          level=0;
        }

        if (traceActive){
          String prefix = levelPrefix(level);
          trace.add(prefix + "> " + mthName);

          System.out.println(prefix + "> " + mthName);

          level++;
        }
      }
    }

    @Override
    public void methodExited (VM vm, ThreadInfo ti, MethodInfo mi){
      if (traceActive){
        assertSame(mi, ThreadInfo.getCurrentThread().getTopFrameMethodInfo());
        
        if (CLSNAME.equals(mi.getClassName())){
          level--;

          String prefix = levelPrefix(level);
          trace.add(prefix + "< " + mi.getName());

          System.out.println(prefix + "< " + mi.getName());

          if (level == 0){
            traceActive = false;
          }
        }

      }
    }

    @Override
    public void exceptionThrown (VM vm, ThreadInfo ti, ElementInfo ei){
      if (traceActive){
        String xCls = ei.getClassInfo().getName();
        trace.add("X " + xCls);
        System.out.println("X " + xCls);
      }
    }
  }

  static ArrayList<String> trace = new ArrayList<String>();

  static boolean traceEquals(String... expected){
    if (expected.length != trace.size()){
      System.err.println("wrong trace size, found: " + trace.size() + ", expected: " + expected.length);
      return false;
    }

    int i = 0;
    for (String s : trace){
      if (!s.equals(expected[i])){
        System.err.println("wrong trace entry, found: " + s + ", expected: " + expected[i]);
        return false;
      }
      i++;
    }
    return true;
  }

  //--- internal test stuff
  void foo(){
    bar();
  }

  int bar(){
    return 24;
  }

  void baz (){
    blowUp();
  }

  void blowUp() {
    throw new RuntimeException("I blow up");
  }
  
  void time() {
    System.currentTimeMillis();
  }

  //--- test methods
  @Test public void testBasicInvocation() {
    if (verifyNoPropertyViolation(LISTENER, "+_start=testBasicInvocation")){
      foo();
      
    } else {
      assertTrue(traceEquals(
              "> testBasicInvocation",
              "  > foo",
              "    > bar",
              "    < bar",
              "  < foo",
              "< testBasicInvocation"));
    }
  }

  @Test public void testException() {
    if (verifyNoPropertyViolation(LISTENER, "+_start=testException")){
      try {
        baz();

      } catch (RuntimeException x){
      }

    } else {
      assertTrue(traceEquals(
              "> testException",
              "  > baz",
              "    > blowUp",
              "X java.lang.RuntimeException",
              "    < blowUp",
              "  < baz",
              "< testException"));
    }
  }
}
