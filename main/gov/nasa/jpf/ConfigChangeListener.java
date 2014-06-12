//
// Copyright (C) 2008 United States Government as represented by the
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
package gov.nasa.jpf;

/**
 * listener for gov.nasa.jpf.Config changes. Implementors
 * can register themselves upon initialization, to react to
 * downstream changes even if they cache or process Config
 * settings for increased performance.
 * 
 * the notification is per-key
 */
public interface ConfigChangeListener {

  /**
   * a JPF property was changed during runtime (e.g. by using the Verify API
   * or encountering annotations)
   */
  void propertyChanged (Config conf, String key, String oldValue, String newValue);
  
  /**
   *  this can be used to let a config listener remove itself, which is
   *  required if the same Config object is used for several JPF runs
   */
  void jpfRunTerminated (Config conf);
}
