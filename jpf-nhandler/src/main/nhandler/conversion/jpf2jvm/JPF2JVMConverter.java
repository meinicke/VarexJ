package nhandler.conversion.jpf2jvm;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.DynamicElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.ReferenceArrayFields;
import gov.nasa.jpf.vm.StaticElementInfo;

import java.lang.reflect.Array;

import nhandler.conversion.ConversionException;
import nhandler.conversion.ConverterBase;

/**
 * This class is used to converter objects and classes from JPF to JVM
 * 
 * @author Nastaran Shafiei
 */
public abstract class JPF2JVMConverter extends ConverterBase {

  public static Class<?> obtainJVMCls (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    if (JPFRef == MJIEnv.NULL) {
      return null;
    }

    ClassInfo ci = env.getReferredClassInfo(ctx, JPFRef);
    JPF2JVMConverter converter = ConverterBase.converterFactory.getJPF2JVMConverter(ci.getName());
    return converter.getJVMCls(JPFRef, env, ctx);
  }

  public static Object obtainJVMObj (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    if (JPFRef == MJIEnv.NULL) {
      return null;
    }

    DynamicElementInfo dei = (DynamicElementInfo) env.getHeap().get(JPFRef);
    ClassInfo ci = dei.getClassInfo();
    JPF2JVMConverter converter = ConverterBase.converterFactory.getJPF2JVMConverter(ci.getName());
    return converter.getJVMObj(JPFRef, env, ctx);
  }

  protected Class<?> loadClass(String cname, MJIEnv env, FeatureExpr ctx) throws ClassNotFoundException {
    if(Utilities.isArray(cname)) {
      return Class.forName(cname);
    } else {
      ClassLoader cl = env.getConfig().getClassLoader();
      return cl.loadClass(cname);
    }
  }
  
  /**
   * Returns a new JVM Class object corresponding to the given JPF class. If
   * such a Class object already exists, it is returned. Otherwise a new one is
   * created.
   */
  protected Class<?> getJVMCls (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    Class<?> JVMCls = null;
    if (JPFRef != MJIEnv.NULL) {
      // First check if the class object has been already created.
      JVMCls = ConverterBase.classMapJPF2JVM.get(JPFRef);

      /**
       * If the Class object has not been created & the given JPF class is not
       * NULL, the corresponding JVM class object is created from JPFRef
       */
      if (JVMCls == null) {
        ClassInfo ci = env.getReferredClassInfo(ctx, JPFRef);

        // Used to store static fields
        StaticElementInfo sei = ci.getStaticElementInfo();

        try {
          JVMCls = loadClass(sei.getClassInfo().getName(), env, ctx);
          ConverterBase.classMapJPF2JVM.put(JPFRef, JVMCls);
        } catch (ClassNotFoundException e) {
          throw new NoClassDefFoundError(sei.getClassInfo().getName());
        }

        assert (JVMCls.getName() != ci.getName());

        setStaticFields(JVMCls, sei, env, ctx);
      }
    }
    return JVMCls;
  }

  protected abstract void setStaticFields(Class<?> JVMCls, StaticElementInfo sei, MJIEnv env, FeatureExpr ctx) throws ConversionException;
  
  /**
   * Returns a JVM object corresponding to the given JPF object. If such an
   * object already exists, it is returned. Otherwise a new one is created.
   */
  protected Object getJVMObj (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    if (env.isArray(JPFRef)) {
      return this.getJVMArrObj(JPFRef, env, ctx);
    } else {
      return this.getJVMNonArrObj(JPFRef, env, ctx);
    }
  }

