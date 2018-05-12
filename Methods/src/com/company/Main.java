package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true,20000, 9, 250);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Feliphe", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Feliphe", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Feliphe", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Feliphe", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                            highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100)
            return 3;

        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += bonus * 2;
            return finalScore;
        }

        return -1;
    }
}
