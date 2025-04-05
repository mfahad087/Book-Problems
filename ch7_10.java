// Account class with a withdraw method
class Account {
    private String name;     // Stores the account holder's name // null
    private double balance;  // Stores the account balance       // 0.0 

    // Constructor to initialize the account with a name and balance
    public Account(String name , double balance) {
        this.name = name;               // Set the account holder's name
        if (balance > 0.0) {            // Check if the balance is positive
            this.balance = balance;    // Set the balance if it's valid
        }
    }


    // public Account(){         // DEFAULT CONSTRUCTOR ., NO ARGUMENT
    //     this.name=name;
    //     this.balance= balance ;      if no value in main class (OBJECT)
    // }


    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {              // Check if the deposit amount is positive
            balance = balance + depositAmount; // Add the deposit amount to the balance
        }
    }

    // Method to withdraw money from the account

    public void  withdraw (double withdrawalAmount) {
        if (withdrawalAmount > balance) {            // Check if the withdrawal amount is more than the balance
            System.out.println("Withdrawal amount exceeded account balance.");
        } else {
            balance = balance - withdrawalAmount;     // Subtract the withdrawal amount from the balance
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to set the account holder's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the account holder's name
    public String getName() {
        return name;
    }
}

// Main class to test the Account class
 public class ch7_10 {
    public static void main(String[] args) {
        // Create an Account object with an initial balance of $1000.00
        Account account1 = new Account ("John Doe", 1000.00);
       
        // Display initial balance
        System.out.printf("Initial balance for %s: $%.2f%n", account1.getName(), account1.getBalance());

        // Test withdrawing $500.00
        account1.withdraw(500.00);
        System.out.printf("Balance after withdrawing $500.00: $%.2f%n", account1.getBalance());
       // 500


        // Test withdrawing $600.00 (exceeds balance)
        account1.withdraw(600.00);
        System.out.printf("Balance after attempting to withdraw $600.00: $%.2f%n", account1.getBalance());
    }                             // 500
}