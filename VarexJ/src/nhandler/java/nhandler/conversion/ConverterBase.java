package nhandler.conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.Resetable;
import gov.nasa.jpf.jvm.JVMHeap;
import gov.nasa.jpf.vm.MJIEnv;
import nhandler.util.ValueIdentityHashMap;

/**
 * This is just a common root of all Converters and keeps key elements used by
 * Converter classes
 *
 * @author Nastaran Shafiei
 */
public class ConverterBase {

	public static ArrayList<Object> socketObjArray = new ArrayList<>();
	public static ConverterFactory converterFactory;

	/**
	 * Keeps track of the JVM classes that have been already created from their
	 * corresponding JPF classes, while performing conversion from JPF to JVM
	 */
	public static ValueIdentityHashMap<Integer, Class<?>> classMapJPF2JVM = new ValueIdentityHashMap<Integer, Class<?>>();

	/**
	 * Keeps track of the JPF classes that have been already updated from their
	 * corresponding JVM classes, while performing conversion from JVM to JPF
	 */
	public static Set<Integer> updatedJPFCls = new HashSet<Integer>();
	static boolean resetState;

	static {
		JPF.resetable.add(new Resetable() {

			@Override
			public void reset() {
				classMapJPF2JVM.clear();
				JVMHeap.clear();
				updatedJPFCls.clear();
				resetState = false;
			}

		});
	}

	public static void init() {
		converterFactory = new DefaultConverterFactory();
	}

	public static boolean isResetState() {
		return resetState;
	}

	/**
	 * This needs to be invoked at the beginning of every method created
	 * on-the-fly
	 */
	public static void reset(MJIEnv env) {
		ConverterBase.resetState = env.getConfig().getBoolean("nhandler.resetVMState");

		if (ConverterBase.resetState) {
			// these are reset on-demond by setting the nhandler.resetVMState
			// property in the properties file
			JVMHeap.clear();
			ConverterBase.classMapJPF2JVM.clear();
			// clearObj(ConverterBase.objMapJPF2JVM);
			// clearCls(ConverterBase.classMapJPF2JVM);
			// checkSocket();
		}

		// these always need to be reset
		JVMHeap.updatedJPFObj.clear();
		ConverterBase.updatedJPFCls.clear();
	}

	public static void clearObj(ValueIdentityHashMap<Integer, Object> map) {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (Map.Entry<Integer, Object> entry : map.entrySet()) {
				Object obj = entry.getValue();
				if (obj.getClass().getName().equals("java.net.Socket")
						|| obj.getClass().getName().equals("java.net.SocksSocketImpl")
						|| obj.getClass().getName().equals("java.net.SocketInputStream")
						|| obj.getClass().getName().equals("java.net.SocketOutputStream")
						|| obj.getClass().getName().startsWith("java.util.zip.ZipFile")
						|| obj.getClass().getName().equals("java.util.jar.JarFile")
						|| obj.getClass().getName().equals("sun.net.www.protocol.jar.URLJarFile")
						|| obj.getClass().getName().equals("sun.net.www.protocol.jar.JarURLConnection")
						|| obj.getClass().getName().equals("java.util.ResourceBundle")
						|| obj.getClass().getName().equals("java.util.zip.CRC32")
						|| obj.getClass().getName().equals("sun.nio.ch.IOUtil")
						|| obj.getClass().getName().equals("sun.nio.ch.KQueueArrayWrapper")
						|| obj.getClass().getName().equals("java.util.zip.Deflater")
						) {

					continue;
				} else {
					changed = true;
					map.remove(entry.getKey());
					break;
				}
			}
		}
	}

	public static void clearCls(ValueIdentityHashMap<Integer, Class<?>> map) {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (Map.Entry<Integer, Class<?>> entry : map.entrySet()) {
				Class<?> cls = entry.getValue();
				if (cls.getName().equals("java.net.Socket")
						|| cls.getName().equals("java.net.SocksSocketImpl") // this one is not in the jpf.properties file, but we need this
						|| cls.getName().equals("java.net.SocketInputStream")
						|| cls.getName().equals("java.net.SocketOutputStream")
						|| cls.getName().startsWith("java.util.zip.ZipFile")
						|| cls.getName().equals("java.util.jar.JarFile")
						|| cls.getName().equals("sun.net.www.protocol.jar.URLJarFile")
						|| cls.getName().equals("sun.net.www.protocol.jar.JarURLConnection")
						|| cls.getName().equals("java.util.ResourceBundle")
						|| cls.getName().equals("java.util.zip.CRC32")
						|| cls.getName().equals("sun.nio.ch.IOUtil")
						|| cls.getName().equals("sun.nio.ch.KQueueArrayWrapper")
						|| cls.getName().equals("java.util.zip.Deflater")
						) {

					continue;
				} else {
					changed = true;
					map.remove(entry.getKey());
					break;
				}
			}
		}
	}

	public static void checkSocket() {
		if (socketObjArray.size() >= 4) {
			System.out.println("clearing!!!");
			socketObjArray.clear();
			JVMHeap.clear();
		}
	}

}
