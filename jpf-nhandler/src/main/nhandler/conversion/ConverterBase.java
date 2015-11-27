package nhandler.conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import gov.nasa.jpf.vm.MJIEnv;
import nhandler.util.ValueIdentityHashMap;

/**
 * This is just a common root of all Converters and keeps key elements used by 
 * Converter classes 
 * 
 * @author Nastaran Shafiei
 */
public class ConverterBase {

  static boolean resetState;

  /**
   * Keeps track of the JVM objects that have been already created from their
   * corresponding JPF objects, while performing conversion from JPF to JVM
   */
  protected static ValueIdentityHashMap<Integer, Object> objMapJPF2JVM = new ValueIdentityHashMap<Integer, Object>();
//  public static HashSet<Object> objSetJVMBackup = new HashSet<>();
  public static ArrayList<Object> socketObjArray = new ArrayList<>();

  /**
   * Keeps track of the JVM classes that have been already created from their
   * corresponding JPF classes, while performing conversion from JPF to JVM
   */
  protected static ValueIdentityHashMap<Integer, Class<?>> classMapJPF2JVM = new ValueIdentityHashMap<Integer, Class<?>>();

  /**
   * Keeps track of the JPF objects that have been already updated from their
   * corresponding JVM objects, while performing conversion from JVM to JPF
   */
  protected static HashMap<Integer, Object> updatedJPFObj = new ValueIdentityHashMap<Integer, Object>();

  /**
   * Keeps track of the JPF classes that have been already updated from their
   * corresponding JVM classes, while performing conversion from JVM to JPF
   */
  protected static Set<Integer> updatedJPFCls = new HashSet<Integer>();

  public static ConverterFactory converterFactory;

  public static void init() {
    converterFactory = new DefaultConverterFactory();
  }

  public static boolean isResetState() {
    return resetState;
  }

  /**
   * This needs to be invoked at the beginning of every method created on-the-fly
   */
  public static void reset(MJIEnv env) {
    ConverterBase.resetState = env.getConfig().getBoolean("nhandler.resetVMState");

    if (ConverterBase.resetState) {
      // these are reset on-demond by setting the nhandler.resetVMState
      // property in the properties file
//      ConverterBase.objMapJPF2JVM.clear();
//      ConverterBase.classMapJPF2JVM.clear();
      clearObj(ConverterBase.objMapJPF2JVM);
      clearCls(ConverterBase.classMapJPF2JVM);
//      checkSocket();
    }

    // these always need to be reset
    ConverterBase.updatedJPFObj.clear();
    ConverterBase.updatedJPFCls.clear();
  }

  public static void clearObj(ValueIdentityHashMap<Integer, Object> map) {
    boolean changed = true;
    while (changed) {
      changed = false;
      for (Map.Entry<Integer, Object> entry : map.entrySet()) {
        Object obj = entry.getValue();
          if (obj.getClass().getName().equals("java.net.Socket")
                  || obj.getClass().getName().equals("java.net.SocksSocketImpl")
                  || obj.getClass().getName().equals("java.net.SocketInputStream")
                  || obj.getClass().getName().equals("java.net.SocketOutputStream")
                  || obj.getClass().getName().startsWith("java.util.zip.ZipFile")
                  || obj.getClass().getName().equals("java.util.jar.JarFile")
                  || obj.getClass().getName().equals("sun.net.www.protocol.jar.URLJarFile")
                  || obj.getClass().getName().equals("sun.net.www.protocol.jar.JarURLConnection")
                  || obj.getClass().getName().equals("java.util.zip.Inflater")
                  || obj.getClass().getName().equals("java.util.ResourceBundle")
                  || obj.getClass().getName().equals("java.util.zip.CRC32")
                  || obj.getClass().getName().equals("sun.nio.ch.IOUtil")
                  || obj.getClass().getName().equals("sun.nio.ch.KQueueArrayWrapper")
                  || obj.getClass().getName().equals("java.util.zip.Deflater")
                  ) {

//          if (!socketObjArray.contains(obj)) {
//            socketObjArray.add(obj);
//          }
              continue;
          } else {
              changed = true;
//          objSetJVMBackup.add(entry.getValue());
              map.remove(entry.getKey());
              break;
          } //WARNING: these lines were written when I was fighting with my girlfirend. BE CAREFUL!!!!
      }
    }
  }

  public static void clearCls(ValueIdentityHashMap<Integer, Class<?>> map) {
    boolean changed = true;
    while (changed) {
      changed = false;
      for (Map.Entry<Integer, Class<?>> entry : map.entrySet()) {
        Class<?> cls = entry.getValue();
          if (cls.getName().equals("java.net.Socket")
                  || cls.getName().equals("java.net.SocksSocketImpl") // this one is not in the jpf.properties file, but we need this
                  || cls.getName().equals("java.net.SocketInputStream")
                  || cls.getName().equals("java.net.SocketOutputStream")
                  || cls.getName().startsWith("java.util.zip.ZipFile")
                  || cls.getName().equals("java.util.jar.JarFile")
                  || cls.getName().equals("sun.net.www.protocol.jar.URLJarFile")
                  || cls.getName().equals("sun.net.www.protocol.jar.JarURLConnection")
                  || cls.getName().equals("java.util.zip.Inflater")
                  || cls.getName().equals("java.util.ResourceBundle")
                  || cls.getName().equals("java.util.zip.CRC32")
                  || cls.getName().equals("sun.nio.ch.IOUtil")
                  || cls.getName().equals("sun.nio.ch.KQueueArrayWrapper")
                  || cls.getName().equals("java.util.zip.Deflater")
                  ) {

              continue;
          } else {
              changed = true;
              map.remove(entry.getKey());
              break;
          }
      }
    }
  }

  public static void checkSocket() {
    if (socketObjArray.size()>=4){
      System.out.println("clearing!!!");
      socketObjArray.clear();
      objMapJPF2JVM.clear();
    }
//    System.out.println("checkingSocket");
//    boolean changed = true;
//    while (changed) {
//      changed = false;
//      for (Map.Entry<Integer, Object> entry : objMapJPF2JVM.entrySet()) {
//        if (entry.getValue() instanceof Socket) {
//          System.out.println("instanceof Socket");
//          Socket socketObj = (Socket) entry.getValue();
//          if (socketObjArray.size() > 1 && socketObjArray.get(0) == socketObj) {
//            System.out.println("closing socket!!!!!");
//            changed = true;
//            objMapJPF2JVM.remove(entry);
//            socketObjArray.remove(0);
//            break;
//          }
//        }
//      }
//    }
  }

}
