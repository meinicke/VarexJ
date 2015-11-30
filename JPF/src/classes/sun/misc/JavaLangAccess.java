package sun.misc;

import sun.nio.ch.Interruptible;
import sun.reflect.ConstantPool;
import sun.reflect.annotation.AnnotationType;

/**
 * this is a placeholder for a Java 6 class, which we only have here to
 * support both Java 1.5 and 6 with the same set of env/ classes
 *
 * see sun.misc.SharedSecrets for details
 *
 * <2do> THIS IS GOING AWAY AS SOON AS WE OFFICIALLY SWITCH TO JAVA 6
 */

public interface JavaLangAccess {

    ConstantPool getConstantPool(Class<?> klass);

    void setAnnotationType(Class<?> klass, AnnotationType annotationType);

    AnnotationType getAnnotationType(Class<?> klass);

    <E extends Enum<E>> E[] getEnumConstantsShared(Class<E> klass);

    void blockedOn(Thread t, Interruptible b);

    void registerShutdownHook(int slot, Runnable r);
    
    int getStackTraceDepth(Throwable t);
    
    StackTraceElement getStackTraceElement(Throwable t, int i);
}
