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

import gov.nasa.jpf.vm.ClassParseException;

/**
 * adapter class implementing the ClassFileReader interface
 */
public class ClassFileReaderAdapter implements ClassFileReader {

  @Override
  public void setClass(ClassFile cf, String clsName, String superClsName, int flags, int cpCount) throws ClassParseException {}

  @Override
  public void setInterfaceCount(ClassFile cf, int ifcCount) {}

  @Override
  public void setInterface(ClassFile cf, int ifcIndex, String ifcName) {}

  @Override
  public void setInterfacesDone(ClassFile cf) {};

  @Override
  public void setFieldCount(ClassFile cf, int fieldCount) {}

  @Override
  public void setField(ClassFile cf, int fieldIndex, int accessFlags, String name, String descriptor) {}

  @Override
  public void setFieldAttributeCount(ClassFile cf, int fieldIndex, int attrCount) {}

  @Override
  public void setFieldAttribute(ClassFile cf, int fieldIndex, int attrIndex, String name, int attrLength) {}

  @Override
  public void setFieldAttributesDone(ClassFile cf, int fieldIndex) {}

  @Override
  public void setFieldDone(ClassFile cf, int fieldIndex) {}

  @Override
  public void setFieldsDone(ClassFile cf) {}

  @Override
  public void setConstantValue(ClassFile cf, Object tag, Object value) {}

  @Override
  public void setMethodCount(ClassFile cf, int methodCount) {}

  @Override
  public void setMethod(ClassFile cf, int methodIndex, int accessFlags, String name, String descriptor) {}

  @Override
  public void setMethodAttributeCount(ClassFile cf, int methodIndex, int attrCount) {}

  @Override
  public void setMethodAttribute(ClassFile cf, int methodIndex, int attrIndex, String name, int attrLength) {}

  @Override
  public void setMethodAttributesDone(ClassFile cf, int methodIndex){}

  @Override
  public void setMethodDone(ClassFile cf, int methodIndex) {}

  @Override
  public void setMethodsDone(ClassFile cf) {}

  @Override
  public void setExceptionCount(ClassFile cf, Object tag, int exceptionCount) {}

  @Override
  public void setException(ClassFile cf, Object tag, int exceptionIndex, String exceptionType) {}

  @Override
  public void setExceptionsDone(ClassFile cf, Object tag) {}

  @Override
  public void setCode(ClassFile cf, Object tag, int maxStack, int maxLocals, int codeLength) {}

  @Override
  public void setExceptionHandlerTableCount(ClassFile cf, Object tag, int exceptionTableCount) {}

  @Override
  public void setExceptionHandler(ClassFile cf, Object tag, int exceptionIndex,
          int startPc, int endPc, int handlerPc, String catchType) {}

  @Override
  public void setExceptionHandlerTableDone(ClassFile cf, Object tag) {}

  @Override
  public void setCodeAttributeCount(ClassFile cf, Object tag, int attrCount) {}

  @Override
  public void setCodeAttribute(ClassFile cf, Object tag, int attrIndex, String name, int attrLength) {}

  @Override
  public void setCodeAttributesDone (ClassFile cf, Object tag) {}

  @Override
  public void setLineNumberTableCount(ClassFile cf, Object tag, int lineNumberCount) {}

  @Override
  public void setLineNumber(ClassFile cf, Object tag, int lineIndex, int lineNumber, int startPc) {}

  @Override
  public void setLineNumberTableDone(ClassFile cf, Object tag) {}

  @Override
  public void setLocalVarTableCount(ClassFile cf, Object tag, int localVarCount) {}

  @Override
  public void setLocalVar(ClassFile cf, Object tag, int localVarIndex,
          String varName, String descriptor, int scopeStartPc, int scopeEndPc, int slotIndex) {}

  @Override
  public void setLocalVarTableDone (ClassFile cf, Object tag) {}

  @Override
  public void setClassAttributeCount(ClassFile cf, int attrCount) {}

  @Override
  public void setClassAttribute(ClassFile cf, int attrIndex, String name, int attrLength) {}

  @Override
  public void setClassAttributesDone(ClassFile cf) {}

  @Override
  public void setSourceFile(ClassFile cf, Object tag, String pathName) {}

  @Override
  public void setInnerClassCount(ClassFile cf, Object tag, int innerClsCount) {}

  @Override
  public void setInnerClass(ClassFile cf, Object tag, int innerClsIndex,
          String outerName, String innerName, String innerSimpleName, int accessFlags) {}

  @Override
  public void setInnerClassesDone(ClassFile cf, Object tag) {}
  
  @Override
  public void setEnclosingMethod(ClassFile cf, Object tag, String enclosingClass, String enclosingMethod, String descriptor) {}

  @Override
  public void setAnnotationCount(ClassFile cf, Object tag, int annotationCount){}

  @Override
  public void setAnnotationsDone(ClassFile cf, Object tag) {}

  @Override
  public void setAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType){}

  @Override
  public void setAnnotationValueCount(ClassFile cf, Object tag, int annotationIndex, int annotationCount) {}

  @Override
  public void setPrimitiveAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, Object val){}

  @Override
  public void setStringAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String s){}

  @Override
  public void setClassAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String typeName){}

  @Override
  public void setEnumAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName, int arrayIndex, String enumType, String enumValue){}

  @Override
  public void setAnnotationValueElementCount(ClassFile cf, Object tag, int annotationIndex, int valueIndex, 
          String elementName, int elementCount) {}

  @Override
  public void setAnnotationValueElementsDone(ClassFile cf, Object tag, int annotationIndex, int valueIndex,
          String elementName) {}

  @Override
  public void setAnnotationValuesDone(ClassFile cf, Object tag, int annotationIndex) {}

  @Override
  public void setParameterCount(ClassFile cf, Object tag, int parameterCount) {}

  @Override
  public void setParameterAnnotationCount(ClassFile cf, Object tag, int paramIndex, int annotationCount) {}

  @Override
  public void setParameterAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType) {}

  @Override
  public void setParameterAnnotationsDone(ClassFile cf, Object tag, int paramIndex) {}

  @Override
  public void setParametersDone(ClassFile cf, Object tag) {}

  @Override
  public void setSignature(ClassFile cf, Object tag, String signature) {}
}
