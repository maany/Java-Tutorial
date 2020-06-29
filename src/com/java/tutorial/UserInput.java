package com.java.tutorial;

import java.util.Scanner;

public class UserInput extends Tutorial{
    public UserInput() {
        this.name = "User Input with Scanner";
    }

    @Override
    public void run() {
        super.run();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        this.printSubSeparator();
        System.out.println("Scan with Do While");
        System.out.println("Enter / to end");
        String in = "";
        do {
            in = in + sc.nextLine();
        } while(!in.contains("/"));
        System.out.println(in);
    }
}
