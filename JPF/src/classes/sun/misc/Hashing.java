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

package sun.misc;

/**
 * this is a model class for sun.misc.Hashing, which is a Java 7 class we model
 * to make JPF compile under Java 6.
 * We provide a peer for this class since its highly repetitive bytecode
 * will otherwise cause arithmetic overflow, which is a condition we might check for.
 * The code would otherwise also lengthen traces, esp. during system initialization
 */
public class Hashing {
  private Hashing(){
    throw new Error("instantiation not allowed");
  }
  
  //--- byte data
  
  public static int murmur3_32 (byte[] d) {
    return murmur3_32( 0, d, 0, d.length);
  }

  public static int murmur3_32 (int seed, byte[] d) {
    return murmur3_32( seed, d, 0, d.length);
  }
  
  public static int murmur3_32 (int seed, byte[] d, int off, int len){
    return 42; // intercepted by peer
  }
  
  //--- int data
  
  public static int murmur3_32 (int[] d){
    return murmur3_32( 0, d, 0, d.length);
  }
  public static int murmur3_32 (int seed, int[] d){
    return murmur3_32( seed, d, 0, d.length);
  } 
  public static int murmur3_32 (int seed, int[] d, int off, int len){
    return 42; // intercepted by peer    
  }
  
  //--- char data
 
  public static int murmur3_32 (char[] d){
    return murmur3_32( 0, d, 0, d.length);    
  }
  public static int murmur3_32 (int seed, char[] d){
    return murmur3_32( seed, d, 0, d.length);    
  }
  public static int murmur3_32 (int seed, char[] d, int off, int len){
    return 42; // intercepted by peer    
  }
  
  //--- other types
  
  public static int stringHash32 (String s){
    return 42; // intercepted by peer
  }
  
  public static int randomHashSeed (Object o){
    return 42; // intercepted by peer
  }
}
