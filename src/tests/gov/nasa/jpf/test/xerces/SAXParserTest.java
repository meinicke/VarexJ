//
// Copyright (C) 2011 United States Government as represented by the
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

package gov.nasa.jpf.test.xerces;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * regression test for parsing xml files with Apache xerces
 * The data files are shamelessly lifted from Checkstyle 5.3, to use some
 * real input data
 */
public class SAXParserTest extends TestJPF {

  @Test
  public void testSimpleParse() throws ParserConfigurationException, SAXException, IOException  {

    if (verifyNoPropertyViolation(
            "+http.connection=http://*.dtd -- gov.nasa.jpf.CachedROHttpConnection",
            "+http.cache_dir=src/tests/gov/nasa/jpf/test/xerces",
            "+log.info=http")){
      String pathName = "src/tests/gov/nasa/jpf/test/xerces/sun_checks.xml";

      DefaultHandler handler = new DefaultHandler();

      XMLReader mParser;
      SAXParserFactory factory = SAXParserFactory.newInstance();
      factory.setValidating(true);
      factory.setNamespaceAware(true);
      mParser = factory.newSAXParser().getXMLReader();
      mParser.setContentHandler(handler);
      mParser.setEntityResolver(handler);
      mParser.setErrorHandler(handler);

      mParser.parse(pathName);
    }
  }
}
