// This is a level order traversal without a queue
// Note that this is  not the most efficient way to do this.

import java.util.*;
import java.io.*;

public class LevelOrderTraversal{
  
  public static void main(String args[]){
    
    Node root = new Node(2);
    root.left = new Node(3);
    root.right = new Node(4);
    root.left.left = new Node(7);
    root.left.right = new Node(6);
    root.right.left = new Node(5);
    root.right.right = new Node(2);
    
    printLevelOrder(root);
    
  }
  
  static void printLevelOrder(Node root){
    
    int h = height(root);
    for(int i = 1 ; i <= h ; i++){
      printGivenLevel(root,i);
    }
    
  }
  
  static int height(Node n){
    
    if(n == null) return 0;
    else {
      
      int lheight = height(n.left);
      int rheight = height(n.right);
      
      if(lheight > rheight) return lheight+1;
      else{
        return rheight+1;
      }
      
    }
    
  }
  
  static void printGivenLevel(Node root,int level){
    
    if(root == null) return;
    if(level == 1) System.out.println(root.val);
    
    else{
      printGivenLevel(root.left,(level-1));
      printGivenLevel(root.right,(level-1));
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