package coverage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWriter implements XMLCoverage {

	private final Coverage coverage;

	public XMLWriter(Coverage coverage) {
		this.coverage = coverage;
	}

	public String write() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setIgnoringComments(true);
		dbf.setIgnoringElementContentWhitespace(false);
		dbf.setCoalescing(true);
		dbf.setExpandEntityReferences(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		// Create the Xml Representation
		return createXMLDocument(doc);
	}

	private String createXMLDocument(Document doc) throws TransformerException {
		Element root = doc.createElement(ROOT);
		root.setAttribute(TYPE, coverage.getType());
		root.setAttribute(BASE, Integer.toString(coverage.getBaseValue()));
		for (String fileName : coverage.getFiles()) {
			Element file = doc.createElement(FILE);
			file.setAttribute(FILE_NAME, fileName);
			
			Element coverageElement = doc.createElement(COVERAGE_KEY);
			Collection<Interaction> coveredLines = coverage.getCoverage(fileName);
			
//			int from = Integer.MIN_VALUE;
//			int current = Integer.MIN_VALUE;
			for (Interaction interaction : coveredLines) {
				int line = interaction.getLine();
//				if (from == Integer.MIN_VALUE) {
//					from = line;
//					current = line;
//					continue;
//				}
//				if (line <= current + 1) {
//					current = line;
//					continue;
//				}
//					
				Element lineElement = doc.createElement(COVERED_LINE);
//				if (from == current) {
					lineElement.setAttribute(THIS, Integer.toString(line));
//				} else {
//					lineElement.setAttribute(FROM, Integer.toString(from));
//					lineElement.setAttribute(TO, Integer.toString(current));
//				}
				lineElement.setAttribute(INTERACTION, Integer.toString(interaction.getInteraction()));
				lineElement.setAttribute(TEXT, interaction.getText());
				coverageElement.appendChild(lineElement);
//				
//				from = line;
//				current = line;
			}
//			Element lineElement = doc.createElement(COVERED_LINE);
//			if (from == current) {
//				lineElement.setAttribute(THIS, Integer.toString(from));
//			} else {
//				lineElement.setAttribute(FROM, Integer.toString(from));
//				lineElement.setAttribute(TO, Integer.toString(current));
//			}
//			coverageElement.appendChild(lineElement);
			
			file.appendChild(coverageElement);
			root.appendChild(file);
		}
		doc.appendChild(root);
		// Transform the Xml Representation into a String
		Transformer transfo = TransformerFactory.newInstance().newTransformer();
		

		transfo.setOutputProperty(OutputKeys.METHOD, "xml");
		transfo.setOutputProperty(OutputKeys.INDENT, "yes");
		StreamResult result = new StreamResult(new StringWriter());
		DOMSource source = new DOMSource(doc);
		transfo.transform(source, result);
		

		return prettyPrint(result.getWriter().toString());
	}
	
	public void writeToFile(File file) throws ParserConfigurationException, TransformerException {
		try (FileOutputStream output = new FileOutputStream(file)) {
			if (!file.exists()) {
				file.createNewFile();
			}
			output.write(write().getBytes(Charset.availableCharsets().get("UTF-8")));
			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
     * Inserts indentations into the text
     * @param text
     * @return
     */
    private String prettyPrint (String text) {
    	StringBuilder result = new StringBuilder();
    	String line;
    	int indentLevel = 0;
    	BufferedReader reader = new BufferedReader(new StringReader(text));
    	try {
			line = reader.readLine();
			while (line != null) {	
				if (line.startsWith("</") ) {
					indentLevel--;
					for (int i=0; i < indentLevel; i++) {
						result.append("\t");
					}
				} 

				else if (line.startsWith("<")) {
					for (int i=0; i < indentLevel; i++) {
						result.append("\t");
					}
					if (!line.contains("</") ) {
						indentLevel++;
					}	
				} else {
					for (int i=0; i < indentLevel; i++) {
						result.append("\t");
					}
				}
				result.append(line + "\n");
				if (line.contains("/>")) {
					indentLevel--;				
				}
				line = reader.readLine();
			}
    	} catch (IOException e) {
    		e.printStackTrace();
		}
    	return result.toString();
    }
    
}
