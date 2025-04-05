class chap8_06 {
    private double savingsBalance;
    private static double annualInterestRate;

    // Constructor to initialize savings balance
    public chap8_06(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate monthly interest and add to savings balance
    public void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the current savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        // Creating two SavingsAccount objects
        chap8_06 saver1 = new chap8_06(2000.00);
        chap8_06 saver2 = new chap8_06(3000.00);

        // Setting initial interest rate to 4% (0.04)
        chap8_06.modifyInterestRate(0.04);

        // Calculating and displaying balances for 12 months
        System.out.println("Balances for 12 months with 4% interest:");
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: Saver1 = $%.2f, Saver2 = $%.2f%n", month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        // Changing interest rate to 5% (0.05)
        chap8_06.modifyInterestRate(0.05);

        // Calculating and displaying balances for the next month with new rate
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nBalances after one more month with 5% interest:");
        System.out.printf("Saver1 = $%.2f, Saver2 = $%.2f%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}
