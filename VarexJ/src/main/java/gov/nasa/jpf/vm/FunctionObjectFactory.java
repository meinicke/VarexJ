/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * The Java Pathfinder core (jpf-core) platform is licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package gov.nasa.jpf.vm;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class FunctionObjectFactory {
  
  public int getFunctionObject(FeatureExpr ctx, int bsIdx, ThreadInfo ti, ClassInfo fiClassInfo, String samUniqueName, 
                                         BootstrapMethodInfo bmi, String[] freeVariableTypeNames, Object[] freeVariableValues) {
    
    ClassLoaderInfo cli = bmi.enclosingClass.getClassLoaderInfo();
    
    ClassInfo funcObjType = cli.getResolvedFuncObjType(bsIdx, fiClassInfo, samUniqueName, bmi, freeVariableTypeNames);
    
    funcObjType.registerClass(ctx, ti);

    Heap heap = ti.getHeap();
    ElementInfo ei = heap.newObject(ctx, funcObjType, ti);
    
    setFuncObjFields(ei, bmi, freeVariableTypeNames, freeVariableValues);
    
    return ei.getObjectRef();
  }
  
  public void setFuncObjFields(ElementInfo funcObj, BootstrapMethodInfo bmi, String[] freeVarTypeNames, Object[] freeVarValues) {
    Fields fields = funcObj.getFields();
    FeatureExpr ctx = null;
    for(int i = 0; i<freeVarTypeNames.length; i++) {
      String typeName = freeVarTypeNames[i];
      if (typeName.equals("byte")) {
        fields.setByteValue(ctx, i, new One<Byte>((Byte)freeVarValues[i]));
      } else if (typeName.equals("char")) {
        fields.setCharValue(ctx, i, new One<Character>((Character)freeVarValues[i]));
      } else if (typeName.equals("short")) {
        fields.setShortValue(ctx, i, new One<Short>((Short)freeVarValues[i]));
      } else if (typeName.equals("int")) {
        fields.setIntValue(ctx, i, new One<Integer>((Integer)freeVarValues[i]));
      } else if (typeName.equals("float")) {
        fields.setFloatValue(ctx, i, new One<Float>((Float)freeVarValues[i]));
      } else if (typeName.equals("long")) {
        fields.setLongValue(ctx, i, new One<Long>((Long)freeVarValues[i]));
      } else if (typeName.equals("double")) {
        fields.setDoubleValue(ctx, i, new One<Double>((Double)freeVarValues[i]));
      } else if (typeName.equals("boolean")) {
        fields.setBooleanValue(ctx, i, new One<Boolean>((Boolean)freeVarValues[i]));
      } else {
        int val = ((ElementInfo)freeVarValues[i]).getObjectRef();
        fields.setReferenceValue(ctx, i, new One<Integer>(val));
      }
    }
  }
}