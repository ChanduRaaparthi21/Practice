package com.chandu.java.methods;

public class BankingApp {
    static int currentBalance = 1000;

    public static void greet() {
        System.out.println("Welcome to the banking application");
    }

    public void deposit(int amount) {
        System.out.println("Current balance before deposit: " + currentBalance);
        currentBalance = currentBalance + amount;
        System.out.println("Deposit amount: " + amount);
        System.out.println("Current balance after deposit: " + currentBalance);
    }

    public void withdraw(int amount) {
        System.out.println("Current balance before withdrawal: " + currentBalance);
        currentBalance = currentBalance - amount;
        System.out.println("Withdrawal amount: " + amount);
        System.out.println("Current balance after withdrawal: " + currentBalance);
    }

    public int checkBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        greet();

        BankingApp app = new BankingApp();

        System.out.println("Initial balance: " + app.checkBalance());

        app.deposit(500);

        int balanceAfterDeposit = app.checkBalance();
        System.out.println("Balance after deposit: " + balanceAfterDeposit);

        app.withdraw(200);

        int balanceAfterWithdrawal = app.checkBalance();
        System.out.println("Balance after withdrawal: " + balanceAfterWithdrawal);

        System.out.println("Last current balance: " + balanceAfterWithdrawal);
    }
}
