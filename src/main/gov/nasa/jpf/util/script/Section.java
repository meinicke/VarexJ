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

import gov.nasa.jpf.util.Misc;

import java.util.ArrayList;
import java.util.List;

/**
 * this script element is just a way to do logical partitioning of scripts
 * and doesn't bear any additional info than just an id. It is an optional element
 */
public class Section extends ScriptElementContainer {

  ArrayList<String> ids = new ArrayList<String>();

  public Section (ScriptElement parent, String id) {
    super(parent,0);
    this.ids.add(id);
  }

  public Section (ScriptElement parent, List<String> ids, int line) {
    super(parent, line);
    this.ids.addAll(ids);
  }

  public List<String> getIds() {
    return ids;
  }

  public boolean containsId (String id) {
    return ids.contains(id);
  }

  public String toString() {
    return super.toString( Misc.toString(ids, "SECTION ", ",", null));
  }

  public void process (ElementProcessor proc) {
    proc.process(this);
  }

}
