import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Find Student");
			System.out.println("4. Update Student");
			System.out.println("5. Display All Students");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Enter Student ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Student Age: ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Course: ");
					String course = sc.nextLine();
					sms.addStudent(new Student(id, name, age, course));
					break;
				case 2:
					System.out.println("Enter Student ID to remove: ");
					sms.removeStudent(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Student ID to find: ");
					Student foundStudent = sms.findStudent(sc.nextInt());
					System.out.println(foundStudent != null ? foundStudent : "Student not found");
					break;
				case 4:
					System.out.println("Enter Student ID to update: ");
					int updateId = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter new name: ");
					String newName = sc.nextLine();
					System.out.println("Enter new age: ");
					int newAge = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter new course: ");
					String newCourse = sc.nextLine();
					sms.updateStudent(updateId, newName, newAge, newCourse);
					break;
				case 5:
					sms.getAllStudents().forEach(System.out::println);
					break;
				case 6:
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
