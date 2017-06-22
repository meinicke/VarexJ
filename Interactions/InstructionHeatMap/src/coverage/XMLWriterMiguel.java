package coverage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;

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

public class XMLWriterMiguel implements XMLCoverage {

	private final CoverageMiguel coverage;

	public XMLWriterMiguel(CoverageMiguel coverage) {
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
		final Element root = doc.createElement(ROOT);
		root.setAttribute(TYPE, coverage.getType());
		root.setAttribute(BASE, Integer.toString(coverage.getBaseValue()));
		for (String fileName : coverage.getFiles()) {
			final Element file = doc.createElement(FILE);
			file.setAttribute(NAME, fileName);
			
			Map<String, Map<Integer, Interaction>> coveredMethods = coverage.getCoverage(fileName);
			for (Entry<String, Map<Integer, Interaction>> method : coveredMethods.entrySet()) {
				final Element methodElement = doc.createElement(METHOD);
				methodElement.setAttribute(NAME, method.getKey());
			
				for (Entry<Integer, Interaction> interaction : method.getValue().entrySet()) {
					int index = interaction.getKey();
					Element instructionElement = doc.createElement(INSTRUCTION);
					instructionElement.setAttribute(NAME, interaction.getValue().getName());
					instructionElement.setAttribute(INDEX, Integer.toString(index));
//					lineElement.setAttribute("value", Integer.toString(interaction.getValue().getInteraction()));
					instructionElement.setAttribute(TEXT, interaction.getValue().getText());
					methodElement.appendChild(instructionElement);
				}
				
				file.appendChild(methodElement);
			}
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
