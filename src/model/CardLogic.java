package model;

public class CardLogic {
    // Method to withdraw money from a Card object
    public static void withdraw(Card card, double amount) {
        if (amount > 0 && amount <= card.getBalance()) {
            double newBalance = card.getBalance() - amount;
            card.setBalance(newBalance);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to deposit money into a Card object
    public static void deposit(Card card, double amount) {
        if (amount > 0) {
            double newBalance = card.getBalance() + amount;
            card.setBalance(newBalance);
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to check the balance of a Card object
    public static double checkBalance(Card card) {
        return card.getBalance();
    }
}
