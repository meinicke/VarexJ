//
// Copyright (C) 2012 United States Government as represented by the
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

package gov.nasa.jpf.test.basic;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * basic test for InstructionFactories
 */
public class InstructionFactoryTest extends TestJPF {

  /**
   * Add double
   * ..., value1, value2 => ..., result
   */
  public static class DADD extends gov.nasa.jpf.jvm.bytecode.DADD {
    @Override
    public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
      StackFrame frame = ti.getModifiableTopFrame();
      
      double v1 = frame.popDouble(ctx);
      double v2 = frame.popDouble(ctx);
      
      double r = v1 + v2;
      System.out.printf("DADD %f + %f => %f\n", v1, v2, r);
      
      System.out.println(" ..but we negate it just for kicks..");
      r = -r;

      frame.pushDouble(r);

      return getNext(ctx, ti);
    }
  }
  
  public static class MyInsnFactory extends gov.nasa.jpf.jvm.bytecode.InstructionFactory {
    public  MyInsnFactory (Config conf){
      // nothing here
    }
    
    @Override
    public Instruction dadd() {
      return new DADD();
    }
  }
  
  @Test
  public void testDadd() {
    if (verifyNoPropertyViolation("+jvm.insn_factory.class=.test.basic.InstructionFactoryTest$MyInsnFactory")) {
      double a = 41.0;
      double b = a + 1.0;
      System.out.print("b=");
      System.out.println(b);
      assertTrue( b < 0); // since we used our own (twisted) DADD
    }
  }
}
