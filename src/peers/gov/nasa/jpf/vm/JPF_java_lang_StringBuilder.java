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
import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;

import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_lang_StringBuilder extends NativePeer {
  
  int appendString (FeatureExpr ctx, MJIEnv env, int objref, String s) {
    final int slen = s.length();
    Conditional<Integer> condAref = env.getReferenceField(ctx, objref, "value");
    Map<Integer, FeatureExpr> arefMap = condAref.toMap();
    for (Integer aref : arefMap.keySet()) {
    	FeatureExpr arefCtx = ctx.and(arefMap.get(aref));
	    final int alen = env.getArrayLength(aref);
	    Conditional<Integer> condCount = env.getIntField(ctx, objref, "count").simplify(arefCtx);
	    Map<Integer, FeatureExpr> map = condCount.toMap();
	    for (Integer count : map.keySet()) {
	    	FeatureExpr currentCtx = arefCtx.and(map.get(count));
		    int i, j;
		    int n = count + slen;
		    
		    if (n < alen) {
		      for (i=count, j=0; i<n; i++, j++) {
		        env.setCharArrayElement(currentCtx, aref, i, s.charAt(j));
		      }
		    } else {
		      int m = 3 * alen / 2;
		      if (m < n) {
		        m = n;
		      }
		      int arefNew = env.newCharArray(currentCtx, m);
		      for (i=0; i<count; i++) {
		        env.setCharArrayElement(currentCtx, arefNew, i, env.getCharArrayElement(aref, i).simplify(currentCtx).getValue());
		      }
		      for (j=0; i<n; i++, j++) {
		        env.setCharArrayElement(currentCtx, arefNew, i, s.charAt(j));
		      }
		      env.setReferenceField(NativeMethodInfo.CTX, objref, "value", arefNew);
		    }
		    
		    env.setIntField(currentCtx, objref, "count", n);
	    }
    }
    return objref;
  }

  // we skip the AbstractStringBuilder ctor here, which is a bit dangerous
  // This is only justified because StringBuilders are used everywhere (implicitly)
  @MJI
  public void $init____V (MJIEnv env, int objref){
    int aref = env.newCharArray(NativeMethodInfo.CTX, 16);
    env.setReferenceField(NativeMethodInfo.CTX, objref, "value", aref);
  }
  @MJI
  public void $init__I__V (MJIEnv env, int objref, int len){
    int aref = env.newCharArray(NativeMethodInfo.CTX, len);
    env.setReferenceField(NativeMethodInfo.CTX, objref, "value", aref);
  }

	@MJI
	public void $init__Ljava_lang_String_2__V(final MJIEnv env, final int objref, int sRef) {
		if (sRef == MJIEnv.NULL) {
			env.throwException("java.lang.NullPointerException");
			return;
		}
		FeatureExpr ctx = NativeMethodInfo.CTX;
		Conditional<char[]> src = env.getStringChars(sRef).simplify(ctx);
		src.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(FeatureExpr ctx, char[] src) {
				int aref = env.newCharArray(ctx, src.length + 16);
				char[] dst = env.getCharArrayObject(aref).getValue();
				System.arraycopy(src, 0, dst, 0, src.length);
				env.setReferenceField(ctx, objref, "value", aref);
				env.setIntField(ctx, objref, "count", src.length);
				return null;
			}

		});
	}  
  
  @MJI
  public int append__Ljava_lang_String_2__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, int sref) {
    String s = env.getStringObject(sref);
    
    if (s == null) s = "null";
    
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }
  
  @MJI
  public int append__I__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, int i) {
    String s = Integer.toString(i);
    
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }

  @MJI
  public int append__F__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, float f) {
    String s = Float.toString(f);
    
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }

  @MJI
  public int append__D__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, double d) {
    String s = Double.toString(d);
    
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }
  
  @MJI
  public int append__J__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, long l) {
    String s = Long.toString(l);
    
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }

  @MJI
  public int append__Z__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, boolean b) {
    String s = b ? "true" : "false";
    return appendString(NativeMethodInfo.CTX, env, objref, s);
  }
  
  @MJI
  public int append__C__Ljava_lang_StringBuilder_2 (MJIEnv env, int objref, char c) {
//	  return appendString(NativeMethodInfo.CTX, env, objref, c + "");
	  FeatureExpr ctx = NativeMethodInfo.CTX;
	  int aref = env.getReferenceField(ctx, objref, "value").getValue();
    int alen = env.getArrayLength(aref);
    
	int count = env.getIntField(ctx, objref, "count").getValue().intValue();
    int i;
    int n = count +1;
    
    if (n < alen) {
      env.setCharArrayElement(ctx, aref, count, c);
    } else {
      int m = 3 * alen / 2;
      int arefNew = env.newCharArray(ctx, m);
      for (i=0; i<count; i++) {
        env.setCharArrayElement(ctx, arefNew, i, env.getCharArrayElement(aref, i).getValue());
      }
      env.setCharArrayElement(ctx, arefNew, count, c);
      env.setReferenceField(ctx, objref, "value", arefNew);
    }
    
    env.setIntField(ctx, objref, "count", n);
    
    return objref;
    
  }

	@MJI
	public int toString____Ljava_lang_String_2(final MJIEnv env, final int objref) {
		FeatureExpr ctx = NativeMethodInfo.CTX;

		Conditional<Integer> aref = env.getReferenceField(ctx, objref, "value");
		Conditional<String> s = aref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(FeatureExpr ctx, Integer aref) {
				Conditional<char[]> buf = env.getCharArrayObject(aref);
				return buf.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<String>>() {

					@Override
					public Conditional<String> apply(FeatureExpr ctx, final char[] buf) {
						final Conditional<Integer> count = env.getIntField(ctx, objref, "count");
						return count.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

							@Override
							public Conditional<String> apply(FeatureExpr ctx, Integer count) {
								return new One<>(new String(buf, 0, count));
							}

						});

					}
				});
			}
		});
		return env.newString(ctx, s);
	}
}
