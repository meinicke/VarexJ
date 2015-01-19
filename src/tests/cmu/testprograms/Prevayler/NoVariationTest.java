package cmu.testprograms.Prevayler;

import cmu.ExampleRunner;
import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NoVariationTest extends TestJPF{
    @Test
    public void demo1Test() {
        if (verifyNoPropertyViolation("jpf_testprogram/prevayler_demo1.jpf")) {
            try {
                org.prevayler.demos.demo1.Main.main(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


//    @Test
//    public void scalabilityTest(){
//        if (verifyNoPropertyViolation("jpf_testprogram/prevayler_scalabilityTest.jpf")){
//            org.prevayler.demos.scalability.Main.main(null);
//        }
//    }

//    @Test
//    public void jxpathTest(){
//        if (verifyNoPropertyViolation("jpf_testprogram/prevayler_jxpath.jpf")){
//            String[] args1 = new String[]{"proj", "100", "learn JXPath"};
//            String[] args2 = new String[]{"task", "50", "read docs", "09/21/02 2:00 PM", "09/21/02 3:00 PM", "100"};
//            String[] args3 = new String[]{"task", "51", "write code", "09/21/02 3:00 PM", "09/21/02 4:00 PM", "100"};
//            String[] args4 = new String[]{"task", "52", "veg out", "09/21/02 4:00 PM", "09/21/02 5:00 PM", "100"};
//            String[] args5 = new String[]{"list", "projects"};
//            String[] args6 = new String[]{"list", "projects/tasks"};
//            String[] args7 = new String[]{"list", "projects/tasks[name='read docs']"};
//            org.prevayler.demos.jxpath.Main.main(args1);
//            org.prevayler.demos.jxpath.Main.main(args2);
//            org.prevayler.demos.jxpath.Main.main(args3);
//            org.prevayler.demos.jxpath.Main.main(args4);
//            org.prevayler.demos.jxpath.Main.main(args5);
//            org.prevayler.demos.jxpath.Main.main(args6);
//            org.prevayler.demos.jxpath.Main.main(args7);
//        }
//    }


//    @Test
//    public void tutorialTest(){
//        if (verifyNoPropertyViolation("jpf_testprogram/prevayler_tutorial.jpf")){
//            try {
//                org.prevayler.tutorial.Main.main(null);
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }


}
