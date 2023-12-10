package Bank;

class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(2023, "Anh Nguyễn", 2003.0);
        Account account2 = new Account(2024, "Elon Musk", 1000000000.0);
        Account account3 = new Account(2030, "Charles George", 10.11);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        bank.depositToAccount(2023, 97);
        
        bank.withdrawFromAccount(2023, 2099.99);
        bank.withdrawFromAccount(2030, 10.12);
        
        bank.removeAccount(2024);
    }
}
