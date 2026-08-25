class Bank {
    private double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class wallet {
    public static void main(String[] args) {

        Bank balance1 = new Bank(1000);
        Bank balance2 = new Bank(2000);

        balance1.deposit(200);
        balance2.withdraw(100);

        balance1.display();
        balance2.display();
    }
}