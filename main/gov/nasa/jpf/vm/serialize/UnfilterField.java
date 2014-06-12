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
package gov.nasa.jpf.vm.serialize;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that a field in the model SHOULD BE considered during
 * state matching, even if other (prior) configuration would filter it.
 * @author peterd
 */
@Target({ElementType.FIELD})
public @interface UnfilterField {
  /**
   * If not the empty string, specifies a property that must be "true" to
   * activate unfiltering--unless <code>invert</code> is set.
   */
  String condition() default "";
  
  /**
   * If set to <code>true</code>, property must be "false" to activate
   * unfiltering. Does nothing if <code>condition</code> is empty string.
   */
  boolean invert() default false;
}
