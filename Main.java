// MUHAMMAD SHAHAN RASHID
// BSE-26S-015
// SE2A
public class Main {
    public static void main(String[] args) {

        System.out.println("Mobile Wallet");
        System.out.println("===================================================");

        // ACCOUNT 1
        MobileWallet account = new MobileWallet();
        account.setAccountTitle("Ali Khan");
        account.setBalance(50000);

        // ACCOUNT 2
        MobileWallet account2 = new MobileWallet();
        account2.setAccountTitle("Muhammad Shahaan Rashid");
        account2.setBalance(800000);
        
        // ACCOUNT 3
        MobileWallet account3 = new MobileWallet();
        account3.setAccountTitle("Muhammad Hamman Rashid");
        account3.setBalance(1000000);

        account.getAccountTitle();
        account.getBalance();
        account.deposit(20000);
        account.withdraw(10000);
        account.getBalance();
        System.out.println("--------------------------------------------------");
        
        account2.getAccountTitle();
        account2.getBalance();
        account2.deposit(100000);
        account2.withdraw(70000);
        account2.getBalance();
        System.out.println("--------------------------------------------------");

        account3.getAccountTitle();
        account3.getBalance();
        account3.deposit(500000);
        account3.withdraw(200000);
        account3.getBalance();
        System.out.println("--------------------------------------------------");

    }
}
