package net.ayd1ndemirci.bank.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static final Map<String, String> transactionCache = new HashMap<>();

    public static void addTransaction(String transaction) {
        transactionCache.put(transaction, transaction);
    }

    public static Map<String, String> getTransactions() {
        return transactionCache;
    }

    public static void removeTransaction(String transaction) {
        transactionCache.remove(transaction);
    }

    public static double getBalance() {
        double balance = 0.0;
        for (String transaction : transactionCache.values()) {
            balance += Double.parseDouble(transaction);
        }
        return balance;
    }

    public static void addMoney(double amount) {
        transactionCache.put("Para Yatırma: " + amount + " TL", String.valueOf(amount));
    }

    public static void takeMoney(double amount) {
        transactionCache.put("Para Çekildi:  " + amount + " TL", String.valueOf(-amount));
    }
}
