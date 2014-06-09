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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

/**
 * native peer for Annotation Proxies
 * (saves us some bytecode interpretation shoe leather)
 */
public class JPF_gov_nasa_jpf_AnnotationProxyBase extends NativePeer {

  @MJI
  public int annotationType____Ljava_lang_Class_2 (MJIEnv env, int objref) {
    ClassInfo ciProxy = env.getClassInfo(objref);  // this would be the proxy
    
    // we could also pull it out from the interfaces, but we know the naming scheme
    String proxyName = ciProxy.getName();
    String annotation = proxyName.substring(0, proxyName.length() - 6); // "...$Proxy"
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(annotation);
    
    return ci.getClassObjectRef();
  }
  
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objref){
    StringBuffer sb = new StringBuffer();
    
    ClassInfo ci = env.getClassInfo(objref);
    String cname = ci.getName();
    int idx = cname.lastIndexOf('$');
    
    sb.append('@');
    sb.append(cname.substring(0,idx));
    
    FieldInfo[] fields = ci.getDeclaredInstanceFields();
    if (fields.length > 0){
      sb.append('(');
      for (int i=0; i<fields.length; i++){
        String fn = fields[i].getName();
        String ft = fields[i].getType();
        
        if (i>0){
          sb.append(',');
        }
        sb.append(fn);
        sb.append('=');
        
        if (ft.equals("int")){
          sb.append(env.getIntField(objref,fn));

        } else if (ft.equals("long")){
          sb.append(env.getLongField(objref,fn));
          
        } else if (ft.equals("double")){
          sb.append(env.getDoubleField(objref,fn));

        } else if (ft.equals("boolean")){
          sb.append(env.getBooleanField(objref,fn));
          
        } else if (ft.equals("java.lang.String")){
          sb.append(env.getStringObject(env.getReferenceField(objref, fn)));
          
        } else if (ft.equals("java.lang.Class")){
          int cref = env.getReferenceField(objref, fn);
          if (cref != MJIEnv.NULL){
            int nref = env.getReferenceField(cref, "name");
            String cn = env.getStringObject(nref);
          
            sb.append("class ");
            sb.append(cn);
          } else {
            sb.append("class ?");
          }
            
        } else if (ft.endsWith("[]")){
          int ar = env.getReferenceField(objref, fn);
          int n = env.getArrayLength((ar));

          sb.append('[');
          
          if (ft.equals("java.lang.String[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');
              sb.append(env.getStringObject(env.getReferenceArrayElement(ar,j)));
            }
            
          } else if (ft.equals("int[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');
              sb.append(env.getIntArrayElement(ar,j));
            }

          } else if (ft.equals("long[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');
              sb.append(env.getLongArrayElement(ar,j));
            }
            
          } else if (ft.equals("double[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');
              sb.append(env.getDoubleArrayElement(ar,j));
            }
            
          } else if (ft.equals("boolean[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');
              sb.append(env.getBooleanArrayElement(ar,j));
            }
          } else if (ft.equals("java.lang.Class[]")){
            for (int j=0; j<n; j++){
              if (j>0) sb.append(',');

              int cref = env.getReferenceArrayElement(ar,j);
              if (cref != MJIEnv.NULL){
                int nref = env.getReferenceField(cref, "name");
                String cn = env.getStringObject(nref);
              
                sb.append("class ");
                sb.append(cn);
              } else {
                sb.append("class ?");
              }

            }            
          }
          
          sb.append(']');
          
        } else { // arbitrary type name, must be a reference
          int eref = env.getReferenceField(objref, fn);
          if (eref != MJIEnv.NULL){
            ClassInfo eci = env.getClassInfo(eref);
            if (eci.isEnum()){
              int nref = env.getReferenceField(eref, "name");
              String en = env.getStringObject(nref);
              
              sb.append(eci.getName());
              sb.append('.');
              sb.append(en);
            }
          }
        }
      }
      sb.append(')');
    }
    
    
    return env.newString(sb.toString());
  }
}
