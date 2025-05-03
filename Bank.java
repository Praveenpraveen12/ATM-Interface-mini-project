import java.util.HashMap;

public class Bank {
    private HashMap<String, AccountHolder> users = new HashMap<>();
    private HashMap<String, Account> accounts = new HashMap<>();

    public void addUser(String userId, String pin) {
        users.put(userId, new AccountHolder(userId, pin));
        accounts.put(userId, new Account(userId));
    }

    public boolean authenticate(String userId, String pin) {
        if (users.containsKey(userId)) {
            return users.get(userId).validatePin(pin);
        }
        return false;
    }

    public Account getAccount(String userId) {
        return accounts.get(userId);
    }
}
