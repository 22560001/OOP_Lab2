package Bank;

class Account {
    private int accountNumber;
    private String customerName;
    private double balance; // in USD

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance; // in USD
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Deposited Successfully");
        } else {
            System.out.println("Invalid amount to deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn Successfully");
        } else {
            System.out.println("Invalid amount to withdraw or Insufficient balance");
        }
    }
}
