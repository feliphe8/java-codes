package com.company;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName() +  "-> startEngine()";

    }

    public String accelarate(){
        return getClass().getSimpleName() +  "-> accelarate()";
    }

    public String brake(){
        return getClass().getSimpleName() +  "-> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  "-> startEngine()";

    }

    @Override
    public String accelarate() {
        return getClass().getSimpleName() +  "-> accelarate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  "-> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Mitsubishi mit = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mit.startEngine());
        System.out.println(mit.accelarate());
        System.out.println(mit.brake());
    }
}
