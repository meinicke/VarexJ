package nhandler.conversion.jpf2jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.DynamicElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StaticElementInfo;
import nhandler.conversion.ConversionException;
import nhandler.conversion.ConverterBase;

/**
 * This class is used to convert objects and classes from JPF to JVM. This is only
 * applicable on types which are compatible between JPF and JVM, meaning that the same
 * classes are used to represent them in both environments.
 *
 * @author Nastaran Shafiei
 */
public class JPF2JVMGenericConverter extends JPF2JVMConverter {

    @Override
    protected void setStaticFields(Class<?> JVMCls, StaticElementInfo sei, MJIEnv env, FeatureExpr ctx) throws ConversionException {
        ClassInfo ci = sei.getClassInfo();
        while (JVMCls != null) {
            Field fld[] = JVMCls.getDeclaredFields();

            for (int i = 0; i < fld.length; i++) {
                boolean isStatic = ((Modifier.toString(fld[i].getModifiers())).indexOf("static") != -1);
                boolean isFinal = ((Modifier.toString(fld[i].getModifiers())).indexOf("final") != -1);

                // Provide access to private and final fields
                fld[i].setAccessible(true);
                FieldInfo fi = sei.getFieldInfo(fld[i].getName());

                // For class only set the values of static fields
                if (fi != null && isStatic) {
                    /**
                     * Why we check for !(isFinal)?
                     *
                     * We do not set the value for "static final" fields. But we take
                     * care of "non-static final" fields.
                     *
                     * static final fields can be initialized at the declaration time,
                     * OW it MUST be initialized inside the static block. By using
                     * Class.forName() the class is initialized. Since when the class
                     * is initialized the static blocks are executed, the static final
                     * fields of object returned by Class.forName() have already have
                     * the right values and we do not need to update their value.
                     *
                     * Non-static final fields can be initialized at the declaration
                     * time. But if the non-static field is final blank, it MUST be
                     * initialized in the constructor. By using Class.newInstance()
                     * the class is instantiated as if by a new expression with an
                     * empty argument list. If the object represented by JPFRef
                     * created using different constructor, the value of final blank
                     * fields might be different when using the constructor with an
                     * empty argument list. Therefore the values of non-static final
                     * fields have to be set.
                     */
                    if (!isFinal) {
                        // If the current field is of reference type
                        if (fi.isReference()) {
                            int fieldValueRef = sei.getFields().getReferenceValue(fi.getStorageOffset()).getValue();
                            Object JVMField = obtainJVMObj(fieldValueRef, env, ctx);
                            // Temporary solution cpwTODO
                            if (JVMField != null && JVMField.getClass() == cmu.conditional.One.class) {
                                JVMField = ((cmu.conditional.One<?>) JVMField).getValue();
                            }
                            try {
                                fld[i].set(null, JVMField);
                            } catch (IllegalArgumentException e) {
                                e.printStackTrace();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                        // If the current field is of primitive type
                        else {
                            try {
                                Utilities.setJVMPrimitiveField(fld[i], JVMCls, sei, fi);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }

            JVMCls = JVMCls.getSuperclass();
            ci = ci.getSuperClass();
            if (ci != null) {
                sei = ci.getStaticElementInfo();
            }
        }
    }

    @Override
    protected void setInstanceFields(Object JVMObj, DynamicElementInfo dei, MJIEnv env, FeatureExpr ctx) throws ConversionException {
        Class<?> cls = JVMObj.getClass();
        ClassInfo JPFCl = dei.getClassInfo();

        while (cls != null) {
            Field fld[] = cls.getDeclaredFields();

            for (int i = 0; i < fld.length; i++) {

                // It is true if the field is declared as static.
                boolean isNonStaticField = ((Modifier.toString(fld[i].getModifiers())).indexOf("static") == -1);

                // Provide access to private and final fields
                fld[i].setAccessible(true);
                FieldInfo fi = JPFCl.getInstanceField(fld[i].getName());

                if (fi != null && isNonStaticField) {
                    // Field is of reference type
                    if (fi.isReference()) {
                        int fieldValueRef = dei.getFields().getReferenceValue(fi.getStorageOffset()).getValue();
                        Object JVMField = obtainJVMObj(fieldValueRef, env, ctx);
                        if (JVMField instanceof One) {
                            JVMField = ((One<?>) JVMField).getValue();
                        }
                        try {
                            fld[i].set(JVMObj, JVMField);
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    // Field is of primitive type
                    else {
                        try {
                            Utilities.setJVMPrimitiveField(fld[i], JVMObj, dei, fi);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
            JPFCl = JPFCl.getSuperClass();
        }
    }

    @Override
    protected void updateInstanceFields(Object JVMObj, DynamicElementInfo dei, MJIEnv env, FeatureExpr ctx) throws ConversionException {
        Class<?> cls = JVMObj.getClass();
        ClassInfo JPFCl = dei.getClassInfo();

        while (cls != null) {
            Field fld[] = cls.getDeclaredFields();

            for (int i = 0; i < fld.length; i++) {

                // It is true if the field is NOT declared as static.
                boolean isNonStaticField = ((Modifier.toString(fld[i].getModifiers())).indexOf("static") == -1);

                // Provide access to private and final fields
                fld[i].setAccessible(true);
                FieldInfo fi = JPFCl.getInstanceField(fld[i].getName());

                if (fi != null && isNonStaticField) {
                    // Field is of reference type
                    if (fi.isReference()) {
                        // Warning: getValue() here could be dangerous
                        int fieldValueRef = dei.getFields().getReferenceValue(fi.getStorageOffset()).getValue();
                        // If the field object is already in sync, skip.
                        // Otherwise, updateInstanceFields() gets called again and again
                        if (ConverterBase.objMapJPF2JVM.containsKey(fieldValueRef)) {
                            // TODO: Say that this field belongs to a class which contains a public field x
                            // TODO: if x is changed somewhere in the code, current impl could not reflect
                            // TODO: those changes to the corresponding JVMObject
                            continue;
                        }
                        Object JVMField = obtainJVMObj(fieldValueRef, env, ctx);
                        try {
                            fld[i].set(JVMObj, JVMField);
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    // Field is of primitive type
                    else {
                        try {
                            Utilities.setJVMPrimitiveField(fld[i], JVMObj, dei, fi);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
            JPFCl = JPFCl.getSuperClass();
        }
    }

    /**
     * Returns a new JVM object instantiated from the given class
     *
     * @param cl a JVM class
     * @return a new JVM object instantiated from the given class, cl
     */
    protected Object instantiateFrom(Class<?> cl) {
        Object JVMObj = null;

        if (cl == Class.class) {
            return cl;
        }

        Constructor<?> ctor = getNoArgCtor(cl);
        try {
            ctor.setAccessible(true);
            JVMObj = ctor.newInstance();
        } catch (Exception e) {
            System.out.println("Cannot instantiate from " + cl + " using ctor " + ctor);
            e.printStackTrace();
        }
        return JVMObj;
    }

    /**
     * Returns a constructor with no arguments.
     *
     * @param cl a JVM class
     * @return a constructor with no arguments
     */
    protected Constructor<?> getNoArgCtor(Class<?> cl) {
        Constructor<?>[] ctors = cl.getDeclaredConstructors();
        Constructor<?> ctor = null;

        // Check if the given class has a constructor with no arguments
        for (Constructor<?> c : ctors) {
            if (c.getParameterTypes().length == 0) {
                ctor = c;
            }
        }

        if (ctor == null) {
            try {
                ctor = sun.reflect.ReflectionFactory.getReflectionFactory().newConstructorForSerialization(cl, Object.class.getConstructor());
            } catch (Exception e1) {
                System.out.println("Cannot create a default constructor to instantiate from");
                e1.printStackTrace();
            }
        }
        return ctor;
    }
}
