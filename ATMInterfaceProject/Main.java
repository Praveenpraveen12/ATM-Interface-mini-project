import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ATM Interface!");
        System.out.print("Create your User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Set your PIN: ");
        String pin = scanner.nextLine();

        bank.addUser(userId, pin);
        System.out.println("Account created successfully.\n");

        ATM atm = new ATM(bank);
        atm.start();
    }
}
