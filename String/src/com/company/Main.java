package com.company;

public class Main {

    public static void main(String[] args) {
	// Primitive data types: byte, short, int, long, float, double, char, boolean

        String myString = "This is a string";
        System.out.println("myString is equal to "+ myString);
        myString = myString + ", and this is more ";
        System.out.println("myString is equal to "+ myString);
        myString = myString + "\u00A9 2018";
        System.out.println(myString);

        String numString = "250.55";
        numString = numString + "49.45";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to "+ lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to "+ lastString);
    }
}
