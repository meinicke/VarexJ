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

import gov.nasa.jpf.util.FileUtils;
import gov.nasa.jpf.vm.ClassFileMatch;
import gov.nasa.jpf.vm.ClassParseException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * a ClassFileContainer that loads classes from jar files
 */
public class JarClassFileContainer extends JVMClassFileContainer {
  protected JarFile jar;
  protected String pathPrefix; // optional

  static String getContainerUrl (File file){
    try {
      return "jar:" + file.toURI().toURL().toString() + "!/";
    } catch (MalformedURLException x) {
      return "jar:" + file.getAbsolutePath() + "!/";
    }
  }

  public JarClassFileContainer (File file) throws IOException {
    super(file.getPath(), getContainerUrl(file));
    jar = new JarFile(file);
  }

  public JarClassFileContainer (File file, String pathPrefix) throws IOException {
    super(getPath(file, pathPrefix), getContainerUrl(file));

    jar = new JarFile(file);
    this.pathPrefix = getNormalizedPathPrefix(pathPrefix);
  }
  
  /**
   * make sure the return value ends with '/', and does NOT start with '/'. If
   * the supplied pathPrefix only contains '/' or an empty string, return null
   */
  static String getNormalizedPathPrefix(String pathPrefix){
    if (pathPrefix != null){
      int len = pathPrefix.length();
      if (len > 0){
        if (pathPrefix.charAt(0) == '/'){
          if (len == 1){
            return null; // no need for storing a single '/' prefix
          } else {
            pathPrefix = pathPrefix.substring(1); // skip the heading '/'
            len--;
          }
        }
        
        if (pathPrefix.charAt(len-1) != '/'){
          pathPrefix += '/';
        }
        
        return pathPrefix;
        
      } else {
        return null; // empty prefix
      }
    } else {
      return null; // null prefix
    }
  }

  /**
   * return our string representation of the complete spec, which is
   * 
   *   <jar-pathname>/pathPrefix
   */
  static String getPath(File file, String pathPrefix){
    String pn = file.getPath();
   
    if (pathPrefix != null){
      int len = pathPrefix.length();
      if (len > 0){
        if (pathPrefix.charAt(0) == '/'){
          if (len == 1){
            return pn; // no need to store a single '/'
          }
        } else {
          pn += '/';
        }
        
        pn += pathPrefix;
      }
    }
    
    return pn;
  }
    
  @Override
  public ClassFileMatch getMatch(String clsName) throws ClassParseException {
    String pn = clsName.replace('.', '/') + ".class";
    
    if (pathPrefix != null){
      pn = pathPrefix + pn;
    }
    
    JarEntry e = jar.getJarEntry(pn);

    if (e != null) {
      InputStream is = null;
      try {
        long len = e.getSize();
        if (len > Integer.MAX_VALUE) {
          error("classfile too big: " + e.getName());
        }

        is = jar.getInputStream(e);

        byte[] data = new byte[(int) len];
        FileUtils.getContents(is, data);

        return new JVMClassFileMatch(clsName, getClassURL(clsName), data);

      } catch (IOException iox) {
        error("error reading jar entry " + e.getName());

      } finally {
        if (is != null) {
          try {
            is.close();
          } catch (IOException iox) {
            error("cannot close input stream for file " + e.getName());
          }
        }
      }
    }

    return null;
  }

}
