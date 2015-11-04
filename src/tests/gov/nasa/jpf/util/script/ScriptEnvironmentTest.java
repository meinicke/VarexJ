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

package gov.nasa.jpf.util.script;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import gov.nasa.jpf.util.Misc;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;


/**
 * unit test for gov.nasa.jpf.util.script.ScriptEnvironment
 *
 * <2do> tests are very incomplete
 */
public class ScriptEnvironmentTest extends TestJPF {

  static class EventChoice extends ChoiceGeneratorBase<Event> {
    int cur = -1;
    Event e;

    protected EventChoice(String id) {
      super(id);
    }

    EventChoice (String id, Event e){
      super(id);

      this.e = e;
    }

    public void advance() {
      cur++;
    }

    public boolean hasMoreChoices() {
      return (cur<0);
    }

    public Class<Event> getChoiceType() {
      return Event.class;
    }

    public Event getNextChoice() {
      return (cur == 0) ? e : null;
    }

    public int getProcessedNumberOfChoices() {
      return cur+1;
    }

    public int getTotalNumberOfChoices() {
      return 1;
    }

    public void reset() {
      cur = -1;
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(getClass().getName());

      sb.append("[id=\"");
      sb.append(id);
      sb.append("\",");

      if (cur >= 0) {
        sb.append(MARKER);
      }
      sb.append(e.toString());

      sb.append(']');
      return sb.toString();
    }

  }

  static class EventChoiceSet extends EventChoice {
    ArrayList<Event> list = new ArrayList<Event>();

    public EventChoiceSet (String id) {
      super(id);
    }

    public void add (Event e) {
      list.add(e);
    }

    public boolean hasMoreChoices() {
      return (cur<list.size());
    }

    public Event getNextChoice() {
      return (cur >= 0 && cur < list.size()) ? list.get(cur) : null;
    }

    public int getTotalNumberOfChoices() {
      return list.size();
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(getClass().getName());

      sb.append("[id=\"");
      sb.append(id);
      sb.append("\",");

      for (int i=0; i<list.size(); i++) {
        if (i > 0) {
          sb.append(',');
        }
        if (i == cur) {
          sb.append(MARKER);
        }
        sb.append(list.get(i).toString());
      }
      sb.append(']');
      return sb.toString();
    }
  }


  static class EventEnv extends ScriptEnvironment<EventChoice> {

    public EventEnv (String fname) throws FileNotFoundException {
      super(fname);
    }

    public EventEnv(String name, Reader r) {
      super(name,r);
    }

    protected EventChoice createCGFromEvents(String id, List<Event> events) {
      if (events.isEmpty()) {
        return null;
      } else if (events.size() == 1) {
        return new EventChoice( id, events.get(0));
      } else {
        EventChoiceSet cg = new EventChoiceSet(id);
        for (Event e : events) {
          cg.add( e);
        }
        return cg;
      }
    }
  }


  // <2do> - need to add more test conditions than just unexpected exceptions!
  
  @Test
  public void testNoMoveSequence () {
    String s = "SECTION A {\n" +
               "  start, ANY {a1,a2}, REPEAT 2 {r}, end \n" +
               "}\n" +
               "SECTION B {\n" +
               "  foo, bar, baz \n" +
               "}";

    String[][] a = { { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" } };

    try {
      ScriptEnvironment<?> env = new EventEnv("test", new StringReader(s));
      env.parseScript();

      for (String[] sections : a) {
        ChoiceGenerator<?> cg = env.getNext("testNoMove", sections);
        System.out.println(Misc.toString(sections, "[", ",", "]") + " => " + cg);
      }

    } catch (Throwable t){
      // t.printStackTrace();
      assert false : "unexpected exception in testNoMoveSequence";
    }
  }

  @Test
  public void testMoveSequence () {
    String s = "SECTION A {\n" +
               "  start, ANY {a1,a2}, REPEAT 2 {r}, end \n" +
               "}\n" +
               "SECTION B {\n" +
               "  foo, bar, baz \n" +
               "}\n" +
               "SECTION C {\n" +
               "  du, da \n" +
               "}";


    String[][] a = { { "A", "B" },
                     { "A", "B" },
                     { "A", "C" },
                     { "B" } };

    try {
      EventEnv env = new EventEnv("test", new StringReader(s));
      env.parseScript();

      for (String[] sections : a) {
        ChoiceGenerator<?> cg = env.getNext("testMove", sections);
        System.out.println(Misc.toString(sections, "[", ",", "]") + " => " + cg);
      }

    } catch (Throwable t){
      //t.printStackTrace();
      assert false : "unexpected exception in testMoveSequence";
    }
  }


  @Test
  public void testBacktrack () {
    String s = "SECTION A {\n" +
               "  start, ANY {a1,a2}, REPEAT 2 {r}, end \n" +
               "}\n" +
               "SECTION B {\n" +
               "  foo, bar, baz \n" +
               "}";

    String[][] a = { { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" },
                     { "A", "B" } };

    try {
      EventEnv env = new EventEnv("test", new StringReader(s));
      env.parseScript();

      ChoiceGenerator<?> cg = null;
      int i =0;

      cg = env.getNext("testBacktrack-1", a[i]);
      System.out.println(Misc.toString(a[i], "[", ",", "]") + " => " + cg);
      i++;

      cg = env.getNext("testBacktrack-2", a[i]);
      System.out.println(Misc.toString(a[i], "[", ",", "]") + " => " + cg);
      i++;

      ScriptEnvironment.ActiveSnapshot snap = env.getStateExtension();

      cg = env.getNext("testBacktrack-3", a[i]);
      System.out.println(Misc.toString(a[i], "[", ",", "]") + " => " + cg);
      //i++;

      env.restore(snap);
      cg = env.getNext("testBacktrack-4", a[i]);
      System.out.println(Misc.toString(a[i], "[", ",", "]") + " => " + cg);
    } catch (Throwable t){
      //t.printStackTrace();
      assert false : "unexpected exception in testBacktrack";
    }
  }

}
