import java.util.ArrayList;

public class Member {
	private String name;
	private String memberId;
	private ArrayList<Book> borrowedBooks;

	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = new ArrayList<>();
	}

	public void borrowBook(Book book) {
		if (book.isAvailable()) {
			borrowedBooks.add(book);
			book.issueBook();
			System.out.println("Book borrowed: " + book.getTitle());
		} else {
			System.out.println("Book is not available.");
		}
	}

	public void returnBook(Book book) {
		if (borrowedBooks.remove(book)) {
			book.returnBook();
			System.out.println("Book Returned: " + book.getTitle());
		} else {
			System.out.println("You don't have this book.");
		}
	}

	public void displayBorrowedBooks() {
		if (borrowedBooks.isEmpty()) {
			System.out.println("No Borrowed Books.");
		} else {
			System.out.println("Borrowed Books: ");
			for (Book book : borrowedBooks) {
				System.out.println(book);
			}
		}
	}

	public String getName() {
		return name;
	} 

	public String getMemberId() {
		return memberId;
	}

}
