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

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import gov.nasa.jpf.JPFException;

/**
 * A specialized version of ElementInfo that represents heap objects
 */
public class DynamicElementInfo extends ElementInfo {
  
  public DynamicElementInfo () {
    // for restoration
  }

  public DynamicElementInfo (int objref, ClassInfo ci, Fields f, Monitor m, ThreadInfo ti) {
    super(objref, ci, f, m, ti);

    attributes = ci.getElementInfoAttrs();

    // <2do> not ideal, should be in superclass (but doesn't work for SEIs)
    referencingThreads = createThreadInfoSet(ti); // initialization depends on subclass and policy
    setSharednessFromReferencingThreads();
  }

  @Override
  public ElementInfo getModifiableInstance() {
    if (!isFrozen()) {
      return this;
    } else {
      return VM.getVM().getHeap().getModifiable( objRef);
    }
  }
  
  // called during ElementInfo construction
  @Override
  protected ThreadInfoSet createThreadInfoSet(ThreadInfo ti){
    return SharedObjectPolicy.getPolicy().getThreadInfoSet(ti, this);
  }

  
  @Override
  public boolean isObject(){
    return true;
  }
  
  @Override
  public boolean hasFinalizer() {
    return (ci.getFinalizer()!=null);
  }
  
  @Override
  protected int getNumberOfFieldsOrElements(){
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).arrayLength().getValue();
    } else {
      return ci.getNumberOfInstanceFields();
    }
  }

  public int getNumberOfFields () {
    return getClassInfo().getNumberOfInstanceFields();
  }

  public FieldInfo getFieldInfo (int fieldIndex) {
    return getClassInfo().getInstanceField(fieldIndex);
  }

  public FieldInfo getFieldInfo (String fname) {
    return getClassInfo().getInstanceField(fname);
  }
  protected FieldInfo getDeclaredFieldInfo (String clsBase, String fname) {
    return getClassInfo().getClassLoaderInfo().getResolvedClassInfo(null, clsBase).getDeclaredInstanceField(fname);
  }

  public ElementInfo getEnclosingElementInfo(){
    for (FieldInfo fi : getClassInfo().getDeclaredInstanceFields()){
      if (fi.getName().startsWith("this$")){
        int objref = getReferenceField(fi).getValue();
        return VM.getVM().getElementInfo(objref);
      }
    }
    return null;
  }

	public Conditional<String> asString() {
		Conditional<char[]> data = getStringChars();
		return data.map(new Function<char[], String>() {

			@Override
			public String apply(char[] data) {
				if (data != null) {
					return new String(data);

				} else {
					return "";
				}
			}

		});

	}

  public Conditional<char[]> getStringChars(){
    if (!ClassInfo.isStringClassInfo(ci)) {
      throw new JPFException("object is not of type java.lang.String");
    }
    Conditional<Integer> vref = getDeclaredReferenceField("value", "java.lang.String");
    return vref.mapr(new Function<Integer, Conditional<char[]>>() {

		@SuppressWarnings("unchecked")
		@Override
		public Conditional<char[]> apply(Integer vref) {
		    if (vref != MJIEnv.NULL){
		        ElementInfo eVal = VM.getVM().getHeap().get(vref);
		        return eVal.asCharArray();
		        
		      } else {
		        return (Conditional<char[]>) One.NULL;
		      }    
		}
    	
    });
  }
  
  /**
   * just a helper to avoid creating objects just for the sake of comparing
   */
  public boolean equalsString (String s) {
    if (!ClassInfo.isStringClassInfo(ci)) {
      return false;
    }

    int vref = getDeclaredReferenceField("value", "java.lang.String").getValue();
    ElementInfo e = VM.getVM().getHeap().get(vref);
    CharArrayFields cf = (CharArrayFields)e.getFields();
    char[] v = cf.asCharArray().getValue();
    
    return new String(v).equals(s);
  }

  public boolean isBoxObject(){
    String cname = ci.getName();
    if (cname.startsWith("java.lang.")){
      cname = cname.substring(10);
      return ("Boolean".equals(cname) ||
          "Character".equals(cname) ||
          "Byte".equals(cname) ||
          "Short".equals(cname) ||
          "Integer".equals(cname) ||
          "Float".equals(cname) ||
          "Long".equals(cname) ||
          "Double".equals(cname) );
        
    } else {
      return false;
    }
  }
  
  public Object asBoxObject(){
    String cname = ci.getName();
    if (cname.startsWith("java.lang.")){
      cname = cname.substring(10);
      if ("Boolean".equals(cname)){
        return getBooleanField("value").getValue();
      } else if ("Character".equals(cname)){
        return getCharField("value").getValue();
      } else if ("Byte".equals(cname)){
        return getByteField("value").getValue();
      } else if ("Short".equals(cname)){
        return getShortField("value").getValue();
      } else if ("Integer".equals(cname)){
        return getIntField("value").getValue();
      } else if ("Float".equals(cname)){
        return getFloatField("value").getValue();
      } else if ("Long".equals(cname)){
        return getLongField("value").getValue();
      } else if ("Double".equals(cname)){
        return getDoubleField("value").getValue();
      }
    }
    
    throw new JPFException("object is not a box object: " + this);    
  }
}
