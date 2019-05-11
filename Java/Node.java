public class Node {
	// private instance variables 
	private int data;
	private Node next;

	//Constructors for the Node class
	public Node (){
		this.data = 0;
		this.next = null;
	}

	public Node (int data) {
		this.data = data;
		this.next = null;
	}

	public Node (int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node (Node node) {
		this.data = node.getData();
		this.next = node.getNext();
	}

	public int getData () {
		return this.data;
	}

	public Node getNext () {
		return this.next;
	}

	public void setData (int data) {
		this.data = data;
	}

	public void setNext (Node next) {
		this.next = next;
	}
}