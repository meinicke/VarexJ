/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

package nhandler.peerGen;

import gov.nasa.jpf.vm.MethodInfo;

import java.io.*;

import org.apache.bcel.generic.Type;

/**
 * Creates the source code for the clases that are created on the fly. To
 * make this feature work, the property nhandler.genSource has to be set 
 * to true.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class PeerSourceGen {

  private File file;

  private String name;

  private String path;

  private StringBuilder content;

  protected static boolean addComment = false;

  protected static boolean genSource = false;

  protected PeerSourceGen (String name) throws IOException {
    this.name = name;
    this.path = PeerClassGen.peersLocation + name + ".java";
    this.file = new File(this.path);

    setContent();
  }

  protected File setContent () throws IOException{
    content = new StringBuilder();

    if (!this.file.exists()){
      this.file.createNewFile();
      generateMinimalPeerSource();
    } else{
      loadContent();
    }

    return this.file;
  }

  private void generateMinimalPeerSource () throws FileNotFoundException{
    printImport();
    printClassHeader();
    printDefaultConstructor();
    printClassFooter();
  }

  private void printImport (){
    append("import gov.nasa.jpf.vm.NativePeer;");
    gotoNextLine();
    append("import gov.nasa.jpf.vm.MJIEnv;");
    gotoNextLine();
    append("import ConversionException;");
    gotoNextLine();
    append("import ConverterBase;");
    gotoNextLine();
    append("import JVM2JPFConverter;");
    gotoNextLine();
    append("import JPF2JVMConverter;");
    gotoNextLine();
    append("import java.lang.reflect.InvocationTargetException;");
    gotoNextLine();
    append("import java.lang.reflect.Method;");
    gotoNextLine();
    append("import java.lang.reflect.Constructor;");
    addBlankLine();
  }

  private void printClassHeader (){
    append("public class " + this.name);
    append(" extends NativePeer");
    append(" {");
    addBlankLine();
  }

  private void printDefaultConstructor (){
    append("  public " + this.name + "()");
    append(" {");
    gotoNextLine();
    append("  }");
    addBlankLine();
  }

  protected void printClassFooter (){
    append("}");
  }

  private void append (String s){
    content.append(s);
  }

  private void loadContent (){
    BufferedReader reader = null;
    try{
      reader = new BufferedReader(new FileReader(path));
    } catch (FileNotFoundException e1){
      e1.printStackTrace();
    }

    String line = null;
    String ls = System.getProperty("line.separator");

    try{
      while ((line = reader.readLine()) != null){
        content.append(line);
        content.append(ls);
      }
    } catch (IOException e){
      e.printStackTrace();
    }
  }

  protected void removeClassFooter (){
    content.deleteCharAt(content.lastIndexOf("}"));
  }

  private void addDoubleIndent (){
    append("    ");
  }

  private void addMultipleDoubleIndent (int n){
    while(n>0) {
      append("    ");
      n--;
    }
  }

  private void gotoNextLine (){
    append("\n");
  }

  private void addBlankLine (){
    append("\n\n");
  }

  private void addComment (String comment){
    if(addComment) {
      addDoubleIndent();
      append("// " + comment);
      gotoNextLine();
    }
  }

  protected class MethodGen {
    private MethodInfo mi;

    protected MethodGen (MethodInfo mi) {
      this.mi = mi;
    }

    protected void printMethodHeader (Type returnType, String name, Type[] argsType){
      removeClassFooter();

      append("  public static");
      append(" " + ((returnType.equals(Type.OBJECT)) ? "int" : returnType.toString()));
      append(" " + name);

      if (mi.isStatic()){
        append(" (MJIEnv env, int rcls");
      } else{
        append(" (MJIEnv env, int robj");
      }


      for (int i = 3; i < argsType.length-1; i++){
        append(", " + argsType[i].toString());
        append(" arg" + (i - 3));
      }

      // Add "FeatureExpr ctx" to the end of the argument list
      append(", FeatureExpr ctx");

      append(")");
    }

    protected void printThrowsExceptions (boolean isCtor){
      gotoNextLine();
      addMultipleDoubleIndent(2);
      append("throws java.lang.IllegalArgumentException,");
      gotoNextLine();
      addMultipleDoubleIndent(3);
      append("SecurityException, NoSuchMethodException, IllegalAccessException,");
      gotoNextLine();
      addMultipleDoubleIndent(4);
      append(" ClassNotFoundException, ConversionException, InvocationTargetException");
      if(isCtor) {
        append(",");
        gotoNextLine();
        addMultipleDoubleIndent(5);
        append(" InstantiationException");
      }
      completeHeader();
    }

    protected void completeHeader (){
      append(" {");
      gotoNextLine();
    }
 
    protected void printConvertorPart (){
      gotoNextLine();
      addComment("Resest the Converter class used to converting objects/classes between JPF & JVM");

      addDoubleIndent();
      append("ConverterBase.reset(env);");
      addBlankLine();
    }

    protected void printCallerPart (){
      if (mi.isStatic()){
        addComment("Captures the class that invokes the static method to be handled in JVM");

        addDoubleIndent();
        /* Append the ctx */
        append("Class<?> caller = JPF2JVMConverter.obtainJVMCls(rcls, env, ctx);");
      } else{
        addComment("Captures the object that invokes the method to be handled in JVM");

        addDoubleIndent();
        append("Object caller = JPF2JVMConverter.obtainJVMObj(robj, env);");
      }

      addBlankLine();
    }

    protected void printCreateArgsVal (int nArgs){
      addComment("Captures the input parameters of the method to be handled in JVM");

      addDoubleIndent();
      append("Object argValue[] = new Object[" + nArgs + "];");
      gotoNextLine();
    }

    protected void printSetObjArgVal (int index){
      addDoubleIndent();
      append("argValue[" + index + "] = JPF2JVMConverter.obtainJVMObj(arg" + index + ", env);");
      gotoNextLine();
    }

    protected void printSetPrimitiveArgVal (String wrapper, int index){
      addDoubleIndent();
      append("argValue[" + index + "] = new " + wrapper + "(arg" + index + ");");
      gotoNextLine();
    }

    protected void printCreateArgsType (int nArgs){
      gotoNextLine();

      addComment("Captures the input parameters types of the method to be hanlded in JVM");

      addDoubleIndent();
      append("Class<?> argType[] = new Class[" + nArgs + "];");
      gotoNextLine();
    }

    protected void printSetObjArgType (String type, int index){
      addDoubleIndent();
      append("argType[" + index + "] = Class.forName(\"" + type + "\");");
      gotoNextLine();
    }

    protected void printSetArrArgType (int index){
      addDoubleIndent();
      append("argType[" + index + "] = argValue[" + index + "].getClass();");
      gotoNextLine();
    }

    protected void printSetPrimitiveArgType (String wrapper, int index){
      addDoubleIndent();
      append("argType[" + index + "] = " + wrapper + ".TYPE;");
      gotoNextLine();
    }

    protected void printGetCallerClass (String type){
      gotoNextLine();

      addComment("Obtains the class of the object that invokes the method to be handled");

      addDoubleIndent();
      append("Class<?> callerClass = Class.forName(\"" + type + "\");");
      gotoNextLine();
    }

    protected void printGetMethod (String mname, boolean isStatic){
      gotoNextLine();

      addComment("Obtains the Method instance of the method to be handled");

      addDoubleIndent();
      if (isStatic){
        append("Method method = caller.getDeclaredMethod(\"" + mname + "\", argType);");
      } else{
        append("Method method = callerClass.getDeclaredMethod(\"" + mname + "\", argType);");
      }
      addBlankLine();
    }

    protected void printGetCtor (String mname){
      gotoNextLine();

      addComment("Obtains the instance of the constructor to be handled");

      addDoubleIndent();
      append("Constructor ctor = callerClass.getDeclaredConstructor(argType);");
      addBlankLine();
    }

    protected void printSetAccessible (boolean isCtor){
      addComment("Makes the method with any access modifier accessible");

      addDoubleIndent();
      String mname = isCtor? "ctor" : "method";
      append(mname + ".setAccessible(true);");
      addBlankLine();
    }

    protected void printInvokeMethod (boolean isStatic){
      addComment("Invokes the method to be handled in JVM");

      addDoubleIndent();
      if (isStatic){
        append("Object returnValue = method.invoke(null, argValue);");
      } else{
        append("Object returnValue = method.invoke(caller, argValue);");
      }
      addBlankLine();
    }

    protected void creatNewInstance (){
      addComment("Creates an instance by invoking the constructor to be handled in JVM");

      addDoubleIndent();

      append("Object returnValue = ctor.newInstance(argValue);");
      addBlankLine();
    }

    protected void printConvertReturnValue (){
      addComment("Converts the return value from JVM to JPF");

      addDoubleIndent();
      append("int JPFObj = JVM2JPFConverter.obtainJPFObj(returnValue, env);");
      addBlankLine();
    }

    protected void printUpdateCaller (boolean isStatic){
      if (isStatic){
        addComment("Updates the class that invokes the method to be handle in JPF");

        addDoubleIndent();
        /* Append the ctx */
        append("JVM2JPFConverter.obtainJPFCls(caller, env, ctx);");
      } else{
        addComment("Updates the object that invokes the method to be handled in JPF");

        addDoubleIndent();
        append("JVM2JPFConverter.updateJPFObj(caller, robj, env);");
      }
      addBlankLine();

      addUpdateArgsComment = true;
    }

    protected void printUpdateCtorCaller (){
      addComment("Updates the object that invokes the method to be handled in JPF");

      addDoubleIndent();
      append("JVM2JPFConverter.updateJPFObj(returnValue, robj, env);");
      addBlankLine();

      addUpdateArgsComment = true;
    }

    private boolean addUpdateArgsComment = false;

    protected void printUpdateJPFArgs (int index, int nArgs){
      if (addUpdateArgsComment){
        addComment("Updates the input parameters objects of the method to be handled");
        addUpdateArgsComment = false;
      }

      addDoubleIndent();
      append("JVM2JPFConverter.updateJPFObj(argValue[" + index + "], arg" + index + ", env);");
      if(index == nArgs-1) {
        addBlankLine();
      } else {
        gotoNextLine();
      }
    }

    protected void printReturn (){
      addDoubleIndent();
      append("return;");
      gotoNextLine();
    }

    protected void printReturnObj (){
      addComment("Returns the return value that is converted to a JPF object");

      addDoubleIndent();
      append("return JPFObj;");
      gotoNextLine();
    }

    protected void printReturnPrimitive (String wrapper, String methodName){
      addDoubleIndent();
      append("return ((" + wrapper + ")returnValue)." + methodName + "();");
      gotoNextLine();
    }

    protected void printDummyReturnStatement (){
      String returnType = this.mi.getReturnTypeName();
      addDoubleIndent();

      if (!PeerMethodGen.isPrimitiveType(returnType)){
        append("return -1;");
      } else if ("void".equals(returnType)){
        append("return;");
      } else{
        if ("boolean".equals(returnType)){
          append("return false;");
        } else if ("int".equals(returnType)){
          append("return 0;");
        } else if ("long".equals(returnType)){
          append("return 0;");
        } else if ("byte".equals(returnType)){
          append("return 0;");
        } else if ("char".equals(returnType)){
          append("return 0;");
        } else if ("short".equals(returnType)){
          append("return 0;");
        } else if ("float".equals(returnType)){
          append("return 0.0;");
        } else if ("double".equals(returnType)){
          append("return 0.0;");
        }
      }

      gotoNextLine();
    }

    protected void wrapUpSource (){
      printFooter();
      writeToFile();
    }

    private void printFooter (){
      append("  }");
      gotoNextLine();
      append("}");
      gotoNextLine();
    }

    private void writeToFile (){
      PrintWriter pw = null;

      try{
        pw = new PrintWriter(file);
      } catch (FileNotFoundException e){
        e.printStackTrace();
      }

      pw.append(content);
      pw.flush();
    }
  }
}
