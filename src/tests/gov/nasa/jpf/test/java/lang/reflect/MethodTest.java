package gov.nasa.jpf.test.java.lang.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import java.lang.reflect.Method;
import org.junit.Test;

public class MethodTest extends TestJPF {

  public static void main (String[] args){
    runTestsOfThisClass(args);
  }

  @Test
  public void equalsTest () throws SecurityException, NoSuchMethodException{
    if (verifyNoPropertyViolation()){
      Method m1 = MethodTest.class.getMethod("equalsTest", new Class[0]);
      Method m2 = MethodTest.class.getMethod("equalsTest", new Class[0]);
      assertTrue(m1.equals(m2));
      assertFalse(m1 == m2);
    }
  }

  public void testIsVarArg1s (Class<?>... argTypes){
  }

  public void testIsVarArgs2 (Class<?>[] argTypes){
  }

  @Test
  public void isVarArgsTest () throws SecurityException, NoSuchMethodException{
    if (verifyNoPropertyViolation()){
      for (Method m : MethodTest.class.getDeclaredMethods()){
        if (m.getName().equals("testIsVarArg1s"))
          assertTrue(m.isVarArgs());
        else if (m.getName().equals("testIsVarArg1s"))
          assertFalse(m.isVarArgs());
      }
    }
  }

  @Test
  public void hashCodeTest () throws SecurityException, NoSuchMethodException{
    if (verifyNoPropertyViolation()){
      Method m1 = MethodTest.class.getMethod("hashCodeTest", new Class[0]);
      Method m2 = MethodTest.class.getMethod("hashCodeTest", new Class[0]);
      Method m3 = MethodTest.class.getMethod("equalsTest", new Class[0]);
      assertTrue(m1.equals(m2));
      assertTrue(m1.hashCode() == m2.hashCode());
      assertFalse(m1.hashCode() == m3.hashCode());
    }
  }

  public class A {
    public A foo (int a){
      return new A();
    }
  }

  public class B extends A {
    public B foo (int x){
      return new B();
    }
  }

  @Test
  public void isBridgeTest (){
    if (verifyNoPropertyViolation()){
      assertFalse(B.class.getDeclaredMethods()[0].isBridge());
      assertTrue(B.class.getDeclaredMethods()[1].isBridge());
    }
  }
}
