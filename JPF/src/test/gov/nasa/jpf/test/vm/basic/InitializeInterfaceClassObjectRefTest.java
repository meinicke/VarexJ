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
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;

/*
 * VM.registerStartupClass must be kept in sync with ClassInfo.registerClass.
 * This test ensures that the interfaces of the main class are registered 
 * properly.  The old VM.registerStartupClass code wasn't initializing the
 * class object of the interfaces.
 */
public class InitializeInterfaceClassObjectRefTest extends TestJPF implements InitializeInterfaceClassObjectRefTestInterface
{
   @Test
   public void test()
   {
      if (verifyUnhandledExceptionDetails(RuntimeException.class.getName(), "This test throws an expected exception.", "+log.finest+=,gov.nasa.jpf.vm.ClassInfo"))
      {
         // Throw an exception to avoid backtracking.  Backtracking will wipe out the class object ref.
         throw new RuntimeException("This test throws an expected exception.");
      }
      else
      {
         ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(InitializeInterfaceClassObjectRefTestInterface.class.getName());
         
         if (ci.getClassObjectRef() < 0)
            throw new AssertionError("ci.getClassObjectRef() < 0 : " + ci.getClassObjectRef());
      }
   }
}

interface InitializeInterfaceClassObjectRefTestInterface
{
}
