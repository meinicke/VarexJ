//
// Copyright (C) 2012 United States Government as represented by the
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

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 *         Cache management implementation for the types Boolean, Byte,
 *         Character, Short, Integer, Long. The references to the caches are in
 *         the class classes/gov/nasa/jpf/BoxObjectCaches.
 * 
 *         All the caches, except Boolean, are initialized on the first
 *         invocation of valueOf(), and they all exempt from garbage collection.
 * 
 *         NOTE: All classes obtained from getResolvedClassInfo in
 *         BoxObjectCacheManager are safe, and there is no need to check if they
 *         are initialized. The wrappers and BoxObjectCaches are initialized in
 *         VM.intialize(), and there are no clinit for array classes.
 *         
 *         NOTE: the initXCache allocations are system allocations, whereas the
 *         valueOfX() allocations are rooted in SUT code
 */
public class BoxObjectCacheManager {
  private static final String MODEL_CLASS = "gov.nasa.jpf.BoxObjectCaches";
  private static final int ANCHOR = BoxObjectCacheManager.class.getName().hashCode();  
  
  // cache default bounds
  private static int defLow = -128;
  private static int defHigh = 127;

  public static int valueOfBoolean (ThreadInfo ti, boolean b) {
    ClassInfo cls = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Boolean");

    int boolObj;
    if (b) {
      boolObj = cls.getStaticElementInfo().getReferenceField("TRUE").getValue();
    } else {
      boolObj = cls.getStaticElementInfo().getReferenceField("FALSE").getValue();
    }

    return boolObj;
  }

  // Byte cache bounds
  private static byte byteLow;
  private static byte byteHigh;

  public static int initByteCache (FeatureExpr ctx, ThreadInfo ti) {
    byteLow = (byte) ti.getVM().getConfig().getInt("vm.cache.low_byte", defLow);
    byteHigh = (byte) ti.getVM().getConfig().getInt("vm.cache.high_byte", defHigh);
    int n = (byteHigh - byteLow) + 1;
    
    Heap heap = ti.getHeap();
    ElementInfo eiArray = heap.newSystemArray("Ljava/lang/Byte", n, ti, ANCHOR);
    int arrayRef = eiArray.getObjectRef();

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Byte");
    byte val = byteLow;
    for (int i = 0; i < n; i++) {
      ElementInfo eiByte = heap.newSystemObject(ctx, ci, ti, ANCHOR);
      eiByte.setByteField(ctx, "value", new One<>(val++));
      eiArray.setReferenceElement(ctx, i, new One<>(eiByte.getObjectRef()));
    }

    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    cacheClass.getModifiableStaticElementInfo().setReferenceField(ctx, "byteCache", new One<>(arrayRef));
    return arrayRef;
  }

  public static int valueOfByte (FeatureExpr ctx, ThreadInfo ti, byte b) {
    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    int byteCache = cacheClass.getStaticElementInfo().getReferenceField("byteCache").getValue();

    if (byteCache == MJIEnv.NULL) { // initializing the cache on demand
      byteCache = initByteCache(ctx, ti);
    }

    if (b >= byteLow && b <= byteHigh) { return ti.getElementInfo(byteCache).getReferenceElement(b - byteLow).getValue(); }

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Byte");
    ElementInfo eiByte = ti.getHeap().newObject(ctx, ci, ti);
    eiByte.setByteField(ctx, "value", new One<>(b));
    return eiByte.getObjectRef();
  }

  // Character cache bound
  private static int charHigh;

  public static int initCharCache (FeatureExpr ctx, ThreadInfo ti) {
    charHigh = ti.getVM().getConfig().getInt("vm.cache.high_char", defHigh);
    int n = charHigh + 1;
    
    Heap heap = ti.getHeap();    
    ElementInfo eiArray = heap.newSystemArray("Ljava/lang/Character", n, ti, ANCHOR);
    int arrayRef = eiArray.getObjectRef();

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Character");
    for (int i = 0; i < n; i++) {
      ElementInfo eiChar = heap.newSystemObject(ctx, ci, ti, ANCHOR);
      eiChar.setCharField(ctx, "value", new One<>((char) i));
      eiArray.setReferenceElement(ctx, i, new One<>(eiChar.getObjectRef()));
    }

    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    cacheClass.getModifiableStaticElementInfo().setReferenceField(ctx, "charCache", new One<>(arrayRef));
    return arrayRef;
  }

  public static int valueOfCharacter (FeatureExpr ctx, ThreadInfo ti, char c) {
    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    int charCache = cacheClass.getStaticElementInfo().getReferenceField("charCache").getValue();

    if (charCache == MJIEnv.NULL) { // initializing the cache on demand
      charCache = initCharCache(ctx, ti);
    }

    if (c >= 0 && c <= charHigh) { return ti.getElementInfo(charCache).getReferenceElement(c).getValue(); }

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Character");
    ElementInfo eiChar = ti.getHeap().newObject(ctx, ci, ti);
    eiChar.setCharField(ctx, "value", new One<>(c));
    return eiChar.getObjectRef();
  }

  // Short cache bounds
  private static short shortLow;

  private static short shortHigh;

