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

package gov.nasa.jpf.util.json;

import gov.nasa.jpf.vm.ChoiceGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan Mushketik
 */
public class CGCall {

  private ArrayList<Value> params = new ArrayList<Value>();
  private String name;

  public CGCall(String name) {
    this.name = name;
  }

  void addParam(Value value) {
    if (value == null) {
      throw new NullPointerException("Null value added to CGCall");
    }

    params.add(value);
  }

  public Value[] getValues() {
    Value paramsArr[] = new Value[params.size()];
    params.toArray(paramsArr);

    return paramsArr;
  }

  public String getName() {
    return name;
  }

  /**
   * This method go through JSON object and finds all CGs to set in a current state.
   * It also gives each CG it's a unique id. Each id is calculated in a following way:
   * <li> If CG call is in the root of JSON object it's id will be equals to it's key in JSON
   * <li> If CG call isn't in a root object it's id will be concatenated keys of
   * all parent objects + key of CG.
   * <li> If CG call is in an object that is an element of array CG's id will be
   * concatenated keys of all parent array + "[i" (where i is a pos of parent object
   * of CG in array + CG's key)
   *
   * This id also used in JSONObject.fillObject() to find CG to use when field that
   * should be set with CG is found.
   *
   * @param jsonObject - parsed JSON object
   * @param CGCreators - hash of factories to create Choice Generators
   * @return list of choice generators that should be set in a current state.
   */
  public static List<ChoiceGenerator<?>> createCGList(JSONObject jsonObject) {
    List<ChoiceGenerator<?>> result = new ArrayList<ChoiceGenerator<?>>();
    createCGs(jsonObject, "", result);

    return result;
  }

  private static void createCGs(JSONObject jsonObject, String prefix, List<ChoiceGenerator<?>> result) {
    for (String cgKey : jsonObject.getCGCallsKeys()) {
      CGCall cgCall = jsonObject.getCGCall(cgKey);
      CGCreator creator = CGCreatorFactory.getFactory().getCGCreator(cgCall.getName());

      ChoiceGenerator<?> newCG = creator.createCG(prefix + cgKey, cgCall.getValues());
      result.add(newCG);
    }

    for (String valueKey : jsonObject.getValuesKeys()) {
      Value v = jsonObject.getValue(valueKey);

      if (v instanceof JSONObjectValue) {
        createCGs(v.getObject(), prefix + valueKey, result);
        
      } else if (v instanceof ArrayValue) {
        Value[] values = v.getArray();

        for (int i = 0; i < values.length; i++) {
          if (values[i] instanceof JSONObjectValue) {
            createCGs(values[i].getObject(), prefix + valueKey + "[" + i, result);
          }
        }
      }
    }
  }
}
