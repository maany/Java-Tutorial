package com.java.tutorial;

public class IntroductionToStrings extends Tutorial{
    private final String text;

    public IntroductionToStrings(){
        this.text = "Hello";
        super.name = "Introduction To Strings";
    }

    @Override
    public void run() {
        System.out.println(this.text);
    }
}
