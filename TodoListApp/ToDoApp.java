import java.util.Scanner;

public class ToDoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ToDoList toDoList = new ToDoList();

		int option;

		do {
			System.out.println("==== To-Do List Menu ===");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. Mark Task As Complete");
			System.out.println("4. Display Tasks");
			System.out.println("5. Exit");
			System.out.println("Choose An Option: ");

			option = sc.nextInt();
			sc.nextLine();

			switch(option) {
				case 1:
					System.out.println("Enter the task description: ");
					String description = sc.nextLine();
					toDoList.addTask(description);
					break;
				case 2:
					System.out.println("Enter the task number to remove: ");
					int removeIndex = sc.nextInt() - 1;
					toDoList.removeTask(removeindex);
					break;
				case 3:
					System.out.println("Enter the task number to mark as complete: ");
					int completeIndex = sc.nextInt() - 1;
					toDoList.markTaskAsComplete(completeIndex);
					break;
				case 4:
					toDoList.displayTasks();
					break;
				case 5:
					System.out.println("Exiting the application.");
					break;
				default:
					System.out.println("Invalid Option. Please try again.");
			}
		} while (option != 5);
		sc.close();
	}
}
