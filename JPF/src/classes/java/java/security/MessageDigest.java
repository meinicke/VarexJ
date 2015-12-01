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

package java.security;

/**
 * forwarding implementation of MessageDigest.
 * <2do> only partially implemented (as required by serialization)
 */
public class MessageDigest extends MessageDigestSpi {

  String algorithm;
  int id; // set by native peer
  
  private native int init0 (String algorithm);
  
  protected MessageDigest (String algorithm) throws NoSuchAlgorithmException {
    if (!algorithm.equalsIgnoreCase("SHA") && !algorithm.equalsIgnoreCase("MD5")){
      throw new NoSuchAlgorithmException("unknown algorithm: " + algorithm);
    }
    
    this.algorithm = algorithm;
    id = init0(algorithm);
  }
  
  public static MessageDigest getInstance (String algorithm) throws NoSuchAlgorithmException {
    return new MessageDigest(algorithm); // keep it simple
  }
  
  public native byte[] digest (byte[] input);
  
  public native byte[] digest ();

  public native void update(byte[] input);

  protected native void finalize(); // to clean up
  
  // those are required by the compiler, but never used since we forward
  // all public methods
  protected native byte[] engineDigest ();

  protected native void engineReset ();

  protected native void engineUpdate (byte input);

  protected native void engineUpdate (byte[] input, int offset, int len);

}
