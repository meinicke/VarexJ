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

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * intercept and forward some of the filesystem access methods. This is very
 * slow, if a program uses this heavily we should keep the forwarding File
 * object around and modify the model class accordingly
 */
public class JPF_java_io_File extends NativePeer {

  static File getFile(MJIEnv env, int objref, FeatureExpr ctx) {
    int fnref = env.getReferenceField(ctx, objref, "path").getValue();
    String fname = env.getStringObject(ctx, fnref);
    return new File(fname);
  }

  static int createJPFFile(MJIEnv env, File file, FeatureExpr ctx) {
	int newFileRef = env.newObject(ctx, "java.io.File");
    ElementInfo fileEI = env.getModifiableElementInfo(newFileRef);

    int fileNameRef = env.newString(ctx, file.getPath());
    fileEI.setReferenceField(ctx, "path", new One<>(fileNameRef));

    return newFileRef;
  }

  @MJI
  public int getParentFile____Ljava_io_File_2(MJIEnv env, int objref, FeatureExpr ctx) {
    File thisFile = getFile(env, objref, ctx);
    File parent = thisFile.getParentFile();

    return createJPFFile(env, parent, ctx);
  }
  
  @MJI
  public int getAbsolutePath____Ljava_lang_String_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    String pn = getFile(env,objref, ctx).getAbsolutePath();
    return env.newString(ctx, pn);
  }

  @MJI
  public int getAbsoluteFile____Ljava_io_File_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    File absoluteFile = getFile(env, objref, ctx).getAbsoluteFile();
    return createJPFFile(env, absoluteFile, ctx);
  }

  @MJI
  public int getCanonicalPath____Ljava_lang_String_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    try {
      String pn = getFile(env,objref, ctx).getCanonicalPath();
      return env.newString(ctx, pn);
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int getCanonicalFile____Ljava_io_File_2(MJIEnv env, int objref, FeatureExpr ctx) {
    try {
      File file = getFile(env, objref, ctx);
      File canonicalFile = file.getCanonicalFile();
      return createJPFFile(env, canonicalFile, ctx);
    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
      return MJIEnv.NULL;
    }
  }
  
  // internal helper
  @SuppressWarnings("deprecation")
  @MJI
  public int getURLSpec____Ljava_lang_String_2 (MJIEnv env, int objref, FeatureExpr ctx){
    try {
      File f = getFile(env,objref, ctx);
      URL url = f.toURL();
      return env.newString(ctx, url.toString());
    } catch (MalformedURLException mfux) {
      env.throwException(ctx, "java.net.MalformedURLException", mfux.getMessage());
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int getURISpec____Ljava_lang_String_2 (MJIEnv env, int objref, FeatureExpr ctx){
    File f = getFile(env, objref, ctx);
    URI uri = f.toURI();
    return env.newString(ctx, uri.toString());
  }

  @MJI
  public boolean isAbsolute____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env, objref, ctx).isAbsolute();
  }

  @MJI
  public boolean isDirectory____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).isDirectory();
  }

  @MJI
  public boolean isFile____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).isFile();
  }
  
  @MJI
  public boolean delete____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).delete();
  }
  
  @MJI
  public long length____J (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).length();
  }
  
  @MJI
  public boolean canRead____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).canRead();
  }

  @MJI
  public boolean canWrite____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).canWrite();
  }

  @MJI
  public boolean exists____Z (MJIEnv env, int objref, FeatureExpr ctx) {
    return getFile(env,objref, ctx).exists();
  }

  @MJI
  public boolean createNewFile____Z(MJIEnv env, int objref, FeatureExpr ctx) {
    File fileToCreate = getFile(env, objref, ctx);
    try {
      return fileToCreate.createNewFile();

    } catch (IOException iox) {
      env.throwException(ctx, "java.io.IOException", iox.getMessage());
      return false;
    }
  }

  @MJI
  public int list_____3Ljava_lang_String_2(MJIEnv env, int objref, FeatureExpr ctx){
	  File f=getFile(env,objref, ctx);
    if (f.isDirectory()){
      String[] farr=f.list();
      return env.newStringArray(ctx, farr);
    } else {
      return MJIEnv.NULL;
    }
  }

  @MJI
  public int listRoots_____3Ljava_io_File_2(MJIEnv env, int classRef, FeatureExpr ctx) {
    File[] roots = File.listRoots();
    int rootResultRef = env.newObjectArray("java.io.File", roots.length);
    ElementInfo rootsEI = env.getModifiableElementInfo(rootResultRef);

    for (int i = 0; i < roots.length; i++) {
      int rootFileRef = createJPFFile(env, roots[i], ctx);
      rootsEI.setReferenceElement(ctx, i, new One<>(rootFileRef));
    }

    return rootResultRef;
  }
  // <2do> ..and lots more
}
