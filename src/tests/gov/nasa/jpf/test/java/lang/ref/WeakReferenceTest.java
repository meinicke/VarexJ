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

package gov.nasa.jpf.test.java.lang.ref;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import java.lang.ref.WeakReference;

import org.junit.Test;

public class WeakReferenceTest extends TestJPF
{
   @Test
   public void testGCClearsRef()
   {
      WeakReference<Target> ref;

      if (verifyNoPropertyViolation())
      {
         ref = new WeakReference<Target>(new Target());

         forceGC();
         
         assertNull(ref.get());
      }
   }

   @Test
   public void testStrongReferenceKeepsWeakReference()
   {
      WeakReference<Target> ref;
      Target target;

      if (verifyNoPropertyViolation())
      {
         target = new Target();
         ref    = new WeakReference<Target>(target);

         forceGC();

         assertSame(target, ref.get());
      }
   }

   /* ClassInfo.refClassInfo wasn't being set to null between JPF runs.  Thus, 
    * refClassInfo wasn't being updated.  Hence, the WeakReference below would 
    * be treated as a normal object in GC.  Re-run testGCClearsRef() to 
    * reproduce the issue.
    */
   @Test
   public void testClearClassInfoRefClassInfo()
   {
      testGCClearsRef();
   }
   
   private static void forceGC()
   {
      System.gc();         // Mark that GC is needed
      Verify.breakTransition("testForceGC"); // Cause a state to be captured and hence GC to run
   }
   
   private static class Target   // Make this object easy to find in JPF heap
   {
   }
}
