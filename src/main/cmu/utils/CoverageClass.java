package cmu.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import cmu.conditional.Conditional;
import coverage.Interaction;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.jvm.bytecode.LocalVariableInstruction;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * This class handles how and which data is covered.
 * 
 * @author Jens Meinicke
 *
 */
public class CoverageClass {

	private final ThreadInfo ti;

	public CoverageClass(ThreadInfo ti) {
		this.ti = ti;
	}

	long time = 0;
	int localSize = 0;
	Object oldLocal = null;

	private void reset() {
		time = 0;
		localSize = 0;
		oldLocal = null;
	}

	public void preExecuteInstruction(Instruction i) {
		if (JPF.COVERAGE != null) {
			reset();
			if (JPF.SELECTED_COVERAGE_TYPE == JPF.COVERAGE_TYPE.interaction) {
				int index = -1;
				if (i instanceof LocalVariableInstruction) {
					LocalVariableInstruction li = (LocalVariableInstruction) i;
					index = li.getLocalVariableIndex();
					if (index != -1) {
						oldLocal = ti.getTopFrame().stack.getLocal(index);
						localSize = ti.getTopFrame().stack.getLocal(ti.getTopFrame().stack.getCtx(), index).toMap().size();
					}
				}
			}
		}

		if (JPF.SELECTED_COVERAGE_TYPE == JPF.COVERAGE_TYPE.time) {																	
			time = System.nanoTime();
		}
	}

	public void postExecuteInstruction(Instruction i, FeatureExpr ctx) {
		if (JPF.COVERAGE != null) {
			if (JPF.SELECTED_COVERAGE_TYPE == JPF.COVERAGE_TYPE.time) {
				time = System.nanoTime() - time;
			}

			Object newLocal = null;
			int newLocalSize = localSize;
			if (JPF.SELECTED_COVERAGE_TYPE == JPF.COVERAGE_TYPE.interaction) {
				int index = -1;
				if (i instanceof LocalVariableInstruction) {
					LocalVariableInstruction li = (LocalVariableInstruction) i;
					index = li.getLocalVariableIndex();
				}
				if (index != -1) {
					newLocal = ti.getTopFrame().stack.getLocal(index);
					newLocalSize = ti.getTopFrame().stack.getLocal(ti.getTopFrame().stack.getCtx(), index).toMap().size();
				}
			}
			performCoverage(i, ctx, time, localSize, oldLocal, newLocalSize, newLocal);
		}
	}

	/**
	 * Logs the current instruction / state for coverage.
	 * 
	 * @param instruction
	 *            The instruction to cover.
	 * @param ctx
	 * @param time
	 * @param localInteractionChange
	 * @param oldLocal
	 * @param newLocal
	 */
	private void performCoverage(Instruction instruction, FeatureExpr ctx, long time, int oldLocalSize, Object oldLocal, int newLocalSize, Object newLocal) {
		MethodInfo methodInfo = instruction.getMethodInfo();
		if (methodInfo != null) {
			ClassInfo classInfo = methodInfo.getClassInfo();
			String file = classInfo.getSourceFileName();
			if (file != null && ti.getTopFrame() != null) {
				file = file.substring(file.lastIndexOf('/') + 1);
				switch (JPF.SELECTED_COVERAGE_TYPE) {
				case feature:
					coverFeature(instruction, ctx, file);
					break;
				case stack:
					coverStack(instruction, ctx, file);
					break;
				case local:
					coverLocal(instruction, file);
					break;
				case interaction:
					coverInteraction(newLocalSize, oldLocalSize, instruction, ctx, newLocal);
					break;
				case context:// same as for composedContext
				case composedContext:
					coverContext(instruction, ctx, file);
					break;
				case time:
					coverTime(instruction, time, file);
					break;
				default:
					throw new RuntimeException(JPF.SELECTED_COVERAGE_TYPE + " not implemented");
				}

			}
		}
	}

