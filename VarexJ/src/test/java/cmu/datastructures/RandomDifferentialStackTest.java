package cmu.datastructures;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.junit.Test;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.ChoiceFactory.Factory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.va.HybridStackHandler;
import gov.nasa.jpf.vm.va.HybridStackHandler.LiftedStack;
import gov.nasa.jpf.vm.va.HybridStackHandler.NormalStack;
import gov.nasa.jpf.vm.va.IStackHandler;
import gov.nasa.jpf.vm.va.StackHandlerFactory;
import gov.nasa.jpf.vm.va.StackHandlerFactory.SHFactory;

public class RandomDifferentialStackTest {

	private static final int ROUNDS = 100_000;
	private static final int METHOD_CALLS = 4;
	static {
		Conditional.setFM("");
		ChoiceFactory.setDefault(Factory.MapChoice);
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
	}
	
	private static final FeatureExpr A = Conditional.createFeature("A");

	private final List<Object[]> stackHandlers = new ArrayList<>();

	public RandomDifferentialStackTest() {
		for (SHFactory shFactory : SHFactory.values()) {
			if (shFactory == SHFactory.Hybid) {
				for (LiftedStack liftedStack : LiftedStack.values()) {
					for (NormalStack normalStack : NormalStack.values()) {
						stackHandlers.add(new Object[] { shFactory, liftedStack, normalStack });
					}
				}
			} else {
				stackHandlers.add(new Object[] { shFactory, null, null, Factory.MapChoice });
			}
		}
	}

	public void setStackHandler(Object[] params) {
		int i = 0;
		final SHFactory shFactory = (SHFactory) params[i++];
		final LiftedStack liftedStack = (LiftedStack) params[i++];
		final NormalStack normalStack = (NormalStack) params[i++];

		StackHandlerFactory.setFactory(shFactory);

		if (normalStack != null) {
			HybridStackHandler.normalStack = normalStack;
		}
		if (liftedStack != null) {
			HybridStackHandler.liftedStack = liftedStack;
		}

	}

	private void differentalTest(Supplier<List<Object>> action) {
		List<Object> result = null;
		for (Object[] params : stackHandlers) {
			setStackHandler(params);
			final List<Object> execute = action.get();
			if (result == null) {
				result = execute;
			} else {
				for (int i = 0; i < result.size(); i++) {
					if (result.get(i) == execute.get(i)) {
						continue;
					}
					if (result.get(i) == null) {
						assertEquals(Arrays.toString(params) + result + execute,  result.get(i), execute.get(i));
						continue;
					}
					if (result.get(i) instanceof Exception && execute.get(i) instanceof Exception) {
						continue;
					}
					if (result.get(i).getClass().isArray()) {
						if (result.get(i).getClass() == int[].class) {
							assertArrayEquals(Arrays.toString(params), (int[]) result.get(i), (int[]) execute.get(i));
							continue;
						}
					}
					assertEquals(Arrays.toString(params), result.get(i), execute.get(i));
				}
			}
		}
		assertNotNull(result);
	}
	
	public static void main(String[] args) {
		try {
			new RandomDifferentialStackTest().runDifferentialTest(52076);
		} catch (Throwable e) {
			for (String call : calls) {
				System.out.println(call);
			}
			throw e;
		}
	}
	
	private int seed = 0;
	
	@Test
	public void runDifferentialTest() {
		try {
			for (; seed < ROUNDS; seed++) {
				runDifferentialTest(seed);
				if (seed != 0 && seed % (ROUNDS / 100) == 0) {
					System.out.print('*');
					if (seed % (ROUNDS / 10) == 0) {
						System.out.println(seed);
					}
				}
			}
			StackHandlerFactory.setFactory(SHFactory.Hybid);
			HybridStackHandler.normalStack = NormalStack.OneStack;
			HybridStackHandler.liftedStack = LiftedStack.Buffered;
		} catch (Throwable e) {
			System.out.println("Seed:" + seed);
			for (String call : calls) {
				System.out.println(call);
			}
			throw e;
		}
	}

