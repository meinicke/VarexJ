package classloader_specific_tests;

public class Class1 extends Class2 implements Interface1, Interface2 {
  
  public static void causeArithmeticException() {
    System.out.println("Class1 now causing ArithmeticException");
    int a = 10;
    a = 10/(a-10);
  }

  public static void assertFalse() {
    assert false;
  }
}
