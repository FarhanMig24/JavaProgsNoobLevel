package com.company;

public class Continued_Labelled {
    public static void main(String[] args) {
        int i,j;
        outer:
        for (i = 0; i < 11; i++) {
            for (j = 0; j < 11; j++) {
                if(j>i)
                {
                    System.out.println();
                    continue outer;

                }
                System.out.print(" "+(i*j));


            }

        }
    }
}
