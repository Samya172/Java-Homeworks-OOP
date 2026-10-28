
class Wallet {

    private double balance;
    private final int id;
    private String lastWithdrawMode;
    private static int counter = 1;

    Wallet() {
        this(0);
    }

    Wallet(double balance) {
        this.id = counter++;
        this.balance = balance;
        this.lastWithdrawMode = "None";
    }

    double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    double withdraw(double amount) {
        return withdraw(amount, "ONLINE");
    }

    double withdraw(double amount, String mode) {
        if (amount <= balance) {
            this.balance -= amount;
            this.lastWithdrawMode = mode;
        } else {
            System.out.println("Insufficient balance!");
        }
        return this.balance;
    }

    double getBalance() {
        return this.balance;
    }

    int getId() {
        return this.id;
    }

    String getLastWithdrawMode() {
        return this.lastWithdrawMode;
    }

    static void addBonus(Wallet wallet, double amount) {
        wallet.deposit(amount);
    }
}

public class hw_04_practice {

    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        if (amount <= balance) {
            return balance - amount;
        }
        System.out.println("Insufficient balance!");
        return balance;
    }

    static void swapWallets(Wallet w1, Wallet w2) {
        Wallet temp = w1;
        w1 = w2;
        w2 = temp;
    }

    public static void main(String[] args) {

        double balance_1 = 1000;
        double balance_2 = 500;

        balance_1 = deposit(balance_1, 200);
        balance_2 = withdraw(balance_2, 100);

        System.out.println("Task 1:");
        System.out.println("Balance 1: " + balance_1);
        System.out.println("Balance 2: " + balance_2);

        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet(1000);

        w1.deposit(500);
        w1.withdraw(100);
        w2.withdraw(200, "ATM");

        System.out.println("\nTask 2, 3, 4:");
        System.out.println("Wallet 1 ID: " + w1.getId());
        System.out.println("Wallet 1 Balance: " + w1.getBalance());

        System.out.println("Wallet 2 ID: " + w2.getId());
        System.out.println("Wallet 2 Balance: " + w2.getBalance());
        System.out.println("Last Withdraw Mode: "
                + w2.getLastWithdrawMode());

        Wallet.addBonus(w1, 100);

        System.out.println("\nTask 5:");
        System.out.println("Wallet 1 after bonus: " + w1.getBalance());

        swapWallets(w1, w2);

        System.out.println("Wallet 1 after swap: " + w1.getBalance());
        System.out.println("Wallet 2 after swap: " + w2.getBalance());
    }
}
