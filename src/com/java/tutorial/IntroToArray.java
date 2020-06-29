package com.java.tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntroToArray extends Tutorial{
    public IntroToArray(){
        this.name = "Introduction To Arrays";
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Integer Array");
        Integer[] arr1 = new Integer[3];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;

        this.printArray(arr1);
        this.printSubSeparator();

        System.out.println("Integer Array in place initialization");
        Integer[] arr2 = {1,2,3};
        this.printArray(arr2);
        this.printSubSeparator();

        System.out.println("String Array Example");
        String[] arr3 = {
                "Hello",
                "my",
                "people"
        };
        System.out.println("Printing as 2D array needs charAt()");
        System.out.println(arr3[1].charAt(1));
        this.printSubSeparator();
        this.printArray(arr3);

    }
    private <E> void printArray(E[] arr) {
        for (E el : arr) {
            System.out.println("   " + el);
        }
    }
}
