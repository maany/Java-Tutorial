package com.java.tutorial;

public abstract class Tutorial {
    public String name = null;
    public void run(){
        System.out.println(this.name);
        this.printSectionSeparator();
    }
    public void printSectionSeparator(){
        System.out.println("============================");
    }
    public void printSubSeparator(){
        System.out.println("----------------------------");
    }
}
