import java.util.*;
import java.io.*;

public class BinaryTree {

	Node root;

	public void addNode(String key, String name){

		Node newNode = new Node(key,name);

		if (root == null){

			root = newNode;

		} else{

			Node focusNode = root;
			Node parent;

			while(true){

				parent = focusNode;

				if (key.compareTo(focusNode.key) < 0){

					focusNode = focusNode.leftChild;

					if(focusNode == null){

						parent.leftChild = newNode;
						return;

					}

				} else {

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

	public void preOrderTraverseTree(Node focusNode){

	if (focusNode != null) {
		
		System.out.println(focusNode);

		preOrderTraverseTree(focusNode.leftChild);

		preOrderTraverseTree(focusNode.rightChild);
	}

}
	
	public void postOrderTraverseTree(Node focusNode){

	if (focusNode != null) {
		
		postOrderTraverseTree(focusNode.leftChild);
		
		postOrderTraverseTree(focusNode.rightChild);

		System.out.println(focusNode);
	}

}








	public static void  main(String[] args){

		BinaryTree theTree = new BinaryTree();
		String a = "";
	
			try(BufferedReader br = new BufferedReader(new FileReader("bintree.dat"))){	

					while((a = br.readLine()) != null ){

				
					String string = a;


					String [] parts = string.split(" ");
					String id = parts[0];
					String name = parts[1];

				

					theTree.addNode(id,name);
				}	
			}
			catch (Exception e){};

				System.out.println("\n /////Now InOrder///// \n");
				theTree.inOrderTraverseTree(theTree.root);
				System.out.println("\n /////Now PreOrder///// \n");
				theTree.preOrderTraverseTree(theTree.root);
				System.out.println("\n /////Now PostOrder///// \n");
				theTree.postOrderTraverseTree(theTree.root);
		

	}


}


class Node {

	String key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(String key, String name){

		this.key = key;
		this.name = name;

	}

	public String toString(){

		return name + " has the key " + key;
	}
}