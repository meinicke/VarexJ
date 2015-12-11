/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package jikesRVM.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class TestFieldReflection extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void main() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			TestFieldReflection.main(null);
		}
	}

	static class TypeWithPublicFields {
		public static boolean sboolean = true;
		public static byte sbyte = 127;
		public static short sshort = 1;
		public static int sint = 1;
		public static long slong = 1;
		public static float sfloat = 1.0F;
		public static double sdouble = 1.0;

		public boolean mboolean = true;
		public byte mbyte = 127;
		public short mshort = 1;
		public int mint = 1;
		public long mlong = 1;
		public float mfloat = 1.0F;
		public double mdouble = 1.0;
	}

	@SuppressWarnings("unused")
	static class TypeWithDifferentAccessModifiers {
		public static boolean sboolean = true;
		protected static byte sbyte = 127;
		static short sshort = 1;
		private static int sint = 1;
		public static long slong = 1;
		protected static float sfloat = 1.0F;
		static double sdouble = 1.0;

		private boolean mboolean = true;
		byte mbyte = 127;
		protected short mshort = 1;
		public int mint = 1;
		protected long mlong = 1;
		float mfloat = 1.0F;
		private double mdouble = 1.0;
	}

	public static void main(String[] args) throws Exception {
		testFieldReflection(TypeWithPublicFields.class);
		testFieldReflection(TypeWithDifferentAccessModifiers.class);
	}
	
	@Test
	public void byteTestFail() throws InstantiationException, IllegalAccessException {
		if (false||verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Class<?> type = TypeWithDifferentAccessModifiers.class;
			Field[] fields = type.getDeclaredFields();
			Arrays.sort(fields, StringComparator.COMPARATOR);
			Object newInstance = type.newInstance();
			printFields(newInstance, fields);
			try {
				System.out.println(fields[2].getName());
				fields[2].setByte(newInstance, (byte) 12);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return;
			}
			fail();
		}
	}
	
	@Test
	public void byteTestFailVarexJ() throws InstantiationException, IllegalAccessException {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			byteTest();
		}
	}
	
	@Test
	public void byteTestFailJava() throws InstantiationException, IllegalAccessException {
		byteTest();
	}

	private void byteTest() throws InstantiationException, IllegalAccessException {
		Class<?> type = TypeWithDifferentAccessModifiers.class;
		Field[] fields = type.getDeclaredFields();
		Arrays.sort(fields, StringComparator.COMPARATOR);
		Object newInstance = type.newInstance();
		
		printFields(newInstance, fields);
		System.out.println(fields[0].getName());
		fields[0].setByte(newInstance, (byte) 12);
		printFields(newInstance, fields);
		System.out.println(fields[1].getName());
		fields[1].setByte(newInstance, (byte) 12);
		printFields(newInstance, fields);
		expectIllegalAccess(fields[2], newInstance);
		expectIllegalAccess(fields[3], newInstance);
		expectIllegalAccess(fields[4], newInstance);
		fields[5].setByte(newInstance, (byte) 12);
		fields[6].setByte(newInstance, (byte) 12);
		fields[7].setByte(newInstance, (byte) 12);
		fields[8].setByte(newInstance, (byte) 12);
		fields[9].setByte(newInstance, (byte) 12);
		expectIllegalArgument(fields[10], newInstance);
		fields[11].setByte(newInstance, (byte) 12);
		fields[12].setByte(newInstance, (byte) 12);
		fields[13].setByte(newInstance, (byte) 12);
	}
	
	private void expectIllegalAccess(Field field, Object newInstance) {
		try {
			System.out.println(field.getName());
			field.setByte(newInstance, (byte) 12);
		} catch (IllegalAccessException e) {
			// expected
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
	}
	
	private void expectIllegalArgument(Field field, Object newInstance) {
		try {
			System.out.println(field.getName());
			field.setByte(newInstance, (byte) 12);
		} catch (IllegalArgumentException e) {
			// expected
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
	}
	
	@Test
	public void shortTestFail() throws InstantiationException, IllegalAccessException {
		// expected: Set shorts to 2 !!+++++!!+++++
		// actual:   Set shorts to 2 !!!!!!+!!!!!!+
		if (false||verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Class<?> type = TypeWithPublicFields.class;
			Field[] fields = type.getFields();
			Arrays.sort(fields, StringComparator.COMPARATOR);
//			testByte(type.newInstance(), fields);
			
			Object newInstance = type.newInstance();
//			fields[0].setShort(newInstance, false);
//			fields[1].setShort(newInstance, (short) 2);
//			fields[2].setShort(newInstance, (short) 2);
//			fields[3].setShort(newInstance, (short) 2);
//			fields[4].setShort(newInstance, (short) 2);
//			fields[5].setShort(newInstance, (short) 2);
//			fields[6].setShort(newInstance, (short) 2);
			for (final Field field : fields) {
				try {
					
					field.setShort(newInstance, (short) 2);
					changeSuccess();
				} catch (Exception e) {
					changeError(e);
				}
			}
			System.out.println();
			printFields(newInstance, fields);
		}
	}
	
	@Test
	public void intTestFail() throws InstantiationException, IllegalAccessException {
		// expected: Set shorts to 2 !!+++++!!+++++
		// actual:   Set shorts to 2 !!!!!!+!!!!!!+
		if (false||verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Class<?> type = TypeWithPublicFields.class;
			Field[] fields = type.getFields();
			Arrays.sort(fields, StringComparator.COMPARATOR);
//			testByte(type.newInstance(), fields);
			
			Object newInstance = type.newInstance();
//			fields[0].setInt(newInstance, false);
//			fields[1].setShort(newInstance, (short) 2);
//			fields[2].setInt(newInstance, (int) 2);
//			fields[3].setInt(newInstance, (int) 2);
//			fields[4].setInt(newInstance, (int) 2);
//			fields[5].setInt(newInstance, (int) 2);
//			fields[6].setInt(newInstance, (int) 2);
			for (final Field field : fields) {
				try {
					
					field.setInt(newInstance, (int) 2);
					changeSuccess();
				} catch (Exception e) {
					changeError(e);
				}
			}
			System.out.println();
			printFields(newInstance, fields);
		}
	}
	
	@Test
	public void longTestFail() throws InstantiationException, IllegalAccessException {
		// expected: Set shorts to 2 !!+++++!!+++++
		// actual:   Set shorts to 2 !!!!!!+!!!!!!+
		if (false||verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Class<?> type = TypeWithPublicFields.class;
			Field[] fields = type.getFields();
			Arrays.sort(fields, StringComparator.COMPARATOR);
//			testByte(type.newInstance(), fields);
			
			Object newInstance = type.newInstance();
//			fields[0].setLong(newInstance, false);
//			fields[1].setLong(newInstance, (long) 2);
//			fields[2].setLong(newInstance, (long) 2);
//			fields[3].setLong(newInstance, (long) 2);
//			fields[4].setLong(newInstance, (long) 2);
//			fields[5].setLong(newInstance, (long) 2);
//			fields[6].setLong(newInstance, (long) 2);
			for (final Field field : fields) {
				try {
					
					field.setLong(newInstance, (long) 4);
					changeSuccess();
				} catch (Exception e) {
					changeError(e);
				}
			}
			System.out.println();
			printFields(newInstance, fields);
		}
	}
	
	@Test
	public void floatTestFail() throws InstantiationException, IllegalAccessException {
		// expected: Set shorts to 2 !!+++++!!+++++
		// actual:   Set shorts to 2 !!!!!!+!!!!!!+
		if (false||verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Class<?> type = TypeWithPublicFields.class;
			Field[] fields = type.getFields();
			Arrays.sort(fields, StringComparator.COMPARATOR);
//			testByte(type.newInstance(), fields);
			
			Object newInstance = type.newInstance();
//			fields[0].setFloat(newInstance, false);
//			fields[1].setFloat(newInstance, (float) 5);
//			fields[2].setFloat(newInstance, (float) 5);
//			fields[3].setFloat(newInstance, (float) 5);
//			fields[4].setFloat(newInstance, (float) 5);
//			fields[5].setFloat(newInstance, (float) 5);
//			fields[6].setFloat(newInstance, (float) 5);
			for (final Field field : fields) {
				try {
					
					field.setFloat(newInstance, (float) 5);
					changeSuccess();
				} catch (Exception e) {
					changeError(e);
				}
			}
			System.out.println();
			printFields(newInstance, fields);
		}
	}

	private static void testFieldReflection(final Class<?> type) throws Exception {
		System.out.println("Testing on getFields");
		testFieldReflection(type.newInstance(), type, type.getFields());

		System.out.println("Testing on getDeclaredFields()");
		testFieldReflection(type.newInstance(), type, type.getDeclaredFields());
	}

	private static void testFieldReflection(final Object object, final Class<?> type, final Field[] fields) throws Exception {
		Arrays.sort(fields, StringComparator.COMPARATOR);

		printFields(object, fields);

		testBoolean(object, fields);
		printFields(object, fields);

		testByte(object, fields);
		printFields(object, fields);

		testShort(object, fields);
		printFields(object, fields);

		testInt(object, fields);
		printFields(object, fields);

		testLong(object, fields);
		printFields(object, fields);

		testFloat(object, fields);
		printFields(object, fields);

		testDouble(object, fields);
		printFields(object, fields);

		testType(type, "sboolean", boolean.class);
		testType(type, "sbyte", byte.class);
		testType(type, "sshort", short.class);
		testType(type, "sint", int.class);
		testType(type, "slong", long.class);
		testType(type, "sfloat", float.class);
		testType(type, "sdouble", double.class);
		testType(type, "mboolean", boolean.class);
		testType(type, "mbyte", byte.class);
		testType(type, "mshort", short.class);
		testType(type, "mint", int.class);
		testType(type, "mlong", long.class);
		testType(type, "mfloat", float.class);
		testType(type, "mdouble", double.class);
	}

	@SuppressWarnings("rawtypes")
	private static void testType(final Class<?> type, final String fieldName, final Class expected) {
		try {
			final Class<?> f = type.getDeclaredField(fieldName).getType();
			if (!expected.equals(f))
				System.out.println(expected + " is not equal to " + f);
		} catch (NoSuchFieldException e) {
			System.out.println("testType: Unable to retrieve field " + fieldName + " from class " + type.getName());
		}
	}

	private static void printFields(final Object object, final Field[] fields) {
		System.out.print("Values:");
		for (final Field field : fields) {
			String value = "";
			try {
				value = String.valueOf(field.get(object));
			} catch (IllegalArgumentException e) {
				value = "!";
			} catch (IllegalAccessException e) {
				value = "-";
			}
			System.out.printf(" %5s", value);
		}
		System.out.println();
	}

	private static void testBoolean(final Object object, final Field[] fields) {
		banner("boolean", "false");
		for (final Field field : fields) {
			try {
				field.setBoolean(object, false);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testByte(final Object object, final Field[] fields) {
		banner("byte", "12");
		for (final Field field : fields) {
			try {
				field.setByte(object, (byte) 12);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testShort(final Object object, final Field[] fields) {
		banner("short", "2");
		for (final Field field : fields) {
			try {
				field.setShort(object, (short) 2);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testInt(final Object object, final Field[] fields) {
		banner("int", "3");
		for (final Field field : fields) {
			try {
				field.setInt(object, 3);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testLong(final Object object, final Field[] fields) {
		banner("long", "4");
		for (final Field field : fields) {
			try {
				field.setLong(object, 4);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testFloat(final Object object, Field[] fields) {
		banner("float", "5");
		for (final Field field : fields) {
			try {
				field.setFloat(object, 5.0F);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void testDouble(final Object object, Field[] fields) {
		banner("double", "6.0");
		for (final Field field : fields) {
			try {
				field.setDouble(object, 6.0);
				changeSuccess();
			} catch (Exception e) {
				changeError(e);
			}
		}
		System.out.println();
	}

	private static void banner(final String typename, final Object value) {
		System.out.print("Set " + typename + "s to " + value + " ");
	}

	private static void changeSuccess() {
		System.out.print("+");
	}

	private static void changeError(final Exception e) {
		if (e instanceof IllegalAccessException) {
			System.out.print("-");
		} else {
			System.out.print("!");
		}
	}

	private static class StringComparator implements Comparator<Object> {
		static StringComparator COMPARATOR = new StringComparator();

		public int compare(final Object x, final Object y) {
			return x.toString().compareTo(y.toString());
		}
	}
}
