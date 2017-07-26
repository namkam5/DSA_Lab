import java.util.*;
import java.io.*;

/*

The stack interface supports the following methods

size()
isEmpty()
push(e)
pop
top

Below is the array based implementation

*/

public class ArrayStack<E>{
  
  public static final int CAPACITY = 10000;
  private E[] data;
  private int t = -1;
  
  // constructors
  
  public ArrayStack(){this(CAPACITY);}
  public ArrayStack(int capacity){
    
    data = (E[]) new Object[capacity];
    
  }
  
  // accessor methods
  
  public int size(){return t+1;}
  
  public boolean isEmpty(){return this.size() == 0;}
  
  public void push(E e) {
    if(this.size() == data.length) {
      data[++t] = e;
    }
  }
  
  public E top(){
    
    if(isEmpty())return null;
    return data[t];
    
  }
    
  public E pop(){
    if(isEmpty())return null;
    E answer = data[t];
    data[t] = null;
    t--;
    return answer;
  }
  
  
}