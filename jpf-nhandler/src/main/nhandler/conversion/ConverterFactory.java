package nhandler.conversion;

import nhandler.conversion.jpf2jvm.JPF2JVMConverter;
import nhandler.conversion.jvm2jpf.JVM2JPFConverter;

/**
 * This is factory to create type specific Converters. 
 * 
 * @author Nastaran Shafiei
 */
public interface ConverterFactory {

  public JPF2JVMConverter getJPF2JVMConverter(String clsName);

  public JVM2JPFConverter getJVM2JPFConverter(String clsName);
}
