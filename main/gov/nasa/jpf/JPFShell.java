//
// Copyright (C) 2009 United States Government as represented by the
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
 * type that can be used to instantiate and run a JPF object
 * Shell objects can be configured via the JPF 'shell' property, and are
 * typically JPF user interface implementations
 * 
 * Instantiation and start() call are done from the JPF.main() method
 *
 * Usually, JPFShell implementors have a <init>(Config) ctor so that they
 * don't need to obtain a new Config object. This is the reason for
 * using a shell *instance* instead of a static main() method - we cannot
 * pass the Config object that was already created by JPF.main() at this point
 * into the shell main(), which means we would either have to turn Config
 * into a singleton (causing problems for multiple JPF runs), or create a new
 * Config object within the shell. Since initialization of Config objects is
 * an expensive task with our new bootstrapping, it seems better to pass the
 * Config object from JPF.main() (which is done automatically when using
 * Config based initialization)
 */
public interface JPFShell {

  void start(String[] args);
}
