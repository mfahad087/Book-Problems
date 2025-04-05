// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.
import java.util.Scanner; // Import Scanner for user input
class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance += depositAmount; // add it to the balance
        }
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }
}

public class ch7_14 {

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }

    public static void main(String[] args) {
        // Creating Account objects
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // Deposit to account1
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1 balance

        // Display balances after deposit
        displayAccount(account1);
        displayAccount(account2);

        // Deposit to account2
        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // Display final balances
        displayAccount(account1);
        displayAccount(account2);

        // Close Scanner to avoid resource leaks
        input.close();
    }
}
