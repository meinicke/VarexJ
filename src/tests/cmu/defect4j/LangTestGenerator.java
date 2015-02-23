package cmu.defect4j;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
* @author: chupanw
*/
public class LangTestGenerator extends TestGenerator{

    private String config = "\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar\"";
    @Override
    public void searchTest() {
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
            Class<?> c = null;
            try {
                c = Class.forName(full_class_name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Method[] methods = c.getMethods();
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
            *   other test cases that could not compile (cpwTODO)
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

//            File newfile = new File(pathPrefix + pathSuffix + ".java");
//            newfile.getParentFile().mkdirs();
//            FileWriter writer = new FileWriter(newfile);

//            printHeaderJunit4(writer, packageNameSuffix, className, config);

            try {
                c = Class.forName(full_class_name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
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
                    if (annotation instanceof After){
                        System.out.println("@After identified");
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

//                        printNewTestCaseJunit4(writer, full_class_name, method.getName(), beforeMethodName, expectedName);
                    }
                }
            }
//            printFooter(writer);
//            writer.close();
        }

    }
}