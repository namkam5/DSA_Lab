import java.util.*;
import java.io.*;

public class TreePostOrderTraversal{

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
    
        postOrder(root);

    }

    static void postOrder(Node n){

        if(n == null) return;
        else{
            postOrder(n.left);
            postOrder(n.right);
            System.out.println(n.val);
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