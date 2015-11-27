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

package gov.nasa.jpf;

/**
 * this class wraps the various exceptions we might encounter during
 * initialization and use of Config
 */
public class JPFConfigException extends JPFException {

  public JPFConfigException(String msg) {
    super(msg);
  }

  public JPFConfigException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public JPFConfigException(String key, Class<?> cls, String failure) {
    super("error instantiating class " + cls.getName() + " for entry \"" + key + "\":" + failure);
  }

  public JPFConfigException(String key, Class<?> cls, String failure, Throwable cause) {
    this(key, cls, failure);
    initCause(cause);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("JPF configuration error: ");
    sb.append(getMessage());

    return sb.toString();
  }
}
