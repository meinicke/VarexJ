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

import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativeMethodInfo;
import gov.nasa.jpf.vm.Types;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.*;

/**
 * Creates the body of the methods within the native peer class using the Byte
 * Code Engineering Library (BCEL).
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class PeerMethodGen {

  private InstructionList il;

  private NativeMethodInfo mi;

  private MethodGen nativeMth;

  private String name;

  private PeerClassGen peerClassGen;

  private static final int methodAcc = Constants.ACC_PUBLIC | Constants.ACC_STATIC;

  private static final String conversionPkg = "nhandler.conversion";

  private static final String jpf2jvmConverter = conversionPkg + ".jpf2jvm.JPF2JVMConverter";

  private static final String jvm2jpfConverter = conversionPkg + ".jvm2jpf.JVM2JPFConverter";

  private static final String mjiEnvCls = "gov.nasa.jpf.vm.MJIEnv";

  private static final Type mjiEnvType = new ObjectType(mjiEnvCls);

  // Adaptation to VarexJ
  private static int ctxIndex;
  private static final String FeatureExprCls = "de.fosd.typechef.featureexpr.FeatureExpr";
  private static final Type FeatureExprType = new ObjectType(FeatureExprCls);

  private PeerSourceGen.MethodGen sourceGen; 

  MJIEnv env;

  public static boolean updateJPFState;

  /**
   * Creates a new instance of the PeerMethodCreator class.
   * 
   * @param mi
   *          an object that represents a native method in JPF
   * 
   * @param pcg
   *          a bytecode generator for to the class of the given method
   * 
   * @param psg
   *          a source code generator for the class of the given method
   */
  public PeerMethodGen (NativeMethodInfo mi, MJIEnv env, PeerClassGen pcg, PeerSourceGen psg) {
    this.peerClassGen = pcg;
    this.il = new InstructionList();
    this.mi = mi;
    this.name = getJNIName(mi);
    this.env = env;
    Type returnType = PeerMethodGen.getType(mi.getReturnTypeName());
    Type[] argsType = PeerMethodGen.getArgumentsType(mi);
    this.nativeMth = new MethodGen(methodAcc, (returnType.equals(Type.OBJECT)) ? Type.INT : returnType, argsType, PeerMethodGen.getArgumentsName(mi), name, PeerClassGen.getNativePeerClsName(mi.getClassName()), il, peerClassGen._cp);

    if(genSource()) {
      this.sourceGen = psg.new MethodGen(mi);
      this.sourceGen.printMethodHeader(returnType, name, argsType);
    }
  }

  private boolean genSource() {
    return(PeerSourceGen.genSource);
  }

  /**
   * Creates bytecode for the body of the method, and adds it to the peer class
   * of this method.
   */
  public void create() {
    if(mi.isClinit()) {
      this.createClinit();
    } else if(mi.isCtor()) {
      this.createCtor();
    } else {
      this.createMethod();
    }

    if(genSource()) {
      sourceGen.wrapUpSource();
    }

    this.nativeMth.setMaxStack();
    this.nativeMth.setMaxLocals();
    peerClassGen._cg.addMethod(this.nativeMth.getMethod());
    this.il.dispose();
  }

  private void createMethod (){
    this.addException();
    this.createResetConverterBase();
    int caller = this.createCaller();
    int argValue = this.createArgValue();
    int argType = this.createArgType(argValue);
    int callerClass = this.getCallerClass(caller);
    int method = this.getMethod(callerClass, argType);
    this.setAccessible(method);
    int returnValue = this.invokeMethod(caller, method, argValue);
    int jpfReturnValue = -1;

    if (!mi.getReturnTypeName().equals("void")){
      if (!PeerMethodGen.isPrimitiveType(this.mi.getReturnTypeName())){
        // If the method is not of type void, converts returnValue to a JPF
        // object
        jpfReturnValue = this.convertJVM2JPF(returnValue);
      } else {
        jpfReturnValue = returnValue;
      }
    }

    if(updateJPFState) {
      if (mi.isStatic())
        this.updateJPFClass(callerClass);
      else
        this.updateJPFObj(caller, 1);

      this.updateJPFArguments(argValue);
    }

    this.addReturnStatement(jpfReturnValue);
  }

  private void createCtor (){
    this.addException();
    this.createResetConverterBase();
    int argValue = this.createArgValue();
    int argType = this.createArgType(argValue);
    int callerClass = this.getCallerClass(MJIEnv.NULL);
    int ctor = this.getConstructor(callerClass, argType);
    this.setAccessible(ctor);
    int returnValue = this.createNewInstance(ctor, argValue);
    this.updateJPFObj(returnValue, 1);
    this.updateJPFArguments(argValue);
    this.addReturnStatement(MJIEnv.NULL);
  }

  private void createClinit (){
    this.addException();
    this.createResetConverterBase();
    int caller = this.createCaller();
    int callerClass = this.getCallerClass(caller);
    this.updateJPFClass(callerClass);
    // just set it to some dummy value, since the method is of type of void
    this.addReturnStatement(MJIEnv.NULL);
  }

  /**
   * Creates bytecode for the empty method, and adds it to the peer class
   * of this method.
   */
  public void createEmpty (){
    if(genSource()) {
      sourceGen.completeHeader();
    }

    this.addDummyReturnStatement();

    this.nativeMth.setMaxStack();
    this.nativeMth.setMaxLocals();
    peerClassGen._cg.addMethod(this.nativeMth.getMethod());
    this.il.dispose();

    if(genSource()) {
      sourceGen.wrapUpSource();
    }
  }

  /**
   * Adds bytecode to the body of the method for exceptions that are possibly
   * thrown by this method. Adds "throws SecurityException,
   * NoSuchMethodException, IllegalAccessException" to the declaration of the
   * method.
   */
  private void addException (){
    this.nativeMth.addException("java.lang.IllegalArgumentException");
    this.nativeMth.addException("java.lang.SecurityException");
    this.nativeMth.addException("java.lang.NoSuchMethodException");
    this.nativeMth.addException("java.lang.IllegalAccessException");
    this.nativeMth.addException("java.lang.ClassNotFoundException");
    this.nativeMth.addException(conversionPkg + ".ConversionException");
    this.nativeMth.addException("java.lang.ClassNotFoundException");
    this.nativeMth.addException("java.lang.reflect.InvocationTargetException");

    if(mi.isCtor()) {
      this.nativeMth.addException("java.lang.InstantiationException");
    }

     if(genSource()) {
       sourceGen.printThrowsExceptions(mi.isCtor());
     }
  }

  /**
   * Adds bytecode to the body of the method that resets the Converter Class. 
   * Adds "Converter.reset(env)" to the body of the method.
   */
  private void createResetConverterBase (){
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
    il.append(peerClassGen._factory.createInvoke(conversionPkg + ".ConverterBase", "reset", Type.VOID, new Type[] { new ObjectType("gov.nasa.jpf.vm.MJIEnv") }, Constants.INVOKESTATIC));
    
    if(genSource()) {
      this.sourceGen.printConvertorPart();
    }
  }

  /**
   * For the non-static method, adds bytecode to the body of the method that
   * creates a new instance of the object invoking the native method. For static
   * method, adds bytecode to the body of the method that creates an instance of
   * the Class class representing the class invoking the native method.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @return an index of the local variable that represents the caller object
   *         (non-static method) or class (static method)
   */
  private int createCaller (){
    LocalVariableGen lg;
    // Adaptation to VarexJ
    this.il.append(InstructionFactory.createLoad(Type.INT, 1));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));

    // FeatureExpr ctx is always the last argument
    this.il.append(InstructionFactory.createLoad(Type.OBJECT,ctxIndex));

