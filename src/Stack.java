package part1;

public class Stack {
	private Task top;

	public Stack() {
		this.top = null;
	}

	public void push(Task task) {
		if (top == null) {
			top = task;
		} else {
			task.setNext(top);
			top = task;
		}
	}
	
	public Task peek() {
		return top;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public Task pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		Task temp = top;
		top = top.getNext();
		return temp;
	}

	public Task getTop() {
		return top;
	}

	public void setTop(Task top) {
		this.top = top;
	}
	
	

	
}
