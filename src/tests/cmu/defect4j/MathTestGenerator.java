package cmu.defect4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

/**
 * @author: chupanw
 */
public class MathTestGenerator extends TestGenerator {

    private String config = "\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar\"";

    public static void main(String[] args) {
        MathTestGenerator generator = new MathTestGenerator();
        generator.searchTest();
    }

    @Override
    public void searchTest() {
        //cpwTODO: deal with @After
        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/math_1_buggy/src/test/java/");

        for (File file : files) {
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("org"), filepath.indexOf("."));
            String full_class_name = filepath.replace("/", ".");

            String className = full_class_name.split("\\.")[full_class_name.split("\\.").length - 1];
            String pathSuffix = filepath.substring(filepath.indexOf("math3"));
            String packageNameSuffix = full_class_name.substring(full_class_name.indexOf("math3"), full_class_name.indexOf(className) - 1);

            // Only generate files that have test cases
            boolean haveTest = false;
            Class<?> c = null;
            try {
                c = Class.forName(full_class_name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Method[] methods = c.getMethods();
            for (Method method : methods) {
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Test) {
                        haveTest = true;
                    }
                }
            }

//            System.out.println(className);

            if (!haveTest) {
                // skip, because there is no test caes in this file
                continue;
            }

            if(Modifier.toString(c.getModifiers()).contains("abstract")){
                System.out.println(full_class_name + " is abstract");
                continue;
            }

            boolean hasParameters = false;
            methods = c.getMethods();
            for(Method method : methods){
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations){
                    if(annotation instanceof Parameterized.Parameters){
                        System.out.println(full_class_name + "has @Parameters, not supported yet");
                        hasParameters = true;
                    }
                }
            }

            if(hasParameters){
                continue;
            }

            /*
            * Filter [Optional]:
            *   concurrent related test cases
            */



            File newfile = new File(pathPrefix + pathSuffix + ".java");
            newfile.getParentFile().mkdirs();
            FileWriter writer = null;

            try {
                writer = new FileWriter(newfile);

                printHeaderJunit4(writer, packageNameSuffix, className, config);

                c = Class.forName(full_class_name);
                methods = c.getMethods();
                // check for @before annotation
                String beforeMethodName = null;
                for (Method method : methods) {
                    Annotation[] annotations = method.getAnnotations();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof Before) {
                            if (beforeMethodName != null) {
                                System.out.println("More than one @before!");
                            }
                            beforeMethodName = method.getName();
                        }
                    }
                }
                for (Method method : methods) {
                    String expectedName = null;
                    Annotation[] annotations = method.getAnnotations();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof Test) {
                            String texpectedName = ((Test) annotation).expected().getName();
                            if (!texpectedName.equals("org.junit.Test$None")) {
                                expectedName = texpectedName;
                            }

                            printNewTestCaseJunit4(writer, full_class_name, method.getName(), beforeMethodName, expectedName);
                        }
                    }
                }

                printFooter(writer);

                writer.close();

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        System.out.println("Finished");
    }

    //Override because testMath899Sync throws Throwable instead of Exception
    @Override
    public void printNewTestCaseJunit4(FileWriter writer, String classname, String methodname, String before, String expected) throws IOException {
        writer.write("    @Test(timeout=" + timeout + ")\n" +
                "    public void " + methodname + "() throws ");
        if (classname.equals("org.apache.commons.math3.random.SynchronizedRandomGeneratorTest") && methodname.equals("testMath899Sync")){
            writer.write("Throwable {\n");
        }
        else{
            writer.write("Exception {\n");
        }
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
    }
}
