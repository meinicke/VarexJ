package cmu.vatrace.export;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

import cmu.utils.CommandLineRunner;
import cmu.vatrace.Trace;

public class GrapVizExport {
	
	enum Format {
		pdf
	}

	private String fileName;
	private Trace trace;

	public GrapVizExport(String fileName, Trace vatrace) {
		this.fileName = fileName;
		this.trace = vatrace;// .getSlice(574);
		// this.graph = graph.getSlice(573);//example
		// this.graph = graph.getSlice(579);//linux1
		// this.graph = graph.getSlice(574);//linux2

		// this.graph = graph.getSlice(580);//elevator e
	}

	private static String[] filter = new String[] { "java." };

	public void write() {
		final File file = new File(fileName + ".gv");
		System.out.print("create file: " + file.getAbsolutePath());
		System.out.flush();
		try (PrintWriter pw = new PrintWriter(file, "UTF-8")) {
			trace.print(pw, filter);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.print(" > " + fileName + "." + Format.pdf);
		callGraphviz(file, Format.pdf.toString());
	}

	private void callGraphviz(final File file, final String format) {
		final String[] commands = new String[] { "dot", "-T" + format, file.getPath(), "-o", fileName + "." + format};
		
		try {
			Field f = BufferedInputStream.class.getDeclaredField("DEFAULT_BUFFER_SIZE");
			f.setAccessible(true);
			System.out.println(f.getInt(null));
			f.setInt(null, 8192);
		} catch (IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		
		CommandLineRunner.process(commands);
	}

}
