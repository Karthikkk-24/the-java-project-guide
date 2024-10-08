public class Task {
	private String description;
	private boolean isCompleted;

	public Task(String description) {
		this.description = description;
		this.isCompleted = false;
	}

	public String getDescription() {
		return description;
	}

	public void markAsCompleted() {
		this.isCompleted = true;
	}

	public void isCompleted() {
		return isCompleted;
	}

	@Override
	public String toString() {
		return (isCompleted ? "✅" : "❌") + " " + description;
	}	
}
