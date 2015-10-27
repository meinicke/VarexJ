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

import java.util.HashMap;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.io.RandomAccessFile library abstraction
 *
 * @author Owen O'Malley
 */
public class JPF_java_io_RandomAccessFile extends NativePeer {

	// need to see whether the file is already in use
	// if so, then we'll update the file data and length in the original file
	// we do update the length in the local object, but not the data
		
	static HashMap<Integer, Integer> File2DataMap;
	
  public static boolean init (Config conf) {
    File2DataMap = new HashMap<>();
    return (File2DataMap != null);
  } 

	// get the mapped object if one exists
	private static int getMapping(MJIEnv env, int this_ptr, FeatureExpr ctx) {
		int fn_ptr = env.getReferenceField(ctx,this_ptr, "filename").getValue();
		Object o = File2DataMap.get(new Integer(fn_ptr));
		if (o == null)
			return this_ptr;
		return ((Integer)o).intValue();
	}
	
	// set the mapping during the constructor call
  @MJI
	public void setDataMap____V (MJIEnv env, int this_ptr, FeatureExpr ctx) {
		int fn_ptr = env.getReferenceField(ctx,this_ptr, "filename").getValue();
		if (!File2DataMap.containsKey(new Integer(fn_ptr))) 
			File2DataMap.put(new Integer(fn_ptr),new Integer(this_ptr));
	}
	
  static ClassInfo getDataRepresentationClassInfo (MJIEnv env, FeatureExpr ctx) {
    ThreadInfo ti = env.getThreadInfo();
//    Instruction insn = ti.getPC().getValue();
    
    ClassInfo ci = ClassLoaderInfo.getSystemResolvedClassInfo(DataRepresentation);
    if (ci.pushRequiredClinits(ctx, ti)){
      env.repeatInvocation();
      return null;
    }
    
    return ci;
  }

  @MJI
  public void writeByte__I__V (MJIEnv env, int this_ptr, int data, FeatureExpr ctx) {
    
    
    long current_posn = env.getLongField(this_ptr, current_position).getValue();
    long current_len = env.getLongField(this_ptr, current_length).getValue();
    int chunk_size = env.getStaticIntField(RandomAccessFile, CHUNK_SIZE);
    int chunk = findDataChunk(env, this_ptr, current_posn,
                              chunk_size, ctx);
    setDataValue(env, chunk, current_posn, (byte) data, chunk_size, ctx);
    current_posn += 1;
	env.setLongField(ctx, this_ptr, current_position, new One<>(current_posn));
    if (current_posn >= current_len) {
      env.setLongField(ctx, this_ptr, current_length, new One<>(current_posn + 1));
      // update length in the mapped object if it exists
      env.setLongField(ctx, getMapping(env,this_ptr, ctx), current_length, new One<>(current_posn + 1));
    }
  }

  /**
   * This is a bit lame doing it this way, but it is easy.
   */
  @MJI
  public void write___3BII__V (MJIEnv env, int this_ptr, int data_array,
                           int start, int len, FeatureExpr ctx) {
    byte[] data_values = env.getByteArrayObjectDeprecated(ctx, data_array);
    for(int i=start; i < len; ++i) {
      writeByte__I__V(env, this_ptr, data_values[i], ctx);
    }
  }

  @MJI
  public void setLength__J__V(MJIEnv env, int this_ptr, long len, FeatureExpr ctx) {
    long current_posn = env.getLongField(this_ptr, current_position).getValue();
    long current_len = env.getLongField(this_ptr, current_length).getValue();
    if (current_posn >= len && len < current_len) {
      
	env.setLongField(ctx, this_ptr, current_position, new One<>(len));
    }
    env.setLongField(ctx, this_ptr, current_length, new One<>(len));
    // update length in the mapped object if it exists
    env.setLongField(ctx, getMapping(env,this_ptr, ctx), current_length, new One<>(current_posn + 1));
  }

  @MJI
  public int read___3BII__I (MJIEnv env, int this_ptr, int data_array,
                         int start, int len, FeatureExpr ctx) {
    int i = 0;
    long current_posn = env.getLongField(this_ptr, current_position).getValue();
    long current_len = env.getLongField(this_ptr, current_length).getValue();
    while (i < len && current_posn < current_len) {
      env.setByteArrayElement(ctx, data_array, start + i, new One<>(readByte____B(env, this_ptr, ctx)));
      i += 1;
      current_posn += 1;
    }
    if (i == 0) {
      return -1;
    }
    return i;
  }

