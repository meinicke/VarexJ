//
// Copyright (C) 2008 United States Government as represented by the
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
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.annotation.JPFOption;
import gov.nasa.jpf.report.ConsolePublisher;
import gov.nasa.jpf.report.Publisher;
import gov.nasa.jpf.report.PublisherExtension;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.SystemState;

import java.io.PrintWriter;

/** 
 * A lightweight listener to generate the error trace by printing
 * the program instructions at transition boundaries. The idea is to have
 * a shorter trace output that only shows the choices
 */
public class ErrorTraceGenerator extends PropertyListenerAdapter implements PublisherExtension {

  protected ChoiceGenerator<?>[] trace;

  @JPFOption(type = "Boolean", key = "etg.show_insn", defaultValue = "true", comment = "print instruction that caused CG")
  protected boolean showInsn = true;
  
  @JPFOption(type = "Boolean", key = "etg.show_loc", defaultValue = "true", comment = "print source location that caused CG")
  protected boolean showLoc = true;

  @JPFOption(type = "Boolean", key = "etg.show_src", defaultValue = "true", comment = "print source line that caused CG")
  protected boolean showSrc = true;
  
	public ErrorTraceGenerator(Config conf, JPF jpf) {
		jpf.addPublisherExtension(ConsolePublisher.class, this);
    
    showInsn = conf.getBoolean("etg.show_insn", showInsn);
    showSrc = conf.getBoolean("etg.show_src", showLoc);
    showLoc = conf.getBoolean("etg.show_loc", showSrc);
	}

  public void publishPropertyViolation (Publisher p){
    PrintWriter pw = p.getOut();
    
    p.publishTopicStart("error trace choices");

    if (trace != null){
      int i=0;
      for (ChoiceGenerator<?> cg : trace){
        int tid = cg.getThreadInfo().getId();
        Instruction insn = cg.getInsn();

        if (!cg.isCascaded()){
          pw.printf("#%2d [tid=%2d] ", i++, tid);
        } else {
          pw.print("             ");
        }
        
        pw.println(cg);
        
        if (!cg.isCascaded()){
          if (showLoc){
            String loc = insn.getFilePos();
            if (loc == null){
              loc = "[no file]";
            }
            pw.print("\tat ");
            pw.print(loc);
            
            pw.print(" in ");
            pw.println( insn.getMethodInfo());
          }
          
          if (showInsn) {
            pw.printf("\tinstruction: [pc=%d] %s\n", insn.getPosition(), insn);
          }

          if (showSrc) {
            String srcLine = insn.getSourceLine();
            if (srcLine == null){
              srcLine = "[no source]";
            } else {
              srcLine = srcLine.trim();
            }
            pw.print("\tsource: ");
            pw.println( srcLine);
          }
        }
      }
    }
  }
  
  @Override
  public void propertyViolated(Search search) {
    VM vm = search.getVM();
    SystemState ss = vm.getSystemState();
    trace = ss.getChoiceGenerators();
  }
}