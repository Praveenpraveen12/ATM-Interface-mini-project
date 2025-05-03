public class AccountHolder {
    private String userId;
    private String pin;

    public AccountHolder(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public String getUserId() {
        return userId;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }
}
