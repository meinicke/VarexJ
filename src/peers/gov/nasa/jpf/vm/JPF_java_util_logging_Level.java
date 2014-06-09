//Copyright (C) 2009 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.

//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.

//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.

package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.util.logging.Level;

/**
 * this is only a skeleton to make basic logging work under JPF
 */
public class JPF_java_util_logging_Level extends NativePeer {
  @MJI
  public int getLocalizedName____Ljava_lang_String_2 (MJIEnv env, int objRef){
    Level level = null;    
    int val = env.getIntField(objRef, "value");
    
    switch (val){
    case Integer.MIN_VALUE : 
      level = Level.ALL; break; 
    case 300 :
      level = Level.FINEST; break;
    case 400 :
      level = Level.FINER; break;
    case 500 :
      level = Level.FINE; break;
    case 700 :
      level = Level.CONFIG; break;
    case 800 :
      level = Level.INFO; break;
    case 900 :
      level = Level.WARNING; break;
    case 1000 :
      level = Level.SEVERE; break;
    case Integer.MAX_VALUE :
      level = Level.OFF; break;      
    }
    
    String localizedName = (level != null) ? level.getLocalizedName() : "UNKNOWN";    
    return env.newString(localizedName); 
  }
}
