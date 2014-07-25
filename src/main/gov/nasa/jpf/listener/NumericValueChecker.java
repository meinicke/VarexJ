//
// Copyright (C) 2010 United States Government as represented by the
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

package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPFConfigException;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.jvm.bytecode.DSTORE;
import gov.nasa.jpf.jvm.bytecode.FSTORE;
import gov.nasa.jpf.jvm.bytecode.FieldInstruction;
import gov.nasa.jpf.jvm.bytecode.ISTORE;
import gov.nasa.jpf.jvm.bytecode.InstructionVisitorAdapter;
import gov.nasa.jpf.jvm.bytecode.LSTORE;
import gov.nasa.jpf.jvm.bytecode.LocalVariableInstruction;
import gov.nasa.jpf.jvm.bytecode.PUTFIELD;
import gov.nasa.jpf.jvm.bytecode.PUTSTATIC;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.FieldSpec;
import gov.nasa.jpf.util.VarSpec;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * little listener that checks value ranges of specified numeric fields and local vars
 *
 * configuration examples:
 *
 *  range.fields=speed,..
 *  range.speed.field=x.y.SomeClass.velocity
 *  range.speed.min=300
 *  range.speed.max=500
 *
 *  range.vars=altitude,..
 *  range.altitude.var=x.y.SomeClass.computeTrajectory(int):a
 *  range.altitude.min=125000
 *
 */
public class NumericValueChecker extends PropertyListenerAdapter {

  static abstract class RangeCheck {
    double min, max;

    RangeCheck (double min, double max){
      this.min = min;
      this.max = max;
    }

    String check (long v){
      if (v < (long)min){
        return String.format("%d < %d", v, (long)min);
      } else if (v > (long)max){
        return String.format("%d > %d", v, (long)max);
      }
      return null;
    }
    String check (double v){
      if (v < min){
        return String.format("%f < %f", v, min);
      } else if (v > (long)max){
        return String.format("%f > %f", v, max);
      }
      return null;
    }
  }

  static class FieldCheck extends RangeCheck {
    FieldSpec fspec;

    FieldCheck (FieldSpec fspec, double min, double max){
      super(min,max);
      this.fspec = fspec;
    }

    boolean matches (FieldInfo fi){
      return fspec.matches(fi);
    }
  }

  static class VarCheck extends RangeCheck {
    VarSpec vspec;

    VarCheck (VarSpec vspec, double min, double max){
      super(min,max);
      this.vspec = vspec;
    }

    LocalVarInfo getMatch (MethodInfo mi, int pc, int slotIdx){
      return vspec.getMatchingLocalVarInfo(mi, pc, slotIdx);
    }
  }
  
  class Visitor extends InstructionVisitorAdapter {
    
    void checkFieldInsn (FieldInstruction insn){
      if (fieldChecks != null){
        FieldInfo fi = insn.getFieldInfo(null);

        for (int i = 0; i < fieldChecks.length; i++) {
          FieldCheck fc = fieldChecks[i];
          if (fc.matches(fi)) {
            if (fi.isNumericField()) {
              long lv = insn.getLastValue();
              String errorCond = fi.isFloatingPointField()
                      ? fc.check(Double.longBitsToDouble(lv)) : fc.check(lv);

              if (errorCond != null) {
                error = String.format("field %s out of range: %s\n\t at %s",
                        fi.getFullName(), errorCond, insn.getSourceLocation());
                vm.breakTransition("fieldValueOutOfRange"); // terminate this transition
                break;
              }
            }
          }
        }
      }
    }

