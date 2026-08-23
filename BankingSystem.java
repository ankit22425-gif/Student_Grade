import java.util.Scanner;

public class BankingSystem {

    static double balance = 5000.0;

    static Scanner sc = new Scanner(System.in);

    static void showMenu() {

        System.out.println();
        System.out.println("       SIMPLE BANKING SYSTEM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("   ");
        System.out.print("Enter your choice: ");
    }

    static void checkBalance() {

        System.out.println();
        System.out.println("--");
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("----");
    }

   
    static void depositMoney() {

        System.out.print("Enter deposit amount: Rs. ");

        double amount = sc.nextDouble();

        if (amount > 0) {

            balance = balance + amount;

            System.out.println();
            System.out.println("   ");
            System.out.println("   DEPOSIT SUCCESSFULLY DONE");
            System.out.println("   ");
            System.out.println("Deposited Amount : Rs. " + amount);
            System.out.println("Current Balance  : Rs. " + balance);

        } else {

            System.out.println();
            System.out.println("Invalid Deposit Amount!");
        }
    }

     
    static void withdrawMoney() {

        System.out.print("Enter withdrawal amount: Rs. ");

        double amount = sc.nextDouble();

        if (amount <= 0) {

            System.out.println();
            System.out.println("Invalid Withdrawal Amount!");

        } else if (amount > balance) {

            System.out.println();
            System.out.println("   ");
            System.out.println("  INSUFFICIENT BALANCE");
            System.out.println("  ");
            System.out.println("Current Balance: Rs. " + balance);

        } else {

            balance = balance - amount;

            System.out.println();
            System.out.println("    ");
            System.out.println(" WITHDRAWAL SUCCESSFULLY DONE");
            System.out.println("   ");
            System.out.println("Withdrawn Amount : Rs. " + amount);
            System.out.println("Current Balance  : Rs. " + balance);
        }
    }

      public static void main(String[] args) {

        while (true) {

            showMenu();

            int choice = sc.nextInt();

            if (choice == 1) {

                checkBalance();

            } else if (choice == 2) {

                depositMoney();

            } else if (choice == 3) {

                withdrawMoney();

            } else if (choice == 4) {

                System.out.println();
                System.out.println("   ");
                System.out.println(" Thank You For Using Our Bank!");
                System.out.println("    ");

                break;

            } else {

                System.out.println();
                System.out.println("Invalid Choice!");
                System.out.println("Please enter 1, 2, 3 or 4.");
            }
        }

        sc.close();
    }
}