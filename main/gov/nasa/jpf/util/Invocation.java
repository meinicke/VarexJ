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

package gov.nasa.jpf.util;

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ObjRef;

/**
 * a record that includes all information to perform a call
 */
public class Invocation {
  MethodInfo mi;
  Object[] args;  // includes 'this' for instance methods
  Object[] attrs;
  
  public Invocation (MethodInfo mi, Object[] args, Object[] attrs){
    this.mi = mi;
    this.args = args;
    this.attrs = attrs;
  }
  
  public MethodInfo getMethodInfo () {
    return mi;
  }
  
  public Object[] getExplicitArguments () {
    if (!mi.isStatic()){
      Object[] a = new Object[args.length-1];
      System.arraycopy(args,1,a,0,a.length);
      return a;
    } else {
      return args;
    }
  }
  
  public String[] getArgumentTypeNames() {
    return mi.getArgumentTypeNames();
  }
  
  public String getArgumentValueLiteral(Object a) {
    Class<?> cls = a.getClass();
    
    if (cls == Boolean.class)   return ((Boolean)a).toString();
    if (cls == Byte.class)      return ((Byte)a).toString();
    if (cls == Character.class) return ((Character)a).toString();
    if (cls == Short.class)     return ((Short)a).toString();
    if (cls == Integer.class)   return ((Integer)a).toString();
    if (cls == Long.class)      return ((Long)a).toString();
    if (cls == Float.class)     return ((Float)a).toString();
    if (cls == Double.class)    return ((Double)a).toString();

    if (cls == ObjRef.class) {
      int ref = ((ObjRef)a).getReference();
      
      if (ref != MJIEnv.NULL){
        ElementInfo ei = VM.getVM().getElementInfo(ref);
        ClassInfo ci = ei.getClassInfo();
        String cname = ci.getName();
        if (cname.equals("java.lang.String")){
          return "\"" + ei.asString() + '"';
        } 
        // <2do> we could probably do some more literals for java.lang.Class etc.
      } else {
        return "null";
      }
    }
    
    return null; // no literal representation
  }
  
  public Object[] getArguments() {
    return args;
  }
  
  public Object[] getAttrs() {
    return attrs;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("INVOKE[");
    sb.append(mi.getName());
    sb.append('(');
    for (int i=0; i<args.length; i++){
      if (i>0){
        sb.append(',');
      }
      sb.append(args[i]);
    }
    sb.append(")]");
    
    return sb.toString();
  }
}
