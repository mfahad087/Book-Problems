import java.util.Scanner;
import java.security.SecureRandom;

public class chap8_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object for user input
        SecureRandom random = new SecureRandom(); // Create SecureRandom object for generating random numbers

        System.out.print("Enter how many random numbers you want: ");
        int n = input.nextInt(); // Read user input for the number of random numbers

        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < n; i++) { // Loop 'n' times
            int randomNumber = 10 + random.nextInt(91); // Generate a number between 10 and 100
            System.out.println(randomNumber); // Print each random number
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
