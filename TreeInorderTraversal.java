import java.util.*;
import java.io.*;

public class TreeInorderTraversal{
  
  public static void main(String args[]){
    
    
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);
    
    inorder(root);
    
  }
  
  
  static void inorder(Node n){
    
    if(n == null){
      return;
    }
    
    else{
      inorder(n.left);
      System.out.println(n.val);
      inorder(n.right);
    }
    
  }
  
}

class Node{
  
  int val ;
  Node left;
  Node right;
  
  Node(int x ){
      val = x;
  }
  
}