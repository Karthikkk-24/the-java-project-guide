
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int option;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Display Member's Borrowed Books");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = sc.nextLine();
                    Book newBook = new Book(title, author, ISBN);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeISBN = sc.nextLine();
                    library.removeBook(removeISBN);
                    break;
                case 3:
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = sc.nextLine();
                    Member newMember = new Member(name, memberId);
                    library.addMember(newMember);
                    break;
                case 4:
                    System.out.print("Enter member ID: ");
                    String issueMemberId = sc.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String issueISBN = sc.nextLine();
                    library.issueBook(issueMemberId, issueISBN);
                    break;
                case 5:
                    System.out.print("Enter member ID: ");
                    String returnMemberId = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String returnISBN = sc.nextLine();
                    library.returnBook(returnMemberId, returnISBN);
                    break;
                case 6:
                    library.displayBooks();
                    break;
                case 7:
                    System.out.print("Enter member ID: ");
                    String displayMemberId = sc.nextLine();
                    library.displayMemberBooks(displayMemberId);
                    break;
                case 8:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid Option. Please Try Again!");
            }
        } while (option != 8);

        sc.close();
    }
}
