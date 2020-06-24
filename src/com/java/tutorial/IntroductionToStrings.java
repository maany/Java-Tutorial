package com.java.tutorial;

public class IntroductionToStrings extends Tutorial{
    private final String text;

    public IntroductionToStrings(){
        this.text = "Hello";
        super.name = "Introduction To Strings";
    }

    @Override
    public void run() {
        super.run();
        double myDouble = 23.6;
        System.out.println("1. String Concatenation");
        System.out.println(this.text + " " + "Bob");
        System.out.println("Printing a Double " + myDouble + ".");
        this.printSubSeparator();

        System.out.println("2. System.out.printf formatted strings");

    }
}
