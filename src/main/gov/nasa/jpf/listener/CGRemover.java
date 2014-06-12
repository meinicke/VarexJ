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
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.util.JPFLogger;
import gov.nasa.jpf.util.LocationSpec;
import gov.nasa.jpf.util.MethodSpec;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * listener that removes CGs for specified locations, method calls or method bodies
 *
 * This is an application specific state space optimizer that should be used
 * carefully since it has to be aware of which CGs can be removed, and which
 * ones can't (e.g. blocking sync or wait). You also have to be aware of the
 * order of listener registration, since subsequently registered listeners can
 * still add new CGs after they got removed here. THIS IS ONLY AN OPTIMIZATION
 * TOOL THAT SHOULD BE USED IN A WELL KNOWN APPLICATION CONTEXT.
 *
 *  cgrm.thread.cg_class = gov.nasa.jpf.vm.ThreadChoiceGenerator
 *  cgrm.thread.locations = Foobar.java:42                // either a LocationSpec
 *  cgrm.thread.method_bodies = a.SomeClass.someMethod()  // ..or a MethodSpec for a body
 *  cgrm.thread.method_calls = b.A.foo(int)               // ..or a MethodSpec for a call
 *
 * NOTE: in its current implementation, this listener has to be registered
 * before targeted classes are loaded
 */
public class CGRemover extends ListenerAdapter {

  static JPFLogger log = JPF.getLogger("gov.nasa.jpf.CGRemover");

  static class Category {
    String id;

    Class<?> cgClass;

    ArrayList<LocationSpec> locations = new ArrayList<LocationSpec>();
    ArrayList<MethodSpec> methodBodies = new ArrayList<MethodSpec>();
    ArrayList<MethodSpec> methodCalls = new ArrayList<MethodSpec>();

    Category (String id){
      this.id = id;
    }

    boolean checkSpecification() {
      return cgClass != null &&
              (!locations.isEmpty() || !methodBodies.isEmpty() || !methodCalls.isEmpty());
    }
  }

  List<Category> categories;

  HashMap<MethodInfo,Category> methodBodies;
  HashMap<MethodInfo,Category> methodCalls;
  HashMap<Instruction,Category> locations;


  public CGRemover (Config conf){
    categories = parseCategories(conf);
  }

  protected List<Category> parseCategories (Config conf){
    ArrayList<Category> list = new ArrayList<Category>();
    Category category = null;

    for (String key : conf.getKeysStartingWith("cgrm.")){
      String[] kc = conf.getKeyComponents(key);
      if (kc.length == 3){
        String k = kc[1];
        if (category != null){
          if (!category.id.equals(k)){
            addCategory(list, category);

            category = new Category(k);
          }
        } else {
          category = new Category(k);
        }

        k = kc[2];

        if ("cg_class".equals(k)){
          category.cgClass = conf.getClass(key);

        } else if ("locations".equals(k)){
          parseLocationSpecs(category.locations, conf.getStringArray(key));

        } else if ("method_bodies".equals(k)){
          parseMethodSpecs(category.methodBodies, conf.getStringArray(key));

        } else if ("method_calls".equals(k)){
          parseMethodSpecs(category.methodCalls, conf.getStringArray(key));

        } else {
          // we might have more options in the future
          log.warning("illegal CGRemover option: ", key);
        }

      } else {
        log.warning("illegal CGRemover key: ", key);
      }
    }

    addCategory(list, category);
    return list;
  }

  protected void addCategory (List<Category> list, Category cat){
    if (cat != null) {
      if (cat.checkSpecification()) {
        list.add(cat);
        log.info("added category: ", cat.id);
      } else {
        log.warning("incomplete CGRemover category: ", cat.id);
      }
    }
  }

  protected void parseLocationSpecs (List<LocationSpec> list, String[] specs){
    for (String spec : specs) {
      LocationSpec locSpec = LocationSpec.createLocationSpec(spec);
      if (locSpec != null) {
        if (locSpec.isAnyLine()){
          log.warning("whole file location specs not supported by CGRemover (use cgrm...method_bodies)");
        } else {
          list.add(locSpec);
        }
      } else {
        log.warning("location spec did not parse: ", spec);
      }
    }
  }

  protected void parseMethodSpecs (List<MethodSpec> list, String[] specs){
    for (String spec : specs) {
      MethodSpec mthSpec = MethodSpec.createMethodSpec(spec);
      if (mthSpec != null) {
        list.add(mthSpec);
      } else {
        log.warning("methos spec did not parse: ", spec);
      }
    }
  }


  protected void processClass (ClassInfo ci, Category cat){
    String fname = ci.getSourceFileName();

    for (LocationSpec loc : cat.locations){
      if (loc.matchesFile(fname)){ // Ok, we have to dig out the corresponding insns (if any)
        Instruction[] insns = ci.getMatchingInstructions(loc);
        if (insns != null){
          if (locations == null){
            locations = new HashMap<Instruction,Category>();
          }
          for (Instruction insn : insns){
            locations.put(insn, cat);
          }
        } else {
          log.warning("no insns for location: ", loc, " in class: ", ci.getName());
        }
      }
    }

    for (MethodSpec ms : cat.methodBodies){
      List<MethodInfo> list = ci.getMatchingMethodInfos(ms);
      if (list != null){
        for (MethodInfo mi : list){
          if (methodBodies == null){
            methodBodies = new HashMap<MethodInfo,Category>();
          }
          methodBodies.put(mi, cat);
        }
      }
    }

    for (MethodSpec ms : cat.methodCalls){
      List<MethodInfo> list = ci.getMatchingMethodInfos(ms);
      if (list != null){
        for (MethodInfo mi : list){
          if (methodCalls == null){
            methodCalls = new HashMap<MethodInfo,Category>();
          }
          methodCalls.put(mi, cat);
        }
      }
    }
  }

  protected boolean removeCG (VM vm, Category cat, ChoiceGenerator<?> cg){
    if (cat != null){
      if (cat.cgClass.isAssignableFrom(cg.getClass())){
        vm.getSystemState().removeNextChoiceGenerator();
        log.info("removed CG: ", cg);
        return true;        
      }
    }
    
    return false;
  }

  //--- VMListener interface

  // this is where we turn Categories into MethodInfos and Instructions to watch out for
  @Override
  public void classLoaded (VM vm, ClassInfo loadedClass){
    for (Category cat : categories){
      processClass(loadedClass, cat);
    }
  }

  // this is our main purpose in life
  @Override
  public void choiceGeneratorRegistered (VM vm, ChoiceGenerator<?> nextCG, ThreadInfo ti, Instruction executedInsn){
    ChoiceGenerator<?> cg = vm.getNextChoiceGenerator();
    Instruction insn = cg.getInsn();

    if (locations != null){
      if ( removeCG(vm, locations.get(insn), cg)){
        return;
      }
    }

    if (insn instanceof InvokeInstruction){
      MethodInfo invokedMi = ((InvokeInstruction)insn).getInvokedMethod();
      if (methodCalls != null) {
        if (removeCG(vm, methodCalls.get(invokedMi), cg)) {
          return;
        }
      }
    }

    if (methodBodies != null){
      if (removeCG(vm, methodBodies.get(insn.getMethodInfo()), cg)) {
        return;
      }
    }
  }
}