//    Type[] types = { Type.INT, mjiEnvType };

    /* Change the types to include FeatureExpr */
    Type[] types = { Type.INT, mjiEnvType, FeatureExprType };

    if (this.mi.isStatic()){
      this.il.append(peerClassGen._factory.createInvoke(jpf2jvmConverter, "obtainJVMCls", new ObjectType("java.lang.Class"), types, Constants.INVOKESTATIC));
      lg = this.nativeMth.addLocalVariable("caller", new ObjectType("java.lang.Class"), null, null);
    } else{
      this.il.append(peerClassGen._factory.createInvoke(jpf2jvmConverter, "obtainJVMObj", Type.OBJECT, types, Constants.INVOKESTATIC));
      lg = this.nativeMth.addLocalVariable("caller", Type.OBJECT, null, null);
    }

    int caller = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, caller));

    if(genSource()) {
      this.sourceGen.printCallerPart();
    }
    return caller;
  }

  /**
   * Adds bytecode to the body of the method that creates an array of type
   * Object including the arguments values of the method.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @return an index of the local variable which is an array of type Object
   *         including the arguments values of the method
   */
  private int createArgValue (){
    String[] argTypes = this.mi.getArgumentTypeNames();
    int nArgs = argTypes.length;

    /** Create an array of objects (Object[] args = new Objects[nArgs]) */
    this.il.append(new PUSH(peerClassGen._cp, nArgs));
    this.il.append(peerClassGen._factory.createNewArray(Type.OBJECT, (short) 1));
    LocalVariableGen lg = this.nativeMth.addLocalVariable("argValue", new ArrayType(Type.OBJECT, 1), null, null);
    int argValue = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, argValue));

    if(genSource()) {
      this.sourceGen.printCreateArgsVal(nArgs);
    }

    /** Setting args elements to the arguments of the native method */
    // To skip the first and second arguements (MJIEnv & objRef/clsRef)
    int j = 2;
    for (int i = 0; i < nArgs; i++){
      // Loading the array element args[i];
      this.il.append(InstructionFactory.createLoad(Type.OBJECT, argValue));
      this.il.append(new PUSH(peerClassGen._cp, i));
      // if the current argument representing an object
      if (!PeerMethodGen.isPrimitiveType(argTypes[i])){
//        Type[] types = { Type.INT, mjiEnvType };
        // Include the FeatureExpr ctx
        Type[] types = { Type.INT, mjiEnvType, FeatureExprType };
        this.il.append(InstructionFactory.createLoad(Type.INT, j));
        this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
        // Load the FeatureExpr ctx local variable
        this.il.append(InstructionFactory.createLoad(Type.OBJECT, ctxIndex));
        this.il.append(peerClassGen._factory.createInvoke(jpf2jvmConverter, "obtainJVMObj", Type.OBJECT, types, Constants.INVOKESTATIC));
        j++;

        if(genSource()) {
            this.sourceGen.printSetObjArgVal(i);
        }
      } else {
    	String wrapperName = null;
        // if the current argument representing a primitive type we create the
        // corresponding wrapper class
        if ("boolean".equals(argTypes[i])){
          wrapperName = "Boolean";
          this.il.append(peerClassGen._factory.createNew("java.lang.Boolean"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.BOOLEAN, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Boolean", "<init>", Type.VOID, new Type[] { Type.BOOLEAN }, Constants.INVOKESPECIAL));
          j++;
        } else if ("int".equals(argTypes[i])){
          wrapperName = "Integer";
          this.il.append(peerClassGen._factory.createNew("java.lang.Integer"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.INT, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Integer", "<init>", Type.VOID, new Type[] { Type.INT }, Constants.INVOKESPECIAL));
          j++;
        } else if ("long".equals(argTypes[i])){
          wrapperName = "Long";
          this.il.append(peerClassGen._factory.createNew("java.lang.Long"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.LONG, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Long", "<init>", Type.VOID, new Type[] { Type.LONG }, Constants.INVOKESPECIAL));
          j += 2;
        } else if ("byte".equals(argTypes[i])){
          wrapperName = "Byte";
          this.il.append(peerClassGen._factory.createNew("java.lang.Byte"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.BYTE, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Byte", "<init>", Type.VOID, new Type[] { Type.BYTE }, Constants.INVOKESPECIAL));
          j++;
        } else if ("char".equals(argTypes[i])){
          wrapperName = "Character";
          this.il.append(peerClassGen._factory.createNew("java.lang.Character"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.CHAR, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Character", "<init>", Type.VOID, new Type[] { Type.CHAR }, Constants.INVOKESPECIAL));
          j++;
        } else if ("short".equals(argTypes[i])){
          wrapperName = "Short";
          this.il.append(peerClassGen._factory.createNew("java.lang.Short"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.SHORT, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Short", "<init>", Type.VOID, new Type[] { Type.SHORT }, Constants.INVOKESPECIAL));
          j++;
        } else if ("float".equals(argTypes[i])){
          wrapperName = "Float";
          this.il.append(peerClassGen._factory.createNew("java.lang.Float"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.FLOAT, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Float", "<init>", Type.VOID, new Type[] { Type.FLOAT }, Constants.INVOKESPECIAL));
          j++;
        } else if ("double".equals(argTypes[i])){
          wrapperName = "Double";
          this.il.append(peerClassGen._factory.createNew("java.lang.Double"));
          this.il.append(InstructionConstants.DUP);
          this.il.append(InstructionFactory.createLoad(Type.DOUBLE, j));
          this.il.append(peerClassGen._factory.createInvoke("java.lang.Double", "<init>", Type.VOID, new Type[] { Type.DOUBLE }, Constants.INVOKESPECIAL));
          j += 2;
        }

        if(genSource()) {
          sourceGen.printSetPrimitiveArgVal(wrapperName, i);
        }
      }
      this.il.append(InstructionConstants.AASTORE);
    }
    return argValue;
  }

  /**
   * Adds bytecode to the body of the method that creates an array of type
   * Class<?> including the type of the arguments of the method
   * 
   * @param argValue
   *          an index of the local variable which is an array of type Object
   *          including the arguments of the method
   * 
   * @return an index of the local variable which is an array of type Class<?>
   *         including the type of the arguments of the method
   */
  private int createArgType (int argValue){
    String[] argTypes = this.mi.getArgumentTypeNames();
    int nArgs = argTypes.length;

    /** Create an array of Class<?> (Class<?>[] argType = new Class<?>[nArgs]) */
    this.il.append(new PUSH(peerClassGen._cp, nArgs));
    this.il.append(peerClassGen._factory.createNewArray(new ObjectType("java.lang.Class"), (short) 1));
    LocalVariableGen lg = this.nativeMth.addLocalVariable("argType", new ArrayType(new ObjectType("java.lang.Class"), 1), null, null);
    int argType = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, argType));

    if(genSource()) {
      sourceGen.printCreateArgsType(nArgs);
    }

    for (int i = 0; i < nArgs; i++){
      // loading the element argType[i]
      this.il.append(InstructionFactory.createLoad(Type.OBJECT, argType));
      this.il.append(new PUSH(peerClassGen._cp, i));

      if (!PeerMethodGen.isPrimitiveType(argTypes[i])){

        if(argTypes[i].contains("[]")) {
          il.append(InstructionFactory.createLoad(Type.OBJECT, argValue));
          il.append(new PUSH(peerClassGen._cp, i));
          il.append(InstructionConstants.AALOAD);
          il.append(peerClassGen._factory.createInvoke("java.lang.Object", "getClass", new ObjectType("java.lang.Class"), Type.NO_ARGS, Constants.INVOKEVIRTUAL));

          if(genSource()) {
            sourceGen.printSetArrArgType(i);
          }
        } else{
          il.append(new PUSH(peerClassGen._cp, argTypes[i]));
          il.append(peerClassGen._factory.createInvoke("java.lang.Class", "forName", new ObjectType("java.lang.Class"), new Type[] { Type.STRING }, Constants.INVOKESTATIC));

          if(genSource()) {
            sourceGen.printSetObjArgType(argTypes[i], i);
          }
        }
      } else{
        String wrapperType = getWrapperType(argTypes[i]);

        il.append(peerClassGen._factory.createFieldAccess( wrapperType, "TYPE", new ObjectType("java.lang.Class"), Constants.GETSTATIC));

        if(genSource()) {
          String wrapperName = wrapperType.substring(wrapperType.lastIndexOf('.') + 1);
          sourceGen.printSetPrimitiveArgType(wrapperName, i);
        }
      }

      this.il.append(InstructionConstants.AASTORE);
    }
    return argType;
  }

  private String getWrapperType(String primitiveType) {
    String wrapperType = null;

    if ("boolean".equals(primitiveType))
      wrapperType = "java.lang.Boolean";
    else if ("int".equals(primitiveType))
      wrapperType = "java.lang.Integer";
    else if ("long".equals(primitiveType))
      wrapperType = "java.lang.Long";
    else if ("byte".equals(primitiveType))
      wrapperType = "java.lang.Byte";
    else if ("char".equals(primitiveType))
      wrapperType = "java.lang.Character";
    else if ("short".equals(primitiveType))
      wrapperType = "java.lang.Short";
    else if ("float".equals(primitiveType))
      wrapperType = "java.lang.Float";
    else if ("double".equals(primitiveType))
      wrapperType = "java.lang.Double";

    return wrapperType;
  }

  /**
   * Adds bytecode to the body of the method that gets the class of the native
   * method. For the static method, "caller" that has been already obtained from
   * createCaller is what we want. But for non-static method, we need to get the
   * class of object invoking the method (Class<?> callerClass =
   * caller.getClass())
   * 
   * @param caller
   *          an index of the local variable that represents the caller object
   *          (non-static method) or class (static method)
   * 
   * @return an index of the local variable that represents the caller class
   *         (static method) or the class of the caller object (non-static
   *         method)
   */
  private int getCallerClass (int caller){
    int callerClass;
    if (this.mi.isStatic())
      callerClass = caller;
    else{
      // the class of the last invoked method
      String className = env.getVM().getCurrentThread().getTopFrameMethodInfo().getClassName();
      this.il.append(new PUSH(peerClassGen._cp, className));
      this.il.append(peerClassGen._factory.createInvoke("java.lang.Class", "forName", new ObjectType("java.lang.Class"), new Type[] { Type.STRING }, Constants.INVOKESTATIC));
      LocalVariableGen lg = this.nativeMth.addLocalVariable("callerClass", new ObjectType("java.lang.Class"), null, null);
      callerClass = lg.getIndex();
      this.il.append(InstructionFactory.createStore(Type.OBJECT, callerClass));

      if(genSource()) {
        sourceGen.printGetCallerClass(className);
      }
    }
    return callerClass;
  }

  /**
   * Adds bytecode to the body of the method that uses reflection to get the
   * method from the class
   * 
   * @param callerClass
   *          an index of the local variable that represents the caller class
   *          (static method) or the class of the caller object (non-static
   *          method)
   * @param argType
   *          an index of the local variable which is an array of type Class<?>
   *          including the type of the arguments of the method
   * 
   * @return an index of the local variable that represents the Method instance
   *         representing this native method
   */
  private int getMethod (int callerClass, int argType){
    String name = this.mi.getName();
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, callerClass));
    this.il.append(new PUSH(peerClassGen._cp, name));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, argType));

    this.il.append(peerClassGen._factory.createInvoke("java.lang.Class", "getDeclaredMethod", new ObjectType("java.lang.reflect.Method"), new Type[] { Type.STRING, new ArrayType(new ObjectType("java.lang.Class"), 1) }, Constants.INVOKEVIRTUAL));

    LocalVariableGen lg = this.nativeMth.addLocalVariable("method", new ObjectType("java.lang.reflect.Method"), null, null);
    int method = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, method));

    if(genSource()) {
      sourceGen.printGetMethod(name, mi.isStatic());
    }
    return method;
  }

  private int getConstructor (int callerClass, int argType){
    String name = this.mi.getName();
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, callerClass));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, argType));

    this.il.append(peerClassGen._factory.createInvoke("java.lang.Class", "getDeclaredConstructor", new ObjectType("java.lang.reflect.Constructor"), new Type[] { new ArrayType(new ObjectType("java.lang.Class"), 1) }, Constants.INVOKEVIRTUAL));

    LocalVariableGen lg = this.nativeMth.addLocalVariable("ctor", new ObjectType("java.lang.reflect.Constructor"), null, null);
    int method = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, method));

    if(genSource()) {
      sourceGen.printGetCtor(name);
    }
    return method;
  }

  /**
   * Adds bytecode to the body of the method that provides access to a private
   * method.
   * 
   * @param method
   *          an index of the local variable that represents the Method instance
   *          representing this native method
   */
  private void setAccessible (int method){
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, method));
    this.il.append(new PUSH(peerClassGen._cp, 1));
    String type = mi.isCtor() ? "java.lang.reflect.Constructor": "java.lang.reflect.Method";
    this.il.append(peerClassGen._factory.createInvoke(type, "setAccessible", Type.VOID, new Type[] { Type.BOOLEAN }, Constants.INVOKEVIRTUAL));
    
    if(genSource()) {
      sourceGen.printSetAccessible(mi.isCtor());
    }
  }

  /**
   * Adds bytecode to the body of the method that uses reflection to invoke the
   * method. For the static method, adds method.invoke(null, argValue); For the
   * non-static method, adds method.invoke(caller, argValue);
   * 
   * @param caller
   *          an index of the local variable that represents the caller object
   *          (non-static method) or class (static method)
   * @param method
   *          an index of the local variable that represents the Method instance
   *          representing this native method
   * @param argValue
   *          an index of the local variable which is an array of type Object
   *          including the arguments of the method
   * 
   * @return an index of the local variable that represents the return value of
   *         the method
   */
  private int invokeMethod (int caller, int method, int argValue){
    int returnValue = -1;
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, method));

    if (this.mi.isStatic())
      // loading the value NULL
      this.il.append(InstructionConstants.ACONST_NULL);
    else
      // loading the caller object
      this.il.append(InstructionFactory.createLoad(Type.OBJECT, caller));

    this.il.append(InstructionFactory.createLoad(Type.OBJECT, argValue));
    this.il.append(peerClassGen._factory.createInvoke("java.lang.reflect.Method", "invoke", Type.OBJECT, new Type[] { Type.OBJECT, new ArrayType(Type.OBJECT, 1) }, Constants.INVOKEVIRTUAL));
    if (!mi.getReturnTypeName().equals("void")){
      LocalVariableGen lg = this.nativeMth.addLocalVariable("returnValue", Type.OBJECT, null, null);
      returnValue = lg.getIndex();
      this.il.append(InstructionFactory.createStore(Type.OBJECT, returnValue));
    } else{
      this.il.append(InstructionConstants.POP);
    }

    if(genSource()) {
      sourceGen.printInvokeMethod(mi.isStatic());
    }
    return returnValue;
  }

  private int createNewInstance (int method, int argValue){
    int returnValue = -1;
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, method));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, argValue));
    this.il.append(peerClassGen._factory.createInvoke("java.lang.reflect.Constructor", "newInstance", Type.OBJECT, new Type[] { new ArrayType(Type.OBJECT, 1) }, Constants.INVOKEVIRTUAL));
    LocalVariableGen lg = this.nativeMth.addLocalVariable("returnValue", Type.OBJECT, null, null);
    returnValue = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.OBJECT, returnValue));

    if(genSource()) {
      sourceGen.creatNewInstance();
    }

    return returnValue;
  }

  /**
   * Adds bytecode to the body of the method that converts a given JVM object to
   * a JPF object.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @param JVMObj
   *          an index of the local variable that represents a JVM object
   * 
   * @return an index of the local variable that represents the JPF object
   *         corresponding to the given JVM object
   */
  private int convertJVM2JPF (int JVMObj){
//    Type[] types = { Type.OBJECT, mjiEnvType };
    // Include the FeatureExpr ctx
    Type[] types = { Type.OBJECT, mjiEnvType, FeatureExprType };
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, JVMObj));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
    // Load the FeatureExpr ctx
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, ctxIndex));
    this.il.append(peerClassGen._factory.createInvoke(jvm2jpfConverter, "obtainJPFObj", Type.INT, types, Constants.INVOKESTATIC));
    LocalVariableGen lg = this.nativeMth.addLocalVariable("JPFObj", Type.INT, null, null);
    int JPFObj = lg.getIndex();
    this.il.append(InstructionFactory.createStore(Type.INT, JPFObj));

    if(genSource()) {
      sourceGen.printConvertReturnValue();
    }
    return JPFObj;
  }

  /**
   * Adds bytecode to the body of the method that updates a JPF object according
   * to the given JVM object.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @param JVMObj
   *          an index of the local variable that represents a JVM object
   * 
   * @param JPFObj
   *          an index of the local variable that represents a JPF object
   */
  private void updateJPFObj (int JVMObj, int JPFObj){
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, JVMObj));
    this.il.append(InstructionFactory.createLoad(Type.INT, JPFObj));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, ctxIndex));
