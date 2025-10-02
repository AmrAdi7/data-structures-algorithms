package part1;

public class SingleLinkedList {

	private Node head;

	public SingleLinkedList() {
		this.head = null;
	}

	public void addTask(Task task) {
		Node newNode = new Node(task);
		if (head == null || compareDates(task, head.getTask()) < 0) {
			newNode.setNext(head);
			head = newNode;
		} else {
			Node current = head;
			while (current.getNext() != null && compareDates(task, current.getNext().getTask()) >= 0) {
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
	}

	private int compareDates(Task task1, Task task2) {
		if (task1.getYear() != task2.getYear()) {
			return task1.getYear() - task2.getYear();
		} else if (task1.getMonth() != task2.getMonth()) {
			return task1.getMonth() - task2.getMonth();
		} else {
			return task1.getDay() - task2.getDay();
		}
	}

	public void removeTask(Task task) {
		if (head == null)
			return;

		if (head.getTask() == task) {
			head = head.getNext();
			return;
		}

		Node current = head;
		while (current.getNext() != null) {
			if (current.getNext().getTask() == task) {
				current.setNext(current.getNext().getNext());
				return;
			}
			current = current.getNext();
		}
	}

	public void displayTasks() {
		Node current = head;
		while (current != null) {
			Task task = current.getTask();
			System.out.println(task.getName() + " | " + task.getDay() + " | " + task.getMonth() + " | " + task.getYear()
					+ " | " + task.isUrgent() + " | " + task.getCategory());
			current = current.getNext();
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	


}
