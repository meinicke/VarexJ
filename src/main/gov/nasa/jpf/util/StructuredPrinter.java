//
// Copyright (C) 2013 United States Government as represented by the
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

import java.io.PrintWriter;

/**
 * a common base for printers that need to keep track of indentation levels
 */
public abstract class StructuredPrinter {

  protected PrintWriter pw;

  protected int indentLevel = 0;
  protected String indent = "";
  
  protected StructuredPrinter(){
    pw = new PrintWriter(System.out, true);
  }
  
  protected StructuredPrinter (PrintWriter pw){
    this.pw = pw;
  }
  
  protected void incIndent(){
    indentLevel++;
    indent = indent();
  }

  protected void decIndent(){
    if (indentLevel > 0){
      indentLevel--;
      indent = indent();
    }
  }

  protected String indent(){
    switch (indentLevel){
      case 0: return "";
      case 1: return "    ";
      case 2: return "        ";
      case 3: return "            ";
      case 4: return "                ";
      default:
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<indentLevel; i++){
          sb.append("    ");
        }
        return sb.toString();
    }
  }
  
  protected void printSectionHeader(String id){
    pw.println();
    pw.print("--------------------------------------------------- ");
    pw.println(id);
  }

  
}
