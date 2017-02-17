//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top() of the distribution
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

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

import cmu.conditional.Conditional;
import java.util.function.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.util.BitSet64;
import gov.nasa.jpf.util.FixedBitSet;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.Misc;
import gov.nasa.jpf.util.OATHash;
import gov.nasa.jpf.util.ObjectList;
import gov.nasa.jpf.util.PrintUtils;
import gov.nasa.jpf.vm.va.IStackHandler;
import gov.nasa.jpf.vm.va.StackHandlerFactory;


/**
 * Describes callerSlots stack frame.
 *
 * Java methods always have bounded local and operand stack sizes, computed
 * at compile time, stored in the classfile, and checked at runtime by the
 * bytecode verifier. Consequently, we combine locals and operands in one
 * data structure with the following layout
 *
 *   slot[0]                : 'this'
 *   ..                          .. local vars
 *   slot[stackBase-1]      : last local var
 *   slot[stackBase]        : first operand slot
 *   ..    ^
 *   ..    | operand stack range
 *   ..    v
 *   slot[top()]              : highest used operand slot
 *
 */
public abstract class StackFrame implements Cloneable {
  
	protected FeatureExpr TRUE = FeatureExprFactory.True();// TODO remove
	
  /**
   * this StackFrame is not allowed to be modified anymore because it has been state stored.
   * Set during state storage and checked upon each modification, causing exceptions on attempts
   * to modify callerSlots frozen instance. The flag is reset in clones
   */
  public static final int   ATTR_IS_FROZEN  = 0x100;  
  static final int ATTR_IS_REFLECTION = 0x1000;  
   /**
    * the previous StackFrame (usually the caller, null if first). To be set when
    * the frame is pushed on the ThreadInfo callstack
    */
  protected StackFrame prev;

  /**
   * state management related attributes similar to ElementInfo. The lower 16 bits
   * are stored/restored, the upper 16 bits are for transient use
   */
  protected int attributes;

  
//  protected int top();                // top() index of the operand stack (NOT size)
                                    // this points to the last pushed value

  protected Conditional<Integer> thisRef = One.MJIEnvNULL;       // slots[0] can change, but we have to keep 'this'
  protected int stackBase;          // index where the operand stack begins

//  protected int[] slots;            // the combined local and operand slots
//  protected FixedBitSet isRef;      // which slots contain references

  protected Object frameAttr;       // optional user attrs for the whole frame
  
  /*
   * This array can be used to store attributes (e.g. variable names) for
   * operands. We don't do anything with this except of preserving it (across
   * dups etc.), so it's pretty much up to the VM listeners/peers what's stored
   *
   * NOTE: attribute values are not restored upon backtracking per default, but
   * attribute references are. If you need restoration of values, use copy-on-write
   * in your clients
   *
   * these are set on demand
   */
  protected Object[] attrs = null;  // the combined user-defined callerSlots (set on demand)

  protected Conditional<Instruction> pc;         // the next insn to execute (program counter)
  protected MethodInfo mi;          // which method is executed in this frame

  public IStackHandler stack;

public int nLocals;

	/**
	 * Buffer for the stack depth.
	 */
	private int depth = 0;

  protected int top() {// TODO remove
	  return stack.getTop().getValue() + nLocals;	
  }

  static final int[] EMPTY_ARRAY = new int[0];
  static final FixedBitSet EMPTY_BITSET = new BitSet64();
  
  

  protected StackFrame (FeatureExpr ctx, MethodInfo callee, int nLocals, int nOperands){
    mi = callee;
    pc = new One<>(mi.getInstruction(0)); // ???
    this.nLocals = nLocals;
    stackBase = nLocals;
//    int top() = nLocals-1;

    stack = StackHandlerFactory.createStack(ctx, nLocals, nOperands);
//    int nSlots = nLocals + nOperands;
//    if (nSlots > 0){
//      slots = new int[nLocals + nOperands];
//      isRef = createReferenceMap(stack.length);
//    } else {
//      // NativeStackFrames don't use locals or operands, but we
//      // don't want to add tests to all our methods
//      slots = EMPTY_ARRAY;
//      isRef = EMPTY_BITSET;
//    }
  }
  
  public StackFrame (MethodInfo callee){
    this( FeatureExprFactory.True(), callee, callee.getMaxLocals(), callee.getMaxStack());
  }
  
  public StackFrame(FeatureExpr ctx, MethodInfo callee) {
	  this( ctx, callee, callee.getMaxLocals(), callee.getMaxStack());
  }



  /**
   * Creates an empty stack frame. Used by clone.
   */
  protected StackFrame () {
  }

  /**
   * creates callerSlots dummy Stackframe for testing of operand/local operations
   * NOTE - TESTING ONLY! this does not have a MethodInfo
   */
  protected StackFrame (int nLocals, int nOperands){
    stackBase = nLocals;
    this.nLocals = nLocals;
    stack = StackHandlerFactory.createStack(FeatureExprFactory.True(), nLocals, nOperands);
  }
  
  

/**
   * re-execute method from the beginning - use with care
   */
  public void reset() {
    pc = new One<>(mi.getInstruction(0)); // TODO ???
  }  
  
  public boolean isNative() {
    return false;
  }
  
	public StackFrame getCallerFrame() {
		MethodInfo callee = mi;
		for (StackFrame frame = getPrevious(); frame != null; frame = frame.getPrevious()) {
			Instruction insn = frame.getPC().getValue();
			if (insn instanceof InvokeInstruction) {
				InvokeInstruction call = (InvokeInstruction) insn;
				if (call.getInvokedMethod() == callee) {
					return frame;
				}
			}
		}

		return null;
	}
  
  /**
   * return the object reference for an instance method to be called (we are still in the
   * caller's frame). This only makes sense after all params have been pushed, before the
   * INVOKEx insn is executed
   */
  public Conditional<Integer> getCalleeThis (FeatureExpr ctx, MethodInfo mi) {
    return getCalleeThis(ctx, mi.getArgumentsSize());
  }

  /**
   * return reference of called object in the context of the caller
   * (i.e. we are in the caller frame)
   */
  public Conditional<Integer> getCalleeThis (FeatureExpr ctx, int size) {
    // top() is the topmost index
    int i = size-1;
    return stack.peek(ctx, i);
    
//    if (top() < i) {
//      return new One<>(-1);
//    }
//    return new One<>(slots[top-i]);
  }

  public StackFrame getPrevious() {
    return prev;
  }
  
  /**
   * to be set (by ThreadInfo) when the frame is pushed. Can also be used
   * for non-local gotos, but be warned - that's tricky
   */
  public void setPrevious (StackFrame frame){
    prev = frame;
  }

  public Object getLocalOrFieldValue (String id) {
    // try locals first
    LocalVarInfo lv = mi.getLocalVar(id, pc.getValue().getPosition());
    if (lv != null){
      return getLocalValueObject(lv);
    }

    // then fields
    return getFieldValue(id);
  }

  public Object getLocalValueObject (LocalVarInfo lv) {
    if (lv != null) { // might not have been compiled with debug info
      String sig = lv.getSignature();
      int slotIdx = lv.getSlotIndex();
      int v = stack.getLocal(TRUE, slotIdx).getValue();//slots[slotIdx];

      switch (sig.charAt(0)) {
        case 'Z':
          return Boolean.valueOf(v != 0);
        case 'B':
          return Byte.valueOf((byte) v);
        case 'C':
          return Character.valueOf((char) v);
        case 'S':
          return Short.valueOf((short) v);
        case 'I':
          return Integer.valueOf(v);
        case 'J':
          return Long.valueOf(Types.intsToLong(stack.getLocal(TRUE, slotIdx + 1).getValue(), v)); // Java is big endian, Types expects low,high
        case 'F':
          return Float.valueOf(Float.intBitsToFloat(v));
        case 'D':
          return Double.valueOf(Double.longBitsToDouble(Types.intsToLong(stack.getLocal(TRUE, slotIdx + 1).getValue(), v)));
        default:  // reference
          if (v >= 0) {
            return VM.getVM().getHeap().get(v);
          }
      }
    }

    return null;
  }

