package nhandler.conversion;

import gov.nasa.jpf.vm.MJIEnv;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
      ConverterBase.objMapJPF2JVM.clear();
      ConverterBase.classMapJPF2JVM.clear();
    }

    // these always need to be reset
    ConverterBase.updatedJPFObj.clear();
    ConverterBase.updatedJPFCls.clear();
  }
}
