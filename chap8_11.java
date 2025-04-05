import java.util.Scanner;

class chap8_11 {
    private double realPart; 
    private double imaginaryPart;

    // No-argument constructor with default values (0,0)
    public chap8_11() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with parameters
    public chap8_11(double real, double imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    // Method to add two Complex numbers
    public chap8_11 add(chap8_11 other) {
        return new chap8_11(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart);
    }

    // Method to subtract two Complex numbers
    public chap8_11 subtract(chap8_11 other) {
        return new chap8_11(this.realPart - other.realPart, this.imaginaryPart - other.imaginaryPart);
    }

    // Method to print complex number in (real, imaginary) format
    public void printComplex() {
        System.out.println("(" + realPart + ", " + imaginaryPart + ")");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = input.nextDouble();
        chap8_11 c1 = new chap8_11(real1, imaginary1);

        // Taking user input for second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = input.nextDouble();
        chap8_11 c2 = new chap8_11(real2, imaginary2);

        // Performing operations
        chap8_11 sum = c1.add(c2);
        chap8_11 difference = c1.subtract(c2);

        // Display results
        System.out.print("First Complex Number: ");
        c1.printComplex();
        
        System.out.print("Second Complex Number: ");
        c2.printComplex();

        System.out.print("Sum of Complex Numbers: ");
        sum.printComplex();

        System.out.print("Difference of Complex Numbers: ");
        difference.printComplex();

        input.close();
    }
}
