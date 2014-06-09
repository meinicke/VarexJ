package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.serialize.AmmendableFilterConfiguration.StaticAmmendment;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Marks static final field of primitive or known immutable type to be
 * filtered.  In theory, these could be critical to state, but that would
 * be highly irregular.
 * 
 * NOTE - final does not really mean constant, so we only ignore fields
 * here that are initialized from lexical constants, i.e. a constpool entry.
 * Others might involve data choice generators
 * 
 * <br><br>
 * Ignoring constants probably isn't beneficial with the FilteringSerializer
 * but could be a big win with AbstractingSerializer, which garbage-collects
 * no-longer-reachable objects--that is, garbage collection in its
 * representation, not in VM.
 *
 * @author peterd
 */
public class IgnoreConstants implements StaticAmmendment {
  static final HashSet<String> knownImmutables =
    new HashSet<String>(Arrays.asList(new String[] {
        "boolean", "byte", "char", "double", "float", "int", "long", "short",
        "java.lang.String",
        "java.lang.Boolean",
        "java.lang.Byte",
        "java.lang.Character",
        "java.lang.Double",
        "java.lang.Float",
        "java.lang.Integer",
        "java.lang.Long",
        "java.lang.Short",
    }));
  
  public boolean ammendFieldInclusion(FieldInfo fi, boolean sofar) {
    assert fi.isStatic();
    if (fi.isFinal() && fi.getConstantValue() != null) {
      if (knownImmutables.contains(fi.getType())) {
        return POLICY_IGNORE; 
      }
    }
    // otherwise, delegate
    return sofar; 
  }

  // must be at bottom
  public static final IgnoreConstants instance = new IgnoreConstants();
}
