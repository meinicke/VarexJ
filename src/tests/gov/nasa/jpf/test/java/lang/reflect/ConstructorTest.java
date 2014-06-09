package gov.nasa.jpf.test.java.lang.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import java.lang.reflect.Constructor;
import org.junit.Test;

public class ConstructorTest extends TestJPF {

  public static void main (String[] args){
    runTestsOfThisClass(args);
  }

  public static class Test1 {
    public Test1 (Class<?>... argTypes) {
    }

    public Test1 (Object[] argTypes) {
    }
  }

  @Test
  public void equalsTest () throws SecurityException, NoSuchMethodException{
    if (verifyNoPropertyViolation()){
      Constructor ctor1 = String.class.getConstructor();
      Constructor ctor2 = String.class.getConstructor();
      assertTrue(ctor1.equals(ctor2));
      assertFalse(ctor1 == ctor2);
    }
  }

  @Test
  public void isVarArgsTest () throws SecurityException, NoSuchMethodException{
    if (verifyNoPropertyViolation()){
      assertTrue(Test1.class.getConstructors()[0].isVarArgs());
      assertFalse(Test1.class.getConstructors()[1].isVarArgs());
    }
  }

  @Test
  public void hashCodeTest (){
    if (verifyNoPropertyViolation()){
      Constructor ctor1 = Test1.class.getConstructors()[0];
      Constructor ctor2 = Test1.class.getConstructors()[1];
      assertTrue(ctor1.hashCode() == ctor2.hashCode());
    }
  }
}
