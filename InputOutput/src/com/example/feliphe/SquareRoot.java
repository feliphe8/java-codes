package com.example.feliphe;

public class SquareRoot {
    public static void main(String[] args) {
        for (int i=10; i<=20; i++){
            System.out.printf(i+": %.3f %n", squareRoot(i));
        }

    }

    public static double squareRoot(int number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }
}