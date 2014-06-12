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

import gov.nasa.jpf.jvm.JVMClassFileContainer;
import gov.nasa.jpf.util.FileUtils;
import gov.nasa.jpf.vm.ClassFileMatch;
import gov.nasa.jpf.vm.ClassParseException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 */
public class DirClassFileContainer extends JVMClassFileContainer {

  protected File dir;

  static String getContainerURL(File dir){
    try {
      return dir.toURI().toURL().toString();
    } catch (MalformedURLException e) {
      return dir.getPath();
    }
  }

  public DirClassFileContainer(File dir) {
    super(dir.getPath(), getContainerURL(dir));

    this.dir = dir;
  }

  @Override
  public ClassFileMatch getMatch(String clsName) throws ClassParseException {
    String pn = clsName.replace('.', File.separatorChar) + ".class";
    File f = new File(dir, pn);

    if (f.isFile()) {
      FileInputStream fis = null;

      try {
        fis = new FileInputStream(f);
        long len = f.length();
        if (len > Integer.MAX_VALUE) {
          error("classfile too big: " + f.getPath());
        }
        byte[] data = new byte[(int) len];
        FileUtils.getContents(fis, data);

        return new JVMClassFileMatch( clsName, getClassURL(clsName), data);

      } catch (IOException iox) {
        error("cannot read " + f.getPath());

      } finally {
        if (fis != null) {
          try {
            fis.close();
          } catch (IOException iox) {
            error("cannot close input stream for file " + f.getPath());
          }
        }
      }
    }

    return null;
  }
}
