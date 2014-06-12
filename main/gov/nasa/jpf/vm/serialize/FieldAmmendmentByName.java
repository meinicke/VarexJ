package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.serialize.AmmendableFilterConfiguration.FieldAmmendment;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FieldAmmendmentByName implements FieldAmmendment {
  protected final Set<String> fullFieldNames;
  protected final boolean policy;
  
  public FieldAmmendmentByName(String[] fieldNames, boolean policy) {
    this(Arrays.asList(fieldNames), policy);
  }
  
  public FieldAmmendmentByName(Collection<String> fullFieldNames, boolean policy) {
    this.fullFieldNames = new HashSet<String>(fullFieldNames);
    this.policy = policy;
  }

  public FieldAmmendmentByName(Iterable<String> fullFieldNames, boolean policy) {
    this.fullFieldNames = new HashSet<String>();
    for (String name : fullFieldNames) {
      this.fullFieldNames.add(name);
    }
    this.policy = policy;
  }
  
  public boolean ammendFieldInclusion(FieldInfo fi, boolean sofar) {
    if (fullFieldNames.contains(fi.getFullName())) {
      return policy;
    } else {
      return sofar;
    }
  }

}
