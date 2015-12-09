
public class StrictMathExample {
  
  static double n1 = (45*Math.PI)/180;
  static double n2 = 0.0;
  static double n3 = (1.0/0.0);
  static double n4 = (90*Math.PI)/180;

  public static void main(String[] args) {
    computeTan();
    computeSin();
  }

  public static void computeTan() {
    double result = StrictMath.tan(n1); 
    System.out.println("tan(45*Math.PI/180): " + result);
    result = StrictMath.tan(n2); 
    System.out.println("tan("+n2+"): " + result + "\n");
  }

  public static void computeSin() {
    double result = StrictMath.sin(n3); 
    System.out.println("sin("+n3+"): " + result);
    result = StrictMath.sin(n4); 
    System.out.println("sin(90*Math.PI/180): " + result);
  }
}
