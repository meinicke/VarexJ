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

import gov.nasa.jpf.util.ObjectList;

import java.util.Comparator;

/**
 * generic interface for configurable choice generators
 */
public interface ChoiceGenerator<T> extends Cloneable {

  //--- the basic ChoiceGenerator interface, mostly used by SystemState

  T getNextChoice();

  Class<T> getChoiceType();

  boolean hasMoreChoices();

  /**
   * advance to the next choice. This is the only method that really
   * advances our enumeration
   */
  void advance();

  void advance(int nChoices);

  void select(int nChoice);

  boolean isDone();

  void setDone();

  boolean isProcessed();

  /**
   *  this has to reset the CG to its initial state, which includes resetting
   * 'isDone'
   */
  void reset();

  int getTotalNumberOfChoices();

  int getProcessedNumberOfChoices();

  ChoiceGenerator<?> getPreviousChoiceGenerator();

  /**
   * turn the order of choices random (if it isn't already). Only
   * drawback of this generic method (which might be a decorator
   * factory) is that our type layer (e.g. IntChoiceGenerator)
   * has to guarantee type safety. But hey - this is the first case where
   * we can use covariant return types!
   *
   * NOTES:
   * - this method may alter this ChoiceGenerator and return that or return
   * a new "decorated" version.
   * - random data can be read from the "Random random" field in this class.
   */
  ChoiceGenerator<T> randomize();

  ChoiceGenerator<?> clone() throws CloneNotSupportedException;

  ChoiceGenerator<?> deepClone() throws CloneNotSupportedException; 
  
  String getId();

  int getIdRef();

  void setIdRef(int idRef);

  void setId(String id);

  boolean isSchedulingPoint();

  //--- the getters and setters for the CG creation info
  void setThreadInfo(ThreadInfo ti);

  ThreadInfo getThreadInfo();

  void setInsn(Instruction insn);

  Instruction getInsn();

  void setContext(ThreadInfo tiCreator);

  String getSourceLocation();

  boolean supportsReordering();
  
  /**
   * reorder according to a user provided comparator
   * @returns instance to reordered CG of same choice type, 
   * null if not supported by particular CG subclass
   * 
   * Note: this should only be called before the first advance, since it
   * can reset the CG enumeration status
   */
  ChoiceGenerator<T> reorder (Comparator<T> comparator);
  
  void setPreviousChoiceGenerator(ChoiceGenerator<?> cg);

  
  void setCascaded();

  boolean isCascaded();

  <T extends ChoiceGenerator<?>> T getPreviousChoiceGeneratorOfType(Class<T> cls);

  /**
   * returns the prev CG if it was registered for the same insn
   */
  ChoiceGenerator<?> getCascadedParent();

  /**
   * return array with all cascaded parents and this CG, in registration order
   */
  ChoiceGenerator<?>[] getCascade();

  /**
   * return array with all parents and this CG, in registration order
   */
  ChoiceGenerator<?>[] getAll();

  /**
   * return array with all CGs (including this one) of given 'cgType', in registration order
   */
  <C extends ChoiceGenerator<?>> C[] getAllOfType(Class<C> cgType);


  //--- the generic attribute API
  boolean hasAttr();

  boolean hasAttr(Class<?> attrType);

  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */
  Object getAttr();

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  void setAttr(Object a);

  void addAttr(Object a);

  void removeAttr(Object a);

  void replaceAttr(Object oldAttr, Object newAttr);

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  <A> A getAttr(Class<A> attrType);

  <A> A getNextAttr(Class<A> attrType, Object prev);

  ObjectList.Iterator attrIterator();

  <A> ObjectList.TypedIterator<A> attrIterator(Class<A> attrType);

}
