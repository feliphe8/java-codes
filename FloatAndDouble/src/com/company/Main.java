package com.company;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntvalue = 5 / 3;
        // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;

	    // width of double = 64 (8 bytes) + rápido e preciso
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: " + myIntvalue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: "+ myDoubleValue);

        // Challenge

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms: " + convertedKilograms);
    }
}
