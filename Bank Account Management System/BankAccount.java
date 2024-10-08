public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void Deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount, Amount Should Be Grater Than 0!!");
            return;
        }

        balance += amount;
        System.out.println("Deposit Successful");
    }

    public void Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount, Amount Should Be Grater Than 0!!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Fund");
            return;
        }

        balance -= amount;
        System.out.println("Withdraw Successful");
    }

    public void CheckBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    public void DisplayAccountDetails() {
    	System.out.println("Account Holder Name: " + accountHolderName);
	System.out.println("Account Number: " + accountNumber);
	System.out.println("Account Balance: " + balance);
    }
}
