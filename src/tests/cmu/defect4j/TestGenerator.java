package cmu.defect4j;

import junit.framework.TestCase;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

/**
 * @author: chupanw
 */
public abstract class TestGenerator {
    public String pathPrefix = "/Users/chupanw/IdeaProjects/VarexJ/src/defects4j-tests/cmu/defect4j/";
    public String packageNamePrefix = "cmu.defect4j.";
    public int timeout = 120000;

    public abstract void searchTest();

    public void printNewTestCaseJunit4(FileWriter writer, String classname, String methodname, String before, String expected) throws IOException {
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
    }

    public void printNewTestCaseJunit3(FileWriter writer, String classname, String methodname) throws IOException {
        writer.write("\t@Test(timeout=" + timeout + ")\n");
        writer.write("\tpublic void " + methodname + "() throws Exception {\n");
        writer.write("\t\tif (verifyNoPropertyViolation(config)) {\n");
        writer.write("\t\t\t" + "TestCase" + " testcase = new " + classname + "(\"" + methodname + "\");\n");
        writer.write("\t\t\ttestcase.run();\n");
        writer.write("\t\t}\n" + "\t}\n\n");
    }

    public void printNewTestCaseJunit3Null(FileWriter writer, String classname, String methodname) throws IOException{
        writer.write("\t@Test(timeout=" + timeout + ")\n");
        writer.write("\tpublic void " + methodname + "() throws Exception {\n");
        writer.write("\t\tif (verifyNoPropertyViolation(config)) {\n");
        writer.write("\t\t\t" + "TestCase" + " testcase = new " + classname + "() {\n");
        writer.write("\t\t\t\t" + "public void runTest() throws Exception {\n");
        writer.write("\t\t\t\t\t" + methodname + "();\n");
        writer.write("\t\t\t\t" + "}\n");
        writer.write("\t\t\t" + "};\n");
        writer.write("\t\t\ttestcase.run();\n");
        writer.write("\t\t}\n" + "\t}\n\n");
    }

    public void printRunMain(FileWriter writer, String classname) throws IOException {
        writer.write("\t//Don't know how to run each test case separately for this class\n");
        writer.write("\t@Test(timeout=" + timeout + ")\n");
        writer.write("\tpublic void " + "Main" + "() throws Exception {\n");
        writer.write("\t\tif (verifyNoPropertyViolation(config)) {\n");
        writer.write("\t\t\t" + classname + "." + "main(null);\n");
        writer.write("\t\t}\n" + "\t}\n\n");
    }

    public void printHeaderJunit4(FileWriter writer, String packageNameSuffix, String className, String config) throws IOException {
        writer.write("package cmu.defect4j." + packageNameSuffix + ";\n" +
                "\n" +
                "import gov.nasa.jpf.util.test.TestJPF;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "public class " + className + " extends TestJPF {\n" +
                "\n" +
                "    private final String[] config = {"+config+"};" +
                "\n" +
                "    public static void main(String[] testMethods){\n" +
                "        runTestsOfThisClass(testMethods);\n" +
                "    }\n");
    }

    public void printHeaderJunit3(FileWriter writer, String packageNameSuffix, String className, String config) throws IOException {
        writer.write("package cmu.defect4j." + packageNameSuffix + ";\n" +
                "\n" +
                "import gov.nasa.jpf.util.test.TestJPF;\n" +
                "import org.junit.Test;\n" +
                "import junit.framework.TestCase;" +
                "\n" +
                "public class " + className + " extends TestJPF {\n" +
                "\n" +
                "    private final String[] config = {"+config+"};" +
                "\n\n" +
                "    public static void main(String[] testMethods){\n" +
                "        runTestsOfThisClass(testMethods);\n" +
                "    }\n");

    }



    public void printFooter(FileWriter writer) throws IOException {
        writer.write("}");
    }

    public boolean haveTestJunit3(String full_class_name){
        boolean haveTest = false;
        boolean extendTestCase = false;
        Class<?> c = null;
        try{
            c = Class.forName(full_class_name);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        LinkedList<Class> l = new LinkedList<>();
        getSuperClasses(c, l);
        if (l.contains(TestCase.class)){
            extendTestCase = true;
        }

        if(extendTestCase){
            LinkedList<Method> methods = getDeclaredPublicMethods(c);
            for (Method method : methods){
                if (method.getName().startsWith("test")){
                    haveTest = true;
                }
            }
        }
        return haveTest;
    }

    public void getSuperClasses(Class<?> c, LinkedList<Class> l){
        Class<?> ancestor = c.getSuperclass();
        if (ancestor != null){
            l.add(ancestor);
            getSuperClasses(ancestor, l);
        }
    }

    public LinkedList<Method> getDeclaredPublicMethods(Class<?> c){
        LinkedList<Method> l = new LinkedList<>();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods){
            if(Modifier.toString(method.getModifiers()).contains("public")){
                l.add(method);
            }
        }
        return l;
    }

    public boolean hasParameters(Method m){
        if(m.getParameterTypes().length!=0){
            return true;
        }
        return false;
    }

}