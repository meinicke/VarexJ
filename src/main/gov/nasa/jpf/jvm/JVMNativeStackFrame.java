//
// Copyright (C) 2013 United States Government as represented by the
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

package gov.nasa.jpf.jvm;

import gov.nasa.jpf.vm.NativeMethodInfo;
import gov.nasa.jpf.vm.NativeStackFrame;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

/**
 * a NativeStackFrame used for calling NativeMethods from Java bytecode
 */
public class JVMNativeStackFrame extends NativeStackFrame {

  public JVMNativeStackFrame (NativeMethodInfo callee){
    super(callee);
  }
  
  public void setArguments (ThreadInfo ti){
    StackFrame callerFrame = ti.getTopFrame(); // we are not going to modify it
    NativeMethodInfo nmi = (NativeMethodInfo) mi;
    int      nArgs = nmi.getNumberOfArguments();
    byte[]   argTypes = nmi.getArgumentTypes();

    Object[] a = new Object[nArgs+2];

    int      stackOffset;
    int      i, j, k;
    int      ival;
    long     lval;

    for (i = 0, stackOffset = 0, j = nArgs + 1, k = nArgs - 1;
         i < nArgs;
         i++, j--, k--) {
      switch (argTypes[k]) {
      case Types.T_BOOLEAN:
        ival = callerFrame.peek(stackOffset);
        a[j] = Boolean.valueOf(Types.intToBoolean(ival));

        break;

      case Types.T_BYTE:
        ival = callerFrame.peek(stackOffset);
        a[j] = Byte.valueOf((byte) ival);

        break;

      case Types.T_CHAR:
        ival = callerFrame.peek(stackOffset);
        a[j] = Character.valueOf((char) ival);

        break;

      case Types.T_SHORT:
        ival = callerFrame.peek(stackOffset);
        a[j] = new Short((short) ival);

        break;

      case Types.T_INT:
        ival = callerFrame.peek(stackOffset);
        a[j] = new Integer(ival);

        break;

      case Types.T_LONG:
        lval = callerFrame.peekLong(stackOffset);
        stackOffset++; // 2 stack words
        a[j] = new Long(lval);

        break;

      case Types.T_FLOAT:
        ival = callerFrame.peek(stackOffset);
        a[j] = new Float(Types.intToFloat(ival));

        break;

      case Types.T_DOUBLE:
        lval = callerFrame.peekLong(stackOffset);
        stackOffset++; // 2 stack words
        a[j] = new Double(Types.longToDouble(lval));

        break;

      default:
        // NOTE - we have to store T_REFERENCE as an Integer, because
        // it shows up in our native method as an 'int'
        ival = callerFrame.peek(stackOffset);
        a[j] = new Integer(ival);
      }

      stackOffset++;
    }

    //--- set  our standard MJI header arguments
    a[0] = ti.getMJIEnv();
    
    if (nmi.isStatic()) {
      a[1] = new Integer( nmi.getClassInfo().getClassObjectRef());
    } else {
      int thisRef = callerFrame.getCalleeThis(nmi);
      a[1] = new Integer( thisRef);
      
      setThis(thisRef);
    }

    setArgs(a);
  }
}
