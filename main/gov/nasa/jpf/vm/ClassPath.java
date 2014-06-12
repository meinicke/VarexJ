//
// Copyright (C) 2010 United States Government as represented by the
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

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.JPFLogger;

import java.io.File;
import java.util.ArrayList;

/**
 * this is a lookup mechanism for class files that is based on an ordered
 * list of directory or jar entries
 */
public class ClassPath implements Restorable<ClassPath>{

  static class CPMemento implements Memento<ClassPath> {
    ClassPath cp;
    ArrayList<ClassFileContainer> pathElements;

    CPMemento (ClassPath cp){
      this.cp = cp;
      this.pathElements = new ArrayList<ClassFileContainer>(cp.pathElements);
    }

    @Override
    public ClassPath restore (ClassPath ignored) {
      cp.pathElements = this.pathElements;
      return cp;
    }
  }

  
  static JPFLogger logger = JPF.getLogger("gov.nasa.jpf.jvm.classfile");
  
  protected ArrayList<ClassFileContainer> pathElements;


  public ClassPath(){
    pathElements = new ArrayList<ClassFileContainer>();
  }
  
  public Memento<ClassPath> getMemento (MementoFactory factory) {
    return factory.getMemento(this);
  }

  public Memento<ClassPath> getMemento(){
    return new CPMemento(this);
  }

  public void addClassFileContainer (ClassFileContainer pathElement){
    assert pathElement != null;
    pathElements.add(pathElement);
  }


  public String[] getPathNames(){
    String[] pn = new String[pathElements.size()];

    for (int i=0; i<pn.length; i++){
      pn[i] = pathElements.get(i).getName();
    }

    return pn;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    int len = pathElements.size();
    int i=0;

    for (ClassFileContainer e : pathElements){
      sb.append(e.getName());
      if (++i < len){
        sb.append(File.pathSeparator);
      }
    }
    return sb.toString();
  }

  protected static void error(String msg) throws ClassParseException {
    throw new ClassParseException(msg);
  }

  public ClassFileMatch findMatch (String clsName) throws ClassParseException {
    for (ClassFileContainer container : pathElements){
      ClassFileMatch match = container.getMatch(clsName);
      if (match != null){
        logger.fine("found ", clsName, " in ", container.getName());
        return match;
      }
    }

    return null;    
  }

}