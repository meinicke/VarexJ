package gov.nasa.jpf.vm.va;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * This stackhandler uses all {@link StackHandler} implementations in parallel and compares their results.
 * 
 * For debug purpose only.
 * 
 * @author Jens Meinicke
 *
 */
@SuppressWarnings("unchecked")
public class DifferentialStackHandler implements IStackHandler {

	private static final List<Factory> factories = StackHandlerFactory.getAllFactories();

	private final List<IStackHandler> stackHandler;

	static {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
		Conditional.setFM("");
	}

	public DifferentialStackHandler(final FeatureExpr ctx, final int nLocals, final int nOperands) {
		final List<IStackHandler> sh = new ArrayList<>();
		factories.forEach(f -> sh.add(f.createStack(ctx, nLocals, nOperands)));
		this.stackHandler = Collections.unmodifiableList(sh);
	}

	private DifferentialStackHandler(DifferentialStackHandler other) {
		final List<IStackHandler> stackHandler = new ArrayList<>();
		other.stackHandler.forEach(sh -> stackHandler.add(sh.clone()));
		this.stackHandler = Collections.unmodifiableList(stackHandler);
		for (int i = 0; i < stackHandler.size(); i++) {
			IStackHandler iStackHandler = other.stackHandler.get(i);
			int[] beforeSlots = iStackHandler.getSlots();
			IStackHandler iStackHandler2 = this.stackHandler.get(i);
			int[] afterSlots = iStackHandler2.getSlots();
			if (!Arrays.equals(beforeSlots, afterSlots)) {
				System.err.println(iStackHandler.getClass() + ": " + Arrays.toString(beforeSlots));
				System.err.println(iStackHandler.getClass() + ": " + Arrays.toString(afterSlots));
				throw new RuntimeException();
			}
		}
	}

	@Override
	public FeatureExpr getCtx() {
		Method method = getMethod(new Object() {
		});
		return (FeatureExpr) applyFunction(method);
	}

	private List<LogEntry> log = new ArrayList<>();

	private Object applyFunction(Method method, Object... args) {
		log.add(new LogEntry(method, args));
		Object value = null;
		for (IStackHandler sh : stackHandler) {
			try {
				Method shMethod = sh.getClass().getMethod(method.getName(), method.getParameterTypes());
				Object currentValue = shMethod.invoke(sh, args);
				if (value == null) {
					value = currentValue;
				} else if (!currentValue.equals(value)) {
					if (currentValue.getClass().isArray() && Arrays.equals((int[]) currentValue, (int[]) value)) {
						continue;
					}
					if (currentValue instanceof Conditional) {
						if (compareConditionalValues((Conditional) currentValue, (Conditional) value, args)) {
							continue;
						}
					}

					log.removeIf((e) -> e.method.getName().equals("getCtx"));
					log.forEach(System.out::println);
					if (value.getClass().isArray()) {
						System.err.println(stackHandler.get(0).getClass());
						System.err.println(sh.getClass());

						throw new RuntimeException(
								Arrays.toString((int[]) value) + " != " + Arrays.toString((int[]) currentValue));
					}
					throw new RuntimeException(value + " != " + currentValue);
				}
			} catch (IllegalAccessException | InvocationTargetException e) {
				log.removeIf((l) -> l.method.getName().equals("getCtx"));
				log.forEach(System.out::println);
				System.out.println(sh.getClass());
				throw new RuntimeException(e);
			} catch (NoSuchMethodException | SecurityException e) {
				log.removeIf((l) -> l.method.getName().equals("getCtx"));
				log.forEach(System.out::println);
				System.out.println(sh.getClass());
				throw new RuntimeException(e);
			}
		}
		return value;
	}

	private boolean compareConditionalValues(Conditional<?> conditional1, Conditional<?> conditional2, Object[] args) {
		FeatureExpr ctx = null;
		for (Object a : args) {
			if (a instanceof FeatureExpr) {
				ctx = (FeatureExpr) a;
			}
		}
		conditional1 = ChoiceFactory.create(ctx, conditional1, new One<>(null)).simplify();
		conditional2 = ChoiceFactory.create(ctx, conditional2, new One<>(null)).simplify();

		Map<?, FeatureExpr> values1 = conditional1.toMap();
		Map<?, FeatureExpr> values2 = conditional2.toMap();
		return values1.equals(values2);

	}

