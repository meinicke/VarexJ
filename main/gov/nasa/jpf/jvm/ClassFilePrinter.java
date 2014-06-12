//
// Copyright (C) 2010 United States Government as represented by the
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

package gov.nasa.jpf.jvm;

import gov.nasa.jpf.jvm.JVMByteCodePrinter;
import gov.nasa.jpf.util.StructuredPrinter;
import gov.nasa.jpf.vm.ClassParseException;
import java.io.PrintWriter;

/**
 * simple tool to print contents of a classfile
 *
 * <2do> use indentation level variable and formated output
 */
public class ClassFilePrinter extends StructuredPrinter implements ClassFileReader {


  public static void main(String[] args){
    ClassFilePrinter printer = new ClassFilePrinter();

    try {
      ClassFile cf = new ClassFile(args[0]);
      cf.parse(printer);

    } catch (ClassParseException cfx){
      cfx.printStackTrace();
    }
  }

  public void setClass(ClassFile cf, String clsName, String superClsName, int flags, int cpCount) {
    printSectionHeader( "constpool");
    printCp(pw,cf);

    incIndent();
    printSectionHeader( "class");
    pw.printf("%sclass=%s\n", indent, clsName);
    pw.printf("%ssuperclass=%s\n", indent, superClsName);
    pw.printf("%sflags=0x%X\n", indent, flags);
  }

  //--- interfaces
  public void setInterfaceCount(ClassFile cf, int ifcCount) {
    pw.printf("%sinterface count=%d\n", indent, ifcCount);
    incIndent();
  }

  public void setInterface(ClassFile cf, int ifcIndex, String ifcName) {
    pw.printf("%s[%d]: %s\n", indent, ifcIndex, ifcName);
  }

  public void setInterfacesDone(ClassFile cf){
    decIndent();
  }

  //--- fields
  public void setFieldCount(ClassFile cf, int fieldCount) {
    printSectionHeader( "fields");
    pw.printf( "%sfield count=%d\n", indent, fieldCount);
  }

  public void setField(ClassFile cf, int fieldIndex, int accessFlags, String name, String descriptor) {
    pw.printf("%s[%d]: %s, type=%s,flags=0x%X", indent, fieldIndex, name, descriptor, accessFlags);
  }

  public void setFieldAttributeCount(ClassFile cf, int fieldIndex, int attrCount) {
    pw.printf(", attr count=%d\n", attrCount);
    incIndent();
  }

  public void setFieldAttribute(ClassFile cf, int fieldIndex, int attrIndex, String name, int attrLength) {
    pw.printf("%s[%d]: %s", indent, attrIndex, name);

    if (name == ClassFile.CONST_VALUE_ATTR) {
      cf.parseConstValueAttr(this, null);

    } else if (name == ClassFile.RUNTIME_VISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.RUNTIME_INVISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.SIGNATURE_ATTR){
      cf.parseSignatureAttr(this, null);

    } else {
      pw.printf(" ,length=%d,data=[",attrLength );
      printRawData(pw, cf, attrLength, 10);
      pw.println(']');
    }
  }

  public void setFieldAttributesDone(ClassFile cf, int fieldIndex){
    decIndent();
  }

  public void setFieldDone(ClassFile cf, int fieldIndex){
    pw.println();
  }

  public void setFieldsDone(ClassFile cf){
  }

  public void setConstantValue(ClassFile cf, Object tag, Object value) {
    pw.printf(" value=%s\n", value);
  }

  //--- methods
  public void setMethodCount(ClassFile cf, int methodCount) {
    printSectionHeader( "methods");
    pw.printf( "%smethod count=%d\n", indent, methodCount);
  }

  public void setMethod(ClassFile cf, int methodIndex, int accessFlags, String name, String descriptor) {
    pw.printf("%s[%d]: %s%s, flags=0x%X", indent, methodIndex, name, descriptor, accessFlags);
  }

  public void setMethodAttributeCount(ClassFile cf, int methodIndex, int attrCount) {
    pw.printf(", attr count=%d\n", attrCount);
    incIndent();
  }

  public void setMethodAttribute(ClassFile cf, int methodIndex, int attrIndex, String name, int attrLength) {
    pw.printf("%s[%d]: %s", indent, attrIndex, name);

    if (name == ClassFile.CODE_ATTR) {
      cf.parseCodeAttr(this, null);

    } else if (name == ClassFile.EXCEPTIONS_ATTR){
      cf.parseExceptionAttr(this, null);

    } else if (name == ClassFile.RUNTIME_VISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.RUNTIME_INVISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTR){
      cf.parseParameterAnnotationsAttr(this, null);

    } else if (name == ClassFile.RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTR){
      cf.parseParameterAnnotationsAttr(this, null);

    } else if (name == ClassFile.SIGNATURE_ATTR){
      cf.parseSignatureAttr(this, null);

    } else {
      pw.printf(" ,length=%d,data=[", attrLength );
      printRawData(pw, cf, attrLength, 10);
      pw.println(']');
    }
  }

