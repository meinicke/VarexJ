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

import java.lang.reflect.Modifier;

import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * type, name and attribute information of a field.
 */
public abstract class FieldInfo extends InfoObject implements GenericSignatureHolder {

  //--- FieldInfo attributes
  // don't break transitions on get/putXX insns of this field, even if shared
  static final int NEVER_BREAK = 0x10000;
  
  // always break on this field's access if object is shared
  // (ignored if NEVER_BREAK is set)
  static final int BREAK_SHARED = 0x20000;

  // those might relate to sticky ElementInto.ATTR_*
  protected int attributes;

  
  protected final String name;
  protected String type;  // lazy initialized fully qualified type name as per JLS 6.7 ("int", "x.Y[]")
  protected final String signature; // "I", "[Lx/Y;" etc.
  protected int storageSize;

  protected ClassInfo ci; // class this field belongs to
  protected int fieldIndex; // declaration ordinal

  // where in the corresponding Fields object do we store the value
  // (note this works because of the wonderful single inheritance)
  protected int storageOffset;

  // optional initializer for this field, can't be final because it is set from
  // classfile field_info attributes (i.e. after construction)
  protected  Object cv;

  protected String genericSignature;

  protected int modifiers;
  
  public static FieldInfo create (String name, String signature, int modifiers){
    switch(signature.charAt(0)){
      case 'Z':
        return new BooleanFieldInfo(name, modifiers);
      case 'B':
        return new ByteFieldInfo(name, modifiers);
      case 'S':
        return new ShortFieldInfo(name, modifiers);
      case 'C':
        return new CharFieldInfo(name, modifiers);
      case 'I':
        return new IntegerFieldInfo(name, modifiers);
      case 'J':
        return new LongFieldInfo(name, modifiers);
      case 'F':
        return new FloatFieldInfo(name, modifiers);
      case 'D':
        return new DoubleFieldInfo(name, modifiers);
      default:
        return new ReferenceFieldInfo(name, signature, modifiers);
    }
  }
  
  protected FieldInfo(String name, String signature, int modifiers) {
    this.name = name;
    this.signature = signature;
    this.modifiers = modifiers;
  }

  protected void linkToClass (ClassInfo ci, int idx, int off){
    this.ci = ci;
    this.fieldIndex = idx;
    this.storageOffset = off;
  }
  
  // those are set subsequently from classfile attributes
  public void setConstantValue(Object constValue){
    cv = constValue;
  }

  public abstract String valueToString (Fields f);

  public boolean is1SlotField(){
    return false;
  }
  public boolean is2SlotField(){
    return false;
  }

  public boolean isBooleanField() {
    return false;
  }
  public boolean isByteField() {
    return false;
  }
  public boolean isCharField() {
    return false;
  }
  public boolean isShortField() {
    return false;
  }
  public boolean isIntField() {
    return false;
  }
  public boolean isLongField() {
    return false;
  }
  public boolean isFloatField(){
    return false;
  }
  public boolean isDoubleField(){
    return false;
  }

  public boolean isNumericField(){
    return false;
  }

  public boolean isFloatingPointField(){
    return false;
  }

  public boolean isReference () {
    return false;
  }

  public boolean isArrayField () {
    return false;
  }

  /**
   * Returns the class that this field is associated with.
   */
  public ClassInfo getClassInfo () {
    return ci;
  }

  public Object getConstantValue () {
    return cv;
  }

  public abstract Object getValueObject (Fields data);

  public int getModifiers() {
    return modifiers;
  }

  public int getFieldIndex () {
    return fieldIndex;
  }

  /**
   * is this a static field? Counter productive to the current class struct,
   * but at some point we want to get rid of the Dynamic/Static branch (it's
   * really just a field attribute)
   */
  public boolean isStatic () {
    return (modifiers & Modifier.STATIC) != 0;
  }

  /**
   * is this field declared `final'?
   */
  public boolean isFinal () {
    return (modifiers & Modifier.FINAL) != 0;
  }

  public boolean isVolatile () {
    return (modifiers & Modifier.VOLATILE) != 0;
  }

  public boolean isTransient () {
    return (modifiers & Modifier.TRANSIENT) != 0;
  }

  public boolean isPublic () {
    return (modifiers & Modifier.PUBLIC) != 0;
  }


  /**
   * Returns the name of the field.
   */
  public String getName () {
    return name;
  }

  /**
   * @return the storage size of this field, @see Types.getTypeSize
   */
  public int getStorageSize () {
    return 1;
  }

  /**
   * Returns the type of the field as a fully qualified type name according to JLS 6.7
   * ("int", "x.Y[]")
   */
  public String getType () {
    if (type == null){
      type = Types.getTypeName(signature);
    }
    return type;
  }
  
  public byte getTypeCode (){
    return Types.getTypeCode(signature);
  }

  public String getSignature(){
    return signature;
  }

  public String getGenericSignature() {
    return genericSignature; 
  }

  public void setGenericSignature(String sig){
    genericSignature = sig;
  }

  public ClassInfo getTypeClassInfo () {
    return ClassLoaderInfo.getCurrentResolvedClassInfo(getType());
  }

  public Class<? extends ChoiceGenerator<?>> getChoiceGeneratorType (){
    return null;
  }

  /**
   * pushClinit the corresponding data in the provided Fields instance
 * @param ctx TODO
   */
  public abstract void initialize (FeatureExpr ctx, ElementInfo ei, ThreadInfo ti);


  /**
   * Returns a string representation of the field.
   */
  public String toString () {
    StringBuilder sb = new StringBuilder();

    if (isStatic()) {
      sb.append("static ");
    }
    if (isFinal()) {
      sb.append("final ");
    }

    //sb.append(Types.getTypeName(type));
    sb.append(getType());
    sb.append(' ');
    sb.append(ci.getName());
    sb.append('.');
    sb.append(name);

    return sb.toString();
  }
  
  //--- those are the JPF internal attribute flags (not to mix with free user attrs)

  void setAttributes (int a) {
    attributes = a;
  }

  public void addAttribute (int a){
    attributes |= a;
  }

  public int getAttributes () {
    return attributes;
  }

  public boolean breakShared() {
    return ((attributes & BREAK_SHARED) != 0);
  }
  
  public boolean neverBreak() {
    return ((attributes & NEVER_BREAK) != 0);    
  }
  
  public int getStorageOffset () {
    return storageOffset;
  }

  public String getFullName() {
    return ci.getName() + '.' + name;
  }

  /**
   * Creates a field for a given class, by cloning this FieldInfo
   * and reseting the class that the field belongs to
   */
  public FieldInfo getInstanceFor(ClassInfo ci) {
    FieldInfo clone;

    try {
      clone = (FieldInfo)clone();
      clone.ci = ci;
    } catch (CloneNotSupportedException cnsx){
      cnsx.printStackTrace();
      return null;
    }

    return clone;
  }
}
