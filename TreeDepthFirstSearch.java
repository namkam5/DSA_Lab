// Iterative depth first search of a binary tree using stacks

import java.util.*;
import java.io.*;

public class TreeDepthFirstSeach{

    public static void main(String args[]){

      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(6);
      root.left.right = new Node(7);
      root.right.left = new Node(4);
      root.right.right = new Node(5);
      
      depth(root);
      
    }
   
   static void depth(Node root){
     
     Stack<Node> stack = new Stack<Node>();
     
     if(root == null) return;
     stack.push(root);
     while(!stack.isEmpty()){
       Node temp = stack.pop();
       System.out.println(temp.val);
       if(temp.right != null) stack.push(temp.right);
       if(temp.left != null) stack.push(temp.left);
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