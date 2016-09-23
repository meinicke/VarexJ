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

	enum MesurePrperty {
		time, memory
	}

	private static final MesurePrperty[] MeasureThis = {
			MesurePrperty.time,
//			MesurePrperty.memory 
			};

	private static final char DELIMITER = ',';
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
			writer.print(DELIMITER);
			for (int i = 0; i < MeasureThis.length; i++) {
				for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
					writer.print(factory);
					writer.print(DELIMITER);
				}
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
				int compare = Long.compare(o1.memory[SHFactory.Hybid.ordinal()], o2.memory[SHFactory.Hybid.ordinal()]);
				if (compare == 0) {
					compare = Long.compare(o1.memory[SHFactory.Default.ordinal()],
							o2.memory[SHFactory.Default.ordinal()]);
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
		for (MesurePrperty p : MeasureThis) {
			for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
//				 if (factory != SHFactory.Hybid) {
//					 continue;
//				 }
				int rounds = 1;
				long[] median = null;
				if (p == MesurePrperty.time) {
					rounds = 5;
					median = new long[rounds];
				}
				ROUNDS: for (int i = 0; i < rounds; i++) {
					StackHandlerFactory.setFactory(factory);
					long start = System.nanoTime();
					IStackHandler checkStack;
					try {
						checkStack = StackHandlerFactory.createStack2((FeatureExpr) initArgs[0], (int) initArgs[1],
								(int) initArgs[2]);
					} catch (ArrayIndexOutOfBoundsException e) {
						continue;
					}

					if (p == MesurePrperty.memory) {
						start = ObjectSizeMeasure.getSizeInByte(checkStack);
					}
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
							if (p == MesurePrperty.memory) {
								start = Math.max(start, ObjectSizeMeasure.getSizeInByte(checkStack));
							}
						} catch (SecurityException | IllegalAccessException | InvocationTargetException e) {
							break ROUNDS;
						}
					}
					if (p == MesurePrperty.memory) {
						measurement.memory[factory.ordinal()] = start;
					} else if (p == MesurePrperty.time) {
						long end = System.nanoTime();
						long duration = (end - start);
						median[i] = duration;
					}
				}
				if (p == MesurePrperty.time) {
					Arrays.sort(median);
					measurement.time[factory.ordinal()] = median[rounds / 2];
				}
			}
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

		long[] memory = new long[3];
		long[] time = new long[3];

		public Measurement(String methodName) {
			this.methodName = methodName;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(methodName);

			for (MesurePrperty mesurePrperty : MeasureThis) {
				if (mesurePrperty == (MesurePrperty.memory)) {
					for (int i = 0; i < memory.length; i++) {
						builder.append(DELIMITER);
						builder.append(memory[i]);
					}
				}
				if (mesurePrperty == (MesurePrperty.time)) {
					for (int i = 0; i < time.length; i++) {
						builder.append(DELIMITER);
						builder.append(time[i]);
					}
				}
			}
			return builder.toString();
		}

	}
}
