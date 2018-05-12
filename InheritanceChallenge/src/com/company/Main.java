package com.company;

public class Main {

    public static void main(String[] args) {
        Outlander car = new Outlander(36);
        car.steer(45);
        car.accelerate(30);
        car.accelerate(20);
        car.accelerate(-42);
    }
}
