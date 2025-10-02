package part1;

public class Main {

	public static void main(String[] args) {
		TaskManagementSystem T = new TaskManagementSystem();
		T.addTask("Task 1", 10, 6, 2024, false, "Work");
		T.addTask("Task 2", 5, 6, 2024, true, "Personal");
		T.addTask("Task 3", 15, 6, 2024, true, "Work");
		T.addTask("Task 4", 20, 6, 2024, false, "Personal");

		System.out.println("Tasks by Due Date:");
		T.displayTasksByDueDate();
		
		System.out.println("\nUrgent Tasks:");
		T.displayUrgentTasks();
		
		System.out.println("\nTasks by Category 'Work':");
		T.displayTasksByCategory("Personal");
		
		T.markTaskAsCompleted("Task 2");
		T.markTaskAsCompleted("Task 3");

		System.out.println("\nTasks by Due Date:");
		T.displayTasksByDueDate();
		
		System.out.println("\nCompleted Tasks:");
		T.printCompletedTasks();
	}
}
