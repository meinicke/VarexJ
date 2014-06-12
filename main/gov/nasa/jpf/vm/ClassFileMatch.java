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

package gov.nasa.jpf.vm;

/**
 * a lookup match for a given typename in a ClassFileContainer
 */
public abstract class ClassFileMatch {
  public final String typeName;
  public final String url;

  protected ClassFileMatch (String typeName, String url) {
    this.typeName = typeName;
    this.url = url;
  }
  
  public String getClassURL () {
    return url;
  }  
  
  public abstract ClassFileContainer getContainer();

  // those are here because VM specific subclasses know about the binary format, how to get the data from the
  // respective container, and what parser to use to transform it
  public abstract ClassInfo createClassInfo (ClassLoaderInfo loader) throws ClassParseException;
  public abstract AnnotationInfo createAnnotationInfo (ClassLoaderInfo loader) throws ClassParseException;
  
}
