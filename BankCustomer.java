public class BankCustomer {
    // Attributes
    String cust_name;
    int cust_id;
    String cust_address;

    // Constructor to initialize values
    public BankCustomer(String name, int id, String address) {
        cust_name = name;
        cust_id = id;
        cust_address = address;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer Address: " + cust_address);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a customer object
        BankCustomer customer1 = new BankCustomer("Lokesh", 101, "123 Main Street, Yashwanthpur");

        // Displaying customer details
        customer1.displayCustomerDetails();

    }
}