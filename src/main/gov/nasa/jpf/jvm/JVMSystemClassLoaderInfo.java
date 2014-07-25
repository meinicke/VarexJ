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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.JPFLogger;
import gov.nasa.jpf.vm.ClassFileContainer;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ClassParseException;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.SystemClassLoaderInfo;
import gov.nasa.jpf.vm.VM;

import java.io.File;
import java.io.IOException;

/**
 * a SystemClassLoaderInfo that reads standard Java classfiles from *.class and *.jar files, and creates code using a concrete
 * value JVM instruction set
 */
public class JVMSystemClassLoaderInfo extends SystemClassLoaderInfo {

  static JPFLogger log = JPF.getLogger("class");
  protected JVMCodeBuilder defaultCodeBuilder;

  public JVMSystemClassLoaderInfo (VM vm, int appId) {
    super(vm, appId);

    defaultCodeBuilder = createDefaultCodeBuilder(config, appId);

    // now we can notify
    vm.registerClassLoader(this);
  }

  /**
   * override this if you need a different default CodeBuilder
   */
  protected JVMCodeBuilder createDefaultCodeBuilder (Config config, int appId) {
    String key = config.getIndexableKey("jvm.insn_factory.class", appId);
    JVMInstructionFactory insnFactory = config.getEssentialInstance(key, JVMInstructionFactory.class);
    return new JVMCodeBuilder(insnFactory);
  }

  @Override
  protected ClassFileContainer createClassFileContainer (String spec) {
    int i = spec.indexOf(".jar");
    if (i > 0) {
      // its a jar
      int j = i + 4;
      int len = spec.length();
      String jarPath;
      String pathPrefix = null;
      File jarFile;
      if (j == len) {
        // no path prefix, plain jar
        jarPath = spec;
      } else {
        if (spec.charAt(j) == '/') {
          pathPrefix = spec.substring(j);
          jarPath = spec.substring(0, j);
        } else {
          return null;
        }
      }
      jarFile = new File(jarPath);
      if (jarFile.isFile()) {
        try {
          return new JarClassFileContainer(jarFile, pathPrefix);
        } catch (IOException ix) {
          return null;
        }
      } else {
        return null;
      }

    } else {
      // a dir
      File dir = new File(spec);
      if (dir.isDirectory()) {
        return new DirClassFileContainer(dir);
      } else {
        return null;
      }
    }
  }

  protected void addSystemBootClassPath () {
    String v = System.getProperty("sun.boot.class.path");
    if (v != null) {
      for (String pn : v.split(File.pathSeparator)) {
        if (pn != null && !pn.isEmpty()) {
          ClassFileContainer cfc = createClassFileContainer(pn);
          if (cfc != null) {
            cp.addClassFileContainer(cfc);
          }
        }
      }
    } else {
      // Hmm, maybe we are not executing on OpenJDK
    }
  }

  /**
   * this is the main method to create the ClassPath, which is called from the ctor
   */
  @Override
  protected void initializeSystemClassPath (VM vm, int appId) {
    Config conf = vm.getConfig();
    File[] pathElements;

    // explicit "classpath[.id]" settings have precedence
    pathElements = getPathElements(conf, "classpath", appId);
    if (pathElements != null) {
      for (File f : pathElements) {
        addClassPathElement(f.getAbsolutePath());
      }
    }

    // we optionally append boot_classpath
    pathElements = getPathElements(conf, "vm.boot_classpath", appId);
    if (pathElements != null) {
      for (File f : pathElements) {
        if (f.getName().equals("<system>")) {
          addSystemBootClassPath();
        } else {
          addClassPathElement( f.getAbsolutePath());
        }
      }
    }

    log.info("collected system classpath: ", cp);
  }

  /**
   * override this if you have different CodeBuilders for different types
   * NOTE - this CodeBuilder is not completely initialized yet, clients still have to call startMethod(mi) on it
   */
  protected JVMCodeBuilder getCodeBuilder (String clsName) {
    return defaultCodeBuilder;
  }

  /**
   * used for automatically created code such as AnnotationProxies, direct calls, native calls and run starts
   * NOTE - this cannot be called recursively or concurrently
   */
  protected JVMCodeBuilder getSystemCodeBuilder (ClassFile cf, MethodInfo mi) {
    defaultCodeBuilder.reset(cf, mi);
    return defaultCodeBuilder;
  }
  
  @Override
  protected ClassInfo createClassInfo (String clsName, String url, byte[] data, ClassLoaderInfo definingLoader) throws ClassParseException {
    ClassFile cf = new ClassFile(data);
    JVMCodeBuilder cb = getCodeBuilder(clsName);
    
    return new JVMClassInfo(null, clsName, definingLoader, cf, url, cb);
  }
}
