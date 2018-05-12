package com.example.feliphe;

public class SIBTest {
    public static final String owner;

    static {
        owner = "feliphe";
        System.out.println("SIBTest initialization block called");
    }

    public SIBTest(){
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Second initialization block called");
    }

    public void someMethod(){
        System.out.println("SomeMethod() called");
    }
}
