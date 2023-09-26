package app4;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount accountInfo = new BankAccount();
        accountInfo.initializeAccounts();

        LogicalClass accountManager = new LogicalClass(accountInfo.getAccounts());

        int choice;
        do {
            System.out.println("\nBank Balance Transfer Menu:");
            System.out.println("1. CREDIT BALANCE");
            System.out.println("2. DEBIT BALANCE");
            System.out.println("3. TRANSFER BALANCE");
            System.out.println("4. DISPLAY BALANCE");
            System.out.println("5. DISPLAY ALL ACCOUNTS");
            System.out.println("6. EXIT");
            System.out.print("ENTER YOUR CHOICE ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    accountManager.creditBalance();
                    break;
                case 2:
                    accountManager.debitBalance();
                    break;
                case 3:
                    accountManager.transferBalance();
                    break;
                case 4:
                    accountManager.displayBalance();
                    break;
                case 5:
                    accountManager.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Goodbye😊");
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (choice != 6);

        sc.close();
    }
    }

