package app4;

import java.util.Map;
import java.util.Scanner;

public class LogicalClass {

    private Map<Integer, Double> accounts;

    public LogicalClass(Map<Integer, Double> accounts) {
        this.accounts = accounts;
    }

    public void creditBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = sc.nextInt();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("ENTER AMOUNT TO CREDIT: ");
            double amount = sc.nextDouble();
            double currentBalance = accounts.get(accountNumber);
            accounts.put(accountNumber, currentBalance + amount);
            System.out.println("BALANCE CREDITED SUCCESSFULLY.");
        } else {
            System.out.println("ACCOUNT NOT FOUND");
        }
    }

    public void debitBalance() {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ACCOUNT NUMBER: ");
        int accountNumber = sc.nextInt();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("ENTER AMOUNT TO DEBIT ");
            double amount = sc.nextDouble();
            double currentBalance = accounts.get(accountNumber);
            if (currentBalance >= amount) {
                accounts.put(accountNumber, currentBalance - amount);
                System.out.println("BALANCE DEBITED SUCCESSFULLY.");
            } else {
                System.out.println("INSUFFICIENT BALANCE");
            }
        } else {
            System.out.println("ACCOUNT NOT FOUND");
        }
    }

    public void transferBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TRANSFER ACCOUNT NUMBER ");
        int fromAccount = sc.nextInt();
        System.out.print("ENTER ACCOUNT NUMBER ");
        int toAccount = sc.nextInt();
        if (accounts.containsKey(fromAccount) && accounts.containsKey(toAccount)) {
            System.out.print("Enter AMOUNT TO TRANSFER ");
            double amount = sc.nextDouble();
            double fromBalance = accounts.get(fromAccount);
            if (fromBalance >= amount) {
                double toBalance = accounts.get(toAccount);
                accounts.put(fromAccount, fromBalance - amount);
                accounts.put(toAccount, toBalance + amount);
                System.out.println("BALANCE TRANSFERRED SUCCESSFULLY.");
            } else {
                System.out.println("INSUFFICIENT BALANCE IN THE ACCOUNT ");
            }
        } else {
            System.out.println("ACCOUNTS NOT FOUND ");
        }
    }

    public void displayBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ACCOUNT NUMBER ");
        int accountNumber = sc.nextInt();
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            System.out.println("BALANCE FOR ACCOUNT " + accountNumber + ": " + balance);
        } else {
            System.out.println("ACCOUNTS NOT FOUND");
        }
    }

    public void displayAllAccounts() {
        System.out.println("All ACCOUNT & BALANCES ");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("ACCOUNT " + entry.getKey() + ": " + entry.getValue());
        }
    }
}


