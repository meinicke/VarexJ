package gov.nasa.jpf.vm.serialize;


public class IgnoreReflectiveNames extends FieldAmmendmentByName {
  /**
   * These are not critical to state because the objects that contain them
   * also have int values that can be used to look up the name within the
   * same VM execution.
   */
  static final String[] reflectiveNameFields = {
    "java.lang.Class.name",
    "java.lang.reflect.Method.name",
    "java.lang.reflect.Field.name"
  };
  
  public IgnoreReflectiveNames() {
    super(reflectiveNameFields, POLICY_IGNORE);
  }

  // must be at bottom!
  public static final IgnoreReflectiveNames instance = new IgnoreReflectiveNames();
}
