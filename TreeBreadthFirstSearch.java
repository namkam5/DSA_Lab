// Iterative Breadth first search of a tree using queue and linked list

import java.util.*;
import java.io.*;

public class TreeBreadthFirstSearch{

    public static void main(String args[]){

      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(6);
      root.left.right = new Node(7);
      root.right.left = new Node(4);
      root.right.right = new Node(5);
        
      breadth(root);  
      
    }
    
   static void breadth(Node root){
     
     Queue<Node> queue = new LinkedList<Node>();
     
     if(root == null) return;
     queue.add(root);
     while(!queue.isEmpty()){
       
       Node temp = queue.remove();
       System.out.println(temp.val);
       if(temp.left != null) queue.add(temp.left);
       if(temp.right != null) queue.add(temp.right);
       
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