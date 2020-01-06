package com.exercices.banking;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account("0001", 0.00, "Sergi Vaqué", "sergivaque@gmail.com", "600010203");
        account1.withdrawal(100.0);
        account1.deposit(50.0);
        account1.withdrawal(100.0);
        account1.deposit(51.0);
        account1.withdrawal(100.0);
        Account account2 = new Account("Sergi Vaqué", "sergivaque@gmail.com", "600010203");
        System.out.println("Account number " + account2.getAccountNumber() + ", Name " + account2.getCustomerName());
    }
}
