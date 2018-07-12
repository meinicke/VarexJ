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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import cmu.conditional.Conditional;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.JPFLogger;


/**
 * native peer classes are part of MJI and contain the code that is
 * executed by the host VM (i.e. outside the state-tracked JPF VM). Each
 * class executed by JPF that has native mehods must have a native peer class
 * (which is looked up and associated at class loadtime)
 */
public class NativePeer implements Cloneable {

  static final String MODEL_PACKAGE = "<model>";
  static final String DEFAULT_PACKAGE = "<default>";

  static JPFLogger logger = JPF.getLogger("class");

  static ClassLoader loader;
  static HashMap<ClassInfo, NativePeer> peers;
  static Config config;
  static boolean noOrphanMethods;

  static String[] peerPackages;

  ClassInfo ci;
  Class<?> peerClass;
  HashMap<String, Method> methods;


  public static boolean init (Config conf) {
    loader = conf.getClassLoader();
    peers = new HashMap<>();

    peerPackages = getPeerPackages(conf);

    config = conf;
    noOrphanMethods = conf.getBoolean("vm.no_orphan_methods", false);

    return true;
  }

  static String[] getPeerPackages (Config conf) {
    String[] defPeerPackages = { MODEL_PACKAGE, "gov.nasa.jpf.vm", DEFAULT_PACKAGE };
    String[] packages = conf.getStringArray("peer_packages", defPeerPackages);

    // internalize
    for (int i=0; i<packages.length; i++) {
      if (packages[i].equals(MODEL_PACKAGE)) {
        packages[i] = MODEL_PACKAGE;
      } else if (packages[i].equals(DEFAULT_PACKAGE)) {
        packages[i] = DEFAULT_PACKAGE;
      }
    }

    return packages;
  }

  static Class<?> locatePeerCls (String clsName) {
    String cn = "JPF_" + clsName.replace('.', '_');

    for (int i=0; i<peerPackages.length; i++) {
      String pcn;
      String pkg = peerPackages[i];

      if (pkg == MODEL_PACKAGE) {
        int j = clsName.lastIndexOf('.');
        pcn = clsName.substring(0, j+1) + cn;
      } else if (pkg == DEFAULT_PACKAGE) {
        pcn = cn;
      } else {
        pcn = pkg + '.' + cn;
      }
     
      try {
        Class<?> peerCls = loader.loadClass(pcn);
        
        if ((peerCls.getModifiers() & Modifier.PUBLIC) == 0) {
        	if (!pcn.contains("$")) {// avoid warning for inner classes
        		logger.warning("non-public peer class: ", pcn);
        	}
          
          continue; // pointless to use this one, it would just create IllegalAccessExceptions
        }
        
        logger.info("loaded peer class: ", pcn);
        
        return peerCls;
      } catch (ClassNotFoundException cnfx) {
        // try next one
      }
    }

    return null; // nothing found
  }

  /**
   * this becomes the factory method to load either a plain (slow)
   * reflection-based peer (a NativePeer object), or some speed optimized
   * derived class object.
   * Watch out - this gets called before the ClassInfo is fully initialized
   * (we shouldn't rely on more than just its name here)
   */
  static NativePeer getNativePeer (ClassInfo ci) {
    String     clsName = ci.getName();
    NativePeer peer = peers.get(ci);
    Class<?>      peerCls = null;

    if (peer == null) {
      peerCls = locatePeerCls(clsName);

      if (peerCls != null) {
        initializePeerClass( peerCls);
                
        if (logger.isLoggable(Level.INFO)) {
          logger.info("load peer: ", peerCls.getName());
        }

        peer = getInstance(peerCls, NativePeer.class);
        peer.initialize(peerCls, ci, true);

        peers.put(ci, peer);
      }
    }

    return peer;
  }

  public static <T> T getInstance(Class<?> cls, Class<T> type) throws JPFException {
    Class<?>[] argTypes = Config.CONFIG_ARGTYPES;
    Object[] args = config.CONFIG_ARGS;

    return getInstance(cls, type, argTypes, args);
  }

  public static <T> T getInstance(Class<?> cls, Class<T> type, Class<?>[] argTypes,
                     Object[] args) throws JPFException {
    Object o = null;
    Constructor<?> ctor = null;

    if (cls == null) {
      return null;
    }

    while (o == null) {
      try {
        ctor = cls.getConstructor(argTypes);
        o = ctor.newInstance(args);
      } catch (NoSuchMethodException nmx) {
         
        if ((argTypes.length > 1) || ((argTypes.length == 1) && (argTypes[0] != Config.class))) {
          // fallback 1: try a single Config param
          argTypes = Config.CONFIG_ARGTYPES;
          args = config.CONFIG_ARGS;
        } else if (argTypes.length > 0) {
          // fallback 2: try the default ctor
          argTypes = Config.NO_ARGTYPES;
          args = Config.NO_ARGS;

        } else {
          // Ok, there is no suitable ctor, bail out
          throw new JPFException("no suitable ctor found for the peer class " + cls.getName());
        }
      } catch (IllegalAccessException iacc) {
        throw new JPFException("ctor not accessible: "
            + config.getMethodSignature(ctor));
      } catch (IllegalArgumentException iarg) {
        throw new JPFException("illegal constructor arguments: "
            + config.getMethodSignature(ctor));
      } catch (InvocationTargetException ix) {
        Throwable tx = ix.getCause();
        throw new JPFException("exception " + tx + " occured in " 
            + config.getMethodSignature(ctor));
      } catch (InstantiationException ivt) {
        throw new JPFException("abstract class cannot be instantiated");
      } catch (ExceptionInInitializerError eie) {
        throw new JPFException("static initialization failed:\n>> "
            + eie.getException(), eie.getException());
      }
    }

    // check type
    if (!cls.isInstance(o)) {
      throw new JPFException("instance not of type: "
          + cls.getName());
    }

    return type.cast(o); // safe according to above
  }

