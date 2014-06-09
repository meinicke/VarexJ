//
// Copyright (C) 2007 United States Government as represented by the
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
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.text.Format;
import java.util.HashMap;

/**
 * native peer for java.text.Format delegation. This is the place where
 * we keep a map between real formatters and their JPF counterparts
 * (which are just proxies)
 */
public class JPF_java_text_Format extends NativePeer {

  static HashMap<Integer,Format> formatters;

  public static boolean init (Config conf){
    formatters = new HashMap<Integer,Format>();
    return true;
  }
  
  static void putInstance (MJIEnv env, int objref, Format fmt) {
    int id = env.getIntField(objref,  "id");
    formatters.put(new Integer(id), fmt);
  }

  static Format getInstance (MJIEnv env, int objref) {
    // <2do> that's braindead
    
    int id = env.getIntField(objref,  "id");
    return formatters.get(id);
  }

  
}
