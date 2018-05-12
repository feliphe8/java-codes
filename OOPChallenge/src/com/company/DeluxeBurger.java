package com.company;

public class DeluxeBurger extends Hamburguer {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburguerAddition1("Chips", 2.75);
        super.addHamburguerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburguerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burguer");
    }

    @Override
    public void addHamburguerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burguer");
    }

    @Override
    public void addHamburguerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burguer");
    }

    @Override
    public void addHamburguerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burguer");    }
}
