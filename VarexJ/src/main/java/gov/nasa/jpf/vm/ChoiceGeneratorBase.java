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

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Random;

import cmu.conditional.Conditional;
import cmu.conditional.Function;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.util.ObjectList;

/**
 * abstract root class for configurable choice generators
 */
@SuppressWarnings({"hiding","unchecked"})
public abstract class ChoiceGeneratorBase<T> implements ChoiceGenerator<T> {

  /**
   * choice randomization policies, which can be set from JPF configuration
   */
  static enum ChoiceRandomizationPolicy {
    VAR_SEED,    // randomize choices using a different seed for every JPF run 
    FIXED_SEED,  // randomize choices using a fixed seed for each JPF run (reproducible, seed can be specified as cg.seed)
    NONE         // don't randomize choices
  };
  
  static ChoiceRandomizationPolicy randomization;
  
  // the marker for the current choice used in String conversion
  public static final char MARKER = '>';
  protected static Random random = new Random(42);
  
  
  // want the id to be visible to subclasses outside package
  protected String id;
  
  // for subsequent access, there is no need to translate a JPF String object reference
  // into a host VM String anymore (we just need it for creation to look up
  // the class if this is a named CG)
  protected int idRef;
  
  // used to cut off further choice enumeration
  protected boolean isDone;
  
  // we keep a linked list of CG's
  protected ChoiceGenerator<?> prev;

  // the instruction that created this CG
  protected Conditional<Instruction> insn;

  // and the thread that executed this insn
  protected ThreadInfo ti;

  // free attributes (set on demand)
  protected Object attr;

  // answer if this is a cascaded CG, i.e. we had more than one registered
  // within the same transition. Note this is NOT set for the last CG registered
  protected boolean isCascaded;

  // in case this is initialized from a VM context
  public static void init(Config config) {

    randomization = config.getEnum("cg.randomize_choices", 
                                   ChoiceRandomizationPolicy.values(), ChoiceRandomizationPolicy.NONE);

    // if the randomize_choices is set to random then we need to 
    // pick the seed based on the system time. 

    if (randomization == ChoiceRandomizationPolicy.VAR_SEED) {
      random.setSeed(System.currentTimeMillis());
    } else if (randomization == ChoiceRandomizationPolicy.FIXED_SEED){
      long seed = config.getLong("cg.seed", 42);
      random.setSeed( seed);
    }
  }
  
  public static boolean useRandomization() {
    return (randomization != ChoiceRandomizationPolicy.NONE);
  }

  /**
   *  don't use this since it is not safe for cascaded ChoiceGenerators
   * (we need the 'id' to be as context specific as possible)
   */
  @Deprecated
  protected ChoiceGeneratorBase() {
    id = "?";
  }

  protected ChoiceGeneratorBase(String id) {
    this.id = id;
  }

  public ChoiceGeneratorBase<?> clone() throws CloneNotSupportedException {
    return (ChoiceGeneratorBase<?>)super.clone();
  }

  public ChoiceGenerator<?> deepClone() throws CloneNotSupportedException {
    ChoiceGenerator<?> clone = (ChoiceGenerator<?>) super.clone();
    // we need to deep copy the parent CG
    if (prev != null){
      clone.setPreviousChoiceGenerator( prev.deepClone());
    }
    return clone;
  }
  
  public String getId() {
    return id;
  }

  public int getIdRef() {
    return idRef;
  }

  public void setIdRef(int idRef) {
    this.idRef = idRef;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isSchedulingPoint() {
    return false;
  }

  //--- the getters and setters for the CG creation info
  public void setThreadInfo(ThreadInfo ti) {
    this.ti = ti;
  }

  public ThreadInfo getThreadInfo() {
    return ti;
  }

  public void setInsn(Conditional<Instruction> insn) {
    this.insn = insn;
  }

  public Conditional<Instruction> getInsn() {
    return insn;
  }

  public void setContext(ThreadInfo tiCreator) {
    ti = tiCreator;
    insn = tiCreator.getPC();
  }

  public Conditional<String> getSourceLocation() {
//    return insn.getSourceLocation();
    return insn.map(new Function<Instruction, String>() {
      @Override
      public String apply(Instruction x) {
        return x.getSourceLocation();
      }
    }).simplify();
  }

  public boolean supportsReordering(){
    return false;
  }
  
  /**
   * reorder according to a user provided comparator
   * @returns instance to reordered CG of same choice type, 
   * null if not supported by particular CG subclass
   * 
   * Note: this should only be called before the first advance, since it
   * can reset the CG enumeration status
   */
  public ChoiceGenerator<T> reorder (Comparator<T> comparator){
    return null;
  }
  
  public void setPreviousChoiceGenerator(ChoiceGenerator<?> cg) {
    prev = cg;
  }

  public void setCascaded() {
    isCascaded = true;
  }

  public boolean isCascaded() {
    return isCascaded;
  }

  public <C extends ChoiceGenerator<?>> C getPreviousChoiceGeneratorOfType(Class<C> cls) {
    ChoiceGenerator<?> cg = prev;

    while (cg != null) {
      if (cls.isInstance(cg)) {
        return (C) cg;
      }
      cg = cg.getPreviousChoiceGenerator();
    }
    return null;
  }

  /**
   * returns the prev CG if it was registered for the same insn
   */
  public ChoiceGenerator<?> getCascadedParent() {
    if (prev != null) {
      if (prev.isCascaded()) {
        return prev;
      }
    }

    return null;
  }

  /**
   * return array with all cascaded parents and this CG, in registration order
   */
  public ChoiceGenerator<?>[] getCascade() {
    int n = 0;
    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getCascadedParent()) {
      n++;
    }

    ChoiceGenerator<?>[] a = new ChoiceGenerator<?>[n];

    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getCascadedParent()) {
      a[--n] = cg;
    }

