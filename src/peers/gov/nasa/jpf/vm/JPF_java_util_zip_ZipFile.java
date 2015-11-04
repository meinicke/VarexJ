package gov.nasa.jpf.vm;

import java.lang.reflect.Method;
import java.util.Arrays;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;
@SuppressWarnings("deprecation")
public class JPF_java_util_zip_ZipFile extends NativePeer {

	@MJI
	public void initIDs____V(MJIEnv env, int clsref, FeatureExpr ctx) {
		invoke("initIDs");
	}

	@MJI
	public long open__Ljava_lang_String_2IJZ__J(MJIEnv env, int clsref, int nemeRef, int mode, long lastModified, boolean usemmap, FeatureExpr ctx) {
		String name = env.getStringObject(ctx, nemeRef);
		if (name.startsWith("/")) {
			name = name.replaceFirst("/", "");
		}
		return (long) invoke("open", name, mode, lastModified, usemmap);
	}

	@MJI
	public int read__JJJ_3BII__I(MJIEnv env, int clsRef, long jzfile, long jzentry, long pos, int bArrayRef, int off, int len, FeatureExpr ctx) throws Exception {
		byte[] data = env.getByteArrayObjectDeprecated(ctx, bArrayRef);
		int result = (int) invoke("read", jzfile, jzentry, pos, data, off, len);
		setArrayElements(env, bArrayRef, data, off, len, ctx);
		return result;
	}

	@MJI
	public int getTotal__J__I(MJIEnv env, int clsRef, long jzfile, FeatureExpr ctx) throws Exception {
		return (int) invoke("getTotal", jzfile);
	}

	@MJI
	public boolean startsWithLOC__J__Z(MJIEnv env, int clsRef, long jzfile, FeatureExpr ctx) throws Exception {
		return (boolean) invoke("startsWithLOC", jzfile);
	}

	@MJI
	public long getEntry__J_3BZ__J(MJIEnv env, int clsRef, long jzfile, int nameRef, boolean addSlash, FeatureExpr ctx) throws Exception {
		byte[] name = env.getByteArrayObjectDeprecated(ctx, nameRef);
		return (long) invoke("getEntry", jzfile, name, addSlash);
	}

	@MJI
	public int getEntryFlag__J__I(MJIEnv env, int clsRef, long jzfile, FeatureExpr ctx) throws Exception {
		return (int) invoke("getEntryFlag", jzfile);
	}

	@MJI
	public long getEntryTime__J__J(MJIEnv env, int clsRef, long jzentry, FeatureExpr ctx) throws Exception {
		return (long) invoke("getEntryTime", jzentry);
	}

	@MJI
	public long getEntryCrc__J__J(MJIEnv env, int clsRef, long jzentry, FeatureExpr ctx) throws Exception {
		return (long) invoke("getEntryCrc", jzentry);
	}

	@MJI
	public long getEntrySize__J__J(MJIEnv env, int clsRef, long jzentry, FeatureExpr ctx) throws Exception {
		return (long) invoke("getEntrySize", jzentry);
	}

	@MJI
	public long getEntryCSize__J__J(MJIEnv env, int clsRef, long jzentry, FeatureExpr ctx) throws Exception {
		return (long) invoke("getEntryCSize", jzentry);
	}

	@MJI
	public int getEntryMethod__J__I(MJIEnv env, int clsRef, long jzentry, FeatureExpr ctx) throws Exception {
		return (int) invoke("getEntryMethod", jzentry);
	}

	@MJI
	public void freeEntry__JJ__V(MJIEnv env, int clsRef, long jzfile, long jzentry, FeatureExpr ctx) throws Exception {
		invoke("freeEntry", jzfile, jzentry);
	}

	@MJI
	public int getEntryBytes__JI___3B(MJIEnv env, int clsRef, long jzentry, int type, FeatureExpr ctx) throws Exception {
		try {
			return env.newByteArray(ctx, (byte[]) invoke("getEntryBytes", jzentry, type));
		} catch (Exception e) {
			// can be null
		}
		return MJIEnv.NULL;
	}

	private static Object invoke(String methodName, Object... params) {
		return invoke(java.util.zip.ZipFile.class, methodName, params);
	}

	static Object invoke(Class<?> c, String methodName, Object... params) {
		return invoke(c, null, methodName, params);
	}

	static Object invoke(Class<?> c, Object o, String methodName, Object... params) {
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

	private static void setArrayElements(MJIEnv env, int bArrayRef, byte[] data, int off, int len, FeatureExpr ctx) {
		for (int i = off; i < off + len; i++) {
			env.setByteArrayElement(ctx, bArrayRef, i, new One<>(data[i]));
		}
	}

}