import java.io.*;
import java.util.*;

public class BinaryT {

	Node root;

	public void addNode (String key, String value){

		Node newNode = new Node (key, value);

		if (root == null) {

			root = newNode;
		
		} else {

			Node focusNode = root;
			Node parent;

			while(true){

				parent = focusNode;

				if (key.compareTo(focusNode.key) < 0 ){

					focusNode = focusNode.leftChild;

					if (focusNode == null){

						parent.leftChild = newNode;
						return;
					}

				}else {

					focusNode = focusNode.rightChild;

					if (focusNode == null){

						parent.rightChild = newNode;
						return;
					}
				}
			}
		}


	}

	public void inOrderTraverseTree(Node focusNode){

		if (focusNode != null) {
			
			inOrderTraverseTree(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);
		}

	}




	public static void main(String [] args){

		BinaryT theTree = new BinaryT();

		theTree.addNode("123life", "life");

		theTree.inOrderTraverseTree(theTree.root);



	}
}

class Node {

	String key;
	String value;

	Node leftChild;
	Node rightChild;

	Node (String key, String value){

		this.key = key;
		this.value = value;
	}

	public String toString(){

		return value + " has a key " + key;
	}
}