  static String getPeerDispatcherClassName (String clsName) {
    return (clsName + '$');
  }

  public Class<?> getPeerClass() {
    return peerClass;
  }

  public String getPeerClassName() {
    return peerClass.getName();
  }

  //@TODO: protected -> public
  public void initialize (Class<?> peerClass, ClassInfo ci, boolean cacheMethods) {
    if ((this.ci != null) || (this.peerClass != null)) {
      throw new RuntimeException("cannot re-initialize NativePeer: " +
                                 peerClass.getName());
    }

    this.ci = ci;
    this.peerClass = peerClass;

    loadMethods(cacheMethods);
  }

  protected static void initializePeerClass( Class<?> cls) {
    try {
      Method m = cls.getDeclaredMethod("init", Config.class );
      try {
        m.invoke(null, config);
      } catch (IllegalArgumentException iax){
        // can't happen - static method
      } catch (IllegalAccessException iacx) {
        throw new RuntimeException("peer initialization method not accessible: "
                                   + cls.getName());
      } catch (InvocationTargetException itx){
        throw new RuntimeException("initialization of peer " +
                                   cls.getName() + " failed: " + itx.getCause());

      }
    } catch (NoSuchMethodException nsmx){
      // nothing to do
    }
  }

  private static boolean isMJICandidate (Method mth) {

    // the native peer should be annotated with @MJI
    if(!mth.isAnnotationPresent(MJI.class)) {
      return false;
    }

    // this native peer should be Public
    if(!Modifier.isPublic(mth.getModifiers())) {
      return false;
    }

    // native method always have a MJIEnv and int as the first parameters
    Class<?>[] argTypes = mth.getParameterTypes();
    if ((argTypes.length >= 2) && (argTypes[0] == MJIEnv.class) && (argTypes[1] == int.class || argTypes[1] == Conditional.class) ) {
      return true;
    } else {
      return false;
    }
  }


  @SuppressWarnings("unused")
  private Method getMethod (MethodInfo mi) {
    return getMethod(null, mi);
  }

  private Method getMethod (String prefix, MethodInfo mi) {
    String name = mi.getUniqueName();

    if (prefix != null) {
      name = prefix + name;
    }

    return methods.get(name);
  }

  /**
   * look at all public static methods in the peer and set their
   * corresponding model class MethodInfo attributes
   * <2do> pcm - this is too long, break it down
   */
  private void loadMethods (boolean cacheMethods) {
    Method[] m = peerClass.getDeclaredMethods();
    methods = new HashMap<String, Method>(m.length);

    Map<String,MethodInfo> methodInfos = ci.getDeclaredMethods();
    MethodInfo[] mis = null;

    for (int i = 0; i < m.length; i++) {
      Method  mth = m[i];

      if (isMJICandidate(mth)) {
        // Note that we can't mangle the name automatically, since we loose the
        // object type info (all mapped to int). This has to be handled
        // the same way like with overloaded JNI methods - you have to
        // mangle them manually
        String mn = mth.getName();

        // JNI doesn't allow <clinit> or <init> to be native, but MJI does
        // (you should know what you are doing before you use that, really)
        if (mn.startsWith("$clinit")) {
          mn = "<clinit>";
        } else if (mn.startsWith("$init")) {
          mn = "<init>" + mn.substring(5);
        }

        String mname = Types.getJNIMethodName(mn);
        String sig = Types.getJNISignature(mn);

        if (sig != null) {
          mname += sig;
        }

        // now try to find a corresponding MethodInfo object and mark it
        // as 'peer-ed'
        // <2do> in case of <clinit>, it wouldn't be strictly required to
        // have a MethodInfo upfront (we could create it). Might be handy
        // for classes where we intercept just a few methods, but need
        // to init before
        MethodInfo mi = methodInfos.get(mname);

        if ((mi == null) && (sig == null)) {
          // nothing found, we have to do it the hard way - check if there is
          // a single method with this name (still unsafe, but JNI behavior)
          // Note there's no point in doing that if we do have a signature
          if (mis == null) { // cache it for subsequent lookup
            mis = new MethodInfo[methodInfos.size()];
            methodInfos.values().toArray(mis);
          }

          mi = searchMethod(mname, mis);
        }

        if (mi != null) {
          logger.info("load MJI method: ", mname);

          NativeMethodInfo miNative = new NativeMethodInfo(mi, mth, this);
          miNative.replace(mi);

        } else {
          // we have an orphan method, i.e. a peer method that does not map into any model method
          // (this is usually a signature typo or an out-of-sync peer)
          String message = "orphan NativePeer method: " + ci.getName() + '.' + mname;
           
          if (noOrphanMethods){
            throw new JPFException(message);
          }

          // issue a warning if we have a NativePeer native method w/o a corresponding
          // method in the model class (this might happen due to compiler optimizations
          // silently skipping empty methods)
          logger.warning(message);
        }
      }
    }
  }

  private static MethodInfo searchMethod (String mname, MethodInfo[] methods) {
    int idx = -1;

    for (int j = 0; j < methods.length; j++) {
      if (methods[j].getName().equals(mname)) {
        // if this is actually a overloaded method, and the first one
        // isn't the right choice, we would get an IllegalArgumentException,
        // hence we have to go on and make sure it's not overloaded

        if (idx == -1) {
          idx = j;
        } else {
          throw new JPFException("overloaded native method without signature: " + mname);
        }
      }
    }

    if (idx >= 0) {
      return methods[idx];
    } else {
      return null;
    }
  }
}

