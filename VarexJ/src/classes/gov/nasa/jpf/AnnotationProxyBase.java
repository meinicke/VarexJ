//
// Copyright (C) 2007 United States Government as represented by the
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

package gov.nasa.jpf;


/**
 * common stuff used by all Annotation Proxies
 */
public class AnnotationProxyBase {

  public native Class<?> annotationType();
  
  // this is just here to be intercepted by the native peer
  public native String toString();
  
  /***
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('@');
    
    Class<?> cls = getClass();
    String clsName = cls.getName();
    int idx = clsName.lastIndexOf('$');
    sb.append(clsName.substring(0, idx));
    
    Field[] fields = cls.getDeclaredFields();  
    if (fields.length > 0){
      sb.append('(');
      for (int i=0; i<fields.length; i++){
        fields[i].setAccessible(true);
        
        if (i>0){
          sb.append(',');
        }
        sb.append(fields[i].getName());
        sb.append('=');
        
        try {
          Object v = fields[i].get(this);
          Class<?> vcls = v.getClass();

          if (vcls.isArray()){
            sb.append('[');
            int n = Array.getLength(v);
            for (int j=0; j<n; j++){
              if (j>0){
                sb.append(',');
              }
              sb.append(Array.get(v,j));
            }            
            sb.append(']');
          } else {
            sb.append(fields[i].get(this));
          }
        } catch (IllegalAccessException iax){}
      }
      sb.append(')');
    }
    
    return sb.toString();
  }
  ***/
}
