package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.Config;


public class DefaultFilterConfiguration extends AmmendableFilterConfiguration {
  @Override
  public void init(Config config) {
    // these built-in come first
    appendStaticAmmendment(IgnoreConstants.instance);
    appendInstanceAmmendment(IgnoreReflectiveNames.instance);
    appendFieldAmmendment(IgnoreThreadNastiness.instance);
    appendFieldAmmendment(IgnoreUtilSilliness.instance);
    
    // ignores (e.g. NoMatch) from annotations
    IgnoresFromAnnotations ignores = new IgnoresFromAnnotations(config); 
    appendFieldAmmendment(ignores);
    appendFrameAmmendment(ignores);
    
    // configured via properties
    super.init(config);
    
    // includes (e.g. ForceMatch) from annotations
    IncludesFromAnnotations includes = new IncludesFromAnnotations(config); 
    appendFieldAmmendment(includes);
    //appendFrameAmmendment(includes);
  }
}
