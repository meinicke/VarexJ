/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

package nhandler.peerGen;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativeMethodInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.util.HashMap;

import org.apache.bcel.Constants;
import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.util.BCELifier;

/**
 * Creates native peers classes on-the-fly using the Byte Code Engineering
 * Library (BCEL)
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class PeerClassGen implements Constants {

  /**
   * Keeps the list of all PeerClassCreator objects to avoid recreating them
   */
  private static HashMap<String, PeerClassGen> Peers = new HashMap<String, PeerClassGen>();

  protected InstructionFactory _factory;

  protected ConstantPoolGen _cp;

  protected ClassGen _cg;

  protected PeerSourceGen sourceGen;

  public static String MJIEnvCls = "gov.nasa.jpf.vm.MJIEnv";

  /*
  * Adaptation to VarexJ
  */
  public static String FeatureExprCls = "de.fosd.typechef.featureexpr.FeatureExpr";

  /**
   * Directory that is used to keep native peers that are created on-the-fly
   */
  protected static String peersLocation = "";

  private static boolean initialized = false;

  /**
   * To distinguish the on-the-fly native peers from the rest, this prefixed is
   * added to the name of these classes.
   */
  private static final String prefix = "OTF_";

  /**
   * Stores the native peer class.
   */
  private Class<?> peer;

  /**
   * The complete path of the class.
   */
  private String path;

  private MJIEnv env;

  private static void init(Config config) {
    if(!initialized) {
      peersLocation = config.getPath("jpf-nhandler") + "/onthefly/";
      PeerSourceGen.genSource = config.getBoolean("nhandler.genSource");
      PeerSourceGen.addComment = config.getBoolean("nhandler.addComment");
      PeerMethodGen.updateJPFState = config.getBoolean("nhandler.updateJPFState", true);
    }
  }

  /**
   * Creates a new instance of PeerClassCreator.
   * 
   * @param ci
   *          a class that its native peer is going to be created
 * @throws IOException 
   */
  private PeerClassGen (ClassInfo ci, MJIEnv env) throws IOException {
    String className = ci.getName();
    this.env = env;
    String peerName = PeerClassGen.getNativePeerClsName(className);
    this.path = PeerClassGen.peersLocation + peerName + ".class";

    try{
      this.peer = this.loadClass(peerName);
      _cg = new ClassGen(Repository.lookupClass(this.loadClass(peerName)));
    } catch (ClassNotFoundException e){
      // do nothing!
    }

    if (this.peer == null){
      _cg = new ClassGen(peerName, "gov.nasa.jpf.vm.NativePeer", peerName + ".class", Constants.ACC_PUBLIC, new String[] {});
      _cg.addEmptyConstructor(Constants.ACC_PUBLIC);
    }

    _cp = _cg.getConstantPool();
    _factory = new InstructionFactory(_cg, _cp);

    // if (!NativePeer.peers.containsKey(className))
    // _cg.addEmptyConstructor(Constants.ACC_PUBLIC);

    PeerClassGen.Peers.put(className, this);
    
    if(PeerSourceGen.genSource) {
      sourceGen = new PeerSourceGen(peerName);
    }
  }

  /**
   * Returns a PeerClassCreator object corresponding to the given class. If the
   * PeerClassCreator object has been already created, it is returned. OW a new
   * one is created.
   * 
   * @param ci
   *          a JPF class
   * 
   * @return a PeerClassCreator object corresponding to the given class
   */
  public static PeerClassGen getPeerCreator (ClassInfo ci, MJIEnv env){
    String className = ci.getName();
    PeerClassGen peerCreator = null;

    // find a better place to initialize this!
    init(env.getConfig());

    if (PeerClassGen.Peers.containsKey(className)){
      peerCreator = PeerClassGen.Peers.get(className);
    } else {
      try {
		peerCreator = new PeerClassGen(ci, env);
	  } catch (IOException e) {
		e.printStackTrace();
	  }
    }
    return peerCreator;
  }

  /**
   * Returns a method of the peer class, if any, that corresponds to the given
   * NativeMethodInfo object. Null will be returned if such a method does not
   * exist.
   * 
   * @param mi
   *          an object that represents a native method in JPF
   * 
   * @return a method of the peer class that corresponds to the given
   *         NativeMethodInfo object
   */
  private Method getExistingMethod (NativeMethodInfo mi){
    if (this.peer != null){
      for (Method nm : this.peer.getMethods()){
        if (nm.getName().equals(PeerMethodGen.getJNIName(mi))) {
          return nm;
        }
      }
    }
    return null;
  }

  /**
   * Creates a Method object corresponding to the given NativeMethodInfo object
   * within the native peer class.
   * 
   * @param mi
   *          an object that represents a native method in JPF
   * 
   * @return a Method object corresponding to the given NativeMethodInfo object
   */
  public Method createMethod (NativeMethodInfo mi){
    Method method = this.getExistingMethod(mi);
    if (method != null) {
      return method;
    }

    PeerMethodGen nmthCreator = new PeerMethodGen(mi, env, this, sourceGen);
    nmthCreator.create();

		try {
			final File file = new File(this.path);
			if (!file.exists()) {
				Files.createDirectories(file.getParentFile().toPath());
				System.out.println("Create Peer File  " + file);
				file.createNewFile();
			}
			try (OutputStream out = new FileOutputStream(this.path)) {
				this._cg.getJavaClass().dump(out);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

    Class<?> peerClass = null;
    try{
      peerClass = this.loadClass(this._cg.getClassName());
    } catch (ClassNotFoundException e1){
      e1.printStackTrace();
    }
    this.peer = peerClass;
    method = this.getExistingMethod(mi);

    return method;
  }

  /**
   * Creates a Method object with empty body corresponding to the given 
   * NativeMethodInfo object within the native peer class.
   * 
   * @param mi
   *          an object that represents a native method in JPF
   * 
   * @return a Method object corresponding to the given NativeMethodInfo object
   */
  public Method createEmptyMethod (NativeMethodInfo mi){
    Method method = this.getExistingMethod(mi);
    if (method != null) {
      return method;
    }

    PeerMethodGen nmthCreator = new PeerMethodGen(mi, env, this, sourceGen);
    nmthCreator.createEmpty();

    OutputStream out;
    try{
      out = new FileOutputStream(this.path);
      this._cg.getJavaClass().dump(out);
      out.close();
    } catch (FileNotFoundException e){
      e.printStackTrace();
    } catch (IOException e){
      e.printStackTrace();
    }

    Class<?> peerClass = null;
    try{
      peerClass = this.loadClass(this._cg.getClassName());
    } catch (ClassNotFoundException e1){
      e1.printStackTrace();
    }
    this.peer = peerClass;
    method = this.getExistingMethod(mi);

    return method;
  }

  /**
   * Loads an on-the-fly native peer class with the given name.
   * 
   * @param className
   *          name of a class to be loaded
   * @return the on-the-fly native peer class with the given name
   * 
   * @throws ClassNotFoundException
   *           when no definition for the class with the given name could be
   *           found
   */
  private Class<?> loadClass (String className) throws ClassNotFoundException{
    Class<?> cls = null;
    URL[] urls = null;

    File otf_dir = new File(PeerClassGen.peersLocation);

    URL url = null;
    try{
      url = otf_dir.toURI().toURL();
    } catch (MalformedURLException e){
      e.printStackTrace();
    }
    urls = new URL[] { url };

	URLClassLoader cl = new URLClassLoader(urls, env.getConfig().getClassLoader());
    cls = cl.loadClass(className);
    return cls;
  }

  /**
   * Creates a name for on-the-fly native peers which is prefix "OTF_" followed
   * by the name of the regular native peer class
   * 
   * @param className
   *          a name of the class used to create the on-the-fly native peer name
   * 
   * @return a name for the on-the-fly native peer
   */
  protected static String getNativePeerClsName (String className){
    return (PeerClassGen.prefix + "JPF_" + className.replace('.', '_'));
  }

  /**
   * Returns the native peer class.
   * 
   * @return the native peer class
   */
  public Class<?> getPeer (){
    return this.peer;
  }

  public static void main (String[] args) throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    JavaClass clazz = null;

    try{
      clazz = Repository.lookupClass("nhandler.peerGen.Test1");
    } catch (ClassNotFoundException e){
      e.printStackTrace();
    }

    BCELifier test = new BCELifier(clazz, System.out);

    test.start();
  }
}
