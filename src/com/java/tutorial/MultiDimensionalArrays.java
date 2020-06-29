package com.java.tutorial;

import javax.naming.PartialResultException;

public class MultiDimensionalArrays extends Tutorial{
    public MultiDimensionalArrays(){
        this.name = "Multi Dimensional Array Tutorial";
    }

    @Override
    public void run(){
        super.run();
        int[][] arr = new int[3][];
        for(int i=1;i<=3;i++) {
            arr[i-1] = new int[i];
            for(int j = 1; j <=i ; j++) {
               arr[i-1][j-1] = i+j;
            }
        }
        for(int[] a: arr){
            for(int el: a){
                System.out.print(el + "  ");
            }
            System.out.println();
        }
    }
}
