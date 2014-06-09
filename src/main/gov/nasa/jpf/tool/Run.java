//
// Copyright (C) 2009 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//

package gov.nasa.jpf.tool;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * common base for Run* classes
 */
public class Run {

  protected static void error (String msg){
    System.err.print("error: ");
    System.err.println(msg);
    System.exit(1);
  }

  // filter out leading '+' arguments (Config initialization)
  protected static String[] removeConfigArgs(String[]args){
    int i;
    for (i=0; i<args.length; i++){
      String a = args[i];
      if (a != null && a.length() > 0 && a.charAt(0) != '+'){
        break;
      }
    }

    String[] newArgs = new String[args.length - i];
    System.arraycopy(args,i,newArgs,0,newArgs.length);

    return newArgs;
  }

  protected static String checkClassName (String cls){
    if (cls == null || cls.isEmpty()){
      return null;
    }

    if (cls.charAt(0) == '.'){
      cls = "gov.nasa.jpf" + cls;
    }

    return cls;
  }

  protected static boolean call( Class<?> cls, String mthName, Object[] args) throws InvocationTargetException {
    try {
      Class<?>[] argTypes = new Class<?>[args.length];
      for (int i=0; i<args.length; i++){
        argTypes[i] = args[i].getClass();
      }

      Method m = cls.getMethod(mthName, argTypes);

      int modifiers = m.getModifiers();
      if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)){
        m.invoke(null, args);
        return true;
      }

    } catch (NoSuchMethodException nsmx){
      return false;
    } catch (IllegalAccessException iax){
      return false;
    }

    return false;
  }

}
