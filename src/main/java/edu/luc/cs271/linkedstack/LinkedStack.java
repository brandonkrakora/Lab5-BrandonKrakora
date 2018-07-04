package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // Complete why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // Complete
    Node<E> newNode = new Node<>(obj);
    newNode.next = top;
    top = newNode;
    return newNode.data;
  }

  @Override
  public E peek() {
    // Complete
      if (isEmpty()){
          throw new NoSuchElementException();
      }
    return (top.data);
  }

  @Override
  public E pop() {
    // Complete
      if (isEmpty()){
          throw new NoSuchElementException();
      }
      Node<E> temp = top;
      top = top.next;
    return temp.data;
  }

  @Override
  public boolean isEmpty() {
    // Complete
    return (top == null);
  }

  @Override
  public List<E> asList() {
    // Complete implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // Complete add any instance variable(s) required to support this
    List<E> ListAsStack = new ArrayList<>();
    Node<E> current = top;
    while(current != null){
        ListAsStack.add(current.data);
//        System.out.println(current.data);
        current = current.next;
    }
    return ListAsStack;
  }

}
