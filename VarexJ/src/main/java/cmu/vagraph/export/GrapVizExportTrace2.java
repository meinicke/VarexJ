package cmu.vagraph.export;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import cmu.vagraph.VAGraph;
import cmu.vagraph.trace.Trace;

public class GrapVizExportTrace2 {

	private String fileName;
	private VAGraph graph;

	public GrapVizExportTrace2(String fileName, VAGraph graph) {
		this.fileName = fileName;
		this.graph = graph;// .getSlice(574);
		 this.graph = graph.getSlice(573);//example
		// this.graph = graph.getSlice(579);//linux1
		// this.graph = graph.getSlice(574);//linux2
	}

	private static String[] filter = new String[] { "java." };

	public void write() {
		File file = new File(fileName);
		System.out.println("Create file: " + file.getAbsolutePath());

		try (PrintWriter pw = new PrintWriter(file)) {
			
			Trace trace = Trace.GraphToTrace(graph, filter);
			trace.print(pw);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
