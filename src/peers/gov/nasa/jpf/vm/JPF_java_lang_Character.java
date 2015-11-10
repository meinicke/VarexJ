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

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.Character library abstraction
 * Whoever is using this seriously is definitely screwed, performance-wise
 */
public class JPF_java_lang_Character extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public boolean isDefined__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isDefined(c);
  }

  @MJI
  public boolean isDigit__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isDigit(c);
  }

  @MJI
  public boolean isISOControl__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isISOControl(c);
  }

  @MJI
  public boolean isIdentifierIgnorable__C__Z (MJIEnv env, int clsObjRef, 
                                                  char c, FeatureExpr ctx) {
    return Character.isIdentifierIgnorable(c);
  }

  @MJI
  public boolean isJavaIdentifierPart__C__Z (MJIEnv env, int clsObjRef, 
                                                 char c, FeatureExpr ctx) {
    return Character.isJavaIdentifierPart(c);
  }

  @MJI
  public boolean isJavaIdentifierStart__C__Z (MJIEnv env, int clsObjRef, 
                                                  char c, FeatureExpr ctx) {
    return Character.isJavaIdentifierStart(c);
  }

  @MJI
  public boolean isJavaLetterOrDigit__C__Z (MJIEnv env, int clsObjRef, 
                                                char c, FeatureExpr ctx) {
    return Character.isJavaIdentifierPart(c);
  }

  @MJI
  public boolean isJavaLetter__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isJavaIdentifierStart(c);
  }

  @MJI
  public boolean isLetterOrDigit__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isLetterOrDigit(c);
  }

  @MJI
  public boolean isLetter__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isLetter(c);
  }

  @MJI
  public boolean isLowerCase__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isLowerCase(c);
  }

  @MJI
  public int getNumericValue__C__I (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.getNumericValue(c);
  }

  @MJI
  public boolean isSpaceChar__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isSpaceChar(c);
  }

  @MJI
  public boolean isSpace__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isWhitespace(c);
  }

  @MJI
  public boolean isTitleCase__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isTitleCase(c);
  }

  @MJI
  public int getType__C__I (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.getType(c);
  }

  @MJI
  public boolean isUnicodeIdentifierPart__C__Z (MJIEnv env, int clsObjRef, 
                                                    char c, FeatureExpr ctx) {
    return Character.isUnicodeIdentifierPart(c);
  }

  @MJI
  public boolean isUnicodeIdentifierStart__C__Z (MJIEnv env, int clsObjRef, 
                                                     char c, FeatureExpr ctx) {
    return Character.isUnicodeIdentifierStart(c);
  }

  @MJI
  public boolean isUpperCase__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isUpperCase(c);
  }

  @MJI
  public boolean isWhitespace__C__Z (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.isWhitespace(c);
  }

  // pcm - we keep this in here to avoid the potentially expensive
  // real clinit. This has changed a lot in Java 1.4.2 (deferred init, i.e.
  // we could actually use it now), but in <= 1.4.1 it executes some
  // 200,000 insns, and some people who didn't grew up with Java might
  // deduce that JPF is hanging. It's not, it just shows why a real VM has to
  // be fast.
  // It is actually Ok to bypass the real clinit if we turn all the
  // important methods into native ones, i.e. delegate to the real thing.
  @MJI
  public void $clinit____V (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
    env.setStaticByteField(ctx, "java.lang.Character", "UNASSIGNED", One.valueOf((byte) 0));
    env.setStaticByteField(ctx, "java.lang.Character", "UPPERCASE_LETTER", One.valueOf((byte) 1));
    env.setStaticByteField(ctx, "java.lang.Character", "LOWERCASE_LETTER", One.valueOf((byte) 2));
    env.setStaticByteField(ctx, "java.lang.Character", "TITLECASE_LETTER", One.valueOf((byte) 3));
    env.setStaticByteField(ctx, "java.lang.Character", "MODIFIER_LETTER", One.valueOf((byte) 4));
    env.setStaticByteField(ctx, "java.lang.Character", "OTHER_LETTER", One.valueOf((byte) 5));
    env.setStaticByteField(ctx, "java.lang.Character", "NON_SPACING_MARK", One.valueOf((byte) 6));
    env.setStaticByteField(ctx, "java.lang.Character", "ENCLOSING_MARK", One.valueOf((byte) 7));
    env.setStaticByteField(ctx, "java.lang.Character", "COMBINING_SPACING_MARK", One.valueOf((byte) 8));
    env.setStaticByteField(ctx, "java.lang.Character", "DECIMAL_DIGIT_NUMBER", One.valueOf((byte) 9));
    env.setStaticByteField(ctx, "java.lang.Character", "LETTER_NUMBER", One.valueOf((byte) 10));
    env.setStaticByteField(ctx, "java.lang.Character", "OTHER_NUMBER", One.valueOf((byte) 11));
    env.setStaticByteField(ctx, "java.lang.Character", "SPACE_SEPARATOR", One.valueOf((byte) 12));
    env.setStaticByteField(ctx, "java.lang.Character", "LINE_SEPARATOR", One.valueOf((byte) 13));
    env.setStaticByteField(ctx, "java.lang.Character", "PARAGRAPH_SEPARATOR", One.valueOf((byte) 14));
    env.setStaticByteField(ctx, "java.lang.Character", "CONTROL", One.valueOf((byte) 15));
    env.setStaticByteField(ctx, "java.lang.Character", "FORMAT", One.valueOf((byte) 16));
    env.setStaticByteField(ctx, "java.lang.Character", "PRIVATE_USE", One.valueOf((byte) 18));
    env.setStaticByteField(ctx, "java.lang.Character", "SURROGATE", One.valueOf((byte) 19));
    env.setStaticByteField(ctx, "java.lang.Character", "DASH_PUNCTUATION", One.valueOf((byte) 20));
    env.setStaticByteField(ctx, "java.lang.Character", "START_PUNCTUATION", One.valueOf((byte) 21));
    env.setStaticByteField(ctx, "java.lang.Character", "END_PUNCTUATION", One.valueOf((byte) 22));
    env.setStaticByteField(ctx, "java.lang.Character", "CONNECTOR_PUNCTUATION", One.valueOf((byte) 23));
    env.setStaticByteField(ctx, "java.lang.Character", "OTHER_PUNCTUATION", One.valueOf((byte) 24));
    env.setStaticByteField(ctx, "java.lang.Character", "MATH_SYMBOL", One.valueOf((byte) 25));
    env.setStaticByteField(ctx, "java.lang.Character", "CURRENCY_SYMBOL", One.valueOf((byte) 26));
    env.setStaticByteField(ctx, "java.lang.Character", "MODIFIER_SYMBOL", One.valueOf((byte) 27));
    env.setStaticByteField(ctx, "java.lang.Character", "OTHER_SYMBOL", One.valueOf((byte) 28));
    env.setStaticIntField(ctx, "java.lang.Character", "MIN_RADIX", One.valueOf(2));
    env.setStaticIntField(ctx, "java.lang.Character", "MAX_RADIX", One.valueOf(36));
    env.setStaticCharField(ctx, "java.lang.Character", "MIN_VALUE", One.valueOf('\u0000'));
    env.setStaticCharField(ctx, "java.lang.Character", "MAX_VALUE", One.valueOf('\uffff'));

    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo("char");
    env.setStaticReferenceField(ctx, "java.lang.Character", 
                             "TYPE", ci.getClassObjectRef());
  }

  @MJI
  public int digit__CI__I (MJIEnv env, int clsObjRef, char c, int radix, FeatureExpr ctx) {
    return Character.digit(c, radix);
  }

  @MJI
  public char forDigit__II__C (MJIEnv env, int clsObjRef, int digit, 
                                   int radix, FeatureExpr ctx) {
    return Character.forDigit(digit, radix);
  }

  @MJI
  public char toLowerCase__C__C (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.toLowerCase(c);
  }

  @MJI
  public char toTitleCase__C__C (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.toTitleCase(c);
  }

  @MJI
  public char toUpperCase__C__C (MJIEnv env, int clsObjRef, char c, FeatureExpr ctx) {
    return Character.toUpperCase(c);
  }

//  @MJI
  public int valueOf__C__Ljava_lang_Character_2 (MJIEnv env, int clsRef, char val, FeatureExpr ctx) {
    return env.valueOfCharacter(ctx, val);
  }
}
