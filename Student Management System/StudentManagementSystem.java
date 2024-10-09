import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
	private List<Student> students;

	public StudentManagementSystem() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(int id) {
		students.removeIf(student -> student.getId() == id);
	}

	public Student findStudent(int id) {
		return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
	}

	public void updateStudent(int id, String name, int age, String course) {
		Student student = findStudent(id);
		if (student != null) {
			student.setName(name);
			student.setAge(age);
			student.setCourse(course);
		}
	}

	public List<Student> getAllStudents() {
		return new ArrayList<>(students);
	}
}
