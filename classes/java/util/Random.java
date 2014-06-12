//
// Copyright (C) 2011 United States Government as represented by the
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

package java.util;

public class Random {

  // the state of this object
  private long seed;
  
  public Random(){
    // intercepted by native peer to control seed initialization based on JPF configuration
  }
  
  public Random(long seed) {
    // intercepted by native peer to control seed initialization based on JPF configuration
  }
  
  public synchronized void setSeed(long seed){
    // intercepted by native peer
  }
  
  protected int next(int bits){
    return 42; // intercepted by peer
  }
  
  public void nextBytes(byte[] data){
    // intercepted by peer
  }
  
  public int nextInt(){
    return 42; // intercepted by peer    
  }
  
  public int nextInt(int n) {
    return 42; // intercepted by peer
  }
  
  public long nextLong() {
    return 42; // intercepted by peer
  }
  
  public boolean nextBoolean() {
    return true; // intercepted by peer
  }
  
  public float nextFloat() {
    return 42f; // intercepted by peer
  }
  
  public double nextDouble() {
    return 42.0; // intercepted by peer
  }
  
  public synchronized double nextGaussian() {
    return 42.0; // intercepted by peer    
  }
}