  public void setMethodAttributesDone(ClassFile cf, int methodIndex){
    decIndent();
  }

  public void setMethodDone(ClassFile cf, int methodIndex){
    pw.println();
  }

  public void setMethodsDone(ClassFile cf){
  }

  public void setExceptionCount(ClassFile cf, Object tag, int exceptionCount){
    pw.printf(", count=%d\n", exceptionCount);
    incIndent();
  }
  public void setException(ClassFile cf, Object tag, int exceptionIndex, String exceptionType){
    pw.printf("%s[%d]: %s\n", indent, exceptionIndex, exceptionType);
  }
  public void setExceptionsDone(ClassFile cf, Object tag){
    decIndent();
  }


  public void setCode(ClassFile cf, Object tag, int maxStack, int maxLocals, int codeLength) {
    pw.printf(", maxStack=%d,maxLocals=%d,length=%d\n", maxStack, maxLocals,codeLength);
    incIndent();
    JVMByteCodePrinter bcPrinter = new JVMByteCodePrinter(pw, cf, indent);
    cf.parseBytecode(bcPrinter, tag, codeLength);
    decIndent();
  }

  public void setExceptionHandlerTableCount(ClassFile cf, Object tag, int exceptionTableCount) {
    pw.printf("%sexception table count=%d\n", indent, exceptionTableCount);
    incIndent();
  }
  public void setExceptionHandler(ClassFile cf, Object tag, int exceptionIndex,
          int startPc, int endPc, int handlerPc, String catchType) {
    pw.printf("%s[%d]: type=%s, range=[%d..%d], handler=%d\n", indent, exceptionIndex, catchType, startPc, endPc, handlerPc);
  }
  public void setExceptionHandlerTableDone(ClassFile cf, Object tag){
    decIndent();
  }

  public void setCodeAttributeCount(ClassFile cf, Object tag, int attrCount) {
    pw.printf("%scode attribute count=%d\n", indent, attrCount);
    incIndent();
  }
  public void setCodeAttribute(ClassFile cf, Object tag, int attrIndex, String name, int attrLength) {
    pw.printf("%s[%d]: %s", indent, attrIndex, name);

    if (name == ClassFile.LINE_NUMBER_TABLE_ATTR) {
      cf.parseLineNumberTableAttr(this, tag);

    } else if (name == ClassFile.LOCAL_VAR_TABLE_ATTR) {
      cf.parseLocalVarTableAttr(this, tag);

    } else {  // generic
      pw.printf(" ,length=%d,data=[", attrLength );
      printRawData(pw, cf, attrLength, 10);
      pw.println(']');
    }
  }
  public void setCodeAttributesDone(ClassFile cf, Object tag){
    decIndent();
  }

  public void setLineNumberTableCount(ClassFile cf, Object tag, int lineNumberCount) {
    pw.printf(", linenumber count=%d\n", lineNumberCount);
    incIndent();
  }
  public void setLineNumber(ClassFile cf, Object tag, int lineIndex, int lineNumber, int startPc) {
    pw.printf("%s[%d]: line=%d, pc=%d\n", indent, lineIndex, lineNumber, startPc);
  }
  public void setLineNumberTableDone(ClassFile cf, Object tag){
    decIndent();
  }

  public void setLocalVarTableCount(ClassFile cf, Object tag, int localVarCount) {
    pw.printf(", localVar count=%d\n", localVarCount);
    incIndent();
  }
  public void setLocalVar(ClassFile cf, Object tag, int localVarIndex,
          String varName, String descriptor, int scopeStartPc, int scopeEndPc, int slotIndex) {
    pw.printf("%s[%d]: %s, type=%s, scope=[%d..%d], slot=%d\n", indent, localVarIndex, varName, descriptor,
            scopeStartPc, scopeEndPc, slotIndex);
  }
  public void setLocalVarTableDone(ClassFile cf, Object tag){
    decIndent();
  }

