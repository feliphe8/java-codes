package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox car = new Gearbox(6);
//        Gearbox.Gear first =  car.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
//        car.addGear(1, 5.3);
//        car.addGear(2, 10.6);
//        car.addGear(3, 15.9);
//        car.operateClutch(true);
//        car.changeGear(1);
//        car.operateClutch(false);
//        System.out.println(car.wheelSpeed(1000));
//        car.changeGear(2);
//        System.out.println(car.wheelSpeed(3000));
//        car.operateClutch(true);
//        car.changeGear(3);
//        car.operateClutch(false);
//        System.out.println(car.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();



    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
