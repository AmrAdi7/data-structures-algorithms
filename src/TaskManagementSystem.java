package part1;

public class TaskManagementSystem {

	private SingleLinkedList taskList = new SingleLinkedList();
	private Stack urgentTasks = new Stack();
	private Queue completedTasks = new Queue();
	

	public void addTask(String name, int day, int month, int year, boolean isUrgent, String category) {
		Task newTask = new Task(name, day, month, year, isUrgent, category);
		taskList.addTask(newTask);
		if (isUrgent) {
			urgentTasks.push(newTask);
		}
	}

	public void displayTasksByDueDate() {
		taskList.displayTasks();
	}

	public void markTaskAsCompleted(String name) {
        Node current = taskList.getHead();
        while (current != null) {
            if (current.getTask().getName().equals(name) && !current.getTask().isCompleted()) {
                current.getTask().setCompleted(true);
                completedTasks.enqueue(current.getTask()); 
                taskList.removeTask(current.getTask());
                break;
            }
            current = current.getNext();
        }
    }

	public void displayUrgentTasks() {
		Stack tempStack = new Stack();
		while (!urgentTasks.isEmpty()) {
			Task task = urgentTasks.pop();
			System.out.println(task.getName() + " | " + task.getDay() + " | " + task.getMonth() + " | " + task.getYear()
					+ " | " + task.isUrgent() + " | " + task.getCategory());
			tempStack.push(task);
		}
		urgentTasks = tempStack;
	}

	public void displayTasksByCategory(String category) {
		Node current = taskList.getHead();
		while (current != null) {
			if (current.getTask().getCategory().equals(category)) {
				Task task = current.getTask();
				System.out.println(task.getName() + " | " + task.getDay() + " | " + task.getMonth() + " | "
						+ task.getYear() + " | " + task.isUrgent() + " | " + task.getCategory());
			}
			current = current.getNext();
		}
	}
	
	 public void printCompletedTasks() {
	        Queue tempQueue = new Queue();
	        while (!completedTasks.isEmpty()) {
	            Task task = completedTasks.dequeue();
	            System.out.println(task.getName() + " | " + task.getDay() + " | " + task.getMonth() + " | " + task.getYear()
	                    + " | " + task.isUrgent() + " | " + task.getCategory());
	            tempQueue.enqueue(task);
	        }
	        completedTasks = tempQueue;
	    }

	public SingleLinkedList getTaskList() {
		return taskList;
	}

	public Stack getUrgentTasks() {
		return urgentTasks;
	}

	public Queue getCompletedTasks() {
		return completedTasks;
	}

	public void setTaskList(SingleLinkedList taskList) {
		this.taskList = taskList;
	}

	public void setUrgentTasks(Stack urgentTasks) {
		this.urgentTasks = urgentTasks;
	}

	public void setCompletedTasks(Queue completedTasks) {
		this.completedTasks = completedTasks;
	}

	
	
	

}
