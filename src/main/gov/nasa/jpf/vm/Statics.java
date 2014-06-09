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
package gov.nasa.jpf.vm;

/**
 * abstraction for the container of StaticElementInfos, which manages static fields.
 * Note that there is a Statics instance per ClassLoaderInfo, i.e. ids are only unique within each
 * ClassLoader namespace.
 * 
 * This container is only growing - we don't remove/recycle classes yet
 * 
 * Since Statics instances have to be obtained from their respective ClassLoaderInfo, and
 * ClassLoaderInfos are the ones that map type names to ClassInfos, Statics does not include
 * methods for name lookup. This allows implementors to use efficient lookup based on the numerical
 * ClassInfo id (which is only unique within this Statics / ClassLoader namespace)
 */
public interface Statics extends Iterable<ElementInfo> {

  //--- construction
  
  /**
   * startup classes are registered and initialized in two steps since object
   * creation has to be deferred until we have at least Object and Class ClassInfos
   */
  StaticElementInfo newStartupClass (ClassInfo ci, ThreadInfo ti);
  
  /**
   * this returns the search global id which is unique within this ClassLoader namespace.
   * This id is also stored in the respective java.lang.Class object
   */
  StaticElementInfo newClass (ClassInfo ci, ThreadInfo ti, ElementInfo eiClsObj);
  
  
  //--- accessors 
  
  /**
   * get an ElementInfo that might or might not be suitable for modification. This should only
   * be used when retrieving field values. The 'id' argument has to be the result of a previous 'newClass()' call
   */
  StaticElementInfo get (int id);
  
  /**
   * get an ElementInfo that is guaranteed to be modifiable. This should be used when modifying
   * field values.  The 'id' argument has to be the result of a previous 'newClass()' call
   */
  StaticElementInfo getModifiable (int id);

  
  //--- housekeeping
  
  Iterable<StaticElementInfo> liveStatics();
  
  void markRoots (Heap heap);
  void cleanUpDanglingReferences (Heap heap);
  
  
  //--- state management
  
  Memento<Statics> getMemento(MementoFactory factory);
  Memento<Statics> getMemento();
  
  int size();
}
