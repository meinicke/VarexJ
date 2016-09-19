package gov.nasa.jpf.vm.va;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.SingleBDDFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.True;
import gov.nasa.jpf.vm.va.StackHandlerFactory.SHFactory;
import size.ObjectSizeMeasure;

public class Store {

	private static boolean verbose = false;

	private static Map<MeasuringStackHandler, List<LogEntry>> entries = new HashMap<>();

	private static List<Measurement> measures = new ArrayList<>();

	private static PrintWriter writer;
	static {
		// ObjectSizeMeasure.VERBOUS = true;
		ObjectSizeMeasure.ignoreClass(BDDFeatureExpr.class);
		ObjectSizeMeasure.ignoreClass(True.class);
		ObjectSizeMeasure.ignoreClass(de.fosd.typechef.featureexpr.bdd.True$.class);
		ObjectSizeMeasure.ignoreClass(SingleBDDFeatureExpr.class);
		try {
			File file = new File("stacklog.csv");
			System.out.println(file.getAbsolutePath());
			writer = new PrintWriter(file);
			writer.print(';');
			for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
				writer.print(factory);
				writer.print(';');
			}
			writer.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Store() {
	}

	public static void add(MeasuringStackHandler handler, String methodName, Method method, Object... args) {
		List<LogEntry> instructions = entries.get(handler);
		if (instructions == null) {
			instructions = new ArrayList<>();
			entries.put(handler, instructions);
		}
		try {
			if (method != null) {
				method = IStackHandler.class.getMethod(method.getName(), method.getParameterTypes());
			}
			instructions.add(new LogEntry(methodName, method, args));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		if (method != null && "hasAnyRef".equals(method.getName())) {
			reexecuteFrame(instructions);
			entries.remove(handler);
		}
	}

	public synchronized static void print() {
		System.out.println("reexecute stack operations");
		for (List<LogEntry> entry : entries.values()) {
			reexecuteFrame(entry);
		}

		System.out.println("Order measurements");
		Collections.sort(measures, new Comparator<Measurement>() {

			@Override
			public int compare(Measurement o1, Measurement o2) {
				int compare = Long.compare(o1.measurement[SHFactory.Hybid.ordinal()], o2.measurement[SHFactory.Hybid.ordinal()]);
				if (compare == 0) {
					compare = Long.compare(o1.measurement[SHFactory.Default.ordinal()],
							o2.measurement[SHFactory.Default.ordinal()]);
				}
				return compare;
			}
		});

		System.out.println("Print measurements");
		for (Measurement measurement : measures) {
			writer.println(measurement.toString());
		}
		writer.close();
	}

	private synchronized static void reexecuteFrame(List<LogEntry> entry) {
		// if (!entry.get(0).methodName.equals("testGetChars")) {
		// continue;
		// }

		if (verbose) {
			System.out.println(entry.get(0).methodName);
			for (LogEntry logEntry : entry) {
				System.out.println(logEntry.stackInstruction + Arrays.toString(logEntry.args));
			}
			System.out.println();
		}

		Object[] initArgs = entry.get(0).args;

		Measurement measurement = new Measurement(entry.get(0).methodName);
		measures.add(measurement);
		for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
//			if (factory != SHFactory.Hybid) {
//				continue;
//			}
			StackHandlerFactory.setFactory(factory);
			IStackHandler checkStack;
			try {
				checkStack = StackHandlerFactory.createStack2((FeatureExpr) initArgs[0], (int) initArgs[1],
						(int) initArgs[2]);
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}

//			long start = System.nanoTime();

			long bytes = ObjectSizeMeasure.getSizeInByte(checkStack);
			for (LogEntry logEntry : entry) {
				if (logEntry.stackInstruction == null) {
					// case constructor
					continue;
				}
				try {
					if (verbose) {
						System.out.print("invoke: " + logEntry.stackInstruction.getName());
						System.out.println(" args: " + Arrays.toString(logEntry.args));
					}
					logEntry.stackInstruction.invoke(checkStack, logEntry.args);
					bytes = Math.max(bytes, ObjectSizeMeasure.getSizeInByte(checkStack));
					if (bytes > 400) {
						ObjectSizeMeasure.VERBOUS = true;
						ObjectSizeMeasure.getSizeInByte(checkStack);
						ObjectSizeMeasure.VERBOUS = false;
					}
				} catch (SecurityException | IllegalAccessException | InvocationTargetException e) {
//					start = 0;
					break;
				}
			}
//			long end = System.nanoTime();
//			long duration = (end - start);
//			measurement.measurement[factory.ordinal()] = duration;
			measurement.measurement[factory.ordinal()] = bytes;
		}
	}

	private static class LogEntry {
		String methodName;
		Method stackInstruction;
		Object[] args;

		public LogEntry(String methodName, Method method, Object[] args) {
			this.methodName = methodName;
			this.stackInstruction = method;
			this.args = args;
		}

	}

	static class Measurement {

		String methodName;

		long[] measurement = new long[3];

		public Measurement(String methodName) {
			this.methodName = methodName;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(methodName);
			for (int i = 0; i < measurement.length; i++) {
				builder.append(';');
				builder.append(measurement[i]);
			}
			return builder.toString();
		}
	}
}
