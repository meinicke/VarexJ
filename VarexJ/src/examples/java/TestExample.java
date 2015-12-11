class T1 {
  int d = 42;

  public int func1(int a, int b) {
    if (a > b) {
      return 1;
    } else if (a == b) {
      return 0;
    } else {
      return -1;
    }
  }

  public boolean func2(boolean cond) {
    if (cond && (d > 40)) {
      d--;
    } else {
      d++;
    }
    return cond;
  }
}

class T2 {

  public int computeSomething (int a, int b){
    try {
      return a / b;
    } catch (ArithmeticException ax){
      return -1; // pretty lame error handling
    }
  }

  public void doSomething() {
    System.out.println("something");
  }
}

public class TestExample {

  public static void main(String[] args) {
    T1 t1 = new T1();

    assert t1.func1(1, 0) > 0;
    assert t1.func1(0, 1) < 0;

    assert t1.func2(true) == true;
    assert t1.func2(false) == false;


    T2 t2 = new T2();

    assert t2.computeSomething(42, 42) == 1.0;
  }
}

