import java.util.Scanner;

public class BankSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = sc.nextLine();

		System.out.println("Enter Account Number: ");
		String accountNumber = sc.nextLine();

		System.out.println("Enter Initial Balance: ");
		double initialBalance = sc.nextDouble();

		BankAccount account = new BankAccount(accountHolderName, accountNumber, initialBalance);

		int option;

		do {
			System.out.println("=========== Banking System Menu ===========");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Account Details");
			System.out.println("5. Exit");
			System.out.println("Choose an option");

			option = sc.nextInt();

			switch(option) {
				case 1:
					System.out.println("Enter Deposit Amount: ");
					double depositAmount = sc.nextDouble();
					account.Deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter Withdraw Amount: ");
					double withdrawAmount = sc.nextDouble();
					account.Withdraw(withdrawAmount);
					break;
				case 3:
					account.CheckBalance();
					break;
				case 4: 
					account.DisplayAccountDetails();
					break;
				case 5:
					System.out.println("Exiting the system. Good Bye!!!");
					break;
				default:
					System.out.println("Invalid Option Selected");
					
			}
		} while (option != 5);

		sc.close();
	}
}