	@Override
	public int getStackWidth() {
		Method method = getMethod(new Object() {
		});
		return (int) applyFunction(method);
	}

	@Override
	public int getLocalWidth() {
		throw new RuntimeException("method should not be called on " + getClass().getName());
	}

	@Override
	public String getMaxLocal() {
		throw new RuntimeException("method should not be called on " + getClass().getName());
	}

	@Override
	public IStackHandler clone() {
		DifferentialStackHandler clone = new DifferentialStackHandler(this);
		Method method = getMethod(new Object() {
		});
		this.log.add(new LogEntry(method));
		clone.log.add(new LogEntry(method));

		return clone;
	}

	@Override
	public int getLength() {
		Method method = getMethod(new Object() {
		});
		return (int) applyFunction(method);
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index);
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index);
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index, value, isRef);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Integer>) applyFunction(method, ctx, index);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		Method method = getMethod(new Object() {
		});
		return (boolean) applyFunction(method, ctx, index);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, value);
	}

	@Override
	public void pushFloat(FeatureExpr ctx, Conditional<Float> value) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, value);
	}

	@Override
	public void pushLong(FeatureExpr ctx, Conditional<Long> value) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, value);
	}

	@Override
	public void pushDouble(FeatureExpr ctx, Conditional<Double> value) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, value);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value, boolean isRef) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, value, isRef);
	}

	@Override
	public Conditional<Integer> pop(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return ((Conditional<Integer>) applyFunction(method, ctx));
	}

	@Override
	public Conditional<Long> popLong(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Long>) applyFunction(method, ctx);
	}

	@Override
	public Conditional<Double> popDouble(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Double>) applyFunction(method, ctx);
	}

	@Override
	public Conditional<Float> popFloat(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Float>) applyFunction(method, ctx);
	}

	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<T>) applyFunction(method, ctx);
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, n);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return ChoiceFactory.create(ctx, (Conditional<Integer>) applyFunction(method, ctx), One.valueOf(0)).simplify();
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		Method method = getMethod(new Object() {
		});
		return ChoiceFactory.create(ctx, (Conditional<Integer>) applyFunction(method, ctx, offset), One.valueOf(0))
				.simplify(ctx);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Double>) applyFunction(method, ctx, offset);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Long>) applyFunction(method, ctx, offset);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Float>) applyFunction(method, ctx, offset);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		Method method = getMethod(new Object() {
		});
		return (boolean) applyFunction(method, ctx, offset);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, offset, value, isRef);
	}

	@Override
	public Conditional<Integer> getTop() {
		Method method = getMethod(new Object() {
		});
		return (Conditional<Integer>) applyFunction(method);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public int[] getSlots() {
		Method method = getMethod(new Object() {
		});
		return (int[]) applyFunction(method);
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return (int[]) applyFunction(method, ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		return (boolean) applyFunction(method, ctx);
	}

	@Override
	public void dup_x1(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void dup2_x2(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void dup2_x1(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void dup2(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void dup(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void dup_x2(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void swap(FeatureExpr ctx) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx);
	}

	@Override
	public void setCtx(FeatureExpr ctx) {
		Method method = getMethod(new Object() {});
		applyFunction(method, ctx);
	}

	@Override
	public Collection<Integer> getAllReferences() {
		Method method = getMethod(new Object() {
		});
		return (Collection<Integer>) applyFunction(method);
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		Method method = getMethod(new Object() {
		});
		applyFunction(method, ctx, index, increment);
	}

	@Override
	public Object getLocal(int index) {
		Method method = getMethod(new Object() {
		});
		return applyFunction(method, index);
	}

	private Method getMethod(Object object) {
		return object.getClass().getEnclosingMethod();
	}

}

class LogEntry {

	final Method method;
	final Object[] args;

	LogEntry(Method method, Object... args) {
		this.method = method;
		this.args = args;
	}

	@Override
	public String toString() {
		return method.getName() + " " + Arrays.toString(args);
	}
}
