package com.example.feliphe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.println("This is line 3");
        }).start();

        Employee john = new Employee("John", 30);
        Employee tim = new Employee("Tim", 21);
        Employee irelia = new Employee("Irelia", 22);
        Employee vayne = new Employee("Vayne", 23);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(irelia);
        employees.add(vayne);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(employees, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee : employees){
            System.out.println(employee.getName());
        }

        String sillyString = doStringStuff((s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
            }, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass ac = new AnotherClass();
        System.out.println(ac.doSomething());

        employees.forEach(employee -> {
            System.out.println(employee.getName() + ": " + employee.getAge() );
        });

//        for (Employee employee: employees){
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }

//        for (int i=0; i< employees.size(); i++){
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//
//        }

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperConcat(s1, s2);
    }
}

class Employee {
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
