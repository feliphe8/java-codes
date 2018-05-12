package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone phone;
        phone = new Deskphone(123456);
        phone.powerOn();
        phone.callPhone(123456);
        phone.answer();

        phone = new MobilePhone(112345);
        phone.powerOn();
        phone.callPhone(112345);
        phone.answer();
    }
}
