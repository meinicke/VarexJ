//
// Copyright (C) 2012 United States Government as represented by the
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

package gov.nasa.jpf.util;

/**
 * Bob Jenkins One-at-a-Time Hash (http://www.burtleburtle.net/bob/hash/doobs.html),
 * a simple yet sufficiently avalanching hash that doesn't require a-priori knowledge
 * of the key length and is much faster than lookup3 
 */
public class OATHash {

  //--- the hash primitives
  
  public static int hashMixin (int h, int key){
    int k = key & 0xff;
    h += k; h += (h <<10); h ^= (h >>> 6);
    
    key >>= 8;
    k = key & 0xff;
    h += k; h += (h <<10); h ^= (h >>> 6);

    key >>= 8;
    k = key & 0xff;
    h += k; h += (h <<10); h ^= (h >>> 6);

    key >>= 8;
    k = key & 0xff;
    h += k; h += (h <<10); h ^= (h >>> 6);
    
    return h;
  }
  
  public static int hashMixin (int h, long key) {
    h = hashMixin( h, (int)key);
    h = hashMixin( h, (int)(key >> 32));
    return h;
  }
  
  public static int hashFinalize (int h){
    h += (h << 3);
    h ^= (h >>> 11);
    h += (h << 15);
    
    return h;
  }

  //--- the one step public hashers
  
  public static int hash (int key){
    return hashFinalize( hashMixin(0,key));
  }
  
  public static int hash (int key1, int key2){
    int h = hashMixin(0,key1);
    h = hashMixin(h, key2);
    return hashFinalize(h);
  }
  
  public static int hash (long key) {
    int h = hashMixin(0, (int)key);
    h = hashMixin( h, (int)(key>>32));
    return hashFinalize(h);
  }
  
  public static int hash (int key1, int key2, int key3) {
    int h = hashMixin( 0, key1);
    h = hashMixin( h, key2);
    h = hashMixin( h, key3);
    
    return hashFinalize(h);
    
  }
}
