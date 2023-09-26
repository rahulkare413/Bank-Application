package app4;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    private Map<Integer, Double> accounts = new HashMap<>();
    public void initializeAccounts() {
        int[] accountNumbers = {8877, 9757, 3688, 2584, 1338, 1426, 2329, 5645, 2376, 8980};
        double initialBalance = 1000.0;

        for (int accountNumber : accountNumbers) {
            accounts.put(accountNumber, initialBalance);
        }
    }

    public Map<Integer, Double> getAccounts() {
        return accounts;
    }
}

