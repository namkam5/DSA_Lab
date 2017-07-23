/*

The singly linked list class has the following methods

1. size()
2. isEmpty()
3. first()
4. last()
5. addFirst()
6. addLast()
7. removeFirst()

*/

public class SinglyLinkedList{
  
  private Node head = null;
  private Node tail = null;
  private int size = 0;
  
  public SinglyLinkedList(){}
  
  // access methods
  
  public int size(){return this.size;}
  public boolean isEmpty(){return this.size==0;}
  
  public Node first(){
    if(this.isEmpty())return null;
    return this.head;
  }
  
  public Node last(){
    if(this.isEmpty()) return null;
    return this.tail;
  }
  
  
  // update methods
  
  public void addFirst(int e){
    
    if(this.isEmpty()){
      Node temp = new Node(e);
      this.head = temp;
      this.tail = temp;
      this.size++;
      return;
    }
    Node temp = new Node(e);
    temp.next = head;
    this.head = temp;
    this.size++;
    return;
  }
  
  public void addLast(int e){
    
    if(this.isEmpty()){
      Node temp = new Node(e);
      this.head = temp;
      this.tail = temp;
      this.size++;
      return;
    }
    
      Node temp = new Node(e);
      this.tail.next = temp;
      this.size++;
    }
  
  public Node removeFirst(){
    if(this.isEmpty())return null;
    Node temp = this.head;
    this.head = temp.next;
    this.size--;
    if(this.isEmpty()) this.tail = this.head;
    return temp;
  }
  
}


class Node{
  
  Node next = null;
  int val;
  
  Node(int d){
    val = d;
  }
  
}