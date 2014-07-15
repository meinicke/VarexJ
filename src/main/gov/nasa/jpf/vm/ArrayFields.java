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

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;

import java.io.PrintStream;

/**
 * a Field (data value) store for array objects
 */
public abstract class ArrayFields extends Fields {

	int getNumberOfFieldsOrElements() {
		return arrayLength(); // we have no fields
	}

	public abstract int arrayLength();

	public abstract int getHeapSize();

	public boolean isReferenceArray() {
		return false;
	}

	public int getNumberOfFields() {
		// has none
		return 0;
	}

	public void printElements(PrintStream ps, int max) {
		int len = arrayLength();
		if (max < 0)
			max = len;
		int i;
		for (i = 0; i < max; i++) {
			if (i > 0) {
				ps.print(',');
			}
			printValue(ps, i);
		}
		if (i < len) {
			ps.print("...");
		}
	}

	protected abstract void printValue(PrintStream ps, int idx);

	public abstract Object getValues();

	public boolean getBooleanValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a boolean[]");
	}

	public byte getByteValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a byte[]");
	}

	public char getCharValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a char[]");
	}

	public short getShortValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a short[]");
	}

	public int getIntValue(int pos) {
		// overridden by subclass
		throw new JPFException("not an int[]");
	}

	public Conditional<Integer> getIntValue2(int pos) {
		// overridden by subclass
		throw new JPFException("not an int[]");
	}

	public long getLongValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a long[]");
	}

	public float getFloatValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a float[]");
	}

	public double getDoubleValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a double[]");
	}

	public int getReferenceValue(int pos) {
		// overridden by subclass
		throw new JPFException("not a reference array");
	}
	
	public Conditional<Integer> getReferenceValue2 (int index) {
		throw new JPFException("not implemented");
	}

	public void setBooleanValue(int pos, boolean newValue) {
		// overridden by subclass
		throw new JPFException("not a boolean[]");
	}

	public void setByteValue(int pos, byte newValue) {
		// overridden by subclass
		throw new JPFException("not a byte[]");
	}

	public void setCharValue(int pos, char newValue) {
		// overridden by subclass
		throw new JPFException("not a char[]");
	}

	public void setShortValue(int pos, short newValue) {
		// overridden by subclass
		throw new JPFException("not a short[]");
	}

	public void setIntValue(int pos, Conditional<Integer> newValue) {
		// overridden by subclass
		throw new JPFException("not an int[]");
	}

	public void setIntValue(int pos, int newValue) {
		// overridden by subclass
		throw new JPFException("not an int[]");
	}

	public void setFloatValue(int pos, float newValue) {
		// overridden by subclass
		throw new JPFException("not a float[]");
	}

	public void setLongValue(int pos, long newValue) {
		// overridden by subclass
		throw new JPFException("not a long[]");
	}

	public void setDoubleValue(int pos, double newValue) {
		// overridden by subclass
		throw new JPFException("not a double[]");
	}

	public void setReferenceValue(int pos, int newValue) {
		// overridden by subclass
		throw new JPFException("not a reference array");
	}

	public void setReferenceValue(int pos, Conditional<Integer> newValue) {
		// overridden by subclass
		throw new JPFException("not a reference array");
	}

	public boolean[] asBooleanArray() {
		// overridden by subclass
		throw new JPFException("not a boolean[]");
	}

	public byte[] asByteArray() {
		// overridden by subclass
		throw new JPFException("not a byte[]");
	}

	public char[] asCharArray() {
		// overridden by subclass
		throw new JPFException("not a char[]");
	}

	public char[] asCharArray(int offset, int length) {
		// overridden by subclass
		throw new JPFException("not a char[]");
	}

	public short[] asShortArray() {
		// overridden by subclass
		throw new JPFException("not a short[]");
	}

	public int[] asIntArray() {
		// overridden by subclass
		throw new JPFException("not a int[]");
	}

	public int[] asReferenceArray() {
		// overridden by subclass
		throw new JPFException("not a reference array");
	}

	public long[] asLongArray() {
		// overridden by subclass
		throw new JPFException("not a long[]");
	}

	public float[] asFloatArray() {
		// overridden by subclass
		throw new JPFException("not a float[]");
	}

	public double[] asDoubleArray() {
		// overridden by subclass
		throw new JPFException("not a double[]");
	}

	public int[] asFieldSlots() {
		throw new JPFException("array has no field slots");
	}

}
