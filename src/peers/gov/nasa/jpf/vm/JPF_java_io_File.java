//
// Copyright (C) 2006 United States Government as represented by the
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

import gov.nasa.jpf.annotation.MJI;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * intercept and forward some of the filesystem access methods. This is very
 * slow, if a program uses this heavily we should keep the forwarding File
 * object around and modify the model class accordingly
 */
public class JPF_java_io_File extends NativePeer {

  static File getFile(MJIEnv env, int objref) {
	  FeatureExpr ctx = NativeMethodInfo.CTX;
    int fnref = env.getReferenceField(ctx, objref, "filename").getValue();
    String fname = env.getStringObject(null, fnref);
    return new File(fname);
  }

  static int createJPFFile(MJIEnv env, File file) {
    FeatureExpr ctx = NativeMethodInfo.CTX;
	int newFileRef = env.newObject(ctx, "java.io.File");
    ElementInfo fileEI = env.getModifiableElementInfo(newFileRef);

    int fileNameRef = env.newString(ctx, file.getPath());
    fileEI.setReferenceField("filename", fileNameRef);

    return newFileRef;
  }

  @MJI
  public int getParentFile____Ljava_io_File_2(MJIEnv env, int objref) {
    File thisFile = getFile(env, objref);
    File parent = thisFile.getParentFile();

    return createJPFFile(env, parent);
  }
  
  @MJI
  public int getAbsolutePath____Ljava_lang_String_2 (MJIEnv env, int objref) {
    String pn = getFile(env,objref).getAbsolutePath();
    return env.newString(NativeMethodInfo.CTX, pn);
  }

  @MJI
  public int getAbsoluteFile____Ljava_io_File_2 (MJIEnv env, int objref) {
    File absoluteFile = getFile(env, objref).getAbsoluteFile();
    return createJPFFile(env, absoluteFile);
  }

  @MJI
  public int getCanonicalPath____Ljava_lang_String_2 (MJIEnv env, int objref) {
    try {
      String pn = getFile(env,objref).getCanonicalPath();
      return env.newString(NativeMethodInfo.CTX, pn);
    } catch (IOException iox) {
      env.throwException("java.io.IOException", iox.getMessage());
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int getCanonicalFile____Ljava_io_File_2(MJIEnv env, int objref) {
    try {
      File file = getFile(env, objref);
      File canonicalFile = file.getCanonicalFile();
      return createJPFFile(env, canonicalFile);
    } catch (IOException iox) {
      env.throwException("java.io.IOException", iox.getMessage());
      return MJIEnv.NULL;
    }
  }
  
  // internal helper
  @SuppressWarnings("deprecation")
  @MJI
  public int getURLSpec____Ljava_lang_String_2 (MJIEnv env, int objref){
    try {
      File f = getFile(env,objref);
      URL url = f.toURL();
      return env.newString(NativeMethodInfo.CTX, url.toString());
    } catch (MalformedURLException mfux) {
      env.throwException("java.net.MalformedURLException", mfux.getMessage());
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int getURISpec____Ljava_lang_String_2 (MJIEnv env, int objref){
    File f = getFile(env, objref);
    URI uri = f.toURI();
    return env.newString(NativeMethodInfo.CTX, uri.toString());
  }

  @MJI
  public boolean isAbsolute____Z (MJIEnv env, int objref) {
    return getFile(env, objref).isAbsolute();
  }

  @MJI
  public boolean isDirectory____Z (MJIEnv env, int objref) {
    return getFile(env,objref).isDirectory();
  }

  @MJI
  public boolean isFile____Z (MJIEnv env, int objref) {
    return getFile(env,objref).isFile();
  }
  
  @MJI
  public boolean delete____Z (MJIEnv env, int objref) {
    return getFile(env,objref).delete();
  }
  
  @MJI
  public long length____J (MJIEnv env, int objref) {
    return getFile(env,objref).length();
  }
  
  @MJI
  public boolean canRead____Z (MJIEnv env, int objref) {
    return getFile(env,objref).canRead();
  }

  @MJI
  public boolean canWrite____Z (MJIEnv env, int objref) {
    return getFile(env,objref).canWrite();
  }

  @MJI
  public boolean exists____Z (MJIEnv env, int objref) {
    return getFile(env,objref).exists();
  }

  @MJI
  public boolean createNewFile____Z(MJIEnv env, int objref) {
    File fileToCreate = getFile(env, objref);
    try {
      return fileToCreate.createNewFile();

    } catch (IOException iox) {
      env.throwException("java.io.IOException", iox.getMessage());
      return false;
    }
  }

  @MJI
  public int list_____3Ljava_lang_String_2(MJIEnv env, int objref){
	  File f=getFile(env,objref);
    if (f.isDirectory()){
      String[] farr=f.list();
      return env.newStringArray(farr);
    } else {
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int listRoots_____3Ljava_io_File_2(MJIEnv env, int classRef) {
    File[] roots = File.listRoots();
    int rootResultRef = env.newObjectArray("java.io.File", roots.length);
    ElementInfo rootsEI = env.getModifiableElementInfo(rootResultRef);

    for (int i = 0; i < roots.length; i++) {
      int rootFileRef = createJPFFile(env, roots[i]);
      rootsEI.setReferenceElement(i, rootFileRef);
    }

    return rootResultRef;
  }
  // <2do> ..and lots more
}
