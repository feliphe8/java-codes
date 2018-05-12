package com.example.feliphe;

public class Main {

    public static void main(String[] args) {
        Account conta = new Account("Feliphe");
        conta.deposit(1000);
        conta.withdraw(500);
        conta.withdraw(-200);
        conta.deposit(-20);
        conta.calculateBalance();

        System.out.println(conta.getBalance());

    }
}
