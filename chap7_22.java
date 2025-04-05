import java.time.LocalDate;
import java.time.Period;

class HeartRates {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay); // Automatically validates the date
    }

    public int giveAge() {
        return Period.between(birthDate, LocalDate.now()).getYears(); // Calculate age directly
    }
}

public class chap7_22 {
    public static void main(String[] args) {
        HeartRates h1 = new HeartRates("Fahad", "Alam", 12, 9, 2005);
        int age = h1.giveAge();
        System.out.println("Your Age Is: " + age);
    }
}