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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * generic parser for event scripts
 *
 * <2do> this is still awfully hardwired to StringExpander
 */

public class ESParser {

  /**** our keywords ****/
  final public static String K_REPEAT = "REPEAT";
  final public static String K_ANY = "ANY";
  final public static String K_SECTION = "SECTION";

  String file;
  StreamTokenizer scanner;

  boolean done = false;

  EventFactory eventFactory;

  /******************* utilities *****************************************/

  public class Exception extends java.lang.Exception {
    Exception(String details) {
      super("parse error: " + details + ", found: " + scanner);
    }
    Exception(String msg, String param) {
      super(msg + ' ' + param);
    }
  }

  public static class DefaultEventFactory implements EventFactory {
    public Event createEvent (ScriptElement parent, String id, List<String> args, int line) {
      return new Event(parent, id, args.toArray(new String[args.size()]), line);
    }
  }

  public ESParser (String fname, EventFactory eFact) throws Exception {

    eventFactory = eFact != null ? eFact : new DefaultEventFactory();

    try {
      file = fname;
      FileReader r = new FileReader(fname);

      scanner = createScanner(r);
      scanner.nextToken(); // 1 symbol lookahead

    } catch (FileNotFoundException fnfx) {
      throw new Exception("file not found:", fname);
    } catch (IOException iox) {
      throw new Exception("error reading: ", fname);
    }
  }

  public ESParser (String fname) throws Exception {
    this(fname, new DefaultEventFactory());
  }

  public ESParser (String name, Reader r) throws Exception {
    this(name, r, new DefaultEventFactory());
  }

  public ESParser (String name, Reader r, EventFactory eFact) throws Exception {
    eventFactory = eFact;

    try {
      file = name;

      scanner = createScanner(r);
      scanner.nextToken(); // 1 symbol lookahead

    } catch (IOException iox) {
      throw new Exception("error reading: ", name);
    }
  }

  StreamTokenizer createScanner (Reader r) {
    StreamTokenizer s = new StreamTokenizer(r);

    // disable number parsing, since it doesn't work in the context of string expansion
    // and we also would have to preserve the number type (int or double)
    s.ordinaryChars('0','9');
    s.wordChars('0','9');
    //s.wordChars('"', '"');

    // those are used to expand events
    s.wordChars('[','[');
    s.wordChars(']',']');
    s.wordChars('|','|');
    s.wordChars('-','-');
    s.wordChars('<','<');
    s.wordChars('>','>');

    // those can be part of Event IDs
    s.wordChars('_','_');
    s.wordChars('#', '#');
    s.wordChars('*','*');
    s.wordChars('@','@');
    s.wordChars('$','$');
    s.wordChars(':',':');
    s.wordChars('~','~');
    s.wordChars('!', '!');

    s.quoteChar('"');

    s.slashSlashComments(true);
    s.slashStarComments(true);

    s.whitespaceChars(',', ',');
    s.whitespaceChars(';', ';');

    return s;
  }

  void nextToken() throws Exception {
    try {
      if (scanner.nextToken() == StreamTokenizer.TT_EOF) {
        done = true;
      }
    } catch (IOException iox) {
      throw new Exception("could not read input", iox.toString());
    }
  }

  void match (char c) throws Exception {
    if (scanner.ttype == /*(int)*/c) {
      nextToken();
    } else {
      throw new Exception("char '" + c + "' expected");
    }
  }

  boolean isMatch (char c) throws Exception {
    if (scanner.ttype == c) {
      nextToken();
      return true;
    } else {
      return false;
    }
  }

  boolean isMatch (String word) throws Exception {
    if (scanner.ttype == StreamTokenizer.TT_WORD) {
      if (scanner.sval.equals(word)) {
        nextToken();
        return true;
      }
    }

    return false;
  }

  String matchKeyword (String key) throws Exception {
    String s = matchWord();
    if (!s.equals(key)) {
      throw new Exception("expected keyword: " + key);
    }
    return s;
  }

  String matchWord () throws Exception {
    if (scanner.ttype == StreamTokenizer.TT_WORD) {
      String s = scanner.sval;
      nextToken();
      return s;
    } else {
      throw new Exception("id or keyword expected");
    }
  }

  boolean isInt (String s) {
    int c = s.charAt(0);
    return ((c >='0') && (c <= '9'));
  }

  int isIntMatch(int defaultValue) throws Exception {
    if ((scanner.ttype == StreamTokenizer.TT_WORD) && isInt(scanner.sval)) {
      int n = Integer.parseInt(scanner.sval);
      nextToken();
      return n;
    } else {
      return defaultValue;
    }
  }

  int matchIntNumber () throws Exception {
    // Ok, this isn't too effective since our scanner doesn't parse numbers
    if ((scanner.ttype == StreamTokenizer.TT_WORD) && isInt(scanner.sval)) {
      int n = Integer.parseInt(scanner.sval);
      nextToken();
      return n;
    } else {
      throw new Exception("number expected");
    }
  }

  /******************* the recursive descend parser *********************/

