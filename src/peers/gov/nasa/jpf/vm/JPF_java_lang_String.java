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

import gov.nasa.jpf.annotation.MJI;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

import cmu.conditional.Conditional;
import cmu.conditional.Function;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * MJI NativePeer class for java.lang.String library abstraction
 */
public class JPF_java_lang_String extends NativePeer {

  
  @MJI
  public int init___3CII__Ljava_lang_String_2 (MJIEnv env, int objRef, int valueRef, final int offset, final int count) {
    Conditional<char[]> value = env.getCharArrayObject(valueRef).simplify(NativeMethodInfo.CTX);
    Conditional<String> result = value.map(new Function<char[], String>() {

		@Override
		public String apply(char[] value) {
			return new String(value, offset, count);
		}
    	
    });
    
    
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int init___3III__Ljava_lang_String_2 (MJIEnv env, int objRef, int codePointsRef, int offset, int count) {
    int[] codePoints = env.getIntArrayObject(NativeMethodInfo.CTX, codePointsRef);
    String result = new String(codePoints, offset, count);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @SuppressWarnings("deprecation")
  @MJI
  public int init___3BIII__Ljava_lang_String_2 (MJIEnv env, int objRef, int asciiRef, int hibyte, int offset, int count) {
    byte[] ascii = env.getByteArrayObject(NativeMethodInfo.CTX, asciiRef);
    String result = new String(ascii, hibyte, offset, count);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int init___3BIILjava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int bytesRef, int offset, int length, int charsetNameRef) throws UnsupportedEncodingException {
    byte[] bytes = env.getByteArrayObject(NativeMethodInfo.CTX, bytesRef);
    String charsetName = env.getStringObject(null, charsetNameRef);
    String result = new String(bytes, offset, length, charsetName);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int init___3BII__Ljava_lang_String_2 (MJIEnv env, int objRef, int bytesRef, int offset, int length) {
    byte[] bytes = env.getByteArrayObject(NativeMethodInfo.CTX, bytesRef);
    String result = new String(bytes, offset, length);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int codePointAt__I__I (MJIEnv env, int objRef, int index) {
    String obj = env.getStringObject(null, objRef);
    return obj.codePointAt(index);
  }

  @MJI
  public int codePointBefore__I__I (MJIEnv env, int objRef, int index) {
    String obj = env.getStringObject(null, objRef);
    return obj.codePointBefore(index);
  }

  @MJI
  public int codePointCount__II__I (MJIEnv env, int objRef, int beginIndex, int endIndex) {
    String obj = env.getStringObject(null, objRef);
    return obj.codePointCount(beginIndex, endIndex);
  }

  @MJI
  public int offsetByCodePoints__II__I (MJIEnv env, int objRef, int index, int codePointOffset) {
    String obj = env.getStringObject(null, objRef);
    return obj.offsetByCodePoints(index, codePointOffset);
  }

  @MJI
  public void getChars__II_3CI__V (MJIEnv env, int objRef, int srcBegin, int srcEnd, int dstRef, int dstBegin) {
    String obj = env.getStringObject(null, objRef);
    char[] dst = env.getCharArrayObject(dstRef).getValue();
    obj.getChars(srcBegin, srcEnd, dst, dstBegin);
  }

  @SuppressWarnings("deprecation")
  @MJI
  public void getBytes__II_3BI__V (MJIEnv env, int objRef, int srcBegin, int srcEnd, int dstRef, int dstBegin) {
    String obj = env.getStringObject(NativeMethodInfo.CTX, objRef);
    byte[] dst = env.getByteArrayObject(NativeMethodInfo.CTX, dstRef);
    obj.getBytes(srcBegin, srcEnd, dst, dstBegin);
    
    for (int i = dstBegin; i < srcEnd - srcBegin + dstBegin; i++) {
    	env.setByteArrayElement(NativeMethodInfo.CTX, dstRef, i, dst[i]);
    }
  }

  @MJI
  public int getBytes__Ljava_lang_String_2___3B (MJIEnv env, int objRef, int charSetRef) {
    String string = env.getStringObject(null, objRef);
    String charset = env.getStringObject(null, charSetRef);

    try {
      byte[] b = string.getBytes(charset);
      return env.newByteArray(NativeMethodInfo.CTX, b);

    } catch (UnsupportedEncodingException uex) {
      env.throwException(NativeMethodInfo.CTX, uex.getClass().getName(), uex.getMessage());
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int getBytes_____3B (MJIEnv env, int objRef) {
    String obj = env.getStringObject(null, objRef);
    byte[] bytes = obj.getBytes();
    return env.newByteArray(NativeMethodInfo.CTX, bytes);
  }

  @MJI
  public char charAt__I__C (MJIEnv env, int objRef, int index){
    char[] data = env.getStringChars(objRef).getValue();
    return data[index];
  }

  
  @MJI
  public boolean equals0___3C_3CI__Z (MJIEnv env, int clsObjRef, int charsRef1, int charsRef2, int len) {

    if ((charsRef1 == MJIEnv.NULL) || (charsRef2 == MJIEnv.NULL)) { return false; }

    char[] a = env.getCharArrayObject(charsRef1).getValue();
    char[] b = env.getCharArrayObject(charsRef2).getValue();

    if (a.length < len || b.length < len) { return false; }

    for (int i = 0; i < len; i++) {
      if (a[i] != b[i]) { return false; }
    }

    return true;
  }

  @MJI
  public boolean equals__Ljava_lang_Object_2__Z (MJIEnv env, int objRef, int argRef) {
    if (argRef == MJIEnv.NULL) { return false; }

    Heap heap = env.getHeap();
    ElementInfo s1 = heap.get(objRef);
    ElementInfo s2 = heap.get(argRef);

    if (!env.isInstanceOf(argRef, "java.lang.String")) { return false; }
    FeatureExpr ctx = NativeMethodInfo.CTX;
    Fields f1 = heap.get(s1.getReferenceField("value").simplify(ctx).getValue()).getFields();
    Fields f2 = heap.get(s2.getReferenceField("value").simplify(ctx).getValue()).getFields();

    char[] c1 = ((CharArrayFields) f1).asCharArray().simplify(ctx).getValue();
    char[] c2 = ((CharArrayFields) f2).asCharArray().simplify(ctx).getValue();

    if (c1.length != c2.length) { return false; }

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) { return false; }
    }

    return true;
  }

  @MJI
  public boolean equalsIgnoreCase__Ljava_lang_String_2__Z (MJIEnv env, int objref, int anotherString) {
    String thisString = env.getStringObject(null, objref);
    if (anotherString != MJIEnv.NULL) {
      return thisString.equalsIgnoreCase(env.getStringObject(null, anotherString));
    } else {
      return false;
    }
  }

  @MJI
  public int compareTo__Ljava_lang_String_2__I (MJIEnv env, int objRef, int anotherStringRef) {
    String obj = env.getStringObject(null, objRef);
    String anotherString = env.getStringObject(null, anotherStringRef);
    return obj.compareTo(anotherString);
  }

  @MJI
  public int MJIcompare__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsRef, int s1Ref, int s2Ref) {
    // Is there a way to reflect?
    String a = env.getStringObject(null, s1Ref);
    String s2 = env.getStringObject(null, s2Ref);
    int n1 = a.length();
    int n2 = s2.length();
    int min = Math.min(n1, n2);
    for (int i = 0; i < min; i++) {
      char x = a.charAt(i);
      char y = s2.charAt(i);
      if (x != y) {
        x = Character.toUpperCase(x);
        y = Character.toUpperCase(y);
        if (x != y) {
          x = Character.toLowerCase(x);
          y = Character.toLowerCase(y);
          if (x != y) { return x - y; }
        }
      }
    }
    return n1 - n2;
  }

  @MJI
  public boolean regionMatches__ILjava_lang_String_2II__Z (MJIEnv env, int objRef, int toffset, int otherRef, int ooffset, int len) {
    String obj = env.getStringObject(null, objRef);
    String other = env.getStringObject(null, otherRef);
    return obj.regionMatches(toffset, other, ooffset, len);

  }

  @MJI
  public boolean regionMatches__ZILjava_lang_String_2II__Z (MJIEnv env, int objRef, boolean ignoreCase, int toffset, int otherRef, int ooffset, int len) {
    String obj = env.getStringObject(null, objRef);
    String other = env.getStringObject(null, otherRef);
    return obj.regionMatches(ignoreCase, toffset, other, ooffset, len);

  }

  @MJI
  public boolean startsWith__Ljava_lang_String_2I__Z (MJIEnv env, int objRef, int prefixRef, int toffset) {
    String thisStr = env.getStringObject(null, objRef);
    String prefix = env.getStringObject(null, prefixRef);
    return thisStr.startsWith(prefix, toffset);
  }

  @MJI
  public boolean startsWith__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int prefixRef) {
    String thisStr = env.getStringObject(null, objRef);
    String prefix = env.getStringObject(null, prefixRef);
    return thisStr.startsWith(prefix);
  }

  @MJI
  public int hashCode____I (MJIEnv env, int objref) {
    ElementInfo ei = env.getElementInfo(objref);
    FeatureExpr ctx = NativeMethodInfo.CTX;
    int h = ei.getIntField("hash").simplify(ctx).getValue();

    if (h == 0) {
      int vref = env.getReferenceField(ctx, objref, "value").getValue();

      // now get the char array data, but be aware they are stored as ints
      ElementInfo eiVal = env.getElementInfo(vref);
      char[] values = eiVal.asCharArray().simplify(ctx).getValue();

      for (int i = 0; i < values.length; i++) {
        h = 31 * h + values[i];
      }

      ei = ei.getModifiableInstance();
      ei.setIntField(ctx, "hash", h);
    }

    return h;
  }

  @MJI
  public int indexOf__I__I (MJIEnv env, int objref, int c) {
    return indexOf__II__I(env, objref, c, 0);
  }

  @MJI
  public int indexOf__II__I (MJIEnv env, int objref, int c, int fromIndex) {
	  FeatureExpr ctx = NativeMethodInfo.CTX;
    int vref = env.getReferenceField(ctx, objref, "value").getValue();
    ElementInfo ei = env.getElementInfo(vref);
    char[] values = ((CharArrayFields) ei.getFields()).asCharArray().getValue();

    int len = values.length;

    if (fromIndex >= len) { return -1; }
    if (fromIndex < 0) {
      fromIndex = 0;
    }

    for (int i = fromIndex; i < len; i++) {
      if (values[i] == c) { return i; }
    }

    return -1;
  }
 

  @MJI
  public int lastIndexOf__I__I (MJIEnv env, int objref, int c) {
    return lastIndexOf__II__I(env, objref, c, Integer.MAX_VALUE);
  }

  @MJI
  public int lastIndexOf__II__I (MJIEnv env, int objref, int c, int fromIndex) {
	  FeatureExpr ctx = NativeMethodInfo.CTX;
    int vref = env.getReferenceField(ctx, objref, "value").getValue();
    ElementInfo ei = env.getElementInfo(vref);
    char[] values = ((CharArrayFields) ei.getFields()).asCharArray().getValue();

    int len = values.length;

    if (fromIndex < 0) { return -1; }
    if (fromIndex > len - 1) {
      fromIndex = len - 1;
    }

    for (int i = fromIndex; i > 0; i--) {
      if (values[i] == c) { return i; }
    }

    return -1;
  }

  @MJI
  public int indexOf__Ljava_lang_String_2__I (MJIEnv env, int objref, int str) {
    String thisStr = env.getStringObject(null, objref);
    String indexStr = env.getStringObject(null, str);

    return thisStr.indexOf(indexStr);
  }

  @MJI
  public int indexOf__Ljava_lang_String_2I__I (MJIEnv env, int objref, int str, int fromIndex) {
    String thisStr = env.getStringObject(null, objref);
    String indexStr = env.getStringObject(null, str);

    return thisStr.indexOf(indexStr, fromIndex);
  }

  @MJI
  public int lastIndexOf__Ljava_lang_String_2I__I (MJIEnv env, int objref, int str, int fromIndex) {
    String thisStr = env.getStringObject(null, objref);
    String indexStr = env.getStringObject(null, str);

    return thisStr.lastIndexOf(indexStr, fromIndex);
  }

  @MJI
  public int substring__I__Ljava_lang_String_2 (MJIEnv env, int objRef, int beginIndex) {
    String obj = env.getStringObject(null, objRef);
    String result = obj.substring(beginIndex);
    return env.newString(NativeMethodInfo.CTX, result);

  }

  @MJI
  public int substring__II__Ljava_lang_String_2 (MJIEnv env, int objRef, int beginIndex, int endIndex) {
    String obj = env.getStringObject(NativeMethodInfo.CTX, objRef);
    String result = obj.substring(beginIndex, endIndex);
    return env.newString(NativeMethodInfo.CTX, result);

  }

  @MJI
  public int concat__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int strRef) {
    Heap heap = env.getHeap();

    ElementInfo thisStr = heap.get(objRef);
    CharArrayFields thisFields = (CharArrayFields) heap.get(thisStr.getReferenceField("value").getValue()).getFields();
    char[] thisChars = thisFields.asCharArray().getValue();
    int thisLength = thisChars.length;

    ElementInfo otherStr = heap.get(strRef);
    CharArrayFields otherFields = (CharArrayFields) heap.get(otherStr.getReferenceField("value").getValue()).getFields();
    char[] otherChars = otherFields.asCharArray().getValue();
    int otherLength = otherChars.length;

    if (otherLength == 0) { return objRef; }

    char resultChars[] = new char[thisLength + otherLength];
    System.arraycopy(thisChars, 0, resultChars, 0, thisLength);
    System.arraycopy(otherChars, 0, resultChars, thisLength, otherLength);

    return env.newString(NativeMethodInfo.CTX, new String(resultChars));
  }

  // --- the various replaces

  @MJI
  public int replace__CC__Ljava_lang_String_2 (MJIEnv env, int objRef, char oldChar, char newChar) {

    if (oldChar == newChar) { // nothing to replace
      return objRef;
    }
    FeatureExpr ctx = NativeMethodInfo.CTX;
    int vref = env.getReferenceField(ctx, objRef, "value").getValue();
    ElementInfo ei = env.getModifiableElementInfo(vref);
    char[] values = ((CharArrayFields) ei.getFields()).asCharArray().getValue();
    int len = values.length;

    char[] newValues = null;

    for (int i = 0, j = 0; j < len; i++, j++) {
      char c = values[i];
      if (c == oldChar) {
        if (newValues == null) {
          newValues = new char[len];
          if (j > 0) {
            System.arraycopy(values, 0, newValues, 0, j);
          }
        }
        newValues[j] = newChar;
      } else {
        if (newValues != null) {
          newValues[j] = c;
        }
      }
    }

    if (newValues != null) {
      String s = new String(newValues);
      return env.newString(NativeMethodInfo.CTX, s);

    } else { // oldChar not found, return the original string
      return objRef;
    }
  }

  @MJI
  public boolean matches__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int regexRef) {
    String s = env.getStringObject(null, objRef);
    String r = env.getStringObject(null, regexRef);

    return s.matches(r);
  }

