package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburguer h = new Hamburguer("Basic", "Sausage", 3.56, "White");
        double price = h.itemizeHamburguer();
        h.addHamburguerAddition1("Tomato", 0.27);
        h.addHamburguerAddition2("Lettuce", 0.75);
        h.addHamburguerAddition3("Cheese", 1.13);
        System.out.println("Total burguer price is " + h.itemizeHamburguer());

        HealthyBurger hh = new HealthyBurger("Bacon", 5.67);
        hh.itemizeHamburguer();
        hh.addHamburguerAddition1("Egg", 5.43);
        hh.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total burger price is " + hh.itemizeHamburguer());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburguer();
        db.addHamburguerAddition1("Egg", 5.43);
    }
}
