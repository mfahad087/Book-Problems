// Invoice class representing an invoice for an item sold at a hardware store
class Invoice {
    // Instance variables
    private String partNumber;       // Part number of the item
    private String partDescription;  // Description of the item
    private int quantity;            // Quantity of the item being purchased
    private double pricePerItem;     // Price per item

    // Constructor to initialize the four instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);         // Validate and set quantity
        setPricePerItem(pricePerItem); // Validate and set price per item
    }

    // Set and get methods for partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    // Set and get methods for partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Set and get methods for quantity
    public void setQuantity(int quantity) {
        // If quantity is not positive, set it to 0
        this.quantity = (quantity > 0) ? quantity : 0; //eternery condition
    }

    public int getQuantity() {
        return quantity;
    }

    // Set and get methods for pricePerItem
    public void setPricePerItem(double pricePerItem) {
        // If price per item is not positive, set it to 0.0
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}



// InvoiceTest class to demonstrate the capabilities of the Invoice class
public class ch7_11 {
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("1234", "Hammer", 2, 14.95);

        // Display the initial invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
  
        // Test setting invalid values
        invoice.setQuantity(-5); // Should set quantity to 0
        invoice.setPricePerItem(-10.0); // Should set price per item to 0.0

        // Display updated invoice details
        System.out.println("\nAfter setting invalid values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        // Test setting valid values
        invoice.setQuantity(10);
        invoice.setPricePerItem(9.99);

        // Display final invoice details
        System.out.println("\nAfter setting valid values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}