  @MJI
  public int replaceFirst__Ljava_lang_String_2Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int regexRef, int replacementRef) {
    String thisStr = env.getStringObject(null, objRef);
    String regexStr = env.getStringObject(null, regexRef);
    String replacementStr = env.getStringObject(null, replacementRef);

    String result = thisStr.replaceFirst(regexStr, replacementStr);
    return (result != thisStr) ? env.newString(NativeMethodInfo.CTX, result) : objRef;
  }

  @MJI
  public int replaceAll__Ljava_lang_String_2Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int regexRef, int replacementRef) {
    String thisStr = env.getStringObject(null, objRef);
    String regexStr = env.getStringObject(null, regexRef);
    String replacementStr = env.getStringObject(null, replacementRef);

    String result = thisStr.replaceAll(regexStr, replacementStr);
    return (result != thisStr) ? env.newString(NativeMethodInfo.CTX, result) : objRef;
  }

  @MJI
  public int split__Ljava_lang_String_2I___3Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int strRef, int limit) {
    String s = env.getStringObject(null, strRef);
    String obj = env.getStringObject(null, clsObjRef);

    String[] result = obj.split(s, limit);

    return env.newStringArray(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int split__Ljava_lang_String_2___3Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int strRef) {
    String s = env.getStringObject(null, strRef);
    String obj = env.getStringObject(null, clsObjRef);

    String[] result = obj.split(s);

    return env.newStringArray(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int toLowerCase__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int locRef) {
    String s = env.getStringObject(null, objRef);
    Locale loc = JPF_java_util_Locale.getLocale(env, locRef);

    String lower = s.toLowerCase(loc);

    return (s == lower) ? objRef : env.newString(NativeMethodInfo.CTX, lower);
  }

  @MJI
  public int toLowerCase____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    String s = env.getStringObject(null, objRef);
    String lower = s.toLowerCase();

    return (s == lower) ? objRef : env.newString(NativeMethodInfo.CTX, lower);
  }

  @MJI
  public int toUpperCase__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int locRef) {
    String s = env.getStringObject(null, objRef);
    Locale loc = JPF_java_util_Locale.getLocale(env, locRef);

    String upper = s.toUpperCase(loc);

    return (s == upper) ? objRef : env.newString(NativeMethodInfo.CTX, upper);
  }

  @MJI
  public int toUpperCase____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    String s = env.getStringObject(null, objRef);
    String upper = s.toUpperCase();

    return (s == upper) ? objRef : env.newString(NativeMethodInfo.CTX, upper);
  }

  @MJI
  public int trim____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    Heap heap = env.getHeap();
    ElementInfo thisStr = heap.get(objRef);

    CharArrayFields thisFields = (CharArrayFields) heap.get(thisStr.getReferenceField("value").simplify(NativeMethodInfo.CTX).getValue()).getFields();
    char[] thisChars = thisFields.asCharArray().simplify(NativeMethodInfo.CTX).getValue();
    int thisLength = thisChars.length;

    int start = 0;
    int end = thisLength;

    while ((start < end) && (thisChars[start] <= ' ')) {
      start++;
    }

    while ((start < end) && (thisChars[end - 1] <= ' ')) {
      end--;
    }

    if (start == 0 && end == thisLength) {
      // if there was no white space, return the string itself
      return objRef;
    }

    String result = new String(thisChars, start, end - start);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int toCharArray_____3C (MJIEnv env, int objref) {
	  FeatureExpr ctx = NativeMethodInfo.CTX;
    int vref = env.getReferenceField(ctx, objref, "value").getValue();
    char[] v = env.getCharArrayObject(vref).getValue();

    int cref = env.newCharArray(NativeMethodInfo.CTX, v);

    return cref;
  }

  @MJI
  public int format__Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int fmtRef, int argRef) {
    return env.newString(NativeMethodInfo.CTX, env.format(NativeMethodInfo.CTX, fmtRef, argRef));
  }

  @MJI
  public int format__Ljava_util_Locale_2Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int locRef, int fmtRef, int argRef) {
    Locale loc = JPF_java_util_Locale.getLocale(env, locRef);
    return env.newString(NativeMethodInfo.CTX, env.format(NativeMethodInfo.CTX, loc, fmtRef, argRef));
  }

  @MJI
  public int intern____Ljava_lang_String_2 (MJIEnv env, int robj) {
    // <2do> Replace this with a JPF space HashSet once we have a String model
    Heap heap = env.getHeap();

    String s = env.getStringObject(null, robj);
    ElementInfo ei = heap.newInternString(NativeMethodInfo.CTX, s, env.getThreadInfo());

    return ei.getObjectRef();
  }

  @MJI
  public int valueOf__I__Ljava_lang_String_2 (MJIEnv env, int clsref, int i) {
    String result = String.valueOf(i);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int valueOf__J__Ljava_lang_String_2 (MJIEnv env, int clsref, long l) {
    String result = String.valueOf(l);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int valueOf__F__Ljava_lang_String_2 (MJIEnv env, int clsref, float f) {
    String result = String.valueOf(f);
    return env.newString(NativeMethodInfo.CTX, result);
  }

  @MJI
  public int valueOf__D__Ljava_lang_String_2 (MJIEnv env, int clsref, double d) {
    String result = String.valueOf(d);
    return env.newString(NativeMethodInfo.CTX, result);
  }
}