  public Object getFieldValue (String id) {
    // try instance fields first
    if (thisRef.getValue() != MJIEnv.NULL) {  // it's an instance method
      ElementInfo ei = VM.getVM().getHeap().get(thisRef.getValue());
      Object v = ei.getFieldValueObject(id);
      if (v != null) {
        return v;
      }
    }

    // check static fields (in method class and its superclasses)
    return mi.getClassInfo().getStaticFieldValueObject(id);
  }

  public ClassInfo getClassInfo () {
    return mi.getClassInfo();
  }

  public String getClassName () {
    return mi.getClassInfo().getName();
  }

  public String getSourceFile () {
    return mi.getClassInfo().getSourceFileName();
  }

  /**
   * does any of the 'nTopSlots' hold callerSlots reference value of 'objRef'
   * 'nTopSlots' is usually obtained from MethodInfo.getNumberOfCallerStackSlots()
   */
  public boolean includesReferenceOperand (int nTopSlots, int objRef){

    for (int i=0, j=top()-nTopSlots+1; i<nTopSlots && j>=0; i++, j++) {
      if (stack.isRefLocal(TRUE, j) && (stack.getLocal(TRUE, j).getValue().intValue() == objRef)){
        return true;
      }
    }

    return false;
  }

  /**
   * does any of the operand slots hold callerSlots reference value of 'objRef'
   */
  public boolean includesReferenceOperand (int objRef){

    for (int i=stackBase; i<=top(); i++) {
    	if (stack.isRefLocal(TRUE, i) && (stack.getLocal(TRUE, i).getValue().intValue() == objRef)){
        return true;
      }
    }

    return false;
  }

  /**
   * is this StackFrame modifying the KernelState
   * this is true unless this is callerSlots NativeStackFrame
   */
  public boolean modifiesState() {
    return true;
  }

  public boolean isDirectCallFrame () {
    return false;
  }

  public boolean isSynthetic() {
    return false;
  }

  // gets and sets some derived information
  public int getLine () {
    return mi.getLineNumber(pc.getValue());
  }


  /**
   * generic visitor for reference arguments
   */
  public void processRefArguments (MethodInfo miCallee, ReferenceProcessor visitor){
    int nArgSlots = miCallee.getArgumentsSize();

    for (int i=top()-1; i>=top()-nArgSlots; i--){
      if (stack.isRefLocal(TRUE, i)){
        visitor.processReference(stack.getLocal(TRUE, i).getValue());
      }
    }
  }

  public int getSlot(int idx){
    return stack.getLocal(TRUE, idx).getValue();
  }
  public boolean isReferenceSlot(FeatureExpr ctx, int idx){
    return stack.isRefLocal(ctx, idx);
  }


  public void setOperand (int offset, int v, boolean isRefValue){
//    int i = top()-offset;
//    stack.get(i) = v;
//  isRef.set(i, isRefValue);
    stack.set(TRUE, offset, v, isRefValue);
  }

  
  //----------------------------- various attribute accessors

  public boolean hasAttrs () {
    return attrs != null;
  }

  public boolean hasFrameAttr(){
    return frameAttr != null;
  }
  
  public boolean hasFrameAttr (Class<?> attrType){
    return ObjectList.containsType(frameAttr, attrType);
  }
  
  public boolean hasFrameAttrValue (Object a){
    return ObjectList.contains(frameAttr, a);
  }
  
  //--- the frame attr accessors 
  
 /**
   * this returns all of them - use either if you know there will be only
   * one attribute at callerSlots time, or check/process result with ObjectList
   */
  public Object getFrameAttr(){
    return frameAttr;
  }

  /**
   * this replaces all of them - use only if you know there are no 
   * SystemAttributes in the list (which would cause an exception)
   */
  public void setFrameAttr (Object attr){
    frameAttr = ObjectList.set(frameAttr, attr);    
  }

  public void addFrameAttr (Object attr){
    frameAttr = ObjectList.add(frameAttr, attr);
  }

  public void removeFrameAttr (Object attr){
    frameAttr = ObjectList.remove(frameAttr, attr);
  }

  public void replaceFrameAttr (Object oldAttr, Object newAttr){
    frameAttr = ObjectList.replace(frameAttr, oldAttr, newAttr);
  }

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getFrameAttr (Class<T> attrType) {
    return ObjectList.getFirst(frameAttr, attrType);
  }

  public <T> T getNextFrameAttr (Class<T> attrType, Object prev) {
    return ObjectList.getNext(frameAttr, attrType, prev);
  }

  public ObjectList.Iterator frameAttrIterator(){
    return ObjectList.iterator(frameAttr);
  }
  
  public <T> ObjectList.TypedIterator<T> frameAttrIterator(Class<T> attrType){
    return ObjectList.typedIterator(frameAttr, attrType);
  }

  
  
  //--- the top() single-slot operand attrs