  //--- class attributes
  public void setClassAttributeCount(ClassFile cf, int attrCount) {
    printSectionHeader( "class attributes");
    pw.printf("%sclass attribute count=%d\n", indent, attrCount);
    incIndent();
  }
  public void setClassAttribute(ClassFile cf, int attrIndex, String name, int attrLength) {
    pw.printf("%s[%d]: %s", indent, attrIndex, name);

    if (name == ClassFile.SOURCE_FILE_ATTR) {
      cf.parseSourceFileAttr(this, null);

    } else if (name == ClassFile.DEPRECATED_ATTR) {

    } else if (name == ClassFile.INNER_CLASSES_ATTR) {
      cf.parseInnerClassesAttr(this, null);

    } else if (name == ClassFile.RUNTIME_VISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.RUNTIME_INVISIBLE_ANNOTATIONS_ATTR){
      cf.parseAnnotationsAttr(this, null);

    } else if (name == ClassFile.SIGNATURE_ATTR){
      cf.parseSignatureAttr(this, null);

    } else if (name == ClassFile.ENCLOSING_METHOD_ATTR){
      cf.parseEnclosingMethodAttr(this, null);
      
    } else {
      pw.printf(" ,length=%d,data=[", attrLength );
      printRawData(pw, cf, attrLength, 10);
      pw.println(']');
    }
  }
  public void setClassAttributesDone(ClassFile cf){
    decIndent();
  }

  public void setEnclosingMethod(ClassFile cf, Object tag, String enclosingClass, String enclosingMethod, String descriptor) {
    if (enclosingMethod != null){
      pw.printf(", enclosingClass=%s, method=%s%s\n", enclosingClass, enclosingMethod, descriptor);
    } else {
      pw.printf(", enclosingClass=%s\n", enclosingClass);
    }
  }

  
  public void setSourceFile(ClassFile cf, Object tag, String pathName){
    pw.printf(", path=%s\n", pathName);
  }

  public void setInnerClassCount(ClassFile cf, Object tag, int innerClsCount) {
    pw.printf( "%sinner class count=%d\n", indent, innerClsCount);
    incIndent();
  }
  public void setInnerClass(ClassFile cf, Object tag, int innerClsIndex,
          String outerName, String innerName, String innerSimpleName, int accessFlags) {
    pw.printf("%s[%d]: %s, fullName=%s, outerClass=%s, flags=0x%X\n", indent, innerClsIndex,
            innerSimpleName, innerName, outerName, accessFlags);
  }
  public void setInnerClassesDone(ClassFile cf, Object tag){
    decIndent();
  }


  public void setAnnotationCount(ClassFile cf, Object tag, int annotationCount){
    pw.printf( " count=%d\n", annotationCount);
    incIndent();
  }
  public void setAnnotationsDone(ClassFile cf, Object tag){
    decIndent();
  }

