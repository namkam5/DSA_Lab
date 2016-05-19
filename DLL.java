import java.util.*;
import java.io

public class DLL {

	static root;
	static tmp;
	static current;

	public void addNode(){

		Node node = new Node(data);

		if(root == null){

			root = node;
			root.prev = null;
			root.next = null;

		}else {

			current = root;

			while(current.next!=null){

				current = current.next;
				node.prev = current;
				node.next = null;
			}
		}

	}

	public void insertNode(){

		Node node = new Node(data);

		int ithNode = 1;

		current = root;

		while (ithNode != after){

			current.next = root;
			ithNode++;
		}

		temp = current.next;
		node.next = temp;

	}

	public void deleteNode(){

		kk
	}

	public static void main(String[] args) {
		

	}

	class Node{

		int data;

		Node prev;
		Node next;

		Node(int data){

			this.data = data;
		}



	}
}