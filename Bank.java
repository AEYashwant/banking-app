import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;
        String user = "";

        while (true) {
            System.out.print("Enter your name: ");
            user = sc.nextLine().trim();

            if (user.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
                continue;
            }
            if (!user.matches("[A-Za-z ]+")) {
                System.out.println("Name can only contain letters. Please try again.");
                continue;
            }
            break;
        }

        System.out.println("\nWelcome, " + user + "! Your starting balance is ₹" + String.format("%.2f", balance));

        int choice;
        do {
            System.out.println("\n=== BANKING MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine().trim();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    checkBalance(balance, user);
                    break;
                case 2:
                    balance = depositAmount(sc, balance);
                    break;
                case 3:
                    balance = withdrawMoney(sc, balance);
                    break;
                case 4:
                    System.out.println("\nThank you for banking with us, " + user + ". Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        sc.close();
    }

    private static void checkBalance(double balance, String user) {
        System.out.println("\n" + user + "'s Current Balance: ₹" + String.format("%.2f", balance));
    }

    private static double depositAmount(Scanner sc, double balance) {
        System.out.print("Enter amount to deposit: ₹");
        String input = sc.nextLine().trim();

        double amount;
        try {
            amount = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Deposit cancelled.");
            return balance;
        }

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return balance;
        }

        balance += amount;
        System.out.println("Deposit successful! New Balance: ₹" + String.format("%.2f", balance));
        return balance;
    }

    private static double withdrawMoney(Scanner sc, double balance) {
        System.out.print("Enter amount to withdraw: ₹");
        String input = sc.nextLine().trim();

        double amount;
        try {
            amount = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Withdrawal cancelled.");
            return balance;
        }

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return balance;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is ₹" + String.format("%.2f", balance));
            return balance;
        }

        balance -= amount;
        System.out.println("Withdrawal successful! New Balance: ₹" + String.format("%.2f", balance));
        return balance;
    }
}
