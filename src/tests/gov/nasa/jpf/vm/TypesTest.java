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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Types;

import org.junit.Test;

/**
 * unit tests for gov.nasa.jpf.vm.Types
 */
public class TypesTest extends TestJPF {

  @Test public void testGetSignatureName () {
    
    String in  = "int foo(int,java.lang.String)";
    String out = "foo(ILjava/lang/String;)I";    
    String s = Types.getSignatureName(in);
    System.out.println( in + " => " + s);
    assert out.equals(s);

    in  = "double[] what_ever (char[], X )";
    out = "what_ever([CLX;)[D";
    s = Types.getSignatureName(in);
    System.out.println( in + " => " + s);
    assert out.equals(s);

    in  = "bar()";
    out = "bar()";
    s = Types.getSignatureName(in);
    System.out.println( in + " => " + s);
    assert out.equals(s);

  }

  //... and many more to come
}