  public static int initShortCache (FeatureExpr ctx, ThreadInfo ti) {
    shortLow = (short) ti.getVM().getConfig().getInt("vm.cache.low_short", defLow);
    shortHigh = (short) ti.getVM().getConfig().getInt("vm.cache.high_short", defHigh);
    int n = (shortHigh - shortLow) + 1;
    
    Heap heap = ti.getHeap();    
    ElementInfo eiArray = heap.newSystemArray("Ljava/lang/Short", n, ti, ANCHOR);
    int arrayRef = eiArray.getObjectRef();

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Short");
    short val = shortLow;
    for (int i = 0; i < n; i++) {
      ElementInfo eiShort = heap.newSystemObject(ctx, ci, ti, ANCHOR);
      eiShort.setShortField(ctx, "value", new One<>(val++));
      eiArray.setReferenceElement(ctx, i, new One<>(eiShort.getObjectRef()));
    }

    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    cacheClass.getModifiableStaticElementInfo().setReferenceField(ctx, "shortCache", new One<>(arrayRef));
    return arrayRef;
  }

  public static int valueOfShort (FeatureExpr ctx, ThreadInfo ti, short s) {
    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    int shortCache = cacheClass.getStaticElementInfo().getReferenceField("shortCache").getValue();

    if (shortCache == MJIEnv.NULL) { // initializing the cache on demand
      shortCache = initShortCache(ctx, ti);
    }

    if (s >= shortLow && s <= shortHigh) { return ti.getElementInfo(shortCache).getReferenceElement(s - shortLow).getValue(); }

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Short");
    ElementInfo eiShort = ti.getHeap().newObject(ctx, ci, ti);
    eiShort.setShortField(ctx, "value", new One<>(s));
    return eiShort.getObjectRef();
  }

  // Integer cache bounds
  private static int intLow;
  private static int intHigh;

  public static int initIntCache (FeatureExpr ctx, ThreadInfo ti) {
    intLow = ti.getVM().getConfig().getInt("vm.cache.low_int", defLow);
    intHigh = ti.getVM().getConfig().getInt("vm.cache.high_int", defHigh);
    int n = (intHigh - intLow) + 1;
    
    Heap heap = ti.getHeap();    
    ElementInfo eiArray = heap.newSystemArray("Ljava/lang/Integer", n, ti, ANCHOR);
    int arrayRef = eiArray.getObjectRef();

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Integer");
    for (int i = 0; i < n; i++) {
      ElementInfo eiInteger = heap.newSystemObject(ctx, ci, ti, ANCHOR);
      eiInteger.setIntField(ctx, "value", new One<>(i + intLow));
      eiArray.setReferenceElement(ctx, i, new One<>(eiInteger.getObjectRef()));
    }

    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    cacheClass.getModifiableStaticElementInfo().setReferenceField(ctx, "intCache", new One<>(arrayRef));
    return arrayRef;
  }

  public static Conditional<Integer> valueOfInteger (FeatureExpr ctx, final ThreadInfo ti, final int i) {
    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    Conditional<Integer> intCache = cacheClass.getStaticElementInfo().getReferenceField("intCache").simplify(ctx);
    return intCache.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

		@Override
		public Conditional<Integer> apply(FeatureExpr ctx, Integer intCache) {
			if (intCache == MJIEnv.NULL) { // initializing the cache on demand
		      intCache = initIntCache(ctx, ti);
		    }
		    
		    if (i >= intLow && i <= intHigh) { return new One<>(ti.getElementInfo(intCache).getReferenceElement(i - intLow).simplify(ctx).getValue()); }
		
		    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Integer");
		    ElementInfo eiInteger = ti.getHeap().newObject(ctx, ci, ti);
		    eiInteger.setIntField(ctx, "value", new One<>(i));
		    return new One<>(eiInteger.getObjectRef());
		}

    });
  }

  // Long cache bounds
  private static int longLow;
  private static int longHigh;

  public static int initLongCache (FeatureExpr ctx, ThreadInfo ti) {
    longLow = ti.getVM().getConfig().getInt("vm.cache.low_long", defLow);
    longHigh = ti.getVM().getConfig().getInt("vm.cache.high_long", defHigh);
    int n = (longHigh - longLow) + 1;
    
    Heap heap = ti.getHeap();    
    ElementInfo eiArray = heap.newSystemArray("Ljava/lang/Long", n, ti, ANCHOR);
    int arrayRef = eiArray.getObjectRef();

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Long");
    for (int i = 0; i < n; i++) {
      ElementInfo eiLong = heap.newSystemObject(ctx, ci, ti, ANCHOR);
      eiLong.setLongField(ctx, "value", new One<>((long) (i + longLow)));
      eiArray.setReferenceElement(ctx, i, new One<>(eiLong.getObjectRef()));
    }

    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    cacheClass.getModifiableStaticElementInfo().setReferenceField(ctx, "longCache", new One<>(arrayRef));
    return arrayRef;
  }

  public static int valueOfLong (FeatureExpr ctx, ThreadInfo ti, long l) {
    ClassInfo cacheClass = ClassLoaderInfo.getSystemResolvedClassInfo(MODEL_CLASS);
    int longCache = cacheClass.getStaticElementInfo().getReferenceField("longCache").getValue();

    if (longCache == MJIEnv.NULL) { // initializing the cache on demand
      longCache = initLongCache(ctx, ti);
    }

    if (l >= longLow && l <= longHigh) { return ti.getElementInfo(longCache).getReferenceElement((int) l - longLow).getValue(); }

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Long");
    ElementInfo eiLong = ti.getHeap().newObject(ctx, ci, ti);
    eiLong.setLongField(ctx, "value", new One<>(l));
    return eiLong.getObjectRef();
  }
}
