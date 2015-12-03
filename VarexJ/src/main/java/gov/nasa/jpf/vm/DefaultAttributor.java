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
import gov.nasa.jpf.util.StringSetMatcher;

/**
 * default Attributor implementation to set method and fiel attributes
 * at class load time. Note this is critical functionality, esp.
 * with respect to threading
 */
public class DefaultAttributor implements Attributor {

  static StringSetMatcher atomicMethods;
  static StringSetMatcher neverBreak;
  static StringSetMatcher breakShared;
  
  public DefaultAttributor (Config conf) {
    String[] val;
          
    val = conf.getStringArray("vm.por.field_boundaries.never");
    if (val != null) {
      neverBreak = new StringSetMatcher(val);
    }
      
    if (conf.getBoolean("vm.por.field_boundaries")) {
      val = conf.getStringArray("vm.por.field_boundaries.break");
      if (val != null) {
        breakShared = new StringSetMatcher(val);
      }
    }

    val = conf.getStringArray("vm.por.atomic_methods");
    if (val != null) {
      atomicMethods = new StringSetMatcher(val);
    }    
  }
  
  // <2do> we should turn atomicity and scheduling relevance into general
  // MethodInfo attributes, to keep it consistent with object and field attrs
  
  public void setMethodInfoAttributes (MethodInfo mi) {
    ClassInfo ci = mi.getClassInfo();
    String clsName = ci.getName();
    String uniqueName = mi.getUniqueName();

    if (atomicMethods != null && atomicMethods.matchesAny(uniqueName)){
      // but exclude the known blocking methods (Object.wait()/notify(), Thread.join())
      // <2do> this should be configurable too
      if (clsName.equals("java.lang.Object")) {
        if (uniqueName.startsWith("wait(") ||
            uniqueName.equals("notify()V")) {
          return;
        }
      } else if (clsName.equals("java.lang.Thread")) {
        if (uniqueName.equals("join()V")) {
          return;
        }
      }
      
      // <2do> this is not used - either we have to or this is removed
      mi.setAtomic(true);
    }
  }
    
  /**
   * answer the type based object attributes for this class. See
   * ElementInfo for valid choices
   */
  public void setElementInfoAttributes (ClassInfo ci) {
    String clsName = ci.getName();

    // very very simplistic for now
    if (clsName.equals("java.lang.String") ||
       clsName.equals("java.lang.Integer") ||
       clsName.equals("java.lang.Long") ||
       clsName.equals("java.lang.Class")
        /* ..and a lot more.. */
       ) {
      ci.setElementInfoAttrs(ElementInfo.ATTR_IMMUTABLE);
    }
  }
  
  
  public void setFieldInfoAttributes (FieldInfo fi) {
    int attr = 0;
    
    String fid = fi.getFullName();

    
    if (fi.isFinal()) {
      // <2do> Hmm, finals are not really immutable, they only can be set once
      // <2do> same here - FieldInfo does not even have a isImmutable()
      attr |= ElementInfo.ATTR_IMMUTABLE;
    }
    // <2do> what about other immutable fields? don't say there are none - try to set one
    // of the compiler generated magics (like 'this$xx' in inner classes)

    //--- por field boundary attributes
    if (neverBreak != null) {
      if (neverBreak.matchesAny(fid)) {
        attr |= FieldInfo.NEVER_BREAK;
      }
    }
    
    if (breakShared != null) {
      if (breakShared.matchesAny(fid)) {
        attr |= FieldInfo.BREAK_SHARED;
      }
    }
        
    fi.setAttributes(attr);
  }
}

