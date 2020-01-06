package com.exercices.banking;

public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty constructor");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with all parameters");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber){
        this("0000", 0.0, customerName, customerEmailAddress, customerPhoneNumber);
        System.out.println("Account constructor with some parameters");
    }

    public void deposit(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " is processed. New balance = " + accountBalance);
    }

    public void withdrawal(double withdrawalAmount){
        if (accountBalance - withdrawalAmount < 0){
            System.out.println("Only a balance of " + accountBalance + " is available. Withdrawal not allowed!");
        }else{
            accountBalance -=  withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " is processed. Remaining balance = " + accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}

