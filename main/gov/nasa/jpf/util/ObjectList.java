//
// Copyright (C) 2010 United States Government as represented by the
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

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.SystemAttribute;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

/**
 * a minimal container API that transparently handles Object lists which can
 * degenerate to single values that are stored directly. Value lists are
 * implemented by means of a private Node type, which is transparently handled
 * through the (static) ObjectList API 
 * 
 * No null objects can be stored in the list. No list can only contain a single
 * Node object
 * 
 * Conversion between single objects and lists is done transparently if you
 * follow a pattern like:
 * 
 *  Object attr; // either a single value or a list
 *  ..
 *  attr = ObjectList.remove(attr, v);
 * 
 * If there is only one remaining value in a list, the corresponding Node will
 * be replaced with this value. 
 * 
 * iterators are LIFO.
 * 
 * We assume that attribute collections are small, otherwise retrieval and
 * deletion with this API becomes rather inefficient
 * 
 * NOTE: while ObjectList heads are stored in simple Object fields within the
 * user (and therefore could be just overwritten by simple assignments)
 * YOU SHOULD NOT DO THIS! Other extensions or JPF itself could rely on
 * current attributes. In case you have to change the whole list, use
 * set(oldAttrs,newAttr), which checks if there currently is a SystemAttribute
 * instance in the list, in which case it throws a JPFException unless the
 * new attibute value is also a gov.nasa.jpf.SystemAttribute instance. Use
 * forceSet(null) if you really have to remove lists with SystemAttributes  
 * 
 * 
 * usage:
 *  Object attr;
 *  ...
 *    attr = AttrContainer.add( newAttr, attr);
 * 
 *    MyAttr a = AttrContainer.getNext( MyAttr.class, attr);
 * 
 *    attr = AttrContainer.remove( a, attr);
 * 
 *    for (MyAttr a = ObjectList.getFirst(MyAttr.class, attr); a != null;
 *                a = ObjectList.getNext(MyAttr.class, attr, a)) {..}
 * 
 */
public abstract class ObjectList {
  
  // there are no instances, this class is only a static API
  private ObjectList(){}
  
  private static class Node {
    Object data;
    Node next;

    Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }
    
