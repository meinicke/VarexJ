package gov.nasa.jpf.vm.util;

import gov.nasa.jpf.vm.MJIEnv;

import java.lang.reflect.Method;
import java.util.Arrays;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class InvokationUtils {
	public static Object invoke(String className, String methodName, Object... params) {
		try {
			return invoke(Class.forName(className), methodName, params);
		} catch (ClassNotFoundException e) {
			System.err.println("invoke exception");
			System.err.println(e);
			for (StackTraceElement element : e.getStackTrace()) {
				System.err.println(element);
			}
			System.err.println(e.getCause());
			for (StackTraceElement element : e.getCause().getStackTrace()) {
				System.err.println(element);
			}
			throw new RuntimeException(e);
		}
	}
	
	public static Object invoke(Class<?> c, String methodName, Object... params) {
		return invoke(c, null, methodName, params);
	}

	public static Object invoke(Class<?> c, Object o, String methodName, Object... params) {
		try {
			Class<?>[] paramTypes = new Class<?>[params.length];
			for (int i = 0; i < params.length; i++) {
				paramTypes[i] = (Class<?>) params[i].getClass();
				try {
					paramTypes[i] = (Class<?>) params[i].getClass().getField("TYPE").get(null);
				} catch (Exception e) {

				}

			}
			Method method = c.getDeclaredMethod(methodName, paramTypes);
			method.setAccessible(true);
			return method.invoke(o, params);
		} catch (Exception e) {
			System.err.println("invoke exception");
			System.err.println(e);
			for (StackTraceElement element : e.getStackTrace()) {
				System.err.println(element);
			}
			System.err.println(e.getCause());
			for (StackTraceElement element : e.getCause().getStackTrace()) {
				System.err.println(element);
			}
			throw new RuntimeException(e);
		}
	}

	public static String toString(Object[] params) {
		StringBuilder paramString = new StringBuilder();
		for (Object p : params) {
			if (p instanceof byte[]) {
				paramString.append(Arrays.toString((byte[]) p));
			} else {
				paramString.append(p);
			}
			paramString.append(", ");
		}
		return paramString.toString();
	}

	public static void setArrayElements(MJIEnv env, int bArrayRef, byte[] data, int off, int len, FeatureExpr ctx) {
		for (int i = off; i < off + len; i++) {
			env.setByteArrayElement(ctx, bArrayRef, i, new One<>(data[i]));
		}
	}

}
