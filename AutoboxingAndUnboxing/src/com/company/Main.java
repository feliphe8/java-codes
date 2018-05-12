package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        //ArrayList<int> intArray = new ArrayList<int>();
        //ArrayList<IntClass> intArray = new ArrayList<IntClass>();
        //intArray.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());;
        }

        Integer myIntValue = 56; // Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            doubleArrayList.add(dbl);
        }

        for (int i = 0; i < doubleArrayList.size(); i++){
            double value = doubleArrayList.get(i);
            System.out.println(i + " -> " + value);
        }


    }
}
