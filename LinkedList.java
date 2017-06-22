/*
This is a linked list implementation which implements the following methods

1. Insert at start
2. Insert at end
3. Insert at position
4. Delete at position

will add the following later

5. Reverse the linked list

*/

import java.util.*;
import java.io.*;

public class Main{
  
  public static void main(String args[]){
    
    LinkedList mine = new LinkedList();
    
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);
    Node f = new Node(60);
    
    a.next = b;
    b.next = c;
    c.next = d;
    
    
    mine.start = a;
    mine.end = d;
    mine.size = 4;
    
    mine.insertAtPos(75,1);
    mine.deleteAtPos();
    System.out.println(mine.start.val);
    
        
  }
  
}

class LinkedList{
  
  Node start;
  Node end;
  int size=0;
  
  public int size(){
    
    return this.size;
    
  }
  
  public boolean isEmpty(){
    
    if(this.size == 0) return false;
    return true;
    
  }
  
  // Insert at start
  
  public void insertAtStart(int data){
    
      Node newNode = new Node(data);
      
      if(start==null) {
          start = newNode;
          end = start;
      }
      
      else{
        newNode.next = start;
        start = newNode;
        
      }
      
      size++;
  }
  
  // Insert in the end
  
  public void insertAtEnd(int data){
    
    Node newNode = new Node(data);
    
    if(start == null){
      start = newNode;
      end = start;
    }
    
    else{
      end.next = newNode;
      end = newNode;
    }
    size++;
    
  }
  
  // Insert at a position
  
  public void insertAtPos(int data,int pos){
    
    Node newNode = new Node(data);
    Node pointer = start;
    pos = pos - 1;
    size++;
    
    for(int i = 1 ; i < this.size ; i++){
      
      if(i == pos){
        
        newNode.next = pointer.next;
        pointer.next = newNode;
        break;
        
      }
      
      pointer = pointer.next;
    }
    
    size++;
  }
  
  // delete at a position
  
  public void deleteAtPos(int pos){
    
    if(pos == 1){
      
      start = start.next;
      size--;
      return;
      
    }
    
    if(pos == size){
      Node s = start;
      Node t = start;
      
      while(s!=end){
        
        t = s;
        s = s.next;
      }
      
      end = t;
      end.next = null;
      size --;
      return;
    }
    
    Node pointer = start;
    pos = pos - 1;
    
    for(int i = 0 ; i < size ; i++){
      
      if(i == pos){
        
        Node temp = pointer.next;
        temp = temp.next;
        pointer.next = temp;
        break;
      }
      pointer = pointer.next;
      
    }
    size--;
  }
  
  
  
}

class Node{
  
  int val;
  Node next;
  
  Node(int x){
    val = x;
    
  }
  
}