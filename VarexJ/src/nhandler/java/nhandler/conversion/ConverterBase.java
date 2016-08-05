package nhandler.conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cmu.conditional.Conditional;
import cmu.utils.RuntimeConstants;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.Resetable;
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
	 * Keeps track of the JVM objects that have been already created from their
	 * corresponding JPF objects, while performing conversion from JPF to JVM
	 */
	@SuppressWarnings("serial")
	public static Map<Integer, Conditional<Object>> objMapJPF2JVM = new HashMap<Integer, Conditional<Object>>() {

		public cmu.conditional.Conditional<Object> get(Object key) {
			if (key instanceof Conditional) {

				throw new RuntimeException();
			}
			return super.get(key);
		};
		

		@Override
		public Conditional<Object> put(Integer key, Conditional<Object> value) {
			if (containsKey(key)) {
				Object currentObject = get(key);
				if (currentObject == value) {
					return null;
				}
//				System.out.println("--- object for id " + key + " already created, but newly created " + value);
//				for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//					System.out.println(element);
//				}
//				System.out.println("-----------------------------------");
			}
			return super.put(key, value);
		};

		@SuppressWarnings("unused")
		@Override
		public Conditional<Object> remove(Object key) {
			Conditional<Object> object = super.remove(key);
			if (RuntimeConstants.debugGC && object != null) {
				System.out.println("GC JVM Heap(" + objMapJPF2JVM.size() + ") " + printSize(object) + object.getClass().getName() + " @ " + key);
			}
			return object;
		}

		private String printSize(final Object object) {
			int size = 0;
			if (object.getClass().isArray()) {
				final String componentType = object.getClass().getComponentType().getSimpleName();
				switch (componentType) {
				case "char":
					size = Character.SIZE * ((char[]) object).length;
					break;
				case "byte":
					size = Byte.SIZE * ((byte[]) object).length;
					break;
				default:
					System.out.println("to string for " + componentType + " not supported");
					break;
				}
			} else if (object instanceof String) {
				size = (Character.SIZE * ((String) object).toCharArray().length) >> 3;
			}
			if (size == 0) {
				return "";
			}
			size = (size >> 3);
			if (size >= 1024) {
				size = size >> 10;
				if (size >= 1024) {
					size = size >> 10;
					return size + " MB ";
				}
				return size + " KB ";
			}
			return size + " Byte ";
		};
	};

	/**
	 * Keeps track of the JVM classes that have been already created from their
	 * corresponding JPF classes, while performing conversion from JPF to JVM
	 */
	public static ValueIdentityHashMap<Integer, Class<?>> classMapJPF2JVM = new ValueIdentityHashMap<Integer, Class<?>>();

	/**
	 * Keeps track of the JPF objects that have been already updated from their
	 * corresponding JVM objects, while performing conversion from JVM to JPF
	 */
	public static HashMap<Integer, Object> updatedJPFObj = new ValueIdentityHashMap<Integer, Object>();

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
				updatedJPFObj.clear();
				classMapJPF2JVM.clear();
				objMapJPF2JVM.clear();
				updatedJPFCls.clear();
				resetState = false;
			}

		});
		JPF.JVMheap = objMapJPF2JVM;
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
			ConverterBase.objMapJPF2JVM.clear();
			ConverterBase.classMapJPF2JVM.clear();
			// clearObj(ConverterBase.objMapJPF2JVM);
			// clearCls(ConverterBase.classMapJPF2JVM);
			// checkSocket();
		}

		// these always need to be reset
		ConverterBase.updatedJPFObj.clear();
		ConverterBase.updatedJPFCls.clear();
	}

	public static void clearObj(ValueIdentityHashMap<Integer, Object> map) {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (Map.Entry<Integer, Object> entry : map.entrySet()) {
				Object obj = entry.getValue();
				if (obj.getClass().getName().equals("java.net.Socket") || obj.getClass().getName().equals("java.net.SocksSocketImpl") || obj.getClass().getName().equals("java.net.SocketInputStream")
						|| obj.getClass().getName().equals("java.net.SocketOutputStream") || obj.getClass().getName().startsWith("java.util.zip.ZipFile")
						|| obj.getClass().getName().equals("java.util.jar.JarFile") || obj.getClass().getName().equals("sun.net.www.protocol.jar.URLJarFile")
						|| obj.getClass().getName().equals("sun.net.www.protocol.jar.JarURLConnection") || obj.getClass().getName().equals("java.util.ResourceBundle")
						|| obj.getClass().getName().equals("java.util.zip.CRC32") || obj.getClass().getName().equals("sun.nio.ch.IOUtil")
						|| obj.getClass().getName().equals("sun.nio.ch.KQueueArrayWrapper") || obj.getClass().getName().equals("java.util.zip.Deflater")) {

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
				if (cls.getName().equals("java.net.Socket") || cls.getName().equals("java.net.SocksSocketImpl") // this
																												// one
																												// is
																												// not
																												// in
																												// the
																												// jpf.properties
																												// file,
																												// but
																												// we
																												// need
																												// this
						|| cls.getName().equals("java.net.SocketInputStream") || cls.getName().equals("java.net.SocketOutputStream") || cls.getName().startsWith("java.util.zip.ZipFile")
						|| cls.getName().equals("java.util.jar.JarFile") || cls.getName().equals("sun.net.www.protocol.jar.URLJarFile")
						|| cls.getName().equals("sun.net.www.protocol.jar.JarURLConnection") || cls.getName().equals("java.util.ResourceBundle") || cls.getName().equals("java.util.zip.CRC32")
						|| cls.getName().equals("sun.nio.ch.IOUtil") || cls.getName().equals("sun.nio.ch.KQueueArrayWrapper") || cls.getName().equals("java.util.zip.Deflater")) {

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
			objMapJPF2JVM.clear();
		}
	}
	
	protected static Object getValueOrNull(Conditional<Object> conditional) {
		  if (conditional == null){
			  return null;
		  }
		  return conditional.getValue();
		}

}
