package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
	    int previousResult = result;
	    result = result - 1;
        System.out.println(previousResult + " - 1 = "+ result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = "+result);

        previousResult = result;
        result = result / 5;

        System.out.println(previousResult + " / 5 = "+ result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = "+result);

        previousResult = result;
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result -= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // Challenge

        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = (myFirstValue + secondTopScore) * 25;
        System.out.println("myTotal: "+myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder: "+ theRemainder);

        if (theRemainder <= 20)
            System.out.println("Total was over the limit");

    }
}
