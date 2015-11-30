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

package gov.nasa.jpf.util;

import gov.nasa.jpf.vm.ClassInfo;

/**
 * utility class that can be used by InstructionFactory implementations to
 * selectively replace bytecodes for specified class sets.
 *
 * Filtering is based on include/exclude name patterns (e.g. for packages) and/or
 * on inheritance (both down- and upwards)
 */
public class ClassInfoFilter {

    // filter using an explicit set of class names (can be used for one-pass load)
  protected StringSetMatcher includes;  // included classes that should use them
  protected StringSetMatcher excludes;  // excluded classes (that should NOT use them)

  // filter using base/derived class sets (only useful in subsequent pass)
  ClassInfo ciLeaf;
  ClassInfo ciRoot;

  public ClassInfoFilter (String[] includeCls, String[] excludeCls,
                                   ClassInfo rootCls, ClassInfo leafCls) {
    includes = StringSetMatcher.getNonEmpty(includeCls);
    excludes = StringSetMatcher.getNonEmpty(excludeCls);

    ciRoot = rootCls;
    ciLeaf = leafCls;
  }


  public boolean isPassing (ClassInfo ci){
    if (ci == null){

      // <??> not clear what to do in this case, since we have nothing to
      // filter on. Since all reflection calls come in here, it's probably
      // better to instrument by default (until we have a better mechanism)
      return true;

    } else {
      String clsName = ci.getName();

      if (StringSetMatcher.isMatch(clsName, includes, excludes)){
        if (ciLeaf == null || ciLeaf.isInstanceOf(ci)){
          if (ciRoot == null || ci.isInstanceOf(ciRoot)){
            return true;
          }
        }
      }
    }

    return false;
  }

}
