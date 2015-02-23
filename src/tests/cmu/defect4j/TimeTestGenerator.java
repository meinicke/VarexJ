package cmu.defect4j;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author: chupanw
 */
public class TimeTestGenerator extends TestGenerator{
    private String config = "\"+nhandler.delegateUnhandledNative\", \"+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/\"";

    public static void main(String[] args) {
        TimeTestGenerator generator = new TimeTestGenerator();
        generator.searchTest();
    }
    @Override
    public void searchTest() {
        FileDetector detector = new FileDetector("java");
        File[] files = detector.detect("/Users/chupanw/Projects/time_1_buggy/src/test/");

        for (File file : files){
            String filepath = file.getAbsolutePath();
            filepath = filepath.substring(filepath.indexOf("org"), filepath.indexOf("."));
            String full_class_name = filepath.replace("/", ".");

            String className = full_class_name.split("\\.")[full_class_name.split("\\.").length - 1];
            String pathSuffix = filepath.substring(filepath.indexOf("joda"));
            String packageNameSuffix = full_class_name.substring(full_class_name.indexOf("joda"), full_class_name.indexOf(className) - 1);

            if(!haveTestJunit3(full_class_name)){
                continue;
            }

            /* Filter [Optional] */
            if (full_class_name.equals("org.joda.time.chrono.gj.MainTest")) {
                continue;
            }

            File javaFile = new File(pathPrefix + pathSuffix + ".java");
            javaFile.getParentFile().mkdirs();
            FileWriter writer = null;

            try{

                /* Check setUp and tearDown method */
                Class<?> c = Class.forName(full_class_name);
                Method[] methods = c.getMethods();
                boolean have_null_constructor = true;

                try{
                    Constructor constructor = c.getDeclaredConstructor();
                } catch (NoSuchMethodException e){
                    have_null_constructor = false;
                }

                if(have_null_constructor){
                    boolean hasMain = false;
                    for (Method method : methods){
                        if(method.getName().equals("main")){
                            hasMain = true;
                        }
                    }
                    if(!hasMain){
                        continue;
                    }
                    writer = new FileWriter(javaFile);
                    printHeaderJunit3(writer, packageNameSuffix, className, config);
                    System.out.println(full_class_name + " has null constructor");
                    printRunMain(writer, full_class_name);
                    printFooter(writer);
                    writer.close();
                    continue;
                }

                writer = new FileWriter(javaFile);
                printHeaderJunit3(writer, packageNameSuffix, className, config);
                /* Generate test case methods separately */
                for (Method method : methods){
                    // starsWith may be problematic
                    if (method.getName().startsWith("test")){
                        printNewTestCaseJunit3(writer, full_class_name, method.getName());
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
