package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.AnnotationInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.serialize.AmmendableFilterConfiguration.FieldAmmendment;

public class IncludesFromAnnotations
implements FieldAmmendment {
  protected Config config;
  
  public IncludesFromAnnotations(Config config)  {
    this.config = config;
  }
  
  public boolean ammendFieldInclusion(FieldInfo fi, boolean sofar) {
    AnnotationInfo ann = fi.getAnnotation("gov.nasa.jpf.annotation.UnfilterField");
    if (ann != null) {
      return POLICY_INCLUDE;
    }
    return sofar;
  }
}
