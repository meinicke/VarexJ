//
// Copyright (C) 2013 United States Government as represented by the
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

package gov.nasa.jpf.util.test;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.Property;
import gov.nasa.jpf.util.Misc;
import gov.nasa.jpf.util.TypeRef;
import gov.nasa.jpf.vm.NotDeadlockedProperty;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * This is a root class for testing multi-processes code. This forces
 * JPF to use MultiProcessVM and DistributedSchedulerFactory
 */
public abstract class TestMultiProcessJPF extends TestJPF {
  int numOfPrc;

  protected void setTestTargetKeys(Config conf, StackTraceElement testMethod) {
    conf.put("target.entry", "runTestMethod([Ljava/lang/String;)V");
    conf.put("target.replicate", Integer.toString(numOfPrc));
    conf.put("target", testMethod.getClassName());
    conf.put("target.test_method", testMethod.getMethodName());
    conf.put("vm.class", "gov.nasa.jpf.vm.MultiProcessVM");
    conf.put("vm.scheduler_factory.class", "gov.nasa.jpf.vm.DistributedSchedulerFactory");
  }

  protected native int getProcessId();

  protected boolean mpVerifyAssertionErrorDetails (int prcNum, String details, String... args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      unhandledException( getCaller(), "java.lang.AssertionError", details, args);
      return false;
    }
  }

  protected boolean mpVerifyAssertionError (int prcNum, String... args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      unhandledException( getCaller(), "java.lang.AssertionError", null, args);
      return false;
    }
  }

  protected boolean mpVerifyNoPropertyViolation (int prcNum, String...args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      noPropertyViolation(getCaller(), args);
      return false;
    }
  }

  protected boolean mpVerifyUnhandledExceptionDetails (int prcNum, String xClassName, String details, String... args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      unhandledException( getCaller(), xClassName, details, args);
      return false;
    }
  }

  protected boolean mpVerifyUnhandledException (int prcNum, String xClassName, String... args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      unhandledException( getCaller(), xClassName, null, args);
      return false;
    }
  }

  protected boolean mpVerifyJPFException (int prcNum, TypeRef xClsSpec, String... args){
    if (runDirectly) {
      return true;

    } else {
      numOfPrc = prcNum;
      try {
        Class<? extends Throwable> xCls = xClsSpec.asNativeSubclass(Throwable.class);

        jpfException( getCaller(), xCls, args);

      } catch (ClassCastException ccx){
        fail("not a property type: " + xClsSpec);
      } catch (ClassNotFoundException cnfx){
        fail("property class not found: " + xClsSpec);
      }
      return false;
    }
  }

  protected boolean mpVerifyPropertyViolation (int prcNum, TypeRef propertyClsSpec, String... args){
    if (runDirectly) {
      return true;

    } else {
      numOfPrc = prcNum;
      try {
        Class<? extends Property> propertyCls = propertyClsSpec.asNativeSubclass(Property.class);
        propertyViolation( getCaller(), propertyCls, args);

      } catch (ClassCastException ccx){
        fail("not a property type: " + propertyClsSpec);
      } catch (ClassNotFoundException cnfx){
        fail("property class not found: " + propertyClsSpec);
      }
      return false;
    }
  }

  protected boolean mpVerifyDeadlock (int prcNum, String... args){
    if (runDirectly) {
      return true;
    } else {
      numOfPrc = prcNum;
      propertyViolation( getCaller(), NotDeadlockedProperty.class, args);
      return false;
    }
  }
}
