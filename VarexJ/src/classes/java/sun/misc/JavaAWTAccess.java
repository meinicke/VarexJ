package sun.misc;

/**
 * same as the others - we need to model it in case somebody uses Java 5,
 * or an earlier Java 6 version on OS X
 */
public interface JavaAWTAccess {
  
  // don't know about these yet
  public Object get();
  public void put(Object k, Object v);
  public void remove(Object k);
  
  public boolean isDisposed();
  public boolean isMainAppContext();

}
