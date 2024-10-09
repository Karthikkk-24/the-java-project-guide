
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String ISBN) {
        Book bookToRemove = findBook(ISBN);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book Removed: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public Book findBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(String memberId, String ISBN) {
        Member member = findMember(memberId);
        Book book = findBook(ISBN);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            if (member == null) {
                System.out.println("Member not found.");
            }
            if (book == null) {
                System.out.println("Book not found.");
            }
        }
    }

    public void returnBook(String memberId, String ISBN) {
        Member member = findMember(memberId);
        Book book = findBook(ISBN);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            if (member == null) {
                System.out.println("Member not found.");
            }
            if (book == null) {
                System.out.println("Book not found.");
            }
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("==== Library Books ====");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayMemberBooks(String memberId) {
        Member member = findMember(memberId);
        if (member != null) {
            member.displayBorrowedBooks();
        } else {
            System.out.println("Member not found.");
        }
    }
}
