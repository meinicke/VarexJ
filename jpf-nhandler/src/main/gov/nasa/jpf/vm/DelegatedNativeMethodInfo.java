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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.vm.MethodInfo;

/** 
 * This is a subclass of NativeMethodInfo which makes executeNative() delegate
 * the execution of the unhandled native method to the JVM level.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class DelegatedNativeMethodInfo extends DelegatedMethodInfo {

  public DelegatedNativeMethodInfo (MethodInfo mi) {
    super(mi);
  }

  @Override
  protected String printInfo() {
    return("* DELEGATING Unhandled Native -> " + this.ci.getName() + "." + this.name);
  }
}
