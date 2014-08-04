//
// Copyright (C) 2007 United States Government as represented by the
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

import cmu.conditional.Function;
import gov.nasa.jpf.annotation.MJI;

/**
 * we are not really interested in model checking this, so we intercept
 * and ignore
 * <2do> at some point we should probably do proper decoding/encoding,
 * but the java.lang.StringCoding class is unfortunately not public,
 * and it would be a pain to work around the access restrictions
 */
public class JPF_java_lang_StringCoding extends NativePeer {

  @MJI
  public int decode___3BII___3C (MJIEnv env, int clsObjRef,
      int bref, int off, int len) {

    
    int cref = env.newCharArray(NativeMethodInfo.CTX, len);
    for (int i=0,j=off; i<len; i++,j++) {
      env.setCharArrayElement(NativeMethodInfo.CTX, cref, i, env.getByteArrayElement(bref,j).map(new Function<Byte, Character>() {

		@Override
		public Character apply(Byte b) {
			return (char)b.byteValue();
		}
    	  
      }));
    }
    
    return cref;
  }
  
  @MJI
  public int encode___3CII___3B (MJIEnv env, int clsObjRef,
      int cref, int off, int len) {

    int bref = env.newByteArray(len);
    for (int i=0,j=off; i<len; i++,j++) {
      env.setByteArrayElement(NativeMethodInfo.CTX, bref, i, env.getCharArrayElement(cref,j).map(new Function<Character, Byte>() {

		@Override
		public Byte apply(Character c) {
			return (byte)c.charValue();
		}
    	  
      }));
      
    }

    return bref; 
  }
}
