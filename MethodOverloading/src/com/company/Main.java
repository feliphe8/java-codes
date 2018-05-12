package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Feliphe", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(200);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(7, 5);
        if (centimeters < 0.0)
            System.out.println("Invalid parameters");

        calcFeetAndInchesToCentimeters(156);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0 || inches < 0) || (inches > 12)){
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " remaining inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    }
