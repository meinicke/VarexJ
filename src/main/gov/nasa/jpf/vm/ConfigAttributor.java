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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A configuration file-driven attributor so that we can tailor JPF's
 * attributor based on the application under test.
 *
 * The input file looks like:
 *   # This is a comment
 *   [atomic]
 *   <class regex> <method regex> (true|false)
 *   ...
 *   [relevance]
 *   <class regex> <method regex> (always|never|runnables|sync)
 *   ...
 *
 * @author Owen O'Malley
 */
public class ConfigAttributor extends DefaultAttributor {

  public ConfigAttributor(Config conf) {
    super(conf);
    
    try {
      parse("jpf-attributes");
    } catch (FileNotFoundException e) {
      // ignore
    } catch (IOException e) {
      System.err.println("IO exception reading attribute file: " + e);
      System.err.println("Ignoring file");
      relevance_rules.clear();
      atomic_rules.clear();
    }
  }

  public void setMethodInfoAttributes (MethodInfo mi) {
    ClassInfo ci = mi.getClassInfo();
    String cls = ci.getName();
    String uniqueName = mi.getUniqueName();

    super.setMethodInfoAttributes(mi);

    for (NameRule rule : atomic_rules) {
      if (rule.isMatch(cls, uniqueName)) {
        mi.setAtomic(rule.getResult() == 1);
      }
    }
  }


  private void parse(String filename
                    ) throws FileNotFoundException, IOException {
    BufferedReader config_file = new BufferedReader(new FileReader(filename));
    try {
      System.out.println("Using JPF attributes from " + filename);
      String line = config_file.readLine();
      String current_section = null;
      while (line != null) {
        line = line.trim();
        if (line.length() != 0 && line.charAt(0) != '#') {
          if (line.charAt(0) == '[') {
            current_section = parseSection(line);
          } else if ("atomic".equals(current_section)) {
            parseAtomicRule(line);
          } else {
            System.err.println("Rules found in section " + current_section +
            ", which is unknown.");
          }
        }
        line = config_file.readLine();
      }
    } finally {
      config_file.close();
    }
  }

  private static final Pattern section_pattern =
    Pattern.compile("\\[([a-zA-Z]+)\\]");

  private String parseSection(String line) {
    Matcher match = section_pattern.matcher(line);
    if (match.matches()) {
      return match.group(1);
    }
    System.err.println("Problem parsing section name " + line);
    return null;
  }



  private static final Pattern atomic_rule_pattern =
    Pattern.compile("([^ ]+) +([^ ]+) +(true|false)");

  private void parseAtomicRule(String line) {
    Matcher match = atomic_rule_pattern.matcher(line);
    if (match.matches()) {
      int result = 0;
      String value = match.group(3);
      if ("true".equals(value)) {
        result = 1;
      } else if ("false".equals(value)) {
        result = 0;
      } else {
        System.err.println("Unknown atomic value: " + value);
        return;
      }
      atomic_rules.add(new NameRule(match.group(1), match.group(2), result));
    } else {
      System.err.println("Atomic rule parse error on line: " + line);
    }
  }

  /**
   * A rule that contains two regular expressions that will take two strings
   * and report if they match the rule.
   * It also stores the result that needs to be returned if this rule matches.
   */
  private static class NameRule {
    NameRule(String class_pattern_string,
             String method_pattern_string,
             int value) {
      class_pattern = Pattern.compile(class_pattern_string);
      method_pattern = Pattern.compile(method_pattern_string);
      result = value;
    }

    boolean isMatch(String class_name, String method_name) {
      Matcher class_match = class_pattern.matcher(class_name);
      if (class_match.matches()) {
        return method_pattern.matcher(method_name).matches();
      }
      return false;
    }

    int getResult() {
      return result;
    }

    Pattern class_pattern;
    Pattern method_pattern;
    int result;
  }

  private List<NameRule> relevance_rules = new ArrayList<NameRule>();
  private List<NameRule> atomic_rules = new ArrayList<NameRule>();
}

