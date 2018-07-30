//
// Copyright (C) 2012 United States Government as represented by the
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

import java.util.ArrayList;
import java.util.List;

import cmu.conditional.CachedFeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.NEW;
import gov.nasa.jpf.util.LocationSpec;
import gov.nasa.jpf.util.TypeSpec;
import gov.nasa.jpf.vm.AllocInstruction;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * simulator for OutOfMemoryErrors. This can be configured to either
 * fire for a specified location range (file:line) or specified types.
 * Ranges are transitive, i.e. everything called from within it should also
 * trigger.  
 * 
 * Since our only action is to inject OutOfMemoryErrors, we don't need
 * to implement a Property interface
 */
public class OOMEInjector extends ListenerAdapter {

  static class OOME {}
  static OOME throwOOME = new OOME(); // we can reuse the same object as an attribute
  
  List<LocationSpec> locations = new ArrayList<LocationSpec>();
  List<TypeSpec> types = new ArrayList<TypeSpec>();
  
  public OOMEInjector (Config config, JPF jpf){
    String[] spec = config.getStringArray("oome.locations");
    if (spec != null){
      for (String s : spec){
        LocationSpec locSpec = LocationSpec.createLocationSpec(s);
        if (locSpec != null){
          locations.add(locSpec);
        }
      }
    }
    
    spec = config.getStringArray("oome.types");
    if (spec != null){
      for (String s : spec){
        TypeSpec typeSpec = TypeSpec.createTypeSpec(s);
        if (typeSpec != null){
          types.add(typeSpec);
        }
      }      
    }
  }
  
  protected void markMatchingInstructions (MethodInfo mi, LocationSpec locSpec){
    int first = locSpec.getFromLine();
    int[] lineNumbers = mi.getLineNumbers();
              
    if (lineNumbers != null && first >= lineNumbers[0]){
      int last = locSpec.getToLine();
      for (int i=0; i<lineNumbers.length; i++){
//        int l = lineNumbers[i];
        if (last < lineNumbers[i]){
          return;
        } else {
          Instruction insn = mi.getInstruction(i);
          insn.addAttr(throwOOME);                
        }
      }
    }    
  }
  
  @Override
  public void classLoaded (VM vm, ClassInfo loadedClass){
    String fname = loadedClass.getSourceFileName();
    
    for (TypeSpec typeSpec : types){
      if (typeSpec.matches(loadedClass)){
        loadedClass.addAttr(throwOOME);
      }
    }

    // if we have a matching typespec this could be skipped, but maybe
    // we also want to cover statis methods of this class
    for (LocationSpec locSpec : locations){
      if (locSpec.matchesFile(fname)){
        for (MethodInfo mi : loadedClass.getDeclaredMethodInfos()){
          markMatchingInstructions(mi, locSpec);
        }
      }
    }
  }
  
  protected boolean checkCallerForOOM (StackFrame frame, Instruction insn){
    // these refer to the calling code
    return (insn.hasAttr(OOME.class) || frame.hasFrameAttr(OOME.class));
  }
  
  @Override
  public void executeInstruction (FeatureExpr ctx, VM vm, ThreadInfo ti, Instruction insnToExecute){
    if (insnToExecute instanceof AllocInstruction){
      if (checkCallerForOOM(ti.getTopFrame(), insnToExecute)){
        // we could use Heap.setOutOfMemory(true), but then we would have to reset
        // if the app handles it so that it doesn't throw outside the specified locations.
        // This would require more effort than throwing explicitly
        Instruction nextInsn = ti.createAndThrowException(CachedFeatureExprFactory.True(), "java.lang.OutOfMemoryError");
        ti.skipInstruction(nextInsn);
      }
    }
  }
  
  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction insn, Instruction executedInsn){
    
    if (executedInsn instanceof InvokeInstruction){
      StackFrame frame = ti.getTopFrame();
      
      if (frame.getPC().getValue() != executedInsn){ // means the call did succeed
        if (checkCallerForOOM(frame.getPrevious(), executedInsn)){
          frame.addFrameAttr(throwOOME); // propagate caller OOME context
        }
      }
      
    } else if (executedInsn instanceof NEW){
      if (!types.isEmpty()){
        int objRef = ((NEW) executedInsn).getNewObjectRef();
        if (objRef != MJIEnv.NULL) {
          ClassInfo ci = vm.getClassInfo(objRef);
          if (ci.hasAttr(OOME.class)) {
            Instruction nextInsn = ti.createAndThrowException(CachedFeatureExprFactory.True(), "java.lang.OutOfMemoryError");
            ti.setNextPC(nextInsn);
          }
        }
      }
    }
  }
}
