import java.util.ArrayList;
import java.util.Scanner;

public class BankingManagementSystem {

    static double balance = 1000;
    static ArrayList<String> history = new ArrayList<>();

    static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history.add("Deposited: Rs." + amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Withdrawn: Rs." + amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    static void checkBalance() {
        System.out.println("Balance: Rs." + balance);
    }

    static void showHistory() {
        System.out.println("\nTransaction History:");

        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : history) {
                System.out.println(transaction);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- BANKING SYSTEM ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    withdraw(sc.nextDouble());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    showHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
