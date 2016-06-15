package gov.nasa.jpf.jvm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.RuntimeConstants;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * A heap to store values of the JVM created by nhandler.
 * 
 * @author Jens Meinicke
 *
 */
public class JVMHeap {

	private static Map<Integer, Conditional<Object>> HEAP = new HashMap<>();

	public static void put(int id, Object JVMObj, FeatureExpr ctx) {
		
		Conditional<Object> currentObject = HEAP.get(id);
		Conditional<Object> value;
		if (Conditional.isTautology(ctx)) {
			value = new One<>(JVMObj);
		} else {
			if (currentObject == null) {
				currentObject = new One<>(null);
			}
			value = ChoiceFactory.create(ctx, new One<>(JVMObj), currentObject).simplify();
		}
		HEAP.put(id, value);
	}
	
	public static Object get(int id, FeatureExpr ctx) {
		Conditional<Object> conditional = HEAP.get(id);
		if (conditional != null) {
			Conditional<Object> simplify = conditional.simplify(ctx);
			if (simplify.isOne()) {
				return simplify.getValue();
			}
			return simplify;
		}
		return null;
	}

	public static void remove(int id) {
		Object object = HEAP.remove(id);
		if (RuntimeConstants.debugGC) {
			if (object != null) {
				System.out.println("GC JVM Heap(" + HEAP.size() + ") " + printSize(object) + object.getClass().getName() + " @ " + id);
			}
		}
	}

	public static void clear() {
		HEAP.clear();
		updatedJPFObj.clear();
	}

	private static String printSize(final Object object) {
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
	}

	public static boolean containsValue(Object jVMObj, FeatureExpr ctx) {
		for (Conditional<Object> v : HEAP.values()) {
			for (Object o : v.simplify(ctx).toList()) {
				if (jVMObj == o) {
					return true;
				}
			}
		}
		return false;
	};

	public static Set<Integer> keySet() {
		return HEAP.keySet();
	}

	public static boolean containsKey(int id, FeatureExpr ctx) {
		if (!HEAP.containsKey(id)) {
			return false;
		}
		Conditional<Object> value = HEAP.get(id).simplify(ctx);
		if (value.getValue() == null) {
			return false;
		}
		return true;
	}

	private static JVMHeap jvmheap = new JVMHeap();

	public static JVMHeap instance() {
		return jvmheap;
	}

	/*
	 * updated objects
	 */
	
	public static HashMap<Integer, Conditional<Object>> updatedJPFObj = new HashMap<>();
	
	public static boolean isValueUpaded(Object jvmObj, FeatureExpr ctx) {
		for (Conditional<Object> v : updatedJPFObj.values()) {
			for (Object o : v.simplify(ctx).toList()) {
				if (jvmObj == o) {
					return false;
				}
			}
		}
		return false;
	}
	
	public static boolean isKeyUpdated(int id, FeatureExpr ctx) {
		if (!updatedJPFObj.containsKey(id)) {
			return false;
		}
		Conditional<Object> value = updatedJPFObj.get(id).simplify(ctx);
		if (value.getValue() == null) {
			return false;
		}
		return true;
	}
	
	public static Set<Integer> getUpdatesKeySet() {
		return updatedJPFObj.keySet();
	}
	
	public static Conditional<Object> getUpdatesValue(int id, FeatureExpr ctx) {
		return updatedJPFObj.get(id).simplify(ctx); 	
	}
	
	public static void update(int id, Object JVMObj, FeatureExpr ctx) {
		Conditional<Object> currentObject = updatedJPFObj.get(id);
		Conditional<Object> value;
		if (Conditional.isTautology(ctx)) {
			value = new One<>(JVMObj);
		} else {
			if (currentObject == null) {
				currentObject = new One<>(null);
			}
			value = ChoiceFactory.create(ctx, new One<>(JVMObj), currentObject).simplify();
		}
		updatedJPFObj.put(id, value);
	}
	
}
