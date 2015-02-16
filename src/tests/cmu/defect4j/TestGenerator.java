package cmu.defect4j;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author: chupanw
 */
public class TestGenerator {
    public static Integer counter;
    public static String pathPrefix = "/Users/chupanw/IdeaProjects/VarexJ/src/tests/cmu/defect4j/";
    public static String packageNamePrefix = "cmu.defect4j.";
    public static int timeout = 120000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        counter = 1;
        SearchLangTest();
//        SearchMathTest();
    }

    public static void SearchLangTest() throws ClassNotFoundException, IOException {

        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/lang_1_buggy/src/test/");

        for (File file : files){
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("org"), filepath.indexOf("."));
            String full_class_name = filepath.replace("/", ".");

            String className = full_class_name.split("\\.")[full_class_name.split("\\.").length - 1];
            String pathSuffix = filepath.substring(filepath.indexOf("lang3"));
            String packageNameSuffix = full_class_name.substring(full_class_name.indexOf("lang3"), full_class_name.indexOf(className)-1);

            // Only generate files that have test cases
            boolean haveTest = false;
            Class<?> c = Class.forName(full_class_name);
            Method [] methods = c.getMethods();
            for (Method method : methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Test){
                        haveTest = true;
                    }
                }
            }

            if(!haveTest) {
                // skip, because there is no test caes in this file
                continue;
            }

            /*
            * Filter:
            *   concurrent related test cases
            *   other test cases that could not compile (TODO)
            */
//            if(full_class_name.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest")){
//                continue;
//            }
            if(full_class_name.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderConcurrencyTest")) {
                continue;
            }
            if(full_class_name.equals("org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest")) {
                continue;
            }
            if(full_class_name.equals("org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest")) {
                continue;
            }
            if(full_class_name.split("\\.")[full_class_name.split("\\.").length-2].equals("concurrent")){
                continue;
            }
            if(full_class_name.equals("org.apache.commons.lang3.exception.AbstractExceptionContextTest")){
                continue;
            }
            if(full_class_name.equals("org.apache.commons.lang3.ObjectUtilsTest")){
                continue;
            }


            System.out.println(className);

            File newfile = new File(pathPrefix + pathSuffix + ".java");
            newfile.getParentFile().mkdirs();
            FileWriter writer = new FileWriter(newfile);

            printHeader(writer, packageNameSuffix, className);

            c = Class.forName(full_class_name);
            methods = c.getMethods();
            // check for @before annotation
            String beforeMethodName = null;
            for (Method method: methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Before){
                        if (beforeMethodName != null){
                            System.out.println("More than one @before!");
                        }
                        beforeMethodName = method.getName();
                    }
                }
            }
            for (Method method : methods){
                String expectedName = null;
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Test){
                        String texpectedName = ((Test) annotation).expected().getName();
                        if(!texpectedName.equals("org.junit.Test$None")){
                            expectedName = texpectedName;
                            System.out.println("\t" + expectedName);
                        }

                        printNewTestCase(writer, full_class_name, method.getName(), beforeMethodName, expectedName);
                    }
                }
            }

            printFooter(writer);

            writer.close();



        }

    }


    public static void SearchMathTest() throws ClassNotFoundException, IOException {

        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/math_1_buggy/src/test/java/");

        for (File file : files){
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("org"), filepath.indexOf("."));
            String full_class_name = filepath.replace("/", ".");

            String className = full_class_name.split("\\.")[full_class_name.split("\\.").length - 1];
            String pathSuffix = filepath.substring(filepath.indexOf("math3"));
            String packageNameSuffix = full_class_name.substring(full_class_name.indexOf("math3"), full_class_name.indexOf(className)-1);

            // Only generate files that have test cases
            boolean haveTest = false;
            Class<?> c = Class.forName(full_class_name);
            Method [] methods = c.getMethods();
            for (Method method : methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Test){
                        System.out.println(full_class_name + ": " + annotation);
                        haveTest = true;
                    }
                }
            }

//            System.out.println(className);

            if(!haveTest) {
                // skip, because there is no test caes in this file
                continue;
            }

            /*
            * Filter:
            *   concurrent related test cases
            *   other test cases that could not compile (TODO)
            */

            if(full_class_name.endsWith("AbstractTest")) {
                continue;
            }


            File newfile = new File(pathPrefix + pathSuffix + ".java");
            newfile.getParentFile().mkdirs();
            FileWriter writer = new FileWriter(newfile);

            printHeader(writer, packageNameSuffix, className);

            c = Class.forName(full_class_name);
            methods = c.getMethods();
            // check for @before annotation
            String beforeMethodName = null;
            for (Method method: methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Before){
                        if (beforeMethodName != null){
                            System.out.println("More than one @before!");
                        }
                        beforeMethodName = method.getName();
                    }
                }
            }
            for (Method method : methods){
                String expectedName = null;
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if (annotation instanceof Test){
                        String texpectedName = ((Test) annotation).expected().getName();
                        if(!texpectedName.equals("org.junit.Test$None")){
                            expectedName = texpectedName;
                            System.out.println("\t" + expectedName);
                        }

                        printNewTestCase(writer, full_class_name, method.getName(), beforeMethodName, expectedName);
                    }
                }
            }

            printFooter(writer);

            writer.close();



        }

    }


    public static void printNewTestCase(FileWriter writer, String classname, String methodname, String before, String expected) throws IOException {
        writer.write("    @Test(timeout=" + timeout + ")\n" +
                "    public void " + methodname + "() throws Exception {\n");
        if(expected==null) {
            writer.write(
                    "        if (verifyNoPropertyViolation(config)) {\n"
            );
        }
        else {
            writer.write(
                    "        if (verifyUnhandledException(" + "\"" + expected + "\"" +  ", config)) {\n"
            );
        }
        // create test object
        writer.write(
                "               " + classname + " object = new " + classname + "();\n"
        );
        if (before != null) {
            writer.write(
                    "               object." + before + "();\n"
            );
        }
        writer.write(
                "               object." + methodname + "();\n" +
                "        }\n" +
                "    }\n\n");
        counter++;
    }

    public static void printHeader(FileWriter writer, String packageNameSuffix, String className) throws IOException {
        writer.write("package cmu.defect4j." + packageNameSuffix + ";\n" +
                "\n" +
                "import gov.nasa.jpf.util.test.TestJPF;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "public class " + className + " extends TestJPF {\n" +
                "\n" +
                "    private final String[] config = {\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar\"};" +
                "\n" +
                "    public static void main(String[] testMethods){\n" +
                "        runTestsOfThisClass(testMethods);\n" +
                "    }\n");
    }

    public static void printFooter(FileWriter writer) throws IOException {
        writer.write("}");
    }

}