  public void setAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType){
    pw.printf("%s[%d]: %s", indent, annotationIndex, annotationType);
  }

  public void setAnnotationValueCount(ClassFile cf, Object tag, int annotationIndex, int nValuePairs){
    pw.printf(" valueCount=%d\n", nValuePairs);
    incIndent();
  }

  public void setPrimitiveAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, Object val){
    if (arrayIndex < 0){
      pw.printf("%s[%d]: %s=%s\n", indent, annotationIndex, elementName, val);
    } else {
      if (arrayIndex==0) {
        pw.printf("%s[%d]: %s={", indent, valueIndex, elementName);
      }  else {
        pw.print(',');
      }
      pw.print(val);
    }
  }

  public void setStringAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String s){
    if (arrayIndex < 0){
      pw.printf("%s[%d]: %s=\"%s\"\n", indent, annotationIndex, elementName, s);
    } else {
      if (arrayIndex==0) {
        pw.printf("%s[%d]: %s={", indent, valueIndex, elementName);
      }  else {
        pw.print(',');
      }
      pw.printf("\"%s\"", s);
    }
  }

  public void setClassAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String typeName){
    if (arrayIndex < 0){
      pw.printf("%s[%d]: %s=class %s\n", indent, annotationIndex, elementName, typeName);
    } else {
      if (arrayIndex==0) {
        pw.printf("%s[%d]: %s={", indent, valueIndex, elementName);
      }  else {
        pw.print(',');
      }
      pw.printf("class %s", typeName);
    }
  }

  public void setEnumAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String enumType, String enumValue){
    if (arrayIndex < 0){
      pw.printf("%s[%d]: %s=%s.%s\n", indent, annotationIndex, elementName, enumType, enumValue);
    } else {
      if (arrayIndex==0) {
        pw.printf("%s[%d]: %s={", indent, valueIndex, elementName);
      }  else {
        pw.print(',');
      }
      pw.printf("%s.%s", enumType, enumValue);
    }
  }


  public void setAnnotationValueElementCount(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int elementCount){
  }
  public void setAnnotationValueElementsDone(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName){
    pw.println("}");
  }

  public void setAnnotationValuesDone(ClassFile cf, Object tag, int annotationIndex){
    decIndent();
  }

  public void setParameterCount(ClassFile cf, Object tag, int parameterCount){
    pw.printf(" parameterCount=%d\n", parameterCount);
    incIndent();
  }

  public void setParameterAnnotationCount(ClassFile cf, Object tag, int paramIndex, int annotationCount){
    pw.printf("%s[%d] count: %d\n", indent, paramIndex, annotationCount);
    incIndent();
  }

  public void setParameterAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType){
    pw.printf("%s[%d]: %s", indent, annotationIndex, annotationType);
  }

  public void setParameterAnnotationsDone(ClassFile cf, Object tag, int paramIndex){
    decIndent();
  }

  public void setParametersDone(ClassFile cf, Object tag){
    decIndent();
  }


  public void setSignature(ClassFile cf, Object tag, String signature){
    pw.printf(" %s\n", signature);
  }

  //--- internal stuff

  protected void printCp (PrintWriter pw, ClassFile cf){
    int nCpEntries = cf.getNumberOfCpEntries();

    for (int i=1; i<nCpEntries; i++){

      int j = cf.getDataPosOfCpEntry(i);

      pw.print("  [");
      pw.print(i);
      pw.print("]: ");

      if (j < 0) {
        pw.println("<unused>");
        continue;
      }

      switch (cf.u1(j)){
        case ClassFile.CONSTANT_UTF8:
          pw.print( "constant_utf8 {\"");
          pw.print( cf.getCpValue(i));
          pw.println("\"}");
          break;
        case ClassFile.CONSTANT_INTEGER:
          pw.print( "constant_integer {");
          pw.print( cf.getCpValue(i));
          pw.println("}");
          break;
        case ClassFile.CONSTANT_FLOAT:
          pw.print( "constant_float {");
          pw.print( cf.getCpValue(i));
          pw.println("}");
          break;
        case ClassFile.CONSTANT_LONG:
          pw.print( "constant_long {");
          pw.print( cf.getCpValue(i));
          pw.println("}");
          break;
        case ClassFile.CONSTANT_DOUBLE:
          pw.print( "constant_double {");
          pw.print( cf.getCpValue(i));
          pw.println("}");
          break;
        case ClassFile.CONSTANT_CLASS:
          pw.print("constant_class {name=#");
          pw.print( cf.u2(j+1));
          pw.print("(\"");
          pw.print( cf.classNameAt(i));
          pw.println("\")}");
          break;
        case ClassFile.CONSTANT_STRING:
          pw.print("constant_string {utf8=#");
          pw.print( cf.u2(j+1));
          pw.print("(\"");
          pw.print( cf.stringAt(i));
          pw.println("\")}");
          break;
        case ClassFile.FIELD_REF:
          printRef(pw, cf, i, j, "fieldref");
          break;
        case ClassFile.METHOD_REF:
          printRef(pw, cf, i, j, "methodref");
          break;
        case ClassFile.INTERFACE_METHOD_REF:
          printRef(pw, cf, i, j, "interface_methodref");
          break;
        case ClassFile.NAME_AND_TYPE:
          pw.print("name_and_type {name=#");
          pw.print( cf.u2(j+1));
          pw.print("(\"");
          pw.print(cf.utf8At(cf.u2(j+1)));
          pw.print("\"),desciptor=#");
          pw.print( cf.u2(j+3));
          pw.print("(\"");
          pw.print(cf.utf8At(cf.u2(j+3)));
          pw.println("\")}");
          break;
        default:
          pw.print("ERROR: illegal tag" + cf.u1(j));
      }
    }
    pw.println();
  }

  void printRef(PrintWriter pw, ClassFile cf, int cpIdx, int dataPos, String refType){
    pw.print(refType);
    pw.print(" {class=#");
    pw.print(cf.u2(dataPos + 1));
    pw.print("(\"");
    pw.print(cf.refClassNameAt(cpIdx));
    pw.print("\"),nameType=#");
    pw.print(cf.u2(dataPos + 3));
    pw.print("(\"");
    pw.print(cf.refNameAt(cpIdx));
    pw.print("\",\"");
    pw.print(cf.refDescriptorAt(cpIdx));
    pw.println("\")}");
  }

  void printRawData(PrintWriter pw, ClassFile cf, int dataLength, int maxBytes){
    int max = Math.min(dataLength, maxBytes);
    int max1 = max-1;
    for (int i=0; i<max1; i++){
      pw.printf("%02x ", cf.readUByte());
    }
    pw.printf("%02x", cf.readUByte());

    if (dataLength>maxBytes){
      pw.print("..");
    }
  }
}
