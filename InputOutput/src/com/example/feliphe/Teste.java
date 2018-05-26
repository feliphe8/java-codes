package com.example.feliphe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numberLines = scanner.nextInt();
//        int a;
//        int b;
//        for (int i=0; i<numberLines;i++){
//            String input = scanner.nextLine();
//            String[] array = input.split(" ");
//            for (int j=0; j < array.length; j++){
//                int number = Integer.parseInt(array[i]);
//
//            }
//        }
//
//        System.out.println("Resultado: " + GreatestCommonDivisor(a, b));
    }

    public static int GreatestCommonDivisor(int a, int b){
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
