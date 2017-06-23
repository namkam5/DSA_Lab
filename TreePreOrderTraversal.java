/*
    Pre Order traversal implementation for a binary tree
    Note that Depth First search and preorder traversal are same on a binary tree
    This can also be a recursive solution to depth first search

*/

import java.util.*;
import java.io.*;

public class TreePreOrderTraversal{
  
  public static void main(String args[]){
    
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);
    
    preOrder(root);
    
    
  }
  
  static void preOrder(Node n){
    
    if (n == null){
      return;
    }
    
    else{
      System.out.println(n.val);
      preOrder(n.left);
      preOrder(n.right);
    }
    
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