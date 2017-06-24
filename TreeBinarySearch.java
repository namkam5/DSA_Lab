import java.util.*;
import java.io.*;

public class Main{

    public static void main(String args[]){

      
   }

}

class BST{
  
  Node root;
  
  public boolean isEmpty(){
    return root==null;
    
  }
  
  public Node insert(Node root , int data){
    
    Node current = root;
    
    if(current == null){
      current = new Node(data);
    }
    
    else{
      
      if(data <= current.val){
        current.left = insert(current.left,data);
      }
      else{
        current.right = insert(current.right,data);
      }
      
    }
    
    return current;
    
  }
  
  public void delete(Node root, int k){
    
    Node current = root;
    
    if(current == null){
      System.out.println("empty tree");
    }
    
    else
  }
  
  
  
}

class Node{
    int val;
    Node left;
    Node right;

    Node(int x){
        val = x;
    }
}