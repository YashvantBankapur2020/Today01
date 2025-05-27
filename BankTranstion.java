// BankTransaction.java
public class BankTranstion {
    // Attributes
    String bank_name;
    String accountholder_name;
    String account_type;
    long account_number;
    double balance;    // Constructor to initialize values
    public BankTranstion(String bankName, String holderName, String accType, long accNumber, double bal) {
        bank_name = bankName;
        accountholder_name = holderName;
        account_type = accType;
        account_number = accNumber;
        balance = bal;
    }

    // Method to display transaction details
    public void displayTransactionDetails() {
        System.out.println("Bank Name: " + bank_name);
        System.out.println("Account Holder Name: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: ₹" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a BankTransaction object
        BankTranstion transaction1 = new BankTranstion("SBI", "Alice Smith", "Savings", 1234567890L, 15000.50);

        // Displaying transaction details
        transaction1.displayTransactionDetails();
    }
}