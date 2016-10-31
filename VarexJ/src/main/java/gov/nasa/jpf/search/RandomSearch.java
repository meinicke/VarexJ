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
package gov.nasa.jpf.search;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import cmu.utils.TraceComparator;
import cmu.vagraph.export.GrapVizExportTrace2;
import coverage.Interaction;
import coverage.XMLWriter;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.RestorableVMState;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * this is a straight execution pseudo-search - it doesn't search at all (i.e.
 * it doesn't backtrack), but just behaves like a 'normal' VM, going forward()
 * until there is no next state then it restarts the search until it hits a
 * certain number of paths executed
 *
 * <2do> this needs to be updated & tested
 */
public class RandomSearch extends Search {
	int path_limit = 0;

	public RandomSearch(Config config, VM vm) {
		super(config, vm);

		path_limit = config.getInt("search.RandomSearch.path_limit", 0);
	}

	@SuppressWarnings("incomplete-switch")
	public void search() {
		try {
			if (JPF.COVERAGE != null) {
				// XXX some quick fix for coverage
				File file = new File("coverage.xml");
				System.out.println("Create file: " + file.getAbsolutePath());
				XMLWriter writer = new XMLWriter(gov.nasa.jpf.JPF.COVERAGE);
				try {
					writer.writeToFile(file);
				} catch (ParserConfigurationException | TransformerException e) {
					System.out.println(e.getMessage());
					for (StackTraceElement element : e.getStackTrace()) {
						System.out.println(element);
					}
					e.printStackTrace();
				}
			}
			
			ThreadInfo.RUN_SIMPLE = true;
			int depth = 0;
			int paths = 0;
			depth++;

			if (hasPropertyTermination()) {
				return;
			}

			// vm.forward();
			RestorableVMState init_state = vm.getRestorableState();

			notifySearchStarted();

			System.out.println("====================================================== Random Search");

			while (!done) {
				if ((depth < depthLimit) && forward()) {
					notifyStateAdvanced();

					if (currentError != null) {
						notifyPropertyViolated();

						if (hasPropertyTermination()) {
							break;
						}
					}

					if (isEndState()) {
						break;
					}

					depth++;

				} else { // no next state or reached depth limit
					// <2do> we could check for more things here. If the last
					// insn wasn't
					// the main return, or a System.exit() call, we could flag a
					// JPFException
					if (depth >= depthLimit) {
						notifySearchConstraintHit("depth limit reached: " + depthLimit);
					}
					checkPropertyViolation();
					done = (paths >= path_limit);
					paths++;
					System.out.println("paths = " + paths);
					depth = 1;
					vm.restoreState(init_state);
					vm.resetNextCG();
				}
			}
			notifySearchFinished();
		} finally {
			ThreadInfo.RUN_SIMPLE = false;
			if (gov.nasa.jpf.JPF.COVERAGE != null) {
				
				
				switch (JPF.SELECTED_COVERAGE_TYPE) {
				case composedContext:
					for (String file : JPF.COVERAGE.getFiles()) {
						for (Interaction interaction : JPF.COVERAGE.getCoverage(file)) {
							@SuppressWarnings({ "rawtypes", "unchecked" })
							HashMap<FeatureExpr, Integer> values = (HashMap) interaction.getValue();
							FeatureExpr composedContext = FeatureExprFactory.False();
							for (FeatureExpr entry : values.keySet()) {
								composedContext = composedContext.or(entry);
							}
							interaction.setInteraction(composedContext.collectDistinctFeatures().size());
						}
					}
					break;
				}
				
				JPF.COVERAGE.deleteMinInteraction();
				
				File file = new File("coverage.xml");
				System.out.println("Create file: " + file.getAbsolutePath());
				XMLWriter writer = new XMLWriter(gov.nasa.jpf.JPF.COVERAGE);
				try {
					writer.writeToFile(file);
				} catch (ParserConfigurationException | TransformerException e) {
					System.out.println(e.getMessage());
					for (StackTraceElement element : e.getStackTrace()) {
						System.out.println(element);
					}
					e.printStackTrace();
				}
			}
			if (JPF.traceMethod != null) {
				TraceComparator.compare();
				TraceComparator.clear();
			}
			
			JPF.vaGraph.print();
			
			GrapVizExportTrace2 exporter = new GrapVizExportTrace2("graph", JPF.vaGraph);
			exporter.write();
		}
	}
}
