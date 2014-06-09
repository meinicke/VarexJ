//
// Copyright (C) 2009 United States Government as represented by the
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

package gov.nasa.jpf.test.java.net;

import gov.nasa.jpf.util.test.TestJPF;

import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;


/**
 * regression test for URLEncoder/Decoder
 */
public class URLEncoderTest extends TestJPF {

  /************************** test methods ************************/
  @Test
  public void testEncodeCycle (){
    if (verifyNoPropertyViolation()){
      String s = "< what a mess >";
      String enc = "UTF-8";

      try {
        System.out.println("original: " + s);
        String e = URLEncoder.encode(s, enc);
        System.out.println("encoded:  " + e);
        String d = URLDecoder.decode(e,enc);
        System.out.println("decoded:  " + d);

        assert s.equals(d) : "encode/decode roundtrip failed";

      } catch (Throwable t){
        fail("unexpected exception: " + t);
      }
    }
  }

  @Test
  public void testEncodingException (){
    if (verifyNoPropertyViolation()){
      String s = "< what a mess >";
      String enc = "wrgsGrff";

      try {
        System.out.println("original: " + s);
        String e = URLEncoder.encode(s, enc);
        System.out.println("encoded:  " + e);

        fail("this is really not a known encoding: " + enc);

      } catch (java.io.UnsupportedEncodingException x){
        System.out.println("rightfully throws " + x);
      }
    }
  }
}
