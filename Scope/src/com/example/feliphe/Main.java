package com.example.feliphe;

public class Main {

    public static void main(String[] args) {
        String varFour = "This is private to main()";
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree);
//        System.out.println("scopeCheck varOne is " + scopeCheck.getVarOne());
//        System.out.println(varFour);
//
//        scopeCheck.timesTwo();
//
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}