    public boolean equals(Object o){
      if (o instanceof Node){        
        Node n = this;
        Node no = (Node)o;
        for (; n != null && no != null; n=n.next, no=no.next){
          if (!n.data.equals(no.data)){
            return false;
          }
        }
        return (n == null) && (no == null);
      } else {
        return false;
      }
    }
  }

  public static class Iterator implements java.util.Iterator<Object>, Iterable<Object> {
    Object cur;
    
    Iterator (Object head){
      cur = head;
    }
    
    public boolean hasNext() {
      return cur != null;      
    }

    public Object next() {
      if (cur != null){
        if (cur instanceof Node){
          Node n = (Node)cur;
          cur = n.next;
          return n.data;
          
        } else { // single attr value
          Object n = cur;
          cur = null;
          return n;
        }
      } else {
        throw new NoSuchElementException();
      }
    }

    public void remove() {
      // we can't remove since that would have to change the head field in the client
      throw new UnsupportedOperationException();
    }
    
    public java.util.Iterator<Object> iterator(){
      return this;
    }
  }
  
  static final Iterator emptyIterator = new Iterator(null);
  
  public static Iterator iterator (Object head){
    if (head == null){
      return emptyIterator;
    } else {
      return new Iterator(head);
    }
  }
  
  public static class TypedIterator<A> implements java.util.Iterator<A>, Iterable<A> {
    Object cur;
    Class<A> type;
    
    TypedIterator (Object head, Class<A> type){
      this.type = type;
      this.cur = null;
      
      if (head instanceof Node){
        for (Node n = (Node)head; n != null; n = n.next){
          if (type.isAssignableFrom(n.data.getClass())) {
            cur = n;
            break;
          }
        }
      } else if (head != null) {
        if (type.isAssignableFrom(head.getClass())) {
          cur = head;
        }
      }
    }
    
    public boolean hasNext() {
      return cur != null;      
    }

    public A next() {
      
      if (cur != null){
        if (cur instanceof Node){
          Node nCur = (Node)cur;
          cur = null;
          A d = (A)nCur.data;
          
          for (Node n=nCur.next; n != null; n=n.next){
            if (type.isAssignableFrom(n.data.getClass())){
              cur = n;
              break;
            }
          }
          
          return d;
          
        } else { // single attr value
          A d = (A)cur;
          cur = null;
          return d;
        }
        
      } else {
        throw new NoSuchElementException();
      }
    }

    public void remove() {
      // we can't remove since that would have to change the head field in the client
      throw new UnsupportedOperationException();
    }
    
    public java.util.Iterator<A> iterator(){
      return this;
    }
  }
  
  static final TypedIterator<Object> emptyTypedIterator = new TypedIterator<Object>(null,Object.class);
  
  public static <A> TypedIterator<A> typedIterator (Object head, Class<A> type){
    if (head == null){
      return (TypedIterator<A>) emptyTypedIterator;
    } else {
      return new TypedIterator<A>(head, type);
    }
  }
  
  /**
   * this returns either the first value if there is only one element, or
   * a Node list containing all the values in the order they are provided 
   * 
   * note - elements in the list occur in order of arguments, whereas normal
   * add() always adds at the head of the list
   */
  public static Object createList(Object... values){
    if (values.length == 0){
      return null;
      
    } else if (values.length == 1){
      return values[0];
      
    } else {
      Node node = null, next = null;

      for (int i=values.length-1; i>=0; i--){
        node = new Node(values[i], next);
        next = node;
      }
      return node;
    }
  }
    
  public static Object valueOf (Object o){
    return (o instanceof Node) ? ((Node)o).data : o;
  }
    
  public static Object set (Object head, Object newHead){
    if (head == null || newHead instanceof SystemAttribute){
      return newHead; // Ok to overwrite
      
    } else {
      if (head instanceof Node){
        // check if there is any SystemAttribute in the list
        for (Node n = (Node)head; n != null; n = n.next){
          if (n.data instanceof SystemAttribute){
            throw new JPFException("attempt to overwrite SystemAttribute with " + newHead);
          }
        }
        
        return newHead; // Ok to overwrite
        
      } else { // single data attribute
        if (head instanceof SystemAttribute){
          throw new JPFException("attempt to overwrite SystemAttribute with " + newHead);
        } else {
          return newHead; // Ok to overwrite
        }
      }
    }
  }
  
  /**
   * just to provide a way to overwrite SystemAttributes (e.g. with null)
   */
  public static Object forceSet (Object head, Object newHead){
    return newHead;
  }
  
  
  public static Object add (Object head, Object data){
    if (head == null){
      return data;
      
    } else if (data == null){
      return head;
      
    } else {
      if (head instanceof Node){
        return new Node(data, (Node)head);
        
      } else { // was single value -> turn into list
        Node p = new Node(head,null);
        return new Node(data, p);
      }
    }
  }
  
  public static Object replace (Object head, Object oldData, Object newData){
    
    if (oldData == null){
      return head;
    }
    if (newData == null){
      return remove(head, oldData);
    }
    
    if (head instanceof Node){
      for (Node n = (Node)head; n != null; n = n.next){
        if (oldData.equals(n.data)){
          n.data = newData;
        }
      }
      
      return head;
      
    } else {
      if (oldData.equals(head)){
        return newData;
      } else {
        return head;
      }
    }
  }
  
  public static Object remove(Object head, Object data){
    if (head == null){
      return null;
      
    } else if (data == null){
      return head;
      
    } else {
      if (head instanceof Node){
        Node nh = (Node)head;
        
        if (data.equals(nh.data)){
          nh = nh.next;
          
        } else {
          Node n = nh;
          while (true) {
            Node nn = n.next;
            if (nn != null){
              if (nn.data == data){
                n.next = nn.next;
                break;
              } else {
                n = nn;
              }
              
            } else { // end reached
              break;
            }
          }
        }
        
        if (nh.next == null){ // reduce list
          return nh.data;
        } else {
          return nh;
        }
        
      } else { // head not a node -> single value
        if (data.equals(head)){
          return null;
        } else {
          return head;
        }
      }
    }
  }
  
  public static boolean contains (Object head, Object o){
    if (head == null || o == null){
      return false;
      
    } else if (head instanceof Node){
      for (Node n = (Node)head; n != null; n = n.next){
        if (o.equals(n.data)){
          return true;
        }
      }
      return false;
            
    } else {
      return o.equals(head);
    }
  }
  
  public static boolean containsType (Object head, Class<?> type){
    if (head == null || type == null){
      return false;
      
    } else if (head instanceof Node){
      for (Node n = (Node)head; n != null; n = n.next){
        if (type.isAssignableFrom(n.data.getClass())){
          return true;
        }
      }
      return false;
            
    } else {
      return type.isAssignableFrom(head.getClass());
    }
  }
  
  //--- various qualifiers

  public static boolean isList (Object head){
    return (head instanceof Node);
  }
  
  public static boolean isEmpty(Object head){
    return head == null;
  }
  
  public static int size(Object head){
    int len = 0;
    
    if (head instanceof Node){
      for (Node n = (Node) head; n != null; n = n.next) {
        len++;
      }    
    } else {
      if (head != null){
        len = 1;
      }
    }
    
    return len;
  }
  
  public static int numberOfInstances (Object head, Class<?> type){
    int len = 0;
    
    if (head instanceof Node){
      for (Node n = (Node) head; n != null; n = n.next) {
        if (type.isInstance(n.data)){
          len++;
        }
      }    
    } else {
      if (head != null){
        if (type.isInstance(head)){
          len = 1;
        }
      }
    }
    
    return len;
    
  }
  
  public static Object get (Object head, int idx){
    if (head instanceof Node){
      int i=0;
      for (Node n = (Node) head; n != null; n = n.next) {
        if (i++ == idx){
          return n.data;
        }
      }    
    } else {
      if (idx == 0){
        return head;
      }
    }
    
    return null;
  }
  
  public static Object getFirst(Object head){
    if (head instanceof Node){
      return ((Node)head).data;
    } else {
      return head;
    }
  }
  
  public static Object getNext(Object head, Object prevData){
    if (head instanceof Node){
      Node n = (Node)head;
      if (prevData != null){
        for (; n != null && n.data != prevData; n=n.next);
        if (n == null){
          return null;
        } else {
          n = n.next;
        }
      }
      
      return n.data;
      
    } else {
      if (prevData == null){
        return head;
      }
    }
    
    return null;    
  }
  
  public static <A> A getFirst (Object head, Class<A> type){
    if (head != null){
      if (type.isAssignableFrom(head.getClass())) {
        return (A) head;
      }

      if (head instanceof Node) {
        for (Node n = (Node) head; n != null; n = n.next) {
          if (type.isAssignableFrom(n.data.getClass())) {
            return (A) n.data;
          }
        }
      }
    }
    
    return null;
  }
  
  public static <A> A getNext (Object head, Class<A> type, Object prevData){
    if (head instanceof Node){
      Node n = (Node)head;
      if (prevData != null){
        for (; n != null && n.data != prevData; n=n.next);
        if (n == null){
          return null;
        } else {
          n = n.next;
        }
      }
      
      for (; n != null; n = n.next) {
        if (type.isAssignableFrom(n.data.getClass())) {
          return (A) n.data;
        }
      }
      
    } else if (head != null) {
      if (prevData == null){
        if (type.isAssignableFrom(head.getClass())){
          return (A)head;
        }
      }
    }
    
    return null;
  }
  
  public static void hash (Object head, HashData hd){
    if (head instanceof Node){
      for (Node n = (Node) head; n != null; n = n.next) {
        hd.add(n.data);
      }
            
    } else if (head != null){
      hd.add(head);
    }    
  }
  
  public static boolean equals( Object head1, Object head2){
    if (head1 != null){
      return head1.equals(head2);
    } else {
      return head2 == null; // both null is treated as equal      
    }
  }
  
  static Object cloneData (Object o) throws CloneNotSupportedException {
    if (o instanceof CloneableObject) {
      CloneableObject co = (CloneableObject) o;
      return co.clone();
      
    } else if (o != null) {
      Class<?> cls = o.getClass();
      try {
        Method m = cls.getMethod("clone");
        // it can't be static because this would mask Object.clone()
        // since Class.getMethod() only returns publics, we don't have to set accessible
        return m.invoke(o);
        
      } catch (NoSuchMethodException nsmx){
        // since Object.clone() would throw it (unless this is a Cloneable, in which
        // case there most probably is a public clone() and we would not have
        // gotten here), there is no use trying to call it
        throw new CloneNotSupportedException("no public clone(): " + o);
      } catch (InvocationTargetException ix){
        throw new RuntimeException( "generic clone failed: " + o, ix.getCause());
      } catch (IllegalAccessException iax){
        throw new RuntimeException("clone() not accessible: " + o);
      }
      
    } else {
      return null;
    }
  }
  
  static Node cloneNode (Node n) throws CloneNotSupportedException {
    if (n == null){
      return null;
    } else {
      return new Node( cloneData(n.data), cloneNode(n.next));
    }
  }
  
  public static Object clone (Object head) throws CloneNotSupportedException {
    if (head instanceof Node){
      return cloneNode( (Node)head);
            
    } else if (head != null){
      return cloneData( head);
      
    } else {
      return null;
    }
    
  }
}