//    Type[] types = { Type.OBJECT, Type.INT, mjiEnvType };
    Type[] types = { Type.OBJECT, Type.INT, mjiEnvType, FeatureExprType };
    this.il.append(peerClassGen._factory.createInvoke(jvm2jpfConverter, "updateJPFObj", Type.VOID, types, Constants.INVOKESTATIC));

    if(genSource()) {
      if(!mi.isCtor()) {
        sourceGen.printUpdateCaller(mi.isStatic());
      } else {
        sourceGen.printUpdateCtorCaller();
      }
    }
  }

  /**
   * Adds bytecode to the body of the method that updates a JPF class according
   * to the given JVM object.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @param JPFCls
   *          an index of the local variable that represents a JPF class
   */
  private void updateJPFClass (int JVMCls){
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, JVMCls));
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
    /* FeatureExpr ctx is always the last argument */
    this.il.append(InstructionFactory.createLoad(Type.OBJECT, ctxIndex));
//    Type[] types = { new ObjectType("java.lang.Class"), mjiEnvType};
    /* Include the FeatureExpr type */
    Type[] types = { new ObjectType("java.lang.Class"), mjiEnvType, FeatureExprType};
    this.il.append(peerClassGen._factory.createInvoke(jvm2jpfConverter, "obtainJPFCls", new ObjectType("gov.nasa.jpf.vm.ClassInfo"), types, Constants.INVOKESTATIC));
    this.il.append(InstructionConstants.POP);

    if(genSource()) {
      sourceGen.printUpdateCaller(mi.isStatic());
    }
  }

  /**
   * Adds bytecode to the body of the method that updates the arguments of the
   * JPF method according to the given JVM values.
   * 
   * @param converter
   *          an index of the local variable that represents the Converter
   *          object
   * 
   * @param argValue
   *          an index of the local variable that represents a JVM array that
   *          holds the value of input parameters
   */
  private void updateJPFArguments (int argValue){
    String[] type = mi.getArgumentTypeNames();
    int nArgs = type.length;

    int j = 2;
    for (int i = 0; i < nArgs; i++){

      if (!PeerMethodGen.isPrimitiveType(type[i])){
        // Loading the array element argsValue[i];
        this.il.append(InstructionFactory.createLoad(Type.OBJECT, argValue));
        this.il.append(new PUSH(peerClassGen._cp, i));
        this.il.append(InstructionConstants.AALOAD);
        // Loading the nth input parameter
        this.il.append(InstructionFactory.createLoad(Type.INT, j));
        this.il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
        this.il.append(InstructionFactory.createLoad(Type.OBJECT, ctxIndex));
//        Type[] types = { Type.OBJECT, Type.INT, mjiEnvType };
        // Include the FeatureExpr ctx
        Type[] types = { Type.OBJECT, Type.INT, mjiEnvType, FeatureExprType };
        // Invoking the method "updateJPFObj"
        this.il.append(peerClassGen._factory.createInvoke(jvm2jpfConverter, "updateJPFObj", Type.VOID, types, Constants.INVOKESTATIC));
        j++;

        if(genSource()) {
          sourceGen.printUpdateJPFArgs(i, nArgs);
        }
      } else if (type[i].equals("long") || type[i].equals("double")) {
        j += 2;
      } else {
        j++;
      }
    }
  }

  /**
   * Adds bytecode to the body of the method for return statement
   * 
   * @param returnValue
   *          an index of the local variable that represents the return value of
   *          the method
   */
  private void addReturnStatement (int returnValue){
    String returnType = this.mi.getReturnTypeName();
    // if the return type is Object
    if (!PeerMethodGen.isPrimitiveType(returnType)){
      this.il.append(InstructionFactory.createLoad(Type.INT, returnValue));
      this.il.append(InstructionFactory.createReturn(Type.INT));

      if(genSource()) {
        sourceGen.printReturnObj();
      }
    } else if ("void".equals(returnType)){
      this.il.append(InstructionFactory.createReturn(Type.VOID));

      if(genSource()) {
        sourceGen.printReturn();
      }
    } else{
      String wrapper = null;
      String methodName = null;
      Type type = null;
      if ("boolean".equals(returnType)){
    	wrapper = "Boolean";
        methodName = "booleanValue";
        type = Type.BOOLEAN;
      } else if ("int".equals(returnType)){
    	wrapper = "Integer";
        methodName = "intValue";
        type = Type.INT;
      } else if ("long".equals(returnType)){
    	wrapper = "Long";
        methodName = "longValue";
        type = Type.LONG;
      } else if ("byte".equals(returnType)){
    	wrapper = "Byte";
        methodName = "byteValue";
        type = Type.BYTE;
      } else if ("char".equals(returnType)){
    	wrapper = "Character";
        methodName = "charValue";
        type = Type.CHAR;
      } else if ("short".equals(returnType)){
    	wrapper = "Short";
        methodName = "shortValue";
        type = Type.SHORT;
      } else if ("float".equals(returnType)){
    	wrapper = "Float";
        methodName = "floatValue";
        type = Type.FLOAT;
      } else if ("double".equals(returnType)){
    	wrapper = "Double";
        methodName = "doubleValue";
        type = Type.DOUBLE;
      }
      String className = "java.lang." + wrapper;
      this.il.append(InstructionFactory.createLoad(Type.OBJECT, returnValue));
      this.il.append(peerClassGen._factory.createCheckCast(new ObjectType(className)));
      this.il.append(peerClassGen._factory.createInvoke(className, methodName, type, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
      this.il.append(InstructionFactory.createReturn(type));

      if(genSource()) {
        sourceGen.printReturnPrimitive(wrapper, methodName);
      }
    }
  }

  /**
   * Adds bytecode to the body of the method for a return statement that returns
   * a dummy value
   * 
   * @param returnValue
   *          an index of the local variable that represents the return value of
   *          the method
   */
  private void addDummyReturnStatement (){
    String returnType = this.mi.getReturnTypeName();
    // if the return type is Object
    if (!PeerMethodGen.isPrimitiveType(returnType)) {
      this.il.append(new PUSH(peerClassGen._cp, MJIEnv.NULL));
      this.il.append(InstructionFactory.createReturn(Type.INT));
    } else if ("void".equals(returnType)) {
      this.il.append(InstructionFactory.createReturn(Type.VOID));
    } else {
      if ("boolean".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.BOOLEAN));
      } else if ("int".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.INT));
      } else if ("long".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.LONG));
      } else if ("byte".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.BYTE));
      } else if ("char".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.CHAR));
      } else if ("short".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0));
        this.il.append(InstructionFactory.createReturn(Type.SHORT));
      } else if ("float".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0.0));
        this.il.append(InstructionFactory.createReturn(Type.FLOAT));
      } else if ("double".equals(returnType)) {
        this.il.append(new PUSH(peerClassGen._cp, 0.0));
        this.il.append(InstructionFactory.createReturn(Type.DOUBLE));
      }
    }
    sourceGen.printDummyReturnStatement();
  }

  /**
   * Returns the type corresponding to the given string.
   * 
   * @param typeName
   *          a string that stores a type name
   * 
   * @return the type corresponding to the given string
   */
  private static Type getType (String typeName){
    Type returnType = null;
    if ("int".equals(typeName)) {
      returnType = Type.INT;
    } else if ("long".equals(typeName)) {
      returnType = Type.LONG;
    } else if ("boolean".equals(typeName)) {
      returnType = Type.BOOLEAN;
    } else if ("void".equals(typeName)) {
      returnType = Type.VOID;
    } else if ("byte".equals(typeName)) {
      returnType = Type.BYTE;
    } else if ("char".equals(typeName)) {
      returnType = Type.CHAR;
    } else if ("short".equals(typeName)) {
      returnType = Type.SHORT;
    } else if ("float".equals(typeName)) {
      returnType = Type.FLOAT;
    } else if ("double".equals(typeName)) {
      returnType = Type.DOUBLE;
    }
    // The type should be a type of an object
    else {
      returnType = Type.OBJECT;
    }
    return returnType;
  }

  /**
   * Checks if the given string represents a primitive type.
   * 
   * @param t
   *          a string that stores a type name
   * 
   * @return true of the given string stores a primitive type. OW, it returns
   *         false.
   */
  protected static boolean isPrimitiveType (String t){
    return ("int".equals(t) || "long".equals(t) || "boolean".equals(t) || "void".equals(t) || "byte".equals(t) || "char".equals(t) || "short".equals(t) || "float".equals(t) || "double".equals(t));
  }

  /**
   * Creates an array of type Type including the type of the arguments of the
   * method.
   * 
   * @param mi
   *          an object that represents a method in JPF
   * 
   * @return an array of type Type including the type of the arguments of the
   *         method
   */
  private static Type[] getArgumentsType (NativeMethodInfo mi){
//    Type[] argTypes = new Type[mi.getNumberOfArguments() + 2];
    Type[] argTypes = new Type[mi.getNumberOfArguments() + 3];
    argTypes[0] = new ObjectType(PeerClassGen.MJIEnvCls);
    argTypes[1] = Type.INT;

    // Exclude first 2 arguments
    ctxIndex = 2;
    String[] argTypesName = mi.getArgumentTypeNames();
    for (int i = 2; i < mi.getNumberOfArguments() + 2; i++){
      Type type = PeerMethodGen.getType(argTypesName[i - 2]);
      argTypes[i] = (type == Type.OBJECT) ? Type.INT : type;
      // Assume that only Double type requires more than 4 bytes.
      if(type == Type.DOUBLE){
        ctxIndex += 2;
      }
      else{
        ctxIndex += 1;
      }
    }

    // FeatureExpr ctx as the last argument
    argTypes[mi.getNumberOfArguments() + 2] = new ObjectType(PeerClassGen.FeatureExprCls);

    return argTypes;
  }

  /**
   * Creates an array of type String including the arguments names of the
   * method.
   * 
   * @param mi
   *          an object that represents a method in JPF
   * 
   * @return an array of type String including the arguments names of the method
   */
  private static String[] getArgumentsName (NativeMethodInfo mi){
//    String[] argName = new String[mi.getNumberOfArguments() + 2];
    String[] argName = new String[mi.getNumberOfArguments() + 3];
    argName[0] = "env";

    if (mi.isStatic()) {
      argName[1] = "rcls";
    } else {
      argName[1] = "robj";
    }

    for (int i = 2; i < mi.getNumberOfArguments() + 2; i++) {
      argName[i] = "arg" + (i - 2);
    }

    // FeatureExpr ctx as the last argument
    argName[mi.getNumberOfArguments() + 2] = "ctx";

    return argName;
  }
  
  protected static String getJNIName(MethodInfo mi) {
    String mname = mi.getName();

	if(mname.startsWith("<") && mname.endsWith(">")) {
      mname = "$" + mname.substring(1, mname.lastIndexOf(">"));
	}

	return (Types.getJNIMangledMethodName(null, mname, mi.getSignature()));
  }
}
