

// created a abstract class to hide functionality
abstract class BankAccount {
    // encapsulated data --> hiding data 
    private String AccountHolderName;
    private double balance;

    // constructor to initialize variables
    BankAccount(String AccountHolderName, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }
    
    // abstract method to print details
    public abstract void displayDetails();

    // Getter and setter methods
    //getter
    public String getAccountHolderName() {
        return AccountHolderName;
    }
    
    // setter
    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }
    
    // getter
    public double getbalance() {
        return balance;
    }

   // setter
    public void setbalance(double balance) {
        this.balance = balance;
    }
    // method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }
    // method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to show the current balance
    public void currentBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Inheritance -->using super keyword calling
class SavingsAccount extends BankAccount {
    public SavingsAccount(String AccountHolderName, double balance) {
        //super keyword used to inherit parentclass functionality to childclass using super keyword
        super(AccountHolderName, balance);
    }

  //  @Override
    // display details
    public void displayDetails() {
        //System.out.println("Savings Account Details:");
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getbalance());
    }
}

public class Main {
    public static void main(String[] args) {
        // object creation for subclass 
        BankAccount savings = new SavingsAccount("Sharanya T", 2000);
         System.out.println("Savings Account Details:");
        savings.deposit(2000);
        savings.withdraw(500);
        savings.displayDetails();
        savings.currentBalance();
    }
}
