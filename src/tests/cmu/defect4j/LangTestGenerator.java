package cmu.defect4j;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author: chupanw
 */
public class LangTestGenerator {
    public static FileWriter writer;
    public static Integer counter;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writer = new FileWriter("/Users/chupanw/IdeaProjects/VarexJ/src/tests/cmu/defect4j/LangTest.java");
        counter = 1;
        printHeader();
        SearchTest();
        printFooter();
        writer.close();
    }

    public static void SearchTest() throws ClassNotFoundException, IOException {
        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/lang_1_buggy/src/test/");
        for (File file : files){
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("org"), filepath.indexOf("."));
            String classname = filepath.replace("/", ".");
            System.out.println(classname);
//            if(classname.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest")){
//                continue;
//            }
            if(classname.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest")) {
                continue;
            }
            if(classname.equals("org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest")) {
                continue;
            }
            if(classname.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest")) {
                continue;
            }
            if(classname.split("\\.")[classname.split("\\.").length-2].equals("concurrent")){
                continue;
            }
            if(classname.equals("org.apache.commons.lang3.exception.AbstractExceptionContextTest")){
                continue;
            }
            if(classname.equals("org.apache.commons.lang3.ObjectUtilsTest")){
                continue;
            }
            Class<?> c = Class.forName(classname);
            Method [] methods = c.getMethods();
            for (Method method : methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Test){
                        System.out.println(method.getName());
                        printNewTestCase(classname, method.getName());
//                        if(counter > 100){
//                            return;
//                        }
                    }
                }
            }
        }

    }

    public static void printNewTestCase(String classname, String methodname) throws IOException {
        writer.write("    @Test(timeout=1000)\n" +
                "    public void Test" + counter + "() {\n" +
                "        if (verifyNoPropertyViolation(config)) {\n" +
                "           try {\n" +
                "               new " + classname + "()." + methodname + "();\n" +
                "           } catch (Exception e) {\n" +
                "               e.printStackTrace();\n" +
                "           }\n" +
                "        }\n" +
                "    }\n\n");
        counter++;
    }

    public static void printHeader() throws IOException {
        writer.write("package cmu.defect4j;\n" +
                "\n" +
                "import gov.nasa.jpf.util.test.TestJPF;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "public class LangTest extends TestJPF {\n" +
                "\n" +
                "    private final String[] config = {\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar\"};" +
                "\n" +
                "    public static void main(String[] testMethods){\n" +
                "        runTestsOfThisClass(testMethods);\n" +
                "    }\n");
    }

    public static void printFooter() throws IOException {
        writer.write("}");
    }

}