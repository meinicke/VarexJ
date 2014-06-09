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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JPF_java_security_MessageDigest extends NativePeer {
  
  MessageDigest[] digests;
  
  public JPF_java_security_MessageDigest (Config conf){
    digests = new MessageDigest[32];
  }
  
  int getNewIndex() {
    int n = digests.length;
    for (int i=0; i<n; i++){
      if (digests[i] == null){
        return i;
      }
    }
    
    MessageDigest[] newd = new MessageDigest[n + 32];
    System.arraycopy(digests,0,newd,0,digests.length);
    digests = newd;
    return n;
  }
  
  MessageDigest getDigest (MJIEnv env, int objRef){
    int id = env.getIntField(objRef, "id");
    return digests[id];
  }
  
  @MJI
  public int init0__Ljava_lang_String_2__I (MJIEnv env, int objRef, int algRef) {
    String algorithm = env.getStringObject(algRef);
    
    try {
      MessageDigest md = MessageDigest.getInstance(algorithm);
    
      int id = getNewIndex();
      digests[id] = md;
    
      return id;
    } catch (NoSuchAlgorithmException x){
      env.throwException("java.security.NoSuchAlgorithmException", algorithm);
      return -1;
    }
  }
  
  @MJI
  public int digest___3B___3B (MJIEnv env, int objRef, int inputRef){
    MessageDigest md = getDigest(env, objRef);
    byte[] input = env.getByteArrayObject(inputRef);
    
    byte[] res = md.digest(input);
    return env.newByteArray(res);
  }

  @MJI
  public int digest_____3B (MJIEnv env, int objRef){
    MessageDigest md = getDigest(env, objRef);    
    byte[] res = md.digest();
    return env.newByteArray(res);
  }
  
  @MJI
  public void finalize____ (MJIEnv env, int objRef){
    int id = env.getIntField(objRef, "id");
    digests[id] = null;
  }

  @MJI
  public void update___3B__V (MJIEnv env, int objRef, int inputRef){
    MessageDigest md = getDigest(env, objRef);
    byte[] input = env.getByteArrayObject(inputRef);
    md.update(input);
  }
}