	private void runDifferentialTest(final int seed) {
		differentalTest(() -> {
			calls.clear();
			Random r = new Random(seed);
			IStackHandler sh = StackHandlerFactory.createStack(FeatureExprFactory.True(), 10, 10);

			List<Object> returnValues = new ArrayList<>(METHOD_CALLS);
			for (int j = 0; j < METHOD_CALLS; j++) {
				Object applyStackOp = applyStackOp(sh, r);
				returnValues.add(applyStackOp);
				if (applyStackOp instanceof Exception) {
					break;
				}
			}
			return returnValues;
		});
	}

	static Set<String> ignoredMethods = new HashSet<>();
	static {
		ignoredMethods.add("getLocalWidth");
		ignoredMethods.add("getStackWidth");
		ignoredMethods.add("getMaxLocal");
		ignoredMethods.add("clone");
		ignoredMethods.add("toString");
		ignoredMethods.add("hashCode");
		ignoredMethods.add("equals");
		ignoredMethods.add("getLocal");
		ignoredMethods.add("setTop");
		ignoredMethods.add("getStack");
	}

	private static List<String> calls = new ArrayList<>(2);

	private static Object applyStackOp(IStackHandler sh, Random r) {
		Method[] methods = IStackHandler.class.getMethods();
		Arrays.sort(methods, (o1, o2) -> o1.toString().compareTo(o2.toString()));
		Method method = methods[r.nextInt(methods.length)];
		while (ignoredMethods.contains(method.getName())) {
			method = methods[r.nextInt(methods.length)];
		}
		try {
			Object[] args = createArgs(method, r);
			StringBuilder sb = new StringBuilder();
			sb.append("sh.");
			sb.append(method.getName());
			sb.append('(');
			for (Object object : args) {
				sb.append(object);
				sb.append(',');
			}
			if (args.length > 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
			sb.append(");");
			calls.add(sb.toString());
			Object returnValue = method.invoke(sh, args);
			return returnValue;
		} catch (IllegalAccessException | InvocationTargetException e) {
			return e;
		}

	}

	private static Object[] createArgs(Method method, Random r) {
		Class<?>[] parameterTypes = method.getParameterTypes();
		Object[] args = new Object[parameterTypes.length];
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> type = parameterTypes[i];
			if (type == FeatureExpr.class) {
				int var = r.nextInt(3);
				switch (var) {
				case 0:
					args[i] = FeatureExprFactory.True();
					break;
				case 1:
					args[i] = A;
					break;
				case 2:
					args[i] = A.not();
					break;
				}
			} else if (type == int.class) {
				args[i] = r.nextInt(2);// TODO randomize		
			} else if (type == boolean.class) {
				args[i] = r.nextBoolean();
			} else if (type == Object.class) {
				if ("push".equals(method.getName())) {
					int t = r.nextInt(6);
					switch (t) {
					case 0:// Integer
						args[i] = One.valueOf(r.nextInt());
						break;
					case 1:// Long
						args[i] = new One<>(r.nextLong());
						break;
					case 2:// Double
						args[i] = new One<>(r.nextDouble());
						break;
					case 3:// Float
						args[i] = new One<>(r.nextFloat());
						break;
					case 4:// Byte
						args[i] = new One<>((byte)r.nextInt());
						break;
					case 5:// Short
						args[i] = new One<>((short)r.nextInt());
						break;
					default:
						break;
					}
				} else {
					throw new RuntimeException(type.toString());
				}
			} else if (type == IStackHandler.Type.class) {
				args[i] = IStackHandler.Type.values()[r.nextInt(IStackHandler.Type.values().length)];
			} else if (type == Conditional.class) {

			} else {
				throw new RuntimeException(type.toString());
			}

		}

		return args;

	}

}