  public boolean hasOperandAttr(){
    if ((top() >= stackBase) && (attrs != null)){
      return (attrs[top()] != null);
    }
    return false;
  }
  public boolean hasOperandAttr(Class<?> type){
    if ((top() >= stackBase) && (attrs != null)){
      return ObjectList.containsType(attrs[top()], type);
    }
    return false;
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at callerSlots time, or check/process result with ObjectList
   */
  public Object getOperandAttr (FeatureExpr ctx) {
    if (attrs != null && (getTopPos(ctx) >= stackBase)){
      return attrs[getTopPos(ctx)];
    }
    return null;
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at callerSlots time
   *  - you obtained the value you set by callerSlots previous getXAttr()
   *  - you constructed callerSlots multi value list with ObjectList.createList()
   */
  public void setOperandAttr (Object a){
    assert (top() >= stackBase);
    if (attrs == null) {
      if (a == null) {
		return;
	}
      attrs = new Object[stack.getLength()];
    }
    attrs[top()] = a;
  }

  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getOperandAttr (Class<T> attrType){
    assert (top() >= stackBase);
    
    if ((attrs != null)){
      return ObjectList.getFirst( attrs[top()], attrType);
    }
    return null;
  }
  public <T> T getNextOperandAttr (Class<T> attrType, Object prev){
    assert (top() >= stackBase);
    if (attrs != null){
      return ObjectList.getNext( attrs[top()], attrType, prev);
    }
    return null;
  }
  public Iterator<?> operandAttrIterator(){
    assert (top() >= stackBase);
    Object a = (attrs != null) ? attrs[top()] : null;
    return ObjectList.iterator(a);
  }
  public <T> Iterator<T> operandAttrIterator(Class<T> attrType){
    assert (top() >= stackBase);
    Object a = (attrs != null) ? attrs[top()] : null;
    return ObjectList.typedIterator(a, attrType);
  }
  

  public void addOperandAttr (Object a){
    assert (top() >= stackBase);
    if (a != null){
      if (attrs == null) {
        attrs = new Object[stack.getLength()];
      }

      attrs[top()] = ObjectList.add(attrs[top()], a);
    }        
  }
  
  public void removeOperandAttr (Object a){
    assert (top() >= stackBase) && (a != null);
    if (attrs != null){
      attrs[top()] = ObjectList.remove(attrs[top()], a);
    }        
  }
  
  public void replaceOperandAttr (Object oldAttr, Object newAttr){
    assert (top() >= stackBase) && (oldAttr != null) && (newAttr != null);
    if (attrs != null){
      attrs[top()] = ObjectList.replace(attrs[top()], oldAttr, newAttr);
    }        
  }
  
  
  //--- offset operand attrs

  public boolean hasOperandAttr(int offset){
    int i = top()-offset;
    assert (i >= stackBase);
    if (attrs != null){
      return (attrs[i] != null);
    }
    return false;
  }
  public boolean hasOperandAttr(int offset, Class<?> type){
    int i = top()-offset;
    assert (i >= stackBase);
    if (attrs != null){
      return ObjectList.containsType(attrs[i], type);
    }
    return false;
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at callerSlots time, or check/process result with ObjectList
   */
  public Object getOperandAttr (FeatureExpr ctx, int offset) {
    int i = getTopPos(ctx)-offset;
    assert (i >= stackBase);
    
    if (attrs != null) {
      return attrs[i];
    }
    return null;
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at callerSlots time
   *  - you obtained the value you set by callerSlots previous getXAttr()
   *  - you constructed callerSlots multi value list with ObjectList.createList()
   */  
  public void setOperandAttr (int offset, Object a){
    int i = top()-offset;
    assert (i >= stackBase);

    if (attrs == null) {
      if (a == null) {
		return;
	}
      attrs = new Object[stack.getLength()];
    }
    attrs[i] = a;
  }

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getOperandAttr (int offset, Class<T> attrType){
    int i = top()-offset;
    assert (i >= stackBase);
    if (attrs != null){
      return ObjectList.getFirst( attrs[i], attrType);
    }
    return null;
  }
  public <T> T getNextOperandAttr (int offset, Class<T> attrType, Object prev){
    int i = top()-offset;
    assert (i >= stackBase);
    if (attrs != null){
      return ObjectList.getNext( attrs[i], attrType, prev);
    }
    return null;
  }
  public ObjectList.Iterator operandAttrIterator(int offset){
    int i = top()-offset;
    assert (i >= stackBase);
    Object a = (attrs != null) ? attrs[i] : null;
    return ObjectList.iterator(a);
  }
  public <T> ObjectList.TypedIterator<T> operandAttrIterator(int offset, Class<T> attrType){
    int i = top()-offset;
    assert (i >= stackBase);
    Object a = (attrs != null) ? attrs[i] : null;
    return ObjectList.typedIterator(a, attrType);
  }


  public void addOperandAttr (int offset, Object a){
    int i = top()-offset;
    assert (i >= stackBase);

    if (a != null){
      if (attrs == null) {
        attrs = new Object[stack.getLength()];
      }
      attrs[i] = ObjectList.add(attrs[i],a);
    }    
  }

  public void removeOperandAttr (int offset, Object a){
    int i = top()-offset;
    assert (i >= stackBase) && (a != null);
    if (attrs != null){
      attrs[i] = ObjectList.remove(attrs[i], a);
    }        
  }
  
  public void replaceOperandAttr (int offset, Object oldAttr, Object newAttr){
    int i = top()-offset;
    assert (i >= stackBase) && (oldAttr != null) && (newAttr != null);
    if (attrs != null){
      attrs[i] = ObjectList.replace(attrs[i], oldAttr, newAttr);
    }        
  }
  
  
  //--- top() double-slot operand attrs
  // we store attributes for double slot values at the local var index,
  // which is the lower one. The ..LongOperand.. APIs are handling this offset
 
  public boolean hasLongOperandAttr(){
    return hasOperandAttr(1);
  }
  public boolean hasLongOperandAttr(Class<?> type){
    return hasOperandAttr(1, type);
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at callerSlots time, or check/process result with ObjectList
   */
  public Object getLongOperandAttr (FeatureExpr ctx) {
    return getOperandAttr(ctx, 1);
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at callerSlots time
   *  - you obtained the value you set by callerSlots previous getXAttr()
   *  - you constructed callerSlots multi value list with ObjectList.createList()
   */  
  public void setLongOperandAttr (Object a){
    setOperandAttr(1, a);
  }
  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getLongOperandAttr (Class<T> attrType) {
    return getOperandAttr(1, attrType);
  }
  public <T> T getNextLongOperandAttr (Class<T> attrType, Object prev) {
    return getNextOperandAttr(1, attrType, prev);
  }
  public ObjectList.Iterator longOperandAttrIterator(){
    return operandAttrIterator(1);
  }
  public <T> ObjectList.TypedIterator<T> longOperandAttrIterator(Class<T> attrType){
    return operandAttrIterator(1, attrType);
  }
    
  public void addLongOperandAttr (Object a){
    addOperandAttr(1, a);
  }

  public void removeLongOperandAttr (Object a){
    removeOperandAttr(1, a);
  }

  public void replaceLongOperandAttr (Object oldAttr, Object newAttr){
    replaceOperandAttr(1, oldAttr, newAttr);
  }


  //--- local attrs
  // single- or double-slot - you have to provide the var index anyways)
  
  public boolean hasLocalAttr(int index){
    assert index < stackBase;
    if (attrs != null){
      return (attrs[index] != null);
    }
    return false;
  }
  public boolean hasLocalAttr(int index, Class<?> type){
    assert index < stackBase;
    if (attrs != null){
      return ObjectList.containsType(attrs[index], type);
    }
    return false;
  }

  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at callerSlots time, or check/process result with ObjectList
   */
  public Object getLocalAttr (int index){
    assert index < stackBase;
    if (attrs != null){
      return attrs[index];
    }
    return null;
  }
   
  public Object getLongLocalAttr (int index){
    return getLocalAttr( index);
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at callerSlots time
   *  - you obtained the value you set by callerSlots previous getXAttr()
   *  - you constructed callerSlots multi value list with ObjectList.createList()
   */  
  public void setLocalAttr (int index, Object a) {
    assert index < stackBase;
    if (attrs == null){
      if (a == null) {
		return;
	}
      attrs = new Object[stack.getLength()];
    }
    attrs[index] = a;
  }

  public void setLongLocalAttr (int index, Object a){
    setLocalAttr( index, a);
  }
  
  public void addLongLocalAttr (int index, Object a){
    addLocalAttr( index, a);
  }
  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getLocalAttr (int index, Class<T> attrType){
    assert index < stackBase;
    if (attrs != null){
      return ObjectList.getFirst( attrs[index], attrType);
    }
    return null;
  }
  public <T> T getNextLocalAttr (int index, Class<T> attrType, Object prev){
    assert index < stackBase;
    if (attrs != null){
      return ObjectList.getNext( attrs[index], attrType, prev);
    }
    return null;
  }
  public ObjectList.Iterator localAttrIterator(int index){
    assert index < stackBase;
    Object a = (attrs != null) ? attrs[index] : null;
    return ObjectList.iterator(a);
  }
  public <T> ObjectList.TypedIterator<T> localAttrIterator(int index, Class<T> attrType){
    assert index < stackBase;
    Object a = (attrs != null) ? attrs[index] : null;
    return ObjectList.typedIterator(a, attrType);
  }
  

  public void addLocalAttr (int index, Object attr){
    assert index < stackBase;
    if (attrs == null){
      if (attr == null) {
		return;
	}
      attrs = new Object[stack.getLength()];
    }
    attrs[index] = ObjectList.add(attrs[index], attr);
  }
  
  public void removeLocalAttr (int index, Object attr){
    assert index < stackBase && attr != null;
    if (attr != null){
      attrs[index] = ObjectList.remove(attrs[index], attr);    
    }
  }

  public void replaceLocalAttr (int index, Object oldAttr, Object newAttr){
    assert index < stackBase && oldAttr != null && newAttr != null;
    if (attrs != null){
      attrs[index] = ObjectList.replace(attrs[index], oldAttr, newAttr);    
    }
  }
  
  //--- various special attr accessors

  /**
   * helper to quickly find out if any of the locals slots holds
   * an attribute of the provided type
   * 
   * @param attrType type of attribute to look for
   * @param startIdx local index to start from
   * @return index of local slot with attribute, -1 if none found
   */
  public int getLocalAttrIndex (Class<?> attrType, int startIdx){
    if (attrs != null){
      for (int i=startIdx; i<stackBase; i++){
        Object a = attrs[i];
        if (ObjectList.containsType(a, attrType)){
          return i;
        }
      }
    }

    return -1;
  }
  
  /**
   * this retrieves the argument values from the caller, i.e. the previous stackframe 
   * 
   * references are returned as ElementInfos or null
   * primitive values are returned as box objects (e.g. int -> Integer)
   */
  public Object[] getArgumentValues (ThreadInfo ti){
    StackFrame callerFrame = getCallerFrame();
    if (callerFrame != null){
      return callerFrame.getCallArguments(ti);
    } else {
      // <2do> what about main(String[] args) ?
    }
    
    return null;
  }
  
  /**
   * get the arguments of the executed call
   * Note - this throws an exception if the StackFrame pc is not an InvokeInstruction
   */
  public Object[] getCallArguments (ThreadInfo ti){
    if (pc == null || !(pc.getValue() instanceof InvokeInstruction)){
      throw new JPFException("stackframe not executing invoke: " + pc);
    }
    
    InvokeInstruction call = (InvokeInstruction) pc.getValue();    
    MethodInfo callee = call.getInvokedMethod();

    byte[] argTypes = callee.getArgumentTypes();

    return getArgumentsValues(ti, argTypes);
  }

  public Object[] getArgumentsValues (ThreadInfo ti, byte[] argTypes){
    int n = argTypes.length;
    Object[] args = new Object[n];
    FeatureExpr ctx = null;
    for (int i=n-1, off=0; i>=0; i--) {
      switch (argTypes[i]) {
      case Types.T_ARRAY:
      //case Types.T_OBJECT:
      case Types.T_REFERENCE:
        int ref = peek(ctx, off).getValue();
        if (ref != MJIEnv.NULL) {
          args[i] = ti.getElementInfo(ref);
        } else {
          args[i] = null;
        }
        off++;
        break;

      case Types.T_LONG:
        args[i] = new Long(peekLong(ctx, off).getValue());
        off+=2;
        break;
      case Types.T_DOUBLE:
        args[i] = new Double(Types.longToDouble(peekLong(ctx, off).getValue()));
        off+=2;
        break;

      case Types.T_BOOLEAN:
        args[i] = new Boolean(peek(ctx, off).getValue().intValue() != 0);
        off++;
        break;
      case Types.T_BYTE:
        args[i] = new Byte((byte)peek(ctx, off).getValue().intValue());
        off++;
        break;
      case Types.T_CHAR:
        args[i] = new Character((char)peek(ctx, off).getValue().intValue());
        off++;
        break;
      case Types.T_SHORT:
        args[i] = new Short((short)peek(ctx, off).getValue().intValue());
        off++;
        break;
      case Types.T_INT:
        args[i] = new Integer(peek(ctx, off).getValue().intValue());
        off++;
        break;
      case Types.T_FLOAT:
        args[i] = new Float(Types.intToFloat(peek(ctx, off).getValue().intValue()));
        off++;
        break;
      default:
        // error, unknown argument type
      }
    }
    return args;
  }
  
  /**
   * return an array of all argument attrs, which in turn can be lists. If
   * you have to retrieve values, use the ObjectList APIs
   * 
   * this is here (and not in ThreadInfo) because we might call it
   * on callerSlots cached/cloned StackFrame (caller stack might be already
   * modified, e.g. for callerSlots native method).
   * to be used from listeners.
   */
  public Object[] getArgumentAttrs (MethodInfo miCallee) {
    if (attrs != null) {
      int nArgs = miCallee.getNumberOfArguments();
      byte[] at = miCallee.getArgumentTypes();
      Object[] a;

      if (!miCallee.isStatic()) {
        a = new Object[nArgs+1];
        a[0] = getOperandAttr(TRUE, miCallee.getArgumentsSize()-1);
      } else {
        a = new Object[nArgs];
      }

      for (int i=nArgs-1, off=0, j=a.length-1; i>=0; i--, j--) {
        byte argType = at[i];
        if (argType == Types.T_LONG || argType == Types.T_DOUBLE) {
          a[j] = getOperandAttr(TRUE, off+1);
          off +=2;
        } else {
          a[j] = getOperandAttr(TRUE, off);
          off++;
        }
      }

      return a;

    } else {
      return null;
    }
  }

  /**
   * check if there is any argument attr of the provided type on the operand stack
   * this is far more efficient than retrieving attribute values (we don't
   * care for argument types)
   */
  public boolean hasArgumentAttr (MethodInfo miCallee, Class<?> attrType){
    if (attrs != null) {
      int nArgSlots = miCallee.getArgumentsSize();

      for (int i=0; i<nArgSlots; i++){
        Object a = getOperandAttr(TRUE, i);
        if (ObjectList.containsType(a, attrType)){
          return true;
        }
      }
    }

    return false;
  }

  
  // -- end attrs --
  
  public void setLocalReferenceVariable (FeatureExpr ctx, int index, int ref){
    if (stack.getLocal(ctx, index).getValue().intValue() != MJIEnv.NULL){
      VM.getVM().getSystemState().activateGC();
    }
    
    stack.setLocal(ctx, index, ref, true);
    
//    stack.get(index) = ref;
//    isRef.set(index);
  }

  public void setLocalVariable (FeatureExpr ctx, int index, int v){
    // Hmm, should we treat this an error?
    if (stack.isRefLocal(ctx, index) && stack.getLocal(ctx, index).getValue().intValue() != MJIEnv.NULL){
      VM.getVM().getSystemState().activateGC();      
    }
    
    stack.setLocal(ctx, index, v, false);
    
//    stack.get(index) = v;
//    isRef.clear(index);
  }
  
  public void setFloatLocalVariable (FeatureExpr ctx, int index, float f){
    setLocalVariable( ctx, index, Float.floatToIntBits(f));
  }

  public void setDoubleLocalVariable (FeatureExpr ctx, int index, double f){
    setLongLocalVariable(ctx, index, Double.doubleToLongBits(f));
  }

  
  // <2do> replace with non-ref version
  public void setLocalVariable (FeatureExpr ctx, int index, Conditional<Integer> v, boolean ref) {
    // <2do> activateGc should be replaced by local refChanged
    boolean activateGc = ref || (stack.isRefLocal(ctx, index) && (stack.getLocal(ctx, index).getValue().intValue() != MJIEnv.NULL));

    stack.setLocal(ctx, index, v, ref);
//    stack.get(index) = v;
//    isRef.set(index,ref);

    if (activateGc) {
        VM.getVM().getSystemState().activateGC();
    }
  }

  public Conditional<Integer> getLocalVariable (FeatureExpr ctx, int i) {
    return stack.getLocal(ctx, i);
  }

  public int getLocalVariable (String name) {//JM UNUSED
    int idx = getLocalVariableSlotIndex(name);
    if (idx >= 0) {
      return getLocalVariable(TRUE, idx).getValue();
    } else {
      throw new JPFException("local variable not found: " + name);
    }
  }

  public int getLocalVariableCount() {
    return stackBase;
  }

  /**
   * <2do> - this should return only LocalVarInfo for the current pc
   */
  public LocalVarInfo[] getLocalVars () {
    return mi.getLocalVars();
  }


  public boolean isLocalVariableRef (FeatureExpr ctx, int idx) {
    return stack.isRefLocal(ctx, idx);
  }

  public String getLocalVariableType (String name) {
    LocalVarInfo lv = mi.getLocalVar(name, pc.getValue().getPosition()+pc.getValue().getLength());
    if (lv != null){
      return lv.getType();
    }

    return null;
  }

  public String getLocalVariableType (int idx){
    LocalVarInfo lv = mi.getLocalVar(idx, pc.getValue().getPosition()+pc.getValue().getLength());
    if (lv != null){
      return lv.getType();
    }

    return null;
  }

  public LocalVarInfo getLocalVarInfo (String name){
    return mi.getLocalVar(name, pc.getValue().getPosition()+pc.getValue().getLength());
  }

  public LocalVarInfo getLocalVarInfo (int idx){
    return mi.getLocalVar(idx, pc.getValue().getPosition()+pc.getValue().getLength());
  }


  //--- use with extreme care - don't modify outside of StackFrame construction. THIS IS ONLY FOR INTERNAL USE
  /*
   * ths main reason for breaking encapsulation with these methods is that we need an API that allows efficient
   * initialization of slots from VM mode dependent invoke instructions. Argument passing differs between VMs
   */
  public int[] getSlots () {
    return stack.getSlots(); // we should probably clone
  }
//  public FixedBitSet getReferenceMap(){
//    throw new RuntimeException("Remove this call");
//  }
  
  public Object[] getSlotAttrs(){
    return attrs;
  }
  public Object getSlotAttr (int i){
    if (attrs != null){
      return attrs[i];
    }
    return null;
  }
  public void setSlotAttr (int i, Object a){
    if (attrs == null){
      attrs = new Object[stack.getLength()];
    }
    attrs[i] = a;
  }
  public void setThis (Conditional<Integer> thisRef2){
    thisRef = thisRef2;
  }
  

  public void visitReferenceSlots (ReferenceProcessor visitor){ 
    for (int i=0; i>=0 && i<=top(); i++){
    	if (stack.isRefLocal(TRUE, i)) {
    		visitor.processReference(stack.getLocal(TRUE, i).getValue());
    	}
    }
  }

  public void setLongLocalVariable (FeatureExpr ctx, int index, long v) {//JM UNUSED
    // WATCH OUT: apparently, slots can change type, so we have to
    // reset the reference flag (happened in JavaSeq)

    stack.setLocal(ctx, index, Types.hiLong(v), false);// = Types.hiLong(v);
//    stack.setRef(index, false);
//    isRef.clear(index);

    index++;
    stack.setLocal(ctx, index, Types.loLong(v), false);
//    stack.setRef(index, false);
//    stack.get(index) = Types.loLong(v);
//    isRef.clear(index);
  }

  public long getLongLocalVariable (FeatureExpr ctx, int idx) {
    return Types.intsToLong(stack.getLocal(ctx, idx + 1).getValue(), stack.getLocal(ctx, idx).getValue());
  }
  
  public double getDoubleLocalVariable (int idx) {//JM UNUSED
    return Types.intsToDouble(stack.getLocal(TRUE, idx + 1).getValue(), stack.getLocal(TRUE, idx).getValue());
  }

  public float getFloatLocalVariable (int idx) {//JM UNUSED
    int bits = stack.getLocal(TRUE, idx).getValue();
    return Float.intBitsToFloat(bits);
  }

  public double getDoubleLocalVariable (String name) {
    int idx = getLocalVariableSlotIndex(name);
    if (idx >= 0) {
      return getDoubleLocalVariable(idx);
    } else {
      throw new JPFException("long local variable not found: " + name);
    }    
  }
  
  public long getLongLocalVariable (String name) {
    int idx = getLocalVariableSlotIndex(name);

    if (idx >= 0) {
      return getLongLocalVariable(TRUE, idx);
    } else {
      throw new JPFException("long local variable not found: " + name);
    }
  }

  public MethodInfo getMethodInfo () {
    return mi;
  }

  public String getMethodName () {
    return mi.getName();
  }

  public boolean isOperandRef (int offset) {
    return stack.isRef(TRUE, 0);//isRef.get(top()-offset);
  }

  public boolean isOperandRef () {
    return stack.isRef(TRUE, 0);
  }

  //--- direct pc modification
  // NOTE: this is dangerous, caller has to guarantee stack consistency
  public void setPC (Conditional<Instruction> newpc) {
    pc = newpc;
  }

  public Conditional<Instruction> getPC () {
    return pc;
  }

  public void advancePC() {
    int i = pc.getValue().getInstructionIndex() + 1;
    if (i < mi.getNumberOfInstructions()) {
      pc = new One<>(mi.getInstruction(i));
    } else {
      pc = null;
    }
  }

  public int getTopPos() {
    return top();
  }
  
  public int getTopPos(FeatureExpr ctx) {
	    return stack.getTop().simplify(ctx).getValue() + nLocals;	
	  }

  ExceptionHandler getHandlerFor (FeatureExpr ctx, ClassInfo ciException){
    return mi.getHandlerFor(ciException, pc.simplify(ctx).getValue());
  }
  
  public boolean isFirewall (){
    return mi.isFirewall();
  }
  
  public String getStackTraceInfo () {
    StringBuilder sb = new StringBuilder(128);

    if(!mi.isJPFInternal()) {
    	sb.append(mi.getStackTraceName());
    	
    	if(pc != null) {
    		sb.append('(');
            sb.append( pc.getValue(true).getFilePos());
            sb.append(')');
    	}
    } else {
    	sb.append(mi.getName());
    	
    	if(mi.isMJI()) {
    		sb.append("(Native)");
    	} else {
    		sb.append("(Synthetic)");
    	}
    }

    return sb.toString();
  }

  /**
   * if this is an instance method, return the reference of the corresponding object
   * (note this only has to be in slot 0 upon entry)
   */
  public Conditional<Integer> getThis () {
	    return thisRef;
  }

  // stack operations
  public void clearOperandStack (FeatureExpr ctx) {
    if (attrs != null){
      for (int i=stackBase; i<= top(); i++){
        attrs[i] = null;
      }
    }
    stack.clear(ctx);
  }
  
  // this is callerSlots deep copy
  @Override
public StackFrame clone () {
    try {
      StackFrame sf = (StackFrame) super.clone();

      sf.defreeze();
      sf.pc = pc.clone();
      sf.stack = stack.clone();
//      sf.isRef = isRef.clone();

      if (attrs != null){
        sf.attrs = attrs.clone();
      }

      // frameAttr is not cloned to allow search global use 

      return sf;
    } catch (CloneNotSupportedException cnsx) {
      throw new JPFException(cnsx);
    }
  }
  
  //--- change management
  
  protected void checkIsModifiable() {
    if ((attributes & ATTR_IS_FROZEN) != 0) {
      throw new JPFException("attempt to modify frozen stackframe: " + this);
    }
  }
  
  public void freeze() {
    attributes |= ATTR_IS_FROZEN;
  }

  public void defreeze() {
    attributes &= ~ATTR_IS_FROZEN;
  }
  
  public boolean isFrozen() {
    return ((attributes & ATTR_IS_FROZEN) != 0);    
  }
  
  
  public void setReflection(){
    attributes |= ATTR_IS_REFLECTION;
  }
  
  public boolean isReflection(){
    return ((attributes & ATTR_IS_REFLECTION) != 0);
  }

  // all the dupses don't have any GC side effect (everything is already
  // on the stack), so skip the GC requests associated with push()/pop()

  public void dup (FeatureExpr ctx) {
    // .. A     =>
    // .. A A
    //    ^
	  
    if (attrs != null){
      attrs[top() + 1] = attrs[top()];
    }
    stack.dup(ctx);

  }

  public void dup2 (FeatureExpr ctx) {
    // .. A B        =>
    // .. A B A B
    //      ^
	if (attrs != null){
      attrs[top() + 1] = attrs[top() - 1];
    }
    if (attrs != null){
      attrs[top() + 2] = attrs[top()];
    }
    
	  stack.dup2(ctx);

  }

  public void dup2_x1 (FeatureExpr ctx) {
    // .. A B C       =>
    // .. B C A B C
    //        ^

    Object bAnn = null, cAnn = null;
    int ts, td;
    int t = attrs == null ? -1 : top();    
    stack.dup2_x1(ctx);

    ts=t; td = t+2;                              // ts=top, td=top+2
    if (attrs != null){
      attrs[td] = cAnn = attrs[ts];
    }

    ts--; td--;                                  // ts=top-1, td=top+1
    if (attrs != null){
      attrs[td] = bAnn = attrs[ts];
    }

    // shuffle A
    ts=t-2; td=t;                                // ts=top-2, td=top
    if (attrs != null){
      attrs[td] = attrs[ts];
    }

    // shuffle B
    td = ts;                                     // td=top-2
    if (attrs != null){
      attrs[td] = bAnn;
    }

    // shuffle C
    td++;                                        // td=top-1
    if (attrs != null){
      attrs[td] = cAnn;
    }
  }

  public void dup2_x2 (FeatureExpr ctx) {
    // .. A B C D       =>
    // .. C D A B C D
    //          ^
    Object cAnn = null, dAnn = null;
    int ts, td;
    int t = top();
    stack.dup2_x2(ctx);

    // duplicate C
    ts = t-1; td = t+1;                          // ts=top-1, td=top+1
    if (attrs != null){
      attrs[td] = cAnn = attrs[ts];
    }

    // duplicate D
    ts=t; td++;                                  // ts=top, td=top+2
    if (attrs != null){
      attrs[td] = dAnn = attrs[ts];
    }

    // shuffle A
    ts = t-3; td = t-1;                          // ts=top-3, td=top-1
    if (attrs != null){
      attrs[td] = attrs[ts];
    }

    // shuffle B
    ts++; td = t;                                // ts = top()-2
    if (attrs != null){
      attrs[td] = attrs[ts];
    }

    // shuffle D
    td = ts;                                     // td = top()-2
    if (attrs != null){
      attrs[td] = dAnn;
    }

    // shuffle C
    td--;                                        // td = top()-3
    if (attrs != null){
      attrs[td] = cAnn;
    }
  }

  public void dup_x1 (FeatureExpr ctx) {
    // .. A B     =>
    // .. B A B
    //      ^
    Object bAnn = null;
    int ts, td;
    int t = 0;
    if (attrs != null){
    	t = top();
    }
    stack.dup_x1(ctx);
    ts = t; td = t+1;    
    if (attrs != null){
      attrs[td] = bAnn = attrs[ts];
    }

    ts--; td = t;
    if (attrs != null){
      attrs[td] = attrs[ts];
    }

    td = ts;
    if (attrs != null){
      attrs[td] = bAnn;
    }
  }

  public void dup_x2 (FeatureExpr ctx) {
    // .. A B C     =>
    // .. C A B C
    //        ^
		stack.dup_x2(ctx);
		if (attrs != null) {
			Object cAnn = null;
			int ts, td;
			int t = top();

			// duplicate C
			ts = t;
			td = t + 1;
			attrs[td] = cAnn = attrs[ts];

			// shuffle B
			td = ts;
			ts--; // td=top, ts=top-1
			attrs[td] = attrs[ts];

			// shuffle A
			td = ts;
			ts--; // td=top-1, ts=top-2
			attrs[td] = attrs[ts];

			// shuffle C
			td = ts; // td = top()-2
			attrs[td] = cAnn;
		}
  }


  // <2do> pcm - I assume this compares snapshots, not types. Otherwise it
  // would be pointless to compare stack/local values
  @Override
public boolean equals (Object o) {
    if (o instanceof StackFrame){
      StackFrame other = (StackFrame)o;
      if (prev != other.prev) {
        return false;
      }
      if (pc != other.pc) {
        return false;
      }
      if (mi != other.mi) {
        return false;
      }
      if (getDepth() != other.getDepth()) {
    	  return false;
      }
//      if (top() != other.top()){
//        return false;
//      }
      
      if (!other.stack.equals(stack)) {
    	  return false;
      }
      
//      int[] otherSlots = other.getSlots();
//      FixedBitSet otherIsRef = other.isRef;
//      for (int i=0; i<=top(); i++){
//        if ( stack.get(i) != otherstack.get(i)){
//          return false;
//        }
////        if ( stack.isRefIndex(i) != otherstack.isRefIndex(i)){
////          return false;
////        }
//      }

      if (!Misc.compare(attrs,other.attrs)){
        return false;
      }
      
      if (!ObjectList.equals(frameAttr, other.frameAttr)){
        return false;
      }

      return true;
    }

    return false;
  }
  
  public boolean hasAnyRef (FeatureExpr ctx) {
    return stack.hasAnyRef(ctx);//isRef.cardinality() > 0;
  }
  
  public int mixinExecutionStateHash (int h) {
    h = OATHash.hashMixin( h, mi.getGlobalId());
    
    if (pc != null){
      h = OATHash.hashMixin(h, pc.getValue().getInstructionIndex());
      // we don't need the bytecode since there can only be one insn with this index in this method
    }
    
    for (int i=0; i<top(); i++) {
      h = OATHash.hashMixin(h, stack.getLocal(TRUE, i).getValue());
    }
   
    return h;
  }

  protected void hash (HashData hd) {
    if (prev != null){
      hd.add(prev.objectHashCode());
    }
    hd.add(mi.getGlobalId());

    if (pc != null && pc.getValue(true) != null){
      hd.add(pc.getValue(true).getInstructionIndex());
    }

//    for (int i=0; i<=top(); i++){
//      hd.add(stack.getLocal(TRUE, i).getValue(true));
//    }

    // TODO ??? implement
//    int ls = isRef.longSize();
//    for (int i=0; i<ls; i++){
//      hd.add(isRef.getLong(i));
//    }

    // it's debatable if we add the attributes to the state, but whatever it
    // is, it should be kept consistent with the Fields.hash()
    if (attrs != null){
      for (int i=0; i<=top(); i++){
        ObjectList.hash( attrs[i], hd);
      }
    }
    
    if (frameAttr != null){
      ObjectList.hash(frameAttr, hd);
    }
  }

  // computes an hash code for the hash table
  // the default hash code is different for each object
  // we need to redifine it to make the hash table work
  @Override
public int hashCode () {
    HashData hd = new HashData();
    hash(hd);
    return hd.getValue();
  }

  /**
   * mark all objects reachable from local or operand stack positions containing
   * references. Done during phase1 marking of threads (the stack is one of the
   * Thread gc roots)
   */
  public void markThreadRoots (Heap heap, int tid) {

    /**
    for (int i = isRef.nextSetBit(0); i>=0 && i<=top(); i = isRef.nextSetBit(i + 1)) {
      int objref = stack.get(i);
      if (objref != MJIEnv.NULL) {
        heap.markThreadRoot(objref, tid);
      }
    }
    **/
//    for (int i = 0; i <= top(); i++) {
//      if (stack.isRefLocal(TRUE, i)) {
//        int objref = stack.getLocal(TRUE, i).getValue();
//        if (objref != MJIEnv.NULL) {
//          heap.markThreadRoot(objref, tid);
//        }
//      }
//    }
		for (Integer ref : stack.getAllReferences()) {
			if (ref != MJIEnv.NULL) {
				heap.markThreadRoot(ref, tid);
			}
		}
  }

  //--- debugging methods

  public void printOperands (PrintStream pw){
    pw.print("operands = [");
    for (int i=stackBase; i<=top(); i++){
      if (i>0){
        pw.print(',');
      }
      if (isOperandRef(i)){
        pw.print('^');
      }
      pw.print(stack.getLocal(TRUE, i).getValue());
      Object a = getOperandAttr(TRUE, top()-i);
      if (a != null){
        pw.print(" {");
        pw.print(a);
        pw.print('}');
      }
    }
    pw.println(']');
  }

  /**
   * this includes locals and pc
   */
  public void printStackContent () {
    PrintStream pw = System.out;

    pw.print( "\tat ");
    pw.print( mi.getFullName());

    if (pc != null) {
      pw.println( ":" + pc.getValue().getPosition());
    } else {
      pw.println();
    }

    pw.print("\t slots: ");
    for (int i=0; i<=top(); i++){
      if (i == stackBase){
        pw.println("\t      ----------- operand stack");
      }

      pw.print( "\t    [");
      pw.print(i);
      pw.print("] ");
      if (stack.isRefLocal(TRUE, i)) {
        pw.print( "@");
      }
      pw.print( stack.getLocal(TRUE, i).getValue());

      if (attrs != null){
        pw.print("  attr=");
        pw.print(attrs[i]);
      }

      pw.println();
    }
  }

  public void printStackTrace () {
    System.out.println( getStackTraceInfo());
  }

  public void swap () {
    int t = top();
    
    stack.swap(TRUE);

    if (attrs != null){
      Object a = attrs[t];
      attrs[t] = attrs[t - 1];
      attrs[t - 1] = a;
    }
  }

  protected void printContentsOn(PrintWriter pw){
    pw.print("isFrozen=");
    pw.print(isFrozen());
    pw.print(",mi=");
    pw.print( mi != null ? mi.getUniqueName() : "null");
    pw.print(",top="); pw.print(stack.getTop());
    pw.print(",slots=[");
pw.print(stack);
//    for (int i = 0; i <= top(); i++) {
//      if (i == stackBase){
//        pw.print("||");
//      } else {
//        if (i != 0) {
//          pw.print(',');
//        }
//      }
//
//      if (stack.isRefLocal(i)){
//        pw.print('@');
//      }
//      pw.print(stack.getLocal(TRUE, i).getValue());

//      if (attrs != null && attrs[i] != null) {
//        pw.print('(');
//        pw.print(attrs[i]);
//        pw.print(')');
//      }
//    }

    pw.print("],pc=");
    for (Instruction p : pc.toList()) {
    	pw.print(p != null ? p.getPosition() + " " : "null");
    }
    
//    pw.print(pc != null ? pc.getValue().getPosition() : "null");

    pw.print(']');

  }
  
  // <2do> there are way too many different print/debug methods here
  public void printSlots (PrintStream ps){
    for (int i = 0; i <= top(); i++) {
      if (i == stackBase){
        ps.print("||");
      } else {
        if (i != 0) {
          ps.print(',');
        }
      }

      if (stack.isRefLocal(TRUE, i)){
        PrintUtils.printReference(ps, stack.getLocal(TRUE, i).getValue());
      } else {
        ps.print(stack.getLocal(TRUE, i).getValue());
      }
    }    
  }

  public int getDepth(){
	  if (depth != 0) {
		  return depth;
	  }
	  
	  if (prev == null) {
		  return 0;
	  }
	  depth = prev.getDepth() + 1;
	  return depth;
  }
  
  protected int objectHashCode() {
    return super.hashCode();
  }

  @Override
public String toString () {
    StringWriter sw = new StringWriter(128);
    PrintWriter pw = new PrintWriter(sw);

    pw.print(getClass().getSimpleName() + '{');
    //pw.print(Integer.toHexString(objectHashCode()));
    printContentsOn(pw);
    pw.print('}');

    return sw.toString();
  }

  public Conditional<Float> peekFloat(FeatureExpr ctx) {
	  return stack.peekFloat(ctx, 0);
  }
  
  public double peekDouble(FeatureExpr ctx) {
    return peekDouble(ctx, 0);
  }
  
  public double peekDouble (FeatureExpr ctx, int offset){
	 return stack.peekDouble(ctx, offset).getValue();
  }
  
  public Conditional<Long> peekLong (FeatureExpr ctx) {
    return peekLong(ctx, 0);
  }

  public Conditional<Long> peekLong (FeatureExpr ctx, int offset) {
	  return stack.peekLong(ctx, offset);
//    return Types.intsToLong( stack.peek(ctx, offset).getValue(), stack.peek(ctx, offset + 1).getValue());
  }

//  public void pushFloat (float v) {
//	  stack.push(TRUE, v);  
//    push(TRUE, new One<>(Float.floatToIntBits(v)));
//  }
  
  public Conditional<Double> popDouble (FeatureExpr ctx) {
      
//    int lo = stack.pop(ctx).getValue();//slots[i--];
//    int hi = stack.pop(ctx).getValue();//slots[i--];

    if (attrs != null){
    	int i = top();
      attrs[i--] = null; // not really required
      attrs[i--] = null; // that's where the attribute should be
    }

    return stack.popDouble(ctx);
//    return Types.intsToDouble(lo, hi);
  }

  public Conditional<Long> popLong (FeatureExpr ctx) {
    

//    int lo = stack.pop(TRUE).getValue();//get(i--);//slots[i--];
//    int hi = stack.pop(TRUE).getValue();////slots[i--];

    if (attrs != null){
    	int i = top();
//      i = top();
      attrs[i--] = null; // not really required
      attrs[i--] = null; // that's where the attribute should be
    }

//    stack.incrTop(-2);//top() = i;
//    return Types.intsToLong(lo, hi);
    return stack.popLong(ctx);
  }

  public Conditional<Integer> peek (FeatureExpr ctx) {
    return stack.peek(ctx);//new One<>(slots[top()]);
  }

  public Conditional<Integer> peek (FeatureExpr ctx, int offset) {
    return stack.peek(ctx, offset);//new One<>(slots[top-offset]);
  }

  public void removeArguments (FeatureExpr ctx, MethodInfo mi) {
    int i = mi.getArgumentsSize();
    if (i != 0) {
      pop(ctx, i);
    }
  }
  
  public void pop (FeatureExpr ctx, int n) {
//    assert (top() >= stackBase) : "stack empty";

    
    // <2do> get rid of this !
//    for (int i=top(); i>t; i--) {
//      if (stack.isRefIndex(i) && (stack.get(i) != MJIEnv.NULL)) {
//        VM.getVM().getSystemState().activateGC();
//        break;
//      }
//    }
		if (hasAttrs()) {
			int top = getTopPos(ctx);
			int t = top - n;
			if (attrs != null) { // just to avoid memory leaks
				for (int i = top; i > t; i--) {
					attrs[i] = null;
				}
			}
		}
    stack.pop(ctx, n);
  }

  public Conditional<Float> popFloat(FeatureExpr ctx) {
//    int v = stack.pop(TRUE).getValue();//stack.peek();//stack.peek();

    if (attrs != null){ // just to avoid memory leaks
      attrs[top()] = null;
    }

    return stack.popFloat(ctx);
    
//    return Float.intBitsToFloat(v);
  }
  
  public Conditional<Integer> pop (FeatureExpr ctx) {
    if (ctx == null) {
      ctx = FeatureExprFactory.True();
    }
    //assert (top() >= stackBase) : "stack empty";
    boolean isRef = stack.isRef(ctx, 0);

    Conditional<Integer> v = stack.pop(ctx);

    // <2do> get rid of this
    if (isRef) {
      if (v instanceof One && v.getValue() != MJIEnv.NULL) {
        VM.getVM().getSystemState().activateGC();
      }
    }

    if (attrs != null) { // just to avoid memory leaks
      attrs[top() + 1] = null;
    }

//    top()--;

    // note that we don't reset the operands or oRefs values, so that
    // we can still access them after the insn doing the pop got executed
    // (e.g. useful for listeners)

    return v;
  }
  
  public void pushLocal (FeatureExpr ctx, int index) {
	  
	  stack.pushLocal(ctx, index);
	  
//	  stack.incrTop(ctx, 1);
//	  stack.duplicateIndex(ctx, index, 0, true);
	  
//	top++;
//    slots[top()] = stack.get(index);
//    isRef.set(top, stack.isRefIndex(index));

    if (attrs != null){
      attrs[top()] = attrs[index];
    }
  }

  public void pushLongLocal (FeatureExpr ctx, int index){
	  stack.pushLongLocal(ctx, index);
	  
//	  stack.pushLocal(ctx, index);
//	  stack.pushLocal(ctx, index + 1);
	  
//	  stack.duplicateIndex(ctx, index, 1, true);
//	  stack.duplicateIndex(ctx, index+1, 2, true);
//	  stack.incrTop(ctx, 2);  
	  
    
//
//    slots[++t] = stack.get(index);
//    isRef.clear(t);
//    slots[++t] = slots[index+1];
//    isRef.clear(t);

    if (attrs != null){
    	int t = top();
      attrs[t-1] = attrs[index];
      attrs[t] = null;
    }
    
//    top() = t;
  }

  public void storeOperand (FeatureExpr ctx, int index){
	  if (attrs != null){
	  	  int top = getTopPos(ctx);
	      attrs[index] = attrs[top];
	      attrs[top] = null;
	    }
	  stack.storeOperand(ctx, index);
//	  stack.duplicateIndex(ctx, index, 0, false);
//    stack[index] = stack.peek();
//    isRef.set( index, stack.isRef(0));

    
//    stack.incrTop(ctx, -1);
//    top()--;
  }

  public void storeLongOperand (FeatureExpr ctx, int index){
    
//    int i = index;
//    stack.storeOperand(ctx, index + 1);
//    stack.storeOperand(ctx, index);
    
    stack.storeLongOperand(ctx, index);
//    stack.duplicateIndex(ctx, index, -1, false);
//    stack.setRef(index, false);
//    stack.get(i) = slots[t];
//    isRef.clear(i);
    
//    stack.duplicateIndex(ctx, index + 1, 0, false);
//    stack.setRef(index + 1, false);
//    slots[++i] = slots[t+1];
//    isRef.clear(i);

    if (attrs != null){
    	int t = top()+1;
      attrs[index] = attrs[t]; // its in the lower word
      attrs[index + 1] = null;

      attrs[t] = null;
      attrs[t+1] = null;
    }
//    stack.incrTop(ctx, -2);
//    top() -=2;
  }
  
  public <T> void push (FeatureExpr ctx, Conditional<T> v, boolean ref){
	  stack.push(ctx, v, ref);
  }

  public <T> void push (FeatureExpr ctx, Conditional<T> v){
	  stack.push(ctx, v, false);
//    top++;
//    slots[top()] = v.getValue();
//    isRef.clear(top);

    //if (attrs != null){ // done on pop
    //  attrs[top()] = null;
    //}
  }

  public void pushRef (FeatureExpr ctx, int ref) {
    // quick fix
    if (ctx == null) {
      ctx = FeatureExprFactory.True();
    }
    pushRef(ctx, new One<>(ref));
  }
  
  public void pushRef(FeatureExpr ctx, Conditional<Integer> ref) {
	  stack.push(ctx, ref, true);
    if (ref instanceof One && ref.getValue() != MJIEnv.NULL) {
      VM.getVM().getSystemState().activateGC();
    }
  }

  public void push (FeatureExpr ctx, int v, boolean ref) {
	  stack.push(ctx, v, ref);
//    top++;
//    slots[top()] = v;
//    isRef.set(top, ref);

    //if (attrs != null){ // done on pop
    //  attrs[top()] = null;
    //}

    if (ref && (v != MJIEnv.NULL)) {
      VM.getVM().getSystemState().activateGC();
    }
  }

  // return the value of callerSlots variable given the name
  public int getLocalVariableSlotIndex (String name) {
    LocalVarInfo lv = mi.getLocalVar(name, pc.getValue().getPosition());

    if (lv != null){
      return lv.getSlotIndex();
    }

    return -1;
  }

  //--- abstract argument & return passing that is shared between VM types
  
  public void setReferenceResult (int ref, Object attr){
    pushRef(TRUE, ref);
    if (attr != null){
      setOperandAttr(attr);
    }
  }
  
  public void setResult (int r, Object attr){
    push(TRUE, new One<>(r));
    if (attr != null){
      setOperandAttr(attr);
    }    
  }
  
  public void setResult (long r, Object attr){
    push(TRUE, new One<>(r));
    if (attr != null){
      setLongOperandAttr(attr);
    }    
  }
  
  public int getResult(){
    return pop(TRUE).getValue();
  }
  
  public long getLongResult(){
    return popLong(TRUE).getValue();
  }

  public int getReferenceResult (FeatureExpr ctx) {
    return pop(ctx).getValue();
  }
  
  public Object getResultAttr () {
    return getOperandAttr(TRUE);
  }

  public Object getLongResultAttr () {
    return getOperandAttr(TRUE);
  }
  
  public float getFloatResult(){
    return Float.intBitsToFloat(getResult());    
  }
  public double getDoubleResult(){
    return Double.longBitsToDouble(getLongResult());
  }
  public Object getFloatResultAttr(){
    return getResultAttr();
  }
  public Object getDoubleResultAttr(){
    return getLongResultAttr();
  }

  
  //--- VM independent exception handler setup
  
  public void setExceptionReference (int exRef, FeatureExpr ctx){
    pushRef(ctx, exRef);
  }
  
  public int getExceptionReference (){
    return pop(TRUE).getValue();
  }
  
  public void setExceptionReferenceAttribute (Object attr){
    setOperandAttr(attr);
  }
  
  public Object getExceptionReferenceAttribute (){
    return getOperandAttr(TRUE);
  }
  
  
  // those set the local vars that are normally initialized from call arguments
  public abstract void setArgumentLocal (int idx, int value, Object attr);
  public abstract void setLongArgumentLocal (int idx, long value, Object attr);
  public abstract void setReferenceArgumentLocal (int idx, int ref, Object attr);

  public void setFloatArgumentLocal (int idx, float value, Object attr){
    setArgumentLocal( idx, Float.floatToIntBits(value), attr);
  }
  public void setDoubleArgumentLocal (int idx, double value, Object attr){
    setLongArgumentLocal( idx, Double.doubleToLongBits(value), attr);
  }

	public void IINC(FeatureExpr ctx, int index, int increment) {
		stack.IINC(ctx, index, increment);
	}

	/**
	 * Returns the current stack trace as String.
	 */
	public String trace(FeatureExpr ctx) {
		if (prev == null) {
			return mi.getFullName();
		}
		final Conditional<Integer> lineNumber = pc.simplify(ctx).map(new Function<Instruction, Integer>() {

			@Override
			public Integer apply(Instruction instruction) {
				return instruction.getLineNumber();
			}
			
		});
		
		return mi.getFullName() + "("+ lineNumber + ")\n" + prev.trace(ctx);
	}
}