	private void coverTime(Instruction instruction, long time, String file) {
		final int modifier = 1_000_000;
		Interaction interaction = JPF.COVERAGE.getCoverage(file, instruction.getLineNumber());
		if (interaction != null) {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			Map<Instruction, LinkedList<Long>> values = (Map) interaction.getValue();
			if (values.containsKey(instruction)) {
				LinkedList<Long> times = values.get(instruction);
				times.add(time);
			} else {
				LinkedList<Long> initialValue = new LinkedList<Long>();
				initialValue.add(time);
				values.put(instruction, initialValue);
			}
			int degree = interaction.getInteraction();
			if ((time / modifier) > degree) {
				interaction.setInteraction((int) (time / modifier));
			}
		} else {
			Map<Instruction, LinkedList<Long>> values = new TreeMap<Instruction, LinkedList<Long>>(new Comparator<Instruction>() {

				@Override
				public int compare(Instruction o1, Instruction o2) {
					return o1.insnIndex - o2.insnIndex;
				}

			}) {
				private static final long serialVersionUID = 1L;

				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					for (java.util.Map.Entry<Instruction, LinkedList<Long>> entry : entrySet()) {
						builder.append(entry.getKey()).append('\n');
						LinkedList<Long> times = entry.getValue();
						Collections.sort(times);
						long min = times.getFirst();
						long max = times.getLast();
						long max2 = 0;
						if (times.size() >= 2) {
							max2 = times.get(times.size() - 2);
						}
						long sum = 0;
						for (long value : times) {
							sum += value;
						}
						long average = sum / times.size();
						builder.append("Max:\t\t");
						appendTime(builder, max);

						builder.append("Max2:\t\t");
						appendTime(builder, max2);

						builder.append("Average:\t");
						appendTime(builder, average);

						builder.append("Min: \t\t");
						appendTime(builder, min);
					}
					return builder.toString();
				}

				private void appendTime(final StringBuilder stringBuilder, final long time) {
					stringBuilder.append("Min: \t\t");
					if (time < 2000) {
						stringBuilder.append(time).append("nano s\n");
					} else {
						stringBuilder.append(time / 1000).append("micro s\n");
					}
				}
			};
			LinkedList<Long> initialValue = new LinkedList<Long>();
			initialValue.add(time);
			values.put(instruction, initialValue);
			JPF.COVERAGE.setLineCovered(file, instruction.getLineNumber(), (int) (time / modifier), values);
		}
	}

	private void coverContext(Instruction instruction, FeatureExpr ctx, String file) {
		Interaction interaction = JPF.COVERAGE.getCoverage(file, instruction.getLineNumber());
		if (interaction != null) {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			Map<FeatureExpr, Integer> values = (Map) interaction.getValue();
			if (!values.containsKey(ctx)) {
				values.put(ctx, 1);
				interaction.setInteraction(interaction.getInteraction() + 1);
			} else {
				Integer runs = values.get(ctx);
				values.put(ctx, runs + 1);
			}
		} else {
			Map<FeatureExpr, Integer> values = new HashMap<FeatureExpr, Integer>() {
				private static final long serialVersionUID = 1L;

				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					FeatureExpr composedContext = FeatureExprFactory.False();
					for (FeatureExpr entry : keySet()) {
						composedContext = composedContext.or(entry);
					}
					builder.append("Composed context: ");
					builder.append(Conditional.getCTXString(composedContext));
					builder.append('\n');
					for (java.util.Map.Entry<FeatureExpr, Integer> entry : entrySet()) {
						FeatureExpr ctx = entry.getKey();
						Integer runs = entry.getValue();
						builder.append(Conditional.getCTXString(ctx));
						builder.append(' ');
						builder.append(runs);
						if (runs == 1) {
							builder.append(" instruction executed\n");
						} else {
							builder.append(" instructions executed\n");
						}
					}
					return builder.toString();
				}
			};
			values.put(ctx, 1);
			JPF.COVERAGE.setLineCovered(file, instruction.getLineNumber(), 1, values);
		}
	}

	private void coverLocal(Instruction instruction, String file) {
		JPF.COVERAGE.setLineCovered(file, instruction.getLineNumber(), ti.getTopFrame().stack.getLocalWidth(), ti.getTopFrame().stack.getMaxLocal().toString());
	}

	private void coverStack(Instruction instruction, FeatureExpr ctx, String file) {
		JPF.COVERAGE.setLineCovered(file, instruction.getLineNumber(), ti.getTopFrame().stack.getStackWidth(), Conditional.getCTXString(ctx));
	}

	private void coverFeature(Instruction instruction, FeatureExpr ctx, String file) {
		JPF.COVERAGE.setLineCovered(file, instruction.getLineNumber(), ctx.collectDistinctFeatures().size(), Conditional.getCTXString(ctx));
	}

	private void coverInteraction(int newLocalSize, int oldLocalSize, Instruction instruction, FeatureExpr ctx, Object newLocal) {
		String localVariableName = "?";

		int localInteractionChange = newLocalSize - oldLocalSize;
		if (instruction instanceof LocalVariableInstruction) {
			LocalVariableInstruction lvi = ((LocalVariableInstruction) instruction);
			LocalVarInfo lv = lvi.getLocalVarInfo();
			localVariableName = lvi.getLocalVariableName();
			LocalVariableInstruction prev = (LocalVariableInstruction) getPrevLocalInstruction(instruction);
			if (prev != null) {
				if (prev.getLocalVarInfo() != lv) {
					// previous value belongs to another variable
					localInteractionChange = ti.getTopFrame().stack.getLocal(ti.getTopFrame().stack.getCtx(), ((LocalVariableInstruction) instruction).getLocalVariableIndex()).toMap().size() - 1;
					if (localInteractionChange != 0) {
						String content = localVariableName + " (" + Conditional.getCTXString(ctx) + "):\n";
						content += ti.getTopFrame().trace(ctx) + "\n";
						if (newLocal.toString().length() > 800) {
							content += newLocal.toString().substring(0, 800) + "...";
						} else {
							content += newLocal;
						}
						CoverageLogger.logInteraction(ti.getTopFrame(), localInteractionChange, content, ctx);
					}
					return;
				}
			}
		}
		if (localInteractionChange != 0) {
			String content = localVariableName + " (" + Conditional.getCTXString(ctx) + "):\n";
			content += ti.getTopFrame().trace(ctx) + "\n";
			if (oldLocal.toString().length() > 800) {
				content += oldLocalSize + " : " + oldLocal.toString().substring(0, 800) + "...";
			} else {
				content += oldLocalSize + " : " + oldLocal;
			}
			content += "\n -> \n";
			if (newLocal.toString().length() > 800) {
				content += newLocalSize + " : " + newLocal.toString().substring(0, 800) + "...";
			} else {
				content += newLocalSize + " : " + newLocal;
			}
			CoverageLogger.logInteraction(ti.getTopFrame(), localInteractionChange, content, ctx);
		}

	}

	private Instruction getPrevLocalInstruction(Instruction instruction) {
		Instruction prev = instruction.getPrev();
		while (prev != null) {
			if (prev instanceof LocalVariableInstruction) {
				if (((LocalVariableInstruction) prev).getLocalVariableIndex() == ((LocalVariableInstruction) instruction).getLocalVariableIndex()) {
					return prev;
				}
			}
			prev = prev.getPrev();
		}
		return instruction;
	}

	public void coverField(FeatureExpr ctx, ElementInfo eiFieldOwner, Conditional<?> val, Conditional<?> oldValue, StackFrame frame, ThreadInfo ti, FieldInfo fi) {
		if (JPF.COVERAGE != null) {
			if (JPF.SELECTED_COVERAGE_TYPE == JPF.COVERAGE_TYPE.interaction) {
				if (val.size() - oldValue.size() != 0) {
					StringBuilder text = new StringBuilder();
					text.append(fi.getName());
					text.append(" (");
					text.append(Conditional.getCTXString(ctx));
					text.append(")\n");
					text.append(frame.trace(ctx));
					text.append("\n");
					text.append(oldValue.size());
					text.append(": ");
					if (oldValue.toString().length() > 800) {
						text.append(oldValue.toString().substring(0, 800) + "...");
					} else {
						text.append(oldValue);
					}
					text.append("\n->\n");
					text.append(val.size());
					text.append(": ");
					if (val.toString().length() > 800) {
						text.append(val.toString().substring(0, 800) + "...");
					} else {
						text.append(val);
					}

					CoverageLogger.logInteraction(frame, val.size() - oldValue.size(), text, ctx);
				}
			}
		}
	}
}