  /**
   * Returns a non-array JVM object corresponding to the given non-array JPF
   * object. If such an object already exists, it is returned. Otherwise a new
   * one is created.
   */
  protected Object getJVMNonArrObj (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    Object JVMObj = null;
    if (JPFRef != MJIEnv.NULL) {
      // First check if the object has been already created
      JVMObj = ConverterBase.objMapJPF2JVM.get(JPFRef);
      /**
       * If the object has not been created & the given JPF object is not NULL,
       * the corresponding JVM object is created from JPFRef
       */
      if (JVMObj == null) {
        // Used to store instance fields
        DynamicElementInfo dei = (DynamicElementInfo) env.getHeap().get(JPFRef);
        ClassInfo JPFCl = dei.getClassInfo();

        if (!JPFCl.isRegistered()){
          JPFCl.registerClass(ctx, env.getThreadInfo());
        }
        
        // we treat Strings differently
        if(JPFCl.isStringClassInfo()) {
          JVMObj = createStringObject(JPFRef, env, ctx);
        } else {
          int JPFClsRef = JPFCl.getStaticElementInfo().getClassObjectRef();
          Class<?> JVMCl = this.getJVMCls(JPFClsRef, env, ctx);

          // There is only one instance of every class. There is no need to update
          // Class objects
          if (JVMCl == Class.class) {
            try {
              String name = env.getReferredClassInfo(ctx, JPFRef).getName();
              if (Utilities.isPrimitiveClass(name)) {
                JVMObj = Utilities.getPrimitiveClass(name);
              } else {
                JVMObj = loadClass(name, env, ctx);
              }
            } catch (ClassNotFoundException e) {
              e.printStackTrace();
            }
            return JVMObj;
          } else {
            // Creates a new instance of JVMCl
            JVMObj = instantiateFrom(JVMCl);
          }

          ConverterBase.objMapJPF2JVM.put(JPFRef, JVMObj);
          setInstanceFields(JVMObj, dei, env, ctx);
        }
      }
    }
    return JVMObj;
  }

  protected abstract void setInstanceFields(Object JVMObj, DynamicElementInfo dei, MJIEnv env, FeatureExpr ctx) throws ConversionException;

  /**
   * Returns a JVM array corresponding to the given JPF array. If such an array
   * already exists, it is returned. Otherwise a new one is created.
   * 
   * @param JPFRef
   *          an integer representing a JPF array
   * 
   * @return a JVM array corresponding to the given JPF array, JPFRef
   * 
   * @throws ConversionException
   *           if any incorrect input parameter is observed
   */
  protected Object getJVMArrObj (int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    Object JVMArr = null;
    if (JPFRef != MJIEnv.NULL) {
      // First check if the array has been already created
      JVMArr = ConverterBase.objMapJPF2JVM.get(JPFRef);

      /**
       * If the array has not been created & the given JPF array is not NULL,
       * the corresponding JVM array is created from JPFRef
       */
      if (JVMArr == null) {
        // Used to store array elements
        DynamicElementInfo dei = (DynamicElementInfo) env.getHeap().get(JPFRef);

        // Array of primitive type
        if (dei.getClassInfo().getComponentClassInfo().isPrimitive()) {
          JVMArr = Utilities.createJVMPrimitiveArr(dei);
        }
        // Array of Non-primitives
        else {
//          int[] JPFArr = ((ReferenceArrayFields) dei.getFields()).asReferenceArray();
          Conditional<Integer>[] JPFArrConditional = ((ReferenceArrayFields) dei.getFields()).asReferenceArray();
          int[] JPFArr = new int[JPFArrConditional.length];
          for (int i=0; i<JPFArrConditional.length; i++){
            JPFArr[i] = JPFArrConditional[i].getValue();
          }

          int arrSize = JPFArr.length;

          Class<?> compType = null;
          try {
            compType = loadClass(dei.getClassInfo().getComponentClassInfo().getName(), env, ctx);
          } catch (ClassNotFoundException e) {
            e.printStackTrace();
          }

          Object[] arrObj = (Object[]) Array.newInstance(compType, arrSize);

          for (int i = 0; i < arrSize; i++) {
            arrObj[i] = obtainJVMObj(JPFArr[i], env, ctx);
          }
          JVMArr = arrObj;
        }
        ConverterBase.objMapJPF2JVM.put(JPFRef, JVMArr);
      }
    }
    return JVMArr;
  }

  protected abstract Object instantiateFrom (Class<?> cl);

  protected Object createStringObject(int JPFRef, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    DynamicElementInfo str = (DynamicElementInfo) env.getHeap().get(JPFRef);
    if(!str.getClassInfo().isStringClassInfo()) {
      throw new ConversionException();
    }

    FieldInfo fi = str.getFieldInfo("value");
    int fieldValueRef = str.getFields().getReferenceValue(fi.getStorageOffset()).getValue();

    // this is String.value which is of type of char[]
    Object value = this.getJVMObj(fieldValueRef, env, ctx);
    // In case that value is of the type One
    Object JVMObj;
    if (value instanceof One)
      JVMObj = new String((char[])((One) value).getValue());
    else {
      System.out.println("Warning from JPF2JVMConverter.java L244, JVMObj is not One");
      JVMObj = new String((char[])value);
    }
    ConverterBase.objMapJPF2JVM.put(JPFRef, JVMObj);
    return JVMObj;
  }

}
