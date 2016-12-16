import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import cmu.varviz.io.graphviz.GrapVizExport;
import cmu.varviz.io.xml.XMLReader;
import cmu.varviz.io.xml.XMLWriter;
import cmu.varviz.trace.Trace;
import gov.nasa.jpf.JPF;

public class Run {

	enum example {
		Linux1, Linux2, Linux3, Linux4, Linux5, Example, 
		OverrideTest, Loop, EnumTest, IfElseTest
	}
	
	static final File xmlFile = new File("graph.xml");
	public static void main(String[] _) throws ParserConfigurationException, TransformerException, IOException, SAXException {
		final String path = new File("").getAbsolutePath();
		final String[] args = {
				"+classpath=" + path + "/bin",
				"+search.class=.search.RandomSearch",
				"linux." + example.Linux1
		};
		
		JPF.main(args);
		
		XMLWriter writer = new XMLWriter(JPF.vatrace);
		writer.writeToFile(xmlFile);
		
		XMLReader reader = new XMLReader();
		Trace trace = reader.readFromFile(xmlFile);
		
		GrapVizExport exporter = new GrapVizExport("graph", trace);
		exporter.write();
	}

}
