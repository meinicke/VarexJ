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

package gov.nasa.jpf.vm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPFConfigException;
import gov.nasa.jpf.JPFException;

/**
 * a JenkinsStateSet that stores program state information in a readable
 * and diffable format.
 * 
 * Storing states as readable text is enabled by setting vm.storage.class to this class
 * 
 * Note: this automatically sets/overrides the serializer to Debug<serializer-class>
 */
public class DebugJenkinsStateSet extends JenkinsStateSet {

  static final String LOGFILE = "state";
  
  File outputDir;
  File outputFile;
  
  public DebugJenkinsStateSet (Config conf){
    String serializerCls = conf.getString("vm.serializer.class");
    if (serializerCls != null){
      int idx = serializerCls.lastIndexOf('.') + 1;
      String cname = serializerCls.substring(idx);
      
      if (!cname.startsWith("Debug")){
        if (idx > 0){
          serializerCls = serializerCls.substring(0,idx) + "Debug" + cname;
        } else {
          serializerCls = "Debug" + cname;
        }
      }
      
      serializer = conf.getInstance(null, serializerCls, DebugStateSerializer.class);
      if (serializer == null){
        throw new JPFConfigException("Debug StateSet cannot instantiate serializer: " + serializerCls);
      }
    }
    
    String path = conf.getString("vm.serializer.output", "tmp");
    outputDir = new File(path);
    if (!outputDir.isDirectory()){
      if (!outputDir.mkdirs()){
        throw new JPFConfigException("Debug StateSet cannot create output dir: " + outputDir.getAbsolutePath());        
      }
    }
    
    outputFile = new File( outputDir, LOGFILE);
  }
  
  @Override
  public void attach(VM vm){
    // we use our own serializer
    vm.setSerializer( serializer);
    
    // <2do> this is a bit hack'ish - why does the VM keep the serializer anyways,
    // if it is only used here
    super.attach(vm);
  }
  
  @Override
  public int addCurrent () {
    int maxId = lastStateId;
    FileOutputStream fos = null;
    
    try {
      fos = new FileOutputStream( outputFile);
    } catch (FileNotFoundException fnfx){
      throw new JPFException("cannot create Debug state set output file: " + outputFile.getAbsolutePath());
    }
    
    ((DebugStateSerializer)serializer).setOutputStream(fos);
    
    int stateId = super.addCurrent();
    
    try {
      fos.flush();
      fos.close();
    } catch (IOException iox){
      throw new JPFException("cannot write Debug state set output file: " + outputFile.getAbsolutePath());      
    }
    
    // if this is a new state, store it under its id, otherwise throw it away
    if (stateId > maxId){
      String fname = "state." + stateId;
      outputFile.renameTo( new File(outputDir, fname));
    } else {
      if (outputFile.isFile()){
        outputFile.delete();
      }
    }
    
    return stateId;
  }
}
