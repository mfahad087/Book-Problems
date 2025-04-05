// Date class (Assuming a simple version for this example)
class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // toString method for formatting
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

// Employee class with final instance variables
public class chap8_20 {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hireDate;

    // Constructor to initialize all final variables
    public chap8_20 (String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // Convert Employee to String format
    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }

    public static void main(String[] args) {
        Date birth = new Date(15, 6, 1995);
        Date hire = new Date(1, 1, 2020);
        chap8_20 emp = new chap8_20 ("Ali", "Khan", birth, hire);

        System.out.println(emp);
    }
}