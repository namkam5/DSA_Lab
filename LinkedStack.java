import java.util.*;
import java.io.*;

/*

linked list implementation of a stack
implements the following methods

size()
isEmpty()
push(E e)
pop()
top()

*/

public class LinkedStack<E> {
  
  private LinkedList<E> list = new LinkedList<E>();
  
  // constructor
  
  public LinkedStack(){}

  // accessor methods
  
  public int size(){return list.size();}
  
  public boolean isEmpty(){return list.isEmpty();}
  
  // update methods
  
  public void push(E e){
    list.addFirst(e);
  }
  
  public E pop(){
    return list.removeFirst();
  }
  
  public E top(){
    return list.getFirst();
  }
  
}