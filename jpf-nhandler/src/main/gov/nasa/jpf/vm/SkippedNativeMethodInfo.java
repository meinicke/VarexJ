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

import nhandler.peerGen.PeerClassGen;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativeMethodInfo;
import gov.nasa.jpf.vm.NativePeer;

/**
 * This is a subclass of NativeMethodInfo which makes executeNative() skip the
 * execution of the unhandled native method by executing the corresponding empty 
 * method at the JVM level which returns a dummy value.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class SkippedNativeMethodInfo extends SkippedMethodInfo {

  public SkippedNativeMethodInfo (MethodInfo mi) {
    super(mi);
  }

  @Override
  protected String printInfo() {
    return("* SKIPPING Unhandled Native -> " + this.ci.getName() + "." + this.name);
  }
}
