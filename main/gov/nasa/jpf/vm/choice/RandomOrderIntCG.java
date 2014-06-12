package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.IntChoiceGenerator;

/**
 * a generic IntChoiceGenerator randomizer. Not very efficient for large int intervals
 */
public class RandomOrderIntCG extends ChoiceGeneratorBase<Integer> implements IntChoiceGenerator {
  protected int[] choices;
  
  protected int nextIdx;
  
  public RandomOrderIntCG(IntChoiceGenerator sub) {
    super(sub.getId());
    setPreviousChoiceGenerator(sub.getPreviousChoiceGenerator());
    choices = new int[sub.getTotalNumberOfChoices()];
    for (int i = 0; i < choices.length; i++) {
      sub.advance();
      choices[i] = sub.getNextChoice();
    }
    for (int i = choices.length - 1; i > 0; i--) { // all but first
      int j = random.nextInt(i + 1);
      int tmp = choices[i];
      choices[i] = choices[j];
      choices[j] = tmp;
    }
    nextIdx = -1;
  }

  public Integer getNextChoice() {
    return new Integer(choices[nextIdx]);
  }

  public void advance() {
    if (nextIdx + 1 < choices.length) nextIdx++;
  }

  public int getProcessedNumberOfChoices() {
    return nextIdx+1;
  }

  public int getTotalNumberOfChoices() {
    return choices.length;
  }

  public boolean hasMoreChoices() {
    return !isDone && (nextIdx + 1 < choices.length);
  }

  public void reset() {
    nextIdx = -1;

    isDone = false;
  }

  @Override
  public Class<Integer> getChoiceType() {
    return Integer.class;
  }
}
