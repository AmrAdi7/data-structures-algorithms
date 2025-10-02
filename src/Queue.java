package part1;

public class Queue {
	private Node front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

	public void enqueue(Task task) {
		Node newNode = new Node(task);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
	}

	public Task dequeue() {
		if (front == null)
			return null;
		Node temp = front;
		front = front.getNext();
		if (front == null)
			rear = null;
		return temp.getTask();
	}


	public boolean isEmpty() {
		return front == null;
	}
	
	public Task peek() {
		if (front == null)
			return null;
		return front.getTask();
	}

	public Node getFront() {
		return front;
	}

	public Node getRear() {
		return rear;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}
	
	
}
