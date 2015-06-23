package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.lang.reflect.Method;
import java.util.zip.Inflater;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_util_zip_Inflater extends NativePeer {
	
	@MJI
	public void initialize__Z__V(MJIEnv env, int objref, boolean nowrap, FeatureExpr ctx) {
		env.addJVMObject(objref, new Inflater(nowrap));
	}
	@MJI
	public static int inflate___3BII__I(MJIEnv env, int objref, int barr, int off, int len, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref); 
			byte[] b = env.getByteArrayObjectDeprecated(ctx, barr);
			int result = inflater.inflate(b, off, len);
			for (int i = off; i < off + len; i++) {
				env.setByteArrayElement(ctx, barr, i, new One<>(b[i]));
			}
			return result;
		} catch (Exception e) {
			throw printException(e);
		}
	}
	private static Exception printException(Exception e) {
		System.out.println(e);
		for (StackTraceElement element : e.getStackTrace()) {
			System.out.println(element);
		}
		return e;
	}
	
	@MJI
	public static boolean finished____Z(MJIEnv env, int objref, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref); 
			return inflater.finished();
		} catch (Exception e) {
			throw printException(e);
		}
	}
	
	@MJI
	public static boolean needsDictionary____Z(MJIEnv env, int objref, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref); 
			return inflater.needsDictionary();
		} catch (Exception e) {
			throw printException(e);
		}
	}
	
	@MJI
	public static boolean needsInput____Z(MJIEnv env, int objref, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref); 
			return inflater.needsInput();
		} catch (Exception e) {
			throw printException(e);
		}
	}
	
	@MJI
	public static void setInput___3BII__V(MJIEnv env, int objref, int barr, int off, int len, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref); 
			byte[] b = env.getByteArrayObjectDeprecated(ctx, barr);
			inflater.setInput(b, off, len);
		} catch (Exception e) {
			throw printException(e);
		}
	}
	
	@MJI
	public static boolean ended____Z(MJIEnv env, int objref, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref);
			Method method = inflater.getClass().getDeclaredMethod("ended");
			method.setAccessible(true);
			return (boolean) method.invoke(inflater);
		} catch (Exception e) {
			throw printException(e);
		}
	}
	
	@MJI
	public static void reset____V(MJIEnv env, int objref, FeatureExpr ctx) throws Exception  {
		try {
			Inflater inflater = (Inflater) env.getJVMObject(objref);
			inflater.reset();
		} catch (Exception e) {
			throw printException(e);
		}
	}
}