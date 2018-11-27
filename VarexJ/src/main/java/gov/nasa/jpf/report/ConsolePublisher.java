//
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import cmu.conditional.ChoiceFactory;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.Error;
import gov.nasa.jpf.util.Left;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.Path;
import gov.nasa.jpf.vm.Step;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Transition;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.va.StackHandlerFactory;

public class ConsolePublisher extends Publisher {

  // output destinations
  String fileName;
  FileOutputStream fos;

  String port;

  // the various degrees of information for program traces
  protected boolean showCG;
  protected boolean showSteps;
  protected boolean showLocation;
  protected boolean showSource;
  protected boolean showMethod;
  protected boolean showCode;

  public ConsolePublisher(Config conf, Reporter reporter) {
    super(conf, reporter);

    // options controlling the output destination
    fileName = conf.getString("report.console.file");
    port = conf.getString("report.console.port");

    // options controlling what info should be included in a trace
    showCG = conf.getBoolean("report.console.show_cg", true);
    showSteps = conf.getBoolean("report.console.show_steps", true);
    showLocation = conf.getBoolean("report.console.show_location", true);
    showSource = conf.getBoolean("report.console.show_source", true);
    showMethod = conf.getBoolean("report.console.show_method", false);
    showCode = conf.getBoolean("report.console.show_code", false);
  }

  public String getName() {
    return "console";
  }

  protected void openChannel(){

    if (fileName != null) {
      try {
        fos = new FileOutputStream(fileName);
        out = new PrintWriter( fos);
      } catch (FileNotFoundException x) {
        // fall back to System.out
      }
    } else if (port != null) {
      // <2do>
    }

    if (out == null){
      out = new PrintWriter(System.out, true);
    }
  }

  protected void closeChannel() {
    if (fos != null){
      out.close();
    }
  }

  public void publishTopicStart (String topic) {
    out.println();
    out.print("====================================================== ");
    out.println(topic);
  }

  public void publishTopicEnd (String topic) {
    // nothing here
  }

  public void publishStart() {
    super.publishStart();

    if (startItems.length > 0){ // only report if we have output for this phase
      publishTopicStart("search started: " + formatDTG(reporter.getStartDate()));
    }
  }

  public void publishFinished() {
    super.publishFinished();

    if (finishedItems.length > 0){ // only report if we have output for this phase
      publishTopicStart("search finished: " + formatDTG(reporter.getFinishedDate()));
    }
  }

  protected void publishJPF() {
//    out.println(reporter.getJPFBanner());
//    out.println();
    out.println("    VarexJ v1.0 (" + FeatureExprFactory.dflt().getClass().getSimpleName().substring(0, 3)
    		+ ", " + ChoiceFactory.getCurrent()
    		+ ", " + StackHandlerFactory.getCurrent() + ")");
//    out.println();
  }

  protected void publishDTG() {
    out.println("started: " + reporter.getStartDate());
  }

  protected void publishUser() {
    out.println("user: " + reporter.getUser());
  }

  protected void publishJPFConfig() {
    publishTopicStart("JPF configuration");

    TreeMap<Object,Object> map = conf.asOrderedMap();
    Set<Map.Entry<Object,Object>> eSet = map.entrySet();

    for (Object src : conf.getSources()){
      out.print("property source: ");
      out.println(conf.getSourceName(src));
    }    
    
    out.println("properties:");
    for (Map.Entry<Object,Object> e : eSet) {
      out.println("  " + e.getKey() + "=" + e.getValue());
    }
  }

  protected void publishPlatform() {
    publishTopicStart("platform");
    out.println("hostname: " + reporter.getHostName());
    out.println("arch: " + reporter.getArch());
    out.println("os: " + reporter.getOS());
    out.println("java: " + reporter.getJava());
  }


  protected void publishSuT() {
    publishTopicStart("system under test");
    out.println( reporter.getSuT());
  }

  protected void publishError() {
    Error e = reporter.getCurrentError();

    publishTopicStart("error " + e.getId());
    out.println(e.getDescription());

    String s = e.getDetails();
    if (s != null) {
      out.println(s);
    }

  }

  protected void publishConstraint() {
    String constraint = reporter.getLastSearchConstraint();
    publishTopicStart("search constraint");
    out.println(constraint);  // not much info here yet
  }

  protected void publishResult() {
    List<Error> errors = reporter.getErrors();

    publishTopicStart("results");

    if (errors.isEmpty()) {
      out.println("no errors detected");
    } else {
      for (Error e : errors) {
        out.print("error #");
        out.print(e.getId());
        out.print(": ");
        out.print(e.getDescription());

        String s = e.getDetails();
        if (s != null) {
          s = s.replace('\n', ' ');
          s = s.replace('\t', ' ');
          s = s.replace('\r', ' ');
          out.print(" \"");
          if (s.length() > 50){
            out.print(s.substring(0,50));
            out.print("...");
          } else {
            out.print(s);
          }
          out.print('"');
        }

        out.println();
      }
    }
  }

