package model;

public class Card {
    private int cardNumber;
    private String accountName;
    private double balance;

    // Default no-arg constructor
    public Card() {
    }

    // Regular constructor
    public Card(int cardNumber, String accountName, double balance) {
        this.cardNumber = cardNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getter for cardNumber
    public int getCardNumber() {
        return cardNumber;
    }

    // Setter for cardNumber
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }

    // Setter for accountName
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card Number: " + cardNumber + "\nAccount Name: " + accountName + "\nBalance: $" + balance;
    }
}