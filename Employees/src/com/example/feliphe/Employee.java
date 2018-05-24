package com.example.feliphe;



public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething(){
        int i = 0;
        System.out.println("The AnotherClass is " + getClass().getSimpleName());
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression class is " + getClass().getSimpleName());
            System.out.println(i);
            String result = s1.toUpperCase() + " " + s2.toUpperCase();
            return result;
        };

        return Main.doStringStuff(uc, "String1", "String2");
    }

    public void printValue(){
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}
