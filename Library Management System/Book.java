public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;
	
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void issueBook() {
		if (!isAvailable) {
			System.out.println("Book is already issued");
			return;
		}
		
		isAvailable = false;
	}

	public void returnBook() {
		isAvailable = true;
	}

	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + ") - " + (isAvailable ? "Available" : "Not Available");
	}
}
