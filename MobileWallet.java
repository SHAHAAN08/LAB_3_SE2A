// MUHAMMAD SHAHAN RASHID
// BSE-26S-015
// SE2A
class MobileWallet  {

    private String accountTitle;
    private double balance;

    // Setter methods
    public void setAccountTitle(String title) {
        accountTitle = title;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    // Getter methods
    public String getAccountTitle() {
        System.out.println("Account Title: " + accountTitle);
        return accountTitle;
    }

    public double getBalance() {
        System.out.println("Current Balance: Rs. " + balance);
        return balance;
    }

    

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative deposit rejected!");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: Rs. " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative withdrawal rejected!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
        }
    }
}
