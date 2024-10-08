import java.util.ArrayList;

public class ToDoList {
	private ArrayList<Task> tasks;

	public TodoList() {
		tasks = new ArrayList<>();
	}

	public void addTask(String description)  {
		Task newTask = new Task(description);
		tasks.add(newTask);
		System.out.println("Task added: " + description);
	}

	public void removeTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			Task removedTask = tasks.remove(index);
			System.out.println("Task Removed: " + removedTask.getDescription());
		} else {
			System.out.println("Invalid Task Index.");
		}
	}

	public void markTaskAsComplete(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).markAsCompleted();
			System.out.println("Task Marked As Complete: " + tasks.get(index).getDescription());
		} else {
			System.out.println("Invalid Task Index.");
		}
	}

	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No Tasks Found");
		} else {
			System.out.println("=== To-Do List ===");
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}
}
