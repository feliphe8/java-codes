package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;
        int myTotal = (minValue/2);
        System.out.println("Int value: " + myTotal);

        // byte has a width of 8
        byte myByteMaxValue = 127;
        byte myByteMinValue = -128;
        byte myNewByteValue = (byte) (myByteMaxValue/2);
        System.out.println("Byte value: " + myNewByteValue);

        // short has a width of 16
        short myShortMaxValue = 32767;
        short myNewShortValue = (short) (myShortMaxValue/2);

        // long has a width of 64
        long myLongValue = 100L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

        //Challenge

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal: " + longTotal);
        System.out.println("shortTotal: "+ shortTotal);
    }
}
