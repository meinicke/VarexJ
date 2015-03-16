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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * this is just a placeholder for now, we don't support its functionality
 */
public class JPF_sun_misc_VM extends NativePeer {
  
  @MJI
  public void initialize____V (MJIEnv env, int clsObjRef, FeatureExpr ctx){
    // nothing here yet
  }

    @MJI
    public int getSavedProperty__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int rString0, FeatureExpr ctx) {
        // used in ZipFile.java, required property: sun.zip.disableMemoryMapping
        // for now, just return null.
        int rString = MJIEnv.NULL;
        return rString;
    }
}
