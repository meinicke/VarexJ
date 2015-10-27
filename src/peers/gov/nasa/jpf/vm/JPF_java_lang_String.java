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

import java.io.UnsupportedEncodingException;
import java.util.Locale;

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import cmu.conditional.VoidBiFunction;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.String library abstraction
 */
public class JPF_java_lang_String extends NativePeer {

	@MJI
	public int init___3CII__Ljava_lang_String_2(final MJIEnv env, int objRef, Conditional<Integer> valueRef, final Conditional<Integer> offset, final Conditional<Integer> count, FeatureExpr ctx) {
		try {

			Conditional<char[]> value = valueRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<char[]>>() {

				@Override
				public Conditional<char[]> apply(FeatureExpr ctx, Integer valueRef) {
					return env.getCharArrayObject(valueRef);
				}

			}).simplify(ctx);

			Conditional<String> result = value.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<String>>() {

				@Override
				public Conditional<String> apply(FeatureExpr ctx, final char[] value) {
					return count.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

						@Override
						public Conditional<String> apply(FeatureExpr ctx, final Integer count) {
							return offset.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

								@SuppressWarnings("unchecked")
								@Override
								public Conditional<String> apply(FeatureExpr ctx, Integer offset) {
									if (ctx.isContradiction()) {
										return (Conditional<String>) One.NULL;
									}
									return new One<>(new String(value, offset, count));
								}
							});
						}

					});

				}

			}).simplify(ctx);
			return env.newString(ctx, result);
		} catch (Exception e) {
			System.out.println("JPF_java_lang_String.init___3CII__Ljava_lang_String_2()");
			System.out.println(e);
			for (StackTraceElement t : e.getStackTrace()) {
				System.out.println(t);
			}
		}
		return -1;
	}

	@MJI
	public int init___3III__Ljava_lang_String_2(MJIEnv env, int objRef, int codePointsRef, int offset, int count, FeatureExpr ctx) {
		int[] codePoints = env.getIntArrayObject(ctx, codePointsRef);
		String result = new String(codePoints, offset, count);
		return env.newString(ctx, result);
	}

	@SuppressWarnings("deprecation")
	@MJI
	public int init___3BIII__Ljava_lang_String_2(MJIEnv env, int objRef, int asciiRef, int hibyte, int offset, int count, FeatureExpr ctx) {
		byte[] ascii = env.getByteArrayObjectDeprecated(ctx, asciiRef);
		String result = new String(ascii, hibyte, offset, count);
		return env.newString(ctx, result);
	}

	@MJI
	public int init___3BIILjava_lang_String_2__Ljava_lang_String_2(MJIEnv env, int objRef, int bytesRef, int offset, int length, int charsetNameRef, FeatureExpr ctx)
			throws UnsupportedEncodingException {
		byte[] bytes = env.getByteArrayObjectDeprecated(ctx, bytesRef);
		String charsetName = env.getStringObject(ctx, charsetNameRef);
		String result = new String(bytes, offset, length, charsetName);
		return env.newString(ctx, result);
	}

	@MJI
	public int init___3BII__Ljava_lang_String_2(MJIEnv env, int objRef, int bytesRef, int offset, int length, FeatureExpr ctx) {
		byte[] bytes = env.getByteArrayObjectDeprecated(ctx, bytesRef);
		String result = new String(bytes, offset, length);
		return env.newString(ctx, result);
	}

	@MJI
	public int codePointAt__I__I(MJIEnv env, int objRef, int index, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		return obj.codePointAt(index);
	}

	@MJI
	public int codePointBefore__I__I(MJIEnv env, int objRef, int index, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		return obj.codePointBefore(index);
	}

	@MJI
	public int codePointCount__II__I(MJIEnv env, int objRef, int beginIndex, int endIndex, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		return obj.codePointCount(beginIndex, endIndex);
	}

	@MJI
	public int offsetByCodePoints__II__I(MJIEnv env, int objRef, int index, int codePointOffset, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		return obj.offsetByCodePoints(index, codePointOffset);
	}

	@MJI
	public void getChars__II_3CI__V(final MJIEnv env, final Conditional<Integer> objRef, Conditional<Integer> srcBegin, final Conditional<Integer> srcEnd, final Conditional<Integer> dstRef,
			final Conditional<Integer> dstBegin, FeatureExpr ctx) {
		srcBegin.mapf(ctx, new VoidBiFunction<FeatureExpr, Integer>() {

			@Override
			public void apply(FeatureExpr ctx, final Integer srcBegin) {
				srcEnd.mapf(ctx, new VoidBiFunction<FeatureExpr, Integer>() {

					@Override
					public void apply(FeatureExpr ctx, final Integer srcEnd) {
						dstRef.mapf(ctx, new VoidBiFunction<FeatureExpr, Integer>() {

							@Override
							public void apply(FeatureExpr ctx, final Integer dstRef) {
								dstBegin.mapf(ctx, new VoidBiFunction<FeatureExpr, Integer>() {

									@Override
									public void apply(FeatureExpr ctx, final Integer dstBegin) {
										final Conditional<String> obj = env.getStringObjectNew(ctx, objRef.getValue());
										obj.mapf(ctx, new VoidBiFunction<FeatureExpr, String>() {

											@Override
											public void apply(FeatureExpr ctx, String obj) {
												if (Conditional.isContradiction(ctx)) {
													return;
												}
												try {
													for (int index = 0; index < srcEnd - srcBegin; index++) {
														env.setCharArrayElement(ctx, dstRef, index + dstBegin, new One<>(obj.charAt(srcBegin + index)));
													}
												} catch (Exception e) {
													System.out.println(e);
													env.throwException(ctx, e.getClass().getName(), e.getMessage());
												}
											}

										});
									}

								});
							}

						});

					}

				});
			}

		});
	}

	@SuppressWarnings("deprecation")
	@MJI
	public void getBytes__II_3BI__V(MJIEnv env, int objRef, int srcBegin, int srcEnd, int dstRef, int dstBegin, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		byte[] dst = env.getByteArrayObjectDeprecated(ctx, dstRef);
		obj.getBytes(srcBegin, srcEnd, dst, dstBegin);

		for (int i = dstBegin; i < srcEnd - srcBegin + dstBegin; i++) {
			env.setByteArrayElement(ctx, dstRef, i, new One<>(dst[i]));
		}
	}

	@MJI
	public Conditional<Integer> getBytes__Ljava_lang_String_2___3B(final MJIEnv env, Conditional<Integer> objRef, Conditional<Integer> charSetRef, final FeatureExpr ctx) {
		Conditional<String> string = env.getStringObject(ctx, objRef);
		final String charset = env.getStringObject(ctx, charSetRef.getValue());
		return string.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr x, String string) {
				try {
					return new One<>(env.newByteArray(ctx, string.getBytes(charset)));
				} catch (UnsupportedEncodingException uex) {
					env.throwException(ctx, uex.getClass().getName(), uex.getMessage());
					return One.MJIEnvNULL;
				}
			}

		});
	}

	@MJI
	public int getBytes_____3B(MJIEnv env, int objRef, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		byte[] bytes = obj.getBytes();
		return env.newByteArray(ctx, bytes);
	}

	@MJI
	public Conditional<Character> charAt__I__C(final MJIEnv env, Conditional<Integer> objRef, final Conditional<Integer> index, FeatureExpr ctx) {
		Conditional<char[]> data = objRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<char[]>>() {

			@Override
			public Conditional<char[]> apply(FeatureExpr ctx, Integer objRef) {
				return env.getStringChars(objRef);
			}
			
		}).simplify(ctx);
		return data.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<Character>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<Character> apply(FeatureExpr ctx, final char[] data) {
				if (Conditional.isContradiction(ctx)) {
					return (Conditional<Character>) One.NULL;
				}
				return index.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Character>>() {

					@Override
					public Conditional<Character> apply(FeatureExpr ctx, Integer index) {
						if ((index < 0) || (index >= data.length)) {
							env.ti.createAndThrowException(ctx, StringIndexOutOfBoundsException.class.getName(), index + "");
							return (Conditional<Character>) One.NULL;
						}
						return new One<>(data[index]);// currently not lifted						
					}
				});

			}

		}).simplify();

	}

	@MJI
	public boolean equals0___3C_3CI__Z(MJIEnv env, int clsObjRef, int charsRef1, int charsRef2, int len, FeatureExpr ctx) {

		if ((charsRef1 == MJIEnv.NULL) || (charsRef2 == MJIEnv.NULL)) {
			return false;
		}

		char[] a = env.getCharArrayObject(charsRef1).getValue();
		char[] b = env.getCharArrayObject(charsRef2).getValue();

		if (a.length < len || b.length < len) {
			return false;
		}

		for (int i = 0; i < len; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}

	@MJI
	public Conditional<Boolean> equals__Ljava_lang_Object_2__Z(final MJIEnv env, final int objRef, Conditional<Integer> argRef, FeatureExpr ctx) {
		return argRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Integer argRef) {
				if (Conditional.isContradiction(ctx)) {
					return One.TRUE;
				}
				if (argRef == MJIEnv.NULL) {
					return One.FALSE;
				}

				Heap heap = env.getHeap();
				ElementInfo s1 = heap.get(objRef);
				ElementInfo s2 = heap.get(argRef);

				if (!env.isInstanceOf(argRef, "java.lang.String")) {
					return One.FALSE;
				}

				Fields f1 = heap.get(s1.getReferenceField("value").simplify(ctx).getValue()).getFields();
				final Fields f2 = heap.get(s2.getReferenceField("value").simplify(ctx).getValue()).getFields();

				Conditional<char[]> c1 = ((CharArrayFields) f1).asCharArray().simplify(ctx);
				return c1.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<Boolean>>() {

					@Override
					public Conditional<Boolean> apply(FeatureExpr ctx, char[] c1) {
						char[] c2 = ((CharArrayFields) f2).asCharArray().simplify(ctx).getValue();

						if (c1.length != c2.length) {
							return One.FALSE;
						}

						for (int i = 0; i < c1.length; i++) {
							if (c1[i] != c2[i]) {
								return One.FALSE;
							}
						}

						return One.TRUE;

					}

				});

			}

		});
	}

	@MJI
	public boolean equalsIgnoreCase__Ljava_lang_String_2__Z(MJIEnv env, int objref, int anotherString, FeatureExpr ctx) {
		String thisString = env.getStringObject(ctx, objref);
		if (anotherString != MJIEnv.NULL) {
			return thisString.equalsIgnoreCase(env.getStringObject(ctx, anotherString));
		} else {
			return false;
		}
	}

	@MJI
	public int compareTo__Ljava_lang_String_2__I(MJIEnv env, int objRef, int anotherStringRef, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		String anotherString = env.getStringObject(ctx, anotherStringRef);
		return obj.compareTo(anotherString);
	}

	@MJI
	public int MJIcompare__Ljava_lang_String_2Ljava_lang_String_2__I(MJIEnv env, int clsRef, int s1Ref, int s2Ref, FeatureExpr ctx) {
		// Is there a way to reflect?
		String a = env.getStringObject(ctx, s1Ref);
		String s2 = env.getStringObject(ctx, s2Ref);
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
					if (x != y) {
						return x - y;
					}
				}
			}
		}
		return n1 - n2;
	}

	@MJI
	public boolean regionMatches__ILjava_lang_String_2II__Z(MJIEnv env, int objRef, int toffset, int otherRef, int ooffset, int len, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		String other = env.getStringObject(ctx, otherRef);
		return obj.regionMatches(toffset, other, ooffset, len);

	}

	@MJI
	public boolean regionMatches__ZILjava_lang_String_2II__Z(MJIEnv env, int objRef, Conditional<Boolean> ignoreCase, Conditional<Integer> toffset, Conditional<Integer> otherRef,
			Conditional<Integer> ooffset, Conditional<Integer> len, FeatureExpr ctx) {
		String obj = env.getStringObject(ctx, objRef);
		String other = env.getStringObject(ctx, otherRef.getValue());
		return obj.regionMatches(ignoreCase.getValue(), toffset.getValue(), other, ooffset.getValue(), len.getValue());

	}

	@MJI
	public boolean startsWith__Ljava_lang_String_2I__Z(MJIEnv env, int objRef, int prefixRef, int toffset, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objRef);
		String prefix = env.getStringObject(ctx, prefixRef);
		return thisStr.startsWith(prefix, toffset);
	}

	@MJI
	public boolean startsWith__Ljava_lang_String_2__Z(MJIEnv env, int objRef, int prefixRef, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objRef);
		String prefix = env.getStringObject(ctx, prefixRef);
		return thisStr.startsWith(prefix);
	}

	@MJI
	public Conditional<Integer> hashCode____I(final MJIEnv env, final int objref, FeatureExpr ctx) {
		final ElementInfo ei = env.getElementInfo(objref);
		Conditional<Integer> h = ei.getIntField("hash").simplify(ctx);

		return h.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Integer h) {
				if (h == 0) {
					int vref = env.getReferenceField(ctx, objref, "value").getValue();

					// now get the char array data, but be aware they are stored as ints
					ElementInfo eiVal = env.getElementInfo(vref);
					char[] values = eiVal.asCharArray().simplify(ctx).getValue();

					for (int i = 0; i < values.length; i++) {
						h = 31 * h + values[i];
					}

					ei.getModifiableInstance().setIntField(ctx, "hash", new One<>(h));
				}

				return new One<>(h);
			}

		}).simplify();

	}

	@MJI
	public int indexOf__I__I(MJIEnv env, int objref, int c, FeatureExpr ctx) {
		return indexOf__II__I(env, objref, c, 0, ctx);
	}

	@MJI
	public int indexOf__II__I(MJIEnv env, int objref, int c, int fromIndex, FeatureExpr ctx) {

		int vref = env.getReferenceField(ctx, objref, "value").getValue();
		ElementInfo ei = env.getElementInfo(vref);
		char[] values = ((CharArrayFields) ei.getFields()).asCharArray().getValue();

		int len = values.length;

		if (fromIndex >= len) {
			return -1;
		}
		if (fromIndex < 0) {
			fromIndex = 0;
		}

		for (int i = fromIndex; i < len; i++) {
			if (values[i] == c) {
				return i;
			}
		}

		return -1;
	}

	@MJI
	public int lastIndexOf__I__I(MJIEnv env, int objref, int c, FeatureExpr ctx) {
		return lastIndexOf__II__I(env, objref, c, Integer.MAX_VALUE, ctx);
	}

	@MJI
	public int lastIndexOf__II__I(MJIEnv env, int objref, int c, int fromIndex, FeatureExpr ctx) {

		int vref = env.getReferenceField(ctx, objref, "value").getValue();
		ElementInfo ei = env.getElementInfo(vref);
		char[] values = ((CharArrayFields) ei.getFields()).asCharArray().getValue();

		int len = values.length;

		if (fromIndex < 0) {
			return -1;
		}
		if (fromIndex > len - 1) {
			fromIndex = len - 1;
		}

		for (int i = fromIndex; i >= 0; i--) {
			if (values[i] == c) {
				return i;
			}
		}

		return -1;
	}

	@MJI
	public int indexOf__Ljava_lang_String_2__I(MJIEnv env, int objref, int str, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objref);
		String indexStr = env.getStringObject(ctx, str);

		return thisStr.indexOf(indexStr);
	}

	@MJI
	public int indexOf__Ljava_lang_String_2I__I(MJIEnv env, int objref, int str, int fromIndex, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objref);
		String indexStr = env.getStringObject(ctx, str);

		return thisStr.indexOf(indexStr, fromIndex);
	}

	@MJI
	public int lastIndexOf__Ljava_lang_String_2I__I(MJIEnv env, int objref, int str, int fromIndex, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objref);
		String indexStr = env.getStringObject(ctx, str);

		return thisStr.lastIndexOf(indexStr, fromIndex);
	}

	@MJI
	public int substring__I__Ljava_lang_String_2(MJIEnv env, int objRef, final Conditional<Integer> beginIndex, FeatureExpr ctx) {
		Conditional<String> obj = env.getStringObjectNew(ctx, objRef);
		Conditional<String> result = obj.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<String>>() {

			@Override
			public Conditional<String> apply(FeatureExpr ctx, final String obj) {
				return beginIndex.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

					@Override
					public Conditional<String> apply(FeatureExpr ctx, final Integer beginIndex) {
						if (Conditional.isContradiction(ctx)) {
							return new One<>("");
						}
						String result = obj.substring(beginIndex);
						return new One<>(result);
					}

				});
			}

		}).simplify();
		return env.newString(ctx, result);
	}

	@MJI
	public int substring__II__Ljava_lang_String_2(final MJIEnv env, int objRef, final Conditional<Integer> beginIndex, final Conditional<Integer> endIndex, FeatureExpr ctx) {
		Conditional<String> obj = env.getStringObjectNew(ctx, objRef);
		Conditional<String> result = obj.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<String>>() {

			@Override
			public Conditional<String> apply(FeatureExpr ctx, final String obj) {
				return beginIndex.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

					@Override
					public Conditional<String> apply(FeatureExpr ctx, final Integer beginIndex) {
						return endIndex.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

							@Override
							public Conditional<String> apply(FeatureExpr ctx, Integer endIndex) {
								if (Conditional.isContradiction(ctx)) {
									return new One<>("");
								}
								try {
									String result = obj.substring(beginIndex, endIndex);
									return new One<>(result);
								} catch (StringIndexOutOfBoundsException e) {
									String exceptionClass = e.toString();
									exceptionClass = exceptionClass.substring(0, exceptionClass.indexOf(":"));
									env.ti.createAndThrowException(ctx, exceptionClass, e.getMessage());
								}
								return new One<>(null);
							}
						});

					}

				});
			}

		}).simplify();

		return env.newString(ctx, result);

	}

	@MJI
	public int concat__Ljava_lang_String_2__Ljava_lang_String_2(MJIEnv env, int objRef, int strRef, FeatureExpr ctx) {
		Heap heap = env.getHeap();

		ElementInfo thisStr = heap.get(objRef);
		CharArrayFields thisFields = (CharArrayFields) heap.get(thisStr.getReferenceField("value").getValue()).getFields();
		char[] thisChars = thisFields.asCharArray().getValue();
		int thisLength = thisChars.length;

		ElementInfo otherStr = heap.get(strRef);
		CharArrayFields otherFields = (CharArrayFields) heap.get(otherStr.getReferenceField("value").getValue()).getFields();
		char[] otherChars = otherFields.asCharArray().getValue();
		int otherLength = otherChars.length;

		if (otherLength == 0) {
			return objRef;
		}

		char resultChars[] = new char[thisLength + otherLength];
		System.arraycopy(thisChars, 0, resultChars, 0, thisLength);
		System.arraycopy(otherChars, 0, resultChars, thisLength, otherLength);

		return env.newString(ctx, new String(resultChars));
	}

	// --- the various replaces

	@MJI
	public int replace__CC__Ljava_lang_String_2(MJIEnv env, int objRef, char oldChar, char newChar, FeatureExpr ctx) {

		if (oldChar == newChar) { // nothing to replace
			return objRef;
		}

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
			return env.newString(ctx, s);

		} else { // oldChar not found, return the original string
			return objRef;
		}
	}

	@MJI
	public boolean matches__Ljava_lang_String_2__Z(MJIEnv env, int objRef, int regexRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, objRef);
		String r = env.getStringObject(ctx, regexRef);

		return s.matches(r);
	}

	@MJI
	public int replaceFirst__Ljava_lang_String_2Ljava_lang_String_2__Ljava_lang_String_2(MJIEnv env, int objRef, int regexRef, int replacementRef, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objRef);
		String regexStr = env.getStringObject(ctx, regexRef);
		String replacementStr = env.getStringObject(ctx, replacementRef);

		String result = thisStr.replaceFirst(regexStr, replacementStr);
		return (result != thisStr) ? env.newString(ctx, result) : objRef;
	}

	@MJI
	public int replaceAll__Ljava_lang_String_2Ljava_lang_String_2__Ljava_lang_String_2(MJIEnv env, int objRef, int regexRef, int replacementRef, FeatureExpr ctx) {
		String thisStr = env.getStringObject(ctx, objRef);
		String regexStr = env.getStringObject(ctx, regexRef);
		String replacementStr = env.getStringObject(ctx, replacementRef);

		String result = thisStr.replaceAll(regexStr, replacementStr);
		return (result != thisStr) ? env.newString(ctx, result) : objRef;
	}

	@MJI
	public int split__Ljava_lang_String_2I___3Ljava_lang_String_2(MJIEnv env, int clsObjRef, int strRef, int limit, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, strRef);
		String obj = env.getStringObject(ctx, clsObjRef);

		String[] result = obj.split(s, limit);

		return env.newStringArray(ctx, result);
	}

	@MJI
	public int split__Ljava_lang_String_2___3Ljava_lang_String_2(MJIEnv env, int clsObjRef, int strRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, strRef);
		String obj = env.getStringObject(ctx, clsObjRef);

		String[] result = obj.split(s);

		return env.newStringArray(ctx, result);
	}

	@MJI
	public int toLowerCase__Ljava_util_Locale_2__Ljava_lang_String_2(MJIEnv env, int objRef, int locRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, objRef);
		Locale loc = JPF_java_util_Locale.getLocale(env, locRef, ctx);

		String lower = s.toLowerCase(loc);

		return (s == lower) ? objRef : env.newString(ctx, lower);
	}

	@MJI
	public int toLowerCase____Ljava_lang_String_2(MJIEnv env, int objRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, objRef);
		String lower = s.toLowerCase();

		return (s == lower) ? objRef : env.newString(ctx, lower);
	}

	@MJI
	public int toUpperCase__Ljava_util_Locale_2__Ljava_lang_String_2(MJIEnv env, int objRef, int locRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, objRef);
		Locale loc = JPF_java_util_Locale.getLocale(env, locRef, ctx);

		String upper = s.toUpperCase(loc);

		return (s == upper) ? objRef : env.newString(ctx, upper);
	}

	@MJI
	public int toUpperCase____Ljava_lang_String_2(MJIEnv env, int objRef, FeatureExpr ctx) {
		String s = env.getStringObject(ctx, objRef);
		String upper = s.toUpperCase();

		return (s == upper) ? objRef : env.newString(ctx, upper);
	}

	@MJI
	public int trim____Ljava_lang_String_2(MJIEnv env, int objRef, FeatureExpr ctx) {
		Heap heap = env.getHeap();
		ElementInfo thisStr = heap.get(objRef);

		CharArrayFields thisFields = (CharArrayFields) heap.get(thisStr.getReferenceField("value").simplify(ctx).getValue()).getFields();
		char[] thisChars = thisFields.asCharArray().simplify(ctx).getValue();
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
		return env.newString(ctx, result);
	}

	@MJI
	public int toCharArray_____3C(MJIEnv env, int objref, FeatureExpr ctx) {

		int vref = env.getReferenceField(ctx, objref, "value").getValue();
		char[] v = env.getCharArrayObject(vref).getValue();

		int cref = env.newCharArray(ctx, v);

		return cref;
	}

	@MJI
	public int format__Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_lang_String_2(MJIEnv env, int clsObjRef, int fmtRef, int argRef, FeatureExpr ctx) {
		return env.newString(ctx, env.format(ctx, fmtRef, argRef));
	}

	@MJI
	public int format__Ljava_util_Locale_2Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_lang_String_2(MJIEnv env, int clsObjRef, int locRef, int fmtRef, int argRef, FeatureExpr ctx) {
		Locale loc = JPF_java_util_Locale.getLocale(env, locRef, ctx);
		return env.newString(ctx, env.format(ctx, loc, fmtRef, argRef));
	}

	@MJI
	public int intern____Ljava_lang_String_2(MJIEnv env, int robj, FeatureExpr ctx) {
		// <2do> Replace this with a JPF space HashSet once we have a String model
		Heap heap = env.getHeap();

		String s = env.getStringObject(ctx, robj);
		ElementInfo ei = heap.newInternString(ctx, s, env.getThreadInfo());

		return ei.getObjectRef();
	}

	private static final Function<Integer, String> ValueOf = new Function<Integer, String>() {

		@Override
		public String apply(Integer i) {
			return String.valueOf(i);
		}

	};

	@MJI
	public int valueOf__I__Ljava_lang_String_2(MJIEnv env, int clsref, Conditional<Integer> i, FeatureExpr ctx) {
		Conditional<String> result = i.map(ValueOf);
		return env.newString(ctx, result);
	}

	@MJI
	public int valueOf__J__Ljava_lang_String_2(MJIEnv env, int clsref, long l, FeatureExpr ctx) {
		String result = String.valueOf(l);
		return env.newString(ctx, result);
	}

	@MJI
	public int valueOf__F__Ljava_lang_String_2(MJIEnv env, int clsref, float f, FeatureExpr ctx) {
		String result = String.valueOf(f);
		return env.newString(ctx, result);
	}

	@MJI
	public int valueOf__D__Ljava_lang_String_2(MJIEnv env, int clsref, double d, FeatureExpr ctx) {
		String result = String.valueOf(d);
		return env.newString(ctx, result);
	}
}
