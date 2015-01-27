//import gov.nasa.jpf.annotation.Conditional;

public class mathTest {

//    @Conditional
//    static boolean x = true;

    public static void main(String[] args){
//        double a = x?1: StrictMath.PI / 2;
        double a = StrictMath.PI / 2;
        double b = StrictMath.sin(a);
        System.out.println("b = " + b);
    }
}
