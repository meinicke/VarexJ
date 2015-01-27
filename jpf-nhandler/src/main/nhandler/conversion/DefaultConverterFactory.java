package nhandler.conversion;

import nhandler.conversion.jpf2jvm.JPF2JVMConverter;
import nhandler.conversion.jpf2jvm.JPF2JVMGenericConverter;
import nhandler.conversion.jvm2jpf.JVM2JPFConverter;
import nhandler.conversion.jvm2jpf.JVM2JPFGenericConverter;

/**
 * Default factory to create type specific converter
 * 
 * @author Nastaran Shafiei
 */
public class DefaultConverterFactory implements ConverterFactory {

  private static JPF2JVMConverter jpf2jvmconverter;
  private static JVM2JPFConverter jvm2jpfconverter;

  @Override
  public JPF2JVMConverter getJPF2JVMConverter (String clsName) {
    if(jpf2jvmconverter==null) {
      jpf2jvmconverter = new JPF2JVMGenericConverter();
    }
    return jpf2jvmconverter;
  }

  @Override
  public JVM2JPFConverter getJVM2JPFConverter (String clsName) {
    if(jvm2jpfconverter==null) {
      jvm2jpfconverter = new JVM2JPFGenericConverter();
    }
    return jvm2jpfconverter;
  }
}
