package com.java.tutorial;

public class Loops extends Tutorial {
    public int i;

    public Loops() {
        this.i = 0;
        this.name = "Loop Examples";
    }

    @Override
    public void run() {
        super.run();
        System.out.println("While Loop Example");
        while (this.i < 10) {
            System.out.println("While Loop Iteration: " + this.i);
            this.i ++;
        }
        this.printSubSeparator();
        System.out.println("For Loop Example");
        for(;this.i<20; this.i++){
            System.out.println("For Loop Iteration: " + this.i);
        }
        this.printSubSeparator();
        System.out.println("Do While Loop Example");
        do{
            System.out.println("Do While Loop Iteration: " + this.i);
            this.i ++;
        }while(this.i<30);
    }
}
