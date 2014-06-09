//
// Copyright (C) 2012 United States Government as represented by the
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

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import gov.nasa.jpf.util.FinalBitSet;
import gov.nasa.jpf.util.PrintUtils;

/**
 * stream to write program state info in a readable and diff-able format.
 * This is mostly intended for debugging, but could also at some point be
 * used to restore such states.
 * 
 * Currently supports heap objects, classes (static fields), threads and stack frames
 */
public class JPFOutputStream extends OutputStream {
  
  PrintStream ps;
  
  boolean useSid = false;
  int maxElements = -1;
  
  public JPFOutputStream (OutputStream os){
    ps = new PrintStream(os);
  }
  
  public JPFOutputStream (PrintStream ps){
    this.ps = ps;
  }
  
  public JPFOutputStream (){
    this(System.out);
  }
  
  public void close(){
    ps.flush();
    
    if (ps != System.err && ps != System.out){
      ps.close();
    }
  }
  
  public void printCommentLine(String msg){
    ps.print("// ");
    ps.println(msg);
  }
  
  public void print (ElementInfo ei, FieldInfo fi, boolean isFiltered){
    ps.print(fi.getName());
    ps.print(':');

    if (isFiltered){
      ps.print("X");
      
    } else {
      switch (fi.getTypeCode()) {
      case Types.T_BOOLEAN:
        ps.print(ei.getBooleanField(fi));
        break;
      case Types.T_BYTE:
        ps.print(ei.getByteField(fi));
        break;
      case Types.T_CHAR:
        PrintUtils.printCharLiteral(ps, ei.getCharField(fi));
        break;
      case Types.T_SHORT:
        ps.print(ei.getShortField(fi));
        break;
      case Types.T_INT:
        ps.print(ei.getIntField(fi));
        break;
      case Types.T_LONG:
        ps.print(ei.getLongField(fi));
        break;
      case Types.T_FLOAT:
        ps.print(ei.getFloatField(fi));
        break;
      case Types.T_DOUBLE:
        ps.print(ei.getDoubleField(fi));
        break;

      case Types.T_REFERENCE:
      case Types.T_ARRAY:
        PrintUtils.printReference(ps, ei.getReferenceField(fi));
        break;
      }
    }
  }
  
  protected void printFields (ElementInfo ei, FieldInfo[] fields, FinalBitSet filterMask){
    if (fields != null){
      for (int i = 0; i < fields.length; i++) {
        if (i > 0) {
          ps.print(',');
        }
        print(ei, fields[i], (filterMask != null && filterMask.get(i)));
      }
    }
  }
  
  public void print (ElementInfo ei, FinalBitSet filterMask){
    boolean isObject = ei.isObject();
    ClassInfo ci = ei.getClassInfo();
    
    int ref = (useSid) ? ei.getSid() : ei.getObjectRef();
    ps.printf("@%x ", ref);
    
    if (isObject){
      ps.print("object ");
      if (ei.isArray()){
        ps.print( Types.getTypeName(ci.getName()));
      } else {
        ps.print(ci.getName());
      }
    } else {
      ps.print("class ");
      ps.print(ci.getName());
    }
    
    ps.print(':');
    
    if (isObject){
      if (ei.isArray()){
        ps.print('[');
        ei.getArrayFields().printElements(ps, maxElements);
        ps.print(']');
            
      } else {
        ps.print('{');
        printFields(ei, ci.getInstanceFields(), filterMask);
        ps.print('}');
      }
      
    } else {
      ps.print('{');
      printFields( ei, ci.getDeclaredStaticFields(), filterMask);        
      ps.print('}');
    }
  }
  
  public void print (ThreadInfo ti){
    PrintUtils.printReference(ps, ti.getThreadObjectRef());
    ps.print(' ');
    ps.print(ti.getStateDescription());
  }
  
  public void print (StackFrame frame){
    MethodInfo mi = frame.getMethodInfo();
  
    ps.print('@');
    ps.print(frame.getDepth());
    
    ps.print(" frame ");
    ps.print( mi.getFullName());
    ps.print( ":{" );
    
    if (!mi.isStatic()){
      ps.print("this:");
      PrintUtils.printReference(ps, frame.getThis());
      ps.print(',');
    }
    
    ps.print("pc:");
    ps.print(frame.getPC().getInstructionIndex());
    
    ps.print(",slots:[");
    frame.printSlots(ps);
    ps.print(']');
    
    ps.print('}');
  }
  
  public void println(){
    ps.println();
  }
  
  @Override
  public void write(int b) throws IOException {
    ps.write(b);
  }
}
