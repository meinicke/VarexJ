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
package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.LocalVarInfo;

/**
 * class abstracting instructions that access local variables, to keep
 * track of slot/varname mapping
 */
public abstract class LocalVariableInstruction extends JVMInstruction
  implements VariableAccessor {

  protected int index;
  protected LocalVarInfo lv;


  protected LocalVariableInstruction(int index){
    this.index = index;
  }

  public int getLocalVariableIndex() {
    return index;
  }
  
  public LocalVarInfo getLocalVarInfo(){
    if (lv == null){
     lv = mi.getLocalVar(index, position+getLength());
    }
    return lv;
  }
  
  public String getLocalVariableName () {
    LocalVarInfo lv = getLocalVarInfo();
    return (lv == null) ? "?" : lv.getName();
  }
  
  public String getLocalVariableType () {
    LocalVarInfo lv = getLocalVarInfo();
    return (lv == null) ? "?" : lv.getType();
  }
  
  /**
   * return the fully qualified class/method/var name
   * (don't use this for top-level filtering since it dynamically constructs the name)
   */
  public String getVariableId () {
    return mi.getClassInfo().getName() + '.' + mi.getUniqueName() + '.' + getLocalVariableName();
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
  
  public abstract String getBaseMnemonic();
  
  public String getMnemonic(){
    String baseMnemonic = getBaseMnemonic();
    
    if (index <= 3){
      return baseMnemonic + '_' + index;
    } else {
      return baseMnemonic;
    }
  }
  
  public String toString(){
    String baseMnemonic = super.toString();
    
    if (index <= 3){
      return baseMnemonic + '_' + index;
    } else {
      return baseMnemonic + " " + index;
    }
  }
}


