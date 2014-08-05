//
// Copyright (C) 2007 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//

package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.KernelState;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.SystemState;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.choice.IntIntervalGenerator;
import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * common root class for LOOKUPSWITCH and TABLESWITCH insns
 *
 * <2do> this is inefficient. First, we should store targets as instruction indexes
 * to avoid execution() looping. Second, there are no matches for a TABLESWITCH
 */
public abstract class SwitchInstruction extends JVMInstruction {

  public static final int DEFAULT = -1; 
  
  protected int   target;   // default branch
  protected int[] targets;  // explicit value branches
  protected int[] matches;  // branch consts

  protected int lastIdx;

  protected SwitchInstruction (int defaultTarget, int numberOfTargets){
    target = defaultTarget;
    targets = new int[numberOfTargets];
    matches = new int[numberOfTargets];
  }

  public int getNumberOfEntries() {
    return targets.length;
  }

	protected Conditional<Instruction> executeConditional(FeatureExpr ctx, ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Integer> value = frame.pop(ctx);

		return value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer value) {
				lastIdx = DEFAULT;

				for (int i = 0, l = matches.length; i < l; i++) {
					if (value == matches[i]) {
						lastIdx = i;
						return new One<>(mi.getInstructionAt(targets[i]));
					}
				}

				return new One<>(mi.getInstructionAt(target));
			}

		});
	}

  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    // this can be overridden by subclasses, so we have to delegate the conditional execution
    // to avoid getting recursive in executeAllBranches()
    return executeConditional(ctx, ti);
  }

  /** useful for symbolic execution modes */
  public Instruction executeAllBranches (SystemState ss, KernelState ks, ThreadInfo ti) {
    if (!ti.isFirstStepInsn()) {
      IntIntervalGenerator cg = new IntIntervalGenerator("switchAll", 0,matches.length);
      if (ss.setNextChoiceGenerator(cg)){
        return this;

      } else {
        // listener did override CG, fall back to conditional execution
        return executeConditional(FeatureExprFactory.True(), ti).getValue();
      }
      
    } else {
      IntIntervalGenerator cg = ss.getCurrentChoiceGenerator("switchAll", IntIntervalGenerator.class);
      assert (cg != null) : "no IntIntervalGenerator";
      
      StackFrame frame = ti.getModifiableTopFrame();
      int idx = frame.pop(FeatureExprFactory.True()).getValue(); // but we are not using it
      idx = cg.getNextChoice();
      
      if (idx == matches.length){ // default branch
        lastIdx = DEFAULT;
        return mi.getInstructionAt(target);
      } else {
        lastIdx = idx;
        return mi.getInstructionAt(targets[idx]);
      }
    }
  }

  //--- a little inspection, but only post exec yet
  
  public int getLastTargetIndex () {
    return lastIdx;
  }
  
  public int getNumberOfTargets () {
    return matches.length;
  }
  
  public int getMatchConst (int idx){
    return matches[idx];
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

  public int getTarget() {
	return target;
  }

  public int[] getTargets() {
	return targets;
  }

  public int[] getMatches() {
	return matches;
  }
}