  @MJI
  public byte readByte____B (MJIEnv env, int this_ptr, FeatureExpr ctx) {
    long current_posn = env.getLongField(this_ptr, current_position).getValue();
    long current_len = env.getLongField(this_ptr, current_length).getValue();
    int chunk_size = env.getStaticIntField(RandomAccessFile, CHUNK_SIZE);
    if (current_posn >= current_len) {
      env.throwException(ctx, EOFException);
    }
    int chunk = findDataChunk(env, this_ptr, current_posn,
                              chunk_size, ctx);
    byte result = getDataValue(env, chunk, current_posn, chunk_size, ctx);
    env.setLongField(ctx, this_ptr, current_position, new One<>(current_posn + 1));
    return result;
  }

  private static final int INT_SIZE = 4;
  private static final String data_root = "data_root";
  private static final String current_position = "currentPosition";
  private static final String current_length = "currentLength";
  private static final String CHUNK_SIZE = "CHUNK_SIZE";
  private static final String chunk_index = "chunk_index";
  private static final String next = "next";
  private static final String data = "data";
  private static final String EOFException = "java.io.EOFException";
  private static final String RandomAccessFile = "java.io.RandomAccessFile";
  private static final String DataRepresentation =
    RandomAccessFile + "$DataRepresentation";

  private static int findDataChunk(MJIEnv env, int this_ptr, long position,
                                   int chunk_size, FeatureExpr ctx) {
  	
    ClassInfo dataRep = getDataRepresentationClassInfo(env, ctx);
    if (dataRep == null) {
      // will be reexecuted
      return 0;
    }
    
  	//check if the file data is mapped, use mapped this_ptr if it exists
  	this_ptr = getMapping(env,this_ptr, ctx);  	
    int prev_obj = MJIEnv.NULL;
    int cur_obj = env.getReferenceField(ctx, this_ptr, data_root).getValue();
    long chunk_idx = position/chunk_size;
    while (cur_obj != MJIEnv.NULL &&
           env.getLongField(cur_obj, chunk_index).getValue() < chunk_idx) {
      prev_obj = cur_obj;
      cur_obj = env.getReferenceField(ctx, cur_obj, next).getValue();
    }
    if (cur_obj != MJIEnv.NULL &&
        env.getLongField(cur_obj, chunk_index).getValue() == chunk_idx) {
      return cur_obj;
    }
    int result = env.newObject(ctx, dataRep);
    int int_array = env.newIntArray(chunk_size/INT_SIZE);
    env.setReferenceField(ctx, result, data, int_array);
    env.setLongField(ctx, result, chunk_index, new One<>(chunk_idx));
    env.setReferenceField(ctx, result, next, cur_obj);
    if (prev_obj == MJIEnv.NULL) {
      env.setReferenceField(ctx, this_ptr, data_root, result);
    } else {
      env.setReferenceField(ctx, prev_obj, next, result);
    }
    return result;
  }

  private static void setDataValue(MJIEnv env, int chunk_obj, long position,
                                   byte data_value, int chunk_size, FeatureExpr ctx) {
    int offset = (int) (position % chunk_size);
    int index = offset / INT_SIZE;
    int bit_shift = 8 * (offset % INT_SIZE);
    int int_array = env.getReferenceField(ctx, chunk_obj, data).getValue();
    int old_value = env.getIntArrayElement(int_array, index);
    env.setIntArrayElement(ctx, int_array,
                             index, new One<>((old_value & ~(0xff << bit_shift)) |
                             data_value << bit_shift));
  }

  private static byte getDataValue(MJIEnv env, int chunk_obj, long position,
                                   int chunk_size, FeatureExpr ctx) {
    int offset = (int) (position % chunk_size);
    int index = offset / INT_SIZE;
    int bit_shift = 8 * (offset % INT_SIZE);
    int int_array = env.getReferenceField(ctx, chunk_obj, data).getValue();
    return (byte) (env.getIntArrayElement(int_array, index) >> bit_shift);

  }
}