    void checkVarInsn (LocalVariableInstruction insn){
      if (varChecks != null){
        ThreadInfo ti = ThreadInfo.getCurrentThread();
        StackFrame frame = ti.getTopFrame();
        int slotIdx = insn.getLocalVariableIndex();

        for (int i = 0; i < varChecks.length; i++) {
          VarCheck vc = varChecks[i];

          MethodInfo mi = insn.getMethodInfo();
          int pc = insn.getPosition()+1; // the scope would begin on the next insn, we are still at the xSTORE
          LocalVarInfo lvar = vc.getMatch(mi, pc, slotIdx);
          if (lvar != null) {
            long v = lvar.getSlotSize() == 1 ? frame.getLocalVariable(FeatureExprFactory.True(), slotIdx).getValue() : frame.getLongLocalVariable(FeatureExprFactory.True(), slotIdx);
            String errorCond = lvar.isFloatingPoint()
                    ? vc.check(Double.longBitsToDouble(v)) : vc.check(v);

            if (errorCond != null) {
              error = String.format("local variable %s out of range: %s\n\t at %s",
                      lvar.getName(), errorCond, insn.getSourceLocation());
              vm.breakTransition("localVarValueOutOfRange"); // terminate this transition
              break;
            }
          }
        }
      }
    }

    @Override
    public void visit(PUTFIELD insn){
      checkFieldInsn(insn);
    }
    @Override
    public void visit(PUTSTATIC insn){
      checkFieldInsn(insn);
    }

    @Override
    public void visit(ISTORE insn){
      checkVarInsn(insn);
    }
    @Override    
    public void visit(LSTORE insn){
      checkVarInsn(insn);
    }
    @Override
    public void visit(FSTORE insn){
      checkVarInsn(insn);
    }
    @Override
    public void visit(DSTORE insn){
      checkVarInsn(insn);
    }

  }


  VM vm;
  Visitor visitor;

  // the stuff we monitor
  FieldCheck[] fieldChecks;
  VarCheck[] varChecks;

  String error; // where we store errorCond details

  public NumericValueChecker (Config conf){
    visitor = new Visitor();

    createFieldChecks(conf);
    createVarChecks(conf);
  }

  private void createFieldChecks(Config conf){
    String[] checkIds = conf.getCompactTrimmedStringArray("range.fields");
    if (checkIds.length > 0){
      fieldChecks = new FieldCheck[checkIds.length];

      for (int i = 0; i < checkIds.length; i++) {
        String id = checkIds[i];
        FieldCheck check = null;
        String keyPrefix = "range." + id;
        String spec = conf.getString(keyPrefix + ".field");
        if (spec != null) {
          FieldSpec fs = FieldSpec.createFieldSpec(spec);
          if (fs != null) {
            double min = conf.getDouble(keyPrefix + ".min", Double.MIN_VALUE);
            double max = conf.getDouble(keyPrefix + ".max", Double.MAX_VALUE);
            check = new FieldCheck(fs, min, max);
          }
        }
        if (check == null) {
          throw new JPFConfigException("illegal field range check specification for " + id);
        }
        fieldChecks[i] = check;
      }
    }
  }

  private void createVarChecks(Config conf){
    String[] checkIds = conf.getCompactTrimmedStringArray("range.vars");
    if (checkIds.length > 0){
      varChecks = new VarCheck[checkIds.length];

      for (int i = 0; i < checkIds.length; i++) {
        String id = checkIds[i];
        VarCheck check = null;
        String keyPrefix = "range." + id;
        String spec = conf.getString(keyPrefix + ".var");
        if (spec != null) {
          VarSpec vs = VarSpec.createVarSpec(spec);
          if (vs != null) {
            double min = conf.getDouble(keyPrefix + ".min", Double.MIN_VALUE);
            double max = conf.getDouble(keyPrefix + ".max", Double.MAX_VALUE);
            check = new VarCheck(vs, min, max);
          }
        }
        if (check == null) {
          throw new JPFConfigException("illegal variable range check specification for " + id);
        }
        varChecks[i] = check;
      }
    }
  }

  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn){
    this.vm = vm;
    ((JVMInstruction)executedInsn).accept(visitor);
  }

  @Override
  public boolean check(Search search, VM vm) {
    return (error == null);
  }

  @Override
  public void reset () {
    error = null;
  }

  @Override
  public String getErrorMessage(){
    return error;
  }
}
