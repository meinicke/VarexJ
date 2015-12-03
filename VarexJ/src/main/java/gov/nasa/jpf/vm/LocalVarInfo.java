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

public class LocalVarInfo {
  private final String name;
  private String type;       // lazy initialized FQN according to JLS 6.7 (e.g. "int", "x.Y[]")
  private final String signature;  // e.g. "I", "[Lx/Y;"
  private final String genericSignature;  // non-type erased generic signature(s)
  private final int    startPC;
  private final int    endPC;
  private final int slotIndex;
    
  public LocalVarInfo(String name, String signature, String genericSignature, int startPC, int endPC, int slotIndex) {
   
    this.name             = name;
    this.signature        = signature;
    this.genericSignature = genericSignature;
    this.startPC          = startPC;
    this.endPC            = endPC;
    this.slotIndex        = slotIndex;
  }
    
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("LocalVarInfo[");
    sb.append("name=\"");
    sb.append(name);
    sb.append("\",signature=\"");
    sb.append(signature);
    sb.append("\",startPC=");
    sb.append(startPC);
    sb.append(",endPC=");
    sb.append(endPC);
    sb.append(",slotIndex=");
    sb.append(slotIndex);
    sb.append("]");
    
    return sb.toString();
  }
  
  public String getName() {
    return name; 
  }

  public String getType() {
    if (type == null){
      type = Types.getTypeName(signature);
    }
    return type; 
  }

  public String getSignature() {
    return signature;
  }

  public String getGenericSignature() {
    return genericSignature;
  }
  
  public int getStartPC() {
    return startPC; 
  }
     
  public int getLength() {
    return endPC - startPC +1;
  }

  public int getSlotIndex() {
    return slotIndex;
  }

  public boolean matches (String name, int pc){
    return (startPC <= pc && endPC >= pc && this.name.equals(name));
  }

  public boolean matches (int slotIdx, int pc){
    return (slotIdx == slotIndex) && (pc >= startPC) && (pc <= endPC);
  }

  public boolean isNumeric(){
    char c = signature.charAt(0);
    return (c == 'B' || c == 'S' || c == 'I' || c == 'J' || c == 'F' || c == 'D');
  }

  public boolean isBoolean(){
    char c = signature.charAt(0);
    return (c == 'Z');
  }  

  public int getSlotSize(){
    char c = signature.charAt(0);
    if (c == 'J' || c == 'D'){
      return 2;
    } else {
      return 1;
    }
  }

  public boolean isFloatingPoint(){
    char c = signature.charAt(0);
    return (c == 'F' || c == 'D');
  }
}

