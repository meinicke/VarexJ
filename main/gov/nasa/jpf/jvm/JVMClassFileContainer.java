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

package gov.nasa.jpf.jvm;

import gov.nasa.jpf.vm.AnnotationInfo;
import gov.nasa.jpf.vm.ClassFileContainer;
import gov.nasa.jpf.vm.ClassFileMatch;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ClassParseException;

/**
 * ClassFileContainer that holds Java classfiles
 */
public abstract class JVMClassFileContainer extends ClassFileContainer {
  
  // the VM and container type specific info we need to instantiate a ClassInfo from this container
  public class JVMClassFileMatch extends ClassFileMatch {
    byte[] data;
    
    JVMClassFileMatch (String typeName, String url, byte[] data) {
      super(typeName, url);
      
      this.data = data;
    }
    
    @Override
    public ClassFileContainer getContainer(){
      return JVMClassFileContainer.this;
    }
    
    public byte[] getData(){
      return data;
    }
    
    @Override
    public JVMClassInfo createClassInfo (ClassLoaderInfo loader) throws ClassParseException {
      JVMSystemClassLoaderInfo sysCli = (JVMSystemClassLoaderInfo)loader.getSystemClassLoader();
      
      JVMCodeBuilder cb = sysCli.getCodeBuilder(typeName);
      ClassFile cf = new ClassFile(data);
      
      return new JVMClassInfo( typeName, loader, cf, url, cb);
    }
    
    @Override
    public AnnotationInfo createAnnotationInfo (ClassLoaderInfo loader) throws ClassParseException {
    ClassFile cf = new ClassFile(data);
    JVMAnnotationParser parser = new JVMAnnotationParser(cf);

    return new AnnotationInfo(typeName, loader, parser);
    }
  }
  
  protected JVMClassFileContainer (String name, String url) {
    super(name, url);
  }
  
  @Override
  public String getClassURL (String typeName){
    return getURL() + typeName.replace('.', '/') + ".class";
  }

}
