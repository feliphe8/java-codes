package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot bird = new Parrot("Parrot");
        bird.breath();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}
