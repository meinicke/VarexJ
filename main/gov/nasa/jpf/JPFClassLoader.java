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

package gov.nasa.jpf;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * classloader that is used by Config to instantiate from JPF configured
 * paths. This is a standard parent-first loader to avoid multiple class
 * instances when using our Run*.jar tools
 *
 * The main reason for having our own classloader is dynamically configured resource
 * and library lookup
 */
public class JPFClassLoader extends URLClassLoader {

  String[] nativeLibs;


  static {
    //ClassLoader.registerAsParallelCapable(); // for jdk7
  }
  
  public JPFClassLoader (URL[] urls){
    super(urls);
  }

  public JPFClassLoader (URL[] urls, String[] libs, ClassLoader parent){
    super(urls, parent);

    nativeLibs = libs;
  }

  protected String findLibrary (String libBaseName){

    if (nativeLibs != null){
      String libName = File.separator + System.mapLibraryName(libBaseName);

      for (String libPath : nativeLibs) {
        if (libPath.endsWith(libName)) {
          return libPath;
        }
      }
    }

    return null; // means VM uses java.library.path to look it up
  }

  /**
   * we make it public since we add paths dynamically during JPF init
   * 
   * Note this is ignored according to the javadocs if the provided url is already in the classpath.
   * We do rely on this feature since me might add jpf.jar several times during bootstrap
   */
  public void addURL (URL url){
    if (url != null){
      super.addURL(url);
    }
  }
  
  public void setNativeLibs (String[] libs){
    nativeLibs = libs;
  }
}
