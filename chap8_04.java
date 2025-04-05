// Create a class Cylinder with attributes radius and height, each of
// which has a default value of 1. Provide a method that calculates the cylinders’ volume, which
// is pi multiplied by the square of the radius multiplied by the height. It has set and get meth
// ods for both radius and height. The set method should verify that radius and height are pos
// itive numbers. Write a program to test class Cylinder.

class Cylinder {
    private double radius = 1;  // Default value
    private double height = 1;  // Default value

    // Constructor
    public Cylinder() {}

    // Set method for radius (validation included)
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive!");
        }
    }

    // Set method for height (validation included)
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive!");
        }
    }

    // Get method for radius
    public double getRadius() {
        return radius;
    }

    // Get method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Test Program
public class chap8_04 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(); // Uses default values
        System.out.println("Default Cylinder Volume: " + c1.calculateVolume());

        // Setting new values
        c1.setRadius(5);
        c1.setHeight(10);
        
        System.out.println("Updated Radius: " + c1.getRadius());
        System.out.println("Updated Height: " + c1.getHeight());
        System.out.println("Updated Cylinder Volume: " + c1.calculateVolume());

        // Trying to set a negative value
        c1.setRadius(-3); // Should show an error message
    }
}
