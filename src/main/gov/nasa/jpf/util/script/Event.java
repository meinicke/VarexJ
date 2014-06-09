//
// Copyright  (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
//  (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
//  (NOSA), version 1.3.  The NOSA has been approved by the Open Source
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


import java.util.ArrayList;
import java.util.List;

public class Event extends ScriptElement {

  public static final String NONE = "NONE";

  protected String id;
  protected String[] arguments;


  public Event(ScriptElement parent, String id, String[] args, int line) {
    super(parent, line);
    this.id = id;

    if ((args != null) && (args.length > 0)){
      arguments = args.clone();
    }
  }

  public boolean isNone() {
    return (NONE.equals(id));
  }

  public static boolean isNone (String id) {
    return (NONE.equals(id));
  }

  public String getId() {
    return id;
  }

  public int getLine() {
    return line;
  }

  public String toString() {
    if (arguments == null) {
      return id;
    } else {
      StringBuilder sb = new StringBuilder(id);

      sb.append('(');
      for (int i=0; i<arguments.length; i++) {
        if (i > 0) {
          sb.append(',');
        }
        sb.append(arguments[i]);
      }
      sb.append(')');

      return sb.toString();
    }
  }

  public String[] getArguments() {
    return arguments;
  }

  public void setArguments (String[] args) {
    arguments = args;
  }

  public void process (ElementProcessor p) {
    p.process(this);
  }

  String[] expandArgument (String a) {
    ArrayList<String> list = new ArrayList<String>();

    StringExpander ex = new StringExpander(a);
    List<String> l = ex.expand();
    list.addAll(l);

    return list.toArray(new String[list.size()]);
  }

  /**
   * this is an interesting little exercise since we have to cover all
   * combinations of parameter values, which would normally be a simple set
   * of nested loops, only that the number of parameters is a variable itself
   * (I'm notoriously bad at this)
   */
  public List<Event> expand () {
    StringExpander ex = new StringExpander(id);
    List<String> ids = ex.expand();
    ArrayList<Event> list = new ArrayList<Event>();

    if (arguments != null) {
      String[] a = new String[arguments.length];
      String[][] args = new String[arguments.length][];
      int[] argIdx = new int[args.length];

      for (int i=0; i<args.length; i++) {
        args[i] = expandArgument(arguments[i]);
      }

      int n = args.length-1;

      for (String id : ids) {
        int i;
        for (i=0; i<=n; i++) { // reset arg indices
          argIdx[i] = 0;
        }

        for (i=n; ;) {
          if (argIdx[i] >= args[i].length){ // all choices at this level exhausted
            // increment next lower level(s), reset level(s) above
            int l;
            for (l=i-1; l >= 0; l--) {
              argIdx[l]++;
              argIdx[l+1] = 0;
              if (argIdx[l] < args[l].length) {
                break;
              }
            }
            if (l < 0) {
              break; // done, do next id
            } else {
              i = n; // restart from top level
            }

          } else { // got a new combination
            for (int k=0; k<args.length; k++) {
              a[k] = args[k][argIdx[k]];
            }
            Event ee = new Event(parent, id, a, line);
            list.add(ee);
            argIdx[i]++;
          }
        }
      }

    } else { // no parameter variation, but we still might have expanded ids
      if (ids.size() == 1) {
        list.add(this);
      } else {
        for (String id : ids) {
          list.add( new Event(parent, id, arguments, line));
        }
      }
    }

    return list;
  }

  public Object[] getConcreteArguments () {
    if (arguments == null) {
      return null;
    }
    if (arguments.length == 0) {
      return new Object[0];
    }

    Object[] a = new Object[arguments.length];
    for (int i=0; i<arguments.length; i++) {
      a[i] = getConcreteArgument(arguments[i]);
    }

    return a;
  }

  Object getConcreteArgument (String s) {
    char c = s.charAt(0);

    if (c == '"' || c == '\'') { // String literal
      return s.substring(1,s.length()-1);

    } else if (Character.isDigit(c)) { // ints and doubbles
      if (s.indexOf('.') >=0) {
        return Double.parseDouble(s);
      } else {
        return Integer.parseInt(s);
      }
      
    } else if (s.equals("true")) { // boolean
      return Boolean.TRUE;
    } else if (s.equals("false")) {
      return Boolean.FALSE;
      
    } else if (c == '@'){ // variable
      return s;
      
    } else { // not supported
      throw new IllegalArgumentException("unsupported event argument type of value=" + s);
    }
  }

  /**
   * variations over boolean lists are quite easy to produce :)
   */
  public static Object[][] getBooleanArgVariations (int nArgs) {
    int n = 1<<nArgs;
    Object[][] args = new Object[n][];

    for (int i=0; i<n; i++) {
      args[i] = new Boolean[nArgs];
      for (int j=0; j<nArgs; j++) {
        args[i][j] = ((i & (1<<j)) != 0) ? Boolean.TRUE : Boolean.FALSE;
      }
    }

    return args;
  }

}
