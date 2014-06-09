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
 * interface for classfile processors
 *
 * NOTE - all types are given ss descriptors, i.e. "Lx/y/Z;" or type codes such as "I"
 *
 * iteration groups always start with a
 *   setXCount(int xCount)
 *
 * followed by xCount notifications
 *   setX (int xIndex)
 *
 * with 0<=xIndex<xCount
 */
public interface ClassFileReader {

  void setClass(ClassFile cf, String clsName, String superClsName, int flags, int cpCount) throws ClassParseException;


  //--- interfaces
  void setInterfaceCount(ClassFile cf, int ifcCount);

  void setInterface(ClassFile cf, int ifcIndex, String ifcName);

  void setInterfacesDone(ClassFile cf);


  //--- fields
  void setFieldCount(ClassFile cf, int fieldCount);

  void setField(ClassFile cf, int fieldIndex, int accessFlags, String name, String descriptor);

  void setFieldAttributeCount(ClassFile cf, int fieldIndex, int attrCount);

  void setFieldAttribute(ClassFile cf, int fieldIndex, int attrIndex, String name, int attrLength);

  void setFieldAttributesDone(ClassFile cf, int fieldIndex);

  void setFieldDone(ClassFile cf, int fieldIndex);

  void setFieldsDone(ClassFile cf);


  //--- standard field attributes
  void setConstantValue(ClassFile cf, Object tag, Object value);


  //--- methods
  void setMethodCount(ClassFile cf, int methodCount);

  void setMethod(ClassFile cf, int methodIndex, int accessFlags, String name, String descriptor);

  void setMethodAttributeCount(ClassFile cf, int methodIndex, int attrCount);

  void setMethodAttribute(ClassFile cf, int methodIndex, int attrIndex, String name, int attrLength);

  void setMethodAttributesDone(ClassFile cf, int methodIndex);

  void setMethodDone(ClassFile cf, int methodIndex);

  void setMethodsDone(ClassFile cf);


  //--- standard method attributes
  void setExceptionCount (ClassFile cf, Object tag, int exceptionCount);

  void setException (ClassFile cf, Object tag, int exceptionIndex, String exceptionType);

  void setExceptionsDone(ClassFile cf, Object tag);

  void setCode(ClassFile cf, Object tag, int maxStack, int maxLocals, int codeLength);

  void setExceptionHandlerTableCount (ClassFile cf, Object tag, int exceptionTableCount);

  void setExceptionHandler(ClassFile cf, Object tag, int exceptionIndex, int startPc, int endPc, int handlerPc, String catchType);

  void setExceptionHandlerTableDone(ClassFile cf, Object tag);

  void setCodeAttributeCount(ClassFile cf, Object tag, int attrCount);

  void setCodeAttribute(ClassFile cf, Object tag, int attrIndex, String name, int attrLength);

  void setCodeAttributesDone (ClassFile cf, Object tag);


  //--- standard code attribute attributes (yes, attributes can be nested)
  void setLineNumberTableCount(ClassFile cf, Object tag, int lineNumberCount);
  
  void setLineNumber(ClassFile cf, Object tag, int lineIndex, int lineNumber, int startPc);

  void setLineNumberTableDone(ClassFile cf, Object tag);


  void setLocalVarTableCount(ClassFile cf, Object tag, int localVarCount);

  void setLocalVar(ClassFile cf, Object tag, int localVarIndex, String varName, String descriptor,
                      int scopeStartPc, int scopeEndPc, int slotIndex);

  void setLocalVarTableDone(ClassFile cf, Object tag);


  void setClassAttributeCount(ClassFile cf, int attrCount);

  void setClassAttribute(ClassFile cf, int attrIndex, String name, int attrLength);

  void setClassAttributesDone(ClassFile cf);


  //--- standard class attributes
  void setSourceFile(ClassFile cf, Object tag, String pathName);

  void setInnerClassCount(ClassFile cf, Object tag, int innerClsCount);

  void setInnerClass(ClassFile cf, Object tag, int innerClsIndex, String outerName, String innerName, String innerSimpleName, int accessFlags);

  void setInnerClassesDone (ClassFile cf, Object tag);

  void setEnclosingMethod(ClassFile cf, Object tag, String enclosingClass, String enclosingMethod, String descriptor);
  
  //--- annotations
  void setAnnotationCount(ClassFile cf, Object tag, int annotationCount);

  void setAnnotationsDone(ClassFile cf, Object tag);


  void setAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType);

  void setAnnotationValueCount(ClassFile cf, Object tag, int annotationIndex, int nValuePairs);

  void setPrimitiveAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName, int arrayIndex, Object val);

  void setStringAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName, int arrayIndex, String s);

  void setClassAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName, int arrayIndex, String typeName);

  void setEnumAnnotationValue(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName, int arrayIndex,
          String enumType, String enumValue);

  void setAnnotationValueElementCount(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName, int elementCount);

  void setAnnotationValueElementsDone(ClassFile cf, Object tag, int annotationIndex, int valueIndex, String elementName);

  void setAnnotationValuesDone(ClassFile cf, Object tag, int annotationIndex);

  void setParameterCount(ClassFile cf, Object tag, int parameterCount);

  void setParameterAnnotationCount(ClassFile cf, Object tag, int paramIndex, int annotationCount);

  void setParameterAnnotation(ClassFile cf, Object tag, int annotationIndex, String annotationType);

  void setParameterAnnotationsDone(ClassFile cf, Object tag, int paramIndex);

  void setParametersDone(ClassFile cf, Object tag);


  void setSignature(ClassFile cf, Object tag, String signature);
}
