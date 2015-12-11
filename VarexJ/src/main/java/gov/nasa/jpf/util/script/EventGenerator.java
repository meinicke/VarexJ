package gov.nasa.jpf.util.script;

import gov.nasa.jpf.vm.ChoiceGeneratorBase;

/**
 * abstract ChoiceGenerator root for Event based generators
 */
public abstract class EventGenerator<T> extends ChoiceGeneratorBase<T> {

  protected EventGenerator (String id){
    super(id);
  }
}