  /**
   * this is done as part of the property violation reporting, i.e.
   * we have an error
   */
  protected void publishTrace() {
    Path path = reporter.getPath();
    int i=0;

    if (path.size() == 0) {
      return; // nothing to publish
    }

    publishTopicStart("trace " + reporter.getCurrentErrorId());

    for (Transition t : path) {
      out.print("------------------------------------------------------ ");
      out.println("transition #" + i++ + " thread: " + t.getThreadIndex());

      if (showCG){
        out.println(t.getChoiceGenerator());
      }

      if (showSteps) {
        String lastLine = null;
        MethodInfo lastMi = null;
        int nNoSrc=0;

        for (Step s : t) {
          if (showSource) {
            String line = s.getLineString();
            if (line != null) {
              if (!line.equals(lastLine)) {
                if (nNoSrc > 0){
                  out.println("      [" + nNoSrc + " insn w/o sources]");
                }

                out.print("  ");
                if (showLocation) {
                  out.print(Left.format(s.getLocationString(),30));
                  out.print(" : ");
                }
                out.println(line.trim());
                nNoSrc = 0;

              }
            } else { // no source
              nNoSrc++;
            }
            
            lastLine = line;
          }

          if (showCode) {
            Instruction insn = s.getInstruction();
            if (showMethod){
              MethodInfo mi = insn.getMethodInfo();
              if (mi != lastMi) {
                ClassInfo mci = mi.getClassInfo();
                out.print("    ");
                if (mci != null) {
                  out.print(mci.getName());
                  out.print(".");
                }
                out.println(mi.getUniqueName());
                lastMi = mi;
              }
            }
            out.print("      ");
            out.println(insn);
          }
        }

        if (showSource && !showCode && (nNoSrc > 0)) {
          out.println("      [" + nNoSrc + " insn w/o sources]");
        }
      }
    }
  }

  protected void publishOutput() {
    Path path = reporter.getPath();

    if (path.size() == 0) {
      return; // nothing to publish
    }

    publishTopicStart("output " + reporter.getCurrentErrorId());

    if (path.hasOutput()) {
      for (Transition t : path) {
        String s = t.getOutput();
        if (s != null){
          out.print(s);
        }
      }
    } else {
      out.println("no output");
    }
  }

  protected void publishSnapshot() {
    VM vm = reporter.getVM();

    // not so nice - we have to delegate this since it's using a lot of internals, and is also
    // used in debugging
    publishTopicStart("snapshot " + reporter.getCurrentErrorId());

    if (vm.getPathLength() > 0) {
      vm.printLiveThreadStatus(out);
    } else {
      out.println("initial program state");
    }
  }

  public static final String STATISTICS_TOPIC = "statistics";
  
  // this is useful if somebody wants to monitor progress from a specialized ConsolePublisher
  public synchronized void printStatistics (PrintWriter pw){
    publishTopicStart( STATISTICS_TOPIC);
    printStatistics( pw, reporter);
  }
  
  // this can be used outside a publisher, to show the same info
  public static void printStatistics (PrintWriter pw, Reporter reporter){
    Statistics stat = reporter.getStatistics();
    
    pw.println("elapsed time:       " + formatHMS(reporter.getElapsedTime()));
//    pw.println("elapsed time ms:    " + reporter.getElapsedTime());
//    pw.println("states:             new=" + stat.newStates + ",visited=" + stat.visitedStates
//            + ",backtracked=" + stat.backtracked + ",end=" + stat.endStates);
//    pw.println("search:             maxDepth=" + stat.maxDepth + ",constraints=" + stat.constraints);
//    pw.println("choice generators:  thread=" + stat.threadCGs
//            + " (signal=" + stat.signalCGs + ",lock=" + stat.monitorCGs + ",sharedRef=" + stat.sharedAccessCGs
//            + ",threadApi=" + stat.threadApiCGs + ",reschedule=" + stat.breakTransitionCGs
//            + "), data=" + stat.dataCGs);
//    pw.println("heap:               " + "new=" + stat.nNewObjects
//            + ",released=" + stat.nReleasedObjects
//            + ",maxLive=" + stat.maxLiveObjects
//            + ",gcCycles=" + stat.gcCycles);
    pw.println("instructions:       " + ThreadInfo.insertDots((int)stat.insns));
//    long elepsedTime = reporter.getElapsedTime()/1000l;
//    if (elepsedTime == 0) {
//    	pw.println("instructions/s:     more than " + ThreadInfo.insertDots((int)(stat.insns)));
//    } else {
//    	pw.println("instructions/s:     " + ThreadInfo.insertDots((int)(stat.insns/elepsedTime)));
//    }
    pw.println("max memory:         " + (stat.maxUsed >> 20) + "MB");

//    pw.println("loaded code:        classes=" + ClassLoaderInfo.getNumberOfLoadedClasses() + ",methods="
//            + MethodInfo.getNumberOfLoadedMethods());
    // createOutput(reporter.getElapsedTime(), stat.visitedStates,(stat.maxUsed >> 20), stat.insns);
  }
 
  /**
   * TODO add command line option to activate this code
   * 
   * Add the result to an output file
   */
  @SuppressWarnings("unused")
  private static void createOutput(long time, long visitedStates, long mb, long insns) {
		File results = new File("VarexJ.csv");
		if (!results.exists()) {
			try {
				results.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("write results to " + results + " " + time);
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(results, true)))) {
			out.print(time);
			out.print(';');
			out.print(visitedStates);
			out.print(';');
			out.print(mb);
			out.print(';');
			out.print(insns);
			out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
  
  public void publishStatistics() {
    printStatistics(out);
  }

}
