package gov.nasa.jpf.util;

public interface IntSet extends Cloneable {

  boolean add (int i);
  boolean remove (int i);
  boolean contains (int i);
  
  boolean isEmpty();
  int size();
  
  void clear();
  
  IntIterator intIterator();
  
  IntSet clone();
}
