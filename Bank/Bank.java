package Bank;

class Bank {
    private Account[] accounts;
    private int numOfAccounts;
    private static int MAX_ACCOUNTS = 200; // Maximum number of accounts in the bank

    public Bank() {
        accounts = new Account[MAX_ACCOUNTS];
        numOfAccounts = 0;
    }

    public void addAccount(Account account) {
        if (numOfAccounts < MAX_ACCOUNTS) {
            accounts[numOfAccounts] = account;
            numOfAccounts++;
            System.out.println("Account added successfully");
        } else {
            System.out.println("Cannot add more accounts because Bank is full");
        }
    }
    

    private int findAccountIndex(int accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }
    
    public void removeAccount(int accountNumber) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            for (int i = index; i < numOfAccounts - 1; i++) {
                accounts[i] = accounts[i + 1];
            }
            numOfAccounts--;
            System.out.println("Account removed successfully");
        } else {
            System.out.println("Account not found");
        }
    }

    public void depositToAccount(int accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            accounts[index].deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdrawFromAccount(int accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            accounts[index].withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
