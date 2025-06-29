 // Program for access modifiers [ private , public , protected , default ] in java
// Base class representing a bank account

class BankAccount {

    //  Private field: can only be accessed within this class
    private double balance;

    //  Public constructor: accessible from anywhere to initialize balance
    public BankAccount(double initial) {
        balance = initial;
    }

    //  Public method: provides safe read-only access to the balance
    public double getBalance() {
        return balance;
    }

    //  Protected method: accessible to subclasses (even in different packages)
    protected void updateBalance(double amount) {
        balance += amount;
    }
}

// Child class that inherits BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initial) {
        // Call parent constructor to initialize balance
        super(initial);
    }

    // Method to deposit money using protected method
    public void deposit(double amount) {
        //  updateBalance is protected, so it's accessible here
        updateBalance(amount);
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money with basic check
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            updateBalance(-amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Main class to test the BankAccount and SavingsAccount
public class Program87 {

    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount(1000.0);

        // Accessing public method to check initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        //  Cannot access private balance directly:
        // System.out.println(account.balance); //  Compile-time error
        //  Cannot call updateBalance directly here since it's protected
        // account.updateBalance(100); //  Compile-time error
    }
}
