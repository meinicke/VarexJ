package gov.nasa.jpf.util;

public interface ReadOnlyObjList<E> extends Iterable<E> {
  E get(int idx);
  int length();
}
