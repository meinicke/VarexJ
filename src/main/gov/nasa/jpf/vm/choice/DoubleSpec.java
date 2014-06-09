//
//Copyright (C) 2005 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.
//
//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.
//
//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//package gov.nasa.jpf.vm;
//

package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.StaticElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class DoubleSpec {

  /**
   * return double from String spec, which can be either a literal
   * or a local variable name, or a field name
   */
  public static double eval (String spec) {
    double ret;
    
    char c = spec.charAt(0);
    if (Character.isDigit(c) || (c == '+') || (c == '-') || (c == '.')) {
      try {
        ret = Double.parseDouble(spec); 
      } 
      catch (NumberFormatException nfx) {
        throw new JPFException("illegal double spec: " + spec);
      }
    } else {
      ret = resolveVar(spec);      
    }
    return ret;
  }

  public static double resolveVar(String spec){
    VM vm = VM.getVM();
    String[] varId = spec.split("[.]+");

    double ret;
    switch (varId.length){
    case 1: { // variable name
      ThreadInfo ti = ThreadInfo.getCurrentThread();
      try {
        StackFrame frame = ti.getTopFrame();

        ret = frame.getDoubleLocalVariable(varId[0]);
        // that throws an exception (a few calls down) if  
        // the name is not found...
      }
      catch (JPFException e){ //not local? try a field!
        int id = ti.getThis();
        if(id>=0){  // in a normal (non-static) method
          ElementInfo ei = vm.getElementInfo(id);
          ret = ei.getDoubleField(varId[0]);
        }
        else { // static method (no this)- must be static var
          ClassInfo ci = ti.getTopFrameMethodInfo().getClassInfo();
          ElementInfo ei = ci.getStaticElementInfo();
          ret = ei.getDoubleField(varId[0]);
        }
      }
      break;
    }
    case 2: { // static variable name TODO other cases here...
      ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo( varId[0]);
      ElementInfo ei = ci.getStaticElementInfo();
      ret = ei.getDoubleField(varId[1]);
      break;
    }
    default: 
      throw new JPFException("Choice value format error parsing \"" + spec +"\"");
    }
    return ret;
  }

  
}