    return a;
  }

  /**
   * return array with all parents and this CG, in registration order
   */
  public ChoiceGenerator<?>[] getAll() {
    int n = 0;
    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getPreviousChoiceGenerator()) {
      n++;
    }

    ChoiceGenerator<?>[] a = new ChoiceGenerator<?>[n];

    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getPreviousChoiceGenerator()) {
      a[--n] = cg;
    }

    return a;
  }

  /**
   * return array with all CGs (including this one) of given 'cgType', in registration order
   */
  public <C extends ChoiceGenerator<?>> C[] getAllOfType(Class<C> cgType) {
    int n = 0;
    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getPreviousChoiceGenerator()) {
      if (cgType.isAssignableFrom(cg.getClass())) {
        n++;
      }
    }

    C[] a = (C[]) Array.newInstance(cgType, n);

    for (ChoiceGenerator<?> cg = this; cg != null; cg = cg.getPreviousChoiceGenerator()) {
      if (cgType.isAssignableFrom(cg.getClass())) {
        a[--n] = (C) cg;
      }
    }

    return a;
  }

  // we can't put the advanceForCurrentInsn() here because it has to do
  // notifications, which are the SystemState responsibility
  /**
   * advance n choices
   * pretty braindead generic solution, but if more speed is needed, we can easily override
   * in the concrete CGs (it's used for path replay)
   */
  public void advance(int nChoices) {
    while (nChoices-- > 0) {
      advance();
    }
  }

  public void select(int nChoice) {
    advance(nChoice);
    setDone();
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone() {
    isDone = true;
  }

  public boolean isProcessed() {
    return isDone || !hasMoreChoices();
  }

  //--- the generic attribute API
  public boolean hasAttr() {
    return (attr != null);
  }

  public boolean hasAttr(Class<?> attrType) {
    return ObjectList.containsType(attr, attrType);
  }

  public boolean hasAttrValue (Object a){
    return ObjectList.contains(attr, a);
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */
  public Object getAttr() {
    return attr;
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setAttr(Object a) {
    attr = a;
  }

  public void addAttr(Object a) {
    attr = ObjectList.add(attr, a);
  }

  public void removeAttr(Object a) {
    attr = ObjectList.remove(attr, a);
  }

  public void replaceAttr(Object oldAttr, Object newAttr) {
    attr = ObjectList.replace(attr, oldAttr, newAttr);
  }

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getAttr(Class<T> attrType) {
    return ObjectList.getFirst(attr, attrType);
  }

  public <T> T getNextAttr(Class<T> attrType, Object prev) {
    return ObjectList.getNext(attr, attrType, prev);
  }

  public ObjectList.Iterator attrIterator() {
    return ObjectList.iterator(attr);
  }

  public <T> ObjectList.TypedIterator<T> attrIterator(Class<T> attrType) {
    return ObjectList.typedIterator(attr, attrType);
  }

  // -- end attrs --
  public String toString() {
    StringBuilder b = new StringBuilder(getClass().getName());
    b.append(" {id:\"");
    b.append(id);
    b.append("\" ,");
    b.append(getProcessedNumberOfChoices());
    b.append('/');
    b.append(getTotalNumberOfChoices());
    b.append(",isCascaded:");
    b.append(isCascaded);

    if (attr != null) {
      b.append(",attrs:[");
      int i = 0;
      for (Object a : ObjectList.iterator(attr)) {
        if (i++ > 1) {
          b.append(',');
        }
        b.append(a);
      }
      b.append(']');
    }

    b.append('}');

    return b.toString();
  }

  public ChoiceGenerator<?> getPreviousChoiceGenerator() {
    return prev;
  }

  // override if there is special choice randomization support
  public ChoiceGenerator<T> randomize(){
    return this;
  }
}
