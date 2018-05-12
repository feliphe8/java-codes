package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Feliphe", 50.05);
        bank.addCustomer("Adelaide", "Irelia", 185.75);
        bank.addCustomer("Adelaide", "Vayne", 220.30);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Caitlyn", 150.87);

        bank.addCustomerTransaction("Adelaide", "Feliphe", 300.15);
        bank.addCustomerTransaction("Adelaide", "Feliphe", 45.56);
        bank.addCustomerTransaction("Adelaide", "Irelia", 45.56);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sidney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 55.50)){
            System.out.println("Error: Melbourne branch does not exists");
        }

        if (!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }
    }
}
