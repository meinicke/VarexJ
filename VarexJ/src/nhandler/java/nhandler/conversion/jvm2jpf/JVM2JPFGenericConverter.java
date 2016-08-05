package nhandler.conversion.jvm2jpf;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.DynamicElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StaticElementInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import nhandler.conversion.ConversionException;
import nhandler.conversion.ConverterBase;

/**
 * This class is used to convert objects and classes from JVM to JPF. This is only
 * applicable on types which are compatible between JPF and JVM, meaning that the same
 * classes are used to represent them in both environments.
 * 
 * @author Nastaran Shafiei
 */
public class JVM2JPFGenericConverter extends JVM2JPFConverter {
  @Override
  protected void setStaticFields(Class<?> JVMCls, StaticElementInfo sei, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    Field fld[] = JVMCls.getDeclaredFields();

    for (int i = 0; i < fld.length; i++){
      boolean isStatic = ((Modifier.toString(fld[i].getModifiers())).indexOf("static") != -1);
      boolean isFinal = ((Modifier.toString(fld[i].getModifiers())).indexOf("final") != -1);

      // Provide access to private and final fields
      fld[i].setAccessible(true);
      FieldInfo fi = sei.getFieldInfo(fld[i].getName());

      // Provide access to private and final fields
      if (fi != null){
        if (isStatic && !isFinal){
          // If the current field is of reference type
          if (fi.isReference()){
            int JPFfldValue = MJIEnv.NULL;
            Object JVMfldValue = null;

            try{
              // retrieving the value of the field in JVM
              JVMfldValue = fld[i].get(JVMCls);
            } catch (IllegalAccessException e2){
              e2.printStackTrace();
            }

            JPFfldValue = sei.getReferenceField(fi).simplify(ctx).getValue();

            if (JVMfldValue == null){
              JPFfldValue = MJIEnv.NULL;
            } else if (JPFfldValue == MJIEnv.NULL || ConverterBase.objMapJPF2JVM.get(JPFfldValue).getValue() != JVMfldValue){
              JPFfldValue = obtainJPFObj(JVMfldValue, env, ctx);
            } else if (ConverterBase.objMapJPF2JVM.get(JPFfldValue).getValue() == JVMfldValue){
              updateJPFObj(JVMfldValue, JPFfldValue, env, ctx);
            } else{
              throw new ConversionException("Unconsidered case observed! - JVM2JPF.getJPFCls()");
            }
            sei.setReferenceField(ctx, fi, new One<>(JPFfldValue));
          }
          // If the current field is of primitive type
          else{
            try{
              Utilities.setJPFPrimitiveField(ctx, sei, fi.getStorageOffset(), fld[i], JVMCls);
            } catch (IllegalAccessException e){
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  @Override
  protected void setInstanceFields(Object JVMObj, DynamicElementInfo dei, MJIEnv env, FeatureExpr ctx) throws ConversionException {
    Class<?> JVMCl = JVMObj.getClass();
    ClassInfo JPFCl = this.getJPFCls(JVMObj.getClass(), env, ctx);

    while (JVMCl!=null){
      Field fld[] = JVMCl.getDeclaredFields();

      for (int i = 0; i < fld.length; i++){
        // Check if the field is declared as non-static
        boolean isNonStaticField = ((Modifier.toString(fld[i].getModifiers())).indexOf("static") == -1);
        FieldInfo fi = JPFCl.getInstanceField(fld[i].getName());
        fld[i].setAccessible(true);

        if (fi != null && isNonStaticField){
          // If the current field is of reference type
          if (fi.isReference()){
            Conditional<Integer> JPFfldValue = One.MJIEnvNULL;
            Object JVMfldValue = null;

            try{
              // retrieving the value of the field in JVM
              JVMfldValue = fld[i].get(JVMObj);
            } catch (IllegalAccessException e2){
              e2.printStackTrace();
            }
            JPFfldValue = dei.getReferenceField(fi);
            if (JPFfldValue != null) {
            	JPFfldValue = JPFfldValue.simplify(ctx);
            }
            if (JVMfldValue == null){
              JPFfldValue = One.MJIEnvNULL;
            } else if (JPFfldValue.equals(One.MJIEnvNULL) || getValueOrNull(ConverterBase.objMapJPF2JVM.get(JPFfldValue.getValue(true))) != JVMfldValue){
              JPFfldValue = new One<>(obtainJPFObj(JVMfldValue, env, ctx));
            } else if (ConverterBase.objMapJPF2JVM.get(JPFfldValue.getValue()).getValue() == JVMfldValue){
              updateJPFObj(JVMfldValue, JPFfldValue.getValue(), env, ctx);
            } else{
              throw new ConversionException("Unconsidered case observed! - JVM2JPF.updateObj()");
            }
            dei.setReferenceField(ctx, fi, JPFfldValue);
          }
          // If the current field is of primitive type
          else{
            try{
              Utilities.setJPFPrimitiveField(ctx, dei, fi.getStorageOffset(), fld[i], JVMObj);
            } catch (IllegalAccessException e){
              e.printStackTrace();
            }
          }
        }
      }
      JVMCl = JVMCl.getSuperclass();
      JPFCl = JPFCl.getSuperClass();
    }
  }
}
