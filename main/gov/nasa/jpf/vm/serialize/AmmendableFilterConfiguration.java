//
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.util.ObjVector;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MethodInfo;

import java.util.ArrayList;

public class AmmendableFilterConfiguration implements FilterConfiguration {
  public interface Ammendment {
    public static final boolean POLICY_IGNORE = false;
    public static final boolean POLICY_INCLUDE = true;
  }
  
  public interface FrameAmmendment extends Ammendment {
    FramePolicy ammendFramePolicy(MethodInfo mi, FramePolicy sofar);
    
    //BitArray ammendLocalInclusion(MethodInfo mi, BitArray sofar);
  }
  
  public interface InstanceAmmendment extends Ammendment {
    boolean ammendFieldInclusion(FieldInfo fi, boolean sofar);
  }
  
  public interface StaticAmmendment extends Ammendment {
    boolean ammendFieldInclusion(FieldInfo fi, boolean sofar);
  }

  // convience for implementing both
  public interface FieldAmmendment extends InstanceAmmendment, StaticAmmendment {}
  
  public interface InstanceOverride {
    boolean isOverriding(ClassInfo ci);
    
    Iterable<FieldInfo> getMatchedInstanceFields(ClassInfo ci,
                                  Iterable<FieldInfo> preOverride);
  }

  
  protected final ObjVector<FrameAmmendment> frameAmmendments =
    new ObjVector<FrameAmmendment>(0); 
  
  protected final ObjVector<InstanceAmmendment> instanceAmmendments =
    new ObjVector<InstanceAmmendment>(0); 
  
  protected final ObjVector<StaticAmmendment> staticAmmendments =
    new ObjVector<StaticAmmendment>(0); 
  
  protected final ObjVector<InstanceOverride> instanceOverrides =
    new ObjVector<InstanceOverride>(0);
  
  
  // configuration stuff
  
  public void init(Config config)  {
    appendConfiguredFrameAmmendments(config);
    appendConfiguredInstanceAmmendments(config);
    appendConfiguredStaticAmmendments(config);
    appendConfiguredInstanceOverrides(config);
  }

  protected void appendConfiguredFrameAmmendments(Config config) {
    ArrayList<FrameAmmendment> fas =
      config.getInstances("filter.frame_ammendments", FrameAmmendment.class);
    if (fas != null) frameAmmendments.append(fas);
  }
  
  protected void appendConfiguredInstanceAmmendments(Config config) {
    ArrayList<InstanceAmmendment> ias =
      config.getInstances("filter.instance_ammendments", InstanceAmmendment.class);
    if (ias != null) instanceAmmendments.append(ias);
  }  
  
  protected void appendConfiguredStaticAmmendments(Config config) {
    ArrayList<StaticAmmendment> sas =
      config.getInstances("filter.static_ammendments", StaticAmmendment.class);
    if (sas != null) staticAmmendments.append(sas);
  }
  
  protected void appendConfiguredInstanceOverrides(Config config) {
    ArrayList<InstanceOverride> ios =
      config.getInstances("filter.instance_overrides", InstanceOverride.class);
    if (ios != null) instanceOverrides.append(ios);
  }
  

  // public API for adding to configuration
  public void appendFrameAmmendment(FrameAmmendment fa) {
    frameAmmendments.add(fa);
  }
  
  public void appendInstanceAmmendment(InstanceAmmendment ia) {
    instanceAmmendments.add(ia);
  }
  
  public void appendStaticAmmendment(StaticAmmendment sa) {
    staticAmmendments.add(sa);
  }
  
  public void appendFieldAmmendment(FieldAmmendment fa) {
    staticAmmendments.add(fa);
    instanceAmmendments.add(fa);
  }

  public void appendInstanceOverride(InstanceOverride io) {
    instanceOverrides.add(io);
  }
  
  
  // FilterConfiguration Stuff
  public FramePolicy getFramePolicy(MethodInfo mi) {
    FramePolicy policy = new FramePolicy();
    for (FrameAmmendment fa : frameAmmendments) {
      policy = fa.ammendFramePolicy(mi, policy);
    }
    return policy;
  }
  
  // not implemented
  /*public BitArray getFrameLocalInclusion(MethodInfo mi) {
    BitArray cur = new BitArray(mi.getMaxLocals());
    cur.setAll(); // by default include everything
    for (FrameAmmendment fa : frameAmmendments) {
      cur = fa.ammendLocalInclusion(mi, cur);
    }
    return cur;
  }*/

  public Iterable<FieldInfo> getMatchedInstanceFields(ClassInfo ci) {
    int fieldCount = ci.getNumberOfInstanceFields();
    ObjVector<FieldInfo> v = new ObjVector<FieldInfo>(fieldCount); 
    for (int i = 0; i < fieldCount; i++) {
      FieldInfo field = ci.getInstanceField(i);
      boolean include = true;
      for (InstanceAmmendment ia : instanceAmmendments) {
        include = ia.ammendFieldInclusion(field, include);
      }
      if (include) {
        v.add(field);
      }
    }
    Iterable<FieldInfo> ret = v;
    for (InstanceOverride io : instanceOverrides) {
      if (io.isOverriding(ci)) {
        ret = io.getMatchedInstanceFields(ci, ret);
      }
    }
    return ret;
  }

  public Iterable<FieldInfo> getMatchedStaticFields(ClassInfo ci) {
    int fieldCount = ci.getNumberOfStaticFields();
    ObjVector<FieldInfo> v = new ObjVector<FieldInfo>(fieldCount); 
    for (int i = 0; i < fieldCount; i++) {
      FieldInfo field = ci.getStaticField(i);
      boolean include = true;
      for (StaticAmmendment sa : staticAmmendments) {
        include = sa.ammendFieldInclusion(field, include);
      }
      if (include) {
        v.add(field);
      }
    }
    return v;
  }
}
