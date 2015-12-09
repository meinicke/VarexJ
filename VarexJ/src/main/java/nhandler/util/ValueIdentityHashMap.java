/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

package nhandler.util;

import java.util.HashMap;

/**
 * This is a value identity HashMap. Its contiansValue method compares 
 * the identity of the given object with the identities of the ones in 
 * the map. 
 */
@SuppressWarnings("serial")
public class ValueIdentityHashMap<K, V> extends HashMap<K, V> {

  /**
   * Compares the identity of the given object with the identities of
   * the objects in this map.
   * 
   * @param value
   *          the object to be compared with the map content
   *
   * @return true if the map includes an object with the same identity 
   * as the given object  
   */
  public boolean containsValue (Object value){
    for (V v : this.values()){
      if (value == v){ 
        return true; 
      }
    }
    return false;
  }
}