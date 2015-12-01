package java.security;

/**
 * This is just a dummy implementation of java.security.SecureClassLoader
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class SecureClassLoader extends ClassLoader {

  protected SecureClassLoader(ClassLoader parent) {
    super(parent);
  }

  protected SecureClassLoader() {
    super();
  }
}