  /************************************** grammar ***********************
  script ::= {section | sequence}.
  section ::= 'SECTION' ID {',' ID} '{' {sequence} '}'.
  sequence ::= iteration | selection | event.
  iteration ::= 'REPEAT' [NUM] '{' {sequence} '}'.
  selection ::= 'ANY' '{' {event} '}'.
  event ::= ID ['(' [parameter {',' parameter}] ')'].
  parameter ::= STRING

  all parameters are treated as strings, but string literals preserve the double quotes
  (we need to preserve the token because of argument expansion and numeric type)

  the event ID can contain '#', '.', ':', '@', '$' '/' and '*' chars (e.g. for further
  parsing of targets etc.)


  ***********************************************************************/


  public Script parse() throws Exception {
    Script s = new Script();

    while (!done) {
      if (isMatch(K_SECTION)) {
        section(s);
      } else {
        sequence(s);
      }
    }

    return s;
  }

  protected void section (ScriptElementContainer parent) throws Exception {
    //matchKeyword(K_SECTION);
    ArrayList<String> ids = new ArrayList<String>();

    String id = matchWord();
    ids.add(id);

    while (isMatch(',')) {
      id = matchWord();
      ids.add(id);
    }

    Section sec = new Section(parent, ids, scanner.lineno());
    parent.add(sec);

    match('{');
    while (!done && (scanner.ttype != '}')) {
      sequence(sec);
    }
    match('}');


  }

  protected void sequence (ScriptElementContainer parent) throws Exception {
    if (isMatch(K_REPEAT)) {
      repetition(parent);
    } else if (isMatch(K_ANY)) {
        alternative(parent);
    } else {
      if (scanner.ttype == StreamTokenizer.TT_WORD) {
        event(parent);
      } else {
        if (scanner.ttype == StreamTokenizer.TT_EOF){
          done = true; // empty sequence
        } else {
          throw new Exception("repetition, alternative or event expected");
        }
      }
    }
  }


  protected void repetition (ScriptElementContainer parent) throws Exception {
    //matchKeyword(K_REPEAT);
    int n = isIntMatch(-1); // default is unbounded

    Repetition r = new Repetition(parent, n, scanner.lineno());
    parent.add(r);

    match('{');
    while (!done && (scanner.ttype != '}')) {
      sequence(r);
    }
    match('}');
  }


  protected void alternative (ScriptElementContainer parent) throws Exception {
    //matchKeyword(K_ANY);

    Alternative a = new Alternative(parent, scanner.lineno());
    parent.add(a);

    match('{');
    while (!done && (scanner.ttype != '}')) {
      event(a);
    }
    match('}');
  }


  protected void event (ScriptElementContainer parent) throws Exception {
    String id = matchWord();

    ArrayList<String> args = new ArrayList<String>();
    if (isMatch('(')) {
      while (!isMatch(')')) {

        if (scanner.ttype == scanner.TT_WORD) {
          args.add(scanner.sval);
        } else if (scanner.ttype == '"'){ // string literal
          args.add( "\"" + scanner.sval + '"');
        }

        nextToken();
      }
    }

    Event e = eventFactory.createEvent(parent, id, args, scanner.lineno());
    parent.add(e);
  }

  /********** test functions ************/


  public static void tokenize (String fname) {
    try {
      ESParser parser = new ESParser(fname);
      StreamTokenizer s = parser.scanner;

      while (s.ttype != StreamTokenizer.TT_EOF) {
        switch (s.ttype) {
          case StreamTokenizer.TT_WORD:
            System.out.println("WORD: " + s.sval);
            break;

          case StreamTokenizer.TT_NUMBER:
            System.out.println("NUM:  " + s.nval);
            break;

          default:
            char c = (char)s.ttype;
            if (c == '"'){ // string literal
              System.out.println("STRING: \"" + s.sval + '"');
            } else {
              System.out.println("CHAR: " + (char)s.ttype);
            }
        }
        s.nextToken();
      }
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }

  static void showScript (String fname){
    try {
      ESParser parser = new ESParser(fname);
      Script script = parser.parse();

      PrintWriter pw = new PrintWriter(System.out, true);
      pw.println("------------------ script AST:");
      script.dump(pw);

      pw.println("------------------ generated CG sequence:");

      StringSetGenerator p = new StringSetGenerator();
      script.process(p);

      LinkedHashMap<String,ArrayList<CG>> sections = p.getSections();
      for (Map.Entry<String,ArrayList<CG>> e : sections.entrySet()) {
        ArrayList<CG> queue = e.getValue();
        System.out.println(e.getKey() + " {");
        for (CG cg : queue) {
          System.out.print("  ");
          System.out.println(cg);
        }
        System.out.println("}");
        System.out.println();
      }

 /** this only shows the last section
      List<CG> queue = p.getCGQueue();
      for (CG cg : queue) {
        System.out.println(cg);
      }
**/

    } catch (Throwable t){
      t.printStackTrace();
    }

  }

  public static void main(String[] args) {
    //tokenize(args[0]);
    showScript(args[0]);
  }
}
