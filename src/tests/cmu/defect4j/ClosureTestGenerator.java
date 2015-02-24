package cmu.defect4j;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

/**
 * @author: chupanw
 */
public class ClosureTestGenerator extends TestGenerator{
    private String config = "\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar\"";

    public static void main(String[] args) {
        ClosureTestGenerator generator = new ClosureTestGenerator();
        generator.searchTest();
    }
    @Override
    public void searchTest() {
        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/closure_1_buggy/test/");

        for (File file : files){
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("com"), filepath.indexOf("."));
            String full_class_name = filepath.replace("/", ".");

            String className = full_class_name.split("\\.")[full_class_name.split("\\.").length - 1];
            String pathSuffix = filepath.substring(filepath.indexOf("google"));
            String packageNameSuffix = full_class_name.substring(full_class_name.indexOf("google"), full_class_name.indexOf(className) - 1);

            if(!haveTestJunit3(full_class_name)){
                continue;
            }

            /* Filter [Optional] */

            File javaFile = new File(pathPrefix + pathSuffix + ".java");
            javaFile.getParentFile().mkdirs();
            FileWriter writer = null;


            try{
                Class<?> c = Class.forName(full_class_name);
                if(Modifier.toString(c.getModifiers()).contains("abstract")){
                    System.out.println(full_class_name + " is abstract");
                    continue;
                }
                LinkedList<Method> methods = getDeclaredPublicMethods(c);
                boolean have_null_constructor = true;

                try{
                    Constructor constructor = c.getDeclaredConstructor();
                } catch (NoSuchMethodException e){
                    have_null_constructor = false;
                }

                writer = new FileWriter(javaFile);
                printHeaderJunit3(writer, packageNameSuffix, className, config);
                /* Generate test case methods separately */
                for (Method method : methods){
                    // skip public methods that has parameter(s)
                    if (hasParameters(method)){
                        continue;
                    }
                    // starsWith may be problematic
                    if (method.getName().startsWith("test")){
                        if(!have_null_constructor) {
                            printNewTestCaseJunit3(writer, full_class_name, method.getName());
                        }
                        else{
                            printNewTestCaseJunit3Null(writer, full_class_name, method.getName());
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
}
