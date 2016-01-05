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
package gov.nasa.jpf.test.vm.basic;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * basic test of field access operations
 */
class TestFieldBase extends TestJPF {
  static boolean s_base_Z = true;
  static byte    s_base_B = 16;
  static char    s_base_C = 'A';
  static short   s_base_S = 2048;
  static int     s_base_I = 0x8000;
  static long    s_base_J = 0x800000;
  static float   s_base_F = 1.23f;
  static double  s_base_D = 3.45;
  static Object  s_base_o = new String("a static string");
  boolean        base_Z = true;
  byte           base_B = 16;
  char           base_C = 'A';
  short          base_S = 2048;
  int            base_I = 0x8000;
  long           base_J = 0x800000;
  float          base_F = 1.23f;
  double         base_D = 3.45;
  Object         base_o = new String("a instance string");
}


public class FieldTest extends TestFieldBase {
  boolean s_Z = s_base_Z;
  byte    s_B = s_base_B;
  char    s_C = s_base_C;
  short   s_S = s_base_S;
  int     s_I = s_base_I;
  long    s_J = s_base_J;
  float   s_F = s_base_F;
  double  s_D = s_base_D;
  Object  s_o = s_base_o;
  boolean _Z = base_Z;
  byte    _B = base_B;
  char    _C = base_C;
  short   _S = base_S;
  int     _I = base_I;
  long    _J = base_J;
  float   _F = base_F;
  double  _D = base_D;
  Object  _o = base_o;

  @Test public void testReadInstance () {
    if (verifyNoPropertyViolation()) {
      assert _Z == base_Z;
      assert _Z == true;

      assert _B == base_B;
      assert _B == 16;

      assert _C == base_C;
      assert _C == 'A';

      assert _I == base_I;
      assert _I == 0x8000;

      assert _J == base_J;
      assert _J == 0x800000;

      assert _F == base_F;
      assert _F == 1.23f;

      assert _D == base_D;
      assert _D == 3.45;

      assert _o.equals(base_o);
      assert _o.equals("a instance string");
    }
  }

  @Test public void testReadStatic () {
    if (verifyNoPropertyViolation()) {
      assert s_Z == s_base_Z;
      assert s_Z == true;

      assert s_B == s_base_B;
      assert s_B == 16;

      assert s_C == s_base_C;
      assert s_C == 'A';

      assert s_I == s_base_I;
      assert s_I == 0x8000;

      assert s_J == s_base_J;
      assert s_J == 0x800000;

      assert s_F == s_base_F;
      assert s_F == 1.23f;

      assert s_D == s_base_D;
      assert s_D == 3.45;

      assert s_o.equals(s_base_o);
      assert s_o.equals("a static string");
    }
  }

  @Test public void testWriteInstance () {
    if (verifyNoPropertyViolation()) {
      _Z = false;
      assert _Z == false;
      base_Z = _Z;
      assert base_Z == _Z;

      _B = 17;
      assert _B == 17;
      base_B = _B;
      assert base_B == _B;

      _C = 'B';
      assert _C == 'B';
      base_C = _C;
      assert base_C == _C;

      _I = 12345;
      assert _I == 12345;
      base_I = _I;
      assert base_I == _I;

      _J = 12345678;
      assert _J == 12345678;
      base_J = _J;
      assert base_J == _J;

      _F = 7.65f;
      assert _F == 7.65f;
      base_F = _F;
      assert base_F == _F;

      _D = 6.54;
      assert _D == 6.54;
      base_D = _D;
      assert base_D == _D;

      _o = new Integer(42);
      assert _o.equals(new Integer(42));
      base_o = _o;
      assert base_o.equals(_o);
    }
  }

  @Test public void testWriteStatic () {
    if (verifyNoPropertyViolation()) {
      s_Z = false;
      assert s_Z == false;
      s_base_Z = s_Z;
      assert s_base_Z == s_Z;

      s_B = 17;
      assert s_B == 17;
      s_base_B = s_B;
      assert s_base_B == s_B;

      s_C = 'B';
      assert s_C == 'B';
      s_base_C = s_C;
      assert s_base_C == s_C;

      s_I = 12345;
      assert s_I == 12345;
      s_base_I = s_I;
      assert s_base_I == s_I;

      s_J = 12345678;
      assert s_J == 12345678;
      s_base_J = s_J;
      assert s_base_J == s_J;

      s_F = 7.65f;
      assert s_F == 7.65f;
      s_base_F = s_F;
      assert s_base_F == s_F;

      s_D = 6.54;
      assert s_D == 6.54;
      s_base_D = s_D;
      assert s_base_D == s_D;

      s_o = new Integer(42);
      assert s_o.equals(new Integer(42));
      s_base_o = s_o;
      assert s_base_o.equals(s_o);
    }
  }
}