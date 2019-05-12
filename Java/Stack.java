public class Stack {
	private Node head;
	private int capacity;
	private int size;

	public Stack () {
		this.head = null;
		this.capacity = 100;
		this.size = 0;
	}

	public Stack (Node head) {
		this.head = head;
		this.capacity = 100;
		this.size = 0;
	}

	public Stack (Node head, int capacity) {
		this.head = head;
		this.capacity = capacity;
		this.size = 0;
	}

	public Stack (Stack stack) {
		this.head = stack.head;
		this.capacity = stack.capacity;
		this.size = 0;
	}

	public Node getHead () {
		return this.head;
	}

	public int getCapacity () {
		return this.capacity;
	}

	public int getSize () {
		return this.size;
	}

	public void setHead (Node headv) {
		this.head = head;
	}

	public void setCapacity (int capacity) {
		this.capacity = capacity;
	}

	public void push (int data) {
		if (this.size == this.capacity) {
			System.out.println("Stack Overflow");
		} else {
			if (this.size == 0) {
				this.head = new Node(data);
			} else {
				Node temp = new Node(data);
				temp.setNext(this.head);
				this.head = temp;
			}
		}
	}

	public void pop () {
		if (this.size == 0) {
			System.out.println("Stack Underflow");
		} else {
			this.head = this.head.getNext();
		}
	}

	public void printStack () {
		Node temp = this.head;
		System.out.print("[");
		while (temp != null) {
			System.out.print(" " + temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.print("]");
	}

	public static void main (String args []) {
		Stack stack = new Stack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.getHead().getNext());
		stack.printStack();
	}
}