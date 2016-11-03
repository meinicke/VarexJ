package cmu.vagraph.export;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import cmu.utils.CommandLineRunner;
import cmu.vagraph.VAGraph;
import cmu.vagraph.trace.Trace;

public class GrapVizExportTrace2 {

	private String fileName;
	private VAGraph graph;

	public GrapVizExportTrace2(String fileName, VAGraph graph) {
		this.fileName = fileName;
		this.graph = graph;// .getSlice(574);
		// this.graph = graph.getSlice(573);//example
		// this.graph = graph.getSlice(579);//linux1
		// this.graph = graph.getSlice(574);//linux2

		// this.graph = graph.getSlice(580);//elevator e
	}

	private static String[] filter = new String[] { "java." };

	public void write() {
		final File file = new File(fileName + ".gv");
		try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
			Trace trace = Trace.GraphToTrace(graph, filter);
			trace.print(pw);

		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		callGraphviz(file, "pdf");
	}

	private void callGraphviz(final File file, final String format) {
		final String[] commands = new String[] { "dot", "-T" + format, file.getPath(), "-o", fileName + "." + format};
		CommandLineRunner.process(commands);
	}

}
