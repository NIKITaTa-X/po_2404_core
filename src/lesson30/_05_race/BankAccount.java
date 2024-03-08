package lesson30._05_race;

public class BankAccount {
    private long balance;
    private final Object lock = new Object();

    public BankAccount(long balance) {
        this.balance = balance;
    }

    public void withdraw(long amount) {
        synchronized (lock) {
            var newBalance = balance - amount;
            balance = newBalance;
        }
    }

    public void deposit(long amount) {
        synchronized (lock) {
            var newBalance = balance + amount;
            balance = newBalance;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
