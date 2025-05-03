import java.util.ArrayList;
import java.util.List;

public class Account {
    private String userId;
    private double balance;
    private List<String> transactions;

    public Account(String userId) {
        this.userId = userId;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: ₹" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: ₹" + amount);
            return true;
        }
        return false;
    }

    public void transfer(Account toAccount, double amount) {
        if (withdraw(amount)) {
            toAccount.deposit(amount);
            transactions.add("Transferred ₹" + amount + " to " + toAccount.userId);
        }
    }

    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (String tx : transactions) {
                System.out.println(tx);
            }
        }
    }
}
