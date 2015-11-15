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

import gov.nasa.jpf.SystemAttribute;

/**
 * auxiliary class that captures the main entry and classloader context
 * of applications
 */
public class ApplicationContext implements SystemAttribute {

  final int id;
  final String mainClassName;
  final String mainEntry;
  final String[] args;
  final String host;
  
  final SystemClassLoaderInfo sysCl;
  MethodInfo miEntry;
  
  FinalizerThreadInfo finalizerThread;
  
  ApplicationContext (int id, String mainClassName, String mainEntry, String[] args, String host, SystemClassLoaderInfo sysCl){
    this.id = id;
    this.mainClassName = mainClassName;
    this.mainEntry = mainEntry;
    this.args = args;
    this.host = host;
    this.sysCl = sysCl;
  }
  
  void setEntryMethod (MethodInfo miEntry){
    this.miEntry = miEntry;
  }
  
  MethodInfo getEntryMethod(){
    return miEntry;
  }
  
  public int getId(){
    return id;
  }
  
  public String getMainClassName(){
    return mainClassName;
  }
  
  public String getHost() {
    return host;
  }
  
  public SystemClassLoaderInfo getSystemClassLoader(){
    return sysCl;
  }
  
  public FinalizerThreadInfo getFinalizerThread() {
    return finalizerThread;
  }
  
  public void setFinalizerThread(ThreadInfo ti) {
    finalizerThread = (FinalizerThreadInfo)ti;
  }
  
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("ApplicationContext {mainClassName=");
    sb.append(mainClassName);
    sb.append(",mainEntry=");
    sb.append(mainEntry);
    sb.append(",host=");
    sb.append(host);
    
    sb.append(",args=[");
    for (int i=0; i<args.length; i++){
      if (i>0) sb.append(',');
      sb.append(args[i]);
    }
    sb.append("], miMain=");
    if (miEntry != null){
      sb.append(miEntry.getFullName());
    } else {
      sb.append("null");
    }
    sb.append('}');
    
    return sb.toString();
  }
}
